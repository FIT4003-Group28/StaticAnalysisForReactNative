package defpackage;
/* compiled from: PG */
/* renamed from: clzk  reason: default package */
/* loaded from: classes5.dex */
public final class clzk implements clyz {
    private final cmnk a = new cmnk(10);
    private clvk b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    @Override // defpackage.clyz
    public final void a() {
        this.c = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        cmajVar.a();
        clvk RT = clupVar.RT(cmajVar.b());
        this.b = RT;
        clnf clnfVar = new clnf();
        clnfVar.a = cmajVar.c();
        clnfVar.k = "application/id3";
        RT.a(clnfVar.a());
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.clyz
    public final void d(cmnk cmnkVar) {
        cmmn.e(this.b);
        if (!this.c) {
            return;
        }
        int d = cmnkVar.d();
        int i = this.f;
        if (i < 10) {
            int min = Math.min(d, 10 - i);
            System.arraycopy(cmnkVar.a, cmnkVar.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.f(0);
                if (this.a.l() != 73 || this.a.l() != 68 || this.a.l() != 51) {
                    this.c = false;
                    return;
                } else {
                    this.a.h(3);
                    this.e = this.a.u() + 10;
                }
            }
        }
        int min2 = Math.min(d, this.e - this.f);
        this.b.d(cmnkVar, min2);
        this.f += min2;
    }

    @Override // defpackage.clyz
    public final void e() {
        int i;
        cmmn.e(this.b);
        if (!this.c || (i = this.e) == 0 || this.f != i) {
            return;
        }
        this.b.b(this.d, 1, i, 0, null);
        this.c = false;
    }
}
