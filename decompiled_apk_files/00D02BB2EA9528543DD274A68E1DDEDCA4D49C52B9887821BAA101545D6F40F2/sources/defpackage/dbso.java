package defpackage;

import java.io.Serializable;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dbso  reason: default package */
/* loaded from: classes5.dex */
public final class dbso<T> implements Serializable, dbsl {
    private static final long serialVersionUID = 0;
    private final Collection<?> a;

    public dbso(Collection<?> collection) {
        dbsk.s(collection);
        this.a = collection;
    }

    @Override // defpackage.dbsl
    public final boolean a(T t) {
        try {
            return this.a.contains(t);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        if (obj instanceof dbso) {
            return this.a.equals(((dbso) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Predicates.in(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
