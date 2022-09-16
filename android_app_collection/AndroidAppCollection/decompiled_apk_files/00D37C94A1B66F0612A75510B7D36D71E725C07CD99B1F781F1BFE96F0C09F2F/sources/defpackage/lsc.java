package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: lsc  reason: default package */
/* loaded from: classes3.dex */
final class lsc extends yh {
    final /* synthetic */ lse a;

    public lsc(lse lseVar) {
        this.a = lseVar;
    }

    @Override // defpackage.yh, defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        lse lseVar = this.a;
        if (recyclerView == lseVar.b && lseVar.e != null) {
            Rect rect = new Rect();
            this.a.e.b.getGlobalVisibleRect(rect);
            if (rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f))) {
                return false;
            }
            lsl lslVar = this.a.e;
            lslVar.c.clearFocus();
            zag.i(lslVar.c);
            if (lslVar.g.length() == 0 && lslVar.i && !lslVar.f) {
                lslVar.f();
            }
            this.a.d();
        }
        return false;
    }
}
