package defpackage;
/* compiled from: PG */
/* renamed from: prb  reason: default package */
/* loaded from: classes4.dex */
public final class prb extends ppa implements pqt {
    public final pjc d;
    private final pjb e;
    private final asu f;
    private final pnp g;
    private final axs h;
    private final int i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private atk n;
    private final pqz o;

    public prb(pjc pjcVar, asu asuVar, pqz pqzVar, pnp pnpVar, axs axsVar, int i) {
        pjb pjbVar = pjcVar.b;
        ptx.a(pjbVar);
        this.e = pjbVar;
        this.d = pjcVar;
        this.f = asuVar;
        this.o = pqzVar;
        this.g = pnpVar;
        this.h = axsVar;
        this.i = i;
        this.j = true;
        this.k = -9223372036854775807L;
    }

    private final void t() {
        pkt prmVar = new prm(this.k, this.l, this.m, this.d);
        if (this.j) {
            prmVar = new pqy(prmVar);
        }
        rF(prmVar);
    }

    @Override // defpackage.pqt
    public final void a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.k;
        }
        if (!this.j && this.k == j && this.l == z && this.m == z2) {
            return;
        }
        this.k = j;
        this.l = z;
        this.m = z2;
        this.j = false;
        t();
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.d;
    }

    @Override // defpackage.ppa
    protected final void rA() {
    }

    @Override // defpackage.ppa
    protected final void rz(atk atkVar) {
        this.n = atkVar;
        t();
    }

    @Override // defpackage.pqb
    public final void s() {
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        pqx pqxVar = (pqx) ppyVar;
        if (pqxVar.m) {
            for (prh prhVar : pqxVar.l) {
                prhVar.t();
            }
        }
        pqxVar.f.d(pqxVar);
        pqxVar.i.removeCallbacksAndMessages(null);
        pqxVar.j = null;
        pqxVar.t = true;
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        asv a = this.f.a();
        atk atkVar = this.n;
        if (atkVar != null) {
            a.b(atkVar);
        }
        return new pqx(this.e.a, a, new ppc(this.o.a), this.g, n(ppzVar), this.h, rJ(ppzVar), this, axfVar, this.i);
    }
}
