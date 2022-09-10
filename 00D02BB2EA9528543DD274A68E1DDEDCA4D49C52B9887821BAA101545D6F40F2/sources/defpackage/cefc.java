package defpackage;
/* compiled from: PG */
/* renamed from: cefc  reason: default package */
/* loaded from: classes4.dex */
public final class cefc extends ceez<dkdg, dkdm> {
    public cefc(buvg buvgVar, cgrc cgrcVar, dkdg dkdgVar) {
        super(cgrcVar, buvgVar, dkdgVar);
    }

    @Override // defpackage.ceez
    public final void d() {
        cgre.g(this.a, dkdg.class, this);
    }

    @Override // defpackage.ceez
    protected final dssr<dkdg> e() {
        return (dssr) dkdg.j.cu(7);
    }

    @Override // defpackage.ceez
    protected final /* bridge */ /* synthetic */ void f(dkdm dkdmVar) {
        dkdm dkdmVar2 = dkdmVar;
        if (dkdmVar2.b.size() <= 0) {
            this.c = null;
            return;
        }
        dkdl dkdlVar = dkdmVar2.b.get(dkdmVar2.b.size() - 1);
        if (((dkdlVar.a == 1 ? (dkdk) dkdlVar.b : dkdk.e).a & 1) == 0) {
            this.c = null;
            return;
        }
        duld duldVar = (dkdlVar.a == 1 ? (dkdk) dkdlVar.b : dkdk.e).d;
        if (duldVar == null) {
            duldVar = duld.f;
        }
        duvp duvpVar = duldVar.b;
        if (duvpVar == null) {
            duvpVar = duvp.b;
        }
        dkdg dkdgVar = duvpVar.a;
        if (dkdgVar == null) {
            dkdgVar = dkdg.j;
        }
        dsqp dsqpVar = (dsqp) dkdgVar.cu(5);
        dsqpVar.bC(dkdgVar);
        dkcz dkczVar = (dkcz) dsqpVar;
        dkdf dkdfVar = ((dkdg) this.b).e;
        if (dkdfVar == null) {
            dkdfVar = dkdf.c;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar2 = (dkdg) dkczVar.b;
        dkdfVar.getClass();
        dkdgVar2.e = dkdfVar;
        dkdgVar2.a |= 16;
        duls dulsVar = ((dkdg) this.b).b;
        if (dulsVar == null) {
            dulsVar = duls.g;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar3 = (dkdg) dkczVar.b;
        dulsVar.getClass();
        dkdgVar3.b = dulsVar;
        dkdgVar3.a |= 1;
        dulh dulhVar = ((dkdg) this.b).c;
        if (dulhVar == null) {
            dulhVar = dulh.b;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar4 = (dkdg) dkczVar.b;
        dulhVar.getClass();
        dkdgVar4.c = dulhVar;
        dkdgVar4.a |= 2;
        dkdb dkdbVar = ((dkdg) this.b).f;
        if (dkdbVar == null) {
            dkdbVar = dkdb.c;
        }
        if (dkczVar.c) {
            dkczVar.bF();
            dkczVar.c = false;
        }
        dkdg dkdgVar5 = (dkdg) dkczVar.b;
        dkdbVar.getClass();
        dkdgVar5.f = dkdbVar;
        dkdgVar5.a |= 32;
        this.c = dkczVar.bK();
    }
}
