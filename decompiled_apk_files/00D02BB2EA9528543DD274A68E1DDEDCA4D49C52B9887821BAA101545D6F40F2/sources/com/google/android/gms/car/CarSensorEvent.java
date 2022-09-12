package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarSensorEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarSensorEvent> CREATOR = new cmwt();
    public final int a;
    public int b;
    public long c;
    public final float[] d;
    public final byte[] e;

    public CarSensorEvent(int i, int i2, long j, float[] fArr, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = fArr;
        this.e = bArr;
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    public final void a(int i) {
        if (this.b == i) {
            return;
        }
        throw new UnsupportedOperationException(String.format("Invalid sensor type: expected %d, got %d", Integer.valueOf(i), Integer.valueOf(this.b)));
    }

    public final String toString() {
        byte[] bArr;
        float[] fArr;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        sb.append("type:");
        sb.append(Integer.toHexString(this.b));
        float[] fArr2 = this.d;
        if (fArr2 != null && fArr2.length > 0) {
            sb.append(" float values:");
            for (float f : this.d) {
                sb.append(" ");
                sb.append(f);
            }
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null && bArr2.length > 0) {
            sb.append(" byte values:");
            for (byte b : this.e) {
                sb.append(" ");
                sb.append((int) b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.b);
        cnwn.h(parcel, 2, this.c);
        cnwn.o(parcel, 3, this.d);
        cnwn.l(parcel, 4, this.e, false);
        cnwn.g(parcel, 1000, this.a);
        cnwn.c(parcel, d);
    }
}
