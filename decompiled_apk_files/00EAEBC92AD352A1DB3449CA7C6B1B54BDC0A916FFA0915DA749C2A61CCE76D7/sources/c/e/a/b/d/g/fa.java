package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class fa implements ga {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4158a;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4158a = r2Var.a("measurement.sdk.referrer.delayed_install_referrer_api", false);
        r2Var.a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // c.e.a.b.d.g.ga
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.ga
    public final boolean j() {
        return f4158a.b().booleanValue();
    }
}
