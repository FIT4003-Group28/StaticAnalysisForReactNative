package defpackage;
/* compiled from: PG */
/* renamed from: fqv  reason: default package */
/* loaded from: classes3.dex */
public final class fqv implements yzj {
    private final yyx a;
    private final yzv b;
    private final aafo c;

    public fqv(yyx yyxVar, yzv yzvVar, aafo aafoVar) {
        this.a = yyxVar;
        this.b = yzvVar;
        this.c = aafoVar;
    }

    @Override // defpackage.yzj
    public final zdy a(Throwable th) {
        return this.a.a(th);
    }

    @Override // defpackage.yzj
    public final String b(Throwable th) {
        return this.a.b(th);
    }

    @Override // defpackage.yzj
    public final void c(int i) {
        this.a.c(i);
    }

    @Override // defpackage.yzj
    public final void d(String str) {
        this.a.d(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:9|10)|(9:12|13|14|(3:16|17|(2:26|(2:28|29)(2:30|31))(4:21|(1:23)|24|25))|33|17|(1:19)|26|(0)(0))|37|13|14|(0)|33|17|(0)|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        defpackage.zep.n("Could not parse command error details from Any.", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: aopx -> 0x005c, TRY_LEAVE, TryCatch #0 {aopx -> 0x005c, blocks: (B:16:0x003d, B:18:0x0043), top: B:40:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    @Override // defpackage.yzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cev
            if (r0 == 0) goto La
            yzv r5 = r4.b
            r5.b()
            return
        La:
            boolean r0 = r5 instanceof defpackage.zgg
            if (r0 == 0) goto La9
            r0 = r5
            zgg r0 = (defpackage.zgg) r0
            java.util.List r1 = r0.b()     // Catch: defpackage.aopx -> L35
            boolean r2 = r1.isEmpty()     // Catch: defpackage.aopx -> L35
            if (r2 != 0) goto L3b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: defpackage.aopx -> L35
            aono r1 = (defpackage.aono) r1     // Catch: defpackage.aopx -> L35
            aoob r1 = r1.c     // Catch: defpackage.aopx -> L35
            aoos r2 = defpackage.aoos.b()     // Catch: defpackage.aopx -> L35
            aono r3 = defpackage.aono.a     // Catch: defpackage.aopx -> L35
            aopi r1 = defpackage.aopi.parseFrom(r3, r1, r2)     // Catch: defpackage.aopx -> L35
            aono r1 = (defpackage.aono) r1     // Catch: defpackage.aopx -> L35
            ampq r1 = defpackage.ampq.j(r1)     // Catch: defpackage.aopx -> L35
            goto L3d
        L35:
            r1 = move-exception
            java.lang.String r2 = "Could not parse Any detail from StatusError."
            defpackage.zep.n(r2, r1)
        L3b:
            amon r1 = defpackage.amon.a
        L3d:
            boolean r2 = r1.h()     // Catch: defpackage.aopx -> L5c
            if (r2 == 0) goto L62
            java.lang.Object r1 = r1.c()     // Catch: defpackage.aopx -> L5c
            aono r1 = (defpackage.aono) r1     // Catch: defpackage.aopx -> L5c
            aoob r1 = r1.c     // Catch: defpackage.aopx -> L5c
            aoos r2 = defpackage.aoos.b()     // Catch: defpackage.aopx -> L5c
            apzc r3 = defpackage.apzc.a     // Catch: defpackage.aopx -> L5c
            aopi r1 = defpackage.aopi.parseFrom(r3, r1, r2)     // Catch: defpackage.aopx -> L5c
            apzc r1 = (defpackage.apzc) r1     // Catch: defpackage.aopx -> L5c
            ampq r1 = defpackage.ampq.j(r1)     // Catch: defpackage.aopx -> L5c
            goto L64
        L5c:
            r1 = move-exception
            java.lang.String r2 = "Could not parse command error details from Any."
            defpackage.zep.n(r2, r1)
        L62:
            amon r1 = defpackage.amon.a
        L64:
            boolean r2 = r1.h()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.c()
            apzc r2 = (defpackage.apzc) r2
            int r2 = r2.b
            r2 = r2 & 1
            if (r2 == 0) goto L8b
            aafo r5 = r4.c
            java.lang.Object r0 = r1.c()
            apzc r0 = (defpackage.apzc) r0
            com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand r0 = r0.c
            if (r0 != 0) goto L84
            com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand r0 = com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand.a
        L84:
            aopu r0 = r0.b
            r1 = 0
            r5.d(r0, r1)
            return
        L8b:
            java.lang.String r1 = r0.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L9f
            yyx r5 = r4.a
            java.lang.String r0 = r0.getMessage()
            r5.d(r0)
            return
        L9f:
            yyx r0 = r4.a
            java.lang.String r5 = r4.b(r5)
            r0.d(r5)
            return
        La9:
            yyx r0 = r4.a
            java.lang.String r5 = r4.b(r5)
            r0.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqv.e(java.lang.Throwable):void");
    }
}
