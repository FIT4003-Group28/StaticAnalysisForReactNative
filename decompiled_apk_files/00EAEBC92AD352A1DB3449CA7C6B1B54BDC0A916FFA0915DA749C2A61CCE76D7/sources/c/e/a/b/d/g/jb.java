package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class jb implements gb {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4241a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4242b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<Boolean> f4243c;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4241a = r2Var.a("measurement.client.global_params.dev", false);
        f4242b = r2Var.a("measurement.service.global_params_in_payload", true);
        f4243c = r2Var.a("measurement.service.global_params", false);
    }

    @Override // c.e.a.b.d.g.gb
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.gb
    public final boolean j() {
        return f4241a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.gb
    public final boolean k() {
        return f4243c.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.gb
    public final boolean l() {
        return f4242b.b().booleanValue();
    }
}
