package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class WifiScan extends AbstractSafeParcelable {
    public final long c;
    final long[] d;
    final int[] e;
    final int[] f;
    final int[] g;
    final int[] h;
    final int[] i;
    final int[] j;
    public static final long[] a = new long[0];
    public static final int[] b = new int[0];
    public static final Parcelable.Creator<WifiScan> CREATOR = new cols();

    public WifiScan(long j, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.c = j;
        this.d = jArr == null ? a : jArr;
        this.e = iArr == null ? b : iArr;
        this.f = iArr2 == null ? b : iArr2;
        this.g = iArr3 == null ? b : iArr3;
        this.h = iArr4 == null ? b : iArr4;
        this.i = iArr5 == null ? b : iArr5;
        this.j = iArr6 == null ? b : iArr6;
    }

    private final void d(int i) {
        if (i < 0 || i >= a()) {
            int a2 = a();
            StringBuilder sb = new StringBuilder(49);
            sb.append("Index ");
            sb.append(i);
            sb.append(" out of bounds: [0, ");
            sb.append(a2);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final int a() {
        return this.d.length;
    }

    public final long b(int i) {
        d(i);
        return this.d[i] & 281474976710655L;
    }

    public final byte c(int i) {
        d(i);
        return (byte) ((this.d[i] & 71776119061217280L) >>> 48);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WifiScan)) {
            return false;
        }
        WifiScan wifiScan = (WifiScan) obj;
        return wifiScan.c == this.c && Arrays.equals(wifiScan.d, this.d) && Arrays.equals(wifiScan.e, this.e) && Arrays.equals(wifiScan.f, this.f) && Arrays.equals(wifiScan.g, this.g) && Arrays.equals(wifiScan.h, this.h) && Arrays.equals(wifiScan.i, this.i) && Arrays.equals(wifiScan.j, this.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WifiScan[elapsed rt: ");
        sb.append(this.c);
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            sb.append(", Device[mac: ");
            sb.append(b(i));
            sb.append(", dbm: ");
            sb.append((int) c(i));
            sb.append(", mhz: ");
            d(i);
            sb.append(this.e[i]);
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.h(parcel, 1, this.c);
        long[] jArr = this.d;
        int b2 = cnwn.b(parcel, 2);
        parcel.writeLongArray(jArr);
        cnwn.c(parcel, b2);
        cnwn.q(parcel, 3, this.e);
        cnwn.q(parcel, 4, this.f);
        cnwn.q(parcel, 5, this.g);
        cnwn.q(parcel, 6, this.h);
        cnwn.q(parcel, 7, this.i);
        cnwn.q(parcel, 8, this.j);
        cnwn.c(parcel, d);
    }
}
