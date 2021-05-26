package com.example.minkyeongsportfolio.ui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.minkyeongsportfolio.R;
import com.example.minkyeongsportfolio.R.id;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;


public final class SplashActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    @RequiresApi(21)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ActionBar action = this.getSupportActionBar();
        if (action != null) {
            action.hide();
        }

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_splash);
        (new Handler(Looper.getMainLooper())).postDelayed((Runnable)(new Runnable() {
            public final void run() {
                Intent intent = new Intent((Context)SplashActivity.this, MainActivity.class);
                ActivityOptions var10000 = ActivityOptions.makeSceneTransitionAnimation((Activity)SplashActivity.this, new Pair[]{Pair.create((CardView)SplashActivity.this._$_findCachedViewById(id.profile_img), "profile")});
                Intrinsics.checkNotNullExpressionValue(var10000, "ActivityOptions.makeScen… \"profile\")\n            )");
                ActivityOptions options = var10000;
                SplashActivity.this.startActivity(intent, options.toBundle());
            }
        }), 2500L);
    }

    protected void onStop() {
        super.onStop();
        this.finish();
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
