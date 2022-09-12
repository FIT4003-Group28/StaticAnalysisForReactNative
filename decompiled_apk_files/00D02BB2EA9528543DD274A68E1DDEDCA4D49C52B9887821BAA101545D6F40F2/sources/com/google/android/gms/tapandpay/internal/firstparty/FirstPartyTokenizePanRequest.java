package com.google.android.gms.tapandpay.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirstPartyTokenizePanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FirstPartyTokenizePanRequest> CREATOR = new cpbk();
    public String a;
    public boolean b;
    public String c;
    public byte[] d;
    public boolean e;
    public String f;
    public boolean g;
    public boolean h;
    boolean i;
    String j;
    boolean k;

    public FirstPartyTokenizePanRequest() {
    }

    public FirstPartyTokenizePanRequest(String str, boolean z, String str2, byte[] bArr, boolean z2, String str3, boolean z3, boolean z4, boolean z5, String str4, boolean z6) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = bArr;
        this.e = z2;
        this.f = str3;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = str4;
        this.k = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.e(parcel, 3, this.b);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.l(parcel, 5, this.d, false);
        cnwn.e(parcel, 6, this.e);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.e(parcel, 8, this.g);
        cnwn.e(parcel, 9, this.h);
        cnwn.e(parcel, 10, this.i);
        cnwn.k(parcel, 11, this.j, false);
        cnwn.e(parcel, 12, this.k);
        cnwn.c(parcel, d);
    }
}
