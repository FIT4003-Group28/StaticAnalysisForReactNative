package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: czqp  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class czqp implements View.OnTouchListener {
    static final View.OnTouchListener a = new czqp();

    private czqp() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }
}
