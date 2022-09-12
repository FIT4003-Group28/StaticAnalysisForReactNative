package defpackage;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
/* compiled from: PG */
/* renamed from: pz  reason: default package */
/* loaded from: classes7.dex */
public final class pz extends ne {
    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.l() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.l());
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        int l;
        super.f(view, pcVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        pcVar.B(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (l = nestedScrollView.l()) <= 0) {
            return;
        }
        pcVar.y(true);
        if (nestedScrollView.getScrollY() > 0) {
            pcVar.h(oy.e);
            pcVar.h(oy.i);
        }
        if (nestedScrollView.getScrollY() >= l) {
            return;
        }
        pcVar.h(oy.d);
        pcVar.h(oy.j);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int height = nestedScrollView.getHeight();
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.u(max);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int height2 = nestedScrollView.getHeight();
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.l());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.u(min);
        return true;
    }
}
