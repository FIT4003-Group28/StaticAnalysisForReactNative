package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.shared.webview.DarkModeAwareWebView;
/* compiled from: PG */
/* renamed from: apln  reason: default package */
/* loaded from: classes2.dex */
public final class apln extends DarkModeAwareWebView {
    public double a;
    public dzsj<dmim> b;
    private boolean e;

    public apln(Context context) {
        super(context);
        this.a = dcyn.a;
        this.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (defpackage.aplm.a(r3, r8 / r4, r10 / r4) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (android.graphics.Color.alpha(r3.getPixel((int) r0, (int) r2)) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        r12.e = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
        r12.e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        return super.onTouchEvent(r13);
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L72
            float r0 = r13.getX()
            float r2 = r13.getY()
            dzsj<dmim> r3 = r12.b
            defpackage.dbsk.s(r3)
            double r3 = r12.a
            r5 = 0
            r7 = 1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            defpackage.dbsk.l(r3)
            dzsj<dmim> r3 = r12.b
            java.lang.Object r3 = r3.a()
            dmim r3 = (defpackage.dmim) r3
            dmim r4 = defpackage.dmim.c
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L46
            double r4 = r12.a
            double r8 = (double) r0
            java.lang.Double.isNaN(r8)
            double r8 = r8 / r4
            double r10 = (double) r2
            java.lang.Double.isNaN(r10)
            double r10 = r10 / r4
            boolean r0 = defpackage.aplm.a(r3, r8, r10)
            if (r0 == 0) goto L6b
            goto L68
        L46:
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r3)
            r12.draw(r4)
            int r0 = (int) r0
            int r2 = (int) r2
            int r0 = r3.getPixel(r0, r2)
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 != 0) goto L6b
        L68:
            r12.e = r7
            return r1
        L6b:
            r12.e = r1
            boolean r13 = super.onTouchEvent(r13)
            return r13
        L72:
            boolean r0 = r12.e
            if (r0 == 0) goto L77
            return r1
        L77:
            boolean r13 = super.onTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apln.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
