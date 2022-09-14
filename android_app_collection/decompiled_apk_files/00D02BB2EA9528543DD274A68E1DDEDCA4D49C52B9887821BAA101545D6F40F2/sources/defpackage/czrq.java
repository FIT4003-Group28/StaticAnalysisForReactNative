package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: czrq  reason: default package */
/* loaded from: classes5.dex */
final class czrq implements ViewTreeObserver.OnScrollChangedListener, czrp {
    final /* synthetic */ czrr a;

    public czrq(czrr czrrVar) {
        this.a = czrrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r3 > r6) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(int r6) {
        /*
            r5 = this;
            czrr r0 = r5.a
            boolean r1 = r0.R
            if (r1 != 0) goto L7
            return
        L7:
            com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback r0 = r0.ae
            int r0 = r0.getScrollY()
            czrr r1 = r5.a
            android.view.View r1 = r1.ad
            int r1 = r1.getBottom()
            czrr r2 = r5.a
            com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback r2 = r2.ae
            int r2 = r2.getScrollY()
            int r2 = r2 + r6
            czrr r3 = r5.a
            android.view.View r3 = r3.ad
            int r3 = r3.getBottom()
            r4 = 0
            if (r3 <= r6) goto L40
            if (r0 != 0) goto L2c
            goto L40
        L2c:
            czrr r6 = r5.a
            android.view.View r0 = r6.f
            android.content.res.Resources r6 = r6.Rn()
            r3 = 2131166628(0x7f0705a4, float:1.7947507E38)
            int r6 = r6.getDimensionPixelSize(r3)
            float r6 = (float) r6
            r0.setElevation(r6)
            goto L49
        L40:
            czrr r0 = r5.a
            android.view.View r0 = r0.f
            r0.setElevation(r4)
            if (r3 <= r6) goto L60
        L49:
            if (r1 != r2) goto L4c
            goto L60
        L4c:
            czrr r6 = r5.a
            android.view.View r0 = r6.g
            android.content.res.Resources r6 = r6.Rn()
            r1 = 2131166620(0x7f07059c, float:1.794749E38)
            int r6 = r6.getDimensionPixelSize(r1)
            float r6 = (float) r6
            r0.setElevation(r6)
            return
        L60:
            czrr r6 = r5.a
            android.view.View r6 = r6.g
            r6.setElevation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czrq.b(int):void");
    }

    @Override // defpackage.czrp
    public final void a(int i) {
        if (i != 0) {
            b(i);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (!czov.b(dyea.c(czov.a)) || this.a.aJ()) {
            b(this.a.ae.getHeight());
        }
    }
}
