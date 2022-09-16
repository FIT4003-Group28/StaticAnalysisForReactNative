package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: acqx  reason: default package */
/* loaded from: classes.dex */
public final class acqx extends rgf implements acqs {
    public final Runnable a;
    public final AtomicInteger b;
    protected ankt c;
    protected HandlerThread d;
    protected final axnm e;
    protected apez f;
    protected qst g;
    private final Context h;
    private final yuu i;
    private final ScheduledExecutorService j;
    private final snc k;
    private Handler l;
    private asvi m;
    private Location n;
    private LocationAvailability o;
    private boolean p;
    private final aacz q;

    public acqx(Context context, aacz aaczVar, yuu yuuVar, snc sncVar, ScheduledExecutorService scheduledExecutorService, axnm axnmVar) {
        this.h = context;
        aaczVar.getClass();
        this.q = aaczVar;
        yuuVar.getClass();
        this.i = yuuVar;
        sncVar.getClass();
        this.k = sncVar;
        scheduledExecutorService.getClass();
        this.j = scheduledExecutorService;
        this.e = axnmVar;
        this.d = null;
        this.b = new AtomicInteger(1);
        this.a = new acqw(this, 1);
    }

    private final boolean m() {
        apez apezVar = this.f;
        return apezVar != null && this.i.a((atvp[]) apezVar.e.toArray(new atvp[0]));
    }

    @Override // defpackage.rgf
    public final void a(LocationAvailability locationAvailability) {
        this.o = locationAvailability;
    }

    @Override // defpackage.rgf
    public final void b(LocationResult locationResult) {
        if (locationResult != null) {
            int size = locationResult.b.size();
            k(size == 0 ? null : (Location) locationResult.b.get(size - 1));
        }
    }

    @Override // defpackage.acqs
    public final asvj c() {
        int i;
        LocationAvailability locationAvailability;
        LocationAvailability locationAvailability2;
        if (l()) {
            aopa createBuilder = asvj.a.createBuilder();
            try {
                if (this.p) {
                    i = 9;
                } else {
                    i = (!l() || m()) ? (!l() || this.n != null || ((locationAvailability2 = this.o) != null && !locationAvailability2.d)) ? (!l() || (locationAvailability = this.o) == null || locationAvailability.d) ? this.n != null ? 4 : 1 : 8 : 2 : 5;
                }
                createBuilder.copyOnWrite();
                asvj asvjVar = (asvj) createBuilder.instance;
                asvjVar.c = i - 1;
                asvjVar.b |= 1;
                Location location = this.n;
                if (location != null) {
                    int latitude = (int) (location.getLatitude() * 1.0E7d);
                    createBuilder.copyOnWrite();
                    asvj asvjVar2 = (asvj) createBuilder.instance;
                    asvjVar2.b = 8 | asvjVar2.b;
                    asvjVar2.d = latitude;
                    createBuilder.copyOnWrite();
                    asvj asvjVar3 = (asvj) createBuilder.instance;
                    asvjVar3.b |= 16;
                    asvjVar3.e = (int) (this.n.getLongitude() * 1.0E7d);
                    int round = Math.round(this.n.getAccuracy());
                    createBuilder.copyOnWrite();
                    asvj asvjVar4 = (asvj) createBuilder.instance;
                    asvjVar4.b |= 32;
                    asvjVar4.f = round;
                    long convert = TimeUnit.MILLISECONDS.convert(this.k.e() - this.n.getElapsedRealtimeNanos(), TimeUnit.NANOSECONDS);
                    createBuilder.copyOnWrite();
                    asvj asvjVar5 = (asvj) createBuilder.instance;
                    asvjVar5.b |= 64;
                    asvjVar5.g = convert;
                }
            } catch (Exception e) {
                afus.c(2, 26, "Failure createLocationInfo.", e);
            }
            return (asvj) createBuilder.mo39build();
        }
        return null;
    }

    @Override // defpackage.acqs
    public final synchronized void d() {
        try {
            if (this.b.get() == 2) {
                this.b.set(1);
                this.c.qY(new acqw(this), this.j);
                return;
            }
            ankt anktVar = this.c;
            if (anktVar != null && !anktVar.isCancelled()) {
                this.c.cancel(true);
            }
            if (this.g == null || this.b.get() == 3) {
                return;
            }
            this.g.z(this);
            this.b.set(1);
            this.g = null;
        } catch (Exception e) {
            j(e, "Failure stopLocationListening.");
        }
    }

    @Override // defpackage.acqs
    public final synchronized void e() {
        try {
            if (!this.b.compareAndSet(1, 2)) {
                return;
            }
            asvi asviVar = this.q.b().t;
            if (asviVar == null) {
                asviVar = asvi.a;
            }
            apez apezVar = asviVar.c;
            if (apezVar == null) {
                apezVar = apez.a;
            }
            if (apezVar.f) {
                this.l = (Handler) this.e.get();
            } else {
                if (this.d == null) {
                    HandlerThread handlerThread = new HandlerThread(String.valueOf(getClass().getName()).concat("_POLLING"), 10);
                    this.d = handlerThread;
                    handlerThread.start();
                }
                if (this.l == null) {
                    this.l = new Handler(this.d.getLooper());
                }
            }
            ankt anktVar = this.c;
            if (anktVar != null && !anktVar.isCancelled()) {
                this.c.cancel(true);
            }
            this.c = anlz.v(new aniq() { // from class: acqv
                @Override // defpackage.aniq
                public final ankt a() {
                    acqx acqxVar = acqx.this;
                    acqxVar.a.run();
                    if (acqxVar.b.get() == 0) {
                        return anlz.q(null);
                    }
                    return anlz.p(new IllegalStateException("Could not start location updates"));
                }
            }, this.j);
        } catch (Exception e) {
            j(e, "Failure startLocationListening.");
            anlz.o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff A[Catch: all -> 0x015c, Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:9:0x0013, B:11:0x0017, B:13:0x001b, B:14:0x001d, B:15:0x001f, B:17:0x0025, B:19:0x002b, B:21:0x002f, B:22:0x0037, B:24:0x0040, B:26:0x0045, B:28:0x004b, B:29:0x005f, B:33:0x008b, B:36:0x00a6, B:37:0x00a8, B:40:0x00b3, B:51:0x00c9, B:59:0x0110, B:54:0x00ff, B:58:0x0107, B:62:0x0153), top: B:75:0x0003, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqx.i():void");
    }

    public final void j(Exception exc, String str) {
        this.b.set(3);
        this.p = true;
        afus.c(1, 26, str, exc);
        try {
            synchronized (this) {
                qst qstVar = this.g;
                if (qstVar != null) {
                    qstVar.z(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Location location) {
        if (location != null) {
            this.n = location;
        }
    }

    public final boolean l() {
        asvi asviVar = this.m;
        return (asviVar == null || this.f == null || !asviVar.b) ? false : true;
    }
}
