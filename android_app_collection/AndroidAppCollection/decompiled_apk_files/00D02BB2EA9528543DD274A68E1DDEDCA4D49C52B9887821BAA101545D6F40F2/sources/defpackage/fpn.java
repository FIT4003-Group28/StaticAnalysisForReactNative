package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fpn  reason: default package */
/* loaded from: classes6.dex */
final class fpn implements dxis {
    final /* synthetic */ ftt a;
    private volatile bukm b;

    public fpn(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bzbg bzbgVar = (bzbg) obj;
        bukm bukmVar = this.b;
        if (bukmVar == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn = this.a.eW.a.tn();
            dxjg.e(tn);
            bukmVar = new bukm(new bukl(c, tn));
            this.b = bukmVar;
        }
        bzbgVar.c = bukmVar;
        dxjg.e(this.a.eW.a.rp());
        bzbgVar.a = new bzbb(this.a.ad(), this.a.eW.fr());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bzbgVar.b = sU;
    }
}
