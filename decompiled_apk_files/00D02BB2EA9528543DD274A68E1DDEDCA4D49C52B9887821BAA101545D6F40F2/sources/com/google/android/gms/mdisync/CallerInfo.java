package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallerInfo> CREATOR = new cori();
    public final String a;
    public final long b;

    public CallerInfo(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.h(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
