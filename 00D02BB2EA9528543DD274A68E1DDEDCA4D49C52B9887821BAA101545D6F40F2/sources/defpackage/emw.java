package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: emw  reason: default package */
/* loaded from: classes6.dex */
public final class emw implements dxis {
    public volatile aeso a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aeso> c;
    private volatile dzsj<aeto> d;
    private volatile dzsj<aetl> e;
    private volatile dzsj<aesg> f;

    public emw(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aeti aetiVar = (aeti) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        aetiVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        aetiVar.aI = tr;
        aetiVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        aetiVar.aK = sU;
        aetiVar.aL = new cpv();
        aetiVar.aM = dxjc.c(this.b.eW.ie());
        aetiVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        aetiVar.c = new aetm(this.b.wk(), this.b.bM(), this.b.eW.wf(), this.b.ap());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        aetiVar.d = rD;
        aetiVar.e = this.b.ee();
        aetiVar.f = this.b.wj();
        aetiVar.g = this.b.aI();
        aetiVar.ad = this.b.wl();
        aetiVar.ae = new aetc(this.b.ef(), this.b.cl(), this.b.cS(), this.b.pl(), this.b.eW.u(), this.b.eW.oD(), this.b.eW.at());
        aetiVar.af = dxjc.c(this.b.lN());
        btrm rz = this.b.eW.a.rz();
        dxjg.e(rz);
        aetiVar.ag = rz;
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new emv(this, 0);
            this.d = dzsjVar;
        }
        dzsj dzsjVar2 = this.e;
        if (dzsjVar2 == null) {
            dzsjVar2 = new emv(this, 2);
            this.e = dzsjVar2;
        }
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new emv(this, 3);
            this.f = dzsjVar3;
        }
        aetiVar.ah = new aesh(dzsjVar, dzsjVar2, dzsjVar3);
        bvrb tn = this.b.eW.a.tn();
        dxjg.e(tn);
        aetiVar.ai = tn;
        aetiVar.aj = dxjc.c(this.b.as());
        aetiVar.ak = new inq(this.b.as(), this.b.eW.al());
        aetiVar.al = new ioj(this.b.ad(), this.b.as(), this.b.cy(), this.b.eW.V(), this.b.eW.bu(), this.b.eW.kb(), this.b.eW.o(), this.b.eW.jv(), this.b.eW.n(), this.b.eW.al());
        aetiVar.am = new iop(new jmz());
        aetiVar.an = this.b.cm();
        aetiVar.ao = dxjc.c(this.b.aK());
    }

    public final dzsj<aeso> b() {
        dzsj<aeso> dzsjVar = this.c;
        if (dzsjVar == null) {
            emv emvVar = new emv(this, 1);
            this.c = emvVar;
            return emvVar;
        }
        return dzsjVar;
    }
}
