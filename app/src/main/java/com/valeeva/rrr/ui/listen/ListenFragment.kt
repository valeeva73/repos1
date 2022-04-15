package com.valeeva.rrr.ui.listen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.valeeva.rrr.R
import com.valeeva.rrr.recadapters.ListenRecycler
import com.valeeva.rrr.recadapters.MyListen

class ListenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_listen, container, false)

        val listen_recycler: RecyclerView = root.findViewById(R.id.listen_Rec)
        listen_recycler.adapter = ListenRecycler(requireContext(), MyListen().listen_list)

        return root
    }

}