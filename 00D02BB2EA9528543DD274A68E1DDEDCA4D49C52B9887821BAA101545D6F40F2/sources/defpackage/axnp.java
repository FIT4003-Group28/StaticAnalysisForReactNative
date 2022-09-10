package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axnp  reason: default package */
/* loaded from: classes3.dex */
public final class axnp extends View.AccessibilityDelegate {
    public static final /* synthetic */ int a = 0;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(final View view, AccessibilityEvent accessibilityEvent) {
        View W;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768) {
            View view2 = view;
            while (view2 != null && !(view2 instanceof RecyclerView)) {
                view2 = (View) view2.getParent();
            }
            View view3 = null;
            RecyclerView recyclerView = view2 == null ? null : (RecyclerView) view2;
            if (recyclerView == null || recyclerView.D != 0 || (W = recyclerView.W(view)) == null) {
                return;
            }
            final View a2 = cqhu.a(W, axnn.a);
            final int aa = recyclerView.aa(W);
            acl ab = recyclerView.ab(aa - 1);
            if (aa > 0 && ab != null) {
                view3 = ab.a;
            }
            if (view3 == null) {
                return;
            }
            final View a3 = cqhu.a(view3, axnd.a);
            final RecyclerView recyclerView2 = recyclerView;
            recyclerView.post(new Runnable(recyclerView2, aa, a3, a2, view) { // from class: axno
                private final RecyclerView a;
                private final int b;
                private final View c;
                private final View d;
                private final View e;

                {
                    this.a = recyclerView2;
                    this.b = aa;
                    this.c = a3;
                    this.d = a2;
                    this.e = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerView recyclerView3 = this.a;
                    int i = this.b;
                    View view4 = this.c;
                    View view5 = this.d;
                    View view6 = this.e;
                    int i2 = axnp.a;
                    recyclerView3.n(i);
                    Rect rect = new Rect();
                    boolean z = true;
                    boolean z2 = view4 != null && view4.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    boolean z3 = view5 != null && view5.getGlobalVisibleRect(rect2);
                    Rect rect3 = new Rect();
                    view6.getWindowVisibleDisplayFrame(rect3);
                    if (z3) {
                        z = z2;
                    } else if (!z2) {
                        return;
                    }
                    if (!z3 && view5 != null) {
                        recyclerView3.scrollBy((rect3.right - rect2.left) + 5, 0);
                    } else if (z || view4 == null) {
                    } else {
                        recyclerView3.scrollBy(-((rect3.left - rect.right) + 5), 0);
                    }
                }
            });
        }
    }
}
