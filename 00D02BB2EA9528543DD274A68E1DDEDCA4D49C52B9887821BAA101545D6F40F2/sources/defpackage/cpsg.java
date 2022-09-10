package defpackage;
/* compiled from: PG */
/* renamed from: cpsg  reason: default package */
/* loaded from: classes5.dex */
public final class cpsg implements cpsk {
    public final cpsj a;
    public final cpsh b;
    private cpsq c;
    private cpsm d;
    private final cpsi e;
    private boolean f;

    public cpsg() {
        this.c = cpsq.a();
        this.d = cpsm.a();
        this.f = true;
        this.a = new cpsj();
        this.b = new cpsh();
        this.e = new cpsi();
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t() {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpsg.t():void");
    }

    public final boolean a() {
        return this.a.b;
    }

    public final void b(boolean z) {
        this.a.e = z;
    }

    @Override // defpackage.cpsk
    public final void c(cpsm cpsmVar) {
        cpwl.h(cpsmVar, "rangeBandConfig");
        if (!cpsmVar.equals(this.d)) {
            this.d = cpsmVar;
            this.f = true;
        }
    }

    @Override // defpackage.cpsk
    public final void d(cpsq cpsqVar) {
        cpwl.h(cpsqVar, "stepSizeConfig");
        this.c = cpsqVar;
    }

    @Override // defpackage.cpsk
    public final void e(cpsf<Integer> cpsfVar) {
        cpwl.h(cpsfVar, "Attempt to set a null range.");
        cpsj cpsjVar = this.a;
        if (cpsjVar.a != null && cpsjVar.e) {
            t();
            g(this.a.f);
        }
        this.a.a = cpsfVar;
        this.f = true;
    }

    @Override // defpackage.cpso
    public final cpsf<Integer> f() {
        return this.a.a;
    }

    public final void g(cpsf<Double> cpsfVar) {
        this.a.f = cpsfVar != null ? cpsfVar.a() : null;
        cpsj cpsjVar = this.a;
        cpsjVar.g = cpsjVar.f != null;
        this.f = true;
    }

    public final cpsf<Double> h() {
        if (this.f) {
            t();
        }
        return this.a.f;
    }

    @Override // defpackage.cpsk
    public final void i(float f, float f2) {
        cpsj cpsjVar = this.a;
        cpsjVar.c = f;
        cpsjVar.d = f2;
        cpsjVar.g = false;
        this.f = true;
    }

    @Override // defpackage.cpsk
    public final void j() {
        cpsj cpsjVar = this.a;
        if (!cpsjVar.e) {
            cpsjVar.g = false;
            cpsjVar.c = 1.0f;
            cpsjVar.d = 0.0f;
            cpsjVar.f = null;
        } else if (cpsjVar.a != null) {
            t();
            g(this.a.f);
        }
        this.f = true;
        cpsh cpshVar = this.b;
        cpshVar.d = Double.NaN;
        cpshVar.b = Double.MAX_VALUE;
        cpshVar.c = -1.7976931348623157E308d;
        cpshVar.e = Double.MAX_VALUE;
        this.e.a = 0.0f;
    }

    @Override // defpackage.cpso
    public final int k() {
        cpsj cpsjVar = this.a;
        return Math.abs(cpsjVar.a.a.intValue() - cpsjVar.a.b.intValue());
    }

    @Override // defpackage.cpso
    public final float l() {
        if (this.f) {
            t();
        }
        return this.e.a;
    }

    @Override // defpackage.cpsk
    public final /* bridge */ /* synthetic */ void m(Object obj) {
        this.f = this.b.a((Double) obj);
    }

    @Override // defpackage.cpsk
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        Double d = (Double) obj;
        cpsh cpshVar = this.b;
        if (d != null) {
            cpshVar.a(d);
            double doubleValue = d.doubleValue();
            if (!Double.isNaN(cpshVar.d)) {
                double abs = Math.abs(doubleValue - cpshVar.d);
                if (abs != dcyn.a && abs < cpshVar.e) {
                    cpshVar.e = Math.abs(doubleValue - cpshVar.d);
                }
            }
            cpshVar.d = doubleValue;
        }
        this.f = true;
    }

    @Override // defpackage.cpso
    public final /* bridge */ /* synthetic */ cpsk o() {
        cpwl.h(this.a.a, "Copying a scale with no range.");
        return new cpsg(this);
    }

    @Override // defpackage.cpso
    public final /* bridge */ /* synthetic */ int p(Object obj) {
        Double d = (Double) obj;
        cpsf<Double> cpsfVar = this.a.f;
        if (cpsfVar == null) {
            this.b.b();
            cpsfVar = this.b.f;
        }
        if (d.doubleValue() < cpsfVar.a.doubleValue()) {
            return -1;
        }
        return d.doubleValue() > cpsfVar.b.doubleValue() ? 1 : 0;
    }

    @Override // defpackage.cpso
    public final /* bridge */ /* synthetic */ boolean q(Object obj) {
        Double d = (Double) obj;
        return true;
    }

    @Override // defpackage.cpso
    public final /* bridge */ /* synthetic */ float r(Object obj, Object obj2) {
        if (this.f) {
            t();
        }
        double d = dcyn.a;
        double doubleValue = obj != null ? ((Double) obj).doubleValue() : 0.0d;
        if (obj2 != null) {
            d = ((Double) obj2).doubleValue();
        }
        return this.e.a(doubleValue + d);
    }

    @Override // defpackage.cpso
    public final /* bridge */ /* synthetic */ float s(Object obj) {
        Double d = (Double) obj;
        if (this.f) {
            t();
        }
        return this.e.a(d.doubleValue());
    }

    private cpsg(cpsg cpsgVar) {
        this.c = cpsq.a();
        this.d = cpsm.a();
        this.f = true;
        this.c = cpsgVar.c;
        this.d = cpsgVar.d;
        this.a = new cpsj(cpsgVar.a);
        this.b = new cpsh(cpsgVar.b);
        this.e = new cpsi(cpsgVar.e);
    }
}
