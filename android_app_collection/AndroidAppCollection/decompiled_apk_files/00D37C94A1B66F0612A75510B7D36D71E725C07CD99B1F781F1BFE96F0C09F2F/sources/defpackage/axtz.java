package defpackage;
/* compiled from: PG */
/* renamed from: axtz  reason: default package */
/* loaded from: classes2.dex */
public final class axtz implements axty {
    public static final vbt a;
    public static final vbt b;
    public static final vbt c;
    public static final vbt d;
    public static final vbt e;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.test.boolean_flag", false);
        b = vbrVar.c("measurement.test.double_flag", -3.0d);
        c = vbrVar.d("measurement.test.int_flag", -2L);
        d = vbrVar.d("measurement.test.long_flag", -1L);
        e = vbrVar.e("measurement.test.string_flag", "---");
    }

    @Override // defpackage.axty
    public final double a() {
        return ((Double) b.c()).doubleValue();
    }

    @Override // defpackage.axty
    public final long b() {
        return ((Long) c.c()).longValue();
    }

    @Override // defpackage.axty
    public final long c() {
        return ((Long) d.c()).longValue();
    }

    @Override // defpackage.axty
    public final String d() {
        return (String) e.c();
    }

    @Override // defpackage.axty
    public final boolean e() {
        return ((Boolean) a.c()).booleanValue();
    }
}
