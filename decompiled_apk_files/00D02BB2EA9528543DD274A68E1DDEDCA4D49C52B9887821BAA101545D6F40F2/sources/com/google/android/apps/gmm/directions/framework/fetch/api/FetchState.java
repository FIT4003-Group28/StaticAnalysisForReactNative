package com.google.android.apps.gmm.directions.framework.fetch.api;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class FetchState implements Parcelable {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class Fetch implements Parcelable {
        public static Fetch c(tgk tgkVar) {
            return d(tgkVar, dbpy.a);
        }

        public static Fetch d(tgk tgkVar, dbsg<bttq> dbsgVar) {
            return new AutoValue_FetchState_Fetch(tgkVar, dbsgVar);
        }

        public abstract tgk a();

        public abstract dbsg<bttq> b();
    }

    public static tgj c() {
        return new tga();
    }

    public abstract Fetch a();

    public abstract tgj b();
}
