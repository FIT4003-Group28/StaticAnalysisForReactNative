package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asq();
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = pxi.T(parcel) ? parcel.createByteArray() : null;
    }

    public static int a(int i) {
        if (i != 1) {
            if (i == 9) {
                return 6;
            }
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 16) {
                return 6;
            }
            if (i == 18) {
                return 7;
            }
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 3;
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
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.a == colorInfo.a && this.b == colorInfo.b && this.c == colorInfo.c && Arrays.equals(this.d, colorInfo.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        pxi.L(parcel, this.d != null);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
