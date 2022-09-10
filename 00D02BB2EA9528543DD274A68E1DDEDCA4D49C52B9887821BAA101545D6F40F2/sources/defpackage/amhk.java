package defpackage;

import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: amhk  reason: default package */
/* loaded from: classes.dex */
abstract class amhk implements amhh {
    protected amkk f;
    protected int g;
    protected alxo h;
    protected bnrz i;
    protected amla j;
    protected amky k;
    protected float l;
    protected long m;
    protected boolean n;
    protected long o;
    public boolean p;
    public btnh<amhk> q;
    protected int r;
    protected final Semaphore e = new Semaphore(1);
    protected int s = 1;
    private int a = 0;
    private boolean b = true;

    @Override // defpackage.amhh
    public final void A(boolean z) {
        this.p = z;
    }

    @Override // defpackage.amhh
    public final void B(long j, int i) {
        float f;
        this.o = j;
        this.m = j;
        this.r = i;
        if (this.n) {
            if (i == 2) {
                f = 1.0f;
            } else if (i != 3) {
                return;
            } else {
                f = 0.0f;
            }
            this.l = f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r3 != 3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r0 >= r11) goto L28;
     */
    @Override // defpackage.amhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C(long r11) {
        /*
            r10 = this;
            long r0 = r10.o
            long r0 = r11 - r0
            r10.m = r11
            int r11 = r10.r
            long r11 = r10.D(r11)
            int r2 = r10.r
            int r3 = r2 + (-1)
            if (r2 == 0) goto L6c
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 4
            if (r3 == 0) goto L65
            r5 = 1
            r6 = 995783694(0x3b5a740e, float:0.0033333334)
            r7 = 0
            r9 = 2
            if (r3 == r5) goto L48
            r5 = 3
            if (r3 == r9) goto L26
            if (r3 == r5) goto L65
            goto L69
        L26:
            r2 = 5
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 <= 0) goto L33
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 < 0) goto L30
            goto L42
        L30:
            r10.s = r5
            goto L69
        L33:
            float r11 = r10.l
            float r12 = (float) r0
            float r12 = r12 * r6
            float r11 = r11 - r12
            r10.l = r11
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L45
            r10.l = r12
        L42:
            r10.s = r2
            goto L69
        L45:
            r10.s = r5
            goto L69
        L48:
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 <= 0) goto L51
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L62
            goto L5f
        L51:
            float r11 = r10.l
            float r12 = (float) r0
            float r12 = r12 * r6
            float r11 = r11 + r12
            r10.l = r11
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 < 0) goto L62
            r10.l = r2
        L5f:
            r10.s = r4
            goto L69
        L62:
            r10.s = r9
            goto L69
        L65:
            r10.s = r4
            r10.l = r2
        L69:
            int r11 = r10.s
            return r11
        L6c:
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhk.C(long):int");
    }

    @Override // defpackage.amhh
    public long D(int i) {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E(amkk amkkVar, int i, alxo alxoVar, bnrz bnrzVar, amky amkyVar) {
        Object b;
        dbsk.m(this.b, this);
        this.f = amkkVar;
        this.g = i;
        this.h = alxoVar;
        this.i = bnrzVar;
        this.k = amkyVar;
        this.p = false;
        this.l = 1.0f;
        this.m = 0L;
        this.o = 0L;
        this.r = 1;
        dmpn a = amkkVar.a();
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        a.f(dsqvVar);
        Object l = a.V.l(dsqvVar.d);
        if (l == null) {
            b = dsqvVar.b;
        } else {
            b = dsqvVar.b(l);
        }
        this.n = ((akus) b).i;
        this.b = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        dbsk.m(!this.b, this);
        dbsk.m(this.a == 0, this);
        this.f = null;
        this.g = -559038737;
        this.h = null;
        this.i = null;
        this.k = null;
        this.j = null;
        this.p = false;
        this.b = true;
        btnh<amhk> btnhVar = this.q;
        if (btnhVar != null) {
            btnhVar.h(this);
            this.q = null;
        }
    }

    @Override // defpackage.amhh
    public void e() {
        throw null;
    }

    @Override // defpackage.amhh
    public boolean g() {
        return false;
    }

    @Override // defpackage.amhh
    @dzsi
    public aktd k() {
        return null;
    }

    @Override // defpackage.amhh
    public void l(boolean z) {
    }

    @Override // defpackage.amhh, defpackage.amyg
    public int m(amxr amxrVar, boolean z, akra akraVar) {
        return 1;
    }

    @Override // defpackage.amhh
    public void n(akra akraVar, int i, btrm btrmVar) {
    }

    @Override // defpackage.amhh
    public final amkk s() {
        return this.f;
    }

    @Override // defpackage.amhh
    public final int t() {
        return this.g;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.f("id", this.g);
        b.b("style", this.h);
        amkk amkkVar = this.f;
        Object obj = "<null>";
        b.b("minZoomLevel", amkkVar == null ? obj : Float.valueOf(amkkVar.k()));
        amkk amkkVar2 = this.f;
        if (amkkVar2 != null) {
            obj = Integer.valueOf(amkkVar2.f());
        }
        b.b("rank", obj);
        b.b("drawOrder", this.i);
        b.b("debugBound", null);
        b.e("opacity", this.l);
        b.f("referenceMask", this.a);
        b.h("destructed", this.b);
        b.b("labelPool", this.q);
        return b.toString();
    }

    @Override // defpackage.amhh
    @dzsi
    public amla u() {
        return null;
    }

    @Override // defpackage.amhh
    public final bnrz v() {
        return this.i;
    }

    @Override // defpackage.amhh
    public final synchronized void w(int i) {
        boolean z = true;
        dbsk.m(!this.b, this);
        if ((this.a & i) != 0) {
            z = false;
        }
        dbsk.m(z, this);
        this.a = i | this.a;
    }

    @Override // defpackage.amhh
    public final synchronized void x(int i) {
        dbsk.m((this.a & i) != 0, this);
        int i2 = (i ^ (-1)) & this.a;
        this.a = i2;
        if (i2 == 0) {
            a();
        }
    }

    @Override // defpackage.amhh
    public boolean y() {
        return false;
    }

    @Override // defpackage.amhh
    public final boolean z() {
        return this.p;
    }
}
