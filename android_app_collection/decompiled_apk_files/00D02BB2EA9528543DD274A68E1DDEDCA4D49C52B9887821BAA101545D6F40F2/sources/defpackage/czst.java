package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: czst  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class czst implements View.OnTouchListener {
    static final View.OnTouchListener a = new czst();

    private czst() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.setPressed(true);
        } else if (motionEvent.getAction() == 1) {
            view.performClick();
            view.setPressed(false);
        }
        return false;
    }
}
