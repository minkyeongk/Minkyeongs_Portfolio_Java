package com.example.minkyeongsportfolio.api;

import com.example.minkyeongsportfolio.model.GithubUserInfo;
import com.example.minkyeongsportfolio.model.Repo;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GithubService {
    @GET("/users/{username}/repos")
    @NotNull
    Call<List<Repo>> getRepositories(@Path("username") @NotNull String var1);

    @GET("/users/{username}")
    @NotNull
    Call<GithubUserInfo> getUserInfo(@Path("username") @NotNull String var1);
}
