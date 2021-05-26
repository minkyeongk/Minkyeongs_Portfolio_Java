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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;


@Metadata(
        mv = {1, 4, 2},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"},
        d2 = {"Lcom/example/minkyeongsportfolio/ui/RepositoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/minkyeongsportfolio/ui/RepositoryViewHolder;", "RepoList", "", "Lcom/example/minkyeongsportfolio/model/Repo;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"}
)
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

    // $FF: synthetic method
    // $FF: bridge method
    /*public ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (ViewHolder)this.onCreateViewHolder(var1, var2);
    }*/

    public void onBindViewHolder(@NotNull RepositoryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Repo repoItem = (Repo)this.RepoList.get(position);
        holder.bind(repoItem);
    }

    // $FF: synthetic method
    // $FF: bridge method
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
