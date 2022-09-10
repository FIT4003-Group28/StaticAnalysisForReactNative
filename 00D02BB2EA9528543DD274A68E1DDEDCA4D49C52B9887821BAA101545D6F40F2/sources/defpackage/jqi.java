package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import java.util.List;
/* compiled from: PG */
/* renamed from: jqi  reason: default package */
/* loaded from: classes7.dex */
public final class jqi extends cqiw<jrg> {
    private static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, jrg jrgVar, Context context, cqiv cqivVar) {
        cqnf ce;
        int i2;
        cqnf cqnfVar;
        jrg jrgVar2 = jrgVar;
        List<jrf> e = jrgVar2.e(2);
        float f = 0.0f;
        if (e.isEmpty()) {
            cqnfVar = cqgr.cd(-1);
        } else {
            if (e.size() == 1) {
                ce = cqgr.ce(cqrp.d(144.0d));
                f = 16.0f;
                i2 = 144;
            } else {
                ce = cqgr.ce(cqrp.d(112.0d));
                i2 = 88;
            }
            float f2 = i2;
            cqivVar.f(new jqd(new Object[]{Float.valueOf(f2)}, f2), e);
            cqnfVar = ce;
        }
        cqivVar.a(new jqh(new Object[]{cqnfVar, Float.valueOf(f)}, cqnfVar, f), jrgVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jrg> a() {
        cqjg cqjgVar = a;
        return cqqx.E(cqgr.ce(cqrp.d(304.0d)), cqgr.bp(-2), cqgr.bV(cqrp.d(8.0d)), cqgr.bR(cqrp.d(4.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.bD(cqrp.d(8.0d)), cqqx.g(cqrp.d(2.0d)), cqqx.i(cqrp.d(4.0d)), cqqx.d(irg.a()), cqgr.cW(cqgr.q(jpt.a)), iue.c(jpu.a), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.gj(cqgr.cd(-1), cqgr.bq(cqrp.d(88.0d)), cqgr.bR(cqrp.d(16.0d)), cqgr.bD(cqrp.d(8.0d)), iue.f(cqgr.bY(cqjd.e(), cqjd.i(), cqjd.y(cqjgVar)), cqgr.bG(cqrp.d(16.0d)), cqgr.dU(cqrp.d(16.0d)), cqgr.dC(0), cqgr.bp(-2), cqgr.fh(cqrp.f(15.0d)), cqgr.fe(irn.b), cqgr.l(true), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(jpv.a)), iue.f(cqgr.bp(-2), cqgr.bG(cqrp.d(16.0d)), cqgr.dU(cqrp.d(12.0d)), cqgr.dC(0), cqgr.bY(cqjd.t(), cqjd.e(), cqjd.y(cqjgVar)), cqgr.fh(cqrp.f(15.0d)), cqgr.fe(irn.e), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(jpw.a)), jfb.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.bD(cqrp.d(6.0d)), cqgr.bY(cqjd.j(), cqjd.e()), jfb.f(jfo.d), jfb.c(jpx.a)), iue.f(cqgr.cd(-2), cqgr.bp(-2), cqgr.bG(cqrp.d(40.0d)), cqgr.bD(cqrp.d(4.0d)), cqgr.bY(cqjd.y(cqjgVar), cqjd.j()), irn.m(), cqgr.eM(jpy.a)), WebImageView.a(cqgr.aT(cqjgVar), cqgr.ce(cqrp.d(96.0d)), cqgr.bY(cqjd.f(), cqjd.i(), cqjd.j()), cqgr.bV(cqrp.d(8.0d)), cqgr.bG(cqrp.d(16.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(jpz.a))), jef.a(cqgr.cd(-1), cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d)), irn.m(), irn.v(), cqgr.co(cqrp.f(2.0d), false), cqgr.eN(5), itj.d(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(jqa.a)), iuh.b(cqgr.bV(cqrp.d(16.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d))), cqgr.gd(cqgr.cd(-1), cqgr.bq(cqrp.d(48.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.ck(C()))));
    }
}
