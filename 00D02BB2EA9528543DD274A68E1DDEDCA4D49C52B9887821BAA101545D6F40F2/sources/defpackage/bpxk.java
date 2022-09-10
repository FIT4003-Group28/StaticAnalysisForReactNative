package defpackage;
/* compiled from: PG */
/* renamed from: bpxk  reason: default package */
/* loaded from: classes4.dex */
public final class bpxk extends bvxb<dgoa, dgoc> {
    private final dxio<boxa> a;
    private final bpxy b;
    private final btvo c;

    public bpxk(dxio<boxa> dxioVar, btvo btvoVar, bpxy bpxyVar) {
        this.a = dxioVar;
        this.c = btvoVar;
        this.b = bpxyVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.faa";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgoc e(dgoa dgoaVar) {
        final dgoa dgoaVar2 = dgoaVar;
        if ((dgoaVar2.a & 1) != 0) {
            this.b.a(akqi.b(dgoaVar2.b), new bpxx(this, dgoaVar2) { // from class: bpxj
                private final bpxk a;
                private final dgoa b;

                {
                    this.a = this;
                    this.b = dgoaVar2;
                }

                @Override // defpackage.bpxx
                public final void a(ilo iloVar) {
                    bpxk bpxkVar = this.a;
                    dnqe dnqeVar = this.b.c;
                    if (dnqeVar == null) {
                        dnqeVar = dnqe.i;
                    }
                    bpxkVar.g(iloVar, dnqeVar);
                }
            });
        } else {
            dnqe dnqeVar = dgoaVar2.c;
            if (dnqeVar == null) {
                dnqeVar = dnqe.i;
            }
            g(null, dnqeVar);
        }
        return dgoc.a;
    }

    public final void g(@dzsi ilo iloVar, dnqe dnqeVar) {
        bwrs<ilo> a = bwrs.a(iloVar);
        if (this.c.getUgcParameters().aa() && (a.c() != null ? this.a.a().o(a) : this.a.a().n())) {
            boxa a2 = this.a.a();
            if (iloVar == null) {
                a = null;
            }
            a2.t(a, dnqeVar);
        } else if (iloVar == null) {
        } else {
            if (!doay.TYPE_GEOCODED_ADDRESS.equals(iloVar.ce())) {
                doaz doazVar = iloVar.h().Z;
                if (doazVar == null) {
                    doazVar = doaz.k;
                }
                dodc dodcVar = doazVar.e;
                if (dodcVar == null) {
                    dodcVar = dodc.i;
                }
                dsrj<String> dsrjVar = dodcVar.h;
                dhjz dhjzVar = iloVar.h().e;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                a = bwrs.a(bpuo.a(dsrjVar, dhjzVar));
            }
            dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
            dsqpVar.bC(dnqeVar);
            dnps dnpsVar = (dnps) dsqpVar;
            if (dnpsVar.c) {
                dnpsVar.bF();
                dnpsVar.c = false;
            }
            dnqe dnqeVar2 = (dnqe) dnpsVar.b;
            dnqe dnqeVar3 = dnqe.i;
            dnqeVar2.c = 1;
            dnqeVar2.a |= 2;
            this.a.a().j(a, dnpsVar.bK());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgoa j(byte[] bArr) {
        return ((dgnz) dgoa.d.bZ().bx(bArr, dsqa.c())).bK();
    }
}
