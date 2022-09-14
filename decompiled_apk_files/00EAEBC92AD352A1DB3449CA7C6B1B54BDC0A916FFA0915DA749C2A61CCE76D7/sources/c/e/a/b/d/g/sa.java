package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class sa implements ta {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4409a;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4409a = r2Var.a("measurement.client.sessions.check_on_reset_and_enable2", true);
        r2Var.a("measurement.client.sessions.check_on_startup", true);
        r2Var.a("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // c.e.a.b.d.g.ta
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.ta
    public final boolean j() {
        return f4409a.b().booleanValue();
    }
}
