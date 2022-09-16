package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: afov  reason: default package */
/* loaded from: classes.dex */
public final class afov extends CoordinatorLayout {
    public afps i;

    public afov(Context context) {
        super(context);
    }

    private final boolean p() {
        afps afpsVar = this.i;
        if (afpsVar == null || afpsVar.d.t == 5) {
            return false;
        }
        afpsVar.b();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (p()) {
            return true;
        }
        performClick();
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        p();
        return super.performClick();
    }
}
