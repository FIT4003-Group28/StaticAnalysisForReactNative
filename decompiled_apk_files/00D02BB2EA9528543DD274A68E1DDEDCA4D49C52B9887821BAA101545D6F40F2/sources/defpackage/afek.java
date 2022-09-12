package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: afek  reason: default package */
/* loaded from: classes2.dex */
final class afek extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
