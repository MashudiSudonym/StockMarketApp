package com.plcoding.stockmarketapp.presentation.company_listings

sealed class CompanyListingsEvent {
    object Refersh: CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String): CompanyListingsEvent()
}
