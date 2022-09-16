package defpackage;
/* compiled from: PG */
/* renamed from: oyh  reason: default package */
/* loaded from: classes4.dex */
public final class oyh implements oxq, oye {
    private static final int d = pcx.c("FLV");
    public int a;
    public int b;
    public long c;
    private oxr j;
    private int l;
    private oyg m;
    private oyl n;
    private oyi o;
    private final pct e = new pct(4);
    private final pct g = new pct(9);
    private final pct h = new pct(11);
    private final pct i = new pct();
    private int k = 1;

    private final pct g(oxn oxnVar) {
        if (this.b > this.i.b()) {
            pct pctVar = this.i;
            int b = pctVar.b();
            pctVar.x(new byte[Math.max(b + b, this.b)], 0);
        } else {
            this.i.z(0);
        }
        this.i.y(this.b);
        oxnVar.h(this.i.a, 0, this.b);
        return this.i;
    }

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.j = oxrVar;
    }

    @Override // defpackage.oye
    public final long b(long j) {
        return 0L;
    }

    @Override // defpackage.oye
    public final boolean c() {
        return false;
    }

    @Override // defpackage.oxq
    public final void d() {
        this.k = 1;
        this.l = 0;
    }

    @Override // defpackage.oxq
    public final boolean f(oxn oxnVar) {
        oxnVar.g(this.e.a, 0, 3);
        this.e.z(0);
        if (this.e.i() != d) {
            return false;
        }
        oxnVar.g(this.e.a, 0, 2);
        this.e.z(0);
        if ((this.e.k() & 250) != 0) {
            return false;
        }
        oxnVar.g(this.e.a, 0, 4);
        this.e.z(0);
        int c = this.e.c();
        oxnVar.i();
        oxnVar.e(c);
        oxnVar.g(this.e.a, 0, 4);
        this.e.z(0);
        return this.e.c() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0000 A[SYNTHETIC] */
    @Override // defpackage.oxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.oxn r10, defpackage.oxz r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyh.e(oxn, oxz):int");
    }
}
