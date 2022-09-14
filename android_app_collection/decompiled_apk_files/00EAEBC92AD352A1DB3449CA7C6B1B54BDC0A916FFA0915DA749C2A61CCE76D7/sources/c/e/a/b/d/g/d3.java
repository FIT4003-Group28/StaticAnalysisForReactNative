package c.e.a.b.d.g;

import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes.dex */
final class d3<T> implements z2<T>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final T f4100b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d3(T t) {
        this.f4100b = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d3) {
            T t = this.f4100b;
            T t2 = ((d3) obj).f4100b;
            if (t == t2) {
                return true;
            }
            return t != null && t.equals(t2);
        }
        return false;
    }

    @Override // c.e.a.b.d.g.z2
    public final T f() {
        return this.f4100b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4100b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4100b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
