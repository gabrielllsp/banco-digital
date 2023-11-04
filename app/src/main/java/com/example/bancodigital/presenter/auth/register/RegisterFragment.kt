package com.example.bancodigital.presenter.auth.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bancodigital.databinding.FragmentRegisterBinding
import com.example.bancodigital.util.initToolbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

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
        val telephone = binding.edtTelephone.text.toString().trim()
        val password = binding.edtPasswordRegister.text.toString().trim()


        if (name.isNotEmpty()) {
            if (email.isNotEmpty()) {
                if (telephone.isNotEmpty()) {
                    if (password.isNotEmpty()) {
                        Toast.makeText(requireContext(), "Registrando", Toast.LENGTH_LONG).show()
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}