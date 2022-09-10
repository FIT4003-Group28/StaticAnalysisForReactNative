package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eyv  reason: default package */
/* loaded from: classes6.dex */
public final class eyv implements dxis {
    public volatile dzsj<aruv> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aruq> c;
    private volatile dzsj<arxy> d;
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();
    private volatile Object g = new dxjf();

    public eyv(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        arrb arrbVar;
        Object obj2;
        Object obj3;
        Object obj4;
        arrb arrbVar2 = (arrb) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        arrbVar2.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        arrbVar2.aI = tr;
        arrbVar2.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        arrbVar2.aK = sU;
        arrbVar2.aL = new cpv();
        arrbVar2.aM = dxjc.c(this.b.eW.ie());
        arrbVar2.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        arrbVar2.f = dxjc.c(this.b.cz());
        Object obj5 = this.g;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = this.g;
                if (obj2 instanceof dxjf) {
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
                        dzsjVar = new eyu(this, 0);
                        this.c = dzsjVar;
                    }
                    dzsj dzsjVar2 = this.d;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new eyu(this, 2);
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
                                        arrbVar = arrbVar2;
                                        if (obj4 instanceof dxjf) {
                                            Context b2 = this.b.eW.a.b();
                                            dxjg.e(b2);
                                            ckcw rU = this.b.eW.a.rU();
                                            dxjg.e(rU);
                                            obj4 = arqn.b(b2, rU);
                                            dxjc.d(this.e, obj4);
                                            this.e = obj4;
                                        }
                                    }
                                    obj7 = obj4;
                                } else {
                                    arrbVar = arrbVar2;
                                }
                                obj3 = arqn.a(b, dQ, (arvw) obj7);
                                dxjc.d(this.f, obj3);
                                this.f = obj3;
                            } else {
                                arrbVar = arrbVar2;
                            }
                        }
                        obj6 = obj3;
                    } else {
                        arrbVar = arrbVar2;
                    }
                    obj2 = arqv.b(wk, rz, rB, rp, hL, arvnVar, arybVar, arxnVar, (arwa) obj6, this.b.dQ(), this.b.eW.qF(), this.b.eW.jq());
                    dxjc.d(this.g, obj2);
                    this.g = obj2;
                } else {
                    arrbVar = arrbVar2;
                }
            }
            obj5 = obj2;
        } else {
            arrbVar = arrbVar2;
        }
        arrb arrbVar3 = arrbVar;
        arrbVar3.a = (arrf) obj5;
        cjqy tr2 = this.b.eW.a.tr();
        dxjg.e(tr2);
        arrbVar3.b = tr2;
        cjqq tp2 = this.b.eW.a.tp();
        dxjg.e(tp2);
        arrbVar3.c = tp2;
    }

    public final arxy b() {
        return new arxy(this.b.eW.I());
    }
}
