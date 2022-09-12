package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: hzs  reason: default package */
/* loaded from: classes6.dex */
final class hzs extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        if (i == 4) {
            return;
        }
        super.sendAccessibilityEvent(view, i);
    }
}
