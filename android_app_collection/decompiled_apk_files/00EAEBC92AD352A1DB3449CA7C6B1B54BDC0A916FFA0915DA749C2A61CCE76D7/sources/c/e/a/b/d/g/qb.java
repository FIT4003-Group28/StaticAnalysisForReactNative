package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class qb implements rb {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4376a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4377b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<Boolean> f4378c;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        r2Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f4376a = r2Var.a("measurement.lifecycle.app_backgrounded_engagement", false);
        f4377b = r2Var.a("measurement.lifecycle.app_backgrounded_tracking", true);
        f4378c = r2Var.a("measurement.lifecycle.app_in_background_parameter", false);
        r2Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // c.e.a.b.d.g.rb
    public final boolean f() {
        return f4376a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.rb
    public final boolean j() {
        return f4377b.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.rb
    public final boolean l() {
        return f4378c.b().booleanValue();
    }
}
