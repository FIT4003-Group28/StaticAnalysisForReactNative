package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import com.google.android.apps.gmm.traffic.notification.service.DismissTrafficToPlaceNotificationReceiver;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bypk  reason: default package */
/* loaded from: classes4.dex */
public final class bypk implements byqh {
    public static final dcqe a = dcqe.c("bypk");
    public static final dcep<qjj> b = dcep.C(qjj.TRAFFIC_TO_PLACE, qjj.TIME_TO_LEAVE);
    public final auhi c;
    public final bvjj d;
    public final qjp e;
    @dzsi
    public final qjl f;
    public final dxio<cjqy> g;
    public final dxio<bypm> h;
    public final dxio<qqb> i;
    public final dxio<ckcw> j;
    public final dxio<rot> k;
    public final cqat l;
    public final Executor m;
    public final qjk n;
    public final dxio<byqc> o;
    private final Context p;
    private final pag q;
    private final dxio<byro> r;
    private final buyp s;

    public bypk(Application application, pag pagVar, auhi auhiVar, buyp buypVar, bvjj bvjjVar, qjp qjpVar, qjl qjlVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, cqat cqatVar, qjk qjkVar, Executor executor, dxio dxioVar6, dxio dxioVar7) {
        this.p = application.getApplicationContext();
        this.q = pagVar;
        this.c = auhiVar;
        this.s = buypVar;
        this.d = bvjjVar;
        this.e = qjpVar;
        this.f = qjlVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = dxioVar3;
        this.j = dxioVar4;
        this.o = dxioVar5;
        this.l = cqatVar;
        this.n = qjkVar;
        this.m = executor;
        this.k = dxioVar6;
        this.r = dxioVar7;
    }

    @Override // defpackage.byqh
    public final boolean a() {
        return false;
    }

    @Override // defpackage.byqh
    public final void b(boolean z) {
        dbsk.l(false);
        this.d.S(bvjk.cA, z);
        if (z) {
            this.c.e(dpyv.TRAFFIC_TO_PLACE.dm, aufs.ENABLED);
        }
    }

    @Override // defpackage.byqh
    public final dehn<byqf> c(String str, @dzsi String str2) {
        djvu bZ = djvw.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djvw djvwVar = (djvw) bZ.b;
        str.getClass();
        djvwVar.a |= 2;
        djvwVar.c = str;
        djvw djvwVar2 = (djvw) bZ.b;
        djvwVar2.d = 1;
        djvwVar2.a |= 4;
        if (!dbsj.d(str2)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djvw djvwVar3 = (djvw) bZ.b;
            str2.getClass();
            djvwVar3.a |= 8;
            djvwVar3.e = str2;
        }
        deig d = deig.d();
        this.s.b(bZ.bK(), new bypi(this, d), this.m);
        return d;
    }

    @Override // defpackage.byqh
    public final void d() {
    }

    @Override // defpackage.byqh
    public final dehn<byqf> e() {
        djvr djvrVar;
        dspd dspdVar;
        dbsk.l(false);
        if (!this.c.s(dpyv.TRAFFIC_TO_PLACE.dm)) {
            return deha.a(byqf.ERROR_NO_RETRY);
        }
        djvu bZ = djvw.h.bZ();
        dutq a2 = this.q.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djvw djvwVar = (djvw) bZ.b;
        a2.getClass();
        djvwVar.b = a2;
        int i = djvwVar.a | 1;
        djvwVar.a = i;
        djvwVar.a = i | 128;
        djvwVar.g = false;
        eaol f = new eaol(this.h.a().a.b(), eaou.b).f(eaou.i());
        switch (f.B()) {
            case 1:
                djvrVar = djvr.MONDAY;
                break;
            case 2:
                djvrVar = djvr.TUESDAY;
                break;
            case 3:
                djvrVar = djvr.WEDNESDAY;
                break;
            case 4:
                djvrVar = djvr.THURSDAY;
                break;
            case 5:
                djvrVar = djvr.FRIDAY;
                break;
            case 6:
                djvrVar = djvr.SATURDAY;
                break;
            case 7:
                djvrVar = djvr.SUNDAY;
                break;
            default:
                int B = f.B();
                StringBuilder sb = new StringBuilder(40);
                sb.append("Unexpected joda day of week: ");
                sb.append(B);
                throw new RuntimeException(sb.toString());
        }
        eapi eapiVar = new eapi(f.a, f.b);
        Iterator<djvs> it = djvt.b.a.iterator();
        while (true) {
            dspdVar = null;
            if (it.hasNext()) {
                djvs next = it.next();
                djvr b2 = djvr.b(next.c);
                if (b2 == null) {
                    b2 = djvr.UNKNOWN_DAY;
                }
                if (djvrVar == b2) {
                    eapi eapiVar2 = new eapi(next.d, next.e);
                    int i2 = next.f;
                    eapi b3 = i2 == 0 ? eapiVar2 : eapiVar2.b(eapiVar2.c.o().e(eapiVar2.b, i2));
                    if (!eapiVar.C(eapiVar2) && !eapiVar.B(b3)) {
                        if ((next.a & 1) != 0) {
                            dspdVar = next.b;
                        }
                    }
                }
            }
        }
        if (dspdVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djvw djvwVar2 = (djvw) bZ.b;
            dspdVar.getClass();
            djvwVar2.a |= 32;
            djvwVar2.f = dspdVar;
        }
        this.l.b();
        deig d = deig.d();
        this.s.b(bZ.bK(), new bypj(this, d), this.m);
        return d;
    }

