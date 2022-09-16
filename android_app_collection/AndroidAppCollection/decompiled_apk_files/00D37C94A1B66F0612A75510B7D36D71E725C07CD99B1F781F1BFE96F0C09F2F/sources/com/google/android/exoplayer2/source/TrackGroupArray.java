package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TrackGroupArray implements Parcelable {
    public final int b;
    private final TrackGroup[] c;
    private int d;
    public static final TrackGroupArray a = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator CREATOR = new pot(20);

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.b = readInt;
        this.c = new TrackGroup[readInt];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public final int a(TrackGroup trackGroup) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    public final TrackGroup b(int i) {
        return this.c[i];
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
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.b == trackGroupArray.b && Arrays.equals(this.c, trackGroupArray.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.c);
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.c = trackGroupArr;
        this.b = trackGroupArr.length;
    }
}
