package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendDataRequest> CREATOR = new coqm();
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.l(parcel, 2, this.b, false);
        cnwn.c(parcel, d);
    }
}
