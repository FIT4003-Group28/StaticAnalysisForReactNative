package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: nsy  reason: default package */
/* loaded from: classes3.dex */
public final class nsy implements nts, nte {
    public final yzl a;
    public int b;
    private final azpa c;
    private final aynx d;
    private final azpb e;
    private final aynx f;
    private final azpb g;
    private final aynx h;

    public nsy(Context context) {
        int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        yzk yzkVar = new yzk(context);
        yzkVar.c = 2;
        yzkVar.a = scaledMinimumFlingVelocity * 32;
        yzkVar.b = 0;
        this.a = yzkVar.a();
        azpa as = azpa.as(false);
        this.c = as;
        this.d = as.A().h(nps.h);
        azpb ax = azpd.ar().ax();
        this.e = ax;
        this.f = ax.h(ntr.b(as)).A();
        azpb ax2 = azpd.ar().ax();
        this.g = ax2;
        this.h = ax2.A().L();
    }

    public static boolean a(yzl yzlVar, MotionEvent motionEvent) {
        int c = yzlVar.c(motionEvent, 1);
        return c == 2 || c == 4;
    }

    private final void b(yzl yzlVar, MotionEvent motionEvent) {
        if (!a(yzlVar, motionEvent) || c()) {
            this.e.c(Integer.valueOf(-yzlVar.b(motionEvent)));
            return;
        }
        yzlVar.g(motionEvent);
        this.c.c(true);
    }

    private final boolean c() {
        Boolean bool = (Boolean) this.c.at();
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r8 != 0) goto L26;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r8)
            int r1 = r6.b
            float r1 = (float) r1
            r2 = 0
            r0.offsetLocation(r2, r1)
            yzl r1 = r6.a
            r1.d(r0)
            int r1 = r8.getActionMasked()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L65
            r4 = 2
            if (r1 == r3) goto L30
            if (r1 == r4) goto L2a
            r5 = 3
            if (r1 == r5) goto L30
            r7 = 6
            if (r1 == r7) goto L24
            goto L66
        L24:
            yzl r7 = r6.a
            r7.e(r8)
            goto L66
        L2a:
            yzl r7 = r6.a
            r6.b(r7, r8)
            goto L66
        L30:
            yzl r1 = r6.a
            r6.b(r1, r8)
            yzl r8 = r6.a
            int r8 = r8.i(r0, r3)
            if (r8 != r4) goto L40
            ntd r1 = defpackage.ntd.FLING_UP
            goto L47
        L40:
            if (r8 != r3) goto L45
            ntd r1 = defpackage.ntd.FLING_DOWN
            goto L47
        L45:
            ntd r1 = defpackage.ntd.NO_FLING
        L47:
            azpb r4 = r6.g
            r4.c(r1)
            yzl r1 = r6.a
            r1.f()
            boolean r1 = r6.c()
            if (r1 != 0) goto L5a
            r7.performClick()
        L5a:
            azpa r7 = r6.c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r7.c(r1)
            if (r8 == 0) goto L66
        L65:
            r2 = 1
        L66:
            r0.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsy.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.nte
    public final ntc t() {
        return ntc.NONE;
    }

    @Override // defpackage.nte
    public final aynx u() {
        return this.d;
    }

    @Override // defpackage.nte
    public final aynx v() {
        return this.h;
    }

    @Override // defpackage.nte
    public final aynx w() {
        return this.f;
    }
}
