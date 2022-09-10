package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: umg  reason: default package */
/* loaded from: classes7.dex */
public abstract class umg implements umc {
    protected final Boolean a;
    protected final Boolean b;
    private final dxio<bwsh> d;
    private final vtn e;
    private final qbv f;
    private Boolean g = false;
    @dzsi
    private dwfl h = null;
    @dzsi
    private jic i = null;
    @dzsi
    protected cqtd c = null;

    public umg(cqhn cqhnVar, dxio<bwsh> dxioVar, vtn vtnVar, qbv qbvVar, boolean z, boolean z2) {
        this.d = dxioVar;
        this.e = vtnVar;
        this.f = qbvVar;
        this.a = Boolean.valueOf(z2);
        this.b = Boolean.valueOf(z);
    }

    public final void A(@dzsi cqtd cqtdVar, boolean z) {
        if (cqtdVar != null) {
            if (z) {
                cqtdVar = cqrt.i(cqtdVar, ibm.t());
            }
            this.c = cqtdVar;
            cqkx.p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(String str, boolean z) {
        A(this.e.f(str, bvlw.a, new umf(this, z)), z);
    }

    @Override // defpackage.umc
    public Boolean a() {
        return this.b;
    }

    @Override // defpackage.umc
    public Boolean b() {
        return this.a;
    }

    @Override // defpackage.umc
    public void c(dwfl dwflVar) {
        if ((dwflVar.a & 128) != 0) {
            this.g = true;
            this.h = dwflVar;
            this.i = new jic(this.h.h, ckqc.FULLY_QUALIFIED, (cqtd) null, (int) cpnx.a);
            cqkx.p(this);
        }
    }

    @Override // defpackage.umc
    public Boolean d() {
        return this.g;
    }

    @Override // defpackage.umc
    @dzsi
    public jic e() {
        return this.i;
    }

    @Override // defpackage.umc
    public cqkl f() {
        dwfl dwflVar = this.h;
        if (dwflVar != null) {
            this.d.a().e(dwflVar, null, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.umc
    public Boolean i() {
        return Boolean.valueOf(this.f.d());
    }
}
