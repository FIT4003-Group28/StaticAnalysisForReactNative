package com.google.android.apps.gmm.map.model.directions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LaneGuidance implements Parcelable {
    public static final Parcelable.Creator<LaneGuidance> CREATOR = new amto();
    public final List<LaneTurn> a;
    public final int b;

    public LaneGuidance(int i, List<LaneTurn> list) {
        this.b = i;
        this.a = list;
    }

    public LaneGuidance(Parcel parcel) {
        this.b = doyi.a(parcel.readInt());
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LaneTurn.class.getClassLoader());
        this.a = dcdc.t((LaneTurn[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, LaneTurn[].class));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.b;
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("[guidance: ");
        sb.append(valueOf);
        sb.append(" laneTurns(");
        String sb2 = sb.toString();
        for (LaneTurn laneTurn : this.a) {
            String valueOf2 = String.valueOf(sb2);
            String valueOf3 = String.valueOf(laneTurn);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(valueOf3).length());
            sb3.append(valueOf2);
            sb3.append(" ");
            sb3.append(valueOf3);
            sb2 = sb3.toString();
        }
        return String.valueOf(sb2).concat(" )]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int i3 = -1;
        if (i2 != 0) {
            i3 = (-1) + i2;
        }
        parcel.writeInt(i3);
        parcel.writeParcelableArray((LaneTurn[]) this.a.toArray(new LaneTurn[0]), i);
    }
}
