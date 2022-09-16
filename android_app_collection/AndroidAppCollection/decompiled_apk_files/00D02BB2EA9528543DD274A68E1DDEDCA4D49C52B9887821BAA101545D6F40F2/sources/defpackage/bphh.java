package defpackage;
/* compiled from: PG */
/* renamed from: bphh  reason: default package */
/* loaded from: classes3.dex */
final class bphh implements bpsr {
    final /* synthetic */ gga a;
    final /* synthetic */ bphi b;

    public bphh(bphi bphiVar, gga ggaVar) {
        this.b = bphiVar;
        this.a = ggaVar;
    }

    @Override // defpackage.bpsr
    public final void a() {
        bphi bphiVar = this.b;
        if (bphiVar.aD) {
            bptw j = bptw.j(bphiVar.al.d(), dcdc.r(bphiVar.ai.a), bpvi.c(bphiVar.ai), false);
            gga ggaVar = bphiVar.aE;
            dbsk.s(ggaVar);
            ggaVar.D(bpfw.aT(j, bwrs.a(bvrt.b(bphiVar.ai)), bphiVar.d, bphiVar.aj));
        }
    }

    @Override // defpackage.bpsr
    public final void b() {
        this.a.s();
    }
}
