package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: beec  reason: default package */
/* loaded from: classes3.dex */
final class beec extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = iArr[1];
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }
}
