package defpackage;
/* compiled from: PG */
/* renamed from: pxk  reason: default package */
/* loaded from: classes7.dex */
final class pxk implements jkh {
    private final gek a;
    private final puy b;
    private final pvk c;
    private final vnk d;
    private final zmu e;
    private final vtg f;
    private final wzz g;
    private final pyt h;
    private final cjqy i;

    public pxk(gek gekVar, puy puyVar, pvk pvkVar, vnk vnkVar, zmu zmuVar, vtg vtgVar, wzz wzzVar, pyt pytVar, cjqy cjqyVar) {
        this.a = gekVar;
        this.b = puyVar;
        this.c = pvkVar;
        this.d = vnkVar;
        this.e = zmuVar;
        this.f = vtgVar;
        this.g = wzzVar;
        this.h = pytVar;
        this.i = cjqyVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (!this.b.aD) {
            return;
        }
        boolean z = false;
        this.e.ab(false);
        this.e.Y();
        this.c.l();
        if (jkgVar != jkg.AUTOMATED) {
            synchronized (this.d) {
                this.d.ag();
            }
        }
        this.b.bJ();
        jkh m = this.c.m();
        if (m != null) {
            m.L(jkjVar, jjnVar, jjnVar2, jkgVar);
        }
        if (jjnVar != jjnVar2) {
            vtg vtgVar = this.f;
            if (vtgVar.c == null) {
                z = true;
            }
            jjn jjnVar3 = jjn.HIDDEN;
            int ordinal = jjnVar2.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                vtgVar.a(jjnVar2, z);
            }
            akyc akycVar = vtgVar.c;
            if (akycVar != null) {
                vtgVar.a.p(akycVar);
                vtgVar.c = null;
            }
        }
        pyt pytVar = this.h;
        vnk vnkVar = this.d;
        puy puyVar = this.b;
        if (pytVar.c(vnkVar, puyVar.cE, jjnVar2, puyVar.bK())) {
            this.i.r(this.h.b());
        }
        gek gekVar = this.a;
        dbsk.s(gekVar);
        gekVar.c = jjnVar2;
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        if (!this.b.aD) {
            return;
        }
        if (jkjVar.z(jjn.EXPANDED) != jjn.COLLAPSED) {
            this.e.ab(true);
            this.e.Y();
            this.c.l();
        }
        this.c.m();
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        if (!this.b.aD) {
            return;
        }
        this.e.ab(false);
        this.e.Y();
        this.c.l();
        this.g.b = this.c.w();
        this.g.g();
        this.c.m();
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        jkh m;
        if (this.b.aD && (m = this.c.m()) != null) {
            m.P(jkjVar, jjnVar, f);
        }
    }
}
