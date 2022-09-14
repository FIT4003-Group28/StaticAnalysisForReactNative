package com.google.android.gms.common.internal.x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.x.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int a(int i) {
        return i & 65535;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static Bundle a(Parcel parcel, int i) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + n);
        return readBundle;
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + n);
        return createFromParcel;
    }

    private static void a(Parcel parcel, int i, int i2) {
        int n = n(parcel, i);
        if (n == i2) {
            return;
        }
        String hexString = Integer.toHexString(n);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(n);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    private static void a(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    public static int b(Parcel parcel) {
        int a2 = a(parcel);
        int n = n(parcel, a2);
        int dataPosition = parcel.dataPosition();
        if (a(a2) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a2));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = n + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static String b(Parcel parcel, int i) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + n);
        return readString;
    }

    public static <T> T[] b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + n);
        return tArr;
    }

    public static ArrayList<String> c(Parcel parcel, int i) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + n);
        return createStringArrayList;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + n);
        return createTypedArrayList;
    }

    public static void d(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    public static boolean e(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean f(Parcel parcel, int i) {
        int n = n(parcel, i);
        if (n == 0) {
            return null;
        }
        a(parcel, i, n, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double g(Parcel parcel, int i) {
        int n = n(parcel, i);
        if (n == 0) {
            return null;
        }
        a(parcel, i, n, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float h(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float i(Parcel parcel, int i) {
        int n = n(parcel, i);
        if (n == 0) {
            return null;
        }
        a(parcel, i, n, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder j(Parcel parcel, int i) {
        int n = n(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (n == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + n);
        return readStrongBinder;
    }

    public static int k(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long l(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long m(Parcel parcel, int i) {
        int n = n(parcel, i);
        if (n == 0) {
            return null;
        }
        a(parcel, i, n, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int n(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void o(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + n(parcel, i));
    }
}
