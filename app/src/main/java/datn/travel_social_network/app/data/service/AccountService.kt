package datn.travel_social_network.app.data.service

import datn.travel_social_network.app.data.model.JsonAccount
import retrofit2.http.GET

interface AccountService {
    @GET("/api/accounts")
    suspend fun getAccounts(): List<JsonAccount>
}