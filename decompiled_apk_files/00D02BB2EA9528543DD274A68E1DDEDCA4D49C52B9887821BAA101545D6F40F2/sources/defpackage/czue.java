package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: czue  reason: default package */
/* loaded from: classes5.dex */
public final class czue {
    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static void b(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            view.postDelayed(new czud(view), 300L);
        }
    }
}
