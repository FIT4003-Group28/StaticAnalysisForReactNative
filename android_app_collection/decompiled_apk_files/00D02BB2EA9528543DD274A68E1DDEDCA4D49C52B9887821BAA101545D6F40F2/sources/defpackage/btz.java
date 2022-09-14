package defpackage;
/* compiled from: PG */
/* renamed from: btz  reason: default package */
/* loaded from: classes.dex */
public final class btz<T> {
    private static final bty<Object> e = new btx();
    public final T a;
    public final bty<T> b;
    public final String c;
    public volatile byte[] d;

    private btz(String str, T t, bty<T> btyVar) {
        cjn.c(str);
        this.c = str;
        this.a = t;
        cjn.b(btyVar);
        this.b = btyVar;
    }

    public static <T> btz<T> a(String str) {
        return new btz<>(str, null, e);
    }

    public static <T> btz<T> b(String str, T t) {
        return new btz<>(str, t, e);
    }

    public static <T> btz<T> c(String str, T t, bty<T> btyVar) {
        return new btz<>(str, t, btyVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btz) {
            return this.c.equals(((btz) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Option{key='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
