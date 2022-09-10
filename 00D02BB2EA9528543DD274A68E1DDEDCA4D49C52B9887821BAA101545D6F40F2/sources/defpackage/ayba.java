package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: ayba  reason: default package */
/* loaded from: classes3.dex */
final class ayba extends View.AccessibilityDelegate {
    final /* synthetic */ axwo a;
    final /* synthetic */ ilo b;

    public ayba(axwo axwoVar, ilo iloVar) {
        this.a = axwoVar;
        this.b = iloVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (view.isAccessibilityFocused() && accessibilityEvent.getEventType() != 1) {
            this.a.n(this.b);
        }
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
