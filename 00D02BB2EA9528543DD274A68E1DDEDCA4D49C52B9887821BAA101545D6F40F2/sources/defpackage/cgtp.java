package defpackage;
/* compiled from: PG */
/* renamed from: cgtp  reason: default package */
/* loaded from: classes4.dex */
public final class cgtp implements cgrd<dhsm> {
    public final cgrc a;
    public cgtw b;
    public final buku c;

    public cgtp(buku bukuVar, cgrc cgrcVar) {
        this.c = bukuVar;
        this.a = cgrcVar;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        cgtw cgtwVar = this.b;
        if (cgtwVar != null) {
            cgtwVar.b(cgtv.CREATE_UGC_TASK_PLACE_REMINDER, btzyVar);
        }
    }

    @Override // defpackage.cgrd
    public final void b() {
        cgtw cgtwVar = this.b;
        if (cgtwVar != null) {
            cgtwVar.b(cgtv.CREATE_UGC_TASK_PLACE_REMINDER, null);
        }
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(dhsm dhsmVar) {
        dhsm dhsmVar2 = dhsmVar;
        cgtw cgtwVar = this.b;
        if (cgtwVar != null) {
            if ((dhsmVar2.a & 1) != 0) {
                cgen cgenVar = cgtwVar.a;
                dwpe dwpeVar = dhsmVar2.b;
                if (dwpeVar == null) {
                    dwpeVar = dwpe.a;
                }
                cgenVar.n(dwpeVar);
            }
            cgtu cgtuVar = cgtwVar.c;
            if (cgtuVar != null) {
                cgtuVar.b(dhsmVar2);
            }
            cgtwVar.c();
        }
    }
}
