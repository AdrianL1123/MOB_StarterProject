package com.adrianl.mob_starterproject.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrianl.mob_starterproject.R

abstract class BaseFragment : Fragment() {
    protected abstract val viewModel: BaseViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

    protected open fun onFragmentResult() {

    }

    protected open fun setupViewModelObserver() {

    }

    protected open fun setupUiComponents(view: View) {

    }
}