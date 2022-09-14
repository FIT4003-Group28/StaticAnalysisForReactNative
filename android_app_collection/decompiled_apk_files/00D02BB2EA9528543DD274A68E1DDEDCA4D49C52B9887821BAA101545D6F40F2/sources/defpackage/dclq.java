package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dclq  reason: default package */
/* loaded from: classes.dex */
public final class dclq {
    public static <T> T[] a(Class<T> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
    }

    public static <T> T[] b(T[] tArr, T[] tArr2, Class<T> cls) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) a(cls, length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static <T> T[] c(T t, T[] tArr) {
        int length = tArr.length;
        T[] tArr2 = (T[]) dclv.a(tArr, length + 1);
        tArr2[0] = t;
        System.arraycopy(tArr, 0, tArr2, 1, length);
        return tArr2;
    }

    public static <T> T[] d(T[] tArr, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        return tArr2;
    }

    public static <T> T[] e(Collection collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) dclv.a(tArr, size);
        }
        j(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] f(Collection<?> collection) {
        Object[] objArr = new Object[collection.size()];
        j(collection, objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj, int i) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            g(objArr[i2], i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object... objArr) {
        h(objArr, objArr.length);
    }

    private static void j(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }
}
