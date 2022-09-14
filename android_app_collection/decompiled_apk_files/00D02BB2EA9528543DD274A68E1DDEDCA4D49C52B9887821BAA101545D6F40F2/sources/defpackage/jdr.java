package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
/* compiled from: PG */
/* renamed from: jdr  reason: default package */
/* loaded from: classes7.dex */
public final class jdr extends RelativeLayout {
    private boolean a;

    public jdr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ToggleButton.class.getName());
        accessibilityEvent.setChecked(this.a);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setChecked(this.a);
        accessibilityNodeInfo.setContentDescription(null);
        accessibilityNodeInfo.setText(getContentDescription());
    }

    public void setHighlighted(Boolean bool) {
        this.a = bool.booleanValue();
    }
}
