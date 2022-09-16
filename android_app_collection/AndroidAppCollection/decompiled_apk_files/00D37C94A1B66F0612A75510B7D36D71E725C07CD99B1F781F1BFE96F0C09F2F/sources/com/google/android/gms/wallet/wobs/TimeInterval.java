package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxi(5);
    long a;
    long b;

    TimeInterval() {
    }

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.t(parcel, 2, this.a);
        tqj.t(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
