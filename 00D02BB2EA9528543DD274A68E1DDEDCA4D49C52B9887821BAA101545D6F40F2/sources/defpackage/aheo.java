package defpackage;
/* compiled from: PG */
/* renamed from: aheo  reason: default package */
/* loaded from: classes2.dex */
public class aheo implements agzp {
    public final gga a;
    public final dxio<axwi> b;
    public final dxio<afzv> c;
    public final dxio<axwq> d;
    public final dxio<axwy> e;
    public final dehq f;
    public final dehq g;
    private final iwl h;
    private final agzn i;
    private final ahej j = new ahej(this);
    private final ahen k;
    private boolean l;
    private boolean m;
    private boolean n;

    public aheo(cqhn cqhnVar, gga ggaVar, isd isdVar, bvjj bvjjVar, dxio<axwi> dxioVar, dxio<afzv> dxioVar2, dxio<akfa> dxioVar3, dxio<axwq> dxioVar4, dxio<axwy> dxioVar5, iwl iwlVar, agbr agbrVar, bvsx bvsxVar, dehq dehqVar, dehq dehqVar2, agzn agznVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.h = iwlVar;
        this.f = dehqVar;
        this.g = dehqVar2;
        this.i = agznVar;
        ahen ahenVar = new ahen(this);
        this.k = ahenVar;
        ahenVar.g();
        agxp agxpVar = agxp.h;
        this.l = agxpVar.d;
        this.m = agxpVar.e;
        this.n = agxpVar.f;
        iwlVar.g(cjtd.a(dtxu.bW));
        iwlVar.j(agxpVar.c);
    }

    @Override // defpackage.agzp
    public Boolean a() {
        return Boolean.valueOf(this.h.c() != null);
    }

    @Override // defpackage.agzp
    public void b(boolean z) {
        this.h.j(z);
    }

    @Override // defpackage.agzp
    public izi c() {
        return this.h;
    }

    @Override // defpackage.agzp
    public cqkl d() {
        afzm afzmVar = ((afzd) this.i).a;
        if (afzmVar.aD) {
            afzmVar.g();
        }
        return cqkl.a;
    }

    @Override // defpackage.agzp
    public agzm e() {
        return this.j;
    }

    @Override // defpackage.agzp
    public agzm f() {
        return this.k;
    }

    @Override // defpackage.agzp
    public Boolean g() {
        return Boolean.valueOf(this.k.a);
    }

    @Override // defpackage.agzp
    public Boolean h() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.agzp
    public void i(boolean z) {
        this.l = z;
    }

    @Override // defpackage.agzp
    public Boolean j() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.agzp
    public void k(boolean z) {
        this.m = z;
    }

    @Override // defpackage.agzp
    public Boolean l() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.agzp
    public void m(boolean z) {
        this.n = z;
    }
}
