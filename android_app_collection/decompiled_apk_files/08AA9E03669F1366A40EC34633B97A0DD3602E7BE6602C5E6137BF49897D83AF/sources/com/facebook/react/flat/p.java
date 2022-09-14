package com.facebook.react.flat;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
/* compiled from: FlatReactModalShadowNode.java */
/* loaded from: classes.dex */
class p extends q {

    /* renamed from: d  reason: collision with root package name */
    private final Point f3408d = new Point();
    private final Point e = new Point();
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
        d();
        a();
    }

    @Override // com.facebook.react.flat.q, com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    @TargetApi(16)
    public void addChildAt(com.facebook.react.uimanager.x xVar, int i) {
        int i2;
        int i3;
        super.addChildAt(xVar, i);
        Display defaultDisplay = ((WindowManager) getThemedContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(this.f3408d, this.e);
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0 || rotation == 2) {
            i2 = this.f3408d.x;
            i3 = this.e.y;
        } else {
            i2 = this.e.x;
            i3 = this.f3408d.y;
        }
        xVar.setStyleWidth(i2);
        xVar.setStyleHeight(i3);
    }

    @Override // com.facebook.react.uimanager.x
    public void setPadding(int i, float f) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.e == YogaUnit.POINT && stylePadding.f4287d == f) {
            return;
        }
        super.setPadding(i, f);
        this.f = true;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.x
    public void setPaddingPercent(int i, float f) {
        YogaValue stylePadding = getStylePadding(i);
        if (stylePadding.e == YogaUnit.PERCENT && stylePadding.f4287d == f) {
            return;
        }
        super.setPadding(i, f);
        this.f = true;
        markUpdated();
    }
}
