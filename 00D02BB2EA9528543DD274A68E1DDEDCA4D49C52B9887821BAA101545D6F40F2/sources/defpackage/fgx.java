package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fgx  reason: default package */
/* loaded from: classes6.dex */
public final class fgx implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<abss> b;
    private volatile dzsj<abtc> c;
    private volatile dzsj<abtd> d;
    private volatile dzsj<abtu> e;
    private volatile dzsj<abvu> f;

    public fgx(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        abew abewVar = (abew) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        abewVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        abewVar.aI = tr;
        abewVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        abewVar.aK = sU;
        abewVar.aL = new cpv();
        abewVar.aM = dxjc.c(this.a.eW.ie());
        abewVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fgw(this, 0);
            this.b = dzsjVar;
        }
        abewVar.a = new abtn(dzsjVar);
        abewVar.b = dxjc.c(this.a.eW.k());
        abewVar.c = this.a.ap();
        abewVar.d = this.a.eW.dQ();
        dzsj<gga> ad = this.a.ad();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<cjqy> al = this.a.eW.al();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fgw(this, 1);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fgw(this, 2);
            this.d = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<dehq> kb = this.a.eW.kb();
        dzsj dzsjVar6 = this.e;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fgw(this, 3);
            this.e = dzsjVar6;
        }
        abewVar.e = new abtt(ad, il, al, dzsjVar3, dzsjVar5, kb, dzsjVar6);
        dzsj dzsjVar7 = this.f;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fgw(this, 4);
            this.f = dzsjVar7;
        }
        abewVar.f = new abey(dzsjVar7);
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        abewVar.g = tn;
        abewVar.ad = this.a.wq();
        abewVar.ae = this.a.wl();
        abewVar.af = new jmz();
        dxjg.e(this.a.eW.a.rp());
    }
}
