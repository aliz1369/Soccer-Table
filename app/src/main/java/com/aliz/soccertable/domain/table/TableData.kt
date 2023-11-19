package com.aliz.soccertable.domain.table

data class TableData(
    val ranking: Int,
    val teamName: String,
    val teamLogo: String,
    val mp: Int,
    val w: Int,
    val d: Int,
    val l: Int,
    val gf: Int,
    val ga: Int,
    val gd: Int,
    val pts: Int
)
