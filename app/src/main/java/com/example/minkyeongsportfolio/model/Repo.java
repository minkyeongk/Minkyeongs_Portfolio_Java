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
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"},
        d2 = {"Lcom/example/minkyeongsportfolio/model/Repo;", "", "id", "", "name", "", "fullName", "description", "url", "stars", "", "forks", "language", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getForks", "()I", "getFullName", "getId", "()J", "getLanguage", "getName", "getStars", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Minkyeong's_Portfolio.app"}
)
public final class Repo {
    @SerializedName("id")
    private final long id;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("full_name")
    @NotNull
    private final String fullName;
    @SerializedName("description")
    @Nullable
    private final String description;
    @SerializedName("html_url")
    @NotNull
    private final String url;
    @SerializedName("stargazers_count")
    private final int stars;
    @SerializedName("forks_count")
    private final int forks;
    @SerializedName("language")
    @Nullable
    private final String language;

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getStars() {
        return this.stars;
    }

    public final int getForks() {
        return this.forks;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    public Repo(long id, @NotNull String name, @NotNull String fullName, @Nullable String description, @NotNull String url, int stars, int forks, @Nullable String language) {
        super();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.description = description;
        this.url = url;
        this.stars = stars;
        this.forks = forks;
        this.language = language;
    }

    public final long component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.fullName;
    }

    @Nullable
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final String component5() {
        return this.url;
    }

    public final int component6() {
        return this.stars;
    }

    public final int component7() {
        return this.forks;
    }

    @Nullable
    public final String component8() {
        return this.language;
    }

    @NotNull
    public final Repo copy(long id, @NotNull String name, @NotNull String fullName, @Nullable String description, @NotNull String url, int stars, int forks, @Nullable String language) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Repo(id, name, fullName, description, url, stars, forks, language);
    }

    // $FF: synthetic method
    public static Repo copy$default(Repo var0, long var1, String var3, String var4, String var5, String var6, int var7, int var8, String var9, int var10, Object var11) {
        if ((var10 & 1) != 0) {
            var1 = var0.id;
        }

        if ((var10 & 2) != 0) {
            var3 = var0.name;
        }

        if ((var10 & 4) != 0) {
            var4 = var0.fullName;
        }

        if ((var10 & 8) != 0) {
            var5 = var0.description;
        }

        if ((var10 & 16) != 0) {
            var6 = var0.url;
        }

        if ((var10 & 32) != 0) {
            var7 = var0.stars;
        }

        if ((var10 & 64) != 0) {
            var8 = var0.forks;
        }

        if ((var10 & 128) != 0) {
            var9 = var0.language;
        }

        return var0.copy(var1, var3, var4, var5, var6, var7, var8, var9);
    }

    @NotNull
    public String toString() {
        return "Repo(id=" + this.id + ", name=" + this.name + ", fullName=" + this.fullName + ", description=" + this.description + ", url=" + this.url + ", stars=" + this.stars + ", forks=" + this.forks + ", language=" + this.language + ")";
    }

    public int hashCode() {
        long var10000 = this.id;
        int var1 = (int)(var10000 ^ var10000 >>> 32) * 31;
        String var10001 = this.name;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.fullName;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.description;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.url;
        var1 = (((var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + this.stars) * 31 + this.forks) * 31;
        var10001 = this.language;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Repo) {
                Repo var2 = (Repo)var1;
                if (this.id == var2.id && Intrinsics.areEqual(this.name, var2.name) && Intrinsics.areEqual(this.fullName, var2.fullName) && Intrinsics.areEqual(this.description, var2.description) && Intrinsics.areEqual(this.url, var2.url) && this.stars == var2.stars && this.forks == var2.forks && Intrinsics.areEqual(this.language, var2.language)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
