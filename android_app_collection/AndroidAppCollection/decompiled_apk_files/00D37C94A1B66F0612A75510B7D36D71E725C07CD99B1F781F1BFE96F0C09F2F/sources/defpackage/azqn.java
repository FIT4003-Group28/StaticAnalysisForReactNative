package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: azqn  reason: default package */
/* loaded from: classes2.dex */
public final class azqn {
    private azqn() {
    }

    public static final List a(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static void b() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List c(Iterable iterable) {
        iterable.getClass();
        int size = iterable.size();
        if (size != 0) {
            if (size != 1) {
                return new ArrayList((Collection) iterable);
            }
            return a(iterable.get(0));
        }
        return azqp.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(Iterable iterable) {
        return iterable.size();
    }

    public static void e(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            if (obj == null || (obj instanceof CharSequence)) {
                appendable.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
            } else {
                appendable.append(String.valueOf(obj));
            }
        }
        appendable.append(charSequence3);
    }

    public static List f(Object[] objArr) {
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void g(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static /* synthetic */ void h(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static Status i(int i, Parcel parcel) {
        Status fromCodeValue = Status.fromCodeValue((i >> 16) & PrivateKeyType.INVALID);
        return (i & 32) != 0 ? fromCodeValue.withDescription(parcel.readString()) : fromCodeValue;
    }

    public static void j(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean k(int i, int i2) {
        return (i & i2) != 0;
    }
}
