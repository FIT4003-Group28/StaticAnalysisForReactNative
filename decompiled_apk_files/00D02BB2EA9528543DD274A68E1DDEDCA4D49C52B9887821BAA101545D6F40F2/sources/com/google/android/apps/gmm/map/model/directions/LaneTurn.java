package com.google.android.apps.gmm.map.model.directions;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LaneTurn implements Parcelable {
    public static final Parcelable.Creator<LaneTurn> CREATOR = new amtp();
    public final doym a;
    public final boolean b;

    public LaneTurn(Parcel parcel) {
        this.a = doym.b(parcel.readInt());
        this.b = parcel.readInt() != 0;
    }

    public LaneTurn(doym doymVar, boolean z) {
        this.a = doymVar;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        doym doymVar = doym.STRAIGHT;
        int ordinal = this.a.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? " " : this.b ? "↿" : "↾" : this.b ? "↷" : "↶" : this.b ? "↘" : "↙" : this.b ? "↱" : "↰" : this.b ? "↗" : "↖" : "↑";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        doym doymVar = this.a;
        parcel.writeInt(doymVar == null ? -1 : doymVar.g);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
