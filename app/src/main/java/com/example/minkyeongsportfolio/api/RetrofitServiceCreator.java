package com.example.minkyeongsportfolio.api;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;


public final class RetrofitServiceCreator {
    private static final Retrofit retrofit_github;
    @NotNull
    private static final GithubService githubService;
    @NotNull
    public static final RetrofitServiceCreator INSTANCE;

    @NotNull
    public final GithubService getGithubService() {
        return githubService;
    }

    private RetrofitServiceCreator() {
    }

    static {
        INSTANCE = new RetrofitServiceCreator();
        Retrofit var10000 = (new Builder()).baseUrl("https://api.github.com").addConverterFactory((Factory)GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(var10000, "Retrofit.Builder()\n     …e()\n            ).build()");
        retrofit_github = var10000;

        GithubService var1 = retrofit_github.create(GithubService.class);
        Intrinsics.checkNotNullExpressionValue(var1, "retrofit_github.create(GithubService::class.java)");
        githubService = var1;
    }
}
