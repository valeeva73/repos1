package com.valeeva.rrr.recadapters
import com.valeeva.rrr.R

data class feel(val image:Int, val name_feel: String)
class MyFeel{
    val list= arrayListOf(feel(R.drawable.calm_img,"Спокойным"),
        feel(R.drawable.relax_img,"Рассслабленным"),
        feel(R.drawable.focus_img,"Сосредоточенным"),
        feel(R.drawable.anxious_img,"Взволнованным")
    )
}

