package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: tgr  reason: default package */
/* loaded from: classes4.dex */
public final class tgr extends yh {
    private boolean a = false;
    private boolean b = false;

    @Override // defpackage.yh, defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        xw xwVar;
        if (!this.a) {
            this.a = true;
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else if ((parent instanceof RecyclerView) && (xwVar = ((RecyclerView) parent).n) != null && xwVar.ae()) {
                    z = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            this.b = z;
        }
        if (this.b && motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
