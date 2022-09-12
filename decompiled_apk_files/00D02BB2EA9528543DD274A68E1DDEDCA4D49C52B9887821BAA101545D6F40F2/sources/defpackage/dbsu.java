package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbsu  reason: default package */
/* loaded from: classes.dex */
public final class dbsu<T> extends dbsg<T> {
    private static final long serialVersionUID = 0;
    public final T a;

    public dbsu(T t) {
        this.a = t;
    }

    @Override // defpackage.dbsg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.dbsg
    public final T b() {
        return this.a;
    }

    @Override // defpackage.dbsg
    public final T c(T t) {
        dbsk.t(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // defpackage.dbsg
    public final dbsg<T> d(dbsg<? extends T> dbsgVar) {
        dbsk.s(dbsgVar);
        return this;
    }

    @Override // defpackage.dbsg
    public final T e(dbty<? extends T> dbtyVar) {
        dbsk.s(dbtyVar);
        return this.a;
    }

    @Override // defpackage.dbsg
    public final boolean equals(Object obj) {
        if (obj instanceof dbsu) {
            return this.a.equals(((dbsu) obj).a);
        }
        return false;
    }

    @Override // defpackage.dbsg
    public final T f() {
        return this.a;
    }

    @Override // defpackage.dbsg
    public final Set<T> g() {
        return Collections.singleton(this.a);
    }

    @Override // defpackage.dbsg
    public final <V> dbsg<V> h(dbrn<? super T, V> dbrnVar) {
        V a = dbrnVar.a((T) this.a);
        dbsk.t(a, "the Function passed to Optional.transform() must not return null.");
        return new dbsu(a);
    }

    @Override // defpackage.dbsg
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.dbsg
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
