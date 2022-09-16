package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ewh  reason: default package */
/* loaded from: classes6.dex */
final class ewh implements dxis {
    final /* synthetic */ ftt a;

    public ewh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bvtp bvtpVar = (bvtp) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bvtpVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bvtpVar.aI = tr;
        bvtpVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bvtpVar.aK = sU;
        bvtpVar.aL = new cpv();
        bvtpVar.aM = dxjc.c(this.a.eW.ie());
        bvtpVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bvtpVar.f = dxjc.c(this.a.cz());
        bvtpVar.b = new bvts(this.a.am(), this.a.y(), this.a.ad(), this.a.af());
    }
}
