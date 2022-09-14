package defpackage;

import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: cpop  reason: default package */
/* loaded from: classes5.dex */
final class cpop implements AccessibilityManager.AccessibilityStateChangeListener {
    final /* synthetic */ cpor a;

    public cpop(cpor cporVar) {
        this.a = cporVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (z) {
            this.a.a();
        } else {
            this.a.b();
        }
    }
}
