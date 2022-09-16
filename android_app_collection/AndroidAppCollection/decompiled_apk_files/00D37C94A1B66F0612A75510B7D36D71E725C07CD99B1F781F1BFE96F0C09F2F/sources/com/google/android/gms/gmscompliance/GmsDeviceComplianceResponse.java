package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(15);
    final int a;
    public boolean b;
    public PendingIntent c;

    public GmsDeviceComplianceResponse() {
        this(1, true, null);
    }

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.o(parcel, 2, this.b);
        tqj.E(parcel, 3, this.c, i);
        tqj.n(parcel, m);
    }

    public GmsDeviceComplianceResponse(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        this(gmsDeviceComplianceResponse.a, gmsDeviceComplianceResponse.b, gmsDeviceComplianceResponse.c);
    }
}
