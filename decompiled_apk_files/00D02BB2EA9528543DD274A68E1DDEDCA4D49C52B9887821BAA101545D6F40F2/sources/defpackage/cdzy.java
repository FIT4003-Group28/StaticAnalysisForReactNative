package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: cdzy  reason: default package */
/* loaded from: classes4.dex */
final class cdzy implements View.OnTouchListener {
    public static final cdzy a = new cdzy();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dzvx.b(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            dzvx.b(view, "v");
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        return false;
    }
}
