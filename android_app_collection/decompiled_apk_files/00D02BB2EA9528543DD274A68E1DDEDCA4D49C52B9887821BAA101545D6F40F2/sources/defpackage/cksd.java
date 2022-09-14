package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cksd  reason: default package */
/* loaded from: classes4.dex */
public final class cksd implements Runnable {
    public final cksf a;
    public final crdv b;
    private final PriorityBlockingQueue<cksp> c;
    private final cksn d;
    private final btvo e;
    private final cksj f;
    private final bvrb g;
    private final crox h;
    private final cksf i;
    private final btyh j;
    private final crdz k;

    public cksd(PriorityBlockingQueue priorityBlockingQueue, crdv crdvVar, cksn cksnVar, btvo btvoVar, cksj cksjVar, bvrb bvrbVar, crox croxVar, cksf cksfVar, cksf cksfVar2, btyh btyhVar, crdz crdzVar) {
        this.c = priorityBlockingQueue;
        this.b = crdvVar;
        this.d = cksnVar;
        this.e = btvoVar;
        this.f = cksjVar;
        this.g = bvrbVar;
        this.h = croxVar;
        this.a = cksfVar;
        this.i = cksfVar2;
        this.j = btyhVar;
        this.k = crdzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: InterruptedException -> 0x00af, TRY_LEAVE, TryCatch #0 {InterruptedException -> 0x00af, blocks: (B:2:0x0000, B:4:0x0026, B:7:0x002f, B:9:0x0043, B:11:0x004a, B:13:0x004f, B:19:0x0070, B:21:0x008c, B:23:0x0094, B:26:0x009c, B:28:0x00a2, B:12:0x004d), top: B:34:0x0000 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            java.util.concurrent.PriorityBlockingQueue<cksp> r0 = r9.c     // Catch: java.lang.InterruptedException -> Laf
            java.lang.Object r0 = r0.take()     // Catch: java.lang.InterruptedException -> Laf
            cksp r0 = (defpackage.cksp) r0     // Catch: java.lang.InterruptedException -> Laf
            crfk r1 = r0.a     // Catch: java.lang.InterruptedException -> Laf
            cksn r2 = r9.d     // Catch: java.lang.InterruptedException -> Laf
            java.io.File r2 = r2.a()     // Catch: java.lang.InterruptedException -> Laf
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.InterruptedException -> Laf
            cksj r3 = r9.f     // Catch: java.lang.InterruptedException -> Laf
            btvo r4 = r9.e     // Catch: java.lang.InterruptedException -> Laf
            crdz r5 = r9.k     // Catch: java.lang.InterruptedException -> Laf
            cksi r4 = defpackage.ckse.a(r4, r1, r5)     // Catch: java.lang.InterruptedException -> Laf
            java.io.File r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> Laf
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L6b
            btyh r6 = r9.j     // Catch: java.lang.InterruptedException -> Laf
            boolean r6 = r6.b()     // Catch: java.lang.InterruptedException -> Laf
            if (r6 == 0) goto L2f
            goto L6b
        L2f:
            crox r6 = r9.h     // Catch: java.lang.InterruptedException -> Laf
            r6.c()     // Catch: java.lang.InterruptedException -> Laf
            crox r6 = r9.h     // Catch: java.lang.InterruptedException -> Laf
            r6.d()     // Catch: java.lang.InterruptedException -> Laf
            btvo r6 = r9.e     // Catch: java.lang.InterruptedException -> Laf
            dwkj r6 = r6.getTextToSpeechParameters()     // Catch: java.lang.InterruptedException -> Laf
            boolean r6 = r6.l     // Catch: java.lang.InterruptedException -> Laf
            if (r6 == 0) goto L4d
            r6 = r1
            crff r6 = (defpackage.crff) r6     // Catch: java.lang.InterruptedException -> Laf
            dspd r6 = r6.b     // Catch: java.lang.InterruptedException -> Laf
            if (r6 == 0) goto L4d
            cksf r6 = r9.i     // Catch: java.lang.InterruptedException -> Laf
            goto L4f
        L4d:
            cksf r6 = r9.a     // Catch: java.lang.InterruptedException -> Laf
        L4f:
            crox r7 = r9.h     // Catch: java.lang.InterruptedException -> Laf
            r8 = r1
            crff r8 = (defpackage.crff) r8     // Catch: java.lang.InterruptedException -> Laf
            java.lang.String r8 = r8.a     // Catch: java.lang.InterruptedException -> Laf
            r7.m(r8)     // Catch: java.lang.InterruptedException -> Laf
            boolean r6 = r6.a(r1, r2)     // Catch: java.lang.InterruptedException -> Laf
            crox r7 = r9.h     // Catch: java.lang.InterruptedException -> Laf
            r8 = r1
            crff r8 = (defpackage.crff) r8     // Catch: java.lang.InterruptedException -> Laf
            java.lang.String r8 = r8.a     // Catch: java.lang.InterruptedException -> Laf
            r7.n(r8)     // Catch: java.lang.InterruptedException -> Laf
            if (r6 == 0) goto L6b
            r6 = 1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            if (r3 != 0) goto L9c
            if (r6 == 0) goto L9b
            java.io.File r3 = new java.io.File     // Catch: java.lang.InterruptedException -> Laf
            r3.<init>(r2)     // Catch: java.lang.InterruptedException -> Laf
            cksj r2 = r9.f     // Catch: java.lang.InterruptedException -> Laf
            btvo r6 = r9.e     // Catch: java.lang.InterruptedException -> Laf
            crdz r7 = r9.k     // Catch: java.lang.InterruptedException -> Laf
            cksi r6 = defpackage.ckse.a(r6, r1, r7)     // Catch: java.lang.InterruptedException -> Laf
            java.lang.String r6 = defpackage.cksj.b(r6)     // Catch: java.lang.InterruptedException -> Laf
            ckrx r7 = r2.a     // Catch: java.lang.InterruptedException -> Laf
            boolean r3 = r7.e(r3, r6)     // Catch: java.lang.InterruptedException -> Laf
            r7 = 0
            if (r3 == 0) goto L99
            ckrx r2 = r2.a     // Catch: java.lang.InterruptedException -> Laf
            java.lang.String r2 = r2.a(r6)     // Catch: java.lang.InterruptedException -> Laf
            if (r2 == 0) goto L99
            java.io.File r7 = new java.io.File     // Catch: java.lang.InterruptedException -> Laf
            r7.<init>(r2)     // Catch: java.lang.InterruptedException -> Laf
        L99:
            if (r7 != 0) goto L9c
        L9b:
            r4 = 0
        L9c:
            cksq r0 = r0.b     // Catch: java.lang.InterruptedException -> Laf
            cksq r2 = defpackage.cksq.NOW     // Catch: java.lang.InterruptedException -> Laf
            if (r0 != r2) goto Lb3
            bvrb r0 = r9.g     // Catch: java.lang.InterruptedException -> Laf
            cksc r2 = new cksc     // Catch: java.lang.InterruptedException -> Laf
            r2.<init>(r9, r1, r4)     // Catch: java.lang.InterruptedException -> Laf
            bvrj r1 = defpackage.bvrj.ALERT_CONTROLLER     // Catch: java.lang.InterruptedException -> Laf
            r0.b(r2, r1)     // Catch: java.lang.InterruptedException -> Laf
            goto Lb3
        Laf:
            r0 = move-exception
            defpackage.bvoo.j(r0)
        Lb3:
            bvrb r0 = r9.g
            bvrj r1 = defpackage.bvrj.NETWORK_TTS_SYNTHESIS
            r0.b(r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cksd.run():void");
    }
}
