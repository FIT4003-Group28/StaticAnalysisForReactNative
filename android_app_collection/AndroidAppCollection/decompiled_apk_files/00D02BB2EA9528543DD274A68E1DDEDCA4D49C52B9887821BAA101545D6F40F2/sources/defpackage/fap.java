package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fap  reason: default package */
/* loaded from: classes6.dex */
public final class fap implements dxis {
    public volatile dzsj<aruv> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aruq> c;
    private volatile dzsj<arxy> d;
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();
    private volatile Object g = new dxjf();

    public fap(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        btem btemVar;
        Object obj2;
        Object obj3;
        Object obj4;
        btem btemVar2 = (btem) obj;
        btemVar2.aT = this.b.gK();
        ckcw rU = this.b.eW.a.rU();
        dxjg.e(rU);
        btemVar2.aU = rU;
        dxjg.e(this.b.eW.a.tr());
        btemVar2.aV = this.b.wq();
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        btemVar2.aW = tp;
        btemVar2.aY = this.b.lw();
        bvjj rB = this.b.eW.a.rB();
        dxjg.e(rB);
        btemVar2.ag = rB;
        Application a = this.b.eW.a.a();
        dxjg.e(a);
        btemVar2.ah = a;
        btrm rz = this.b.eW.a.rz();
        dxjg.e(rz);
        btemVar2.ai = rz;
        btvo rp = this.b.eW.a.rp();
        dxjg.e(rp);
        btemVar2.aj = rp;
        akfa rK = this.b.eW.a.rK();
        dxjg.e(rK);
        btemVar2.ak = rK;
        btemVar2.al = this.b.eW.qY();
        btemVar2.am = this.b.eW.qF();
        btemVar2.an = dxjc.c(this.b.eW.f());
        this.b.eW.bN();
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        btemVar2.ao = tr;
        cjqq tp2 = this.b.eW.a.tp();
        dxjg.e(tp2);
        btemVar2.ap = tp2;
        btemVar2.aq = this.b.eW.dr();
        Object obj5 = this.g;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = this.g;
                if (obj2 instanceof dxjf) {
                    gga wk = this.b.wk();
                    btrm rz2 = this.b.eW.a.rz();
                    dxjg.e(rz2);
                    bvjj rB2 = this.b.eW.a.rB();
                    dxjg.e(rB2);
                    btvo rp2 = this.b.eW.a.rp();
                    dxjg.e(rp2);
                    arri hL = this.b.hL();
                    dzsj dzsjVar = this.c;
                    if (dzsjVar == null) {
                        dzsjVar = new fao(this, 0);
                        this.c = dzsjVar;
                    }
                    dzsj dzsjVar2 = this.d;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new fao(this, 2);
                        this.d = dzsjVar2;
                    }
                    arvn arvnVar = new arvn(dzsjVar, dzsjVar2);
                    cqhn cqhnVar = new cqhn();
                    bvjj rB3 = this.b.eW.a.rB();
                    dxjg.e(rB3);
                    aryb arybVar = new aryb(cqhnVar, rB3);
                    bvjj rB4 = this.b.eW.a.rB();
                    dxjg.e(rB4);
                    arxn arxnVar = new arxn(rB4);
                    Object obj6 = this.f;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj3 = this.f;
                            if (obj3 instanceof dxjf) {
                                arxy b = b();
                                arvo dQ = this.b.dQ();
                                Object obj7 = this.e;
                                if (obj7 instanceof dxjf) {
                                    synchronized (obj7) {
                                        obj4 = this.e;
                                        btemVar = btemVar2;
                                        if (obj4 instanceof dxjf) {
                                            Context b2 = this.b.eW.a.b();
                                            dxjg.e(b2);
                                            ckcw rU2 = this.b.eW.a.rU();
                                            dxjg.e(rU2);
                                            obj4 = arqn.b(b2, rU2);
                                            dxjc.d(this.e, obj4);
                                            this.e = obj4;
                                        }
                                    }
                                    obj7 = obj4;
                                } else {
                                    btemVar = btemVar2;
                                }
                                obj3 = arqn.a(b, dQ, (arvw) obj7);
                                dxjc.d(this.f, obj3);
                                this.f = obj3;
                            } else {
                                btemVar = btemVar2;
                            }
                        }
                        obj6 = obj3;
                    } else {
                        btemVar = btemVar2;
                    }
                    obj2 = arqv.b(wk, rz2, rB2, rp2, hL, arvnVar, arybVar, arxnVar, (arwa) obj6, this.b.dQ(), this.b.eW.qF(), this.b.eW.jq());
                    dxjc.d(this.g, obj2);
                    this.g = obj2;
                } else {
                    btemVar = btemVar2;
                }
            }
            obj5 = obj2;
        } else {
            btemVar = btemVar2;
        }
        btem btemVar3 = btemVar;
        btemVar3.ar = (arrf) obj5;
        aufc sB = this.b.eW.a.sB();
        dxjg.e(sB);
        btemVar3.as = sB;
        btemVar3.at = this.b.tL();
        btemVar3.au = this.b.eW.cu();
        btemVar3.av = this.b.eW.dw();
        btemVar3.aw = this.b.eW.jq();
        btemVar3.ax = dxjc.c(this.b.m());
        gcg sD = this.b.eW.a.sD();
        dxjg.e(sD);
        btemVar3.ay = sD;
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        btemVar3.az = sU;
    }

    public final arxy b() {
        return new arxy(this.b.eW.I());
    }
}
