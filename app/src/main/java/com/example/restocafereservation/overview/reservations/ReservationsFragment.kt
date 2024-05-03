package com.example.restocafereservation.overview.reservations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.restocafereservation.databinding.FragmentReservationsBinding

class ReservationsFragment : Fragment() {

    private lateinit var binding: FragmentReservationsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentReservationsBinding.inflate(inflater)

        return binding.root
    }

}