package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: hpm  reason: default package */
/* loaded from: classes3.dex */
public final class hpm extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(true);
    }
}
