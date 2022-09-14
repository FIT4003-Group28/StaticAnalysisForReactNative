package defpackage;
/* compiled from: PG */
/* renamed from: cmdl  reason: default package */
/* loaded from: classes5.dex */
final class cmdl implements cmfk {
    public final cmfk a;
    public boolean b;
    final /* synthetic */ cmdm c;

    public cmdl(cmdm cmdmVar, cmfk cmfkVar) {
        this.c = cmdmVar;
        this.a = cmfkVar;
    }

    @Override // defpackage.cmfk
    public final boolean a() {
        return !this.c.o() && this.a.a();
    }

    @Override // defpackage.cmfk
    public final void b() {
        this.a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (r12.c == false) goto L30;
     */
    @Override // defpackage.cmfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.clng r11, defpackage.cltg r12, boolean r13) {
        /*
            r10 = this;
            cmdm r0 = r10.c
            boolean r0 = r0.o()
            r1 = -3
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r10.b
            r2 = 4
            r3 = -4
            if (r0 == 0) goto L14
            r12.setFlags(r2)
            return r3
        L14:
            cmfk r0 = r10.a
            int r13 = r0.c(r11, r12, r13)
            r0 = -5
            r4 = -9223372036854775808
            if (r13 != r0) goto L51
            com.google.android.exoplayer2.Format r12 = r11.a
            defpackage.cmmn.f(r12)
            int r13 = r12.B
            r1 = 0
            if (r13 != 0) goto L2e
            int r13 = r12.C
            if (r13 == 0) goto L50
            r13 = 0
        L2e:
            cmdm r2 = r10.c
            long r6 = r2.b
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L39
            r13 = 0
        L39:
            long r2 = r2.c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L40
            goto L42
        L40:
            int r1 = r12.C
        L42:
            clnf r12 = r12.a()
            r12.A = r13
            r12.B = r1
            com.google.android.exoplayer2.Format r12 = r12.a()
            r11.a = r12
        L50:
            return r0
        L51:
            cmdm r11 = r10.c
            long r6 = r11.c
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L7b
            if (r13 != r3) goto L62
            long r8 = r12.d
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 >= 0) goto L71
            r13 = -4
        L62:
            if (r13 != r1) goto L7b
            long r0 = r11.i()
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 != 0) goto L7b
            boolean r11 = r12.c
            if (r11 == 0) goto L71
            goto L7b
        L71:
            r12.clear()
            r12.setFlags(r2)
            r11 = 1
            r10.b = r11
            return r3
        L7b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmdl.c(clng, cltg, boolean):int");
    }

    @Override // defpackage.cmfk
    public final int d(long j) {
        if (this.c.o()) {
            return -3;
        }
        return this.a.d(j);
    }
}
