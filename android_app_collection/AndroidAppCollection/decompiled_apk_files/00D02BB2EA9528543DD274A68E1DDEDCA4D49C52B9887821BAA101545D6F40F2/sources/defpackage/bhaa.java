package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
/* compiled from: PG */
/* renamed from: bhaa  reason: default package */
/* loaded from: classes3.dex */
final class bhaa extends AccessibilityNodeProvider {
    final /* synthetic */ View a;

    public bhaa(View view) {
        this.a = view;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return this.a.performAccessibilityAction(i2, bundle);
        }
        return super.performAction(i, i2, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        if (i == -1 || i == 0) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.a);
            this.a.onInitializeAccessibilityNodeInfo(obtain);
            Rect rect = new Rect();
            obtain.getBoundsInScreen(rect);
            int[] iArr = {0, 0};
            this.a.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            rect.top = iArr[1];
            obtain.setBoundsInScreen(rect);
            return obtain;
        }
        return super.createAccessibilityNodeInfo(i);
    }
}
