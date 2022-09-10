package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends View> extends aji<V> {
    public amy a;
    public dafa f;
    private boolean g;
    public int b = 2;
    public float c = 0.5f;
    public float d = 0.0f;
    public float e = 0.5f;
    private final amx h = new czvp(this);

    public static float t(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.aji
    public boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = amy.a(coordinatorLayout, this.h);
            }
            return this.a.i(motionEvent);
        }
        return false;
    }

    @Override // defpackage.aji
    public final boolean d(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        amy amyVar = this.a;
        if (amyVar != null) {
            amyVar.j(motionEvent);
            return true;
        }
        return false;
    }

    @Override // defpackage.aji
    public final boolean f(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (od.l(v) == 0) {
            od.m(v, 1);
            od.p(v, ImageMetadata.SHADING_MODE);
            if (!s(v)) {
                return false;
            }
            od.aD(v, oy.h, new czvq(this));
            return false;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
