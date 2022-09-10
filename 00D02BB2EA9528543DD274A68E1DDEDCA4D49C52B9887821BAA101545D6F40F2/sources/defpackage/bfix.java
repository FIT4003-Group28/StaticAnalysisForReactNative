package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: bfix  reason: default package */
/* loaded from: classes3.dex */
public final class bfix extends cqiw<bfkk> {
    public static final cqjg a = cqjg.a();
    private static final cqtd b = new bfiw(new Object[0]);

    private static cqtv e() {
        return cqsv.f(dcyn.a, dcyn.a, 48.0d, dcyn.a);
    }

    @Override // defpackage.cqiw
    protected final Type ND() {
        return bfkk.class;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bfkk bfkkVar, Context context, cqiv cqivVar) {
        cqix<? extends cqkp> C;
        bfkk bfkkVar2 = bfkkVar;
        if (i != 0) {
            if (i != 1 || (C = bfkkVar2.C()) == null) {
                return;
            }
            cqivVar.e(C);
            return;
        }
        cqix<? extends cqkp> r = bfkkVar2.r();
        if (r == null) {
            return;
        }
        cqivVar.e(r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfkk> a() {
        return FixedAspectRatioLayout.a(cqgr.aT(a), itj.p(bfik.a), cqgr.cd(-1), cqgr.bp(-2), itj.c(bfin.a), cqgr.fY(cqgr.cd(-1), cqgr.gc(cqic.f(bfio.a, new cqmp[0]), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.eG(bfip.a)), cqgr.fY(cqgr.L(true), cqgr.aI(bfiq.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.bw(17), cqgr.ck(D(1)))), cqgr.fY(cqic.f(bfir.a, new cqmp[0]), cqgr.B(bfis.a), cqgr.L(false), cqgr.fR(new gtl(), bfit.a, new cqmp[0]), cqgr.fY(cqgr.bR(e()), cqgr.bG(e()), cqgr.gd(cqgr.bp(-2), cqgr.bw(80), cqgr.dr(1), cqmp.e), cqgr.gd(cqgr.bp(-2), cqgr.bw(8388691), cqgr.bR(cqrp.d(16.0d)), cqgr.bD(cqrp.d(16.0d)), cqgr.dr(1), cqgr.aI(bfiu.a), cqgr.ck(D(0))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(8388693), cqgr.bR(cqrp.d(16.0d)), cqgr.bD(cqrp.d(11.0d)), cqgr.dr(1), cqgr.aI(bfiv.a), cqgr.ck(D(1))))), cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(100.0d)), cqgr.x(b), cqgr.j(bfil.a), cqgr.fs(bfim.a)));
    }
}
