package defpackage;
/* compiled from: PG */
/* renamed from: ceye  reason: default package */
/* loaded from: classes4.dex */
final class ceye implements ceuv<dwvy> {
    final /* synthetic */ ceyf a;

    public ceye(ceyf ceyfVar) {
        this.a = ceyfVar;
    }

    @Override // defpackage.ceuv
    public final /* bridge */ /* synthetic */ void a(dwvy dwvyVar) {
        dwvy dwvyVar2 = dwvyVar;
        ceyf ceyfVar = this.a;
        ceyfVar.a = true;
        cefg cefgVar = (cefg) ceyfVar.f;
        dwvz dwvzVar = (dwvz) cefgVar.b;
        dsqp dsqpVar = (dsqp) dwvzVar.cu(5);
        dsqpVar.bC(dwvzVar);
        dwvu dwvuVar = (dwvu) dsqpVar;
        if (dwvuVar.c) {
            dwvuVar.bF();
            dwvuVar.c = false;
        }
        dwvz dwvzVar2 = (dwvz) dwvuVar.b;
        dwvz dwvzVar3 = dwvz.n;
        dwvzVar2.e = dwvyVar2.f;
        dwvzVar2.a |= 16;
        cefgVar.b = dwvuVar.bK();
        cefgVar.h();
        this.a.e.c();
    }
}
