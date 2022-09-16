package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fah  reason: default package */
/* loaded from: classes6.dex */
public final class fah implements dxis {
    public volatile asja a;
    public volatile asjc b;
    final /* synthetic */ ftt c;
    private volatile dzsj<asja> d;
    private volatile dzsj<asjc> e;

    public fah(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        asjl asjlVar = (asjl) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        asjlVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        asjlVar.aI = tr;
        asjlVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        asjlVar.aK = sU;
        asjlVar.aL = new cpv();
        asjlVar.aM = dxjc.c(this.c.eW.ie());
        asjlVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new fag(this, 0);
            this.d = dzsjVar;
        }
        dxjc.c(dzsjVar);
        dzsj dzsjVar2 = this.e;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fag(this, 1);
            this.e = dzsjVar2;
        }
        asjlVar.c = dxjc.c(dzsjVar2);
        asjlVar.d = dxjc.c(this.c.eW.jr());
        dehq tf = this.c.eW.a.tf();
        dxjg.e(tf);
        asjlVar.e = tf;
        asjlVar.f = dxjc.c(this.c.H());
        asjlVar.g = dxjc.c(this.c.cx());
        asjlVar.ad = dxjc.c(this.c.m());
        asjlVar.ae = dxjc.c(this.c.eW.p());
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        asjlVar.af = rD;
        asjlVar.ag = this.c.eW.e();
        asjlVar.ah = this.c.hD();
        asjlVar.ai = this.c.wq();
        ftt fttVar = this.c;
        rb rbVar = fttVar.a;
        bvrb tn = fttVar.eW.a.tn();
        dxjg.e(tn);
        vwx vwxVar = new vwx(rbVar, tn);
        bvrb tn2 = this.c.eW.a.tn();
        dxjg.e(tn2);
        asjlVar.aj = new asjs(vwxVar, tn2, this.c.wl());
        asjlVar.ak = this.c.bR();
        bvrb tn3 = this.c.eW.a.tn();
        dxjg.e(tn3);
        asjlVar.al = tn3;
        btrm rz = this.c.eW.a.rz();
        dxjg.e(rz);
        asjlVar.am = rz;
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        asjlVar.an = rp;
        bvjj rB = this.c.eW.a.rB();
        dxjg.e(rB);
        asjlVar.ao = rB;
    }
}
