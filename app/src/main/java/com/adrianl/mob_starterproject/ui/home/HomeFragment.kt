package com.adrianl.mob_starterproject.ui.home

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrianl.mob_starterproject.R
import com.adrianl.mob_starterproject.ui.base.BaseFragment
import com.adrianl.mob_starterproject.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {
    private lateinit var binding: FragmentHomeBinding
    override val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun setupUiComponents(view: View) {
        super.setupUiComponents(view)
        /**
         * SetupAdapter Here
         */
    }

    override fun setupViewModelObserver() {
        super.setupViewModelObserver()
        /**
         * lifecycleScope.launch here
         * viewmodel. smth here
         */
    }

    /**
     * Adapter function here
     */

}