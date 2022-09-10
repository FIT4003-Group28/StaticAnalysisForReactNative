package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ivw  reason: default package */
/* loaded from: classes.dex */
public abstract class ivw implements jar {
    protected jaq b;
    private final Context e;
    private cqtd f;
    private cqtd g;
    private String h;
    @dzsi
    private cjtd i;
    private boolean j;
    private final int k;
    private ivv l;
    private cqtd m;
    private static final cqfc c = gwu.f(true);
    private static final cqfc d = gwu.f(false);
    static double a = -1.0d;

    public ivw(Context context, ivu ivuVar, jaq jaqVar, cqtd cqtdVar, String str, @dzsi cjtd cjtdVar, boolean z, int i) {
        this(context, ivuVar, jaqVar, cqtdVar, str, cjtdVar, z, i, ivv.FULL);
    }

    private final void g() {
        cqss cqssVar = this.b.q;
        this.g = cqssVar != null ? cqrt.j(this.f, cqssVar) : this.f;
    }

    @Override // defpackage.jar
    public Boolean A() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.jar
    public Float B() {
        return Float.valueOf(0.0f);
    }

    @Override // defpackage.jar
    public Integer C() {
        return Integer.valueOf(this.k);
    }

    public void D(jaq jaqVar) {
        if (jaqVar != this.b) {
            this.b = jaqVar;
            g();
        }
    }

    public void E(String str) {
        this.h = str;
    }

    public void F(@dzsi cjtd cjtdVar) {
        this.i = cjtdVar;
    }

    public void G(cqtd cqtdVar) {
        if (!dbsd.a(this.f, cqtdVar)) {
            this.f = cqtdVar;
            g();
        }
    }

    public void H(boolean z) {
        if (z != this.j) {
            this.j = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.jar
    public Integer I() {
        return 8388613;
    }

    @Override // defpackage.jar
    public cqfc J() {
        return A().booleanValue() ? c : d;
    }

    public void K(ivv ivvVar) {
        this.l = ivvVar;
    }

    @Override // defpackage.jar
    public cqss L() {
        return ibl.a();
    }

    @Override // defpackage.jar
    public cqss M() {
        return ibl.a();
    }

    protected boolean NE() {
        return true;
    }

    @Override // defpackage.jar
    public Boolean NF() {
        return false;
    }

    @Override // defpackage.jar
    public Float NG() {
        return Float.valueOf(1.0f);
    }

    @Override // defpackage.jar
    public Boolean b() {
        return false;
    }

    @Override // defpackage.jar
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.jar
    public cqtv m() {
        ivu ivuVar = ivu.FIXED;
        ivv ivvVar = ivv.FULL;
        int ordinal = this.l.ordinal();
        return cqrp.d(ordinal != 1 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 64 : 40 : 46 : 48 : 56);
    }

    @Override // defpackage.jar
    public Boolean n() {
        return Boolean.valueOf(this.l == ivv.MOD_MINI);
    }

    @Override // defpackage.jar
    public Boolean o() {
        return true;
    }

    @Override // defpackage.jar
    public Boolean p() {
        return true;
    }

    @Override // defpackage.jar
    public Boolean q() {
        return false;
    }

    @Override // defpackage.jar
    public cqtd r() {
        return this.g;
    }

    @Override // defpackage.jar
    public cqtv s() {
        return m();
    }

    @Override // defpackage.jar
    public Boolean t() {
        return false;
    }

    @Override // defpackage.jar
    public cqtd u() {
        if (NE()) {
            if (this.m == null) {
                this.m = v(this.b.p);
            }
            return this.m;
        }
        return this.b.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqtd v(cqtd cqtdVar) {
        cqtd cqtdVar2;
        cqtd i = cqrt.i(gdj.e, ibl.A());
        if (a <= dcyn.a) {
            a = cqtdVar2.a(this.e).getIntrinsicWidth();
        }
        float a2 = m().a(this.e);
        double d2 = a;
        double d3 = a2;
        Double.isNaN(d3);
        cqrp d4 = cqrp.d((d2 / d3) * 1.4d);
        return iva.e(cqtdVar, cqtt.d(i, cqtt.e(cqtdVar, d4, d4, d4, d4)));
    }

    @Override // defpackage.jar
    public cqtd w() {
        ivu ivuVar = ivu.FIXED;
        ivv ivvVar = ivv.FULL;
        int ordinal = this.l.ordinal();
        if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return cqrt.f(2131231689);
        }
        return cqrt.f(2131231621);
    }

    @Override // defpackage.jar
    public String x() {
        return "";
    }

    @Override // defpackage.jar
    public String y() {
        return this.h;
    }

    @Override // defpackage.jar
    @dzsi
    public cjtd z() {
        return this.i;
    }

    public ivw(Context context, ivu ivuVar, jaq jaqVar, cqtd cqtdVar, String str, @dzsi cjtd cjtdVar, boolean z, int i, ivv ivvVar) {
        this.e = context;
        this.b = jaqVar;
        this.f = cqtdVar;
        this.h = str;
        this.i = cjtdVar;
        this.j = z;
        this.k = i;
        this.l = ivvVar;
        g();
    }
}
