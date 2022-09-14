package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class vb implements sb {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4482a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4483b;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4482a = r2Var.a("measurement.sdk.screen.manual_screen_view_logging", true);
        f4483b = r2Var.a("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // c.e.a.b.d.g.sb
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.sb
    public final boolean j() {
        return f4482a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.sb
    public final boolean l() {
        return f4483b.b().booleanValue();
    }
}
