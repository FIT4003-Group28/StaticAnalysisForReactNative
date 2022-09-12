package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: dbsm  reason: default package */
/* loaded from: classes5.dex */
final class dbsm<T> implements Serializable, dbsl {
    private static final long serialVersionUID = 0;
    private final List<? extends dbsl<? super T>> a;

    public dbsm(List<? extends dbsl<? super T>> list) {
        this.a = list;
    }

    @Override // defpackage.dbsl
    public final boolean a(T t) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!this.a.get(i).a(t)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        if (obj instanceof dbsm) {
            return this.a.equals(((dbsm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends dbsl<? super T>> list = this.a;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and");
        sb.append('(');
        boolean z = true;
        for (T t : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
