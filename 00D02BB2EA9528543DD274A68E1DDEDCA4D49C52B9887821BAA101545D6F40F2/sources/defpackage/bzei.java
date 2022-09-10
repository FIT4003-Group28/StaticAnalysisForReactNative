package defpackage;
/* compiled from: PG */
/* renamed from: bzei  reason: default package */
/* loaded from: classes4.dex */
public final class bzei extends bzek {
    private final bzgj d;
    private amuo e;
    private final amub f;
    private final bzfm g;
    private final bzdn h;
    private final byzk i;
    private final bzfw j;
    private final bzfj k;
    private int l;
    private double m;
    private long n;
    private int o;
    private int p;

    public bzei(amub amubVar, bzfw bzfwVar, bzfm bzfmVar, bzdn bzdnVar, byzk byzkVar, bzfj bzfjVar, cqat cqatVar, dbsz<bzek> dbszVar, bzdg bzdgVar) {
        super(dbszVar, bzdgVar, cqatVar);
        this.d = new bzgj();
        dbsk.l(bzdgVar.c() == dqvj.WALK);
        this.e = bzdgVar.b;
        this.f = amubVar;
        this.g = bzfmVar;
        this.h = bzdnVar;
        this.i = byzkVar;
        this.l = bzdgVar.w();
        this.n = bzdgVar.y().g();
        this.j = bzfwVar;
        this.k = bzfjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final int a(amuo amuoVar) {
        return this.b.G(amuoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final /* bridge */ /* synthetic */ bzdh b() {
        bzdg bzdgVar = this.b;
        return new bzct(bzdgVar, bzdgVar.F() ? amvj.j(this.f.k()) : this.b.B().e(), f(), this.b.F(), this.l, this.m, this.f.I);
    }

    @Override // defpackage.bzek
    public final void c() {
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final bzek d() {
        bzdg B = this.b.B();
        if (B.D()) {
            return this.h.a(this.a, B);
        }
        if (B.c() == dqvj.TRANSIT) {
            return this.g.a(this.a, B);
        }
        String valueOf = String.valueOf(B.c());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("Can not handle next travel mode:");
        sb.append(valueOf);
        return p(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x0048, B:12:0x0053, B:14:0x0060, B:16:0x0066, B:18:0x0078, B:21:0x0082, B:24:0x0087, B:26:0x0096, B:28:0x009c, B:30:0x00a2, B:32:0x00aa, B:33:0x00b0, B:34:0x00b5, B:35:0x00bb, B:37:0x00c3, B:38:0x00c8, B:40:0x00ce, B:41:0x00d2), top: B:46:0x0001 }] */
    @Override // defpackage.bzek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.cray r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzei.e(cray):boolean");
    }

    @Override // defpackage.bzek
    public final eaow f() {
        return eaow.d(this.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final void g() {
        dbsk.l(this.d.c());
        this.j.b(new bzfq(this) { // from class: bzeh
            private final bzei a;

            {
                this.a = this;
            }

            @Override // defpackage.bzfq
            public final void a(Object obj) {
                this.a.e((cray) obj);
            }
        }, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean i() {
        return true;
    }

    @Override // defpackage.bzek
    protected final void j(int i) {
        ddsd bZ = ddsg.q.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar = (ddsg) bZ.b;
        ddsgVar.c = i - 1;
        ddsgVar.a |= 2;
        ddsg ddsgVar2 = (ddsg) bZ.b;
        ddsgVar2.b = 2;
        int i2 = ddsgVar2.a | 1;
        ddsgVar2.a = i2;
        int i3 = this.o;
        int i4 = i2 | 32;
        ddsgVar2.a = i4;
        ddsgVar2.f = i3;
        int i5 = this.p;
        ddsgVar2.a = i4 | 64;
        ddsgVar2.g = i5;
        boolean F = this.b.F();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar3 = (ddsg) bZ.b;
        ddsgVar3.a |= 512;
        ddsgVar3.j = F;
        int w = this.b.w();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar4 = (ddsg) bZ.b;
        int i6 = ddsgVar4.a | 1024;
        ddsgVar4.a = i6;
        ddsgVar4.k = w;
        int i7 = this.l;
        ddsgVar4.a = i6 | 2048;
        ddsgVar4.l = i7;
        n(bZ);
        this.i.a(bZ.bK());
    }
}
