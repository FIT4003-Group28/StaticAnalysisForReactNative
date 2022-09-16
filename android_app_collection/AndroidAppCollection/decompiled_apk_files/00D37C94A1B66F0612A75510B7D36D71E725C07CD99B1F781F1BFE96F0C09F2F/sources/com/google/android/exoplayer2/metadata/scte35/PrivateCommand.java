package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new pot(14);
    public final long a;
    public final long b;
    public final byte[] c;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (byte[]) pxi.y(parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }
}
