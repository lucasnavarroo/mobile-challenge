package com.lucasnav.desafiobtg.modules.currencyConverter.networking

import com.lucasnav.desafiobtg.core.network.BaseNetwork.Companion.BASE_URL
import com.lucasnav.desafiobtg.modules.currencyConverter.model.CurrencyResponse
import io.reactivex.Observable
import retrofit2.http.GET

const val ACCESS_KEY = "97457bc67cb1b9397254592734f8f1e0"

interface CurrencyApi {

    @GET("${BASE_URL}list?access_key=$ACCESS_KEY")
    fun getCurrenciesFromApi(): Observable<CurrencyResponse>
}
