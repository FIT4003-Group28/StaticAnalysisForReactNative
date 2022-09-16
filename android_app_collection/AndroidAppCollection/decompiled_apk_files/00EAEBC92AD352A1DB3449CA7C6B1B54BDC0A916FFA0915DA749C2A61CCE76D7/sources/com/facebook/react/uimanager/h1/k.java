package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
/* loaded from: classes.dex */
class k extends a {
    @Override // com.facebook.react.uimanager.h1.a
    boolean a() {
        return this.f5937d > 0;
    }

    @Override // com.facebook.react.uimanager.h1.a
    Animation b(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        if (view.getWidth() != i3 || view.getHeight() != i4) {
            z = true;
        }
        if (z2 || z) {
            return new m(view, i, i2, i3, i4);
        }
        return null;
    }
}
