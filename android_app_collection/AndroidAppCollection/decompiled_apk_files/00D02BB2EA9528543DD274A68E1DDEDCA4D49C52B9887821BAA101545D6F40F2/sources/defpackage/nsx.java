package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: nsx  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nsx implements View.OnTouchListener {
    static final View.OnTouchListener a = new nsx();

    private nsx() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.performClick();
        return false;
    }
}
