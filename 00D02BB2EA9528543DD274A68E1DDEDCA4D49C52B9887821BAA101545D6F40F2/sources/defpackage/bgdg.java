package defpackage;

import com.google.android.apps.maps.R;
import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: bgdg  reason: default package */
/* loaded from: classes3.dex */
public final class bgdg extends cqiw<bnih> {
    public static final cqtv a = ibn.k();
    private final boolean b;

    public bgdg() {
        this(false);
    }

    private static cqmj<bnih> e() {
        return cqgr.gd(cqgr.bq(irh.a()), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqgr.dQ(irh.b()), cqgr.dF(irh.b()), cqgr.aJ(17), cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(24.0d)), cqgr.x(cqtt.l(ibm.i(), cqrp.d(8.0d)))));
    }

    private static final cqlc<bnih, Boolean> f() {
        final cqlc cqlcVar = bgbi.a;
        final cqlc cqlcVar2 = new cqlc(cqlcVar) { // from class: bgbj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                bnih bnihVar = (bnih) cqkpVar;
                cqtv cqtvVar = bgdg.a;
                boolean z = false;
                if (((Boolean) cqlcVar3.a(bnihVar)).booleanValue() && bnihVar.ab().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        return new cqlc(cqlcVar2) { // from class: bgbk
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                bnih bnihVar = (bnih) cqkpVar;
                cqtv cqtvVar = bgdg.a;
                boolean z = false;
                if (((Boolean) cqlcVar3.a(bnihVar)).booleanValue() && bnihVar.ak().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    @Override // defpackage.cqiw
    protected final Type ND() {
        return bnih.class;
    }

    public bgdg(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bnih> a() {
        cqmj cqmjVar;
        cqmj cqmjVar2;
        cqmj cqmjVar3;
        cqmp[] cqmpVarArr = new cqmp[11];
        cqlc x = cqjv.x(bgcu.a);
        cqmp[] cqmpVarArr2 = new cqmp[5];
        cqmpVarArr2[0] = this.b ? cqic.c(x, new cqmp[0]) : cqgr.aF(x);
        cqmpVarArr2[1] = cqgr.aT(bfzt.n);
        cqmpVarArr2[2] = cqgr.L(false);
        cqmpVarArr2[3] = cqgr.aX(bgcv.a);
        cqmpVarArr2[4] = cqgr.fR(new bgzm(), bgcx.a, new cqmp[0]);
        cqmpVarArr[0] = cqgr.fY(cqmpVarArr2);
        cqmpVarArr[1] = cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.L(false), cqgr.aW(2), cqgr.fP(new beeq(bfzt.j, this.b), bgdc.a, new cqmp[0]), cqgr.aX(bgaw.a), cqic.f(bgax.a, new cqmp[0]));
        cqmpVarArr[2] = cqgr.fP(new bfka(bgcl.a, bgcw.a, false, true), bgcz.a, cqgr.aR(Integer.valueOf((int) R.id.hero_image_carousel)), cqgr.aI(bgda.a), cqgr.aX(bgdb.a));
        cqmp[] cqmpVarArr3 = new cqmp[10];
        cqmpVarArr3[0] = cqgr.aT(bfzt.m);
        cqmpVarArr3[1] = cqgr.aW(1);
        cqmpVarArr3[2] = cqgr.d(R.id.hero_image_carousel);
        cqmpVarArr3[3] = cqgr.fs(bgay.a);
        cqmpVarArr3[4] = cqgr.bp(-1);
        cqmpVarArr3[5] = cqgr.cd(-1);
        cqmpVarArr3[6] = cqgr.dr(1);
        cqmp[] cqmpVarArr4 = new cqmp[4];
        cqmpVarArr4[0] = cqgr.bp(-2);
        cqmpVarArr4[1] = cqgr.cd(-1);
        cqmpVarArr4[2] = cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqic.f(bgaz.a, new cqmp[0]), cqgr.fP(new bgdf(), bgba.a, new cqmp[0]));
        cqmp[] cqmpVarArr5 = new cqmp[8];
        cqmpVarArr5[0] = cqmn.a(cqjv.f(cqfe.CLIP_TO_OUTLINE, bgbb.a), cqgr.O(bgbc.a));
        cqmpVarArr5[1] = cqgr.bp(-2);
        cqmpVarArr5[2] = cqgr.cd(-1);
        cqmpVarArr5[3] = cqgr.x(ibm.b());
        cqmpVarArr5[4] = cqmp.e;
        cqmm fP = cqgr.fP(new bffq(), bgbd.a, new cqmp[0]);
        cqlc cqlcVar = bgbf.a;
        if (this.b) {
            cqmjVar = cqgr.fY(fP, cqic.f(cqlcVar, new cqmp[0]));
        } else {
            fP.b(cqgr.aI(cqlcVar));
            cqmjVar = fP;
        }
        cqmpVarArr5[5] = cqmjVar;
        cqmm fR = cqgr.fR(new bffj(this.b), bgbg.a, new cqmp[0]);
        cqlc cqlcVar2 = bgbh.a;
        if (this.b) {
            cqmjVar2 = cqgr.fY(fR, cqic.f(cqlcVar2, new cqmp[0]));
        } else {
            fR.b(cqgr.aI(cqlcVar2));
            cqmjVar2 = fR;
        }
        cqmpVarArr5[6] = cqmjVar2;
        final cqlc<bnih, Boolean> f = f();
        cqmm fR2 = cqgr.fR(new bfev(), bgbl.a, new cqmp[0]);
        fR2.a(cqgr.K(new cqlc(f) { // from class: bgbm
            private final cqlc a;

            {
                this.a = f;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqtv cqtvVar = bgdg.a;
                return Boolean.valueOf(!((Boolean) this.a.a((bnih) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aA(new cqlc(f) { // from class: bgbn
            private final cqlc a;

            {
                this.a = f;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqtv cqtvVar = bgdg.a;
                return Boolean.valueOf(!((Boolean) this.a.a((bnih) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aX(new cqlc(f) { // from class: bgbo
            private final cqlc a;

            {
                this.a = f;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = 1;
                if (true == ((Boolean) this.a.a((bnih) cqkpVar)).booleanValue()) {
                    i = 4;
                }
                return Integer.valueOf(i);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        cqlc cqlcVar3 = bgbq.a;
        if (this.b) {
            cqmjVar3 = cqgr.fY(fR2, cqic.f(cqlcVar3, new cqmp[0]));
        } else {
            fR2.b(cqgr.aI(cqlcVar3));
            cqmjVar3 = fR2;
        }
        cqmpVarArr5[7] = cqmjVar3;
        cqmpVarArr4[3] = cqgr.fY(cqmpVarArr5);
        cqmpVarArr3[7] = cqgr.fY(cqmpVarArr4);
        cqmp[] cqmpVarArr6 = new cqmp[11];
        cqmpVarArr6[0] = cqgr.cd(-1);
        cqmpVarArr6[1] = cqgr.bp(-1);
        cqmpVarArr6[2] = cqgr.dr(1);
        cqmpVarArr6[3] = cqgr.x(ibm.b());
        cqmpVarArr6[4] = cqgr.L(false);
        cqmpVarArr6[5] = cqgr.aI(bgbr.a);
        cqmpVarArr6[6] = cqgr.gd(cqic.c(bgcy.a, new cqmp[0]), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), iuh.b(new cqmp[0]), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0), e(), e(), e(), e()));
        cqmpVarArr6[7] = bfzu.d(cqgr.aI(bgbs.a));
        cqmj e = acnn.e();
        e.f(cqgr.aI(bgbt.a), cqgr.bV(irh.c()), cqgr.bD(irh.c()));
        cqmpVarArr6[8] = e;
        final cqlc<bnih, Boolean> f2 = f();
        cqmpVarArr6[9] = cqgr.gd(cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.fY(cqic.f(bgbu.a, new cqmp[0]), cqgr.fR(new bmlg(), bgbv.a, new cqmp[0])), cqgr.fR(new bgan(), bgbw.a, cqgr.K(new cqlc(f2) { // from class: bgbx
            private final cqlc a;

            {
                this.a = f2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqtv cqtvVar = bgdg.a;
                return Boolean.valueOf(!((Boolean) this.a.a((bnih) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aA(new cqlc(f2) { // from class: bgby
            private final cqlc a;

            {
                this.a = f2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqtv cqtvVar = bgdg.a;
                return Boolean.valueOf(!((Boolean) this.a.a((bnih) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aX(new cqlc(f2) { // from class: bgbz
            private final cqlc a;

            {
                this.a = f2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = 1;
                if (true == ((Boolean) this.a.a((bnih) cqkpVar)).booleanValue()) {
                    i = 4;
                }
                return Integer.valueOf(i);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), cqgr.dE(bgcb.a));
        cqmp fR3 = cqgr.fR(new bfvp(), bgcc.a, new cqmp[0]);
        cqlc cqlcVar4 = bgcd.a;
        if (this.b) {
            fR3 = cqgr.fY(fR3, cqic.f(cqlcVar4, new cqmp[0]));
        }
        cqmpVarArr6[10] = fR3;
        cqmpVarArr3[8] = cqgr.gd(cqmpVarArr6);
        cqmpVarArr3[9] = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.x(ibm.b()), cqgr.aF(bgce.a));
        cqmpVarArr[3] = cqgr.gd(cqmpVarArr3);
        cqmp fR4 = cqgr.fR(new bfzz(this.b), bgcf.a, new cqmp[0]);
        cqlc cqlcVar5 = bgcg.a;
        if (this.b) {
            fR4 = cqgr.fY(fR4, cqic.f(cqlcVar5, new cqmp[0]));
        }
        cqmpVarArr[4] = fR4;
        cqlc cqlcVar6 = bgch.a;
        cqmp[] cqmpVarArr7 = new cqmp[3];
        cqmpVarArr7[0] = this.b ? cqic.f(cqlcVar6, new cqmp[0]) : cqgr.aI(cqlcVar6);
        cqmpVarArr7[1] = cqgr.dE(bgci.a);
        cqmpVarArr7[2] = cqgr.fR(new bexw(this.b), bgcj.a, new cqmp[0]);
        cqmpVarArr[5] = cqgr.fY(cqmpVarArr7);
        cqlc cqlcVar7 = bgck.a;
        cqmp[] cqmpVarArr8 = new cqmp[3];
        cqmpVarArr8[0] = this.b ? cqic.f(cqlcVar7, new cqmp[0]) : cqgr.aI(cqlcVar7);
        cqmpVarArr8[1] = cqgr.dE(bgcm.a);
        cqmpVarArr8[2] = cqgr.fR(new bexw(this.b), bgcn.a, new cqmp[0]);
        cqmpVarArr[6] = cqgr.fY(cqmpVarArr8);
        cqlc cqlcVar8 = bgco.a;
        cqmp[] cqmpVarArr9 = new cqmp[3];
        cqmpVarArr9[0] = this.b ? cqic.f(cqlcVar8, new cqmp[0]) : cqgr.aI(cqlcVar8);
        cqmpVarArr9[1] = cqgr.dE(bgcp.a);
        cqmpVarArr9[2] = cqgr.fR(new bfap(this.b), bgcq.a, new cqmp[0]);
        cqmpVarArr[7] = cqgr.fY(cqmpVarArr9);
        cqmp fP2 = cqgr.fP(new bgai(this.b), bgcr.a, new cqmp[0]);
        if (this.b) {
            fP2 = cqgr.fY(fP2, cqic.f(bgcs.a, new cqmp[0]));
        }
        cqmpVarArr[8] = fP2;
        cqmpVarArr[9] = bfzu.d(cqgr.aT(bfzt.o), cqgr.fI(8));
        cqmpVarArr[10] = cqgr.gs(cqgr.aI(f()), cqgr.cd(-1), cqgr.S(Integer.valueOf((int) R.string.ACCESSIBILITY_PLACE_CARD_CLICK_TO_EXPAND)), cqgr.cW(cqgr.q(bgct.a)), cqgr.J(true));
        final cqlc b = cqkz.b(bgbe.a);
        final cqlc cqlcVar9 = bgbp.a;
        cqmj fY = cqgr.fY(iue.c(bgav.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.L(false), bfzu.a(cqgr.bs(new cqlc(b, cqlcVar9) { // from class: bgca
            private final cqlc a;
            private final cqlc b;

            {
                this.a = b;
                this.b = cqlcVar9;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar10 = this.a;
                cqlc cqlcVar11 = this.b;
                bnih bnihVar = (bnih) cqkpVar;
                cqtv cqtvVar = bgdg.a;
                if (!((Boolean) cqlcVar10.a(bnihVar)).booleanValue() || !((Boolean) cqlcVar11.a(bnihVar)).booleanValue()) {
                    if (((Boolean) cqlcVar10.a(bnihVar)).booleanValue() || ((Boolean) cqlcVar11.a(bnihVar)).booleanValue()) {
                        return cqrp.d(144.0d);
                    }
                    return cqrp.d(88.0d);
                }
                return cqrp.d(200.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })));
        fY.f(cqmpVarArr);
        return cqgr.gj(cqgr.aR(Integer.valueOf((int) R.id.place_page_view)), cqgr.L(false), fY);
    }
}
