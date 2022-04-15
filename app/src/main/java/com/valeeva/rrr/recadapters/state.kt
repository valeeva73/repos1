package com.valeeva.rrr.recadapters

import com.valeeva.rrr.R

data class state (val title: String, val text_state: String, val image_state: Int)
class MyState{
    val state_list= arrayListOf(state(" Обрестите гармонию в жизнь ", "Преимущества медитации", R.drawable.state_img))

}