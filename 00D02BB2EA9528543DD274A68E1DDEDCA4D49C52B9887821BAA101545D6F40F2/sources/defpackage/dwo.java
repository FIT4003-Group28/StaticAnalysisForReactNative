package defpackage;

import com.google.ar.core.Earth;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.UnavailableException;
/* compiled from: PG */
/* renamed from: dwo  reason: default package */
/* loaded from: classes6.dex */
public final class dwo implements dnh {
    public final dfeo b;
    public final djo c;
    public final btvo d;
    @dzsi
    public czh e;
    @dzsi
    public volatile dflf g;
    @dzsi
    public volatile arlb h;
    private final dol i;
    private final dwn j;
    private final dnj k;
    private final btrm l;
    private boolean n;
    private boolean o;
    public final Object a = new Object();
    private czs m = czs.NONE;
    @dzsi
    public volatile Session f = null;

    public dwo(djo djoVar, dol dolVar, dwn dwnVar, dnj dnjVar, dxa dxaVar, btvo btvoVar, btrm btrmVar) {
        this.c = djoVar;
        this.i = dolVar;
        this.j = dwnVar;
        this.k = dnjVar;
        z<dad> zVar = djoVar.c;
        btvo a = dxaVar.a.a();
        dxa.a(a, 1);
        dehq a2 = dxaVar.b.a();
        dxa.a(a2, 2);
        czw a3 = dxaVar.c.a();
        dxa.a(a3, 3);
        dxa.a(zVar, 4);
        this.b = new dwz(a, a2, a3, zVar);
        this.d = btvoVar;
        this.l = btrmVar;
    }

    private final void f(boolean z) {
        this.c.b = z;
        this.o = z;
        g();
    }

    private final void g() {
        Earth.LocalizationPerformanceMode localizationPerformanceMode;
        if (this.g != null) {
            dflf dflfVar = this.g;
            if (!this.o) {
                localizationPerformanceMode = Earth.LocalizationPerformanceMode.INACTIVE_PASSIVE;
            } else if (this.n) {
                localizationPerformanceMode = Earth.LocalizationPerformanceMode.ACTIVE_AR;
            } else {
                localizationPerformanceMode = Earth.LocalizationPerformanceMode.ACTIVE_NO_CAMERA;
            }
            dflfVar.i(localizationPerformanceMode);
        }
    }

    @Override // defpackage.dnh
    public final void a(czs czsVar) {
        synchronized (this.a) {
            czs czsVar2 = this.m;
            if (czsVar != czsVar2) {
                boolean z = false;
                if (czsVar.a(czsVar2)) {
                    if (this.m == czs.NONE && czsVar.a(czs.INERTIAL_BACKGROUND)) {
                        czh czhVar = this.e;
                        dbsk.s(czhVar);
                        synchronized (this.a) {
                            dbsk.m(!e(), "Attempting to start a session after having already started");
                            this.k.a();
                            if (this.g == null) {
                                this.g = this.j.a(czhVar);
                                btrm btrmVar = this.l;
                                dceq a = dcet.a();
                                a.b(gds.class, new dwt(gds.class, this));
                                btrmVar.g(this, a.a());
                            }
                            dflf dflfVar = this.g;
                            dbsk.s(dflfVar);
                            try {
                                dflfVar.a();
                                this.f = dflfVar.e();
                                this.c.b(dflfVar, true);
                                g();
                            } catch (UnavailableException e) {
                                throw new IllegalStateException("Failed to create an ARCore session", e);
                            }
                        }
                        this.m = czs.INERTIAL_BACKGROUND;
                    }
                    if (this.m == czs.INERTIAL_BACKGROUND && czsVar.a(czs.INERTIAL_FOREGROUND)) {
                        f(true);
                        this.m = czs.INERTIAL_FOREGROUND;
                    }
                    if (this.m == czs.INERTIAL_FOREGROUND && czsVar.a(czs.CAMERA)) {
                        this.c.a = true;
                        this.n = true;
                        g();
                        this.m = czs.CAMERA;
                    }
                } else {
                    if (this.m == czs.CAMERA && !czsVar.a(czs.CAMERA)) {
                        this.c.a = false;
                        this.n = false;
                        g();
                        this.m = czs.INERTIAL_FOREGROUND;
                    }
                    if (this.m == czs.INERTIAL_FOREGROUND && !czsVar.a(czs.INERTIAL_FOREGROUND)) {
                        f(false);
                        this.m = czs.INERTIAL_BACKGROUND;
                    }
                    if (this.m == czs.INERTIAL_BACKGROUND && !czsVar.a(czs.INERTIAL_BACKGROUND)) {
                        synchronized (this.a) {
                            dbsk.l(e());
                            dflf dflfVar2 = this.g;
                            dbsk.s(dflfVar2);
                            dflfVar2.b();
                            this.c.c();
                            this.k.b();
                            this.c.a(null);
                        }
                        this.m = czs.NONE;
                    }
                }
                if (this.m == czsVar) {
                    z = true;
                }
                dbsk.l(z);
            }
        }
    }

    @Override // defpackage.dnh
    public final void b() {
        synchronized (this.a) {
            dflf dflfVar = this.g;
            if (dflfVar != null) {
                this.l.a(this);
                dflfVar.c();
                this.g = null;
            }
        }
    }

    @Override // defpackage.dnh
    @dzsi
    public final String c() {
        dflf dflfVar = this.g;
        if (dflfVar == null) {
            return null;
        }
        return dflfVar.g();
    }

    @Override // defpackage.dnh
    @dzsi
    public final dad d(final Frame frame) {
        dflf dflfVar = this.g;
        if (dflfVar == null) {
            return null;
        }
        if (frame.getCamera().getTrackingState() == TrackingState.TRACKING) {
            this.i.a(1, "ARCore: tracking");
        } else {
            this.i.a(1, "ARCore: not tracking");
        }
        dflfVar.d(frame);
        dad d = djo.d(dflfVar.f());
        TrackingState trackingState = frame.getCamera().getTrackingState();
        TrackingState trackingState2 = TrackingState.TRACKING;
        if (trackingState == trackingState2 && d != null) {
            this.i.b(8, new dok(frame) { // from class: dwm
                private final Frame a;

                {
                    this.a = frame;
                }
            });
        }
        this.c.a(d);
        if (trackingState != trackingState2) {
            return null;
        }
        return d;
    }

    final boolean e() {
        boolean a;
        synchronized (this.a) {
            a = this.m.a(czs.INERTIAL_BACKGROUND);
        }
        return a;
    }
}
