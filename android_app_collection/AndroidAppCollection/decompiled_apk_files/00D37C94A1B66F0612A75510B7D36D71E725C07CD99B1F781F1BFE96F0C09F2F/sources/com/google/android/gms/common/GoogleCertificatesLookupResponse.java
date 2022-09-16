package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(9);
    public final boolean a;
    public final String b;
    public final int c;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        this.c = twx.j(i) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.o(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.s(parcel, 3, this.c);
        tqj.n(parcel, m);
    }
}
