package datn.travel_social_network.app.ui.forgot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import datn.travel_social_network.R
import datn.travel_social_network.databinding.FragmentForgotBinding


class ForgotFragment : Fragment() {

    private var _binding : FragmentForgotBinding? =  null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentForgotBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val activty : AppCompatActivity = activity as AppCompatActivity
//        activty.title = "Quên Mật Khẩu"
        onClick()
    }

    private fun onClick() {
        binding.let {
            it.btnSendMail.setOnClickListener {
                handleEmail()
            }
            it.btnAssert.setOnClickListener {
                handleAssert()
                findNavController().navigate(R.id.action_forgotFragment_to_loginFragment2)
            }
        }
    }

    private fun handleAssert() {
        val isNull = binding.let {
            it.edtMaOne.text.isNullOrBlank() || it.edtMaTwo.text.isNullOrBlank() || it.edtMaThree.text.isNullOrBlank()
                    || it.edtMaFour.text.isNullOrBlank() || it.edtMaFive.text.isNullOrBlank()
        }
        if(isNull){
            Toast.makeText(context,"Mã Xác Nhận Không Chính Xác",Toast.LENGTH_SHORT).show()
        }
    }

    private fun handleEmail() {
        if(binding.edtEmailForgot.text.isNullOrBlank()){
            Toast.makeText(context,"Vui Lòng Nhập Email",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}