package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbsp  reason: default package */
/* loaded from: classes5.dex */
final class dbsp implements Serializable, dbsl {
    private static final long serialVersionUID = 0;
    private final Class<?> a;

    public dbsp(Class<?> cls) {
        this.a = cls;
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        return (obj instanceof dbsp) && this.a == ((dbsp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String name = this.a.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
        sb.append("Predicates.instanceOf(");
        sb.append(name);
        sb.append(")");
        return sb.toString();
    }
}
