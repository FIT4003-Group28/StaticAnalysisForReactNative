package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bffq  reason: default package */
/* loaded from: classes3.dex */
public final class bffq extends cqiw<bfgu> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<bfgu> f(cqss cqssVar, cqlc<bfgu, Boolean> cqlcVar, final cqlc<bfgu, Boolean> cqlcVar2) {
        return bfgf.b(cqkz.a(cqssVar), irn.m(), bffn.a, bffo.a, cqlcVar, cqgr.aF(new cqlc(cqlcVar2) { // from class: bffp
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                bfgu bfguVar = (bfgu) cqkpVar;
                int i = bffq.a;
                boolean z = true;
                if (!bfguVar.q().booleanValue() && !cqjv.v(bfguVar.j()).booleanValue() && !((Boolean) cqlcVar3.a(bfguVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfgu> a() {
        Boolean t = cqjv.t(cqjv.u(B().J()), cqjv.v(B().K()));
        Boolean L = B().L();
        cqmj<bfgu> e = e(true);
        cqmj fY = cqgr.fY(cqgr.fQ(new brsw(false), B().K(), new cqmp[0]), cqgr.aR(Integer.valueOf((int) R.id.geocode_place_card)));
        fY.g(cqic.a(t, new cqmp[0]));
        cqmj<bfgu> e2 = e(true);
        e2.g(cqic.d(cqjv.r(t, L), new cqmp[0]));
        cqmj<bfgu> e3 = e(false);
        e3.g(cqic.d(cqjv.r(t, cqjv.u(L)), new cqmp[0]));
        cqmj fY2 = cqgr.fY(fY, e2, e3, cqgr.aT(bfzt.l));
        return cqgr.fY(cqgr.fD(bffk.a), iue.b(B().s()), cqgr.gv(cqgr.e(R.id.persistent_footer_secondary_button), cqgr.aT(bfzt.c), cqgr.cT(B().QU()), iue.b(B().r()), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(B().J(), cqgr.cF(false), cqgr.cF(true)), cqgr.o(false), cqmn.a(cqgr.aY(bfzu.b()), cqgr.du(bfzu.c())), cqjv.k(B().l(), cqgr.ac(e.c()), cqgr.ac(fY2.c())), cqgr.bl(B().n()), e, fY2));
    }

    private final cqmj<bfgu> e(boolean z) {
        int i;
        cqmp<cqkp> gc;
        int i2;
        cqmp cqmpVar;
        char c;
        int i3;
        cqmp gd;
        char c2;
        cqmp gg = z ? cqmp.e : cqgr.gg(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.aD(cqjv.t(B().x(), B().o())));
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.aT(z ? bfzt.g : bfzt.h);
        cqmpVarArr[1] = cqgr.dQ(ibn.g());
        cqmpVarArr[2] = cqgr.dF(ibn.g());
        cqmpVarArr[3] = cqgr.cd(-1);
        cqmpVarArr[4] = cqgr.bp(-2);
        cqmp[] cqmpVarArr2 = new cqmp[15];
        cqmpVarArr2[0] = cqgr.bp(-2);
        cqmpVarArr2[1] = cqgr.cd(0);
        Float valueOf = Float.valueOf(1.0f);
        cqmpVarArr2[2] = cqgr.ca(valueOf);
        cqmpVarArr2[3] = cqgr.dr(1);
        cqmpVarArr2[4] = cqjv.k(B().J(), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dU(bfgf.a));
        cqmpVarArr2[5] = cqgr.dB(bfgf.a);
        cqmpVarArr2[6] = bfgf.c(cqic.d(B().J(), new cqmp[0]));
        cqmp[] cqmpVarArr3 = new cqmp[0];
        cqmp[] cqmpVarArr4 = new cqmp[6];
        cqmpVarArr4[0] = cqgr.bp(-2);
        cqmpVarArr4[1] = cqgr.cd(-1);
        cqmpVarArr4[2] = cqgr.dr(0);
        cqmpVarArr4[3] = cqjv.k(B().J(), cqgr.bD(cqrp.d(4.0d)), cqgr.bD(cqrp.d(dcyn.a)));
        if (z) {
            gc = cqmp.e;
            i = 4;
        } else {
            i = 4;
            gc = cqgr.gc(cqgr.aG(B().y()), cqgr.bw(16), cqgr.ce(cqrp.d(20.0d)), cqgr.bq(cqrp.d(20.0d)), cqgr.bG(irh.g()), cqgr.eE(itd.d(ibm.m())));
        }
        cqmpVarArr4[i] = gc;
        cqmp[] cqmpVarArr5 = new cqmp[i];
        cqmpVarArr5[0] = cqgr.cd(-2);
        cqmpVarArr5[1] = cqgr.bp(-2);
        cqmp[] cqmpVarArr6 = new cqmp[3];
        cqmpVarArr6[0] = cqgr.dr(0);
        cqmp[] cqmpVarArr7 = new cqmp[10];
        cqmpVarArr7[0] = cqgr.eN(5);
        cqmp cqmpVar2 = gg;
        cqmpVarArr7[1] = cqjv.k(B().J(), ibq.f(), ibq.e());
        cqmpVarArr7[2] = cqgr.cd(-2);
        cqmpVarArr7[3] = cqgr.bp(-2);
        cqmpVarArr7[4] = cqgr.co(cqrp.f(3.0d), false);
        cqmpVarArr7[5] = ibq.v();
        cqmpVarArr7[6] = cqgr.cB(Integer.valueOf(true != z ? 1 : Integer.MAX_VALUE));
        cqmpVarArr7[7] = cqgr.ar(z ? null : TextUtils.TruncateAt.END);
        cqmpVarArr7[8] = cqgr.bl(B().o());
        cqmpVarArr7[9] = cqgr.eI(B().d());
        cqmpVarArr6[1] = cqgr.gq(cqmpVarArr7);
        cqmpVarArr6[2] = cqgr.fY(cqgr.ca(Float.valueOf(0.0f)), cqgr.bp(-1), cqgr.L(false), cqgr.aG(B().B()), cqgr.fQ(new bmgr(), B().C(), new cqmp[0]));
        cqmpVarArr5[2] = cqgr.gd(cqmpVarArr6);
        cqmpVarArr5[3] = z ? cqmp.e : cqgr.gg(cqgr.aD(cqjv.t(cqjv.u(B().x()), B().o())), irn.A());
        cqmpVarArr4[5] = cqgr.fY(cqmpVarArr5);
        cqmj gd2 = cqgr.gd(cqmpVarArr4);
        gd2.f(cqmpVarArr3);
        cqmpVarArr2[7] = gd2;
        cqmpVarArr2[8] = z ? cqmp.e : cqgr.gg(cqgr.aD(cqjv.t(cqjv.u(B().E()), B().F())), irn.A());
        if (z) {
            i2 = 5;
            cqmpVar = cqgr.gq(cqgr.aG(B().p()), cqgr.eN(5), irn.j(), ibq.y(), cqgr.co(cqrp.f(3.0d), false), cqgr.eI(B().e()));
        } else {
            i2 = 5;
            cqmpVar = cqmp.e;
        }
        cqmpVarArr2[9] = cqmpVar;
        cqmp[] cqmpVarArr8 = new cqmp[i2];
        cqmpVarArr8[0] = cqgr.aD(cqjv.t(cqjv.u(B().F()), cqjv.u(B().D())));
        cqmpVarArr8[1] = cqgr.aJ(16);
        cqmpVarArr8[2] = cqjv.k(B().J(), cqgr.bV(cqrp.d(dcyn.a)), cqgr.bV(irh.h()));
        cqmpVarArr8[3] = cqgr.fO(bfgf.a(z), B().G(), new cqmp[0]);
        cqmpVarArr8[4] = f(ibm.n(), cqkz.a(true), cqkz.a(false));
        cqmpVarArr2[10] = cqgr.gd(cqmpVarArr8);
        cqmp[] cqmpVarArr9 = new cqmp[9];
        cqmpVarArr9[0] = cqgr.aD(z ? cqjv.u(B().F()) : cqjv.t(cqjv.u(B().F()), B().D()));
        cqmpVarArr9[1] = cqgr.bp(-2);
        cqmpVarArr9[2] = cqgr.cd(-2);
        cqmpVarArr9[3] = cqgr.dr(0);
        cqmpVarArr9[4] = cqgr.aJ(Integer.valueOf(true != z ? 16 : 80));
        cqmpVarArr9[5] = cqjv.k(B().J(), cqgr.bV(cqrp.d(dcyn.a)), cqgr.bV(irh.h()));
        cqmpVarArr9[6] = cqgr.gc(cqgr.aG(cqjv.r(B().h(), B().QV())), cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(cqrp.d(2.0d)), cqgr.bw(48), cqgr.dF(cqrp.d(6.0d)), cqgr.eE(B().v()));
        cqmp[] cqmpVarArr10 = new cqmp[10];
        cqmpVarArr10[0] = cqgr.bl(B().h());
        cqmpVarArr10[1] = cqgr.cd(-2);
        cqmpVarArr10[2] = cqgr.bp(-2);
        cqmpVarArr10[3] = cqgr.ca(valueOf);
        cqmpVarArr10[4] = irn.m();
        cqmpVarArr10[5] = ibq.y();
        cqmpVarArr10[6] = z ? cqjv.k(B().i(), cqgr.cB(Integer.MAX_VALUE), cqgr.cB(3)) : cqgr.cB(1);
        cqmpVarArr10[7] = cqgr.eB(Boolean.valueOf(!z));
        cqmpVarArr10[8] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr10[9] = cqgr.eI(z ? B().g() : B().f());
        cqmpVarArr9[7] = cqgr.gq(cqmpVarArr10);
        cqmpVarArr9[8] = f(ibm.n(), bffl.a, bffm.a);
        cqmpVarArr2[11] = cqgr.gd(cqmpVarArr9);
        cqmpVarArr2[12] = z ? cqgr.gd(cqgr.aG(cqjv.r(B().y(), cqjv.u(B().z()))), cqgr.aJ(16), cqgr.dU(irh.h()), cqgr.gg(cqgr.ce(cqrp.d(16.0d)), cqgr.bq(cqrp.d(16.0d)), cqgr.Z(com.google.android.filament.R.style.Widget_AppCompat_ProgressBar)), cqgr.gq(cqgr.bR(irh.g()), ibq.y(), ibq.z(), cqgr.aJ(16), cqgr.eL(Integer.valueOf((int) R.string.OFFLINE_DETAILS_LOADING)))) : cqmp.e;
        cqmpVarArr2[13] = z ? cqgr.gd(cqgr.aG(B().z()), cqgr.aJ(16), cqgr.dU(irh.h()), cqgr.gc(cqgr.ch(cqrp.d(20.0d)), cqgr.bG(cqrp.d(-1.0d)), cqgr.eE(itd.d(ibm.m()))), cqgr.gq(cqgr.bR(irh.g()), ibq.y(), ibq.z(), cqgr.aJ(16), cqgr.eL(Integer.valueOf((int) R.string.OFFLINE_PLACE_STATE_LIMITED_INFO)))) : cqmp.e;
        cqmpVarArr2[14] = z ? cqgr.fY(cqgr.aG(B().I()), cqgr.fQ(new bexe(), B().H(), new cqmp[0])) : cqmp.e;
        cqmpVarArr[5] = cqgr.gd(cqmpVarArr2);
        if (z) {
            gd = cqmp.e;
            c2 = 6;
            i3 = 2;
            c = 0;
        } else {
            gzl gzlVar = new gzl();
            izl A = B().A();
            dbsk.s(A);
            c = 0;
            cqmm fO = cqgr.fO(gzlVar, A, new cqmp[0]);
            i3 = 2;
            gd = cqgr.gd(cqgr.bw(8388629), cqgr.aD(cqjv.t(cqjv.u(E()), cqjv.v(B().A()))), fO);
            c2 = 6;
        }
        cqmpVarArr[c2] = gd;
        cqmp[] cqmpVarArr11 = new cqmp[i3];
        cqmpVarArr11[c] = cqgr.gd(cqmpVarArr);
        cqmpVarArr11[1] = cqmpVar2;
        return cqgr.fY(cqmpVarArr11);
    }
}
