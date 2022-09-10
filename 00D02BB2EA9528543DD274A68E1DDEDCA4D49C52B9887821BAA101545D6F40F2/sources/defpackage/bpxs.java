package defpackage;
/* compiled from: PG */
/* renamed from: bpxs  reason: default package */
/* loaded from: classes4.dex */
public final class bpxs extends bvxb<dgou, dgow> {
    private final dxio<bpyf> a;

    public bpxs(dxio<bpyf> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.mr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgow e(dgou dgouVar) {
        akqq akqqVar;
        dgou dgouVar2 = dgouVar;
        if ((dgouVar2.a & 2) != 0) {
            dhjz dhjzVar = dgouVar2.c;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        } else {
            akqqVar = null;
        }
        bpyf a = this.a.a();
        dnqe dnqeVar = dgouVar2.b;
        if (dnqeVar == null) {
            dnqeVar = dnqe.i;
        }
        a.f(dnqeVar, akqqVar);
        return dgow.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgou j(byte[] bArr) {
        return ((dgot) dgou.d.bZ().bx(bArr, dsqa.c())).bK();
    }
}
