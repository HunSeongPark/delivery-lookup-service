package com.hunseong.delivery.ui.my

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hunseong.delivery.databinding.FragmentHomeBinding
import com.hunseong.delivery.databinding.FragmentMyBinding

class MyFragment : Fragment() {
    private lateinit var binding: FragmentMyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyBinding.inflate(inflater, container, false)
        return binding.root
    }
}