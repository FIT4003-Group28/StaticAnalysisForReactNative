package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: yq  reason: default package */
/* loaded from: classes4.dex */
public class yq extends jo {
    final RecyclerView b;
    public final yp c;

    public yq(RecyclerView recyclerView) {
        this.b = recyclerView;
        jo k = k();
        if (k == null || !(k instanceof yp)) {
            this.c = new yp(this);
        } else {
            this.c = (yp) k;
        }
    }

    @Override // defpackage.jo
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        xw xwVar;
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || l() || (xwVar = ((RecyclerView) view).n) == null) {
            return;
        }
        xwVar.X(accessibilityEvent);
    }

    @Override // defpackage.jo
    public void d(View view, mh mhVar) {
        xw xwVar;
        super.d(view, mhVar);
        if (l() || (xwVar = this.b.n) == null) {
            return;
        }
        RecyclerView recyclerView = xwVar.u;
        yd ydVar = recyclerView.d;
        yl ylVar = recyclerView.M;
        if (recyclerView.canScrollVertically(-1) || xwVar.u.canScrollHorizontally(-1)) {
            mhVar.h(8192);
            mhVar.C(true);
        }
        if (xwVar.u.canScrollVertically(1) || xwVar.u.canScrollHorizontally(1)) {
            mhVar.h(4096);
            mhVar.C(true);
        }
        mhVar.t(aonf.a(xwVar.oH(ydVar, ylVar), xwVar.oG(ydVar, ylVar), 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r5 != 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // defpackage.jo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.j(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            boolean r4 = r3.l()
            r0 = 0
            if (r4 != 0) goto L8f
            android.support.v7.widget.RecyclerView r4 = r3.b
            xw r4 = r4.n
            if (r4 == 0) goto L8f
            android.support.v7.widget.RecyclerView r1 = r4.u
            yd r2 = r1.d
            yl r2 = r1.M
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
            int r1 = r4.I
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = -r1
            goto L40
        L3f:
            r1 = 0
        L40:
            android.support.v7.widget.RecyclerView r2 = r4.u
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L80
            int r5 = r4.H
            int r2 = r4.getPaddingLeft()
            int r5 = r5 - r2
            int r2 = r4.getPaddingRight()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            boolean r5 = r1.canScrollVertically(r6)
            if (r5 == 0) goto L6a
            int r5 = r4.I
            int r1 = r4.getPaddingTop()
            int r5 = r5 - r1
            int r1 = r4.getPaddingBottom()
            int r5 = r5 - r1
            r1 = r5
            goto L6b
        L6a:
            r1 = 0
        L6b:
            android.support.v7.widget.RecyclerView r5 = r4.u
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L80
            int r5 = r4.H
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
            android.support.v7.widget.RecyclerView r4 = r4.u
            r1 = 0
            r4.aA(r5, r0, r1, r6)
            return r6
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq.j(android.view.View, int, android.os.Bundle):boolean");
    }

    public jo k() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.b.at();
    }
}
