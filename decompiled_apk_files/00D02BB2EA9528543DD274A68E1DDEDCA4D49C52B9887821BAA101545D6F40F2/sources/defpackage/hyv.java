package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: hyv  reason: default package */
/* loaded from: classes.dex */
final class hyv extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(view.isClickable());
        accessibilityNodeInfo.setClassName(true != view.isClickable() ? "android.view.View" : "android.widget.Button");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() <= 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            if (!(childAt instanceof TextView)) {
                return;
            }
            TextView textView = (TextView) childAt;
            CharSequence contentDescription = textView.getContentDescription();
            if (contentDescription == null || contentDescription.length() == 0) {
                contentDescription = textView.getText();
            }
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
    }
}
