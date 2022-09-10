package defpackage;

import android.os.Parcel;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cybp  reason: default package */
/* loaded from: classes5.dex */
public final class cybp {
    public static <T extends Enum<T>> void a(Parcel parcel, Collection<T> collection) {
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (T t : collection) {
            iArr[i] = t.ordinal();
            i++;
        }
        parcel.writeIntArray(iArr);
    }

    public static <T extends dsrb> void b(Parcel parcel, Collection<T> collection) {
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (T t : collection) {
            iArr[i] = t.a();
            i++;
        }
        parcel.writeIntArray(iArr);
    }

    public static <T extends Enum<T>> dcdc<T> c(Parcel parcel, Class<T> cls) {
        int[] createIntArray = parcel.createIntArray();
        dccx F = dcdc.F();
        for (int i : createIntArray) {
            F.g(cls.getEnumConstants()[i]);
        }
        return F.f();
    }

    public static <T extends dsrb> dcdc<T> d(Parcel parcel, dsrc<T> dsrcVar) {
        int[] createIntArray = parcel.createIntArray();
        dccx F = dcdc.F();
        for (int i : createIntArray) {
            F.g(dsrcVar.a(i));
        }
        return F.f();
    }
}
