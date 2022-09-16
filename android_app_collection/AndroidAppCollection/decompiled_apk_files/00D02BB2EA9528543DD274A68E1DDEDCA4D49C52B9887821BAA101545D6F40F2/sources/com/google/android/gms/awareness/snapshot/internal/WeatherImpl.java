package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class WeatherImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WeatherImpl> CREATOR = new cmvk();
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int[] e;

    public WeatherImpl(float f, float f2, float f3, int i, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = iArr;
    }

    static float d(int i, float f) {
        return i != 1 ? ((f - 32.0f) * 5.0f) / 9.0f : f;
    }

    public final float a(int i) {
        return d(i, this.c);
    }

    public final float b(int i) {
        return d(i, this.b);
    }

    public final float c(int i) {
        return d(i, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Temp=");
        boolean z = true;
        sb.append(c(1));
        sb.append("F/");
        sb.append(c(2));
        sb.append("C, Feels=");
        sb.append(b(1));
        sb.append("F/");
        sb.append(b(2));
        sb.append("C, Dew=");
        sb.append(a(1));
        sb.append("F/");
        sb.append(a(2));
        sb.append("C, Humidity=");
        sb.append(this.d);
        sb.append(", Condition=");
        if (this.e == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.e;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(",");
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
        cnwn.i(parcel, 2, this.a);
        cnwn.i(parcel, 3, this.b);
        cnwn.i(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.q(parcel, 6, this.e);
        cnwn.c(parcel, d);
    }
}
