package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atpu  reason: default package */
/* loaded from: classes2.dex */
public class atpu extends atpy<atxy> {
    private final Boolean n() {
        return cqjv.r(E(), cqjv.u(((atxy) B()).v()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<atxy> a() {
        cqss H = ibl.H();
        cqss I = ibl.I();
        return e(new atpt(H, I), H, I);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<atxy> e(cqiw<izo> cqiwVar, cqss cqssVar, cqss cqssVar2) {
        cqss b = ibl.b();
        cqmp[] cqmpVarArr = {i(cqssVar, ibl.b(), dbsg.i(cqiwVar))};
        Boolean n = n();
        Float valueOf = Float.valueOf(0.0f);
        cqmn a = cqmn.a(cqgr.cd(-2), cqgr.ca(valueOf));
        cqmp[] cqmpVarArr2 = {cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f))};
        cqmp[] cqmpVarArr3 = {cqgr.aR(Integer.valueOf((int) R.id.prompt_button_expansion_box)), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(cqssVar2)};
        cqsn h = ((atxy) B()).h();
        String i = ((atxy) B()).i();
        cqmp[] cqmpVarArr4 = {cqgr.aR(Integer.valueOf((int) R.id.prompt_button_expansion_text)), cqgr.i(valueOf)};
        cqmj gq = cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.s()), ibq.z(), ibq.r(), cqgr.fh(cqrp.d(18.0d)), cqgr.aZ(false), cqgr.eU(b), cqgr.eJ(h));
        cqmj gj = cqgr.gj(cqjv.k(cqjv.r(atpy.E(), cqjv.u(((atxw) B()).v())), cqgr.cd(-2), cqgr.cd(-1)), cqgr.bp(-1), cqjv.m(super.m(), cqmn.a(cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d))), cqmn.a(cqgr.dQ(cqrp.d(2.0d)), cqgr.dF(cqrp.d(2.0d)))), cqgr.aT(atpy.a), cqgr.gc(cqgr.bY(cqjd.D(gq), cqjd.n(gq)), cqgr.ce(atpy.d), cqgr.bq(atpy.d), cqgr.dF(cqrp.d(8.0d)), cqgr.fm(b), cqgr.eF(atpy.k())), gq, cqgr.gq(cqic.a(cqjv.v(i), new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.v(gq), cqjd.s()), ibq.z(), ibq.r(), cqgr.fh(cqrp.d(18.0d)), cqgr.aZ(false), cqgr.eU(b), cqgr.eI(i)));
        gj.f(cqmpVarArr4);
        cqmp[] cqmpVarArr5 = {cqgr.L(false), cqgr.aG(((atxy) B()).r()), cqgr.cd(-1), cqgr.bp(-1), cqgr.fY(cqmpVarArr3), gj};
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.cU(((atxy) B()).c()), iue.b(((atxy) B()).l()), cqjv.j(iug.LOGGED_IMPRESSION_SINK, ((atxy) B()).f()));
        fY.f(cqmpVarArr);
        return cqgr.fY(cqgr.L(false), cqgr.P(false), cqgr.bq(atpy.e), cqjv.m(n, a, cqmn.a(cqmpVarArr2)), cqjv.k(n(), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dQ(irh.c())), cqgr.dF(irh.c()), cqgr.fY(cqmpVarArr5), fY);
    }
}
