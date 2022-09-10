package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gmm.transit.tracks.LocationBroadcastReceiver;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzlp  reason: default package */
/* loaded from: classes4.dex */
public final class bzlp implements bzll {
    public final Application c;
    public final axru d;
    public final dxio<akfa> e;
    public final cjnx f;
    public final ckco g;
    private final cqat i;
    private final btvo j;
    private final Executor k;
    private final btpc l;
    private final cjqy m;
    public static final eaow a = eaow.c(1);
    private static final eaow h = eaow.c(60);
    public static final eaow b = eaow.c(30);

    public bzlp(Application application, cqat cqatVar, btvo btvoVar, axru axruVar, dxio<akfa> dxioVar, Executor executor, cjnx cjnxVar, btpc btpcVar, ckcw ckcwVar, cjqy cjqyVar) {
        this.c = application;
        this.i = cqatVar;
        this.j = btvoVar;
        this.d = axruVar;
        this.e = dxioVar;
        this.k = executor;
        this.f = cjnxVar;
        this.l = btpcVar;
        this.m = cjqyVar;
        this.g = (ckco) ckcwVar.a(ckkm.i);
    }

    @Override // defpackage.bzll
    public final void a(qbm qbmVar) {
        amve[] amveVarArr;
        this.g.a(ckkk.a(1));
        if (qbmVar.b() || qbmVar.d() || !qbmVar.f()) {
            return;
        }
        this.g.a(ckkk.a(2));
        long b2 = (this.i.b() + b()) / 1000;
        amte n = qbmVar.n();
        long j = Long.MAX_VALUE;
        if (n != null) {
            for (amve amveVar : n.a.d) {
                dpec dpecVar = amveVar.a.d;
                if (dpecVar == null) {
                    dpecVar = dpec.o;
                }
                dqvj c = dqvj.c(dpecVar.b);
                if (c == null) {
                    c = dqvj.DRIVE;
                }
                if (c == dqvj.TRANSIT) {
                    dpec dpecVar2 = amveVar.a.d;
                    if (dpecVar2 == null) {
                        dpecVar2 = dpec.o;
                    }
                    dpci dpciVar = dpecVar2.f;
                    if (dpciVar == null) {
                        dpciVar = dpci.i;
                    }
                    dgaw dgawVar = dpciVar.e;
                    if (dgawVar == null) {
                        dgawVar = dgaw.g;
                    }
                    long j2 = dgawVar.b;
                    if (j2 > 0 && j2 < j) {
                        j = j2;
                    }
                }
            }
        }
        if (j >= b2) {
            return;
        }
        this.g.a(ckkk.a(3));
        dqvj l = qbmVar.l();
        if (l != dqvj.TRANSIT && l != dqvj.MIXED) {
            return;
        }
        this.g.a(ckkk.a(4));
        int b3 = this.l.b();
        if (b3 == -1 || b3 < c().d) {
            return;
        }
        this.g.a(ckkk.a(5));
        e(this.e.a().l(), new bvqg(this) { // from class: bzlm
            private final bzlp a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final bzlp bzlpVar = this.a;
                Void r5 = (Void) obj;
                btlu j3 = bzlpVar.e.a().j();
                if (j3 == null || btlu.i(j3) == btlt.SIGNED_OUT) {
                    return;
                }
                bzlpVar.g.a(ckkk.a(6));
                if (btlu.i(j3) == btlt.INCOGNITO) {
                    return;
                }
                bzlpVar.g.a(ckkk.a(7));
                final dehn[] dehnVarArr = {bzlpVar.f.e(j3), bzlpVar.f.l(j3)};
                bzlpVar.e(deha.m(dehnVarArr).b(new Callable(dehnVarArr) { // from class: bzlo
                    private final dehn[] a;

                    {
                        this.a = dehnVarArr;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dehn[] dehnVarArr2 = this.a;
                        eaow eaowVar = bzlp.a;
                        boolean z = true;
                        for (int i = 0; i < 2; i++) {
                            dehn dehnVar = dehnVarArr2[i];
                            if (z) {
                                try {
                                    if (((Boolean) deha.r(dehnVar)).booleanValue()) {
                                        z = true;
                                    }
                                } catch (ExecutionException unused) {
                                    return false;
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }, dege.a), new bvqg(bzlpVar) { // from class: bzln
                    private final bzlp a;

                    {
                        this.a = bzlpVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj2) {
                        long j4;
                        bzlp bzlpVar2 = this.a;
                        if (((Boolean) obj2).booleanValue()) {
                            bzlpVar2.g.a(ckkk.a(8));
                            if (!bzlpVar2.d.a("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                return;
                            }
                            bzlpVar2.g.a(ckkk.a(9));
                            bzlpVar2.d(ddda.fI);
                            if (!bzlpVar2.c().b) {
                                return;
                            }
                            bzlpVar2.g.a(ckkk.a(10));
                            LocationRequest create = LocationRequest.create();
                            create.setMaxWaitTime(bzlp.b.b);
                            create.setPriority(100);
                            dkwc c2 = bzlpVar2.c();
                            if ((c2.a & 2) != 0) {
                                j4 = eaow.d(c2.c).b;
                            } else {
                                j4 = bzlp.a.b;
                            }
                            create.setInterval(j4);
                            create.setExpirationDuration(bzlpVar2.b());
                            LocationServices.getFusedLocationProviderClient(bzlpVar2.c).m(create, PendingIntent.getBroadcast(bzlpVar2.c, 0, new Intent(bzlpVar2.c, LocationBroadcastReceiver.class), 134217728));
                            bzlpVar2.d(ddda.fH);
                        }
                    }
                });
            }
        });
    }

    public final long b() {
        dkwc c = c();
        return ((c.a & 8) != 0 ? eaow.d(c.e) : h).b;
    }

    public final dkwc c() {
        return this.j.getTransitDirectionsTracksParameters();
    }

    public final void d(ddda dddaVar) {
        cjqy cjqyVar = this.m;
        cjsx i = cjsy.i();
        i.b(dddaVar);
        cjqyVar.k(i.a());
    }

    public final <T> void e(dehn<T> dehnVar, bvqg<T> bvqgVar) {
        deha.q(dehnVar, bvqj.b(bvqgVar), this.k);
    }
}
