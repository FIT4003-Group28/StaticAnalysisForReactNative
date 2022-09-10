package defpackage;
/* compiled from: PG */
/* renamed from: bmss  reason: default package */
/* loaded from: classes3.dex */
final class bmss implements ango {
    final /* synthetic */ deig a;

    public bmss(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        bmsl bmsaVar;
        deig deigVar = this.a;
        bmsk bmskVar = bmsk.RPC_FAILED;
        int a = dnsh.a(duyeVar.b);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 0) {
            bmsaVar = bmsl.c(bmsk.RPC_OK_ERROR_STATUS);
        } else {
            dnwb dnwbVar = duyeVar.c;
            if (dnwbVar == null) {
                dnwbVar = dnwb.i;
            }
            bmsaVar = new bmsa(dbpy.a, dbsg.i(dnwbVar));
        }
        deigVar.j(bmsaVar);
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        this.a.j(bmsl.c(bmsk.RPC_FAILED));
    }
}
