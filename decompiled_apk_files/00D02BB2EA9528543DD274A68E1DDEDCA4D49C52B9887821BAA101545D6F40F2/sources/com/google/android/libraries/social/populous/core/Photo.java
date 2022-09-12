package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Photo implements Parcelable, cyft {
    public static cygi f() {
        cycd cycdVar = new cycd();
        cycdVar.c(PersonFieldMetadata.l().i());
        cycdVar.b(false);
        return cycdVar;
    }

    public abstract int a();

    public abstract PersonFieldMetadata b();

    public abstract String c();

    public abstract boolean d();

    public abstract cygi e();
}
