package datn.travel_social_network.app.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import datn.travel_social_network.R

class EditProfileFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val toolbar = view?.findViewById<Toolbar>(R.id.my_toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        // Set the title of the toolbar
        toolbar?.title = "My Toolbar"

        // Enable the back button
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return inflater.inflate(R.layout.fragment_edit_profile, container, false)
    }

}