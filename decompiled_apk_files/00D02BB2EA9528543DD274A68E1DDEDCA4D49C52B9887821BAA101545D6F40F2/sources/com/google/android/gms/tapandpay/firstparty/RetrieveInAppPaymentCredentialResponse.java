package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RetrieveInAppPaymentCredentialResponse> CREATOR = new cpat();
    final String a;
    final byte[] b;
    final int c;
    final int d;
    final String e;
    final String f;

    public RetrieveInAppPaymentCredentialResponse(String str, byte[] bArr, int i, int i2, String str2, String str3) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.l(parcel, 3, this.b, false);
        cnwn.g(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.k(parcel, 6, this.e, false);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.c(parcel, d);
    }
}
