package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cgjm  reason: default package */
/* loaded from: classes4.dex */
public final class cgjm extends cqiw<cgvu> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(3.0d);
    private static final cqrp c = cqrp.d(8.0d);
    private static final cqrp d = cqrp.d(16.0d);
    private static final cqrp e = cqrp.d(64.0d);

    private static cqmj<cgvu> e(cqlc<cgvu, View.OnClickListener> cqlcVar, final cqlc<cgvu, Boolean> cqlcVar2, cqlc<cgvu, cqtd> cqlcVar3, cqlc<cgvu, CharSequence> cqlcVar4, cqlc<cgvu, cjtd> cqlcVar5) {
        cqrp cqrpVar = c;
        return cqgr.gd(cqgr.bp(-1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(0.5f)), cqgr.cL(irh.a()), cqgr.aJ(17), cqgr.gd(cqgr.y(new cqlc(cqlcVar2) { // from class: cgja
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = cgjm.a;
                if (((Boolean) this.a.a((cgvu) cqkpVar)).booleanValue()) {
                    return cqtt.g(ibm.x());
                }
                return cqtt.g(irg.e());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dz(cqrpVar, cqrpVar, cqrpVar, cqrpVar), cqgr.gc(cqgr.fn(new cqlc(cqlcVar2) { // from class: cgjb
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = cgjm.a;
                return ((Boolean) this.a.a((cgvu) cqkpVar)).booleanValue() ? irg.a() : irg.j();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eG(cqlcVar3))), cqgr.V(cqlcVar4), cqgr.K(new cqlc(cqlcVar2) { // from class: cgjc
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = cgjm.a;
                return Boolean.valueOf(!((Boolean) this.a.a((cgvu) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cW(cqlcVar), iue.c(cqlcVar5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cgvu> a() {
        cqrp cqrpVar = b;
        Float valueOf = Float.valueOf(0.5f);
        cqrp cqrpVar2 = d;
        return cqgr.gd(cqgr.aI(cgiu.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(e), cqgr.aJ(17), cqgr.bR(cqrpVar), cqgr.bG(cqrpVar), cqgr.gd(cqgr.bp(-2), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.aJ(16), cqgr.bV(cqrpVar2), cqgr.bD(cqrpVar2), cqgr.V(cgjd.a), cqgr.gq(cqgr.eM(cgje.a), cqgr.fh(cqrp.f(16.0d)))), cqgr.gd(cqgr.bp(-1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.aJ(17), cqgr.bR(cqrp.d(30.0d)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), e(cqgr.q(cgjf.a), cgjg.a, cqkz.a(cqrt.f(2131232636)), cgjh.a, cgji.a), e(cqgr.q(cgjj.a), cgjk.a, cqkz.a(cqrt.f(2131232580)), cgjl.a, cgiv.a), e(cqgr.q(cgiw.a), cgix.a, cqkz.a(cqrt.f(2131231781)), cgiy.a, cgiz.a))));
    }
}
