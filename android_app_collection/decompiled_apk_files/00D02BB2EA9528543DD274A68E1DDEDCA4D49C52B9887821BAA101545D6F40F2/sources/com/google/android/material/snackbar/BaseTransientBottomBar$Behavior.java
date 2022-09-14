package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final dafc g = new dafc(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.aji
    public final boolean c(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        dafc dafcVar = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                dafn.a().f(dafcVar.a);
            }
        } else if (coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            dafn.a().e(dafcVar.a);
        }
        return super.c(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        return view instanceof dafe;
    }
}
