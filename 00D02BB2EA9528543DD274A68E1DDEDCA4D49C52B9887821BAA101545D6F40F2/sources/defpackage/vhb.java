package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: vhb  reason: default package */
/* loaded from: classes7.dex */
public final class vhb extends jgi {
    public vhb(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            requestDisallowInterceptTouchEvent(true);
            ViewParent parent = getParent();
            while (!(parent instanceof jkn)) {
                if (parent != null) {
                    parent = parent.getParent();
                } else {
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
            if (parent.getParent() != null) {
                parent.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public vhb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public vhb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
