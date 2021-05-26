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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 2},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0015J\b\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\b"},
        d2 = {"Lcom/example/minkyeongsportfolio/ui/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "Minkyeong's_Portfolio.app"}
)
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

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
