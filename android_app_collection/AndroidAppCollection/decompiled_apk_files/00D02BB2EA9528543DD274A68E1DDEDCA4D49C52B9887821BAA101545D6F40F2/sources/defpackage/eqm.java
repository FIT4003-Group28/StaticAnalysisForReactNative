package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqm  reason: default package */
/* loaded from: classes6.dex */
public final class eqm implements dxis {
    public volatile dzsj<aruv> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aruq> c;
    private volatile dzsj<arxy> d;
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();

    public eqm(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        arqk arqkVar = (arqk) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        arqkVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        arqkVar.aI = tr;
        arqkVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        arqkVar.aK = sU;
        arqkVar.aL = new cpv();
        arqkVar.aM = dxjc.c(this.b.eW.ie());
        arqkVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        arqkVar.f = dxjc.c(this.b.cz());
        gga wk = this.b.wk();
        btrm rz = this.b.eW.a.rz();
        dxjg.e(rz);
        bvjj rB = this.b.eW.a.rB();
        dxjg.e(rB);
        btvo rp = this.b.eW.a.rp();
        dxjg.e(rp);
        arri hL = this.b.hL();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new eql(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eql(this, 2);
            this.d = dzsjVar2;
        }
        arvn arvnVar = new arvn(dzsjVar, dzsjVar2);
        cqhn cqhnVar = new cqhn();
        bvjj rB2 = this.b.eW.a.rB();
        dxjg.e(rB2);
        aryb arybVar = new aryb(cqhnVar, rB2);
        bvjj rB3 = this.b.eW.a.rB();
        dxjg.e(rB3);
        arxn arxnVar = new arxn(rB3);
        Object obj4 = this.f;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj2 = this.f;
                if (obj2 instanceof dxjf) {
                    arxy b = b();
                    arvo dQ = this.b.dQ();
                    Object obj5 = this.e;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = this.e;
                            if (obj3 instanceof dxjf) {
                                Context b2 = this.b.eW.a.b();
                                dxjg.e(b2);
                                ckcw rU = this.b.eW.a.rU();
                                dxjg.e(rU);
                                obj3 = arqn.b(b2, rU);
                                dxjc.d(this.e, obj3);
                                this.e = obj3;
                            }
                        }
                        obj5 = obj3;
                    }
                    obj2 = arqn.a(b, dQ, (arvw) obj5);
                    dxjc.d(this.f, obj2);
                    this.f = obj2;
                }
            }
            obj4 = obj2;
        }
        arqkVar.a = arqv.b(wk, rz, rB, rp, hL, arvnVar, arybVar, arxnVar, (arwa) obj4, this.b.dQ(), this.b.eW.qF(), this.b.eW.jq());
        cjqy tr2 = this.b.eW.a.tr();
        dxjg.e(tr2);
        arqkVar.b = tr2;
        cjqq tp2 = this.b.eW.a.tp();
        dxjg.e(tp2);
        arqkVar.c = tp2;
    }

    public final arxy b() {
        return new arxy(this.b.eW.I());
    }
}
