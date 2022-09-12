package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adrz  reason: default package */
/* loaded from: classes2.dex */
public final class adrz extends View.AccessibilityDelegate {
    private final int a = R.id.homescreen_yourexplore_upper_snippet;
    private final int b = R.id.homescreen_yourexplore_lower_snippet;

    private final void a(View view) {
        View view2 = (View) view.getParent();
        View findViewById = view2.findViewById(this.a);
        View findViewById2 = view2.findViewById(this.b);
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        Rect rect = new Rect();
        boolean z = false;
        if (findViewById.getLocalVisibleRect(rect) && rect.width() == findViewById.getWidth() && rect.height() == findViewById.getHeight()) {
            z = true;
        }
        Rect rect2 = new Rect();
        if (!findViewById2.getLocalVisibleRect(rect2) || rect2.width() != findViewById2.getWidth() || rect2.height() != findViewById2.getHeight()) {
            b(findViewById2);
        } else if (z) {
        } else {
            b(findViewById);
        }
    }

    private static void b(View view) {
        ViewParent parent = view.getParent();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        while ((parent instanceof View) && !parent.requestChildRectangleOnScreen(view, rect, false)) {
            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
            view = parent;
            parent = view.getParent();
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 128) {
            a(view);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        a(view);
        return super.performAccessibilityAction(view, i, bundle);
    }
}
