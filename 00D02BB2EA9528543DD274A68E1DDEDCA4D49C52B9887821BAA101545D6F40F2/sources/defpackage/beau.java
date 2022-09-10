package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: beau  reason: default package */
/* loaded from: classes3.dex */
public class beau extends bruj {
    private final bebu e;
    private final beas f;
    private final dnwv g;
    private final int h;
    @dzsi
    private dnwx i;
    @dzsi
    private bebt j;
    @dzsi
    private bear k;
    @dzsi
    private String l;
    private String m;
    private cqtd n;

    public beau(beas beasVar, bebu bebuVar, brsc brscVar, brrx brrxVar, dnwv dnwvVar, int i) {
        super(brscVar, brrxVar);
        this.e = bebuVar;
        this.f = beasVar;
        this.g = dnwvVar;
        this.h = i;
        this.m = "";
        this.n = cqrt.g(i, ibm.x());
    }

    private final void s() {
        dnwx dnwxVar;
        Intent intent;
        Integer num = null;
        this.j = null;
        this.k = null;
        this.m = "";
        this.n = cqrt.g(this.h, ibm.x());
        this.l = null;
        this.i = null;
        ilo r = r();
        dnwx T = r == null ? null : r.T(this.g);
        this.i = T;
        if (T != null) {
            int i = T.a;
            if ((i & 64) != 0) {
                dnxf dnxfVar = T.e;
                if (dnxfVar == null) {
                    dnxfVar = dnxf.k;
                }
                dqdk dqdkVar = dnxfVar.g;
                if (dqdkVar == null) {
                    dqdkVar = dqdk.e;
                }
                if ((dqdkVar.a & 1) != 0) {
                    dqdk dqdkVar2 = dnxfVar.g;
                    if (dqdkVar2 == null) {
                        dqdkVar2 = dqdk.e;
                    }
                    dplx dplxVar = dqdkVar2.b;
                    if (dplxVar == null) {
                        dplxVar = dplx.g;
                    }
                    intent = bvrq.a(dplxVar);
                } else {
                    intent = null;
                }
                this.j = this.e.a(intent, null, dnxfVar, dtxq.a);
                this.m = dnxfVar.e.isEmpty() ? dnxfVar.d : dnxfVar.e;
                this.l = dnxfVar.f;
                this.b = this.a.a(this.c, dnxfVar.h);
            } else if ((i & 32) != 0) {
                dnxb dnxbVar = T.d;
                if (dnxbVar == null) {
                    dnxbVar = dnxb.h;
                }
                this.k = this.f.a(T);
                this.m = dnxbVar.d.isEmpty() ? dnxbVar.c : dnxbVar.d;
                this.l = dnxbVar.e;
                this.b = this.a.a(this.c, dnxbVar.g);
            }
        }
        dnwx dnwxVar2 = this.i;
        if (dnwxVar2 != null) {
            if (this.j != null) {
                dnwv b = dnwv.b(dnwxVar2.b);
                if (b == null) {
                    b = dnwv.UNKNOWN_ACTION_TYPE;
                }
                if (b == dnwv.ORDER_FOOD) {
                    dnxf dnxfVar2 = this.i.e;
                    if (dnxfVar2 == null) {
                        dnxfVar2 = dnxf.k;
                    }
                    if (!dnxfVar2.j.isEmpty()) {
                        dnwx dnwxVar3 = this.i;
                        dbsk.s(dnwxVar3);
                        dnxf dnxfVar3 = dnwxVar3.e;
                        if (dnxfVar3 == null) {
                            dnxfVar3 = dnxf.k;
                        }
                        dnxd dnxdVar = dnxfVar3.i;
                        if (dnxdVar == null) {
                            dnxdVar = dnxd.b;
                        }
                        ddih ddihVar = dnxdVar.a;
                        if (ddihVar == null) {
                            ddihVar = ddih.b;
                        }
                        dcep B = dcbg.b(ddihVar.a).s(beat.a).B();
                        if (B.size() == 1) {
                            if (B.contains(dgbc.DELIVERY)) {
                                num = 2131232220;
                            } else if (B.contains(dgbc.PICKUP)) {
                                num = 2131232437;
                            }
                        }
                    }
                }
            }
            if (this.k != null && (dnwxVar = this.i) != null) {
                dnxb dnxbVar2 = dnwxVar.d;
                if (dnxbVar2 == null) {
                    dnxbVar2 = dnxb.h;
                }
                if (!dnxbVar2.f.isEmpty()) {
                    num = 2131232312;
                }
            }
        }
        if (num != null) {
            this.n = cqrt.g(num.intValue(), ibm.x());
        }
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        bebt bebtVar = this.j;
        if (bebtVar != null) {
            bebtVar.a();
        } else {
            bear bearVar = this.k;
            if (bearVar != null) {
                bearVar.a();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return this.l;
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.m;
    }

    @Override // defpackage.brvb
    public Boolean d() {
        boolean z = true;
        if (this.j == null && this.k == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return this.n;
    }

    @Override // defpackage.bruj, defpackage.brvb
    public void i(bwrs<ilo> bwrsVar) {
        super.i(bwrsVar);
        s();
    }

    @Override // defpackage.bruj, defpackage.brvb
    public void j(brrx brrxVar) {
        super.j(brrxVar);
        s();
    }
}
