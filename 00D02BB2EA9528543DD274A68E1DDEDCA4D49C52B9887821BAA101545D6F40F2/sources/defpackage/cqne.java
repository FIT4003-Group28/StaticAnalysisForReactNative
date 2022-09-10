package defpackage;
/* compiled from: PG */
/* renamed from: cqne  reason: default package */
/* loaded from: classes.dex */
public final class cqne {
    public static <V extends cqkp, T> cqjb<V, T> a(T t) {
        return new cqnc(t);
    }

    public static <V extends cqkp, T> cqjb<V, T> b(T t) {
        Object f = t != null ? cqny.f(t) : null;
        if (f == null) {
            return a(t);
        }
        if (f instanceof cqjb) {
            return (cqjb) f;
        }
        if (f instanceof cqnx) {
            return new cqnd((cqnx) f);
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Can't handle: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
