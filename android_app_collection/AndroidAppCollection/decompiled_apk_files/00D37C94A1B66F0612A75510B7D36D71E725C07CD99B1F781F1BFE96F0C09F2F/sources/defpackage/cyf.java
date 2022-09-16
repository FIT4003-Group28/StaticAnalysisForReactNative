package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: cyf  reason: default package */
/* loaded from: classes3.dex */
public final class cyf {
    private static volatile boolean a = false;

    public static synchronized void a() {
        synchronized (cyf.class) {
            a = false;
        }
    }

    public static boolean b(Context context) {
        return c((AccessibilityManager) context.getSystemService("accessibility"));
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        if (!Boolean.getBoolean("is_accessibility_enabled")) {
            return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        }
        return true;
    }
}
