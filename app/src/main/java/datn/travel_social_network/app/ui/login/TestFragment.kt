package datn.travel_social_network.app.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import datn.travel_social_network.R
import datn.travel_social_network.app.data.RetrofitInstance
import datn.travel_social_network.databinding.FragmentLoginBinding
import datn.travel_social_network.databinding.FragmentTestBinding



class TestFragment : Fragment() {



    private var _binding: FragmentTestBinding? = null
    private val binding get() = _binding!!
    private var viewModel: LoginFragmentViewModel = LoginFragmentViewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTestBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.accountList.observe(viewLifecycleOwner){
            binding.Tessst.text = it[0].fullName
        }
        viewModel.makeApiCall()
    }

}