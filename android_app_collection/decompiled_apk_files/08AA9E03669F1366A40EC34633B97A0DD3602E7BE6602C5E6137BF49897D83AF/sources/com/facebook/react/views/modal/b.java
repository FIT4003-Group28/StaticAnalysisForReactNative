package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.x;
/* compiled from: ModalHostShadowNode.java */
/* loaded from: classes.dex */
class b extends g {
    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void addChildAt(x xVar, int i) {
        super.addChildAt(xVar, i);
        Point a2 = a.a(getThemedContext());
        xVar.setStyleWidth(a2.x);
        xVar.setStyleHeight(a2.y);
    }
}
