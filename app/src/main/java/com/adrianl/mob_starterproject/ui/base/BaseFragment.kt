package com.adrianl.mob_starterproject.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View

abstract class BaseFragment : Fragment() {
    protected abstract val viewModel: BaseViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onFragmentResult()
        setupUiComponents(view)
        setupViewModelObserver()
    }


    protected open fun onFragmentResult() {

    }

    protected open fun setupViewModelObserver() {

    }

    protected open fun setupUiComponents(view: View) {

    }
}