package defpackage;

import android.location.Location;
import androidx.work.WorkerParameters;
import com.google.android.apps.gmm.location.model.QuantizedDeviceLocation;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byrm  reason: default package */
/* loaded from: classes4.dex */
public final class byrm implements irw {
    public static final dcqe a = dcqe.c("byrm");
    public final bypq b;
    public final ahth c;
    public final ckcw d;
    public final btrm e;
    public final btvo f;
    public final isa g;
    private final dehp h;

    public byrm(bypq bypqVar, ahth ahthVar, ckcw ckcwVar, btrm btrmVar, btvo btvoVar, isa isaVar, dehp dehpVar) {
        this.b = bypqVar;
        this.c = ahthVar;
        this.d = ckcwVar;
        this.e = btrmVar;
        this.f = btvoVar;
        this.g = isaVar;
        this.h = dehpVar;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.d.f(ckhc.AREA_TRAFFIC_NOTIFICATION_SERVICE);
            dehn<bbx> c = this.h.c(new Callable(this, workerParameters) { // from class: byrh
                private final byrm a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final boolean z;
                    int b;
                    final byrm byrmVar = this.a;
                    WorkerParameters workerParameters2 = this.b;
                    try {
                        dbsg r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: byrj
                            private final String a = "traffic.notification.periodic";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            r = dcbg.b(workerParameters2.c).r(new dbsl() { // from class: byrk
                                private final String a = "traffic.notification.one_time";

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj) {
                                    return this.a.equals((String) obj);
                                }
                            });
                        }
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        if (!byrmVar.b.f()) {
                            byrmVar.b.a();
                            return bbx.a();
                        }
                        bbp bbpVar = workerParameters2.b;
                        ckco ckcoVar = null;
                        String c2 = bbpVar == null ? null : bbpVar.c("geofence_exit_triggger_location");
                        Location location = c2 == null ? null : (Location) new dgsx().h(c2, Location.class);
                        if (location != null) {
                            amvs amvsVar = new amvs();
                            amvsVar.j(location);
                            GmmLocation d = amvsVar.d();
                            byrmVar.e.b(new ahms(QuantizedDeviceLocation.e(d, byrmVar.f.getLocationParameters().i, TimeUnit.MINUTES.toMillis(byrmVar.f.getLocationParameters().j))));
                            byrmVar.b.g(d);
                            z = true;
                        } else {
                            z = false;
                        }
                        ahth ahthVar = byrmVar.c;
                        boolean z2 = !z;
                        byrv byrvVar = new byrv(byrmVar, z) { // from class: byrl
                            private final byrm a;
                            private final boolean b;

                            {
                                this.a = byrmVar;
                                this.b = z;
                            }

                            @Override // defpackage.byrv
                            public final dehn a(GmmLocation gmmLocation) {
                                byrm byrmVar2 = this.a;
                                boolean z3 = this.b;
                                dehn<byqf> d2 = byrmVar2.b.d();
                                if (!z3 && gmmLocation != null) {
                                    byrmVar2.b.g(gmmLocation);
                                }
                                return d2;
                            }
                        };
                        bbp bbpVar2 = workerParameters2.b;
                        if (bbpVar2 != null && bbpVar2.e("atn_subscription_reason", Integer.class) && (b = workerParameters2.b.b("atn_subscription_reason", -1)) >= 0 && b < bypp.values().length) {
                            ckcoVar = (ckco) byrmVar.d.a(bypp.values()[b].e);
                        } else {
                            bvoo.h("Expected subscription reason histogram in task worker parameters.", new Object[0]);
                        }
                        bbx a2 = byrw.a(ahthVar, 10L, z2, 70L, byrvVar, ckcoVar);
                        return (a2.equals(bbx.a()) || a2.equals(bbx.b())) ? a2 : a2;
                    } catch (RuntimeException e) {
                        byrmVar.g.b(2, e);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: byri
                private final byrm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.g(ckhc.AREA_TRAFFIC_NOTIFICATION_SERVICE);
                }
            }, this.h);
            return c;
        } catch (RuntimeException e) {
            this.g.b(2, e);
            return deha.a(bbx.c());
        }
    }
}
