package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: acaj  reason: default package */
/* loaded from: classes.dex */
final class acaj implements afzf {
    final /* synthetic */ abzg a;
    final /* synthetic */ acay b;

    public acaj(acay acayVar, abzg abzgVar) {
        this.b = acayVar;
        this.a = abzgVar;
    }

    private final void d(final int i, final aqft aqftVar) {
        Handler handler = this.b.n;
        final abzg abzgVar = this.a;
        handler.post(new Runnable() { // from class: acah
            @Override // java.lang.Runnable
            public final void run() {
                abzg.this.b(i, aqftVar);
            }
        });
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        cew cewVar;
        zep.d("Cannot load GetBroadcastSetupResponse from InnerTube.", cffVar);
        if (cffVar == null || (cewVar = cffVar.b) == null || cewVar.a != 403) {
            abxa.b().n(3, 1, cffVar);
            d(1, null);
            return;
        }
        abxa.b().n(3, 2, cffVar);
        d(4, null);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0071 A[SYNTHETIC] */
    @Override // defpackage.cfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void lG(java.lang.Object r9) {
        /*
            r8 = this;
            arsg r9 = (defpackage.arsg) r9
            aopu r0 = r9.d
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 18
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            aunb r1 = (defpackage.aunb) r1
            aopg r5 = defpackage.asuf.a
            boolean r5 = r1.qn(r5)
            if (r5 == 0) goto L66
            aopg r5 = defpackage.asuf.a
            java.lang.Object r1 = r1.qm(r5)
            asue r1 = (defpackage.asue) r1
            int r5 = r1.d
            int r5 = defpackage.akzj.x(r5)
            if (r5 != 0) goto L31
            goto L32
        L31:
            r3 = r5
        L32:
            int r5 = r1.b
            r6 = 5
            if (r5 != r6) goto L43
            java.lang.Object r1 = r1.c
            arag r1 = (defpackage.arag) r1
            android.text.Spanned r1 = defpackage.ajgl.b(r1)
            r1.toString()
            goto L66
        L43:
            r6 = 6
            if (r5 != r6) goto L66
            java.lang.Object r5 = r1.c
            aunb r5 = (defpackage.aunb) r5
            aopg r7 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
            boolean r5 = r5.qn(r7)
            if (r5 == 0) goto L66
            int r5 = r1.b
            if (r5 != r6) goto L5b
            java.lang.Object r1 = r1.c
            aunb r1 = (defpackage.aunb) r1
            goto L5d
        L5b:
            aunb r1 = defpackage.aunb.a
        L5d:
            aopg r5 = com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass.confirmDialogRenderer
            java.lang.Object r1 = r1.qm(r5)
            aqft r1 = (defpackage.aqft) r1
            goto L67
        L66:
            r1 = r4
        L67:
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L72
            r5 = 14
            if (r3 == r5) goto L72
            if (r3 != r6) goto L8
            r3 = 4
        L72:
            abxa r9 = defpackage.abxa.b()
            int r0 = defpackage.acay.o(r3)
            r9.n(r2, r0, r4)
            int r9 = defpackage.acay.p(r3)
            r8.d(r9, r1)
            return
        L85:
            if (r9 != 0) goto L88
            goto Lb2
        L88:
            aunb r0 = r9.e
            if (r0 != 0) goto L8e
            aunb r0 = defpackage.aunb.a
        L8e:
            aopg r1 = com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer
            boolean r1 = r0.qn(r1)
            if (r1 == 0) goto Lb2
            aopg r1 = com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer
            java.lang.Object r0 = r0.qm(r1)
            apns r0 = (defpackage.apns) r0
            int r0 = r0.b
            r0 = r0 & r3
            if (r0 == 0) goto Lb2
            acay r0 = r8.b
            android.os.Handler r0 = r0.n
            abzg r1 = r8.a
            acai r2 = new acai
            r2.<init>()
            r0.post(r2)
            return
        Lb2:
            abxa r9 = defpackage.abxa.b()
            r9.n(r2, r3, r4)
            r8.d(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acaj.lG(java.lang.Object):void");
    }
}
