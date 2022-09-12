package com.google.android.apps.gmm.directions.savedtrips.api;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class SavedTrip implements Parcelable {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class Data implements Parcelable {
        public static wdr i() {
            return new wdj();
        }

        public static Data j(amvh amvhVar, amvh amvhVar2, dqvj dqvjVar, int i, dspd dspdVar, dbsg<dcdc<dspd>> dbsgVar, int i2) {
            wdj wdjVar = new wdj();
            wdjVar.a = amvhVar;
            wdjVar.b(amvhVar2);
            if (dqvjVar != null) {
                wdjVar.b = dqvjVar;
                wdjVar.e = i;
                wdjVar.c = dspdVar;
                wdjVar.d = dbsgVar;
                wdjVar.f = i2;
                return wdjVar.a();
            }
            throw new NullPointerException("Null travelMode");
        }

        public abstract amvh a();

        public abstract amvh b();

        public abstract dqvj c();

        public abstract dspd d();

        public abstract dbsg<dcdc<dspd>> e();

        public abstract wdr f();

        public abstract int g();

        public abstract int h();
    }

    public static SavedTrip d(String str, Data data) {
        return new AutoValue_SavedTrip(str, data);
    }

    public abstract String a();

    public abstract Data b();

    public abstract wdq c();
}
