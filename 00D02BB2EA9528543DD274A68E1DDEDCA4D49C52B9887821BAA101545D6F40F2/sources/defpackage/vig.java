package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vig  reason: default package */
/* loaded from: classes7.dex */
public final class vig extends cqiw<zeu> {
    public static cqiw<zeu> e() {
        return new vig();
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zeu zeuVar, Context context, cqiv cqivVar) {
        zeu zeuVar2 = zeuVar;
        if (i == 0) {
            cqivVar.f(new qjb(), zeuVar2.c());
            cqivVar.a(new vlc(), zeuVar2);
        } else if (i == 1) {
            for (zes zesVar : zeuVar2.v()) {
                if (zesVar instanceof zer) {
                    cqivVar.a(new vie(), (zer) zesVar);
                }
                if (zesVar instanceof zem) {
                    cqivVar.a(new vib(), (zem) zesVar);
                }
                if (zesVar instanceof zeq) {
                    cqivVar.a(new vid(), (zeq) zesVar);
                }
                if (zesVar instanceof zel) {
                    cqivVar.a(new via(), (zel) zesVar);
                }
                if (zesVar instanceof zep) {
                    cqivVar.a(new vcd(), (zep) zesVar);
                }
                if (zesVar instanceof zen) {
                    cqivVar.a(new vic(), (zen) zesVar);
                }
                if (zesVar instanceof zek) {
                    cqivVar.a(new vhz(), (zek) zesVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zeu> a() {
        cqjb<zeu, cqiv> D = D(0);
        String R = B().R();
        String S = B().S();
        whc w = B().w();
        cqmp[] cqmpVarArr = {cqgr.aD(B().s())};
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr2 = {cqgr.cd(0), cqgr.ca(valueOf)};
        cqmp[] cqmpVarArr3 = {cqgr.aG(cqjv.v(w)), cqgr.dQ(cqrp.d(4.0d))};
        cqmp[] cqmpVarArr4 = {cqgr.aD(cqjv.v(w)), cqgr.dQ(cqrp.d(4.0d))};
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(8388613), cqgr.fQ(new wgo(new cqmp[0]), w, new cqmp[0]), vlh.a(R, S, cqgr.cd(-2)));
        gd.f(cqmpVarArr4);
        cqmj gd2 = cqgr.gd(cqgr.bp(-2), cqgr.cH(irh.r()), cqgr.aJ(16), vlh.g(D, cqmpVarArr2), vlh.a(R, S, cqmpVarArr3), gd);
        gd2.f(cqmpVarArr);
        cqjb<zeu, cqiv> D2 = D(0);
        String R2 = B().R();
        String S2 = B().S();
        String f = B().f();
        String g = B().g();
        cqmp[] cqmpVarArr5 = {cqgr.aG(B().s())};
        cqmp[] cqmpVarArr6 = {cqgr.cd(0), cqgr.ca(valueOf)};
        cqmp[] cqmpVarArr7 = {cqgr.aG(cqjv.v(f)), cqgr.dQ(ibn.e())};
        cqmp[] cqmpVarArr8 = {cqgr.aD(cqjv.v(f)), cqgr.dQ(ibn.e())};
        cqmj gd3 = cqgr.gd(cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(8388613), vlh.a(R2, S2, cqgr.cd(-2)), vlh.c(f, g, cqgr.aJ(8388613)));
        gd3.f(cqmpVarArr8);
        cqmj gd4 = cqgr.gd(cqgr.bp(-2), cqgr.dB(cqrp.d(12.0d)), cqgr.cH(irh.r()), vlh.g(D2, cqmpVarArr6), vlh.a(R2, S2, cqmpVarArr7), gd3);
        gd4.f(cqmpVarArr5);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), gd2, gd4, cqgr.gc(cqgr.bq(cqrp.d(dcyn.a)), cqgr.aD(cqjv.v(B().w())), iue.b(B().x())), ict.k(cqrp.d(-16.0d), cqgr.bG(cqrp.d(-16.0d)), cqgr.aG(B().s())), jgi.d(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), jgi.e(irh.k()), cqgr.gd(cqgr.dr(1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.bV(cqrp.d(8.0d)), cqgr.ck(D(1))), cqgr.fO(new vgh(), B().r(), new cqmp[0])), vlh.d(cqgr.cd(-2), cqgr.bp(-2), cqgr.aG(B().U()), cqgr.bV(cqrp.d(7.5d))), vlh.j(), cqgr.P(false), cqgr.x(irn.G()));
    }
}
