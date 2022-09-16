package defpackage;

import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: sao  reason: default package */
/* loaded from: classes4.dex */
final class sao implements AccessibilityManager.AccessibilityStateChangeListener {
    final /* synthetic */ saq a;

    public sao(saq saqVar) {
        this.a = saqVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (z) {
            this.a.d();
        } else {
            this.a.c();
        }
    }
}
