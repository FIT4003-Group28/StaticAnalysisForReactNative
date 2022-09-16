package defpackage;

import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: me  reason: default package */
/* loaded from: classes3.dex */
public final class me implements AccessibilityManager.AccessibilityStateChangeListener {
    final md a;

    public me(md mdVar) {
        this.a = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof me) {
            return this.a.equals(((me) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        md mdVar = this.a;
        cyf.a();
        dci dciVar = (dci) ((dcf) mdVar).a.get();
        if (dciVar == null) {
            return;
        }
        dciVar.p(z);
        dciVar.v = true;
        dciVar.requestLayout();
    }
}
