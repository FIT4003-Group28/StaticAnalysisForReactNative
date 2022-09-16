package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zcy  reason: default package */
/* loaded from: classes4.dex */
public final class zcy extends yh {
    final /* synthetic */ zda a;

    public zcy(zda zdaVar) {
        this.a = zdaVar;
    }

    @Override // defpackage.yh, defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView == this.a.b && motionEvent.getAction() == 0) {
            for (SwipeLayout swipeLayout : this.a.a) {
                if (swipeLayout.isAttachedToWindow()) {
                    Rect rect = new Rect();
                    swipeLayout.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f)) && swipeLayout.r()) {
                        swipeLayout.f();
                    }
                }
            }
        }
        return false;
    }
}
