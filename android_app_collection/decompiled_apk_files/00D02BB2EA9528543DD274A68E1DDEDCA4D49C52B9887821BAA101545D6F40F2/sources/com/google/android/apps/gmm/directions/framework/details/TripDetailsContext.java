package com.google.android.apps.gmm.directions.framework.details;

import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class TripDetailsContext implements Parcelable {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class ModelGroupAndTripDetailsContext implements Parcelable {
        public abstract String a();

        public abstract dbsg<Integer> b();
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class TaxiTripDetailsContext implements Parcelable {
        public static TaxiTripDetailsContext c(String str, int i) {
            return new AutoValue_TripDetailsContext_TaxiTripDetailsContext(str, Integer.valueOf(i));
        }

        public abstract String a();

        public abstract Integer b();
    }

    public static TripDetailsContext e(tlv tlvVar, dbsg<amve> dbsgVar, dbsg dbsgVar2) {
        dbsg<Integer> dbsgVar3;
        if (dbsgVar.a()) {
            dbsgVar3 = tlvVar.w(dbsgVar.b());
        } else {
            dbsgVar3 = dbpy.a;
        }
        return new AutoValue_TripDetailsContext(true, dbsgVar2, dbsg.i(new AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext(tlvVar.e(), dbsgVar3)), dbpy.a);
    }

    public abstract boolean a();

    public abstract dbsg b();

    public abstract dbsg<ModelGroupAndTripDetailsContext> c();

    public abstract dbsg<TaxiTripDetailsContext> d();
}
