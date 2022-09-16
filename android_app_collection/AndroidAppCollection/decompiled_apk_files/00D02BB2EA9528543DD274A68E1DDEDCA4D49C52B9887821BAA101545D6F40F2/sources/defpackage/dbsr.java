package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbsr  reason: default package */
/* loaded from: classes5.dex */
final class dbsr<T> implements Serializable, dbsl {
    private static final long serialVersionUID = 0;
    final dbsl<T> a;

    public dbsr(dbsl<T> dbslVar) {
        dbsk.s(dbslVar);
        this.a = dbslVar;
    }

    @Override // defpackage.dbsl
    public final boolean a(T t) {
        return !this.a.a(t);
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        if (obj instanceof dbsr) {
            return this.a.equals(((dbsr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-1);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Predicates.not(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
