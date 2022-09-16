package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: clbg  reason: default package */
/* loaded from: classes5.dex */
public abstract class clbg extends FrameLayout {
    public final clbf a;

    public clbg(Context context) {
        super(context);
        this.a = new clbf(getContext());
    }

    public final void a() {
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    protected abstract boolean b(clbf clbfVar);

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            this.a.a(motionEvent, true);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a.a(motionEvent, false) && this.a.c(clbd.TOUCH)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean b = b(this.a);
        if (!b || !this.a.c(clbd.DOUBLE_TAP)) {
            return b;
        }
        clbf clbfVar = this.a;
        if (motionEvent.getActionMasked() == 1 && clbfVar.f == clbd.DOUBLE_TAP && clbfVar.b != null) {
            clbfVar.f("handle double tap ");
            clbfVar.b.onDoubleTap(motionEvent);
            clbfVar.b();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.a(motionEvent, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        clbf clbfVar = this.a;
        clbfVar.c.append(true != z ? '[' : ']');
        clbfVar.d = z;
        if (z) {
            clbfVar.e = false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public clbg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new clbf(getContext());
    }

    public clbg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new clbf(getContext());
    }
}
