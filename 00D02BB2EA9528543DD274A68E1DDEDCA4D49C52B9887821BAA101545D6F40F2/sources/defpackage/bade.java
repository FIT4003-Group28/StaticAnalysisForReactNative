package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bade  reason: default package */
/* loaded from: classes3.dex */
public final class bade extends cqiw<baee> {
    public static final cqtv a;
    private static final cqtv b;
    private static final cqtv c;
    private static final cqtv d;

    static {
        cqrp f = cqrp.f(16.0d);
        b = f;
        cqrp f2 = cqrp.f(12.0d);
        c = f2;
        cqrp d2 = cqrp.d(100.0d);
        d = d2;
        a = cqsg.k(d2, cqsg.d(f, f2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<baee> a() {
        cqmp[] cqmpVarArr = {cqgr.bp(-1), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.n(badb.a)};
        cqmp[] cqmpVarArr2 = {cqgr.bp(-1), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.eD(Integer.valueOf((int) R.drawable.set_overlay_gradient))};
        cqlc cqlcVar = badc.a;
        cqlc cqlcVar2 = badd.a;
        cqrp d2 = cqrp.d(12.0d);
        return cqgr.fY(cqgr.cd(-1), cqgr.bq(a), cqgr.cW(cqgr.q(bacz.a)), iue.c(bada.a), WebImageView.a(cqmpVarArr), cqgr.gc(cqmpVarArr2), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.bw(80), cqgr.dz(d2, d2, d2, d2), cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), ibq.z(), ibq.h(), cqgr.eU(ibl.b()), cqgr.eM(cqlcVar)), cqgr.gq(cqgr.aF(cqjv.x(cqlcVar2)), cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), ibq.z(), ibq.q(), cqgr.eU(ibl.b()), cqgr.eM(cqlcVar2))));
    }
}
