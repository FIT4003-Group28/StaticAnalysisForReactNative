package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cjp  reason: default package */
/* loaded from: classes.dex */
public final class cjp {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private cjp() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        String valueOf = String.valueOf(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String valueOf2 = String.valueOf(bitmap.getConfig());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(valueOf);
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(valueOf2);
        throw new IllegalStateException(sb.toString());
    }

    public static boolean b(int i, int i2) {
        return m(i) && m(i2);
    }

    public static void c(Runnable runnable) {
        d().post(runnable);
    }

    public static Handler d() {
        if (c == null) {
            synchronized (cjp.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static void e() {
        if (f()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean g() {
        return !f();
    }

    public static <T> Queue<T> h(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int k(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int l(Object obj, int i) {
        return k(obj == null ? 0 : obj.hashCode(), i);
    }

    private static boolean m(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }
}
