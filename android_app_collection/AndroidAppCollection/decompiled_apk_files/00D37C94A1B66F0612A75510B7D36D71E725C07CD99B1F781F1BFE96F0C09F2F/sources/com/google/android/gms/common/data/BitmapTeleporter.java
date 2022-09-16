package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(13);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b != null) {
            int m = tqj.m(parcel);
            tqj.s(parcel, 1, this.a);
            tqj.E(parcel, 2, this.b, i | 1);
            tqj.s(parcel, 3, this.c);
            tqj.n(parcel, m);
            this.b = null;
            return;
        }
        qnm.b(null);
        throw null;
    }
}
