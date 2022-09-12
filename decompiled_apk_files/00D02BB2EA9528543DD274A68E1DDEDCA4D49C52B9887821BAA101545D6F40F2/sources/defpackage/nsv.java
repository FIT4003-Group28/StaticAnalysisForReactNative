package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: nsv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nsv implements View.OnTouchListener {
    static final View.OnTouchListener a = new nsv();

    private nsv() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.performClick();
        return false;
    }
}
