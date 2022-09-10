package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: bosq  reason: default package */
/* loaded from: classes3.dex */
final class bosq extends View.AccessibilityDelegate {
    final /* synthetic */ bosr a;

    public bosq(bosr bosrVar) {
        this.a = bosrVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        bond bondVar;
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 32768) {
            bond bondVar2 = this.a.d;
            if (bondVar2 != null) {
                bondVar2.l(false);
            }
        } else if (eventType == 65536 && (bondVar = this.a.d) != null) {
            bondVar.l(true);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
