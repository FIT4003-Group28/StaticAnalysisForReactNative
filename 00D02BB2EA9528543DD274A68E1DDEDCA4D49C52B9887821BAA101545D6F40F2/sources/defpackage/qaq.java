package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qaq  reason: default package */
/* loaded from: classes7.dex */
public final class qaq extends qcw {
    public Boolean a;
    public Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private dqvj f;
    private amvh g;
    private dcdc<amvh> h;
    private String i;
    private dspd j;
    private String k;
    private dcep<dpjs> l;
    private Boolean m;
    private Boolean n;
    private qbs o;
    private Boolean p;
    private bvrt<dwao> q;
    private dbsg<bvrt<dnqh>> r;
    private bvrt<duqc> s;
    private int t;

    public qaq() {
        this.r = dbpy.a;
    }

    public qaq(qcx qcxVar) {
        this.r = dbpy.a;
        qar qarVar = (qar) qcxVar;
        this.a = Boolean.valueOf(qarVar.a);
        this.c = Boolean.valueOf(qarVar.b);
        this.d = Boolean.valueOf(qarVar.c);
        this.t = qarVar.t;
        this.e = Boolean.valueOf(qarVar.d);
        this.f = qarVar.e;
        this.g = qarVar.f;
        this.h = qarVar.g;
        this.i = qarVar.h;
        this.j = qarVar.i;
        this.k = qarVar.j;
        this.l = qarVar.k;
        this.m = Boolean.valueOf(qarVar.l);
        this.n = Boolean.valueOf(qarVar.m);
        this.b = Boolean.valueOf(qarVar.n);
        this.o = qarVar.o;
        this.p = Boolean.valueOf(qarVar.p);
        this.q = qarVar.q;
        this.r = qarVar.r;
        this.s = qarVar.s;
    }

    @Override // defpackage.qcw
    public final void b(dcdc<amvh> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null destinations");
    }

    @Override // defpackage.qcw
    public final void c(dcep<dpjs> dcepVar) {
        if (dcepVar != null) {
            this.l = dcepVar;
            return;
        }
        throw new NullPointerException("Null entityTypesThatHaveTriggeredAliasSettingFlow");
    }

    @Override // defpackage.qcw
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.qcw
    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.qcw
    public final void f(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.qcw
    public final void g(@dzsi String str) {
        this.i = str;
    }

    @Override // defpackage.qcw
    public final void h(@dzsi dspd dspdVar) {
        this.j = dspdVar;
    }

    @Override // defpackage.qcw
    public final void i(int i) {
        this.t = i;
    }

    @Override // defpackage.qcw
    public final void j(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.qcw
    public final void k(qbs qbsVar) {
        if (qbsVar != null) {
            this.o = qbsVar;
            return;
        }
        throw new NullPointerException("Null resultViewMode");
    }

    @Override // defpackage.qcw
    public final void l(@dzsi String str) {
        this.k = str;
    }

    @Override // defpackage.qcw
    public final void m(@dzsi bvrt<duqc> bvrtVar) {
        this.s = bvrtVar;
    }

    @Override // defpackage.qcw
    public final void n(@dzsi bvrt<dnqh> bvrtVar) {
        this.r = dbsg.j(bvrtVar);
    }

    @Override // defpackage.qcw
    public final void o(@dzsi bvrt<dwao> bvrtVar) {
        this.q = bvrtVar;
    }

    @Override // defpackage.qcw
    public final void p(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.qcw
    public final void q(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.qcw
    public final void r(@dzsi amvh amvhVar) {
        this.g = amvhVar;
    }

    @Override // defpackage.qcw
    public final void s(@dzsi dqvj dqvjVar) {
        this.f = dqvjVar;
    }

    @Override // defpackage.qcw
    public final qcx a() {
        String str = this.a == null ? " showShareTripDialog" : "";
        if (this.c == null) {
            str = str.concat(" maySearch");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" isMultimodalLeg");
        }
        if (this.t == 0) {
            str = String.valueOf(str).concat(" promoType");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" skipRouteSelection");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" destinations");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" entityTypesThatHaveTriggeredAliasSettingFlow");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" replaceTopmostDirectionsFragment");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" popDirectionsOnNavExit");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" show2wPromo");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" resultViewMode");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" shouldShowMoreRoutesLink");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qar(this.a.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.t, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m.booleanValue(), this.n.booleanValue(), this.b.booleanValue(), this.o, this.p.booleanValue(), this.q, this.r, this.s);
    }
}
