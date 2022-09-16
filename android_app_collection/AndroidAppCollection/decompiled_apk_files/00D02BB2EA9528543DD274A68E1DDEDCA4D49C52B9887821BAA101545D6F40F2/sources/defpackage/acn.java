package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: acn  reason: default package */
/* loaded from: classes.dex */
public class acn extends ne {
    final RecyclerView b;
    public final acm c;

    public acn(RecyclerView recyclerView) {
        this.b = recyclerView;
        ne l = l();
        if (l == null || !(l instanceof acm)) {
            this.c = new acm(this);
        } else {
            this.c = (acm) l;
        }
    }

    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        abs absVar;
        super.e(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (absVar = ((RecyclerView) view).l) == null) {
            return;
        }
        absVar.Sc(accessibilityEvent);
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        abs absVar;
        super.f(view, pcVar);
        if (k() || (absVar = this.b.l) == null) {
            return;
        }
        RecyclerView recyclerView = absVar.q;
        absVar.bd(recyclerView.b, recyclerView.J, pcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r5 != 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // defpackage.ne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.i(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            boolean r4 = r3.k()
            r0 = 0
            if (r4 != 0) goto L8e
            android.support.v7.widget.RecyclerView r4 = r3.b
            abs r4 = r4.l
            if (r4 == 0) goto L8e
            android.support.v7.widget.RecyclerView r1 = r4.q
            aca r2 = r1.b
            aci r2 = r1.J
            if (r1 != 0) goto L1f
            goto L86
        L1f:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L56
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L2a
            r5 = 0
            r1 = 0
            goto L81
        L2a:
            r5 = -1
            boolean r1 = r1.canScrollVertically(r5)
            if (r1 == 0) goto L3f
            int r1 = r4.E
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = -r1
            goto L40
        L3f:
            r1 = 0
        L40:
            android.support.v7.widget.RecyclerView r2 = r4.q
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L80
            int r5 = r4.D
            int r2 = r4.getPaddingLeft()
            int r5 = r5 - r2
            int r2 = r4.getPaddingRight()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            boolean r5 = r1.canScrollVertically(r6)
            if (r5 == 0) goto L6a
            int r5 = r4.E
            int r1 = r4.getPaddingTop()
            int r5 = r5 - r1
            int r1 = r4.getPaddingBottom()
            int r5 = r5 - r1
            r1 = r5
            goto L6b
        L6a:
            r1 = 0
        L6b:
            android.support.v7.widget.RecyclerView r5 = r4.q
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L80
            int r5 = r4.D
            int r2 = r4.getPaddingLeft()
            int r5 = r5 - r2
            int r2 = r4.getPaddingRight()
            int r5 = r5 - r2
            goto L81
        L80:
            r5 = 0
        L81:
            if (r1 != 0) goto L87
            if (r5 == 0) goto L86
            goto L88
        L86:
            return r0
        L87:
            r0 = r1
        L88:
            android.support.v7.widget.RecyclerView r4 = r4.q
            r4.at(r5, r0, r6)
            return r6
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acn.i(android.view.View, int, android.os.Bundle):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.b.ag();
    }

    public ne l() {
        return this.c;
    }
}
