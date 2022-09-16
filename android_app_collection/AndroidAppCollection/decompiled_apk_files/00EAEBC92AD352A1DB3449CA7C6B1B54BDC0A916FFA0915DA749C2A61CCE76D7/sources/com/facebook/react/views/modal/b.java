package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.i;
/* loaded from: classes.dex */
class b extends i {
    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(b0 b0Var, int i) {
        super.a(b0Var, i);
        Point a2 = a.a(i());
        b0Var.b(a2.x);
        b0Var.a(a2.y);
    }
}
