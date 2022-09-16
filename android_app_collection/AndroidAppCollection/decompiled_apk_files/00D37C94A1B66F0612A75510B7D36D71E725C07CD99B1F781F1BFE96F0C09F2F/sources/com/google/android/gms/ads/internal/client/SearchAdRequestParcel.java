package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SearchAdRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(15);
    public final String a;

    public SearchAdRequestParcel(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 15, this.a);
        tqj.n(parcel, m);
    }
}
