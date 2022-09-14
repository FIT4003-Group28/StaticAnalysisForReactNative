package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RpcResponse> CREATOR = new cpjm();
    public final int a;
    public final int b;
    public final byte[] c;

    public RpcResponse(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.l(parcel, 3, this.c, false);
        cnwn.c(parcel, d);
    }
}
