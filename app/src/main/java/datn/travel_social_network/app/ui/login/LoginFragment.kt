package datn.travel_social_network.app.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import datn.travel_social_network.R
import datn.travel_social_network.app.ui.home.HomeActivity
import datn.travel_social_network.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private var viewModel: LoginFragmentViewModel = LoginFragmentViewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val acti: AppCompatActivity = activity as AppCompatActivity
        acti.supportActionBar?.hide()
        onClick()
    }

    private fun onClick(){
        binding.let {
            it.btnLogin.setOnClickListener { _ ->
                obServe()
            }
            it.btnRegister.setOnClickListener { _ ->
                findNavController().navigate(R.id.action_loginFragment2_to_registerFragment)
            }
            it.btnForgot.setOnClickListener { _ ->
                findNavController().navigate(R.id.action_loginFragment2_to_forgotFragment)
            }
        }
    }

    private fun handle() {


//       if(binding.edtAccount.toString().isBlank() || binding.edtPassword.toString().isBlank()){
//           Toast.makeText(context,"Tài khoản và Mật khẩu Không Chính Xác",Toast.LENGTH_SHORT).show()
//       }else if(binding.edtAccount.text.toString() == acc && binding.edtPassword.text.toString() == pass){
//           Toast.makeText(context,"Đăng Nhập Thành Công",Toast.LENGTH_SHORT).show()
//       }else{
//           Toast.makeText(context,"Tài khoản và Mật khẩu Không Chính Xác",Toast.LENGTH_SHORT).show()
//       }
    }

    private fun obServe() {
        val acc = binding.edtAccount.text.toString()
        val pass = binding.edtPassword.text.toString()
        if(binding.edtAccount.toString().isBlank() || binding.edtPassword.toString().isBlank()){
            Toast.makeText(context,"Tài khoản và Mật khẩu Không Chính Xác",Toast.LENGTH_SHORT).show()
        }else{
            viewModel?.accountList?.observe(viewLifecycleOwner){
                for (i in it.indices){
                    if(it[i].username == acc && it[i].password == pass){
                        Toast.makeText(context,"Đăng Nhập Thành Công",Toast.LENGTH_SHORT).show()
                        val intent: Intent = Intent(context, HomeActivity::class.java)
                        startActivity(intent)

                        break
                    }else{
                        Toast.makeText(context,"Tài khoản và Mật khẩu Không Chính Xác",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        viewModel?.makeApiCall()
//        Toast.makeText(context,"TKKKKKK",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}