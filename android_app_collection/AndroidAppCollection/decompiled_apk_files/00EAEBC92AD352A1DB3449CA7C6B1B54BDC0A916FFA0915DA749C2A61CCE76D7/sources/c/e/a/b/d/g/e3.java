package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class e3<T> implements z2<T> {

    /* renamed from: b  reason: collision with root package name */
    private volatile z2<T> f4120b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f4121c;

    /* renamed from: d  reason: collision with root package name */
    private T f4122d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e3(z2<T> z2Var) {
        x2.a(z2Var);
        this.f4120b = z2Var;
    }

    @Override // c.e.a.b.d.g.z2
    public final T f() {
        if (!this.f4121c) {
            synchronized (this) {
                if (!this.f4121c) {
                    T f2 = this.f4120b.f();
                    this.f4122d = f2;
                    this.f4121c = true;
                    this.f4120b = null;
                    return f2;
                }
            }
        }
        return this.f4122d;
    }

    public final String toString() {
        Object obj = this.f4120b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f4122d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
