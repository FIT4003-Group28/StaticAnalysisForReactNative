package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class u8 implements v8 {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4453a;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4453a = r2Var.a("measurement.androidId.delete_feature", true);
        r2Var.a("measurement.log_androidId_enabled", false);
    }

    @Override // c.e.a.b.d.g.v8
    public final boolean f() {
        return f4453a.b().booleanValue();
    }
}
