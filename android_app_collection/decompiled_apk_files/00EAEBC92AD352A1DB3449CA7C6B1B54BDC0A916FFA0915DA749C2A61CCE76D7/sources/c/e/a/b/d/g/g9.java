package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class g9 implements h9 {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4168a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4169b;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4168a = r2Var.a("measurement.service.configurable_service_limits", false);
        f4169b = r2Var.a("measurement.client.configurable_service_limits", false);
        r2Var.a("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // c.e.a.b.d.g.h9
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.h9
    public final boolean j() {
        return f4168a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.h9
    public final boolean l() {
        return f4169b.b().booleanValue();
    }
}
