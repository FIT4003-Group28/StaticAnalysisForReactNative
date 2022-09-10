package defpackage;
/* compiled from: PG */
/* renamed from: cmfe  reason: default package */
/* loaded from: classes5.dex */
public final class cmfe extends cmdj implements cmex {
    public final clno d;
    private final clnn e;
    private final cmkf f;
    private final clus g;
    private final cltu h;
    private boolean i;
    private long j;
    private boolean k;
    private boolean l;
    private cmlo m;
    private final cmks n;

    public cmfe(clno clnoVar, cmkf cmkfVar, clus clusVar, cltu cltuVar, cmks cmksVar) {
        clnn clnnVar = clnoVar.b;
        cmmn.f(clnnVar);
        this.e = clnnVar;
        this.d = clnoVar;
        this.f = cmkfVar;
        this.g = clusVar;
        this.h = cltuVar;
        this.n = cmksVar;
        this.i = true;
        this.j = -9223372036854775807L;
    }

    private final void u() {
        long j = this.j;
        clpb cmfoVar = new cmfo(j, j, this.k, this.l, this.d);
        if (this.i) {
            cmfoVar = new cmfc(cmfoVar);
        }
        e(cmfoVar);
    }

    @Override // defpackage.cmdj
    protected final void a(cmlo cmloVar) {
        this.m = cmloVar;
        u();
    }

    @Override // defpackage.cmex
    public final void b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.j;
        }
        if (!this.i && this.j == j && this.k == z && this.l == z2) {
            return;
        }
        this.j = j;
        this.k = z;
        this.l = z2;
        this.i = false;
        u();
    }

    @Override // defpackage.cmdj
    protected final void d() {
    }

    @Override // defpackage.cmej
    public final clno q() {
        return this.d;
    }

    @Override // defpackage.cmej
    public final void r() {
    }

    @Override // defpackage.cmej
    public final void s(cmeg cmegVar) {
        cmfj[] cmfjVarArr;
        cmfb cmfbVar = (cmfb) cmegVar;
        if (cmfbVar.m) {
            for (cmfj cmfjVar : cmfbVar.l) {
                cmfjVar.p();
                cmfjVar.r();
            }
        }
        cmli cmliVar = cmfbVar.f;
        cmld<? extends cmle> cmldVar = cmliVar.d;
        if (cmldVar != null) {
            cmldVar.b(true);
        }
        cmliVar.c.execute(new cmlg(cmfbVar));
        cmliVar.c.shutdown();
        cmfbVar.i.removeCallbacksAndMessages(null);
        cmfbVar.j = null;
        cmfbVar.x = true;
    }

    @Override // defpackage.cmej
    public final cmeg t(cmeh cmehVar, cmkk cmkkVar, long j) {
        cmkg a = this.f.a();
        cmlo cmloVar = this.m;
        if (cmloVar != null) {
            a.b(cmloVar);
        }
        return new cmfb(this.e.a, a, this.g, this.h, g(cmehVar), this.n, f(cmehVar), this, cmkkVar);
    }
}
