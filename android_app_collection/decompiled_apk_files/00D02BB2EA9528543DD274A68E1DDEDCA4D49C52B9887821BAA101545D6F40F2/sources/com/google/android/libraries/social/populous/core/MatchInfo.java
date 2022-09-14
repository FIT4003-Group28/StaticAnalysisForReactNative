package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MatchInfo implements Parcelable, Comparable<MatchInfo> {
    public static MatchInfo c(int i, int i2) {
        return new AutoValue_MatchInfo(i, i2);
    }

    public abstract int a();

    public abstract int b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(MatchInfo matchInfo) {
        MatchInfo matchInfo2 = matchInfo;
        int compare = Integer.compare(a(), matchInfo2.a());
        return compare == 0 ? Integer.compare(b(), matchInfo2.b()) : compare;
    }
}
