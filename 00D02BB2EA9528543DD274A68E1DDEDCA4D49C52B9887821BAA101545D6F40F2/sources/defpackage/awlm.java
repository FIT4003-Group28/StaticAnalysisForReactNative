package defpackage;
/* compiled from: PG */
/* renamed from: awlm  reason: default package */
/* loaded from: classes3.dex */
public final class awlm {
    private final bvjj a;
    private final bvjk b;
    private final cqat c;
    private eaow d = eaow.a;
    private int e = 0;
    private long f = -1;
    private long g = -1;
    private boolean h = false;

    public awlm(cqat cqatVar, bvjj bvjjVar, bvjk bvjkVar) {
        this.a = bvjjVar;
        this.b = bvjkVar;
        this.c = cqatVar;
    }

    private final void f() {
        if (this.f >= 0) {
            long e = this.c.e();
            this.d = this.d.j(eaow.e(e - this.f));
            this.f = e;
            g();
        }
    }

    private final void g() {
        awlq bZ = awlr.d.bZ();
        if (this.d.p(eaow.a)) {
            long j = this.d.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            awlr awlrVar = (awlr) bZ.b;
            awlrVar.a |= 1;
            awlrVar.b = j;
        }
        long j2 = this.g;
        if (j2 >= 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            awlr awlrVar2 = (awlr) bZ.b;
            awlrVar2.a |= 2;
            awlrVar2.c = j2;
        }
        this.a.al(this.b, bZ.bK());
    }

    public final synchronized void a() {
        dbsk.l(!this.h);
        this.h = true;
        awlr awlrVar = (awlr) this.a.L(this.b, (dssr) awlr.d.cu(7), awlr.d);
        this.d = eaow.e(awlrVar.b);
        if ((awlrVar.a & 2) != 0) {
            long b = this.c.b() - awlrVar.c;
            if (b > 0) {
                this.d = this.d.j(eaow.e(b));
            }
            g();
        }
    }

    public final synchronized void b() {
        dbsk.l(this.h);
        if (this.e == 0) {
            this.f = this.c.e();
            this.g = this.c.b();
            g();
        }
        this.e++;
    }

    public final synchronized void c() {
        dbsk.l(this.h);
        dbsk.l(this.e > 0);
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.d = this.d.j(eaow.e(this.c.e() - this.f));
            this.f = -1L;
            this.g = -1L;
            g();
        }
    }

    public final synchronized void d() {
        dbsk.l(this.h);
        f();
        this.d = eaow.a;
        g();
    }

    public final synchronized eaow e() {
        dbsk.l(this.h);
        f();
        return this.d;
    }
}
