package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: actr  reason: default package */
/* loaded from: classes2.dex */
final class actr implements View.OnTouchListener {
    final /* synthetic */ acts a;
    private int b = -1;

    public actr(acts actsVar) {
        this.a = actsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int scrollX = view.getScrollX();
        int action = motionEvent.getAction();
        if (action == 1) {
            acli d = this.a.d();
            int a = jmj.a(view.getContext(), 160);
            if (d != null && Math.abs(scrollX - this.b) > a) {
                this.a.d.Q(aclj.a(d), scrollX > this.b ? dead.LEFT : dead.RIGHT);
                this.b = scrollX;
            }
            view.performClick();
        } else if (action == 3) {
            this.b = scrollX;
        } else if (this.b == -1) {
            this.b = scrollX;
        }
        return view.onTouchEvent(motionEvent);
    }
}
