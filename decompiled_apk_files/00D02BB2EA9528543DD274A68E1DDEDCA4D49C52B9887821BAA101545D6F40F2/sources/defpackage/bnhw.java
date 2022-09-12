package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnhw  reason: default package */
/* loaded from: classes3.dex */
final class bnhw extends AccessibilityNodeProvider {
    final /* synthetic */ View a;

    public bnhw(View view) {
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
            ArrayList<View> arrayList = new ArrayList<>();
            if ((this.a instanceof ViewGroup) && Build.VERSION.SDK_INT >= 29) {
                ViewGroup viewGroup = (ViewGroup) this.a;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0 && childAt.getImportantForAccessibility() != 4) {
                        if (Build.VERSION.SDK_INT <= 21 || !childAt.isImportantForAccessibility()) {
                            if (childAt.getImportantForAccessibility() == 1) {
                                arrayList.add(childAt);
                            } else {
                                childAt.addChildrenForAccessibility(arrayList);
                            }
                        } else {
                            arrayList.add(childAt);
                        }
                    }
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                obtain.addChild(arrayList.get(i3));
            }
            return obtain;
        }
        return super.createAccessibilityNodeInfo(i);
    }
}
