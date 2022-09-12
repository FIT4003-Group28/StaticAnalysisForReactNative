package com.google.android.apps.gmm.locationsharing.api;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Profile implements Parcelable {
    public static ahwk g() {
        return new ahuw();
    }

    public static dbsg<String> h(String str) {
        return str.isEmpty() ? dbpy.a : dbsg.i(str);
    }

    public abstract PersonId a();

    public abstract dbsg<String> b();

    public abstract dbsg<String> c();

    public abstract dbsg<String> d();

    public abstract dbsg<String> e();

    public abstract ahwk f();
}
