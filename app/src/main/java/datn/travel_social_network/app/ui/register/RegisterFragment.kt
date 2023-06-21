package datn.travel_social_network.app.ui.register

import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import datn.travel_social_network.R
import datn.travel_social_network.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private var _binding : FragmentRegisterBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val activty : AppCompatActivity = activity as AppCompatActivity
//        activty.title = "Đăng Ký"
        focusListener()
        onClick()
    }

    private fun focusListener() {
        binding.let {
            it.edtEmail.setOnFocusChangeListener { _, focus ->
                if(!focus){
                    it.tipEmail.helperText = vailAccount()
                }
            }
            it.edtEmail.setOnFocusChangeListener { _, focus ->
                if(!focus){
                    it.tipEmail.helperText = vailEmail()
                }
            }
            it.edtPassword.setOnFocusChangeListener{_,focus->
                if(!focus){
                    it.tipPassword.helperText = vailPass()
                }
            }
            it.edtPasswordCheck.setOnFocusChangeListener{_,focus->
                if(!focus){
                    it.tipPasswordCheck.helperText = vailPassCheck()
                }
            }

        }
    }

    private fun vailAccount(): String? {
        val name = "travel"
        val pass = binding.edtAccount.text.toString()
        if (pass == name){
            return "Tên Tài Khoản Đã Tồn Tại"
        }
        return null
    }

    private fun vailPassCheck(): String? {
        val pass = binding.edtPasswordCheck.text.toString()
        if (pass.length < 8){
            return "Mật Khẩu Tối Thiểu 8 Kí Tự"
        }
        return null
    }

    private fun vailPass(): String? {
        val pass = binding.edtPassword.text.toString()
        if (pass.length < 8){
            return "Mật Khẩu Tối Thiểu 8 Kí Tự"
        }
        return null
    }

    private fun vailEmail(): String? {
        val email = binding.edtEmail.text.toString()
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return "Email Không Hợp Lệ"
        }
        return null
    }

    private fun onClick(){
        binding.btnRegister.setOnClickListener {
            handle()
        }
    }

    private fun handle(){
        val nameAcc = "travel"
        binding.let {
            val isNull = (it.edtAccount.text.isNullOrBlank() || it.edtPassword.text.isNullOrBlank() || it.edtPasswordCheck.text.isNullOrBlank()
                    || it.edtEmail.text.isNullOrBlank() || it.edtEmail.text.isNullOrBlank())
            if(isNull){
                Toast.makeText(context,"Vui Lòng Không Để Trống Thông Tin",Toast.LENGTH_SHORT).show()
            }else if(it.edtPasswordCheck.text.toString() != it.edtPassword.text.toString() || it.edtPassword.text.toString().length < 8){
                Toast.makeText(context,"Mật Khẩu Không Chính Xác",Toast.LENGTH_SHORT).show()
            }else if(!it.checkBox.isChecked){
                Toast.makeText(context,"Chính Sách và Điều Khoản Chưa được chấp nhận",Toast.LENGTH_SHORT).show()
            }else if(it.edtAccount.text.toString() == nameAcc){
                Toast.makeText(context,"Tên Tài Khoản Đã Tồn Tại",Toast.LENGTH_SHORT).show()
            }else if(!Patterns.EMAIL_ADDRESS.matcher(it.edtEmail.text.toString()).matches()){
                Toast.makeText(context,"Email Không Hợp Lệ",Toast.LENGTH_SHORT).show()
            }else{
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment2)
                Toast.makeText(context,"Đăng Ký thành công",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}