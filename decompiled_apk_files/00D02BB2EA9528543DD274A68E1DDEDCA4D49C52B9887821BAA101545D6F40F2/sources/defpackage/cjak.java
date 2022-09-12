package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: cjak  reason: default package */
/* loaded from: classes4.dex */
final class cjak extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
