package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TouchDelegate;
/* compiled from: PG */
/* renamed from: yqf  reason: default package */
/* loaded from: classes7.dex */
public final class yqf extends jgi {
    private boolean a;

    public yqf(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        if (findViewById(yqw.b) == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.a) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            if (getTouchDelegate() != null) {
                return getTouchDelegate().onTouchEvent(motionEvent);
            }
        }
        if (motionEvent.getAction() != 0 || (touchDelegate = getTouchDelegate()) == null || !touchDelegate.onTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.a = true;
        return true;
    }
}
