package defpackage;
/* compiled from: PG */
/* renamed from: ppv  reason: default package */
/* loaded from: classes4.dex */
public final class ppv extends ppl {
    public ppt d;
    private final pqb e;
    private final boolean f;
    private final pks g;
    private final pkr h;
    private pps i;
    private boolean j;
    private boolean k;
    private boolean l;

    public ppv(pqb pqbVar, boolean z) {
        boolean z2;
        this.e = pqbVar;
        if (z) {
            pqbVar.q();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.g = new pks();
        this.h = new pkr();
        pqbVar.rK();
        this.d = new ppt(new ppu(pqbVar.r()), pks.a, ppt.b);
    }

    private final Object B(Object obj) {
        return (this.d.d == null || !obj.equals(ppt.b)) ? obj : this.d.d;
    }

    private final void C(long j) {
        pps ppsVar = this.i;
        int b = this.d.b(ppsVar.e.a);
        if (b == -1) {
            return;
        }
        long j2 = this.d.x(b, this.h).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        ppsVar.d = j;
    }

    @Override // defpackage.pqb
    /* renamed from: A */
    public final pps v(ppz ppzVar, axf axfVar, long j) {
        pps ppsVar = new pps(ppzVar, axfVar, j);
        pqb pqbVar = this.e;
        ptx.e(ppsVar.b == null);
        ppsVar.b = pqbVar;
        if (this.k) {
            ppsVar.n(ppzVar.b(B(ppzVar.a)));
        } else {
            this.i = ppsVar;
            if (!this.j) {
                this.j = true;
                x(null, this.e);
            }
        }
        return ppsVar;
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.e.r();
    }

    @Override // defpackage.ppl, defpackage.ppa
    public final void rA() {
        this.k = false;
        this.j = false;
        super.rA();
    }

    @Override // defpackage.ppl, defpackage.ppa
    public final void rz(atk atkVar) {
        super.rz(atkVar);
        if (!this.f) {
            this.j = true;
            x(null, this.e);
        }
    }

    @Override // defpackage.ppl, defpackage.pqb
    public final void s() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    @Override // defpackage.ppl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void t(java.lang.Object r11, defpackage.pqb r12, defpackage.pkt r13) {
        /*
            r10 = this;
            r0 = r11
            java.lang.Void r0 = (java.lang.Void) r0
            boolean r0 = r10.k
            r6 = 0
            if (r0 == 0) goto L1b
            ppt r0 = r10.d
            ppt r0 = r0.h(r13)
            r10.d = r0
            pps r0 = r10.i
            if (r0 == 0) goto La2
            long r0 = r0.d
            r10.C(r0)
            goto La2
        L1b:
            boolean r0 = r13.z()
            if (r0 == 0) goto L37
            boolean r0 = r10.l
            if (r0 == 0) goto L2c
            ppt r0 = r10.d
            ppt r0 = r0.h(r13)
            goto L34
        L2c:
            java.lang.Object r0 = defpackage.pks.a
            java.lang.Object r1 = defpackage.ppt.b
            ppt r0 = defpackage.ppt.i(r13, r0, r1)
        L34:
            r10.d = r0
            goto La2
        L37:
            pks r0 = r10.g
            r1 = 0
            r13.y(r1, r0)
            pks r0 = r10.g
            long r2 = r0.m
            java.lang.Object r7 = r0.b
            pps r0 = r10.i
            if (r0 == 0) goto L69
            long r4 = r0.a
            ppt r8 = r10.d
            ppz r0 = r0.e
            java.lang.Object r0 = r0.a
            pkr r9 = r10.h
            r8.f(r0, r9)
            pkr r0 = r10.h
            long r8 = r0.e
            long r8 = r8 + r4
            ppt r0 = r10.d
            pks r4 = r10.g
            pks r0 = r0.y(r1, r4)
            long r0 = r0.m
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L69
            r4 = r8
            goto L6a
        L69:
            r4 = r2
        L6a:
            pks r1 = r10.g
            pkr r2 = r10.h
            r3 = 0
            r0 = r13
            android.util.Pair r0 = r0.v(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r10.l
            if (r0 == 0) goto L89
            ppt r0 = r10.d
            ppt r0 = r0.h(r13)
            goto L8d
        L89:
            ppt r0 = defpackage.ppt.i(r13, r7, r1)
        L8d:
            r10.d = r0
            pps r0 = r10.i
            if (r0 == 0) goto La2
            r10.C(r2)
            ppz r0 = r0.e
            java.lang.Object r1 = r0.a
            java.lang.Object r1 = r10.B(r1)
            ppz r6 = r0.b(r1)
        La2:
            r0 = 1
            r10.l = r0
            r10.k = r0
            ppt r0 = r10.d
            r10.rF(r0)
            if (r6 == 0) goto Lb6
            pps r0 = r10.i
            defpackage.ptx.a(r0)
            r0.n(r6)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppv.t(java.lang.Object, pqb, pkt):void");
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        pps ppsVar = (pps) ppyVar;
        if (ppsVar.c != null) {
            pqb pqbVar = ppsVar.b;
            ptx.a(pqbVar);
            pqbVar.u(ppsVar.c);
        }
        if (ppyVar == this.i) {
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ ppz z(Object obj, ppz ppzVar) {
        Void r2 = (Void) obj;
        Object obj2 = ppzVar.a;
        Object obj3 = this.d.d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = ppt.b;
        }
        return ppzVar.b(obj2);
    }
}
