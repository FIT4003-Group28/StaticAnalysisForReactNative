package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TimeIntervalsImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeIntervalsImpl> CREATOR = new cmvj();
    public final int[] a;

    public TimeIntervalsImpl(int[] iArr) {
        this.a = iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TimeIntervals=");
        if (this.a == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.a;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.q(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
