package defpackage;

import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: taw  reason: default package */
/* loaded from: classes4.dex */
final class taw {
    private final AccessibilityManager a;
    private boolean b = true;
    private Boolean c = null;

    public taw(AccessibilityManager accessibilityManager) {
        this.a = accessibilityManager;
    }

    public final synchronized Boolean a() {
        if (this.b) {
            this.c = Boolean.valueOf(this.a.isTouchExplorationEnabled());
            this.b = false;
        }
        return this.c;
    }

    public final synchronized void b() {
        this.b = true;
    }
}
