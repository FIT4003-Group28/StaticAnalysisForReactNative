package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
/* compiled from: PG */
/* renamed from: vfy  reason: default package */
/* loaded from: classes4.dex */
public final class vfy {
    public static boolean a;
    private static AccessibilityManager.AccessibilityStateChangeListener b;
    private static boolean c;
    private final vfx d = new vfx();

    static {
        new Rect(0, 0, 1, 1);
    }

    public static void a(View view, CharSequence charSequence) {
        if (c(view.getContext())) {
            view.announceForAccessibility(charSequence);
        }
    }

    public static boolean c(Context context) {
        if (b == null) {
            c = d(context);
            vfw vfwVar = vfw.a;
            b = vfwVar;
            ((AccessibilityManager) context.getSystemService("accessibility")).addAccessibilityStateChangeListener(vfwVar);
        } else if (a) {
            c = d(context);
            a = false;
        }
        return c;
    }

    static boolean d(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) != null && !enabledAccessibilityServiceList.isEmpty();
    }

    public final void b(View view, CharSequence charSequence) {
        if (!c(view.getContext())) {
            return;
        }
        uwp.i(this.d);
        this.d.a(view, charSequence);
        uwp.g(this.d, 500L);
    }
}
