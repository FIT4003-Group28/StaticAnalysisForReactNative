package defpackage;
/* compiled from: PG */
/* renamed from: crsi  reason: default package */
/* loaded from: classes5.dex */
public final class crsi implements crgy {
    public long a;
    public amub b;
    private final btvo c;
    private final cqat d;
    private final btrm e;
    private final bvjj f;
    private final crsq g;
    private final ckcw h;
    private long i;
    private final crsh j;

    public crsi(btvo btvoVar, cqat cqatVar, btrm btrmVar, bvjj bvjjVar, ckcw ckcwVar, crsh crshVar, crsq crsqVar) {
        this.c = btvoVar;
        this.d = cqatVar;
        this.e = btrmVar;
        this.f = bvjjVar;
        this.h = ckcwVar;
        this.j = crshVar;
        this.g = crsqVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        this.i = this.d.e();
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(crhp.class, new crsj(0, crhp.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crhm.class, new crsj(1, crhm.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.e.a(this);
        if (z) {
            return;
        }
        if (!this.c.getUgcParameters().F()) {
            ((ckco) this.h.a(ckhi.T)).a(2);
            return;
        }
        amub amubVar = this.b;
        if (amubVar == null) {
            ((ckco) this.h.a(ckhi.T)).a(3);
            return;
        }
        disc a = crsq.a(this.a, amubVar, this.d.b(), this.d.e() - this.i);
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dirt dirtVar = (dirt) dsqpVar;
        int s = this.f.s(bvjk.jm, 0);
        if (dirtVar.c) {
            dirtVar.bF();
            dirtVar.c = false;
        }
        disc discVar = (disc) dirtVar.b;
        disc discVar2 = disc.j;
        discVar.a |= 256;
        discVar.h = s;
        this.g.b(dirtVar.bK());
    }
}
