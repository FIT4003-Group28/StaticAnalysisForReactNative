package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new pot(8);
    public final String a;
    public final byte[] b;

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = pxi.a;
        this.a = readString;
        this.b = (byte[]) pxi.y(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (pxi.M(this.a, privFrame.a) && Arrays.equals(this.b, privFrame.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.b);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }
}
