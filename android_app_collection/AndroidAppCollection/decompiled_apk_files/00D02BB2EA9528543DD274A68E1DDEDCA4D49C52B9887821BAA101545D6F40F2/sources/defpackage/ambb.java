package defpackage;
/* compiled from: PG */
/* renamed from: ambb  reason: default package */
/* loaded from: classes2.dex */
final class ambb implements amfq {
    final /* synthetic */ String a;
    final /* synthetic */ ambw b;
    final /* synthetic */ ambk c;
    final /* synthetic */ ambe d;

    public ambb(ambe ambeVar, String str, ambw ambwVar, ambk ambkVar) {
        this.d = ambeVar;
        this.a = str;
        this.b = ambwVar;
        this.c = ambkVar;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        if (amfuVar.a()) {
            final ambe ambeVar = this.d;
            final ambw ambwVar = this.b;
            final byte[] bArr = amfuVar.d;
            final ambk ambkVar = this.c;
            ambeVar.b.execute(new Runnable(ambeVar, bArr, ambwVar, ambkVar) { // from class: amaz
                private final ambe a;
                private final byte[] b;
                private final ambw c;
                private final ambk d;

                {
                    this.a = ambeVar;
                    this.b = bArr;
                    this.c = ambwVar;
                    this.d = ambkVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
                    if (r8 != false) goto L15;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r11 = this;
                        ambe r0 = r11.a
                        byte[] r1 = r11.b
                        ambw r2 = r11.c
                        ambk r3 = r11.d
                        if (r1 == 0) goto L6a
                        int r4 = r2.d
                        java.lang.String r5 = r2.a
                        int r6 = r2.b
                        dmwb r7 = r2.c
                        r8 = 0
                        r9 = 2
                        if (r4 != r9) goto L3c
                        if (r7 == 0) goto L3b
                        ambd r4 = r0.j     // Catch: java.io.IOException -> L26
                        amch r4 = r4.a()     // Catch: java.io.IOException -> L26
                        if (r4 == 0) goto L24
                        boolean r8 = r4.c(r5, r1, r7)     // Catch: java.io.IOException -> L26
                    L24:
                        r4 = 2
                        goto L4b
                    L26:
                        dxio<ckcw> r4 = r0.a
                        java.lang.Object r4 = r4.a()
                        ckcw r4 = (defpackage.ckcw) r4
                        ckgz r10 = defpackage.ckgh.aF
                        java.lang.Object r4 = r4.a(r10)
                        ckco r4 = (defpackage.ckco) r4
                        r4.a(r8)
                        r4 = 2
                        goto L4d
                    L3b:
                        r4 = 2
                    L3c:
                        r10 = 3
                        if (r4 != r10) goto L4d
                        ambd r10 = r0.j     // Catch: java.io.IOException -> L4d
                        amch r10 = r10.a()     // Catch: java.io.IOException -> L4d
                        if (r10 == 0) goto L4b
                        boolean r8 = r10.f(r5, r1)     // Catch: java.io.IOException -> L4d
                    L4b:
                        if (r8 != 0) goto L52
                    L4d:
                        amcr r8 = r0.k
                        r8.g(r6, r5, r1, r7)
                    L52:
                        int r4 = r4 + (-1)
                        if (r4 == r9) goto L5a
                        r0.k(r2, r3)
                        goto L5d
                    L5a:
                        r0.l(r2)
                    L5d:
                        java.util.Set<java.lang.String> r1 = r0.i
                        monitor-enter(r1)
                        java.util.Set<java.lang.String> r0 = r0.i     // Catch: java.lang.Throwable -> L67
                        r0.remove(r5)     // Catch: java.lang.Throwable -> L67
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
                        return
                    L67:
                        r0 = move-exception
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
                        throw r0
                    L6a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.amaz.run():void");
                }
            });
            return;
        }
        synchronized (this.d.i) {
            this.d.i.remove(this.a);
        }
        int b = amfuVar.b();
        ((ckco) this.d.a.a().a(ckgh.aF)).a((b != 0 ? b != 1 ? b != 2 ? 9 : 8 : 7 : 6) - 1);
    }
}
