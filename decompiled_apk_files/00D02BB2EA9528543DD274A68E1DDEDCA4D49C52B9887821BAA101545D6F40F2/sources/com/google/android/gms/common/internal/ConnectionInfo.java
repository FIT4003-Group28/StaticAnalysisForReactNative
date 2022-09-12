package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new cnuo();
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
        int d = cnwn.d(parcel);
        cnwn.m(parcel, 1, this.a);
        cnwn.x(parcel, 2, this.b, i);
        cnwn.g(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.c(parcel, d);
    }
}
