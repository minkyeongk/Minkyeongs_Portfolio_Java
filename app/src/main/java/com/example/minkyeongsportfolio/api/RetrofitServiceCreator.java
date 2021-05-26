package com.example.minkyeongsportfolio.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.Converter.Factory;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(
        mv = {1, 4, 2},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"},
        d2 = {"Lorg/sopt/soptseminar_week1/api/RetrofitServiceCreator;", "", "()V", "GITHUB_BASE_URL", "", "githubService", "Lorg/sopt/soptseminar_week1/api/GithubService;", "getGithubService", "()Lorg/sopt/soptseminar_week1/api/GithubService;", "retrofit_github", "Lretrofit2/Retrofit;", "Minkyeong's_Portfolio.app"}
)
public final class RetrofitServiceCreator {
    private static final String GITHUB_BASE_URL = "https://api.github.com";
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
        RetrofitServiceCreator var0 = new RetrofitServiceCreator();
        INSTANCE = var0;
        Retrofit var10000 = (new Builder()).baseUrl("https://api.github.com").addConverterFactory((Factory)GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(var10000, "Retrofit.Builder()\n     …e()\n            ).build()");
        retrofit_github = var10000;
        Object var1 = retrofit_github.create(GithubService.class);
        Intrinsics.checkNotNullExpressionValue(var1, "retrofit_github.create(GithubService::class.java)");
        githubService = (GithubService)var1;
    }
}
