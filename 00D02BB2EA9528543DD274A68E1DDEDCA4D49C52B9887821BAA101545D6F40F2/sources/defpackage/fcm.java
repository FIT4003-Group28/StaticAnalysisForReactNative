package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fcm  reason: default package */
/* loaded from: classes6.dex */
public final class fcm implements dxis {
    final /* synthetic */ ftt a;
    private final awev b;
    private volatile avzn c;
    private volatile dzsj<avqd> d;
    private volatile dzsj<awhh> e;

    public fcm(ftt fttVar, awev awevVar) {
        this.a = fttVar;
        this.b = awevVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avhz avhzVar;
        Executor executor;
        akox akoxVar;
        awfc awfcVar;
        Object obj2;
        awev awevVar = (awev) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        awevVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        awevVar.aI = tr;
        awevVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        awevVar.aK = sU;
        awevVar.aL = new cpv();
        awevVar.aM = dxjc.c(this.a.eW.ie());
        awevVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        awevVar.a = this.a.wl();
        awevVar.b = this.a.wq();
        ftt fttVar = this.a;
        rb rbVar = fttVar.a;
        avij qO = fttVar.eW.qO();
        cklf cp = this.a.cp();
        ftt fttVar2 = this.a;
        dxjg.e(fttVar2.eW.a.a());
        avza da = fttVar2.eW.da();
        final dzsj dzsjVar = fttVar2.cQ;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar2, 1320);
            fttVar2.cQ = dzsjVar;
        }
        dehp tl = fttVar2.eW.a.tl();
        dxjg.e(tl);
        dehn h = deew.h(da.a(), new dbrn(dzsjVar) { // from class: avbi
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj3) {
                dzsj dzsjVar2 = this.a;
                if (((Boolean) obj3).booleanValue()) {
                    return (awco) dzsjVar2.a();
                }
                return null;
            }
        }, tl);
        gfq wd = this.a.wd();
        awev awevVar2 = this.b;
        bvjj rB = this.a.eW.a.rB();
        dxjg.e(rB);
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        avhz eD = this.a.eD();
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        akox ap = this.a.ap();
        dxio c = dxjc.c(this.a.av());
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        cqhn cqhnVar = new cqhn();
        dxio c2 = dxjc.c(this.a.v());
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        awhh b = b();
        ftt fttVar3 = this.a;
        Object obj3 = fttVar3.cR;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fttVar3.cR;
                akoxVar = ap;
                if (obj2 instanceof dxjf) {
                    rb rbVar2 = fttVar3.a;
                    executor = sU2;
                    bvjj rB2 = fttVar3.eW.a.rB();
                    dxjg.e(rB2);
                    avhzVar = eD;
                    obj2 = new awfc(rbVar2, rB2, fttVar3.ap());
                    dxjc.d(fttVar3.cR, obj2);
                    fttVar3.cR = obj2;
                } else {
                    avhzVar = eD;
                    executor = sU2;
                }
            }
            obj3 = obj2;
        } else {
            avhzVar = eD;
            executor = sU2;
            akoxVar = ap;
        }
        awfc awfcVar2 = (awfc) obj3;
        dxio c3 = dxjc.c(this.a.eW.p());
        awhk awhkVar = new awhk();
        avzm cM = this.a.eW.cM();
        avzn avznVar = this.c;
        if (avznVar == null) {
            Application a = this.a.eW.a.a();
            dxjg.e(a);
            avznVar = new avzn(a);
            this.c = avznVar;
        }
        avzn avznVar2 = avznVar;
        avza da2 = this.a.eW.da();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fcl(this, 0);
            this.d = dzsjVar2;
        }
        fyu fyuVar = this.a.eW;
        dzsj dzsjVar3 = fyuVar.dH;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fxy(fyuVar, 696);
            fyuVar.dH = dzsjVar3;
        }
        ftt fttVar4 = this.a;
        dzsj dzsjVar4 = fttVar4.cS;
        if (dzsjVar4 == null) {
            awfcVar = awfcVar2;
            dzsjVar4 = new fns(fttVar4, 1322);
            fttVar4.cS = dzsjVar4;
        } else {
            awfcVar = awfcVar2;
        }
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fcl(this, 1);
            this.e = dzsjVar5;
        }
        awhe awheVar = new awhe(dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5);
        cjqq tp2 = this.a.eW.a.tp();
        dxjg.e(tp2);
        awevVar.c = new awet(rbVar, qO, cp, h, wd, awevVar2, rB, rz, avhzVar, executor, akoxVar, c, rp, cqhnVar, c2, tr2, b, awfcVar, c3, awhkVar, cM, avznVar2, da2, rU, awheVar, tp2);
        awevVar.d = this.a.ap();
        dxjg.e(this.a.eW.a.sU());
    }

    public final awhh b() {
        awhh awhhVar = new awhh(dxjc.c(this.a.av()), this.a.bC());
        awhhVar.a();
        return awhhVar;
    }
}
