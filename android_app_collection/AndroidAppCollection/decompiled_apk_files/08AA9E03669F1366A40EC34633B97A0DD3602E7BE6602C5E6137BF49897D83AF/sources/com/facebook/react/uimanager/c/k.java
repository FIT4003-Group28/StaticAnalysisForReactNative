package com.facebook.react.uimanager.c;

import android.view.View;
import android.view.animation.Animation;
/* compiled from: LayoutUpdateAnimation.java */
/* loaded from: classes.dex */
class k extends a {
    @Override // com.facebook.react.uimanager.c.a
    boolean a() {
        return this.f3841b > 0;
    }

    @Override // com.facebook.react.uimanager.c.a
    Animation a(View view, int i, int i2, int i3, int i4) {
        boolean z = true;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        if (view.getWidth() == i3 && view.getHeight() == i4) {
            z = false;
        }
        if (z2 || z) {
            return new m(view, i, i2, i3, i4);
        }
        return null;
    }
}
