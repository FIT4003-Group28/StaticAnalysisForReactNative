package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avxy  reason: default package */
/* loaded from: classes3.dex */
public final class avxy implements crzp<avkr> {
    final /* synthetic */ avxz a;
    @dzsi
    private avkr b = null;
    private boolean c = false;

    public avxy(avxz avxzVar) {
        this.a = avxzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        if (((defpackage.avkn) r1).a.isEmpty() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
        if (((defpackage.avkn) r1).d != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
        if (r3 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
        if (r10.c == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
        r10.a.a.execute(new defpackage.avxx(r10, r1));
     */
    @Override // defpackage.crzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void On(defpackage.crzm<defpackage.avkr> r11) {
        /*
            r10 = this;
            avxz r0 = r10.a
            monitor-enter(r0)
            java.lang.Object r11 = r11.l()     // Catch: java.lang.Throwable -> Lbe
            avkr r11 = (defpackage.avkr) r11     // Catch: java.lang.Throwable -> Lbe
            if (r11 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbe
            return
        Ld:
            avkr r1 = r10.b     // Catch: java.lang.Throwable -> Lbe
            avks r1 = defpackage.avkt.a(r1, r11)     // Catch: java.lang.Throwable -> Lbe
            r10.b = r11     // Catch: java.lang.Throwable -> Lbe
            avxz r2 = r10.a     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r2.e     // Catch: java.lang.Throwable -> Lbe
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L27
            dcdn r2 = r11.c()     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto L2e
        L27:
            r2 = r1
            avkn r2 = (defpackage.avkn) r2     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r2.g     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto L30
        L2e:
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            avxz r5 = r10.a     // Catch: java.lang.Throwable -> Lbe
            r5.e = r3     // Catch: java.lang.Throwable -> Lbe
            awfh r5 = r5.b     // Catch: java.lang.Throwable -> Lbe
            boolean r5 = r5.j()     // Catch: java.lang.Throwable -> Lbe
            avxz r6 = r10.a     // Catch: java.lang.Throwable -> Lbe
            awfh r6 = r6.b     // Catch: java.lang.Throwable -> Lbe
            boolean r6 = r6.i()     // Catch: java.lang.Throwable -> Lbe
            avxz r7 = r10.a     // Catch: java.lang.Throwable -> Lbe
            avwq r7 = r7.c     // Catch: java.lang.Throwable -> Lbe
            if (r6 == 0) goto L53
            if (r7 != 0) goto L53
            dlug r8 = r11.g()     // Catch: java.lang.Throwable -> Lbe
            if (r8 == 0) goto L53
            r8 = 1
            goto L54
        L53:
            r8 = 0
        L54:
            if (r6 == 0) goto L61
            if (r7 == 0) goto L61
            r9 = r1
            avkn r9 = (defpackage.avkn) r9     // Catch: java.lang.Throwable -> Lbe
            dlug r9 = r9.e     // Catch: java.lang.Throwable -> Lbe
            if (r9 == 0) goto L61
            r9 = 1
            goto L62
        L61:
            r9 = 0
        L62:
            if (r7 == 0) goto L6f
            r7 = r1
            avkn r7 = (defpackage.avkn) r7     // Catch: java.lang.Throwable -> Lbe
            boolean r7 = r7.f     // Catch: java.lang.Throwable -> Lbe
            if (r7 != 0) goto L6d
            if (r6 != 0) goto L6f
        L6d:
            r7 = 1
            goto L70
        L6f:
            r7 = 0
        L70:
            if (r8 != 0) goto L78
            if (r9 != 0) goto L78
            if (r7 == 0) goto L77
            goto L78
        L77:
            r3 = 0
        L78:
            if (r2 != 0) goto La0
            r2 = r1
            avkn r2 = (defpackage.avkn) r2     // Catch: java.lang.Throwable -> Lbe
            dcdn<dspd, dltm> r2 = r2.a     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto La0
            r2 = r1
            avkn r2 = (defpackage.avkn) r2     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = r2.d     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto La0
            if (r3 != 0) goto La0
            boolean r2 = r10.c     // Catch: java.lang.Throwable -> Lbe
            if (r2 == r5) goto L93
            goto La0
        L93:
            avxz r11 = r10.a     // Catch: java.lang.Throwable -> Lbe
            java.util.concurrent.Executor r11 = r11.a     // Catch: java.lang.Throwable -> Lbe
            avxx r2 = new avxx     // Catch: java.lang.Throwable -> Lbe
            r2.<init>(r10, r1)     // Catch: java.lang.Throwable -> Lbe
            r11.execute(r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lbc
        La0:
            r10.c = r5     // Catch: java.lang.Throwable -> Lbe
            avxz r1 = r10.a     // Catch: java.lang.Throwable -> Lbe
            dcdn r2 = r11.c()     // Catch: java.lang.Throwable -> Lbe
            dccr r2 = r2.values()     // Catch: java.lang.Throwable -> Lbe
            if (r6 == 0) goto Lb3
            dlug r11 = r11.g()     // Catch: java.lang.Throwable -> Lbe
            goto Lb4
        Lb3:
            r11 = 0
        Lb4:
            r1.v(r2, r11)     // Catch: java.lang.Throwable -> Lbe
            avxz r11 = r10.a     // Catch: java.lang.Throwable -> Lbe
            r11.y()     // Catch: java.lang.Throwable -> Lbe
        Lbc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbe
            return
        Lbe:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbe
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avxy.On(crzm):void");
    }
}
