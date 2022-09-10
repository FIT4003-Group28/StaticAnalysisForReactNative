package defpackage;
/* compiled from: PG */
/* renamed from: bpyd  reason: default package */
/* loaded from: classes4.dex */
final class bpyd implements bpyc {
    private final bvrt<dnqe> a;
    private final akqq b;

    public bpyd(dnqe dnqeVar, akqq akqqVar) {
        this.a = bvrt.b(dnqeVar);
        this.b = akqqVar;
    }

    @Override // defpackage.afds
    public final void Pn(gga ggaVar, boolean z) {
        bpyb.a(this, ggaVar, z);
    }

    @Override // defpackage.akee
    public final void a(gga ggaVar, boolean z) {
        if (!z) {
            return;
        }
        dnqe dnqeVar = (dnqe) bvrt.f(this.a, (dssr) dnqe.i.cu(7), dnqe.i);
        dbsk.s(dnqeVar);
        bqhq bZ = bqhr.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhr bqhrVar = (bqhr) bZ.b;
        bqhrVar.a |= 1;
        bqhrVar.b = 0;
        ggaVar.D(bpyt.g(new bqgw(bZ.bK(), dnqeVar, this.b)));
    }
}
