package com.example.restocafereservation.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.restocafereservation.R
import com.example.restocafereservation.databinding.FragmentOverviewBinding
import com.example.restocafereservation.overview.favorites.FavoritesFragment
import com.example.restocafereservation.overview.home.HomeFragment
import com.example.restocafereservation.overview.profile.ProfileFragment
import com.example.restocafereservation.overview.reservations.ReservationsFragment
import com.example.restocafereservation.overview.search.SearchFragment

class OverviewFragment : Fragment() {

    private lateinit var binding: FragmentOverviewBinding

    private fun setCurrentFragment(fragment:Fragment)=
        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentOverviewBinding.inflate(inflater)

        setCurrentFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home-> { setCurrentFragment(HomeFragment()) }
                R.id.search-> { setCurrentFragment(SearchFragment()) }
                R.id.favorites-> { setCurrentFragment(FavoritesFragment()) }
                R.id.reservations-> { setCurrentFragment(ReservationsFragment()) }
                R.id.profile-> { setCurrentFragment(ProfileFragment()) }
            }
            true
        }

        return binding.root

    }


}