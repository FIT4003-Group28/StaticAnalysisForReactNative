package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupResponse> CREATOR = new cnne();
    public final boolean a;
    @dzsi
    public final String b;
    public final int c;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        this.c = cnnd.a(i) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.g(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
