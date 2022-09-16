package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: wvs  reason: default package */
/* loaded from: classes7.dex */
final class wvs extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
