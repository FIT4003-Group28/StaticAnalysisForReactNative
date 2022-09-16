package defpackage;
/* compiled from: PG */
/* renamed from: civy  reason: default package */
/* loaded from: classes4.dex */
class civy implements civu {
    private final dwjb a;
    private final civz b;

    public civy(dwjb dwjbVar, civz civzVar) {
        this.a = dwjbVar;
        this.b = civzVar;
    }

    @Override // defpackage.civu
    public String a() {
        dvyw dvywVar = this.a.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        return dvywVar.i;
    }

    @Override // defpackage.civu
    public cqkl b() {
        civz civzVar = this.b;
        dwjb dwjbVar = this.a;
        ciwi ciwiVar = (ciwi) civzVar;
        ciwiVar.a.f();
        ciwj ciwjVar = ciwiVar.a;
        chvb bZ = chve.e.bZ();
        chvd chvdVar = chvd.CHANGE_PLACE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chve chveVar = (chve) bZ.b;
        chveVar.b = chvdVar.f;
        int i = chveVar.a | 1;
        chveVar.a = i;
        chxr chxrVar = ciwiVar.a.ai;
        chxrVar.getClass();
        chveVar.c = chxrVar;
        int i2 = i | 2;
        chveVar.a = i2;
        dwjbVar.getClass();
        chveVar.d = dwjbVar;
        chveVar.a = i2 | 4;
        ciwjVar.Nw(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.civu
    public cjtd c(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        dvyw dvywVar = this.a.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        dvxb dvxbVar = dvywVar.V;
        if (dvxbVar == null) {
            dvxbVar = dvxb.d;
        }
        if ((dvxbVar.a & 2) != 0) {
            dvyw dvywVar2 = this.a.b;
            if (dvywVar2 == null) {
                dvywVar2 = dvyw.bv;
            }
            dvxb dvxbVar2 = dvywVar2.V;
            if (dvxbVar2 == null) {
                dvxbVar2 = dvxb.d;
            }
            b.g(dvxbVar2.c);
        }
        return b.a();
    }
}
