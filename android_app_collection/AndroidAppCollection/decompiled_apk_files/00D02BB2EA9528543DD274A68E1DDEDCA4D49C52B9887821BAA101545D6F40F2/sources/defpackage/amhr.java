package defpackage;

import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: amhr  reason: default package */
/* loaded from: classes.dex */
final class amhr extends amhk {
    private static final dcqe a = dcqe.c("amhr");
    private static final double b;
    private static final double c;
    private akrk A;
    private ammu B;
    private amhx C;
    @dzsi
    private bnve D;
    private float[] E;
    private float F;
    private boolean G;
    private float H;
    private boolean I;
    private float v;
    private float w;
    private int x;
    @dzsi
    private amll z;
    private final amla d = new amla();
    private volatile float t = 0.0f;
    private final akra u = new akra();
    private int L = 2;
    private String y = "";
    @dzsi
    private bnrs J = null;
    @dzsi
    private bnrs K = null;

    static {
        double radians = Math.toRadians(60.0d);
        b = radians;
        c = Math.cos(radians);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192 A[LOOP:2: B:47:0x0190->B:48:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean c(defpackage.amjo r19, defpackage.akzh r20, float r21, float r22, float r23, defpackage.alin r24) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhr.c(amjo, akzh, float, float, float, alin):boolean");
    }

    private static float d(akzh akzhVar, akrk akrkVar, akra akraVar) {
        akrkVar.n(akrkVar.l() >> 1, akraVar);
        return Math.min(1.0f, akyx.d(akzhVar, akraVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amhk
    public final void a() {
        this.y = "";
        this.A = null;
        this.G = false;
        this.H = -5.5903872E8f;
        this.B = null;
        this.F = -5.5903872E8f;
        bnve bnveVar = this.D;
        if (bnveVar != null) {
            bnveVar.c();
            this.D = null;
        }
        this.C = null;
        this.E = null;
        this.I = false;
        this.K = null;
        this.J = null;
        this.t = 0.0f;
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(amkk amkkVar, int i, @dzsi String str, alxo alxoVar, float f, int i2, float f2, akra akraVar, int i3, bnrz bnrzVar, amky amkyVar, ammu ammuVar, @dzsi amll amllVar) {
        super.E(amkkVar, i, alxoVar, bnrzVar, amkyVar);
        akrk b2 = amkkVar.i().b();
        dbsk.s(b2);
        this.A = b2;
        this.w = f;
        this.L = i2;
        this.y = dbsj.e(str);
        this.v = f2;
        this.B = ammuVar;
        this.u.aa(akraVar);
        this.x = i3;
        this.z = amllVar;
    }

    @Override // defpackage.amhk, defpackage.amhh
    public final void e() {
        bnvf a2;
        Semaphore semaphore;
        this.e.acquireUninterruptibly();
        try {
            if (this.D != null) {
                semaphore = this.e;
            } else {
                if (this.y.isEmpty()) {
                    amll amllVar = this.z;
                    if (amllVar != null && (a2 = amllVar.a()) != null) {
                        bnve b2 = a2.b(0);
                        this.D = b2;
                        if (b2 != null) {
                            this.E = new float[]{0.0f, b2.d};
                        }
                    }
                } else {
                    this.D = this.B.b(this.y, this.h, this.F);
                    ammu ammuVar = this.B;
                    String str = this.y;
                    alxo alxoVar = this.h;
                    float f = this.F;
                    int length = str.length() + 1;
                    float[] fArr = new float[length];
                    ammuVar.c(alxoVar.q);
                    ammuVar.a.setTextSize(f);
                    ammuVar.a.getTextWidths(str, fArr);
                    float ceil = (int) Math.ceil((amkw.b(alxoVar) * ammuVar.b) / 2.0f);
                    float f2 = ceil;
                    int i = 0;
                    while (i < length) {
                        fArr[i] = f2;
                        i++;
                        f2 = fArr[i] + f2;
                    }
                    fArr[0] = fArr[0] - ceil;
                    int i2 = length - 1;
                    float f3 = fArr[i2] + ceil;
                    fArr[i2] = f3;
                    fArr[i2] = f3 * ammuVar.c;
                    this.E = fArr;
                }
                semaphore = this.e;
            }
            semaphore.release();
        } catch (Throwable th) {
            this.e.release();
            throw th;
        }
    }

    @Override // defpackage.amhh
    public final float f() {
        return this.t;
    }

    @Override // defpackage.amhh
    public final amla j() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (r0 < (-15.0f)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:8:0x0023, B:12:0x002d, B:14:0x0045, B:16:0x0052, B:48:0x020e, B:50:0x021f, B:53:0x022c, B:55:0x0233, B:56:0x026d, B:58:0x027b, B:59:0x027f, B:18:0x0062, B:22:0x0081, B:24:0x009c, B:32:0x00ae, B:34:0x00b4, B:35:0x00d3, B:37:0x00db, B:39:0x00df, B:40:0x00f0, B:42:0x00fd, B:44:0x0128, B:45:0x016f, B:47:0x01cd, B:36:0x00d9), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:8:0x0023, B:12:0x002d, B:14:0x0045, B:16:0x0052, B:48:0x020e, B:50:0x021f, B:53:0x022c, B:55:0x0233, B:56:0x026d, B:58:0x027b, B:59:0x027f, B:18:0x0062, B:22:0x0081, B:24:0x009c, B:32:0x00ae, B:34:0x00b4, B:35:0x00d3, B:37:0x00db, B:39:0x00df, B:40:0x00f0, B:42:0x00fd, B:44:0x0128, B:45:0x016f, B:47:0x01cd, B:36:0x00d9), top: B:66:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f A[Catch: all -> 0x0288, TryCatch #0 {all -> 0x0288, blocks: (B:8:0x0023, B:12:0x002d, B:14:0x0045, B:16:0x0052, B:48:0x020e, B:50:0x021f, B:53:0x022c, B:55:0x0233, B:56:0x026d, B:58:0x027b, B:59:0x027f, B:18:0x0062, B:22:0x0081, B:24:0x009c, B:32:0x00ae, B:34:0x00b4, B:35:0x00d3, B:37:0x00db, B:39:0x00df, B:40:0x00f0, B:42:0x00fd, B:44:0x0128, B:45:0x016f, B:47:0x01cd, B:36:0x00d9), top: B:66:0x0023 }] */
    @Override // defpackage.amhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(defpackage.amjo r34, defpackage.akzh r35, defpackage.bntz r36) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhr.q(amjo, akzh, bntz):boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.amhh
    public final boolean r(amjo amjoVar, akzh akzhVar) {
        float c2;
        float f;
        float f2;
        float f3 = 0.0f;
        if (!this.G) {
            float c3 = amkw.c(this.h.b() ? this.h.q.c() : 0, this.k, akzhVar.B());
            this.G = true;
            this.e.acquireUninterruptibly();
            try {
                if (!this.y.isEmpty()) {
                    this.F = c3;
                    alyf alyfVar = this.h.q;
                    if (alyfVar != null) {
                        f2 = alyfVar.d();
                        if (this.h.q.b() == 0) {
                            f2 = 0.0f;
                        }
                    } else {
                        f2 = 2.8f;
                    }
                    ammu ammuVar = this.B;
                    String str = this.y;
                    alyf alyfVar2 = this.h.q;
                    float f4 = this.F;
                    ammuVar.c(alyfVar2);
                    ammuVar.a.setTextSize(f4);
                    this.H = ammuVar.a.measureText(str) + (f2 * ammuVar.b);
                } else {
                    amll amllVar = this.z;
                    if (amllVar != null) {
                        this.F = amllVar.c;
                        this.H = amllVar.b;
                    }
                }
                float f5 = this.H;
                bnve bnveVar = this.D;
                if (bnveVar != null) {
                    bnveVar.c();
                    this.D = null;
                }
                this.e.release();
                if (f5 == 0.0f) {
                    this.f.e();
                    return false;
                }
            } catch (Throwable th) {
                this.e.release();
                throw th;
            }
        }
        float d = d(akzhVar, this.A, amjoVar.e);
        akzc e = akzhVar.e();
        if (e.a(this.J, amjoVar.a)) {
            amla amlaVar = this.d;
            akse akseVar = amjoVar.a;
            akse.n(akseVar, akseVar);
            amlaVar.a(akseVar);
        } else {
            this.e.acquireUninterruptibly();
            try {
                float f6 = this.H * d;
                float f7 = this.F * d;
                this.e.release();
                alin alinVar = amjoVar.h;
                if (c(amjoVar, akzhVar, this.w, f6, f7, alinVar)) {
                    int i = alinVar.b;
                    akse akseVar2 = amjoVar.a;
                    if (i == 2) {
                        alinVar.h(0.5f, akseVar2);
                        c2 = f7 * 0.5f;
                        f = alinVar.b() * 0.5f;
                    } else {
                        akse akseVar3 = amjoVar.b;
                        akse akseVar4 = amjoVar.c;
                        akse akseVar5 = amjoVar.d;
                        alinVar.g(0, akseVar3);
                        alinVar.g(i - 1, akseVar4);
                        alinVar.g(i / 2, akseVar5);
                        akse.f(akseVar3, akseVar4, 0.5f, akseVar2);
                        akse.t(akseVar4, akseVar3, akseVar4);
                        float c4 = akseVar4.c();
                        akse.t(akseVar5, akseVar3, akseVar5);
                        akse.m(akseVar4, akseVar5.a(akseVar4) / (c4 * c4), akseVar4);
                        akse.t(akseVar5, akseVar4, akseVar5);
                        akse.m(akseVar5, 0.5f, akseVar5);
                        akse.i(akseVar2, akseVar5, akseVar2);
                        c2 = (akseVar5.c() + f7) * 0.5f;
                        f = c4 * 0.5f;
                    }
                    float f8 = c2;
                    int i2 = alinVar.b;
                    if (i2 >= 2) {
                        float[] fArr = alinVar.a;
                        int i3 = i2 + i2;
                        f3 = (float) Math.atan2(fArr[i3 - 1] - fArr[1], fArr[i3 - 2] - fArr[0]);
                    }
                    this.d.h(akseVar2.b, akseVar2.c, f3, f, f8);
                }
                return false;
            } catch (Throwable th2) {
                this.e.release();
                throw th2;
            }
        }
        this.J = e.b();
        return true;
    }
}
