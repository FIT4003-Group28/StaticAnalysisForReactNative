package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: blke  reason: default package */
/* loaded from: classes3.dex */
final class blke extends View.AccessibilityDelegate {
    final /* synthetic */ blkh a;

    public blke(blkh blkhVar) {
        this.a = blkhVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.a.e;
        if (recyclerView == null) {
            return;
        }
        if (!view.isAccessibilityFocused()) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        blkh blkhVar = this.a;
        if (blkhVar.a.d != 2) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        recyclerView.getGlobalVisibleRect(blkhVar.d);
        int i = this.a.d.top;
        view.getGlobalVisibleRect(this.a.d);
        int i2 = this.a.d.top - i;
        int intValue = this.a.a.e().intValue();
        if (i2 <= intValue) {
            this.a.b.c(recyclerView, i2 - intValue);
        }
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
