package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: cpv  reason: default package */
/* loaded from: classes.dex */
public class cpv {
    public static final cpv a = new cpv();

    public final void a(View view) {
        c(view, 32);
    }

    public final void b(View view, CharSequence charSequence) {
        view.setAccessibilityDelegate(new cpq(charSequence));
        a(view);
        view.setAccessibilityDelegate(null);
    }

    public final void c(View view, int i) {
        int importantForAccessibility = view.getImportantForAccessibility();
        view.setImportantForAccessibility(1);
        view.sendAccessibilityEvent(i);
        view.setImportantForAccessibility(importantForAccessibility);
    }

    public final boolean d(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public final boolean e(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    public final void f(@dzsi View view, CharSequence charSequence) {
        if (view != null) {
            view.announceForAccessibility(charSequence);
        }
    }

    public final void g(View view, jjn jjnVar, jjn jjnVar2, @dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, boolean z) {
        if (jjnVar != jjnVar2) {
            c(view, 4096);
            if (jjnVar.b() || !jjnVar2.b() || charSequence2 == null) {
                if (!jjnVar2.b() && jjnVar.b() && charSequence != null) {
                    f(view, charSequence);
                    return;
                } else if (!z) {
                    return;
                } else {
                    if (jjnVar2 != jjn.HIDDEN || charSequence == null) {
                        if (jjnVar != jjn.HIDDEN || jjnVar2 != jjn.COLLAPSED || charSequence2 == null) {
                            return;
                        }
                        f(view, charSequence2);
                        return;
                    }
                    f(view, charSequence);
                    return;
                }
            }
            f(view, charSequence2);
        }
    }
}
