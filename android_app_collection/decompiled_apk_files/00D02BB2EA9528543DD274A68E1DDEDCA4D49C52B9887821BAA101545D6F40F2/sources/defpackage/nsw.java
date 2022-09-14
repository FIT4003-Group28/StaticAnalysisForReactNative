package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: nsw  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nsw implements View.OnTouchListener {
    static final View.OnTouchListener a = new nsw();

    private nsw() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.performClick();
        return false;
    }
}
