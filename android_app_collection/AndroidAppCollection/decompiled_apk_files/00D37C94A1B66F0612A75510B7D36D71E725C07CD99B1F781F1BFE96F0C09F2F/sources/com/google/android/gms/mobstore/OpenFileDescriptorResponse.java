package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenFileDescriptorResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(18);
    public final ParcelFileDescriptor a;

    public OpenFileDescriptorResponse(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 1, this.a, i | 1);
        tqj.n(parcel, m);
    }
}
