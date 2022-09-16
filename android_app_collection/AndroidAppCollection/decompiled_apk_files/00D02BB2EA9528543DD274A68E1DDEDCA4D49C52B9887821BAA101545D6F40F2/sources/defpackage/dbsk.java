package defpackage;
/* compiled from: PG */
/* renamed from: dbsk  reason: default package */
/* loaded from: classes.dex */
public final class dbsk {
    private static String A(int i, int i2, String str) {
        if (i < 0) {
            return dbtx.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return dbtx.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, objArr));
    }

    public static void d(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, Character.valueOf(c)));
    }

    public static void e(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, Integer.valueOf(i)));
    }

    public static void f(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, Long.valueOf(j)));
    }

    public static void g(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, obj));
    }

    public static void h(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void i(boolean z, String str, long j, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, Long.valueOf(j), obj));
    }

    public static void j(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, obj, obj2));
    }

    public static void k(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(dbtx.b(str, obj, obj2, obj3));
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void n(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(dbtx.b(str, Integer.valueOf(i)));
    }

    public static void o(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(dbtx.b(str, Long.valueOf(j)));
    }

    public static void p(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(dbtx.b(str, obj));
    }

    public static void q(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(dbtx.b(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void r(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(dbtx.b(str, obj, obj2));
    }

    public static <T> T s(T t) {
        t.getClass();
        return t;
    }

    public static <T> T t(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> void w(T t, String str, Object obj) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(dbtx.b(str, obj));
    }

    public static <T> void x(T t, String str, Object obj, Object obj2) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(dbtx.b(str, obj, obj2));
    }

    public static void y(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(A(i, i2, "index"));
        }
    }

    public static void z(int i, int i2) {
        v(i, i2, "index");
    }

    public static void u(int i, int i2, int i3) {
        String A;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                A = A(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                A = A(i2, i3, "end index");
            } else {
                A = dbtx.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(A);
        }
    }

    public static void v(int i, int i2, String str) {
        String b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                b = dbtx.b("%s (%s) must not be negative", str, Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                b = dbtx.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(b);
        }
    }
}
