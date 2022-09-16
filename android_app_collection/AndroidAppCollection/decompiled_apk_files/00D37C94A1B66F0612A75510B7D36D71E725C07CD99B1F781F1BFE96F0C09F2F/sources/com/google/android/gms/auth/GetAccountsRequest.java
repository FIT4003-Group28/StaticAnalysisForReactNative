package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(12);
    public final String a;
    public final String[] b;

    public GetAccountsRequest(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.G(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
