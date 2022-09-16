package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {xbj.class, xak.class, xbt.class, xbr.class})
/* renamed from: woc  reason: default package */
/* loaded from: classes4.dex */
public final class woc extends wok {
    private final Executor a;
    private final Executor b;
    private final wvx c;
    private final xdu e;

    public woc(woo wooVar, Executor executor, Executor executor2, wvx wvxVar, xdu xduVar) {
        super(wooVar);
        this.a = executor;
        this.b = executor2;
        this.c = wvxVar;
        this.e = xduVar;
    }

    @Override // defpackage.wok
    public final void a() {
        final ankt anktVar = (ankt) this.e.d(xak.class);
        final ankt anktVar2 = (ankt) this.e.d(xam.class);
        ampg ampgVar = new ampg() { // from class: wob
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                xdu xduVar = (xdu) obj;
                return woc.this.b(xduVar, (InstreamAdImpl) xduVar.d(xbf.class), anktVar, anktVar2, (ankt) xduVar.d(xbt.class), (ankt) xduVar.d(xbr.class), (String) xduVar.d(xbj.class), (String) xduVar.d(xar.class), (wzr) xduVar.d(xaf.class));
            }
        };
        if (anktVar2.isDone() || anktVar.isDone()) {
            this.d.c(ampgVar);
        } else {
            this.d.a(ampgVar, this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (true == defpackage.akzj.f(r3, defpackage.apzg.a)) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xci b(defpackage.xdu r15, com.google.android.libraries.youtube.ads.model.InstreamAdImpl r16, defpackage.ankt r17, defpackage.ankt r18, defpackage.ankt r19, defpackage.ankt r20, java.lang.String r21, java.lang.String r22, defpackage.wzr r23) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r2 = 0
            java.lang.Object r3 = r19.get()     // Catch: java.lang.Throwable -> L16
            apzg r3 = (defpackage.apzg) r3     // Catch: java.lang.Throwable -> L16
            apzg r4 = defpackage.apzg.a     // Catch: java.lang.Throwable -> L14
            boolean r4 = defpackage.akzj.f(r3, r4)     // Catch: java.lang.Throwable -> L14
            r5 = 1
            if (r5 != r4) goto L14
            goto L16
        L14:
            r10 = r3
            goto L17
        L16:
            r10 = r2
        L17:
            java.lang.Object r3 = r20.get()     // Catch: java.lang.Throwable -> L1f
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L1f
            r11 = r3
            goto L20
        L1f:
            r11 = r2
        L20:
            java.lang.Object r3 = r18.get()     // Catch: java.util.concurrent.ExecutionException -> Lbd java.lang.InterruptedException -> Lbf
            apnh r3 = (defpackage.apnh) r3     // Catch: java.util.concurrent.ExecutionException -> Lbd java.lang.InterruptedException -> Lbf
            if (r3 == 0) goto L70
            wvx r2 = r1.c
            aozb r4 = r3.b
            if (r4 != 0) goto L30
            aozb r4 = defpackage.aozb.a
        L30:
            java.lang.String r4 = r4.b
            aozb r5 = r3.b
            if (r5 != 0) goto L38
            aozb r5 = defpackage.aozb.a
        L38:
            int r5 = r5.c
            apcb r5 = defpackage.apcb.b(r5)
            if (r5 != 0) goto L42
            apcb r5 = defpackage.apcb.LAYOUT_TYPE_UNSPECIFIED
        L42:
            aozb r6 = r3.b
            if (r6 != 0) goto L48
            aozb r6 = defpackage.aozb.a
        L48:
            aoyz r6 = r6.d
            if (r6 != 0) goto L4e
            aoyz r6 = defpackage.aoyz.a
        L4e:
            ampq r6 = defpackage.ampq.j(r6)
            aunb r3 = r3.c
            if (r3 != 0) goto L58
            aunb r3 = defpackage.aunb.a
        L58:
            aopg r7 = com.google.protos.youtube.api.innertube.AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer
            java.lang.Object r3 = r3.qm(r7)
            aoyo r3 = (defpackage.aoyo) r3
            aopu r9 = r3.b
            r3 = r15
            r7 = r21
            r8 = r16
            r12 = r22
            r13 = r23
            xci r0 = r2.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L70:
            java.lang.Object r3 = r17.get()     // Catch: java.util.concurrent.ExecutionException -> Lb4 java.lang.InterruptedException -> Lb6
            r9 = r3
            java.util.List r9 = (java.util.List) r9     // Catch: java.util.concurrent.ExecutionException -> Lb4 java.lang.InterruptedException -> Lb6
            if (r9 == 0) goto Lb3
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L80
            goto Lb3
        L80:
            wvx r3 = r1.c
            boolean r4 = r0 instanceof com.google.android.libraries.youtube.ads.model.InstreamAdImpl
            if (r4 == 0) goto L92
            com.google.android.libraries.youtube.ads.model.PlayerAd r4 = r0.b
            boolean r5 = r4 instanceof com.google.android.libraries.youtube.ads.model.LocalVideoAd
            if (r5 == 0) goto L92
            com.google.android.libraries.youtube.ads.model.LocalVideoAd r4 = (com.google.android.libraries.youtube.ads.model.LocalVideoAd) r4
            aoyz r2 = r4.qP()
        L92:
            wvw r4 = r3.c
            apcb r5 = defpackage.apcb.LAYOUT_TYPE_IMMERSIVE
            r6 = r15
            java.lang.String r7 = r6.a
            java.lang.String r4 = r4.a(r5, r7)
            apcb r5 = defpackage.apcb.LAYOUT_TYPE_IMMERSIVE
            ampq r7 = defpackage.ampq.i(r2)
            r2 = r3
            r3 = r15
            r6 = r7
            r7 = r21
            r8 = r16
            r12 = r22
            r13 = r23
            xci r0 = r2.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        Lb3:
            return r2
        Lb4:
            r0 = move-exception
            goto Lb7
        Lb6:
            r0 = move-exception
        Lb7:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        Lbd:
            r0 = move-exception
            goto Lc0
        Lbf:
            r0 = move-exception
        Lc0:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woc.b(xdu, com.google.android.libraries.youtube.ads.model.InstreamAdImpl, ankt, ankt, ankt, ankt, java.lang.String, java.lang.String, wzr):xci");
    }
}
