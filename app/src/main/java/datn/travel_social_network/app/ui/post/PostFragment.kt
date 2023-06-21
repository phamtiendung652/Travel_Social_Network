package datn.travel_social_network.app.ui.post

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import datn.travel_social_network.databinding.FragmentPostBinding


class PostFragment : Fragment() {

    private  var _binding : FragmentPostBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentPostBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
//        binding.let {
//            it.btnNotification.setOnClickListener {
//                findNavController().navigate(R.id.action_postFragment_to_notification_Fragment)
//            }
//            it.btnMess.setOnClickListener {
////                findNavController().navigate()
//            }
//
//        }
    }
}