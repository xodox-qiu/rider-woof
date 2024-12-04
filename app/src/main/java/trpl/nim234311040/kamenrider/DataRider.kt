package trpl.nim234311040.kamenrider


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class DataRider(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val rider = listOf(
    DataRider(R.drawable.rdr1, R.string.rider_name_1, 4, R.string.descript_1),
    DataRider(R.drawable.rdr2, R.string.rider_name_2, 8, R.string.descript_2),
    DataRider(R.drawable.rdr3, R.string.rider_name_3, 2, R.string.descript_3),
    DataRider(R.drawable.rdr4, R.string.rider_name_4, 2, R.string.descript_4),
    )