package com.yakobus.uts_yakobus_182101987.service;

import com.yakobus.uts_yakobus_182101987.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
