package defpackage;
/* compiled from: PG */
/* renamed from: dbrl  reason: default package */
/* loaded from: classes.dex */
public abstract class dbrl<T> {
    protected abstract int a(T t);

    protected abstract boolean b(T t, T t2);

    public final boolean c(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t != null && t2 != null) {
            return b(t, t2);
        }
        return false;
    }

    public final int d(T t) {
        if (t == null) {
            return 0;
        }
        return a(t);
    }
}
