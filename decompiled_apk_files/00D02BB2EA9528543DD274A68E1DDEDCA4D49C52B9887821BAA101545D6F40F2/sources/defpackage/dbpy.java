package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbpy  reason: default package */
/* loaded from: classes.dex */
public final class dbpy<T> extends dbsg<T> {
    public static final dbpy<Object> a = new dbpy<>();
    private static final long serialVersionUID = 0;

    private dbpy() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dbsg
    public final boolean a() {
        return false;
    }

    @Override // defpackage.dbsg
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.dbsg
    public final T c(T t) {
        dbsk.t(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbsg
    public final dbsg<T> d(dbsg<? extends T> dbsgVar) {
        dbsk.s(dbsgVar);
        return dbsgVar;
    }

    @Override // defpackage.dbsg
    public final T e(dbty<? extends T> dbtyVar) {
        T a2 = dbtyVar.a();
        dbsk.t(a2, "use Optional.orNull() instead of a Supplier that returns null");
        return a2;
    }

    @Override // defpackage.dbsg
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.dbsg
    public final T f() {
        return null;
    }

    @Override // defpackage.dbsg
    public final Set<T> g() {
        return Collections.emptySet();
    }

    @Override // defpackage.dbsg
    public final <V> dbsg<V> h(dbrn<? super T, V> dbrnVar) {
        dbsk.s(dbrnVar);
        return a;
    }

    @Override // defpackage.dbsg
    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.dbsg
    public final String toString() {
        return "Optional.absent()";
    }
}
