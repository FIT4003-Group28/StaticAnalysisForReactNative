package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
/* compiled from: PG */
/* renamed from: mkw  reason: default package */
/* loaded from: classes3.dex */
final class mkw extends View.AccessibilityDelegate {
    final /* synthetic */ fwn a;

    public mkw(fwn fwnVar) {
        this.a = fwnVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.isSelected());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ChipCloudView.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.isSelected());
    }
}
