package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: brwt  reason: default package */
/* loaded from: classes4.dex */
final class brwt extends View.AccessibilityDelegate {
    final /* synthetic */ brwu a;

    public brwt(brwu brwuVar) {
        this.a = brwuVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (view.isAccessibilityFocused() && accessibilityEvent.getEventType() != 1) {
            this.a.b.a().I(this.a.c);
        }
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
