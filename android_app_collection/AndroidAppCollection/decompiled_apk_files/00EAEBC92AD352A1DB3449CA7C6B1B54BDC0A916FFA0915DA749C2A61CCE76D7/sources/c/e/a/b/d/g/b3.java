package c.e.a.b.d.g;

import java.io.Serializable;
/* loaded from: classes.dex */
final class b3<T> implements z2<T>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final z2<T> f4058b;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient boolean f4059c;

    /* renamed from: d  reason: collision with root package name */
    private transient T f4060d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b3(z2<T> z2Var) {
        x2.a(z2Var);
        this.f4058b = z2Var;
    }

    @Override // c.e.a.b.d.g.z2
    public final T f() {
        if (!this.f4059c) {
            synchronized (this) {
                if (!this.f4059c) {
                    T f2 = this.f4058b.f();
                    this.f4060d = f2;
                    this.f4059c = true;
                    return f2;
                }
            }
        }
        return this.f4060d;
    }

    public final String toString() {
        Object obj;
        if (this.f4059c) {
            String valueOf = String.valueOf(this.f4060d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f4058b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
