package defpackage;
/* compiled from: PG */
/* renamed from: bbal  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbal implements bayj {
    protected final gga t;
    protected final bwqv u;
    protected final ania v;
    protected final batz w;
    protected int x;

    /* JADX INFO: Access modifiers changed from: protected */
    public bbal(gga ggaVar, bwqv bwqvVar, ania aniaVar, batz batzVar) {
        this.t = ggaVar;
        this.u = bwqvVar;
        this.v = aniaVar;
        this.w = batzVar;
        bayh bayhVar = bayh.NONE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Boolean A() {
        return Boolean.valueOf(this.v.a());
    }

    @Override // defpackage.bayj
    public cqkl e() {
        ilo f = f();
        if (f != null) {
            begg wj = ((begf) btsq.b(begf.class, this.t)).wj();
            batz batzVar = this.w;
            String d = d();
            drcs drcsVar = drcs.PRIVATE;
            begj begjVar = new begj();
            begjVar.n = true;
            begjVar.c(false);
            begjVar.c = jjn.COLLAPSED;
            begjVar.f = batzVar.a.a(d, drcsVar, 1);
            begjVar.b(f);
            wj.o(begjVar, false, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.bayj
    public String j() {
        return "";
    }

    @Override // defpackage.bayj
    public String k() {
        return "";
    }

    @Override // defpackage.bayj
    public cqss l() {
        return ibm.n();
    }

    @Override // defpackage.bayj
    public cqkl m() {
        return cqkl.a;
    }

    @Override // defpackage.bayj
    public Boolean n() {
        return false;
    }

    @Override // defpackage.bayj
    public Boolean o() {
        return false;
    }

    @Override // defpackage.bayj
    @dzsi
    public aydl p() {
        return null;
    }

    @Override // defpackage.bayj
    @dzsi
    public akqq q() {
        bvoo.f(new UnsupportedOperationException("getLatLng should be overridden if needed."));
        return null;
    }

    @Override // defpackage.bayj
    public Boolean r() {
        return false;
    }

    @Override // defpackage.bayj
    public baab s() {
        return baab.UNKNOWN;
    }

    @Override // defpackage.bayj
    public void t(int i) {
        this.x = i;
    }
}
