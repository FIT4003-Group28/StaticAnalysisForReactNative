package defpackage;
/* compiled from: PG */
/* renamed from: bak  reason: default package */
/* loaded from: classes2.dex */
public final class bak implements aze {
    private azh f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private baj o;
    private bao p;
    private final pwu a = new pwu(4);
    private final pwu b = new pwu(9);
    private final pwu c = new pwu(11);
    private final pwu d = new pwu();
    private final bal e = new bal();
    private int g = 1;

    private final pwu a(azf azfVar) {
        if (this.l > this.d.b()) {
            pwu pwuVar = this.d;
            int b = pwuVar.b();
            pwuVar.E(new byte[Math.max(b + b, this.l)], 0);
        } else {
            this.d.G(0);
        }
        this.d.F(this.l);
        azfVar.k(this.d.a, 0, this.l);
        return this.d;
    }

    private final void b() {
        if (!this.n) {
            this.f.ry(new azx(-9223372036854775807L));
            this.n = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r17, defpackage.azv r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bak.d(azf, azv):int");
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.f = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        azfVar.j(this.a.a, 0, 3);
        this.a.G(0);
        if (this.a.k() != 4607062) {
            return false;
        }
        azfVar.j(this.a.a, 0, 2);
        this.a.G(0);
        if ((this.a.m() & 250) != 0) {
            return false;
        }
        azfVar.j(this.a.a, 0, 4);
        this.a.G(0);
        int d = this.a.d();
        azfVar.l();
        azfVar.f(d);
        azfVar.j(this.a.a, 0, 4);
        this.a.G(0);
        return this.a.d() == 0;
    }
}
