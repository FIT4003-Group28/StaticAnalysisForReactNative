package com.google.android.libraries.geo.navcore.service.base;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Base64;
import com.google.android.libraries.geo.navcore.service.base.NavigationService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationService extends Service {
    public aued a;
    public crgx b;
    public crgj c;
    public dxio<cref> d;
    public ckcw e;
    public btrm f;
    public bwqv g;
    public arzt h;
    public bvrb i;
    public crgv j;
    public dxio<crgh> k;
    public dxio<jzv> l;
    public Executor m;
    public dbty<IBinder> n;
    private boolean o = false;

    public static void a(Context context, boolean z) {
        context.startService(new Intent(context, NavigationService.class).putExtra("quitquitquit", z));
    }

    private final void b(final Intent intent) {
        this.i.b(new Runnable(this, intent) { // from class: crgo
            private final NavigationService a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NavigationService navigationService = this.a;
                Intent intent2 = this.b;
                crgh a = navigationService.k.a();
                dbsk.s(intent2);
                Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent2);
                dbsk.l(!a.a.contains(filterComparison));
                a.a.add(filterComparison);
                a.b.d(crfn.b(asbz.d(dqvj.DRIVE)).c());
            }
        }, bvrj.NAVIGATION_INTERNAL);
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.NX("", printWriter);
        this.c.NX("", printWriter);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        b(intent);
        return this.n.a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        bvmn bvmnVar = bvmo.a;
        super.onCreate();
        btst btstVar = btsr.a;
        crgu crguVar = (crgu) (btstVar == null ? null : btstVar.h(crgu.class, this));
        if (crguVar == null) {
            stopSelf();
            return;
        }
        crguVar.d(this);
        this.d.a();
        this.a.a();
        this.j.a();
        this.b.a();
        this.e.f(ckhc.NAVIGATION_SERVICE);
        this.o = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (!this.o) {
            return;
        }
        bvmn bvmnVar = bvmo.a;
        super.onDestroy();
        this.i.c(new Runnable(this) { // from class: crgp
            private final NavigationService a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NavigationService navigationService = this.a;
                crgh a = navigationService.k.a();
                if (!a.a.isEmpty()) {
                    a.a.clear();
                    a.b.d(null);
                }
                navigationService.c.f(true);
            }
        }, bvrj.NAVIGATION_INTERNAL);
        this.b.b();
        this.j.b();
        this.m.execute(new Runnable(this) { // from class: crgq
            private final NavigationService a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f.b(crhp.a());
            }
        });
        this.a.b();
        this.e.g(ckhc.NAVIGATION_SERVICE);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        b(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (!this.o) {
            return 2;
        }
        bvmn bvmnVar = bvmo.a;
        boolean hasExtra = intent.hasExtra("abortcurrentsession");
        if (intent.hasExtra("quitquitquit") || hasExtra) {
            final boolean z = !intent.getBooleanExtra("quitquitquit", false);
            this.i.b(new Runnable(this, z) { // from class: crgr
                private final NavigationService a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    NavigationService navigationService = this.a;
                    navigationService.c.f(this.b);
                }
            }, bvrj.NAVIGATION_INTERNAL);
            stopSelf();
        } else {
            Intent a = afft.a(this);
            a.setFlags(268435456);
            arzn arznVar = (arzn) this.h;
            arzs arzsVar = arznVar.b;
            arzsVar.m = a;
            arzsVar.n = PendingIntent.getActivity(arzsVar.c, 0, arzsVar.m, 134217728);
            arzd arzdVar = arznVar.c.b;
            arzdVar.o = PendingIntent.getActivity(arzdVar.c, 0, a, 134217728);
            arzs arzsVar2 = ((arzn) this.h).b;
            if (intent.hasExtra("declinesuggestion")) {
                atxz atxzVar = arzsVar2.p;
                if (atxzVar != null) {
                    arzsVar2.b(atxzVar.T(), false);
                }
            } else if (!intent.hasExtra("acceptsuggestion")) {
                this.i.b(new Runnable(this, intent) { // from class: crgm
                    private final NavigationService a;
                    private final Intent b;

                    {
                        this.a = this;
                        this.b = intent;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        arym[] values;
                        crfo c;
                        NavigationService navigationService = this.a;
                        try {
                            Uri data = this.b.getData();
                            bwqv bwqvVar = navigationService.g;
                            bvmn bvmnVar2 = bvmo.a;
                            String queryParameter = data.getQueryParameter("m");
                            for (arym arymVar : arym.values()) {
                                if (arymVar.c.equals(queryParameter)) {
                                    long parseLong = Long.parseLong(data.getQueryParameter("t"));
                                    if (arymVar == arym.GUIDED_NAV) {
                                        amte amteVar = (amte) crfo.c(bwqvVar, amte.class, data.getQueryParameter("d"));
                                        int parseInt = Integer.parseInt(data.getQueryParameter("idx"));
                                        boolean parseBoolean = Boolean.parseBoolean(data.getQueryParameter("hdp"));
                                        boolean parseBoolean2 = Boolean.parseBoolean(data.getQueryParameter("dtu"));
                                        boolean parseBoolean3 = Boolean.parseBoolean(data.getQueryParameter("dr"));
                                        boolean parseBoolean4 = Boolean.parseBoolean(data.getQueryParameter("fdan"));
                                        String queryParameter2 = data.getQueryParameter("rn");
                                        String queryParameter3 = data.getQueryParameter("trht");
                                        dspd x = queryParameter3 != null ? dspd.x(Base64.decode(queryParameter3, 8)) : null;
                                        boolean parseBoolean5 = Boolean.parseBoolean(data.getQueryParameter("ipr"));
                                        crfn a2 = crfn.a(amteVar);
                                        a2.b = parseLong;
                                        a2.d = parseInt;
                                        a2.e = parseBoolean;
                                        a2.f = parseBoolean2;
                                        a2.g = parseBoolean3;
                                        a2.h = parseBoolean4;
                                        a2.i = queryParameter2;
                                        a2.k = x;
                                        a2.l = parseBoolean5;
                                        c = a2.c();
                                    } else if (arymVar == arym.FREE_NAV) {
                                        crfn b = crfn.b((asbz) crfo.c(bwqvVar, asbz.class, data.getQueryParameter("fn")));
                                        b.b = parseLong;
                                        c = b.c();
                                    } else {
                                        String valueOf = String.valueOf(arymVar);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                                        sb.append("Unknown mode: ");
                                        sb.append(valueOf);
                                        throw new IllegalStateException(sb.toString());
                                    }
                                    navigationService.c.e(c);
                                    return;
                                }
                            }
                            String valueOf2 = String.valueOf(queryParameter);
                            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Unknown mode key=".concat(valueOf2) : new String("Unknown mode key="));
                        } catch (RuntimeException e) {
                            bvoo.f(e);
                            NavigationService.a(navigationService.getApplicationContext(), true);
                        }
                    }
                }, bvrj.NAVIGATION_INTERNAL);
            } else {
                atxz atxzVar2 = arzsVar2.p;
                if (atxzVar2 instanceof atxq) {
                    arzsVar2.b(((atxq) atxzVar2).k(), true);
                }
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (this.l.a().a()) {
            bvoo.j(new RuntimeException("onTaskRemoved() called while in projected mode"));
        } else {
            a(this, true);
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(final Intent intent) {
        this.i.b(new Runnable(this, intent) { // from class: crgn
            private final NavigationService a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NavigationService navigationService = this.a;
                Intent intent2 = this.b;
                crgh a = navigationService.k.a();
                dbsk.s(intent2);
                dbsk.l(a.a.remove(new Intent.FilterComparison(intent2)));
                if (a.a.isEmpty()) {
                    a.b.d(null);
                }
            }
        }, bvrj.NAVIGATION_INTERNAL);
        return true;
    }
}
