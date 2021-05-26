package com.example.minkyeongsportfolio.api;

import com.example.minkyeongsportfolio.model.GithubUserInfo;
import com.example.minkyeongsportfolio.model.Repo;
import com.google.gson.JsonArray;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(
        mv = {1, 4, 2},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\n"},
        d2 = {"Lorg/sopt/soptseminar_week1/api/GithubService;", "", "getRepositories", "Lretrofit2/Call;", "", "Lcom/example/minkyeongsportfolio/model/Repo;", "username", "", "getUserInfo", "Lcom/example/minkyeongsportfolio/model/GithubUserInfo;", "Minkyeong's_Portfolio.app"}
)
public interface GithubService {
    @GET("/users/{username}/repos")
    @NotNull
    Call<List<Repo>> getRepositories(@Path("username") @NotNull String var1);

    @GET("/users/{username}")
    @NotNull
    Call<GithubUserInfo> getUserInfo(@Path("username") @NotNull String var1);
}
