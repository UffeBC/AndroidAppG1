package com.example.androidapp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidapp1.databinding.FragmentAccountBinding
import com.example.androidapp1.databinding.FragmentFirstBinding
import com.example.androidapp1.databinding.FragmentHistoryBinding
import com.example.androidapp1.databinding.FragmentSecondBinding
import com.example.androidapp1.databinding.FragmentNotificationsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [AccountFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NotificationsFragment : Fragment() {
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.notificationBackground1.setOnClickListener {
            findNavController().navigate(R.id.action_notificationsFragment_to_settingsFragment)
        }

        //PUPPYATTACK
//        binding.StockBackground1.setOnClickListener {
//            findNavController().navigate(R.id.action_)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}