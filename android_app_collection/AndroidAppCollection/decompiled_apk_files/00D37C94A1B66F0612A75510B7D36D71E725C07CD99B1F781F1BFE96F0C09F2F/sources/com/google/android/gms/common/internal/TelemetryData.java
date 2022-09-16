package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(4);
    public final int a;
    public List b;

    public TelemetryData(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.J(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
