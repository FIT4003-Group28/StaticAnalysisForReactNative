package c.e.a.b.d.g;
/* loaded from: classes.dex */
public class t5 {

    /* renamed from: a  reason: collision with root package name */
    private volatile k6 f4425a;

    /* renamed from: b  reason: collision with root package name */
    private volatile v3 f4426b;

    static {
        p4.a();
    }

    private final k6 b(k6 k6Var) {
        if (this.f4425a == null) {
            synchronized (this) {
                if (this.f4425a == null) {
                    try {
                        this.f4425a = k6Var;
                        this.f4426b = v3.f4474c;
                    } catch (j5 unused) {
                        this.f4425a = k6Var;
                        this.f4426b = v3.f4474c;
                    }
                }
            }
        }
        return this.f4425a;
    }

    public final int a() {
        if (this.f4426b != null) {
            return this.f4426b.f();
        }
        if (this.f4425a == null) {
            return 0;
        }
        return this.f4425a.b();
    }

    public final k6 a(k6 k6Var) {
        k6 k6Var2 = this.f4425a;
        this.f4426b = null;
        this.f4425a = k6Var;
        return k6Var2;
    }

    public final v3 b() {
        if (this.f4426b != null) {
            return this.f4426b;
        }
        synchronized (this) {
            if (this.f4426b != null) {
                return this.f4426b;
            }
            this.f4426b = this.f4425a == null ? v3.f4474c : this.f4425a.d();
            return this.f4426b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        k6 k6Var = this.f4425a;
        k6 k6Var2 = t5Var.f4425a;
        return (k6Var == null && k6Var2 == null) ? b().equals(t5Var.b()) : (k6Var == null || k6Var2 == null) ? k6Var != null ? k6Var.equals(t5Var.b(k6Var.a())) : b(k6Var2.a()).equals(k6Var2) : k6Var.equals(k6Var2);
    }

    public int hashCode() {
        return 1;
    }
}
