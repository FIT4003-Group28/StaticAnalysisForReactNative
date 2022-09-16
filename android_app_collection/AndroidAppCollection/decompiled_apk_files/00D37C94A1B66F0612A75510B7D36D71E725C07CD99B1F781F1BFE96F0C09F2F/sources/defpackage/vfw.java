package defpackage;

import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: vfw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vfw implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final /* synthetic */ vfw a = new vfw();

    private /* synthetic */ vfw() {
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        vfy.a = true;
    }
}
