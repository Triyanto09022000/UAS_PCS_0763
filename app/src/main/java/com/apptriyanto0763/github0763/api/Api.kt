package com.apptriyanto0763.github0763.api

import com.apptriyanto0763.github0763.data.model.DetailUserResponse
import com.apptriyanto0763.github0763.data.model.User
import com.apptriyanto0763.github0763.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token b78f5054375d2c07b15eac00c6284a122c4c7138")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token b78f5054375d2c07b15eac00c6284a122c4c7138")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token b78f5054375d2c07b15eac00c6284a122c4c7138")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token b78f5054375d2c07b15eac00c6284a122c4c7138")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}