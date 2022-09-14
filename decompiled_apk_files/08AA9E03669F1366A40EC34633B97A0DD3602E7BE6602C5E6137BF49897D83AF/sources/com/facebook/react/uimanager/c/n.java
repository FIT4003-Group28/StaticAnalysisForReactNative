package com.facebook.react.uimanager.c;

import android.view.animation.Interpolator;
/* compiled from: SimpleSpringInterpolator.java */
/* loaded from: classes.dex */
class n implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (float) ((Math.pow(2.0d, (-10.0f) * f) * Math.sin((((f - 0.125f) * 3.141592653589793d) * 2.0d) / 0.5d)) + 1.0d);
    }
}
