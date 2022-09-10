package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqs  reason: default package */
/* loaded from: classes6.dex */
public final class eqs implements dxis {
    public volatile dzsj<aruv> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aruq> c;
    private volatile dzsj<arxy> d;
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();
    private volatile Object g = new dxjf();

    public eqs(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        arqg arqgVar;
        arqm arqmVar;
        arqg arqgVar2;
        cqkj cqkjVar;
        rb rbVar;
        Object obj2;
        Object obj3;
        Object obj4;
        arqm arqmVar2 = (arqm) obj;
        ftt fttVar = this.b;
        rb rbVar2 = fttVar.a;
        cqkj wl = fttVar.wl();
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
                        dzsjVar = new eqr(this, 0);
                        this.c = dzsjVar;
                    }
                    dzsj dzsjVar2 = this.d;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new eqr(this, 2);
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
                            arqmVar = arqmVar2;
                            if (obj3 instanceof dxjf) {
                                arxy b = b();
                                arvo dQ = this.b.dQ();
                                arqgVar2 = arqgVar;
                                Object obj7 = this.e;
                                cqkjVar = wl;
                                if (obj7 instanceof dxjf) {
                                    synchronized (obj7) {
                                        obj4 = this.e;
                                        rbVar = rbVar2;
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
                                    rbVar = rbVar2;
                                }
                                obj3 = arqn.a(b, dQ, (arvw) obj7);
                                dxjc.d(this.f, obj3);
                                this.f = obj3;
                            } else {
                                arqgVar2 = arqgVar;
                                cqkjVar = wl;
                                rbVar = rbVar2;
                            }
                        }
                        obj6 = obj3;
                    } else {
                        arqmVar = arqmVar2;
                        arqgVar2 = arqgVar;
                        cqkjVar = wl;
                        rbVar = rbVar2;
                    }
                    obj2 = arqv.b(wk, rz, rB, rp, hL, arvnVar, arybVar, arxnVar, (arwa) obj6, this.b.dQ(), this.b.eW.qF(), this.b.eW.jq());
                    dxjc.d(this.g, obj2);
                    this.g = obj2;
                } else {
                    arqmVar = arqmVar2;
                    arqgVar2 = arqgVar;
                    cqkjVar = wl;
                    rbVar = rbVar2;
                }
            }
            obj5 = obj2;
        } else {
            arqmVar = arqmVar2;
            arqgVar2 = arqgVar;
            cqkjVar = wl;
            rbVar = rbVar2;
        }
        rb rbVar3 = rbVar;
        arqmVar.ad = new arqg(rbVar3, cqkjVar, (arrf) obj5);
    }

    public final arxy b() {
        return new arxy(this.b.eW.I());
    }
}
