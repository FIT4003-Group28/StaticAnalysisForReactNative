package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final aloc g = new aloc(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ajc
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        aloc alocVar = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                alok.a().f(alocVar.a);
            }
        } else if (coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            alok.a().e(alocVar.a);
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean t(View view) {
        return view instanceof alod;
    }
}
