package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcbb  reason: default package */
/* loaded from: classes5.dex */
public final class dcbb<T> extends dclu<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final dcdn<T, Integer> a;

    public dcbb(dcdn<T, Integer> dcdnVar) {
        this.a = dcdnVar;
    }

    private final int q(T t) {
        Integer num = this.a.get(t);
        if (num != null) {
            return num.intValue();
        }
        throw new dclt(t);
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(T t, T t2) {
        return q(t) - q(t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj instanceof dcbb) {
            return this.a.equals(((dcbb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a.keySet());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Ordering.explicit(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
