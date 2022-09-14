package com.google.android.gms.droidguard.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DroidGuardInitReply implements Parcelable {
    public static final Parcelable.Creator<DroidGuardInitReply> CREATOR = new cnzz();
    @dzsi
    public final ParcelFileDescriptor a;
    @dzsi
    public final Parcelable b;

    public DroidGuardInitReply(@dzsi ParcelFileDescriptor parcelFileDescriptor, @dzsi Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 0;
        int i2 = this.a != null ? 1 : 0;
        Parcelable parcelable = this.b;
        if (parcelable != null) {
            i = parcelable.describeContents();
        }
        return i2 | i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
