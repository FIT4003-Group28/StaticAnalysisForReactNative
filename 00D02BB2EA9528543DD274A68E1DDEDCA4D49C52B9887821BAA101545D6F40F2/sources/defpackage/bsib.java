package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsib  reason: default package */
/* loaded from: classes4.dex */
final class bsib extends View.AccessibilityDelegate {
    final /* synthetic */ bsic a;

    public bsib(bsic bsicVar) {
        this.a = bsicVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.a.d() != null) {
            List<? extends jao> d = this.a.d();
            dbsk.s(d);
            if (!d.isEmpty() && view.getParent() != null) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
                obtain.setEventType(2048);
                obtain.setContentChangeTypes(4);
                view.getParent().requestSendAccessibilityEvent(view, obtain);
            }
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
