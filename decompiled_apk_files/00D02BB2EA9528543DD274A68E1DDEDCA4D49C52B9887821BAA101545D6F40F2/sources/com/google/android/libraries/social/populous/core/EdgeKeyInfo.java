package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class EdgeKeyInfo implements Comparable<EdgeKeyInfo>, Parcelable {
    public abstract String a();

    public abstract duej b();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(EdgeKeyInfo edgeKeyInfo) {
        EdgeKeyInfo edgeKeyInfo2 = edgeKeyInfo;
        if (edgeKeyInfo2 == this) {
            return 0;
        }
        int i = b().p - edgeKeyInfo2.b().p;
        return i != 0 ? i : a().compareTo(edgeKeyInfo2.a());
    }
}
