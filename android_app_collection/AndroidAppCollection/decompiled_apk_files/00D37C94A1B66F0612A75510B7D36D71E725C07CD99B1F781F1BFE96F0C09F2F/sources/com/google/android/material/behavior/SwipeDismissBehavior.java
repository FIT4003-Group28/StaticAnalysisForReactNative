package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SwipeDismissBehavior extends ajc {
    public amk a;
    public aloa f;
    private boolean g;
    public int b = 2;
    public float c = 0.5f;
    public float d = 0.0f;
    public float e = 0.5f;
    private final amj h = new aliy(this);

    public static float u(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.ajc
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = amk.b(coordinatorLayout, this.h);
            }
            return this.a.k(motionEvent);
        }
        return false;
    }

    @Override // defpackage.ajc
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (lj.c(view) == 0) {
            lj.V(view, 1);
            lj.J(view, 1048576);
            if (!t(view)) {
                return false;
            }
            lj.at(view, mf.g, new aliz(this));
            return false;
        }
        return false;
    }

    @Override // defpackage.ajc
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        amk amkVar = this.a;
        if (amkVar != null) {
            amkVar.f(motionEvent);
            return true;
        }
        return false;
    }

    public boolean t(View view) {
        return true;
    }
}
