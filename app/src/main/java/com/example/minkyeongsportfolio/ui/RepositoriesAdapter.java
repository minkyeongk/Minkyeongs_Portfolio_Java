package com.example.minkyeongsportfolio.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.example.minkyeongsportfolio.R;
import com.example.minkyeongsportfolio.model.Repo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;


public final class RepositoriesAdapter extends Adapter {
    private final List RepoList;

    @NotNull
    public RepositoryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_repository, parent, false);
        RepositoryViewHolder viewholder = new RepositoryViewHolder(view);
        return viewholder;

    }

    public void onBindViewHolder(@NotNull RepositoryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Repo repoItem = (Repo)this.RepoList.get(position);
        holder.bind(repoItem);
    }

    public void onBindViewHolder(ViewHolder var1, int var2) {
        this.onBindViewHolder((RepositoryViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.RepoList.size();
    }

    public RepositoriesAdapter(@NotNull List RepoList) {
        super();
        this.RepoList = RepoList;
    }

}
