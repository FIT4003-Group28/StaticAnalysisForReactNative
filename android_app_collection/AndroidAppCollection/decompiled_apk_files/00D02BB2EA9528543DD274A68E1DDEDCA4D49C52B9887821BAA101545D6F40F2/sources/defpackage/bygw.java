package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: bygw  reason: default package */
/* loaded from: classes4.dex */
public final class bygw extends LinearLayout {
    private boolean a;

    public bygw(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() <= 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        View childAt = getChildAt(0);
        motionEvent.offsetLocation(-childAt.getLeft(), -childAt.getTop());
        int action = motionEvent.getAction();
        if (this.a) {
            if (action == 1 || action == 3) {
                this.a = false;
            }
            return childAt.dispatchTouchEvent(motionEvent);
        } else if (action != 0 || !jmw.a(childAt, motionEvent.getX(), motionEvent.getY())) {
            return false;
        } else {
            this.a = true;
            return childAt.dispatchTouchEvent(motionEvent);
        }
    }

    public bygw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
