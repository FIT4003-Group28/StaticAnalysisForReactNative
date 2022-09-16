package defpackage;
/* compiled from: PG */
/* renamed from: chrk  reason: default package */
/* loaded from: classes4.dex */
public final class chrk {
    public static final dcqe a = dcqe.c("chrk");
    public static final String b = ciwk.class.getSimpleName();
    public final chrx c;
    public final bvrb d;
    public final dxio<cclq> e;
    public final dxio<cgen> f;
    public final dxio<cfpk> g;
    public final dxio<blpp> h;
    public final dxio<caym> i;
    @dzsi
    public bvxh j;
    public String k = "";
    public final ges l;
    public final gn m;
    @dzsi
    public bvqg<cdhl> n;
    @dzsi
    public chpv o;
    private final dxio<bjbu> p;

    public chrk(bvrb bvrbVar, dxio<cclq> dxioVar, dxio<cgen> dxioVar2, dxio<blpp> dxioVar3, dxio<cfpk> dxioVar4, dxio<caym> dxioVar5, dxio<bjbu> dxioVar6, chrx chrxVar, ges gesVar) {
        this.d = bvrbVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.h = dxioVar3;
        this.g = dxioVar4;
        this.i = dxioVar5;
        this.p = dxioVar6;
        this.c = chrxVar;
        this.l = gesVar;
        gn gnVar = gesVar.A;
        dbsk.s(gnVar);
        this.m = gnVar;
        this.o = null;
    }

    public final void a(bwrs<ilo> bwrsVar, djao djaoVar, boolean z) {
        bjbs h = bjbv.h();
        h.c(z);
        h.b = this.l;
        h.b(true);
        h.f(true);
        h.d(dqcj.AGMM_TODOLIST);
        this.p.a().d(bwrsVar, djaoVar, h.a());
    }
}
