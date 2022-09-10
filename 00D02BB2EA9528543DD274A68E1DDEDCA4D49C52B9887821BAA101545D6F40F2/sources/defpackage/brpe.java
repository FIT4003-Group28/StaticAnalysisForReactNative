package defpackage;
/* compiled from: PG */
/* renamed from: brpe  reason: default package */
/* loaded from: classes4.dex */
public final class brpe {
    private boolean a;
    private boolean b;
    private long c;
    private long d;
    private final btxz e;
    private final cqat f;
    @dzsi
    private final avoo g;
    @dzsi
    private final dxio<avij> h;
    private final int l;
    @dzsi
    private int k = 0;
    @dzsi
    private dwiv i = null;
    @dzsi
    private dwiv j = null;

    public brpe(@dzsi dxio<avij> dxioVar, cqat cqatVar, @dzsi avoo avooVar, btxz btxzVar, int i) {
        this.h = dxioVar;
        this.f = cqatVar;
        this.g = avooVar;
        this.e = btxzVar;
        this.l = i;
    }

    private final void e(int i) {
        if (this.l == 1) {
            btxz btxzVar = this.e;
            int i2 = i - 1;
            ckgz ckgzVar = ckjw.q;
            ckcw ckcwVar = btxzVar.a;
            if (ckcwVar == null) {
                return;
            }
            ((ckco) ckcwVar.a(ckgzVar)).a(i2);
        }
    }

    public final void a(int i, int i2, @dzsi dwiv dwivVar) {
        if (i == 2) {
            int i3 = i2 - 1;
            if (i3 == 0) {
                d(2, dwivVar);
                return;
            } else if (i3 == 1) {
                d(3, dwivVar);
                return;
            } else if (i3 == 2) {
                d(4, dwivVar);
                return;
            } else if (i3 == 5) {
                d(5, dwivVar);
                return;
            }
        } else {
            int i4 = i2 - 1;
            if (i4 == 0) {
                d(7, dwivVar);
                return;
            } else if (i4 == 2) {
                d(8, dwivVar);
                return;
            } else if (i4 == 3) {
                d(9, dwivVar);
                return;
            } else if (i4 == 4) {
                d(10, dwivVar);
                return;
            } else if (i4 == 5) {
                d(11, dwivVar);
                return;
            }
        }
        if (!this.a || !this.b) {
            if (this.l == 1) {
                this.e.f(1);
            } else {
                this.e.g(1);
            }
        }
    }

    public final void b(int i) {
        this.c = this.f.e();
        if (i == 1) {
            d(1, null);
        } else if (i != 2) {
        } else {
            d(6, null);
        }
    }

    private static boolean c(dvyw dvywVar, dvyw dvywVar2) {
        if (!dvywVar2.an && (dvywVar.a & 4) != 0 && (dvywVar2.a & 4) != 0) {
            return akqi.b(dvywVar.g).c == akqi.b(dvywVar2.g).c;
        }
        dhjz dhjzVar = dvywVar.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        double d = dhjzVar.c;
        dhjz dhjzVar2 = dvywVar.e;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        dcvs b = dcvs.b(d, dhjzVar2.b);
        dhjz dhjzVar3 = dvywVar2.e;
        if (dhjzVar3 == null) {
            dhjzVar3 = dhjz.e;
        }
        double d2 = dhjzVar3.c;
        dhjz dhjzVar4 = dvywVar2.e;
        if (dhjzVar4 == null) {
            dhjzVar4 = dhjz.e;
        }
        return b.m(dcvs.b(d2, dhjzVar4.b)) <= 50.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0218, code lost:
        if (r3 != 10) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021b, code lost:
        r3 = 34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
        if (r3 != 4) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(int r26, @defpackage.dzsi defpackage.dwiv r27) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brpe.d(int, dwiv):void");
    }
}
