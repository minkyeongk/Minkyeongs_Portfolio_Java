package com.example.minkyeongsportfolio.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 4, 2},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b[\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010%J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0016HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003Jê\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u00162\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\u0005HÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u001a\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b2\u0010/R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u001a\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b?\u0010/R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b@\u0010/R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010'R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010'R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010'R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010'¨\u0006q"},
        d2 = {"Lcom/example/minkyeongsportfolio/model/GithubUserInfo;", "", "login", "", "id", "", "node_id", "avatar_url", "gravatar_id", "url", "html_url", "followers_url", "following_url", "gists_url", "starred_url", "subscriptions_url", "organizations_url", "repos_url", "events_url", "received_events_url", "type", "site_admin", "", "name", "company", "blog", "location", "email", "hireable", "bio", "twitter_username", "public_repos", "public_gists", "followers", "following", "created_at", "updated_at", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar_url", "()Ljava/lang/String;", "getBio", "getBlog", "getCompany", "getCreated_at", "getEmail", "getEvents_url", "getFollowers", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFollowers_url", "getFollowing", "getFollowing_url", "getGists_url", "getGravatar_id", "getHireable", "getHtml_url", "getId", "()I", "getLocation", "getLogin", "getName", "getNode_id", "getOrganizations_url", "getPublic_gists", "getPublic_repos", "getReceived_events_url", "getRepos_url", "getSite_admin", "()Z", "getStarred_url", "getSubscriptions_url", "getTwitter_username", "getType", "getUpdated_at", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/example/minkyeongsportfolio/model/GithubUserInfo;", "equals", "other", "hashCode", "toString", "Minkyeong's_Portfolio.app"}
)
public final class GithubUserInfo {
    @SerializedName("login")
    @NotNull
    private final String login;
    @SerializedName("id")
    private final int id;
    @SerializedName("node_id")
    @NotNull
    private final String node_id;
    @SerializedName("avatar_url")
    @NotNull
    private final String avatar_url;
    @SerializedName("gravatar_id")
    @NotNull
    private final String gravatar_id;
    @SerializedName("url")
    @NotNull
    private final String url;
    @SerializedName("html_url")
    @NotNull
    private final String html_url;
    @SerializedName("followers_url")
    @NotNull
    private final String followers_url;
    @SerializedName("following_url")
    @NotNull
    private final String following_url;
    @SerializedName("gists_url")
    @NotNull
    private final String gists_url;
    @SerializedName("starred_url")
    @NotNull
    private final String starred_url;
    @SerializedName("subscriptions_url")
    @NotNull
    private final String subscriptions_url;
    @SerializedName("organizations_url")
    @NotNull
    private final String organizations_url;
    @SerializedName("repos_url")
    @NotNull
    private final String repos_url;
    @SerializedName("events_url")
    @NotNull
    private final String events_url;
    @SerializedName("received_events_url")
    @NotNull
    private final String received_events_url;
    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName("company")
    @Nullable
    private final String company;
    @SerializedName("blog")
    @Nullable
    private final String blog;
    @SerializedName("location")
    @Nullable
    private final String location;
    @SerializedName("email")
    @Nullable
    private final String email;
    @SerializedName("hireable")
    @Nullable
    private final String hireable;
    @SerializedName("bio")
    @Nullable
    private final String bio;
    @SerializedName("twitter_username")
    @Nullable
    private final String twitter_username;
    @SerializedName("public_repos")
    @Nullable
    private final Integer public_repos;
    @SerializedName("public_gists")
    @Nullable
    private final Integer public_gists;
    @SerializedName("followers")
    @Nullable
    private final Integer followers;
    @SerializedName("following")
    @Nullable
    private final Integer following;
    @SerializedName("created_at")
    @Nullable
    private final String created_at;
    @SerializedName("updated_at")
    @Nullable
    private final String updated_at;

    @NotNull
    public final String getLogin() {
        return this.login;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getNode_id() {
        return this.node_id;
    }

    @NotNull
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    @NotNull
    public final String getGravatar_id() {
        return this.gravatar_id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getHtml_url() {
        return this.html_url;
    }

    @NotNull
    public final String getFollowers_url() {
        return this.followers_url;
    }

    @NotNull
    public final String getFollowing_url() {
        return this.following_url;
    }

    @NotNull
    public final String getGists_url() {
        return this.gists_url;
    }

    @NotNull
    public final String getStarred_url() {
        return this.starred_url;
    }

    @NotNull
    public final String getSubscriptions_url() {
        return this.subscriptions_url;
    }

    @NotNull
    public final String getOrganizations_url() {
        return this.organizations_url;
    }

    @NotNull
    public final String getRepos_url() {
        return this.repos_url;
    }

    @NotNull
    public final String getEvents_url() {
        return this.events_url;
    }

    @NotNull
    public final String getReceived_events_url() {
        return this.received_events_url;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getBlog() {
        return this.blog;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getHireable() {
        return this.hireable;
    }

    @Nullable
    public final String getBio() {
        return this.bio;
    }

    @Nullable
    public final String getTwitter_username() {
        return this.twitter_username;
    }

    @Nullable
    public final Integer getPublic_repos() {
        return this.public_repos;
    }

    @Nullable
    public final Integer getPublic_gists() {
        return this.public_gists;
    }

    @Nullable
    public final Integer getFollowers() {
        return this.followers;
    }

    @Nullable
    public final Integer getFollowing() {
        return this.following;
    }

    @Nullable
    public final String getCreated_at() {
        return this.created_at;
    }

    @Nullable
    public final String getUpdated_at() {
        return this.updated_at;
    }

    public GithubUserInfo(@NotNull String login, int id, @NotNull String node_id, @NotNull String avatar_url, @NotNull String gravatar_id, @NotNull String url, @NotNull String html_url, @NotNull String followers_url, @NotNull String following_url, @NotNull String gists_url, @NotNull String starred_url, @NotNull String subscriptions_url, @NotNull String organizations_url, @NotNull String repos_url, @NotNull String events_url, @NotNull String received_events_url, @NotNull String type, boolean site_admin, @Nullable String name, @Nullable String company, @Nullable String blog, @Nullable String location, @Nullable String email, @Nullable String hireable, @Nullable String bio, @Nullable String twitter_username, @Nullable Integer public_repos, @Nullable Integer public_gists, @Nullable Integer followers, @Nullable Integer following, @Nullable String created_at, @Nullable String updated_at) {
        super();
        Intrinsics.checkNotNullParameter(login, "login");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(avatar_url, "avatar_url");
        Intrinsics.checkNotNullParameter(gravatar_id, "gravatar_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(followers_url, "followers_url");
        Intrinsics.checkNotNullParameter(following_url, "following_url");
        Intrinsics.checkNotNullParameter(gists_url, "gists_url");
        Intrinsics.checkNotNullParameter(starred_url, "starred_url");
        Intrinsics.checkNotNullParameter(subscriptions_url, "subscriptions_url");
        Intrinsics.checkNotNullParameter(organizations_url, "organizations_url");
        Intrinsics.checkNotNullParameter(repos_url, "repos_url");
        Intrinsics.checkNotNullParameter(events_url, "events_url");
        Intrinsics.checkNotNullParameter(received_events_url, "received_events_url");
        Intrinsics.checkNotNullParameter(type, "type");

        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.twitter_username = twitter_username;
        this.public_repos = public_repos;
        this.public_gists = public_gists;
        this.followers = followers;
        this.following = following;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @NotNull
    public final String component1() {
        return this.login;
    }

    public final int component2() {
        return this.id;
    }

    @NotNull
    public final String component3() {
        return this.node_id;
    }

    @NotNull
    public final String component4() {
        return this.avatar_url;
    }

    @NotNull
    public final String component5() {
        return this.gravatar_id;
    }

    @NotNull
    public final String component6() {
        return this.url;
    }

    @NotNull
    public final String component7() {
        return this.html_url;
    }

    @NotNull
    public final String component8() {
        return this.followers_url;
    }

    @NotNull
    public final String component9() {
        return this.following_url;
    }

    @NotNull
    public final String component10() {
        return this.gists_url;
    }

    @NotNull
    public final String component11() {
        return this.starred_url;
    }

    @NotNull
    public final String component12() {
        return this.subscriptions_url;
    }

    @NotNull
    public final String component13() {
        return this.organizations_url;
    }

    @NotNull
    public final String component14() {
        return this.repos_url;
    }

    @NotNull
    public final String component15() {
        return this.events_url;
    }

    @NotNull
    public final String component16() {
        return this.received_events_url;
    }

    @NotNull
    public final String component17() {
        return this.type;
    }


    @Nullable
    public final String component19() {
        return this.name;
    }

    @Nullable
    public final String component20() {
        return this.company;
    }

    @Nullable
    public final String component21() {
        return this.blog;
    }

    @Nullable
    public final String component22() {
        return this.location;
    }

    @Nullable
    public final String component23() {
        return this.email;
    }

    @Nullable
    public final String component24() {
        return this.hireable;
    }

    @Nullable
    public final String component25() {
        return this.bio;
    }

    @Nullable
    public final String component26() {
        return this.twitter_username;
    }

    @Nullable
    public final Integer component27() {
        return this.public_repos;
    }

    @Nullable
    public final Integer component28() {
        return this.public_gists;
    }

    @Nullable
    public final Integer component29() {
        return this.followers;
    }

    @Nullable
    public final Integer component30() {
        return this.following;
    }

    @Nullable
    public final String component31() {
        return this.created_at;
    }

    @Nullable
    public final String component32() {
        return this.updated_at;
    }

    @NotNull
    public final GithubUserInfo copy(@NotNull String login, int id, @NotNull String node_id, @NotNull String avatar_url, @NotNull String gravatar_id, @NotNull String url, @NotNull String html_url, @NotNull String followers_url, @NotNull String following_url, @NotNull String gists_url, @NotNull String starred_url, @NotNull String subscriptions_url, @NotNull String organizations_url, @NotNull String repos_url, @NotNull String events_url, @NotNull String received_events_url, @NotNull String type, boolean site_admin, @Nullable String name, @Nullable String company, @Nullable String blog, @Nullable String location, @Nullable String email, @Nullable String hireable, @Nullable String bio, @Nullable String twitter_username, @Nullable Integer public_repos, @Nullable Integer public_gists, @Nullable Integer followers, @Nullable Integer following, @Nullable String created_at, @Nullable String updated_at) {
        Intrinsics.checkNotNullParameter(login, "login");
        Intrinsics.checkNotNullParameter(node_id, "node_id");
        Intrinsics.checkNotNullParameter(avatar_url, "avatar_url");
        Intrinsics.checkNotNullParameter(gravatar_id, "gravatar_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(followers_url, "followers_url");
        Intrinsics.checkNotNullParameter(following_url, "following_url");
        Intrinsics.checkNotNullParameter(gists_url, "gists_url");
        Intrinsics.checkNotNullParameter(starred_url, "starred_url");
        Intrinsics.checkNotNullParameter(subscriptions_url, "subscriptions_url");
        Intrinsics.checkNotNullParameter(organizations_url, "organizations_url");
        Intrinsics.checkNotNullParameter(repos_url, "repos_url");
        Intrinsics.checkNotNullParameter(events_url, "events_url");
        Intrinsics.checkNotNullParameter(received_events_url, "received_events_url");
        Intrinsics.checkNotNullParameter(type, "type");
        return new GithubUserInfo(login, id, node_id, avatar_url, gravatar_id, url, html_url, followers_url, following_url, gists_url, starred_url, subscriptions_url, organizations_url, repos_url, events_url, received_events_url, type, site_admin, name, company, blog, location, email, hireable, bio, twitter_username, public_repos, public_gists, followers, following, created_at, updated_at);
    }

    // $FF: synthetic method
    public static GithubUserInfo copy$default(GithubUserInfo var0, String var1, int var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, String var11, String var12, String var13, String var14, String var15, String var16, String var17, boolean var18, String var19, String var20, String var21, String var22, String var23, String var24, String var25, String var26, Integer var27, Integer var28, Integer var29, Integer var30, String var31, String var32, int var33, Object var34) {
        if ((var33 & 1) != 0) {
            var1 = var0.login;
        }

        if ((var33 & 2) != 0) {
            var2 = var0.id;
        }

        if ((var33 & 4) != 0) {
            var3 = var0.node_id;
        }

        if ((var33 & 8) != 0) {
            var4 = var0.avatar_url;
        }

        if ((var33 & 16) != 0) {
            var5 = var0.gravatar_id;
        }

        if ((var33 & 32) != 0) {
            var6 = var0.url;
        }

        if ((var33 & 64) != 0) {
            var7 = var0.html_url;
        }

        if ((var33 & 128) != 0) {
            var8 = var0.followers_url;
        }

        if ((var33 & 256) != 0) {
            var9 = var0.following_url;
        }

        if ((var33 & 512) != 0) {
            var10 = var0.gists_url;
        }

        if ((var33 & 1024) != 0) {
            var11 = var0.starred_url;
        }

        if ((var33 & 2048) != 0) {
            var12 = var0.subscriptions_url;
        }

        if ((var33 & 4096) != 0) {
            var13 = var0.organizations_url;
        }

        if ((var33 & 8192) != 0) {
            var14 = var0.repos_url;
        }

        if ((var33 & 16384) != 0) {
            var15 = var0.events_url;
        }

        if ((var33 & '耀') != 0) {
            var16 = var0.received_events_url;
        }

        if ((var33 & 65536) != 0) {
            var17 = var0.type;
        }

        if ((var33 & 262144) != 0) {
            var19 = var0.name;
        }

        if ((var33 & 524288) != 0) {
            var20 = var0.company;
        }

        if ((var33 & 1048576) != 0) {
            var21 = var0.blog;
        }

        if ((var33 & 2097152) != 0) {
            var22 = var0.location;
        }

        if ((var33 & 4194304) != 0) {
            var23 = var0.email;
        }

        if ((var33 & 8388608) != 0) {
            var24 = var0.hireable;
        }

        if ((var33 & 16777216) != 0) {
            var25 = var0.bio;
        }

        if ((var33 & 33554432) != 0) {
            var26 = var0.twitter_username;
        }

        if ((var33 & 67108864) != 0) {
            var27 = var0.public_repos;
        }

        if ((var33 & 134217728) != 0) {
            var28 = var0.public_gists;
        }

        if ((var33 & 268435456) != 0) {
            var29 = var0.followers;
        }

        if ((var33 & 536870912) != 0) {
            var30 = var0.following;
        }

        if ((var33 & 1073741824) != 0) {
            var31 = var0.created_at;
        }

        if ((var33 & Integer.MIN_VALUE) != 0) {
            var32 = var0.updated_at;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var23, var24, var25, var26, var27, var28, var29, var30, var31, var32);
    }

    @NotNull
    public String toString() {
        return "GithubUserInfo(login=" + this.login + ", id=" + this.id + ", node_id=" + this.node_id + ", avatar_url=" + this.avatar_url + ", gravatar_id=" + this.gravatar_id + ", url=" + this.url + ", html_url=" + this.html_url + ", followers_url=" + this.followers_url + ", following_url=" + this.following_url + ", gists_url=" + this.gists_url + ", starred_url=" + this.starred_url + ", subscriptions_url=" + this.subscriptions_url + ", organizations_url=" + this.organizations_url + ", repos_url=" + this.repos_url + ", events_url=" + this.events_url + ", received_events_url=" + this.received_events_url + ", type=" + this.type + ", name=" + this.name + ", company=" + this.company + ", blog=" + this.blog + ", location=" + this.location + ", email=" + this.email + ", hireable=" + this.hireable + ", bio=" + this.bio + ", twitter_username=" + this.twitter_username + ", public_repos=" + this.public_repos + ", public_gists=" + this.public_gists + ", followers=" + this.followers + ", following=" + this.following + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
    }

    public int hashCode() {
        String var10000 = this.login;
        int var1 = ((var10000 != null ? var10000.hashCode() : 0) * 31 + this.id) * 31;
        String var10001 = this.node_id;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.avatar_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.gravatar_id;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.html_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.followers_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.following_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.gists_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.starred_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.subscriptions_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.organizations_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.repos_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.events_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.received_events_url;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.type;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.name;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.company;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.blog;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.location;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.email;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.hireable;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.bio;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.twitter_username;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        Integer var3 = this.public_repos;
        var1 = (var1 + (var3 != null ? var3.hashCode() : 0)) * 31;
        var3 = this.public_gists;
        var1 = (var1 + (var3 != null ? var3.hashCode() : 0)) * 31;
        var3 = this.followers;
        var1 = (var1 + (var3 != null ? var3.hashCode() : 0)) * 31;
        var3 = this.following;
        var1 = (var1 + (var3 != null ? var3.hashCode() : 0)) * 31;
        var10001 = this.created_at;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.updated_at;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof GithubUserInfo) {
                GithubUserInfo var2 = (GithubUserInfo)var1;
                if (Intrinsics.areEqual(this.login, var2.login) && this.id == var2.id && Intrinsics.areEqual(this.node_id, var2.node_id) && Intrinsics.areEqual(this.avatar_url, var2.avatar_url) && Intrinsics.areEqual(this.gravatar_id, var2.gravatar_id) && Intrinsics.areEqual(this.url, var2.url) && Intrinsics.areEqual(this.html_url, var2.html_url) && Intrinsics.areEqual(this.followers_url, var2.followers_url) && Intrinsics.areEqual(this.following_url, var2.following_url) && Intrinsics.areEqual(this.gists_url, var2.gists_url) && Intrinsics.areEqual(this.starred_url, var2.starred_url) && Intrinsics.areEqual(this.subscriptions_url, var2.subscriptions_url) && Intrinsics.areEqual(this.organizations_url, var2.organizations_url) && Intrinsics.areEqual(this.repos_url, var2.repos_url) && Intrinsics.areEqual(this.events_url, var2.events_url) && Intrinsics.areEqual(this.received_events_url, var2.received_events_url) && Intrinsics.areEqual(this.type, var2.type) && Intrinsics.areEqual(this.name, var2.name) && Intrinsics.areEqual(this.company, var2.company) && Intrinsics.areEqual(this.blog, var2.blog) && Intrinsics.areEqual(this.location, var2.location) && Intrinsics.areEqual(this.email, var2.email) && Intrinsics.areEqual(this.hireable, var2.hireable) && Intrinsics.areEqual(this.bio, var2.bio) && Intrinsics.areEqual(this.twitter_username, var2.twitter_username) && Intrinsics.areEqual(this.public_repos, var2.public_repos) && Intrinsics.areEqual(this.public_gists, var2.public_gists) && Intrinsics.areEqual(this.followers, var2.followers) && Intrinsics.areEqual(this.following, var2.following) && Intrinsics.areEqual(this.created_at, var2.created_at) && Intrinsics.areEqual(this.updated_at, var2.updated_at)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
