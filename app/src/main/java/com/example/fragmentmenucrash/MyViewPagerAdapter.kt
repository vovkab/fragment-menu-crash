package com.example.fragmentmenucrash

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PlaceholderFragment1()
            1 -> PlaceholderFragment2()
            else -> error("Wrong position=$position")
        }
    }

    override fun getCount(): Int = 2
}
