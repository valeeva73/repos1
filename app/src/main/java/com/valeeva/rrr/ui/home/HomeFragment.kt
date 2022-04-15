package com.valeeva.rrr.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.valeeva.rrr.R
import com.valeeva.rrr.recadapters.FeelRecycler
import com.valeeva.rrr.recadapters.MyFeel
import com.valeeva.rrr.recadapters.MyState
import com.valeeva.rrr.recadapters.StateRecycler

class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val feel_recycler: RecyclerView= root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(), MyFeel().list)

        val state_recycler: RecyclerView= root.findViewById(R.id.state_Rec)
        state_recycler.adapter = StateRecycler(requireContext(), MyState().state_list)

        return root


    }

}
