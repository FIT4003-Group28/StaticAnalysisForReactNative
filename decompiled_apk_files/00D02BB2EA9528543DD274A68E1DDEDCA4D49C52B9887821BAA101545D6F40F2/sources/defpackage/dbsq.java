package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbsq  reason: default package */
/* loaded from: classes5.dex */
final class dbsq<T> implements Serializable, dbsl {
    private static final long serialVersionUID = 0;
    private final T a;

    public dbsq(T t) {
        this.a = t;
    }

    @Override // defpackage.dbsl
    public final boolean a(T t) {
        return this.a.equals(t);
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        if (obj instanceof dbsq) {
            return this.a.equals(((dbsq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Predicates.equalTo(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
