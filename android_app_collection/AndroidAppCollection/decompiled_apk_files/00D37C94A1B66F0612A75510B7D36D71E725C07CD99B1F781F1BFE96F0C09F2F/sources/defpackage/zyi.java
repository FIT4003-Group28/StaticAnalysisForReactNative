package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ToggleButton;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
/* compiled from: PG */
/* renamed from: zyi  reason: default package */
/* loaded from: classes4.dex */
public final class zyi extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setChecked(((SegmentedControlSegment) view).isChecked());
        accessibilityNodeInfo.setEnabled(true);
    }
}
