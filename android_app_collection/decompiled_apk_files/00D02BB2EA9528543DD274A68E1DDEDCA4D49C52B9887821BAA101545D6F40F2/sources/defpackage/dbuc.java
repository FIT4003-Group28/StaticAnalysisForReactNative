package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbuc  reason: default package */
/* loaded from: classes.dex */
public final class dbuc<T> implements Serializable, dbty {
    private static final long serialVersionUID = 0;
    public final T a;

    public dbuc(T t) {
        this.a = t;
    }

    @Override // defpackage.dbty
    public final T a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dbuc) {
            return dbsd.a(this.a, ((dbuc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
