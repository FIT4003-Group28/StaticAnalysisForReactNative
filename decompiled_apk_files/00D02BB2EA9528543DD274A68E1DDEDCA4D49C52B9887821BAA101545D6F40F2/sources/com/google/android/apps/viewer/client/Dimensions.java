package com.google.android.apps.viewer.client;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Dimensions implements Parcelable {
    public static final Parcelable.Creator<Dimensions> CREATOR = new clax();
    public final int a;
    public final int b;

    public Dimensions(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Dimensions)) {
            Dimensions dimensions = (Dimensions) obj;
            if (this.a == dimensions.a && this.b == dimensions.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return String.format("Dimensions (w:%d, h:%d)", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
