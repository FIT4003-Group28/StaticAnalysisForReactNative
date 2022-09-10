package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: feq  reason: default package */
/* loaded from: classes6.dex */
public final class feq implements dxis {
    final /* synthetic */ ftt a;
    public volatile bulj b;
    public volatile buzx c;
    private volatile dzsj<bulj> d;
    private volatile dzsj<buzx> e;
    private volatile dzsj<bdgd> f;
    private final dzsj<ceae> g;

    public feq(ftt fttVar, ceae ceaeVar) {
        this.a = fttVar;
        this.g = dxjd.b(ceaeVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ceae ceaeVar = (ceae) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ceaeVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ceaeVar.aI = tr;
        ceaeVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ceaeVar.aK = sU;
        ceaeVar.aL = new cpv();
        ceaeVar.aM = dxjc.c(this.a.eW.ie());
        ceaeVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        ceaeVar.a = rp;
        ceaeVar.b = this.a.wq();
        dzsj<bbrq> jb = this.a.eW.jb();
        dzsj<akdv> P = this.a.P();
        dzsj<bbpv> ba = this.a.eW.ba();
        dzsj<btrm> n = this.a.eW.n();
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new fep(this, 0);
            this.d = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.e;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fep(this, 1);
            this.e = dzsjVar3;
        }
        ceaeVar.c = new ceax(jb, P, ba, n, dzsjVar2, dzsjVar3, this.a.eW.di());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ceaeVar.d = rD;
        dzsj<ceae> dzsjVar4 = this.g;
        dzsj<ckcw> at = this.a.eW.at();
        dzsj dzsjVar5 = this.f;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fep(this, 2);
            this.f = dzsjVar5;
        }
        bdog bdogVar = new bdog(dzsjVar4, at, dzsjVar5);
        ftt fttVar = this.a;
        ceaeVar.e = new cdys(bdogVar, new bdmc(fttVar.eV, fttVar.eW.aI(), this.a.T()), bdpx.b(this.a.eW.pd(), this.a.eW.pf(), this.a.eW.pa(), this.a.eW.oY(), this.a.eW.R(), this.a.eW.at(), this.a.eW.k(), dxjh.c(this.a.eW.iW()), dxjh.c(this.a.m())), this.a.be());
        ceaeVar.f = new cebd(this.a.eW.al(), this.a.uv());
        ceaeVar.g = this.a.fL();
        ceaeVar.ad = this.a.eC();
    }
}
