package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cnwn  reason: default package */
/* loaded from: classes.dex */
public final class cnwn {
    public static void a(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int b(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static int d(Parcel parcel) {
        return b(parcel, 20293);
    }

    public static void e(Parcel parcel, int i, boolean z) {
        a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void f(Parcel parcel, int i, byte b) {
        a(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void g(Parcel parcel, int i, int i2) {
        a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void h(Parcel parcel, int i, long j) {
        a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void i(Parcel parcel, int i, float f) {
        a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void j(Parcel parcel, int i, double d) {
        a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void k(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (!z) {
                return;
            }
            a(parcel, i, 0);
            return;
        }
        int b = b(parcel, i);
        parcel.writeString(str);
        c(parcel, b);
    }

    public static void l(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (!z) {
                return;
            }
            a(parcel, i, 0);
            return;
        }
        int b = b(parcel, i);
        parcel.writeByteArray(bArr);
        c(parcel, b);
    }

    public static void m(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeBundle(bundle);
        c(parcel, b);
    }

    public static void n(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        c(parcel, b);
    }

    public static void o(Parcel parcel, int i, float[] fArr) {
        if (fArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeFloatArray(fArr);
        c(parcel, b);
    }

    public static void p(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        c(parcel, b);
    }

    public static void q(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeIntArray(iArr);
        c(parcel, b);
    }

    public static void r(Parcel parcel, int i, List<Integer> list) {
        if (list == null) {
            return;
        }
        int b = b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        c(parcel, b);
    }

    public static void s(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        a(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void t(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        a(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void u(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int b = b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        c(parcel, b);
    }

    public static void v(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeStringArray(strArr);
        c(parcel, b);
    }

    public static void w(Parcel parcel, int i, List<String> list) {
        if (list == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeStringList(list);
        c(parcel, b);
    }

    public static <T extends Parcelable> void x(Parcel parcel, int i, T[] tArr, int i2) {
        if (tArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                z(parcel, t, i2);
            }
        }
        c(parcel, b);
    }

    public static <T extends Parcelable> void y(Parcel parcel, int i, List<T> list) {
        if (list == null) {
            return;
        }
        int b = b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                z(parcel, t, 0);
            }
        }
        c(parcel, b);
    }

    private static <T extends Parcelable> void z(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
