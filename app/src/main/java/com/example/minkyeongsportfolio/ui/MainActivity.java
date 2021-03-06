package com.example.minkyeongsportfolio.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.example.minkyeongsportfolio.R.id;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import com.example.minkyeongsportfolio.R;


public final class MainActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    @RequiresApi(21)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        ((AppCompatButton)this._$_findCachedViewById(id.project_button)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.notion.so/Minkyeong-Kim-5b20d2d8509d4dec891b873fb2bfe9cf"));
                startActivity(intent);
            }
        }));

        ((AppCompatButton)this._$_findCachedViewById(id.github_button)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)MainActivity.this, GithubActivity.class);
                startActivity(intent);
            }
        }));

        ((AppCompatButton)this._$_findCachedViewById(id.blog_button)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://happy-mincoder.tistory.com/"));
                startActivity(intent);
            }
        }));

        ((AppCompatButton)this._$_findCachedViewById(id.resume_button)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Toast.makeText((Context)MainActivity.this, (CharSequence)"Available Not Yet", Toast.LENGTH_SHORT).show();
            }
        }));
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

