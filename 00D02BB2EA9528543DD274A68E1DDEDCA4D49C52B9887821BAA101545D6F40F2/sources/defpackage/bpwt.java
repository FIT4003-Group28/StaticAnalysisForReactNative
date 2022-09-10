package defpackage;
/* compiled from: PG */
/* renamed from: bpwt  reason: default package */
/* loaded from: classes4.dex */
public final class bpwt extends bvxb<dgmt, dgmv> {
    private final dxio<cqg> a;

    public bpwt(dxio<cqg> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.aap";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgmv e(dgmt dgmtVar) {
        akqq akqqVar;
        dgmt dgmtVar2 = dgmtVar;
        if ((dgmtVar2.a & 1) != 0) {
            dhjz dhjzVar = dgmtVar2.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        } else {
            akqqVar = null;
        }
        dnqe dnqeVar = dgmtVar2.c;
        if (dnqeVar == null) {
            dnqeVar = dnqe.i;
        }
        dnqb b = dnqb.b(dnqeVar.b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        cqf b2 = cqf.b(b, akqqVar);
        dnqe dnqeVar2 = dgmtVar2.c;
        if (dnqeVar2 == null) {
            dnqeVar2 = dnqe.i;
        }
        int i = dnqeVar2.b;
        cqg a = this.a.a();
        if (akqqVar == null) {
            a.b(b2, true);
        } else {
            a.c(b2, akqqVar.h(), true);
        }
        return dgmv.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgmt j(byte[] bArr) {
        return ((dgms) dgmt.d.bZ().bx(bArr, dsqa.c())).bK();
    }
}
