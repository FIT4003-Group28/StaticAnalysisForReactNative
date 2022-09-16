package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: jrf  reason: default package */
/* loaded from: classes3.dex */
final class jrf extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setEnabled(false);
    }
}
