package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(1);
    public String a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VersionInfoParcel(int r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 37
            r0.<init>(r1)
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ".213380000.0"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r5 = 213380000(0xcb7eba0, float:2.8337426E-31)
            r6 = 1
            r7 = 0
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.VersionInfoParcel.<init>(int):void");
    }

    public VersionInfoParcel(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.s(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.o(parcel, 5, this.d);
        tqj.o(parcel, 6, this.e);
        tqj.n(parcel, m);
    }
}
