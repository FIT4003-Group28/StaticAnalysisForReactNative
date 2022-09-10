package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
/* compiled from: PG */
/* renamed from: cjmd  reason: default package */
/* loaded from: classes4.dex */
public final class cjmd extends cqiw<cjme> {
    public static final /* synthetic */ int a = 0;
    private final cqjb<cjme, Integer> b;
    private final boolean c;

    public cjmd(boolean z) {
        super(Boolean.valueOf(z));
        this.b = cjks.a;
        this.c = z;
    }

    private static cqmp<cjme> e(cqlc<cjme, Boolean> cqlcVar) {
        cqgq n = cqgr.n();
        n.f();
        n.j();
        n.h = cjlb.a;
        n.d = 250;
        n.a = Float.valueOf(1.0f);
        cqnf b = n.b();
        cqgq n2 = cqgr.n();
        n2.f();
        n2.j();
        n2.c();
        n2.h = cjlc.a;
        n2.d = 250;
        n2.a = Float.valueOf(0.0f);
        return cqjv.l(cqlcVar, b, n2.b());
    }

    @SafeVarargs
    private static cqmj<cjme> h(boolean z, cqlc<cjme, CharSequence> cqlcVar, cqlc<cjme, View.OnClickListener> cqlcVar2, cqlc<cjme, cjtd> cqlcVar3, cqlc<cjme, cqss> cqlcVar4, cqlc<cjme, cqss> cqlcVar5, final cqlc<cjme, cqss> cqlcVar6, cqmp<cjme>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = new cqmp[17];
        cqmpVarArr2[0] = cqgr.aF(cqjv.x(cqlcVar));
        cqmpVarArr2[1] = cqgr.cd(z ? -1 : 0);
        cqmpVarArr2[2] = z ? cqmp.e : cqgr.ca(Float.valueOf(0.5f));
        cqmpVarArr2[3] = cqgr.bp(-2);
        cqmpVarArr2[4] = ibq.r();
        cqmpVarArr2[5] = cqgr.eM(cqlcVar);
        cqmpVarArr2[6] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr2[7] = cqgr.eN(4);
        cqmpVarArr2[8] = cqgr.eW(cqlcVar5);
        cqmpVarArr2[9] = iue.c(cqlcVar3);
        cqmpVarArr2[10] = cqgr.cW(cqlcVar2);
        cqmpVarArr2[11] = hyw.O(cqlcVar4);
        cqmpVarArr2[12] = hyw.an(cqrp.d(40.0d));
        cqmpVarArr2[13] = hyw.ae(cqrp.d(20.0d));
        cqmpVarArr2[14] = hyw.Q(cqlcVar6);
        cqmpVarArr2[15] = hyw.S(new cqlc(cqlcVar6) { // from class: cjlm
            private final cqlc a;

            {
                this.a = cqlcVar6;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar7 = this.a;
                cjme cjmeVar = (cjme) cqkpVar;
                int i = cjmd.a;
                return cqrp.d(cqjv.v((cqss) ((cqlb) cqlcVar7).a).booleanValue() ? dcyn.a : 1.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[16] = hyw.aw(true);
        cqmj<cjme> D = hyw.D(cqmpVarArr2);
        D.f(cqmpVarArr);
        return D;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cjme cjmeVar, Context context, cqiv cqivVar) {
        cjme cjmeVar2 = cjmeVar;
        if (!bvpb.c(cjmeVar2.f())) {
            cqivVar.a(new cjmc(), cjmeVar2);
        }
        cqix<? extends cqkp> g = cjmeVar2.g();
        if (g != null) {
            cqivVar.e(g);
        }
        if (!bvpb.c(cjmeVar2.n())) {
            cqivVar.a(new cjlz(), cjmeVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cjme> a() {
        char c;
        cqmj<cjme> a2;
        int i;
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.bA(cqrp.d(16.0d));
        cqrp d = cqrp.d(6.0d);
        cqmpVarArr[3] = cqgr.dz(d, d, d, d);
        cqmpVarArr[4] = cqgr.P(false);
        cqmpVarArr[5] = cqgr.aJ(17);
        cqmpVarArr[6] = cqgr.z(ibl.a());
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = cqgr.cf(this.b);
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqqx.g(cqrp.d(16.0d));
        cqmpVarArr2[3] = cqqx.i(cqrp.d(3.0d));
        cqmpVarArr2[4] = cqgr.P(false);
        cqmpVarArr2[5] = cqqx.d(ibm.b());
        cqmp[] cqmpVarArr3 = new cqmp[6];
        cqmpVarArr3[0] = cqgr.cd(-1);
        cqmpVarArr3[1] = cqgr.bp(-2);
        cqmpVarArr3[2] = cqgr.dr(1);
        cqmpVarArr3[3] = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(16), cqgr.dr(1), cqgr.aF(cjln.a), FixedAspectRatioLayout.a(cqgr.aE(cjlo.a), itj.c(cjlp.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.gc(cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.eG(cjlq.a))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.dU(cqrp.d(20.0d)), cqgr.dB(cqrp.d(12.0d)), cqgr.gc(cqgr.bq(cqrp.d(24.0d)), cqgr.ce(cqrp.d(24.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.aF(cjlr.a), cqgr.eG(cjld.a)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bv(3), cqgr.eO(cjls.a), cqgr.aF(cjlt.a), cqgr.eM(cjlu.a), cqgr.aK(cjkt.a), cqgr.by(cjku.a), ibq.g(), cqgr.eU(ibm.t()))));
        cqmpVarArr3[4] = cqgr.fY(acnp.a(cqjv.f(acno.a, cjkv.a), cqgr.cZ(cjkw.a), cqgr.fu(true), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()))), iue.i(cqgr.bw(48), cqgr.aI(cjkx.a), e(cjky.a)), iue.h(cqgr.bw(80), cqgr.aI(cjkz.a), e(cjla.a)), cqgr.cd(-1), cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)));
        if (!this.c) {
            c = 2;
            a2 = jdg.a(cqgr.cd(-1), cqgr.bp(-2), f(false), f(true));
            i = 9;
        } else {
            a2 = f(true);
            i = 9;
            c = 2;
        }
        cqmp[] cqmpVarArr4 = new cqmp[i];
        cqmpVarArr4[0] = cqgr.cd(-1);
        cqmpVarArr4[1] = cqgr.bp(-2);
        cqmpVarArr4[c] = cqgr.dr(1);
        cqmpVarArr4[3] = cqgr.dQ(cqrp.d(20.0d));
        cqmpVarArr4[4] = cqgr.dF(cqrp.d(20.0d));
        cqmpVarArr4[5] = cqgr.dX(cjle.a);
        cqmpVarArr4[6] = cqgr.dB(cqrp.d(12.0d));
        cqmpVarArr4[7] = cqgr.aJ(16);
        cqmpVarArr4[8] = a2;
        cqmpVarArr3[5] = cqgr.gd(cqmpVarArr4);
        cqmpVarArr2[6] = cqgr.gd(cqmpVarArr3);
        cqmpVarArr[7] = cqqx.E(cqmpVarArr2);
        return cqgr.gd(cqmpVarArr);
    }

    private static cqmj<cjme> f(boolean z) {
        cqmj<cjme> h = h(z, cjlg.a, cjlh.a, cjli.a, cqkz.a(ibm.a()), cqkz.a(ibm.x()), cqkz.a(ibm.j()), z ? cqmp.e : cqgr.bI(cjlf.a));
        cqmj<cjme> h2 = h(z, cjlj.a, cjlk.a, cjll.a, cqkz.a(ibm.x()), cqkz.a(ibm.b()), cqkz.a(null), new cqmp[0]);
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dr(Integer.valueOf(z ? 1 : 0));
        cqmpVarArr[3] = true != z ? h : h2;
        if (true != z) {
            h = h2;
        }
        cqmpVarArr[4] = h;
        return cqgr.gd(cqmpVarArr);
    }
}
