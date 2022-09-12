package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new cmfp();
    public final int a;
    public final Format[] b;
    private int c;

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = readInt;
        this.b = new Format[readInt];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public final Format a(int i) {
        return this.b[i];
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
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.a == trackGroup.a && Arrays.equals(this.b, trackGroup.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.b) + 527;
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }

    public TrackGroup(Format... formatArr) {
        int length = formatArr.length;
        cmmn.c(length > 0);
        this.b = formatArr;
        this.a = length;
    }
}
