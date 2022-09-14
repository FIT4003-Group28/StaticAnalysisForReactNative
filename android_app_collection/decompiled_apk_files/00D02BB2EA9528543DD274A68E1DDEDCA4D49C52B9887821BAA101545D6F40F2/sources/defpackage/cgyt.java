package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: cgyt  reason: default package */
/* loaded from: classes4.dex */
final class cgyt extends View.AccessibilityDelegate {
    final /* synthetic */ cgyu a;

    public cgyt(cgyu cgyuVar) {
        this.a = cgyuVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        bond bondVar;
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 32768) {
            bond bondVar2 = this.a.a;
            if (bondVar2 != null) {
                bondVar2.l(false);
            }
        } else if (eventType == 65536 && !this.a.h().booleanValue() && (bondVar = this.a.a) != null) {
            bondVar.l(true);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
