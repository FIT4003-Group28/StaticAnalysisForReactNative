package defpackage;
/* compiled from: PG */
/* renamed from: arlf  reason: default package */
/* loaded from: classes2.dex */
final class arlf implements czi {
    final /* synthetic */ arlg a;

    public arlf(arlg arlgVar) {
        this.a = arlgVar;
    }

    @Override // defpackage.czi
    public final dehn<Boolean> a(dstv dstvVar) {
        dstv dstvVar2 = ((arjz) this.a.i).c.f;
        if (dstvVar2 == null) {
            dstvVar2 = dstv.c;
        }
        return deha.a(Boolean.valueOf(dsuz.a(dsvb.d(dstvVar2, dstvVar), arlg.a) < 0));
    }

    @Override // defpackage.czi
    public final dehn<Void> b(dstv dstvVar) {
        arla arlaVar = this.a.i;
        arkz arkzVar = ((arjz) arlaVar).c;
        dsqp dsqpVar = (dsqp) arkzVar.cu(5);
        dsqpVar.bC(arkzVar);
        arky arkyVar = (arky) dsqpVar;
        if (arkyVar.c) {
            arkyVar.bF();
            arkyVar.c = false;
        }
        arkz arkzVar2 = (arkz) arkyVar.b;
        arkz arkzVar3 = arkz.g;
        dstvVar.getClass();
        arkzVar2.f = dstvVar;
        arkzVar2.a |= 16;
        arlaVar.b(arkyVar.bK());
        return deha.a(null);
    }
}
