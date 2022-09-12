package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: ipz  reason: default package */
/* loaded from: classes6.dex */
final class ipz extends ace {
    final /* synthetic */ iqd a;
    private float b = -1.0f;
    private float c;

    public ipz(iqd iqdVar) {
        this.a = iqdVar;
    }

    @Override // defpackage.ace, defpackage.abw
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        int computeHorizontalScrollRange;
        Runnable runnable;
        int s = od.s(recyclerView);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = motionEvent.getX();
            if (s == 0) {
                computeHorizontalScrollRange = this.a.computeHorizontalScrollOffset();
            } else {
                computeHorizontalScrollRange = (this.a.computeHorizontalScrollRange() - this.a.computeHorizontalScrollOffset()) - this.a.computeHorizontalScrollExtent();
            }
            this.c = computeHorizontalScrollRange;
            return false;
        } else if (actionMasked != 1 && actionMasked != 3) {
            return false;
        } else {
            if (this.b != -1.0f) {
                float x = ((motionEvent.getX() - this.b) / this.a.getWidth()) * this.a.computeHorizontalScrollExtent();
                if ((s == 0 ? this.c - x : this.c + x) < (-this.a.computeHorizontalScrollExtent()) / 3 && (runnable = this.a.S) != null) {
                    runnable.run();
                }
            }
            this.b = -1.0f;
            return false;
        }
    }
}
