package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new cnup();
    public final RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i) {
        this.a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.e(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.q(parcel, 4, this.d);
        cnwn.g(parcel, 5, this.e);
        cnwn.c(parcel, d);
    }
}
