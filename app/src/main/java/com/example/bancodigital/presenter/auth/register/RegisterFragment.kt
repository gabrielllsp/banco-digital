package com.example.bancodigital.presenter.auth.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.bancodigital.data.model.User
import com.example.bancodigital.databinding.FragmentRegisterBinding
import com.example.bancodigital.util.initToolbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    private val registerViewModel: RegisterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolbar)
        initListeners()
    }

    private fun initListeners() {
        binding.btnRegister.setOnClickListener { validate() }
    }

    private fun validate() {
        val name = binding.edtName.text.toString().trim()
        val email = binding.edtEmailRegister.text.toString().trim()
        val phone = binding.edtTelephone.text.toString().trim()
        val password = binding.edtPasswordRegister.text.toString().trim()


        if (name.isNotEmpty()) {
            if (email.isNotEmpty()) {
                if (phone.isNotEmpty()) {
                    if (password.isNotEmpty()) {

                        val user = User(name, email, phone, password)
                        registerUser(user)


                        Toast.makeText(requireContext(), "Usuario registrado com sucesso", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(requireContext(), "Digite sua senha", Toast.LENGTH_LONG)
                            .show()
                    }
                } else {
                    Toast.makeText(requireContext(), "Digite seu telefone", Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                Toast.makeText(requireContext(), "Digite seu email", Toast.LENGTH_LONG).show()
            }

        } else {
            Toast.makeText(requireContext(), "Digite seu nome", Toast.LENGTH_LONG).show()
        }
    }

    private fun registerUser(user: User){

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}