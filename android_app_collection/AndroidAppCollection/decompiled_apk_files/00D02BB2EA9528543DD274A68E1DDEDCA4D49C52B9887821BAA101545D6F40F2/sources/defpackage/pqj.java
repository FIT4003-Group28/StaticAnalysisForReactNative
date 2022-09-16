package defpackage;
/* compiled from: PG */
/* renamed from: pqj  reason: default package */
/* loaded from: classes7.dex */
class pqj extends pqg {
    final /* synthetic */ pqk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqj(pqk pqkVar, dcdc<pqz> dcdcVar) {
        super(dcdcVar, false);
        this.a = pqkVar;
    }

    @Override // defpackage.pqe
    public cqkl c() {
        pqk pqkVar = this.a;
        if (pqkVar.aD) {
            pqkVar.aT();
        }
        return cqkl.a;
    }

    @Override // defpackage.pqe
    public cqkl d(cjqm cjqmVar) {
        pqk pqkVar = this.a;
        if (pqkVar.aD) {
            pqkVar.Ra(prb.d(pqkVar.e, amvh.a, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.pqg
    public void e(int i) {
        pqk pqkVar = this.a;
        if (!pqkVar.aD) {
            return;
        }
        cjqy cjqyVar = pqkVar.c;
        dbsk.s(cjqyVar);
        cjqm i2 = cjqyVar.i(cjtd.a(dtyi.dc));
        pqk pqkVar2 = this.a;
        int i3 = pqkVar2.e;
        dcdc<amvh> dcdcVar = pqkVar2.d;
        dbsk.s(dcdcVar);
        pqkVar2.Ra(prb.d(i3, dcdcVar.get(i), i2));
    }
}