    @Override // defpackage.byqh
    @dzsi
    public final String f(dlfv dlfvVar) {
        dljr dljrVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        if (dlgnVar.c == 19) {
            dlgn dlgnVar2 = dlfvVar.g;
            if (dlgnVar2 == null) {
                dlgnVar2 = dlgn.G;
            }
            if (dlgnVar2.c == 19) {
                dljrVar = (dljr) dlgnVar2.d;
            } else {
                dljrVar = dljr.k;
            }
            if (!dljrVar.b.isEmpty()) {
                return dljrVar.b;
            }
        }
        return null;
    }

    @Override // defpackage.byqh
    public final void g() {
    }

    @Override // defpackage.byqh
    public final Intent h(@dzsi btlu btluVar, dlfv dlfvVar) {
        String f = f(dlfvVar);
        if (dbsj.d(f)) {
            bvoo.h("No session id", new Object[0]);
            f = "";
        }
        qjj qjjVar = qjj.TRAFFIC_TO_PLACE;
        dlft dlftVar = dlfvVar.b;
        if (dlftVar == null) {
            dlftVar = dlft.c;
        }
        if (dlftVar.b == auiy.TIME_TO_LEAVE.a().intValue()) {
            qjjVar = qjj.TIME_TO_LEAVE;
        }
        Context context = this.p;
        dbsk.s(f);
        Intent action = new Intent(context, DismissTrafficToPlaceNotificationReceiver.class).setAction("com.google.android.apps.gmm.traffic.notification.service.DismissTrafficToPlaceNotificationReceiver.NOTIFICATION_DISMISSED");
        if (!dbsj.d(f)) {
            action.putExtra("NotificationTag", f);
        }
        if (btluVar != null) {
            action.putExtra("ObfuscatedGaia", dbsj.e(btluVar.j()));
        }
        action.putExtra("CommuteNotificationType", qjjVar.e);
        return action;
    }

    @Override // defpackage.byqh
    public final void i(qjj qjjVar, String str, @dzsi btlu btluVar) {
        this.e.b(qjjVar, str);
        if (qjjVar == qjj.TRAFFIC_TO_PLACE) {
            byqc a2 = this.o.a();
            if (btluVar == null || !a2.b(btluVar) || !a2.a()) {
                return;
            }
            a2.d(byqe.i(), btluVar);
        }
    }

    @Override // defpackage.byqh
    public final void j() {
        this.d.Z(bvjk.cs, this.l.b());
    }

    public final void k(byqb byqbVar) {
        ((ckco) this.j.a().a(ckht.aN)).a(byqbVar.E);
        String str = byqbVar.F;
    }

    @Override // defpackage.byqh
    public final void l() {
    }

    @Override // defpackage.byqh
    public final void m(dlfb dlfbVar) {
        dehn a2;
        try {
            final byro a3 = this.r.a();
            try {
                bbo bboVar = new bbo();
                bboVar.e("worker_name_key", "CommuteNotificationProberWorker");
                if (dlfbVar != null) {
                    bboVar.c("proto", dlfbVar.bS());
                }
                bbk bbkVar = new bbk();
                bbkVar.c = 2;
                bbkVar.a = false;
                final bcb f = new bca(GmmWorkerWrapper.class).d("CommuteNotificationProberScheduler").c(bboVar.a()).b(bbkVar.a()).f();
                a2 = deew.h(a3.a.d("CommuteNotificationProberScheduler", 1, f).a(), new dbrn(a3, f) { // from class: byrn
                    private final byro a;
                    private final bcb b;

                    {
                        this.a = a3;
                        this.b = f;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        byro byroVar = this.a;
                        try {
                            return this.b.a;
                        } catch (RuntimeException e) {
                            byroVar.b.c(4, e);
                            return bbx.c();
                        }
                    }
                }, dege.a);
            } catch (RuntimeException e) {
                a3.b.c(4, e);
                a2 = deha.a(bbx.c());
            }
            a2.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.byqh
    public final void n() {
        this.d.S(bvjk.ct, true);
    }
}
