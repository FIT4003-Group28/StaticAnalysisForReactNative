package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnwm  reason: default package */
/* loaded from: classes.dex */
public final class cnwm {
    public static <T> ArrayList<T> A(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + c);
        return createTypedArrayList;
    }

    public static void B(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new cnwl(sb.toString(), parcel);
    }

    public static void C(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new cnwl(sb.toString(), parcel);
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int b(int i) {
        return (char) i;
    }

    public static int c(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void d(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + c(parcel, i));
    }

    public static void e(Parcel parcel, int i, int i2) {
        int c = c(parcel, i);
        if (c == i2) {
            return;
        }
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(c);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new cnwl(sb.toString(), parcel);
    }

    public static int f(Parcel parcel) {
        int readInt = parcel.readInt();
        int c = c(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (b(readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new cnwl(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = c + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new cnwl(sb.toString(), parcel);
    }

    public static boolean g(Parcel parcel, int i) {
        e(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte h(Parcel parcel, int i) {
        e(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int i(Parcel parcel, int i) {
        e(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer j(Parcel parcel, int i) {
        int c = c(parcel, i);
        if (c == 0) {
            return null;
        }
        C(parcel, c, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long k(Parcel parcel, int i) {
        e(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long l(Parcel parcel, int i) {
        int c = c(parcel, i);
        if (c == 0) {
            return null;
        }
        C(parcel, c, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float m(Parcel parcel, int i) {
        e(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double n(Parcel parcel, int i) {
        e(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String o(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + c);
        return readString;
    }

    public static IBinder p(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + c);
        return readStrongBinder;
    }

    public static <T extends Parcelable> T q(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + c);
        return createFromParcel;
    }

    public static Bundle r(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + c);
        return readBundle;
    }

    public static byte[] s(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + c);
        return createByteArray;
    }

    public static byte[][] t(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + c);
        return bArr;
    }

    public static int[] u(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + c);
        return createIntArray;
    }

    public static float[] v(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + c);
        return createFloatArray;
    }

    public static String[] w(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + c);
        return createStringArray;
    }

    public static ArrayList<Integer> x(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + c);
        return arrayList;
    }

    public static ArrayList<String> y(Parcel parcel, int i) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + c);
        return createStringArrayList;
    }

    public static <T> T[] z(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int c = c(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (c == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + c);
        return tArr;
    }
}
