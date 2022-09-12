package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InProductHelp> CREATOR = new codw();
    public GoogleHelp a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.g(parcel, 4, this.d);
        cnwn.k(parcel, 5, this.e, false);
        cnwn.g(parcel, 6, this.f);
        cnwn.c(parcel, d);
    }
}
