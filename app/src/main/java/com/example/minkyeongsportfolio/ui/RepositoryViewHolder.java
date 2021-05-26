package com.example.minkyeongsportfolio.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.minkyeongsportfolio.R;
import com.example.minkyeongsportfolio.model.Repo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;


public final class RepositoryViewHolder extends RecyclerView.ViewHolder {
    TextView name = itemView.findViewById(R.id.repo_name);
    TextView description = itemView.findViewById(R.id.repo_description);
    TextView stars = itemView.findViewById(R.id.repo_stars);
    TextView language = itemView.findViewById(R.id.repo_language);
    TextView forks = itemView.findViewById(R.id.repo_forks);
    Repo repo;

    public RepositoryViewHolder(@NonNull View itemView) {
        super(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(repo.getUrl()));
                v.getContext().startActivity(intent);
            }
        });
    }

    public final void bind(@Nullable Repo repo) {
        if (repo == null) {
            View var10000 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(var10000, "itemView");
            Resources resources = var10000.getResources();
            this.name.setText("Not Responed");
            this.description.setVisibility(View.GONE);
            this.language.setVisibility(View.GONE);
            this.stars.setText("0");
            this.forks.setText("0");
        }
        else {
            this.showRepoData(repo);
        }

    }

    private final void showRepoData(Repo repo) {
        this.repo = repo;
        if (repo.getFullName() != null){
            this.name.setText((CharSequence)repo.getFullName());
        }
        int descriptionVisibility = 8;
        if (repo.getDescription() != null) {
            this.description.setText((CharSequence)repo.getDescription());
            descriptionVisibility = 0;
        }

        this.description.setVisibility(descriptionVisibility);
        this.stars.setText((CharSequence)String.valueOf(repo.getStars()));
        this.forks.setText((CharSequence)String.valueOf(repo.getForks()));
        int languageVisibility = 8;
        CharSequence var4 = (CharSequence)repo.getLanguage();

        if (var4 != null && var4.length() != 0) {
            View var10000 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(var10000, "this.itemView");
            Context var8 = var10000.getContext();
            Intrinsics.checkNotNullExpressionValue(var8, "this.itemView.context");
            Resources resources = var8.getResources();
            this.language.setText((CharSequence)resources.getString(R.string.language, new Object[]{repo.getLanguage()}));
            languageVisibility = 0;
        }

        this.language.setVisibility(languageVisibility);
    }

}
