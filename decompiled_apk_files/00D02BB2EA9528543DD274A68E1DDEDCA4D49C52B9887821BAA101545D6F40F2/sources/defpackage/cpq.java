package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: cpq  reason: default package */
/* loaded from: classes5.dex */
public final class cpq extends View.AccessibilityDelegate {
    private final CharSequence a;

    public cpq(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getText().add(0, this.a);
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
