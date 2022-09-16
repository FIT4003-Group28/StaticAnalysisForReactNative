package defpackage;
/* compiled from: PG */
/* renamed from: cib  reason: default package */
/* loaded from: classes2.dex */
public final class cib {
    private static final cia e = new chz();
    public final Object a;
    public final cia b;
    public final String c;
    public volatile byte[] d;

    private cib(String str, Object obj, cia ciaVar) {
        hy.P(str);
        this.c = str;
        this.a = obj;
        hy.N(ciaVar);
        this.b = ciaVar;
    }

    public static cib a(String str, Object obj, cia ciaVar) {
        return new cib(str, obj, ciaVar);
    }

    public static cib b(String str) {
        return new cib(str, null, e);
    }

    public static cib c(String str, Object obj) {
        return new cib(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cib) {
            return this.c.equals(((cib) obj).c);
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
        sb.append("'}");
        return sb.toString();
    }
}
