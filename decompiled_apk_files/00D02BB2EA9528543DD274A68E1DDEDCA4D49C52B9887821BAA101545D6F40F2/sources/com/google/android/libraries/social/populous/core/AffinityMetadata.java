package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class AffinityMetadata implements Parcelable {
    public static final AffinityMetadata f;

    static {
        cycj f2 = f();
        f2.f(false);
        f2.d(false);
        f2.e(false);
        f2.b(dcyn.a);
        f2.c(dcyn.a);
        f = f2.a();
    }

    public static cycj f() {
        cybu cybuVar = new cybu();
        cybuVar.f(true);
        return cybuVar;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract double d();

    public abstract double e();
}
