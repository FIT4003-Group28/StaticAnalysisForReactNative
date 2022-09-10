package defpackage;
/* compiled from: PG */
/* renamed from: cmed  reason: default package */
/* loaded from: classes5.dex */
public final class cmed extends cmdt<Void> {
    public cmeb d;
    private final cmej e;
    private final boolean f;
    private final clpa g;
    private final cloz h;
    private cmea i;
    private boolean j;
    private boolean k;
    private boolean l;

    public cmed(cmej cmejVar, boolean z) {
        this.e = cmejVar;
        boolean z2 = false;
        if (z && cmejVar.p()) {
            z2 = true;
        }
        this.f = z2;
        this.g = new clpa();
        this.h = new cloz();
        clpb o = cmejVar.o();
        if (o == null) {
            this.d = new cmeb(new cmec(cmejVar.q()), clpa.a, cmeb.b);
            return;
        }
        this.d = cmeb.a(o, null, null);
        this.l = true;
    }

    private final void A(long j) {
        cmea cmeaVar = this.i;
        int i = this.d.i(cmeaVar.b.a);
        if (i == -1) {
            return;
        }
        long j2 = this.d.y(i, this.h).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        cmeaVar.e = j;
    }

    private final Object z(Object obj) {
        return (this.d.d == null || !obj.equals(cmeb.b)) ? obj : this.d.d;
    }

    @Override // defpackage.cmdt, defpackage.cmdj
    public final void a(cmlo cmloVar) {
        super.a(cmloVar);
        if (!this.f) {
            this.j = true;
            x(this.e);
        }
    }

    @Override // defpackage.cmdt, defpackage.cmdj
    public final void d() {
        this.k = false;
        this.j = false;
        super.d();
    }

    @Override // defpackage.cmej
    public final clno q() {
        return this.e.q();
    }

    @Override // defpackage.cmdt, defpackage.cmej
    public final void r() {
    }

    @Override // defpackage.cmej
    public final void s(cmeg cmegVar) {
        cmea cmeaVar = (cmea) cmegVar;
        cmeg cmegVar2 = cmeaVar.c;
        if (cmegVar2 != null) {
            cmeaVar.a.s(cmegVar2);
        }
        if (cmegVar == this.i) {
            this.i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    @Override // defpackage.cmdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void v(defpackage.clpb r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            r1 = 0
            if (r0 == 0) goto L18
            cmeb r0 = r9.d
            cmeb r10 = r0.b(r10)
            r9.d = r10
            cmea r10 = r9.i
            if (r10 == 0) goto L85
            long r2 = r10.e
            r9.A(r2)
            goto L85
        L18:
            boolean r0 = r10.t()
            if (r0 == 0) goto L34
            boolean r0 = r9.l
            if (r0 == 0) goto L29
            cmeb r0 = r9.d
            cmeb r10 = r0.b(r10)
            goto L31
        L29:
            java.lang.Object r0 = defpackage.clpa.a
            java.lang.Object r2 = defpackage.cmeb.b
            cmeb r10 = defpackage.cmeb.a(r10, r0, r2)
        L31:
            r9.d = r10
            goto L85
        L34:
            r0 = 0
            clpa r2 = r9.g
            r10.u(r0, r2)
            clpa r4 = r9.g
            long r2 = r4.n
            cmea r0 = r9.i
            if (r0 == 0) goto L4c
            long r5 = r0.d
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L4c
            r7 = r5
            goto L4d
        L4c:
            r7 = r2
        L4d:
            java.lang.Object r0 = r4.b
            cloz r5 = r9.h
            r6 = 0
            r3 = r10
            android.util.Pair r2 = r3.w(r4, r5, r6, r7)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r9.l
            if (r2 == 0) goto L6c
            cmeb r0 = r9.d
            cmeb r10 = r0.b(r10)
            goto L70
        L6c:
            cmeb r10 = defpackage.cmeb.a(r10, r0, r3)
        L70:
            r9.d = r10
            cmea r10 = r9.i
            if (r10 == 0) goto L85
            r9.A(r4)
            cmeh r10 = r10.b
            java.lang.Object r0 = r10.a
            java.lang.Object r0 = r9.z(r0)
            cmeh r1 = r10.a(r0)
        L85:
            r10 = 1
            r9.l = r10
            r9.k = r10
            cmeb r10 = r9.d
            r9.e(r10)
            if (r1 == 0) goto L99
            cmea r10 = r9.i
            defpackage.cmmn.f(r10)
            r10.o(r1)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmed.v(clpb):void");
    }

    @Override // defpackage.cmdt
    protected final /* bridge */ /* synthetic */ cmeh w(cmeh cmehVar) {
        Object obj = cmehVar.a;
        Object obj2 = this.d.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = cmeb.b;
        }
        return cmehVar.a(obj);
    }

    @Override // defpackage.cmej
    /* renamed from: y */
    public final cmea t(cmeh cmehVar, cmkk cmkkVar, long j) {
        cmea cmeaVar = new cmea(this.e, cmehVar, cmkkVar, j);
        if (this.k) {
            cmeaVar.o(cmehVar.a(z(cmehVar.a)));
        } else {
            this.i = cmeaVar;
            if (!this.j) {
                this.j = true;
                x(this.e);
            }
        }
        return cmeaVar;
    }
}
