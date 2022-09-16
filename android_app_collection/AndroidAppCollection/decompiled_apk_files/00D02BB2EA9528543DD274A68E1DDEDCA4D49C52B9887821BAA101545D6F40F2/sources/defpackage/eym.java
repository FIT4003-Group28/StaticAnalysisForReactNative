package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eym  reason: default package */
/* loaded from: classes6.dex */
final class eym implements dxis {
    final /* synthetic */ ftt a;

    public eym(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ancv ancvVar = (ancv) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ancvVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ancvVar.aI = tr;
        ancvVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ancvVar.aK = sU;
        ancvVar.aL = new cpv();
        ancvVar.aM = dxjc.c(this.a.eW.ie());
        ancvVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ancvVar.ai = this.a.ap();
        ancvVar.aj = this.a.bB();
        ancvVar.ak = this.a.wq();
        ancvVar.al = this.a.wl();
        ancvVar.am = this.a.wd();
        Context b = this.a.eW.a.b();
        dxjg.e(b);
        Executor sV = this.a.eW.a.sV();
        dxjg.e(sV);
        ancvVar.an = new isr(b, sV);
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        ancvVar.ao = rz;
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        ancvVar.ap = rR;
        ancvVar.aq = this.a.cU();
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        ancvVar.ar = sU2;
    }
}
