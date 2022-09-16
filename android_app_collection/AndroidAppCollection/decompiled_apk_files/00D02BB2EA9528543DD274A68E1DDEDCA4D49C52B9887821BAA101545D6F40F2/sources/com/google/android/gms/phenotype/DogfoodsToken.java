package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DogfoodsToken> CREATOR = new coxk();
    public final byte[] a;

    public DogfoodsToken(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.l(parcel, 2, this.a, false);
        cnwn.c(parcel, d);
    }
}
