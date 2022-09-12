package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbro  reason: default package */
/* loaded from: classes5.dex */
final class dbro<E> implements Serializable, dbrn {
    private static final long serialVersionUID = 0;
    private final E a;

    public dbro(E e) {
        this.a = e;
    }

    @Override // defpackage.dbrn
    public final E a(Object obj) {
        return this.a;
    }

    @Override // defpackage.dbrn
    public final boolean equals(Object obj) {
        if (obj instanceof dbro) {
            return dbsd.a(this.a, ((dbro) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        E e = this.a;
        if (e == null) {
            return 0;
        }
        return e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Functions.constant(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
