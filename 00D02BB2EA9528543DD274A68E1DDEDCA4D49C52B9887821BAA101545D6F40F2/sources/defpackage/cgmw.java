package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgmw  reason: default package */
/* loaded from: classes4.dex */
public final class cgmw extends cqiw<cgvz> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cgvz cgvzVar, Context context, cqiv cqivVar) {
        cqiw cgmvVar;
        List<? extends bopx> g;
        cgvz cgvzVar2 = cgvzVar;
        if (cgvzVar2.d().booleanValue()) {
            if (cgvzVar2.a().u().booleanValue()) {
                cgmvVar = new cgmk();
                g = cgvzVar2.a().j(true);
            } else {
                cgmvVar = new cgmv();
                g = cgvzVar2.a().g();
            }
            cqivVar.f(cgmvVar, g);
        }
        if (cgvzVar2.e().booleanValue()) {
            cgmt cgmtVar = new cgmt();
            bopv b = cgvzVar2.b();
            dbsk.s(b);
            cqivVar.a(cgmtVar, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cgvz> a() {
        cqrp d = cqrp.d(15.0d);
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqgr.dr(1), cqgr.ck(C()), cqgr.aF(cgma.a)};
        cqlc a = cqkz.a("");
        final cqlc q = cqgr.q(cgmb.a);
        final cqlc a2 = cqkz.a(null);
        cqmp[] cqmpVarArr2 = {cqgr.aQ(cgmc.a), cqgr.eX(irg.j()), iue.b(cjtd.a(dtyd.W))};
        cqmj gq = cqgr.gq(cqgr.dU(cqrp.f(15.0d)), cqgr.dB(cqrp.f(5.0d)), cqgr.dQ(cqrp.f(4.0d)), cqjv.l(new cqlc(q) { // from class: cgjt
            private final cqlc a;

            {
                this.a = q;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(this.a.a(cqkpVar) == null);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, cqgr.cH(cqrp.d(dcyn.a)), cqgr.cH(irh.a())), cqgr.eN(5), cqgr.ca(valueOf), cqgr.eM(a), cqgr.fh(cqrp.f(16.0d)), cqgr.eB(true), cqgr.eU(irg.j()), cqgr.K(new cqlc(q) { // from class: cgju
            private final cqlc a;

            {
                this.a = q;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(this.a.a(cqkpVar) != null);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cW(q));
        gq.f(cqmpVarArr2);
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(itd.b(irg.a(), irg.j(), cqrp.d(dcyn.a), cqrp.d(dcyn.a), cqrp.d(dcyn.a), cqrp.d(1.0d))), gq, cqgr.gb(cqgr.aF(new cqlc(a2) { // from class: cgjv
            private final cqlc a;

            {
                this.a = a2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(((cqlb) this.a).a == null);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_CLEAR)), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.bw(8388629), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.x(irn.J()), cqgr.eE(cqrt.g(2131231563, irg.j())), cqgr.cW(a2)), cqgr.gc(cqgr.aG(false), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388629), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eD(2131231309), cqgr.T(cqrt.l(R.string.UGC_TASKS_ACCESSIBILITY_COMPLETED))));
        gd.f(cqgr.aI(cgmd.a));
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(d, d, d, d), cqgr.dU(cqrp.d(8.0d)), cqgr.dB(cqrp.d(28.0d)), cqgr.z(irg.a()), cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.ca(valueOf), cqgr.gd(cqmpVarArr), gd), cqgr.gd(cqgr.bp(-1), cqgr.cd(-2), cqgr.aJ(16), cqgr.gc(cqgr.aI(cgme.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388629), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eD(2131231309), cqgr.T(cqrt.l(R.string.UGC_TASKS_ACCESSIBILITY_COMPLETED))), cqgr.fY(cqgr.aI(cgmf.a), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.bw(8388629), cqgr.cW(cqgr.q(cgmg.a)), cqgr.T(cqrt.l(R.string.UGC_TASKS_PLACE_SHEET_EDIT_LINK_TEXT)), cqgr.gc(cqgr.cd(-2), cqgr.dQ(cqrp.d(24.0d)), cqgr.bw(8388613), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.fm(irg.k()), cqgr.eE(iut.a(cqrt.f(2131231710)))))));
    }
}
