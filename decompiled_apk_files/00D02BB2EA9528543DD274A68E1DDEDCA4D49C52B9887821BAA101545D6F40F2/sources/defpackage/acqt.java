package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acqt  reason: default package */
/* loaded from: classes2.dex */
final class acqt extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        if (i == 4) {
            return;
        }
        super.sendAccessibilityEvent(view, i);
    }
}
