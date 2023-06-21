package datn.travel_social_network.app.data

import datn.travel_social_network.app.data.service.AccountService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
//    private val moshi = Moshi.Builder()
//        .add(KotlinJsonAdapterFactory())
//        .build()
    private val api = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:5269")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        val service: AccountService = api.create(AccountService::class.java)
}