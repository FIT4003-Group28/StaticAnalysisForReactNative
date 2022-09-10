package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cevw  reason: default package */
/* loaded from: classes4.dex */
final class cevw implements cqfd {
    final /* synthetic */ cewc a;

    public cevw(cewc cewcVar) {
        this.a = cewcVar;
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        this.a.b.b(new Runnable(this) { // from class: cevv
            private final cevw a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r7 = this;
                    cevw r0 = r7.a
                    cewc r0 = r0.a
                    boolean r1 = r0.q
                    if (r1 != 0) goto La1
                    boolean r1 = r0.r
                    if (r1 == 0) goto Le
                    goto La1
                Le:
                    android.view.View r1 = defpackage.cqkx.o(r0)
                    if (r1 == 0) goto La1
                    cqjg r2 = defpackage.ceik.b
                    android.view.View r2 = defpackage.cqhu.a(r1, r2)
                    com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar r2 = (com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar) r2
                    if (r2 == 0) goto La1
                    cqjg r3 = defpackage.ceik.a
                    android.view.View r1 = defpackage.cqhu.a(r1, r3)
                    r3 = 0
                    r4 = 255(0xff, float:3.57E-43)
                    if (r1 == 0) goto L6e
                    android.graphics.Rect r5 = new android.graphics.Rect
                    r5.<init>()
                    boolean r5 = r1.getGlobalVisibleRect(r5)
                    if (r5 != 0) goto L35
                    goto L6e
                L35:
                    int r1 = r1.getTop()
                    int r1 = -r1
                    java.lang.Boolean r5 = r0.j()
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L4d
                    cqrp r5 = defpackage.ceow.a
                    gga r6 = r0.a
                    int r5 = r5.e(r6)
                    goto L55
                L4d:
                    cqrp r5 = defpackage.cenb.a
                    gga r6 = r0.a
                    int r5 = r5.e(r6)
                L55:
                    if (r1 > 0) goto L5b
                    r0.s = r3
                    r1 = 0
                    goto L72
                L5b:
                    if (r1 < r5) goto L60
                    r0.s = r4
                    goto L70
                L60:
                    float r1 = (float) r1
                    float r5 = (float) r5
                    float r1 = r1 / r5
                    r5 = 1132396544(0x437f0000, float:255.0)
                    float r1 = r1 * r5
                    int r1 = java.lang.Math.round(r1)
                    r0.s = r1
                    goto L72
                L6e:
                    r0.s = r4
                L70:
                    r1 = 255(0xff, float:3.57E-43)
                L72:
                    jib r5 = r0.o
                    int r6 = r5.x
                    if (r6 == r1) goto La1
                    jhz r1 = r5.e()
                    java.lang.Boolean r5 = r0.j()
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L87
                    goto L89
                L87:
                    int r4 = r0.s
                L89:
                    r1.r = r4
                    int r4 = r0.s
                    r1.s = r4
                    if (r4 <= 0) goto L92
                    r3 = 1
                L92:
                    r1.x = r3
                    r1.h = r3
                    jib r1 = r1.b()
                    r0.o = r1
                    jib r0 = r0.o
                    r2.setToolbarProperties(r0)
                La1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cevv.run():void");
            }
        }, bvrj.UI_THREAD);
        return true;
    }
}
