package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.ugc.tasks.nearby.UgcTasksNearbyBroadcastReceiver;
/* compiled from: PG */
/* renamed from: fyt  reason: default package */
/* loaded from: classes6.dex */
final class fyt implements dxis {
    final /* synthetic */ fyu a;
    private volatile bume b;

    public fyt(fyu fyuVar) {
        this.a = fyuVar;
    }

    private final Object b() {
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        this.a.cu();
        dxjg.e(this.a.a.rB());
        this.a.bg();
        bume bumeVar = this.b;
        if (bumeVar == null) {
            dxio c = dxjc.c(this.a.h());
            bvrb tn2 = this.a.a.tn();
            dxjg.e(tn2);
            bumeVar = bumg.b(bumf.b(c, tn2));
            this.b = bumeVar;
        }
        return new cgtk(tn, bumeVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        UgcTasksNearbyBroadcastReceiver ugcTasksNearbyBroadcastReceiver = (UgcTasksNearbyBroadcastReceiver) obj;
        ugcTasksNearbyBroadcastReceiver.h = this.a.lt();
        fyu fyuVar = this.a;
        Object obj4 = fyuVar.eA;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj2 = fyuVar.eA;
                if (obj2 instanceof dxjf) {
                    Application a = fyuVar.a.a();
                    dxjg.e(a);
                    buuu buuuVar = fyuVar.eM;
                    if (buuuVar == null) {
                        dxio c = dxjc.c(fyuVar.h());
                        bvrb tn = fyuVar.a.tn();
                        dxjg.e(tn);
                        buuuVar = buuw.b(buuv.b(c, tn));
                        fyuVar.eM = buuuVar;
                    }
                    buuu buuuVar2 = buuuVar;
                    ahtd cc = fyuVar.cc();
                    cgsy lt = fyuVar.lt();
                    Object obj5 = fyuVar.ez;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = fyuVar.ez;
                            if (obj3 instanceof dxjf) {
                                bzwa bzwaVar = new bzwa(fyuVar.fb());
                                cqat rR = fyuVar.a.rR();
                                dxjg.e(rR);
                                obj3 = new cgeq(bzwaVar, rR);
                                dxjc.d(fyuVar.ez, obj3);
                                fyuVar.ez = obj3;
                            }
                        }
                        obj5 = obj3;
                    }
                    cqat rR2 = fyuVar.a.rR();
                    dxjg.e(rR2);
                    ckcw rU = fyuVar.a.rU();
                    dxjg.e(rU);
                    cgsz cgszVar = new cgsz(rU);
                    cgtn ls = fyuVar.ls();
                    cguv cguvVar = new cguv();
                    dxjg.e(fyuVar.a.tn());
                    dxjg.e(fyuVar.a.rB());
                    btvo rp = fyuVar.a.rp();
                    dxjg.e(rp);
                    obj2 = new cgth(a, buuuVar2, cc, lt, (cgeq) obj5, rR2, cgszVar, ls, cguvVar, rp);
                    dxjc.d(fyuVar.eA, obj2);
                    fyuVar.eA = obj2;
                }
            }
            obj4 = obj2;
        }
        ugcTasksNearbyBroadcastReceiver.i = (cgth) obj4;
        b();
        ugcTasksNearbyBroadcastReceiver.j = (cgtk) b();
        bvrb tn2 = this.a.a.tn();
        dxjg.e(tn2);
        ugcTasksNearbyBroadcastReceiver.k = new cgsr(tn2);
    }
}
