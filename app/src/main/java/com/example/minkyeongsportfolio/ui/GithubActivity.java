package com.example.minkyeongsportfolio.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.example.minkyeongsportfolio.R;
import com.example.minkyeongsportfolio.R.id;
import com.example.minkyeongsportfolio.api.RetrofitServiceCreator;
import com.example.minkyeongsportfolio.model.GithubUserInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public final class GithubActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_github);
        this.handleGetRequest();

        (new Handler(Looper.getMainLooper())).postDelayed((Runnable)(new Runnable() {
            public final void run() {
                ConstraintLayout var10000 = (ConstraintLayout)GithubActivity.this._$_findCachedViewById(id.loading);
                Intrinsics.checkNotNullExpressionValue(var10000, "loading");
                var10000.setVisibility(View.GONE);
            }
        }), 2000L);
    }

    private void handleGetRequest() {
        // Get Github Repositories
        Call call = RetrofitServiceCreator.INSTANCE.getGithubService().getRepositories("minkyeongk");
        call.enqueue((Callback)(new Callback() {
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.body() != null) {
                    Object var3 = response.body();
                    System.out.println(var3);
                    GithubActivity var10000 = GithubActivity.this;
                    Object var10001 = response.body();
                    Intrinsics.checkNotNull(var10001);
                    Intrinsics.checkNotNullExpressionValue(var10001, "response.body()!!");
                    var10000.initRecyclerview((List)var10001);
                }

            }

            public void onFailure(@NotNull Call call, @NotNull Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                Log.d("Repos Fail", t.toString());
            }
        }));

        // get Gihub user Information
        Call call2 = RetrofitServiceCreator.INSTANCE.getGithubService().getUserInfo("minkyeongk");
        call2.enqueue((Callback)(new Callback() {
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.body() != null) {
                    TextView var10000 = (TextView)GithubActivity.this._$_findCachedViewById(id.text_home_profile_github_id);
                    Intrinsics.checkNotNullExpressionValue(var10000, "text_home_profile_github_id");
                    Object result = response.body();
                    String ment;
                    if (result == null) {
                        ment = "Required value was null.";
                        try {
                            throw (Throwable)(new IllegalArgumentException(ment.toString()));
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }

                    var10000.setText((CharSequence)((GithubUserInfo)result).getLogin());
                    var10000 = (TextView)GithubActivity.this._$_findCachedViewById(id.text_home_profile_github_comment);
                    Intrinsics.checkNotNullExpressionValue(var10000, "text_home_profile_github_comment");
                    result = response.body();
                    if (result == null) {
                        ment = "Required value was null.";
                        try {
                            throw (Throwable)(new IllegalArgumentException(ment.toString()));
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }

                    var10000.setText((CharSequence)((GithubUserInfo)result).getBio());
                    ImageView var9 = (ImageView)GithubActivity.this._$_findCachedViewById(id.img_home_profile);
                    Intrinsics.checkNotNullExpressionValue(var9, "img_home_profile");
                    RequestManager var10 = Glide.with(var9.getContext());
                    Object var10001 = response.body();
                    Intrinsics.checkNotNull(var10001);
                    var10.load(((GithubUserInfo)var10001).getAvatar_url()).into((ImageView)GithubActivity.this._$_findCachedViewById(id.img_home_profile));
                }

            }

            public void onFailure(@NotNull Call call, @NotNull Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                Log.d("Info Fail", t.toString());
            }
        }));
    }

    private void initRecyclerview(List repositoryList) {
        RecyclerView var10000 = (RecyclerView)this._$_findCachedViewById(id.repoRecyclerview);
        Intrinsics.checkNotNullExpressionValue(var10000, "repoRecyclerview");
        var10000.setLayoutManager((LayoutManager)(new LinearLayoutManager((Context)this)));
        var10000 = (RecyclerView)this._$_findCachedViewById(id.repoRecyclerview);
        Intrinsics.checkNotNullExpressionValue(var10000, "repoRecyclerview");
        var10000.setAdapter((Adapter)(new RepositoriesAdapter(repositoryList)));
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }
}
