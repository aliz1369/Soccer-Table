package com.aliz.soccertable.domain.scheduled

import java.time.LocalDateTime

data class ScheduledData(
    val homeTeamName: String,
    val homeTeamLogo: String,
    val awayTeamName: String,
    val awayTeamLogo: String,
    val matchDate: LocalDateTime
)
