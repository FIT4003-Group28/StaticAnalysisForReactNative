package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueItem;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: tqj  reason: default package */
/* loaded from: classes4.dex */
public class tqj {
    public static void A(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int an = an(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        n(parcel, an);
    }

    public static void B(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        r(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void C(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeLongArray(jArr);
        n(parcel, an);
    }

    public static void D(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        r(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void E(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int an = an(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        n(parcel, an);
    }

    public static void F(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeString(str);
        n(parcel, an);
    }

    public static void G(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeStringArray(strArr);
        n(parcel, an);
    }

    public static void H(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeStringList(list);
        n(parcel, an);
    }

    public static void I(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                ao(parcel, parcelable, i2);
            }
        }
        n(parcel, an);
    }

    public static void J(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int an = an(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                ao(parcel, parcelable, 0);
            }
        }
        n(parcel, an);
    }

    public static double K(Parcel parcel, int i) {
        ap(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float L(Parcel parcel, int i) {
        ap(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int M(int i) {
        return (char) i;
    }

    public static int N(Parcel parcel) {
        return parcel.readInt();
    }

    public static int O(Parcel parcel, int i) {
        ap(parcel, i, 4);
        return parcel.readInt();
    }

    public static int P(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int Q(Parcel parcel) {
        int readInt = parcel.readInt();
        int P = P(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (M(readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new qxz(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = P + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new qxz(sb.toString(), parcel);
    }

    public static long R(Parcel parcel, int i) {
        ap(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle S(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + P);
        return readBundle;
    }

    public static IBinder T(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + P);
        return readStrongBinder;
    }

    public static Parcelable U(Parcel parcel, int i, Parcelable.Creator creator) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + P);
        return parcelable;
    }

    public static Boolean V(Parcel parcel, int i) {
        int P = P(parcel, i);
        if (P == 0) {
            return null;
        }
        al(parcel, P, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Integer W(Parcel parcel, int i) {
        int P = P(parcel, i);
        if (P == 0) {
            return null;
        }
        al(parcel, P, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long X(Parcel parcel, int i) {
        int P = P(parcel, i);
        if (P == 0) {
            return null;
        }
        al(parcel, P, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String Y(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + P);
        return readString;
    }

    public static ArrayList Z(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + P);
        return arrayList;
    }

    public static ArrayList aa(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + P);
        return createStringArrayList;
    }

    public static ArrayList ab(Parcel parcel, int i, Parcelable.Creator creator) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + P);
        return createTypedArrayList;
    }

    public static void ac(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new qxz(sb.toString(), parcel);
    }

    public static void ad(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + P(parcel, i));
    }

    public static boolean ae(Parcel parcel, int i) {
        ap(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] af(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + P);
        return createByteArray;
    }

    public static int[] ag(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + P);
        return createIntArray;
    }

    public static long[] ah(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + P);
        return createLongArray;
    }

    public static Object[] ai(Parcel parcel, int i, Parcelable.Creator creator) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + P);
        return createTypedArray;
    }

    public static String[] aj(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + P);
        return createStringArray;
    }

    public static byte[][] ak(Parcel parcel, int i) {
        int P = P(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (P == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + P);
        return bArr;
    }

    public static void al(Parcel parcel, int i, int i2) {
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
        throw new qxz(sb.toString(), parcel);
    }

    public static int am(String str) {
        try {
            Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    private static int an(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void ao(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void ap(Parcel parcel, int i, int i2) {
        int P = P(parcel, i);
        if (P == i2) {
            return;
        }
        String hexString = Integer.toHexString(P);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(P);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new qxz(sb.toString(), parcel);
    }

    public static int i(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int j(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static angg l(tng tngVar, boolean z) {
        List b = tngVar.b();
        for (int i = !z ? 1 : 0; i < b.size(); i++) {
            tmh tmhVar = (tmh) b.get(i);
            angf angfVar = tmhVar.d;
            if (angfVar == null) {
                angfVar = angf.a;
            }
            if ((angfVar.b & 2048) != 0) {
                angf angfVar2 = tmhVar.d;
                if (angfVar2 == null) {
                    angfVar2 = angf.a;
                }
                angg anggVar = angfVar2.e;
                return anggVar == null ? angg.a : anggVar;
            }
        }
        return null;
    }

    public static int m(Parcel parcel) {
        return an(parcel, 20293);
    }

    public static void n(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void o(Parcel parcel, int i, boolean z) {
        r(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void p(Parcel parcel, int i, double d) {
        r(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void q(Parcel parcel, int i, float f) {
        r(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void r(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void s(Parcel parcel, int i, int i2) {
        r(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void t(Parcel parcel, int i, long j) {
        r(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void u(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        r(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void v(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeBundle(bundle);
        n(parcel, an);
    }

    public static void w(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeByteArray(bArr);
        n(parcel, an);
    }

    public static void x(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        n(parcel, an);
    }

    public static void y(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeStrongBinder(iBinder);
        n(parcel, an);
    }

    public static void z(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int an = an(parcel, i);
        parcel.writeIntArray(iArr);
        n(parcel, an);
    }

    public void a(int[] iArr) {
        throw null;
    }

    public void b(int[] iArr, int i) {
        throw null;
    }

    public void c(MediaQueueItem[] mediaQueueItemArr) {
        throw null;
    }

    public void d(int[] iArr) {
        throw null;
    }

    public void e(List list, List list2, int i) {
        throw null;
    }

    public void f(int[] iArr) {
        throw null;
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }
}
