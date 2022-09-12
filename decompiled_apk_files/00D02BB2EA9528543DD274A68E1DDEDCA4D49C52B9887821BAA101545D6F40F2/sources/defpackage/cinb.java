package defpackage;

import android.graphics.Color;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.layout.FixedAspectRatioLayout;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cinb  reason: default package */
/* loaded from: classes4.dex */
final class cinb extends cqiw<cinc> {
    private static cqnf<cinc> e(boolean z) {
        float f = true != z ? 1.0f : 0.8f;
        cqgq a = itj.a();
        Float valueOf = Float.valueOf(f);
        a.f = valueOf;
        a.g = valueOf;
        a.d = 0;
        return a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cinc> a() {
        Float valueOf = Float.valueOf(1.0f);
        return FixedAspectRatioLayout.a(itj.b(valueOf), cqgr.bA(cqrp.d(1.0d)), cqgr.z(ibm.u()), iue.c(cimi.a), cqgr.J(true), cqgr.cW(cqgr.q(cims.a)), WebImageView.a(cqgr.cd(-1), cqgr.bp(-1), cqjv.l(cimt.a, e(true), e(false)), WebImageView.l(cimu.a), cqgr.x(ibm.b()), cqgr.ei(ImageView.ScaleType.CENTER_CROP)), cqgr.gs(cqgr.aI(cimv.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.A(Integer.valueOf(Color.argb(153, 33, 33, 33)))), cqgr.gq(cqgr.aI(cimw.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(16), cqgr.eK(cqiq.f(R.plurals.TODO_PHOTO_MORE_PHOTOS, cimx.a, cqiq.h(cimy.a))), cqgr.eN(4), ibq.p(), cqgr.eU(ibl.b())), cqgr.gc(cqgr.aF(cimz.a), cqgr.bw(8388659), cqjv.n(cina.a, cqmn.a(cqgr.ch(cqrp.d(24.0d)), cqgr.bA(cqrp.d(5.0d)), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.TODO_PHOTO_ACCESSIBILITY_UNSELECT_PHOTO_WITH_PLACE), cqiq.h(cimj.a), cqiq.h(cimk.a))), cqgr.i(valueOf), cqgr.eD(Integer.valueOf((int) R.drawable.checked))), cqmn.a(cqgr.ch(cqrp.d(20.0d)), cqgr.bA(cqrp.d(7.0d)), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.TODO_PHOTO_ACCESSIBILITY_SELECT_PHOTO_WITH_PLACE), cqiq.h(ciml.a), cqiq.h(cimm.a))), cqgr.i(valueOf), cqgr.eD(Integer.valueOf((int) R.drawable.photo_unselect))))), cqgr.gj(cqgr.aF(cimn.a), cqgr.aW(1), cqgr.J(true), iue.c(cimo.a), cqgr.cW(cqgr.q(cimp.a)), cqgr.bw(8388693), cqgr.aJ(8388693), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.TODO_PHOTO_ACCESSIBILITY_EXPAND_PHOTO_WITH_PLACE), cqiq.h(cimq.a), cqiq.h(cimr.a))), cqgr.gc(cqgr.ch(cqrp.d(26.0d)), cqgr.bA(cqrp.d(9.0d)), cqgr.i(valueOf), cqgr.eD(Integer.valueOf((int) R.drawable.fullscreen)), cqgr.ei(ImageView.ScaleType.FIT_END))));
    }
}
