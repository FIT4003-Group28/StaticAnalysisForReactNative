package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OpenFileDescriptorResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenFileDescriptorResponse> CREATOR = new cotw();
    public final ParcelFileDescriptor a;

    public OpenFileDescriptorResponse(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i | 1);
        cnwn.c(parcel, d);
    }
}
