package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new cnwi();
    public final int a;
    @dzsi
    public List<MethodInvocation> b;

    public TelemetryData(int i, @dzsi List<MethodInvocation> list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.y(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
