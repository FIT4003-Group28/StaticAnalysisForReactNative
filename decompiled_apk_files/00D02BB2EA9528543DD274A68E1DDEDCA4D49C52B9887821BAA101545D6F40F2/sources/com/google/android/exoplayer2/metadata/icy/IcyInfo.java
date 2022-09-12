package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new cmcj();
    public final byte[] a;
    public final String b;
    public final String c;

    public IcyInfo(Parcel parcel) {
        this.a = (byte[]) cmmn.f(parcel.createByteArray());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final Format a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.a, ((IcyInfo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
