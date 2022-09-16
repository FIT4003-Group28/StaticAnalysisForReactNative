package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
/* compiled from: PG */
/* renamed from: ajye  reason: default package */
/* loaded from: classes.dex */
final class ajye extends TouchDelegate {
    public ajye(Rect rect, View view) {
        super(rect, view);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!onTouchEvent || motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
        return true;
    }
}
