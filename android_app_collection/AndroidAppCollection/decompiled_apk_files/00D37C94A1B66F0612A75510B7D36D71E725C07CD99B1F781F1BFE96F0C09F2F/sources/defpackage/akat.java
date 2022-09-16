package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: akat  reason: default package */
/* loaded from: classes.dex */
final class akat extends View.AccessibilityDelegate {
    final /* synthetic */ akaw a;

    public akat(akaw akawVar) {
        this.a = akawVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.g);
    }
}
