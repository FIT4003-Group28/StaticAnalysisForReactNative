package c.e.a.b.d.e;
/* loaded from: classes.dex */
public final class m {
    public static int a(int i, int i2) {
        String a2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a2 = t.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                a2 = t.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a2);
        }
        return i;
    }

    public static int a(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, str));
        }
        return i;
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? b(i, i3, "start index") : (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : t.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static int b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, "index"));
        }
        return i;
    }

    private static String b(int i, int i2, String str) {
        if (i < 0) {
            return t.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return t.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
