package datn.travel_social_network.app.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import datn.travel_social_network.app.data.RetrofitInstance
import datn.travel_social_network.app.data.model.JsonAccount
import kotlinx.coroutines.launch

class LoginFragmentViewModel : ViewModel() {
    private var _accountList : MutableLiveData<List<JsonAccount>> = MutableLiveData()
    val accountList : LiveData<List<JsonAccount>> = _accountList


    fun makeApiCall(){
        viewModelScope.launch {
            try {
                val apiService = RetrofitInstance.service
                _accountList.postValue(apiService.getAccounts())

//                val call : Call<List<AccountModelItem>> = apiService.getAccounts()
//                call.enqueue(object : Callback<List<AccountModelItem>>{
//                    override fun onResponse(
//                        call: Call<List<AccountModelItem>>,
//                        response: Response<List<AccountModelItem>>
//                    ) {
//                        _accountList.postValue(response.body())
//                    }
//
//                    override fun onFailure(call: Call<List<AccountModelItem>>, t: Throwable) {
//                        _accountList.postValue(null)
//                    }
//
//                })
            }catch (ex: Exception){
                ex.printStackTrace()
            }
        }
    }
}
