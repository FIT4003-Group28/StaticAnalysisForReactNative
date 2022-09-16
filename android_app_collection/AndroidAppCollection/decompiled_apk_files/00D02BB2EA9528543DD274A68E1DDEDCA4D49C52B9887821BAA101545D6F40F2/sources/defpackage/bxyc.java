package defpackage;
/* compiled from: PG */
/* renamed from: bxyc  reason: default package */
/* loaded from: classes4.dex */
final class bxyc implements dbsz, bvqg {
    public final deig<Void> a = deig.d();
    final /* synthetic */ bxyd b;

    public bxyc(bxyd bxydVar) {
        this.b = bxydVar;
    }

    @Override // defpackage.dbsz
    /* renamed from: b */
    public final synchronized void NU(dcdc<dpte> dcdcVar) {
        cqix<bxxp> cqixVar;
        bxyd bxydVar = this.b;
        bxyt bxytVar = bxydVar.d;
        cqix<?> fT = cqgr.fT(new bxuu(), this.b);
        if (dcdcVar.size() > 7) {
            dcdcVar = dcdcVar.subList(0, 7);
        }
        bxyd bxydVar2 = this.b;
        bxyb bxybVar = bxydVar2.f ? new bxyb(bxydVar2) : null;
        bxyd bxydVar3 = this.b;
        if (!bxydVar3.g) {
            cqixVar = null;
        } else if (bxydVar3.f) {
            cqixVar = cqgr.fT(new bxvn(), bxydVar3.c);
        } else {
            cqixVar = cqgr.fT(new bxuy(), bxydVar3.c);
        }
        bxydVar.i = bxytVar.a(fT, dcdcVar, bxybVar, cqixVar);
        if (!this.a.isDone()) {
            this.a.j(null);
        } else {
            this.b.b.b(new bxtz());
        }
    }
}
