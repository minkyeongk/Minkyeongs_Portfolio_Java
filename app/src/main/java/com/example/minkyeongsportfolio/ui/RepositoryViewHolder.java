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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 2},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"},
        d2 = {"Lcom/example/minkyeongsportfolio/ui/RepositoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "forks", "language", "name", "repo", "Lcom/example/minkyeongsportfolio/model/Repo;", "stars", "bind", "", "showRepoData", "Companion", "app_debug"}
)
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
