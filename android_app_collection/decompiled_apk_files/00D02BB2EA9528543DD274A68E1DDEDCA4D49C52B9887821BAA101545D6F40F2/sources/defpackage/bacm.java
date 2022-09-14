package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bacm  reason: default package */
/* loaded from: classes3.dex */
public final class bacm extends cqiw<baeu> {
    private static final cqtv a = cqrp.d(18.0d);
    private static final cqtv b = cqrp.d(6.0d);
    private static final cqtv c = cqrp.d(4.0d);
    private static final cqtv d = cqrp.d(100.0d);
    private static final cqtv e = cqrp.d(12.0d);
    private static final View.AccessibilityDelegate f = new bacl();

    public static void e(View view) {
        View view2;
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == view.getRootView()) {
                view2 = null;
                break;
            }
            if (parent instanceof View) {
                view2 = (View) parent;
                if (view2.getId() == R.id.saved_place_carousel_card) {
                    break;
                }
            }
            parent = parent.getParent();
        }
        if (view2 == null) {
            return;
        }
        Rect rect = new Rect();
        if (view2.getLocalVisibleRect(rect) && rect.width() == view2.getWidth()) {
            return;
        }
        ViewParent parent2 = view2.getParent();
        Rect rect2 = new Rect(0, 0, view2.getWidth(), view2.getHeight());
        while ((parent2 instanceof View) && !parent2.requestChildRectangleOnScreen(view2, rect2, false)) {
            rect2.offset(view2.getLeft() - view2.getScrollX(), view2.getTop() - view2.getScrollY());
            view2 = parent2;
            parent2 = view2.getParent();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<baeu> a() {
        View.AccessibilityDelegate accessibilityDelegate = f;
        return cqgr.gd(cqgr.aR(Integer.valueOf((int) R.id.saved_place_carousel_card)), cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.cW(cqgr.q(bacb.a)), cqgr.a(accessibilityDelegate), iue.c(bacc.a), cqgr.x(ibo.b()), WebImageView.a(cqgr.bq(d), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(bacd.a)), cqgr.gq(cqgr.bV(ibn.f()), cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.eM(bace.a), cqgr.eN(5), cqgr.co(cqrp.f(2.6d), true), ibq.i(), ibq.v(), ibq.z()), cqgr.gq(cqgr.bR(ibn.f()), cqgr.bG(ibn.f()), cqgr.eM(bacf.a), cqgr.eN(5), ibq.q(), ibq.y(), ibq.z())), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0), cqgr.cW(cqgr.q(bacg.a)), cqgr.a(accessibilityDelegate), iue.c(bach.a), cqgr.V(baci.a), cqgr.x(ibo.b()), cqgr.aJ(16), cqgr.dU(cqsg.d(ibn.d(), b)), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dB(cqsg.d(e, c)), cqgr.gc(cqgr.ch(a), cqgr.eG(bacj.a), cqgr.bG(ibn.d())), cqgr.gq(cqgr.eM(back.a), cqgr.eN(5), ibq.q(), ibq.y(), ibq.z())));
    }
}
