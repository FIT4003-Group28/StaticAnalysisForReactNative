package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DefaultTrackSelector$SelectionOverride implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pva();
    public final int a;
    public final int[] b;
    public final int c;

    public DefaultTrackSelector$SelectionOverride(Parcel parcel) {
        this.a = parcel.readInt();
        int[] iArr = new int[parcel.readByte()];
        this.b = iArr;
        parcel.readIntArray(iArr);
        this.c = parcel.readInt();
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
            DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = (DefaultTrackSelector$SelectionOverride) obj;
            if (this.a == defaultTrackSelector$SelectionOverride.a && Arrays.equals(this.b, defaultTrackSelector$SelectionOverride.b) && this.c == defaultTrackSelector$SelectionOverride.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeIntArray(this.b);
        parcel.writeInt(this.c);
    }
}
