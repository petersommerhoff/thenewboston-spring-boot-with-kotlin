package tv.codealong.tutorials.springboot.thenewboston.datasource.network.dto

import tv.codealong.tutorials.springboot.thenewboston.model.Bank

data class BankList(
    val results: Collection<Bank>
)
