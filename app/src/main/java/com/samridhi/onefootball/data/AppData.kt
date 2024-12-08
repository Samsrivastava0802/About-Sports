package com.samridhi.onefootball.data

data class AppData(
    val data: AllInfo
)

data class AllInfo(
    val header: Header? = null,
    val matchInfo: List<MatchInfo>? = null,
    val playerInfo: PlayerInfo? = null
)

data class Header(
    val title: String,
    val description: String
)

data class MatchInfo(
    val title: String,
    val image: String
)

data class PlayerInfo(
    val title: String,
    val info: List<Info>? = null
)

data class Info(
    val name: String,
    val image: String
)