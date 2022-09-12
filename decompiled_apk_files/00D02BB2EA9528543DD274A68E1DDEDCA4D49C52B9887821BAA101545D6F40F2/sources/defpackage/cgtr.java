package defpackage;
/* compiled from: PG */
/* renamed from: cgtr  reason: default package */
/* loaded from: classes4.dex */
public final class cgtr implements cgrd<dhvm> {
    public final cgrc a;
    public cgtw b;
    public final bume c;

    public cgtr(bume bumeVar, cgrc cgrcVar) {
        this.c = bumeVar;
        this.a = cgrcVar;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        cgtw cgtwVar = this.b;
        if (cgtwVar != null) {
            cgtwVar.b(cgtv.DELETE_UGC_TASK_PLACE_REMINDER, btzyVar);
        }
    }

    @Override // defpackage.cgrd
    public final void b() {
        cgtw cgtwVar = this.b;
        if (cgtwVar != null) {
            cgtwVar.b(cgtv.DELETE_UGC_TASK_PLACE_REMINDER, null);
        }
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(dhvm dhvmVar) {
        dhvm dhvmVar2 = dhvmVar;
        cgtw cgtwVar = this.b;
        if (cgtwVar != null) {
            if ((dhvmVar2.a & 1) != 0) {
                cgen cgenVar = cgtwVar.a;
                dwpe dwpeVar = dhvmVar2.b;
                if (dwpeVar == null) {
                    dwpeVar = dwpe.a;
                }
                cgenVar.n(dwpeVar);
            }
            cgtu cgtuVar = cgtwVar.c;
            if (cgtuVar != null) {
                cgtuVar.c(dhvmVar2);
            }
            cgtwVar.c();
        }
    }
}
