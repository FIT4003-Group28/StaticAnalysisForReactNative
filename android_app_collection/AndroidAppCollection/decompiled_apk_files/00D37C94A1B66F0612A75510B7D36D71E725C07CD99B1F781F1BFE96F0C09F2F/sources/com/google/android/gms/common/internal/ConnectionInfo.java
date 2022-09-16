package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(18);
    public Bundle a;
    public Feature[] b;
    int c;
    public ConnectionTelemetryConfiguration d;

    public ConnectionInfo() {
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.v(parcel, 1, this.a);
        tqj.I(parcel, 2, this.b, i);
        tqj.s(parcel, 3, this.c);
        tqj.E(parcel, 4, this.d, i);
        tqj.n(parcel, m);
    }
}
