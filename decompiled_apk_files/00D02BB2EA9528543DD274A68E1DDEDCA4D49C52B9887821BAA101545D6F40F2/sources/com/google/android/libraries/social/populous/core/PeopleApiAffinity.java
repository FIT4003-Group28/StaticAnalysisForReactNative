package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class PeopleApiAffinity implements Parcelable {
    public static final PeopleApiAffinity e = f(dcyn.a, "", false);

    public static PeopleApiAffinity e(double d, String str, AffinityMetadata affinityMetadata, boolean z) {
        return new AutoValue_PeopleApiAffinity(d, str, affinityMetadata, z);
    }

    public static PeopleApiAffinity f(double d, String str, boolean z) {
        return e(d, str, AffinityMetadata.f, z);
    }

    public static PeopleApiAffinity g(double d, String str) {
        return f(d, str, true);
    }

    public abstract double a();

    public abstract String b();

    public abstract AffinityMetadata c();

    public abstract boolean d();
}
