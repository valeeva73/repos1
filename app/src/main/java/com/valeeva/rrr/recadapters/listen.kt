package com.valeeva.rrr.recadapters

import com.valeeva.rrr.R

data class listen(val image:Int, val name_feel: String)
class MyListen{
    val listen_list= arrayListOf(listen(R.drawable.music_img,"Музыка для медитации Спокойная"),
        listen(R.drawable.music_img,"Музыка для медитации Рассслабляющая"),
        listen(R.drawable.music_img,"Музыка для медитации Сосредоточенная"),
        listen(R.drawable.music_img,"Музыка для медитации Взволнованная")
    )
}

