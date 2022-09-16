package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(12);
    public final int a;
    public dnw b = null;
    public byte[] c;

    public GassResponseParcel(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    public final void a() {
        dnw dnwVar = this.b;
        if (dnwVar != null || this.c == null) {
            if (dnwVar != null && this.c == null) {
                return;
            }
            if (dnwVar != null && this.c != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (dnwVar != null || this.c != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.toByteArray();
        }
        tqj.w(parcel, 2, bArr);
        tqj.n(parcel, m);
    }
}
