package com.google.android.apps.gmm.streetview.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PanoramaLevel implements Parcelable {
    public static final Parcelable.Creator<PanoramaLevel> CREATOR = new bwzm();
    public final dggg a;
    public final float b;
    public final String c;
    private final String d;
    private final String e;

    public PanoramaLevel(Parcel parcel) {
        String readString = parcel.readString();
        dggf bZ = dggg.d.bZ();
        readString = readString == null ? "" : readString;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dggg dgggVar = (dggg) bZ.b;
        readString.getClass();
        dgggVar.a |= 2;
        dgggVar.c = readString;
        dgge b = dgge.b(parcel.readInt());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dggg dgggVar2 = (dggg) bZ.b;
        dgggVar2.b = b.l;
        dgggVar2.a |= 1;
        this.a = bZ.bK();
        String readString2 = parcel.readString();
        dbsk.s(readString2);
        this.d = readString2;
        this.b = parcel.readFloat();
        String readString3 = parcel.readString();
        dbsk.s(readString3);
        this.e = readString3;
        String readString4 = parcel.readString();
        dbsk.s(readString4);
        this.c = readString4;
    }

    public PanoramaLevel(dggg dgggVar, String str, float f, String str2, String str3) {
        this.a = dgggVar;
        this.d = str;
        this.b = f;
        this.e = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PanoramaLevel panoramaLevel = (PanoramaLevel) obj;
            if (this.a.c.equals(panoramaLevel.a.c) && this.d.equals(panoramaLevel.d) && Float.floatToRawIntBits(this.b) == Float.floatToRawIntBits(panoramaLevel.b) && this.e.equals(panoramaLevel.e) && this.c.equals(panoramaLevel.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.c, this.d, Float.valueOf(this.b), this.e, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.c);
        dgge b = dgge.b(this.a.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        parcel.writeInt(b.l);
        parcel.writeString(this.d);
        parcel.writeFloat(this.b);
        parcel.writeString(this.e);
        parcel.writeString(this.c);
    }
}
