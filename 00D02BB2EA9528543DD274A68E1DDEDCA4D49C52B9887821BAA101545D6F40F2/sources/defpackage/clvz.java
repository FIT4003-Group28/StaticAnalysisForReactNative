package defpackage;
/* compiled from: PG */
/* renamed from: clvz  reason: default package */
/* loaded from: classes5.dex */
public final class clvz implements clun {
    private clup f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private clvx o;
    private clwd p;
    private final cmnk a = new cmnk(4);
    private final cmnk b = new cmnk(9);
    private final cmnk c = new cmnk(11);
    private final cmnk d = new cmnk();
    private final clwa e = new clwa();
    private int g = 1;

    static {
        int i = clvy.a;
    }

    private final void a() {
        if (!this.n) {
            this.f.b(new clvf(-9223372036854775807L));
            this.n = true;
        }
    }

    private final cmnk b(cluk clukVar) {
        if (this.l > this.d.g()) {
            cmnk cmnkVar = this.d;
            int g = cmnkVar.g();
            cmnkVar.c(new byte[Math.max(g + g, this.l)], 0);
        } else {
            this.d.f(0);
        }
        this.d.e(this.l);
        clukVar.c(this.d.a, 0, this.l);
        return this.d;
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.f = clupVar;
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        clukVar.f(this.a.a, 0, 3);
        this.a.f(0);
        if (this.a.o() != 4607062) {
            return false;
        }
        clukVar.f(this.a.a, 0, 2);
        this.a.f(0);
        if ((this.a.m() & 250) != 0) {
            return false;
        }
        clukVar.f(this.a.a, 0, 4);
        this.a.f(0);
        int r = this.a.r();
        clukVar.i();
        clukVar.h(r);
        clukVar.f(this.a.a, 0, 4);
        this.a.f(0);
        return this.a.r() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r17, defpackage.clvd r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clvz.g(cluk, clvd):int");
    }
}
