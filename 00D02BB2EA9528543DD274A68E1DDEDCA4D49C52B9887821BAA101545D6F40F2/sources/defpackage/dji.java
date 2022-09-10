package defpackage;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dji  reason: default package */
/* loaded from: classes6.dex */
final class dji implements czm {
    public final btvo a;
    public final Location b;
    private final dfkr c;
    private final dehp d;
    private final Object e = new Object();
    @dzsi
    private dehn<dfmo> f;

    public dji(btvo btvoVar, dfkr dfkrVar, dehp dehpVar, Location location) {
        this.a = btvoVar;
        this.c = dfkrVar;
        this.d = dehpVar;
        this.b = location;
    }

    @Override // defpackage.czm
    public final dehn<dfmo> a(k kVar) {
        bvrj.UI_THREAD.c();
        synchronized (this.e) {
            dehn<dfmo> dehnVar = this.f;
            if (dehnVar != null) {
                return dehnVar;
            }
            final dfmj bZ = dfmk.d.bZ();
            final dll a = this.c.a();
            final dehn<dfmo> g = deew.g(degp.q(this.d.c(new Callable(this, bZ, a) { // from class: djg
                private final dji a;
                private final dfmj b;
                private final dll c;

                {
                    this.a = this;
                    this.b = bZ;
                    this.c = a;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dji djiVar = this.a;
                    dfmj dfmjVar = this.b;
                    dll dllVar = this.c;
                    Location location = djiVar.b;
                    dfnj bZ2 = dfnl.n.bZ();
                    double latitude = location.getLatitude();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dfnl dfnlVar = (dfnl) bZ2.b;
                    dfnlVar.a |= 8;
                    dfnlVar.e = latitude;
                    double longitude = location.getLongitude();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dfnl dfnlVar2 = (dfnl) bZ2.b;
                    dfnlVar2.a |= 16;
                    dfnlVar2.f = longitude;
                    long nanos = TimeUnit.MILLISECONDS.toNanos(location.getTime());
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dfnl dfnlVar3 = (dfnl) bZ2.b;
                    dfnlVar3.a |= 2;
                    dfnlVar3.c = nanos;
                    long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dfnl dfnlVar4 = (dfnl) bZ2.b;
                    dfnlVar4.a |= 1;
                    dfnlVar4.b = elapsedRealtimeNanos;
                    if (location.hasAccuracy()) {
                        double accuracy = location.getAccuracy();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar5 = (dfnl) bZ2.b;
                        dfnlVar5.a |= 32;
                        dfnlVar5.g = accuracy;
                    }
                    if ("gps".equals(location.getProvider())) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar6 = (dfnl) bZ2.b;
                        dfnlVar6.d = 2;
                        dfnlVar6.a |= 4;
                    } else if ("network".equals(location.getProvider())) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar7 = (dfnl) bZ2.b;
                        dfnlVar7.d = 3;
                        dfnlVar7.a |= 4;
                    } else if ("fused".equals(location.getProvider())) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar8 = (dfnl) bZ2.b;
                        dfnlVar8.d = 1;
                        dfnlVar8.a |= 4;
                    }
                    if (location.hasBearing()) {
                        float bearing = location.getBearing();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar9 = (dfnl) bZ2.b;
                        dfnlVar9.a |= 256;
                        dfnlVar9.j = bearing;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && location.hasBearingAccuracy()) {
                        float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar10 = (dfnl) bZ2.b;
                        dfnlVar10.a |= 512;
                        dfnlVar10.k = bearingAccuracyDegrees;
                    }
                    if (location.hasAltitude()) {
                        double altitude = location.getAltitude();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar11 = (dfnl) bZ2.b;
                        dfnlVar11.a |= 64;
                        dfnlVar11.h = altitude;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && location.hasVerticalAccuracy()) {
                        float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar12 = (dfnl) bZ2.b;
                        dfnlVar12.a |= 128;
                        dfnlVar12.i = verticalAccuracyMeters;
                    }
                    if (location.hasSpeed()) {
                        float speed = location.getSpeed();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar13 = (dfnl) bZ2.b;
                        dfnlVar13.a |= 1024;
                        dfnlVar13.l = speed;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && location.hasSpeedAccuracy()) {
                        float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dfnl dfnlVar14 = (dfnl) bZ2.b;
                        dfnlVar14.a |= 2048;
                        dfnlVar14.m = speedAccuracyMetersPerSecond;
                    }
                    if (dfmjVar.c) {
                        dfmjVar.bF();
                        dfmjVar.c = false;
                    }
                    dfmk dfmkVar = (dfmk) dfmjVar.b;
                    dfnl bK = bZ2.bK();
                    dfmk dfmkVar2 = dfmk.d;
                    bK.getClass();
                    dfmkVar.b = bK;
                    dfmkVar.a |= 1;
                    dknv dknvVar = djiVar.a.getAugmentedRealityParameters().a;
                    if (dknvVar == null) {
                        dknvVar = dknv.v;
                    }
                    String str = dknvVar.t;
                    if (dfmjVar.c) {
                        dfmjVar.bF();
                        dfmjVar.c = false;
                    }
                    dfmk dfmkVar3 = (dfmk) dfmjVar.b;
                    str.getClass();
                    dfmkVar3.a |= 2;
                    dfmkVar3.c = str;
                    return dfni.a(dllVar.a());
                }
            })), new defg(bZ) { // from class: djh
                private final dfmj a;

                {
                    this.a = bZ;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    dfmj dfmjVar = this.a;
                    dfnh dfnhVar = (dfnh) obj;
                    dbsk.s(dfnhVar);
                    dfmk bK = dfmjVar.bK();
                    dyeu dyeuVar = dfnhVar.a;
                    dyib<dfmk, dfmo> dyibVar = dfni.c;
                    if (dyibVar == null) {
                        synchronized (dfni.class) {
                            dyibVar = dfni.c;
                            if (dyibVar == null) {
                                dyhx c = dyib.c();
                                c.c = dyhz.UNARY;
                                c.d = dyib.b("google.geo.ar.v1.LocalizeService", "CheckAvailability");
                                c.e = true;
                                c.a = dyyq.b(dfmk.d);
                                c.b = dyyq.b(dfmo.d);
                                dyibVar = c.a();
                                dfni.c = dyibVar;
                            }
                        }
                    }
                    return dyzf.d(dyeuVar.a(dyibVar, dfnhVar.b), bK);
                }
            }, this.d);
            kVar.a(new e() { // from class: com.google.android.apps.gmm.ar.common.launcher.LocalizationAvailabilityImpl$1
                @Override // defpackage.f
                public final void a(m mVar) {
                }

                @Override // defpackage.f
                public final void b(m mVar) {
                }

                @Override // defpackage.f
                public final void c(m mVar) {
                }

                @Override // defpackage.f
                public final void d(m mVar) {
                }

                @Override // defpackage.f
                public final void e(m mVar) {
                }

                @Override // defpackage.f
                public final void f(m mVar) {
                    dehn.this.cancel(true);
                    a.b();
                }
            });
            this.f = g;
            return g;
        }
    }
}
