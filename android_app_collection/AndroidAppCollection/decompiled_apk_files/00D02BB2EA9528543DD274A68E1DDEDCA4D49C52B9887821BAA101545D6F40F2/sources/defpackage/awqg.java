package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: awqg  reason: default package */
/* loaded from: classes3.dex */
final class awqg implements jkh {
    private final View a;
    private final awug b;
    private final awtx c;
    private final ges d;
    private final iql e;
    private boolean f;
    private boolean g;

    public awqg(View view, awug awugVar, awtx awtxVar, boolean z, ges gesVar, iql iqlVar) {
        this.a = view;
        this.b = awugVar;
        this.c = awtxVar;
        this.g = z;
        this.d = gesVar;
        this.e = iqlVar;
    }

    private final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            this.b.v(!z);
            cqkx.p(this.b);
        }
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        View j;
        View a;
        ff J;
        if (jjnVar2 != jjn.FULLY_EXPANDED && (J = this.d.J()) != null) {
            jmw.d(J, null);
        }
        this.f = false;
        a(!jjnVar2.b());
        if (jjnVar2 != jjn.FULLY_EXPANDED && (j = jkjVar.j()) != null && (a = cqhu.a(j, awso.a)) != null) {
            jmw.f(a);
        }
        this.e.e(jjnVar2, 250);
        this.c.b(jjnVar2);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        this.f = true;
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        this.f = false;
        a(!jjnVar.b());
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // defpackage.jkh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.jkj r7, defpackage.jjn r8, float r9) {
        /*
            r6 = this;
            boolean r0 = r6.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            jjn r0 = defpackage.jjn.COLLAPSED
            r3 = 0
            if (r8 != r0) goto L10
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            r3 = 1
        L10:
            r6.a(r3)
        L13:
            ges r0 = r6.d
            boolean r3 = r0.aD
            if (r3 != 0) goto L1b
        L19:
            r3 = 0
            goto L32
        L1b:
            ff r0 = r0.J()
            if (r0 != 0) goto L22
            goto L19
        L22:
            android.content.res.Resources r0 = r0.getResources()
            float r0 = defpackage.bfki.a(r0)
            android.view.View r3 = r6.a
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r0
        L32:
            int r0 = r7.C(r8)
            jjn r4 = r7.D(r8)
            int r4 = r7.C(r4)
            int r5 = r7.M()
            int r7 = r7.getTop()
            int r5 = r5 + r7
            float r7 = (float) r5
            float r5 = (float) r0
            int r4 = r4 - r0
            float r0 = (float) r4
            float r0 = r0 * r9
            float r5 = r5 + r0
            float r7 = r7 - r5
            float r7 = -r7
            jjn r0 = defpackage.jjn.HIDDEN
            int r8 = r8.ordinal()
            if (r8 == 0) goto L6b
            if (r8 == r1) goto L64
            r9 = 2
            if (r8 == r9) goto L61
            r9 = 3
            if (r8 == r9) goto L61
            goto L6b
        L61:
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L6c
        L64:
            android.view.animation.Interpolator r8 = defpackage.irf.b
            float r8 = r8.getInterpolation(r9)
            goto L6c
        L6b:
            r8 = 0
        L6c:
            int r9 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r9 <= 0) goto L77
            awug r9 = r6.b
            float r7 = r7 / r3
            r9.y(r7)
            goto L7c
        L77:
            awug r7 = r6.b
            r7.y(r2)
        L7c:
            awug r7 = r6.b
            r7.x(r8)
            awug r7 = r6.b
            defpackage.cqkx.p(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awqg.P(jkj, jjn, float):void");
    }
}
