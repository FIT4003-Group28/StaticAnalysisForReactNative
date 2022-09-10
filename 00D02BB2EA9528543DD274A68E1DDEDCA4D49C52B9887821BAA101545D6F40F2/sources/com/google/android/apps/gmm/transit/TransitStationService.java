package com.google.android.apps.gmm.transit;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.transit.TransitStationService;
import com.google.android.filament.R;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TransitStationService extends BroadcastReceiver {
    public static final String a = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_SETUP");
    public static final String b = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".DEBUG_ACTION_SHOW_NOTIFICATION");
    public static final String c = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_REREGISTER_GEOFENCES");
    public static final String d = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_NOTIFICATION_REFRESH");
    public static final String e = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_TURN_OFF_ELSA");
    public static final String f = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_PASSIVE_ASSIST_SUCCEEDED");
    public static final String g = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_NOTIFICATION_CLICK");
    public static final String h = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_NOTIFICATION_DISMISS");
    public static final String i = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_STATION_NEARBY");
    public static final String j = String.valueOf(TransitStationService.class.getCanonicalName()).concat(".ACTION_STATION_UPDATE");
    public static final long k = TimeUnit.MINUTES.toMillis(1);
    public static final akqq l = new akqq(dcyn.a, dcyn.a);
    public bytn A;
    public bytx B;
    public Application C;
    public bvrb D;
    public byvr E;
    public byvs F;
    public bytz G;
    public btrm H;
    public bytd I;
    public byuu J;
    public AlarmManager K;
    public byuf L;
    public byue M;
    public bytg N;
    public byuk O;
    public bysw P;
    public bytw Q;
    public byty R;
    public byui S;
    public byuz T;
    public bmpi U;
    public byuj V;
    public byun W;
    public byub X;
    public byum Y;
    public cjnx Z;
    public dxio<akfa> aa;
    public byuo ab;
    public byva ac;
    public volatile boolean m;
    public volatile boolean n;
    public bytb o;
    public bytb p;
    public btvo q;
    public cqat r;
    public bvrv s;
    public ckcw t;
    public bysv u;
    public bytc v;
    public byud w;
    public gdo x;
    public bvjj y;
    public auhi z;

    public static akqq a(Intent intent) {
        return new akqq(intent.getDoubleExtra("EXTRA_STATION_LATITUDE", dcyn.a), intent.getDoubleExtra("EXTRA_STATION_LONGITUDE", dcyn.a));
    }

    public static Intent k(String str, Context context, String str2, String str3, String str4, boolean z, boolean z2) {
        return byvv.a(str, context, TransitStationService.class).putExtra("EXTRA_TRANSIT_STATION_FEATURE_ID", str4).putExtra("EXTRA_TRANSIT_STATION_NAME", str3).putExtra("EXTRA_TRANSIT_STATION_LOCALE", str2).putExtra("EXTRA_IS_REALTIME_INFORMATION_AVAILABLE", z).putExtra("EXTRA_IS_ALERT_INFORMATION_AVAILABLE", z2);
    }

    public static void p(Context context) {
        context.sendBroadcast(new Intent(a, Uri.EMPTY, context, TransitStationService.class));
    }

    public static void r(Context context, int i2) {
        Intent intent = new Intent(c, Uri.EMPTY, context, TransitStationService.class);
        intent.putExtra("EXTRA_REREGISTER_TRIGGER", i2 != 2 ? "LOGIN_CHANGE" : "LOCATION_HISTORY_CHANGE");
        context.sendBroadcast(intent);
    }

    private final boolean s() {
        return !i().E;
    }

    private final boolean t() {
        return i().aa;
    }

    public final boolean b() {
        return this.P.a() || this.W.a();
    }

    public final void c() {
        deha.q(deew.g(this.aa.a().l(), new defg(this) { // from class: byvj
            private final TransitStationService a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                TransitStationService transitStationService = this.a;
                Void r3 = (Void) obj;
                if (transitStationService.aa.a().j() == null) {
                    return deha.a(dbpy.a);
                }
                cjnx cjnxVar = transitStationService.Z;
                btlu j2 = transitStationService.aa.a().j();
                dbsk.s(j2);
                return deew.h(cjnxVar.e(j2), byvk.a, dege.a);
            }
        }, this.E.a), new byvp(this), this.E.a);
    }

    public final void d(final Context context, akqq akqqVar, String str) {
        bytz bytzVar = this.G;
        byua a2 = bytzVar.b.a(akqqVar);
        if (a2.equals(byua.NEW_YORK)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_viewInflaterClass);
        } else if (a2.equals(byua.LONDON)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowActionBar);
        } else if (a2.equals(byua.NEW_DELHI)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowActionBarOverlay);
        } else if (a2.equals(byua.TOKYO)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowActionModeOverlay);
        } else if (a2.equals(byua.SYDNEY)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowFixedHeightMajor);
        } else if (a2.equals(byua.JAKARTA)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowFixedHeightMinor);
        } else if (a2.equals(byua.RIO_DE_JANEIRO)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowFixedWidthMajor);
        }
        this.N.b();
        if (i().ad) {
            byuz byuzVar = this.T;
            bmoq bmoqVar = new bmoq(this.aa, new dxio(this) { // from class: byvh
                private final TransitStationService a;

                {
                    this.a = this;
                }

                @Override // defpackage.dxio
                public final Object a() {
                    return this.a.t;
                }
            }, this.U.a(new bmpg(context) { // from class: byvi
                private final Context a;

                {
                    this.a = context;
                }

                @Override // defpackage.bmpg
                public final coqh a() {
                    Context context2 = this.a;
                    String str2 = TransitStationService.a;
                    return coqk.b(context2);
                }
            }));
            ania a3 = byuzVar.a.a();
            byuz.a(a3, 1);
            angp a4 = byuzVar.b.a();
            byuz.a(a4, 2);
            byth a5 = byuzVar.c.a();
            byuz.a(a5, 3);
            Executor a6 = byuzVar.d.a();
            byuz.a(a6, 4);
            bytc a7 = byuzVar.e.a();
            byuz.a(a7, 5);
            byuz.a(bmoqVar, 6);
            byuy byuyVar = new byuy(a3, a4, a5, a6, a7, bmoqVar);
            if (byuyVar.a.a()) {
                byuyVar.f.a(250);
                if (byuyVar.c.a() == -1) {
                    byuyVar.f.a(247);
                }
                eapd eapdVar = new eapd(byuyVar.c.a());
                dnqg bZ = dnqh.p.bZ();
                int i2 = ddfv.j.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.a |= 64;
                dnqhVar.g = i2;
                dnqh bK = bZ.bK();
                dvya bZ2 = dvyw.bv.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dvyw dvywVar = (dvyw) bZ2.b;
                str.getClass();
                dvywVar.a |= 4;
                dvywVar.g = str;
                dvywVar.b |= 1073741824;
                dvywVar.an = false;
                dvyw bK2 = bZ2.bK();
                angp angpVar = byuyVar.b;
                dnhy bZ3 = dnhz.e.bZ();
                long j2 = eapdVar.a;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnhz dnhzVar = (dnhz) bZ3.b;
                dnhzVar.a |= 4;
                dnhzVar.d = j2;
                angpVar.j(bK2, bZ3.bK(), bK, dnqq.f, dbsg.i(new byux(byuyVar, eapdVar)));
            } else {
                byuyVar.f.a(246);
            }
        }
        this.M.b();
    }

    public final void e(akqq akqqVar) {
        bytz bytzVar = this.G;
        byua a2 = bytzVar.b.a(akqqVar);
        if (a2.equals(byua.NEW_YORK)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowFixedWidthMinor);
        } else if (a2.equals(byua.LONDON)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowMinWidthMajor);
        } else if (a2.equals(byua.NEW_DELHI)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowMinWidthMinor);
        } else if (a2.equals(byua.TOKYO)) {
            bytzVar.a.a(R.styleable.AppCompatTheme_windowNoTitle);
        } else if (a2.equals(byua.SYDNEY)) {
            bytzVar.a.a(127);
        } else if (a2.equals(byua.JAKARTA)) {
            bytzVar.a.a(128);
        } else if (a2.equals(byua.RIO_DE_JANEIRO)) {
            bytzVar.a.a(129);
        }
        this.N.b();
        this.M.b();
        this.M.a();
    }

    public final void f() {
        this.v.a(57);
        if (!this.O.a()) {
            return;
        }
        byuk byukVar = this.O;
        PendingIntent b2 = this.F.b(j, 134217728);
        copm copmVar = byukVar.b;
        GoogleApiClient googleApiClient = byukVar.a;
        dbsk.s(googleApiClient);
        cnwc.n(b2, "callbackIntent == null");
        Status status = (Status) googleApiClient.execute(new copj(cool.d, googleApiClient, b2)).f();
        if (!status.d()) {
            String str = status.h;
            this.v.a(10);
            return;
        }
        m();
    }

    public final void g(String str, akqq akqqVar, float f2, @dzsi bzii bziiVar, boolean z) {
        try {
            bzib bZ = bzig.i.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bzig bzigVar = (bzig) bZ.b;
            str.getClass();
            bzigVar.a |= 1;
            bzigVar.b = str;
            dpum h2 = akqqVar.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bzig bzigVar2 = (bzig) bZ.b;
            h2.getClass();
            bzigVar2.c = h2;
            int i2 = bzigVar2.a | 4;
            bzigVar2.a = i2;
            int i3 = i2 | 8;
            bzigVar2.a = i3;
            bzigVar2.d = f2;
            int i4 = i3 | 64;
            bzigVar2.a = i4;
            bzigVar2.g = z;
            if (bziiVar != null) {
                bziiVar.getClass();
                bzigVar2.e = bziiVar;
                bzigVar2.a = i4 | 16;
            }
            String valueOf = String.valueOf(akqqVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Notification scheduled ");
            sb.append(valueOf);
            sb.toString();
            this.v.a(225);
            h(bZ.bK(), Long.MIN_VALUE);
            akqi a2 = this.S.a(str);
            if (a2 == null) {
                this.v.a(243);
                return;
            }
            this.I.b(a2.o(), this.r.e());
            f();
        } catch (Throwable th) {
            this.v.a(87);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.bzig r33, long r34) {
        /*
            Method dump skipped, instructions count: 2228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.transit.TransitStationService.h(bzig, long):void");
    }

    public final dkqz i() {
        dkqz dkqzVar = this.q.getNotificationsParameters().m;
        return dkqzVar == null ? dkqz.ap : dkqzVar;
    }

    public final void j(boolean z) {
        augc augcVar;
        if (this.M.i.c() != null) {
            n();
            this.v.a(235);
            return;
        }
        bzil b2 = this.L.b();
        if (b2 == null) {
            this.v.a(180);
            return;
        }
        bzhr bzhrVar = b2.b;
        if (bzhrVar == null) {
            bzhrVar = bzhr.e;
        }
        bzjj bzjjVar = bzhrVar.b;
        if (bzjjVar == null) {
            bzjjVar = bzjj.i;
        }
        bzig bzigVar = b2.c;
        if (bzigVar == null) {
            bzigVar = bzig.i;
        }
        if (s() && this.m) {
            this.v.a(161);
        } else if (t() && this.n) {
            this.v.a(227);
        } else if (this.o.a(bzjjVar.c, this.r.b())) {
            this.v.a(48);
        } else if (!this.I.c(bzjjVar.c)) {
            this.v.a(177);
        } else if (this.I.d()) {
            this.v.a(178);
        } else {
            if (!z) {
                this.v.a(81);
                dkhd dkhdVar = i().a;
                if (dkhdVar == null) {
                    dkhdVar = dkhd.h;
                }
                if (dkhdVar.c) {
                    this.v.a(82);
                    return;
                }
            }
            if (this.P.e().S) {
                byue byueVar = this.M;
                dpum dpumVar = bzigVar.c;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                akqq f2 = akqq.f(dpumVar);
                boolean z2 = this.P.e().V;
                boolean z3 = bzigVar.g;
                bzhr bzhrVar2 = b2.b;
                if (bzhrVar2 == null) {
                    bzhrVar2 = bzhr.e;
                }
                bzjj bzjjVar2 = bzhrVar2.b;
                if (bzjjVar2 == null) {
                    bzjjVar2 = bzjj.i;
                }
                bzjj bzjjVar3 = bzjjVar2;
                byud byudVar = byueVar.f;
                ddzg f3 = byud.f(b2, false, false, 4);
                byuc byucVar = byueVar.d;
                Intent c2 = byueVar.c(bzjjVar3);
                Intent d2 = byueVar.d(bzjjVar3, false, false);
                bzig bzigVar2 = b2.c;
                if (bzigVar2 == null) {
                    bzigVar2 = bzig.i;
                }
                augc a2 = byucVar.a(bzjjVar3, c2, d2, z2, false, f3, z, bzigVar2.h);
                if (a2 == null) {
                    augcVar = null;
                } else {
                    a2.f = byucVar.a.getString(com.google.android.apps.maps.R.string.SIMPLE_NOTIFICATION_TITLE, new Object[]{bzjjVar3.b});
                    a2.g = byucVar.a.getString(com.google.android.apps.maps.R.string.SIMPLE_NOTIFICATION_TEXT);
                    augcVar = a2;
                }
                if (augcVar == null || byueVar.e.j(augcVar.a()).b != auhh.SHOWN) {
                    return;
                }
                byueVar.f.e(z, false, false, 4);
                byueVar.b.a(bzjjVar3, f2, false, false, byueVar.c.getApplicationInfo().loadLabel(byueVar.c.getPackageManager()), z3);
                return;
            }
            byue byueVar2 = this.M;
            dpum dpumVar2 = bzigVar.c;
            if (dpumVar2 == null) {
                dpumVar2 = dpum.d;
            }
            akqq f4 = akqq.f(dpumVar2);
            boolean z4 = i().V;
            boolean z5 = this.P.e().ai && new Random().nextInt(100) < this.P.e().aj;
            boolean z6 = bzigVar.g;
            bzhr bzhrVar3 = b2.b;
            if (bzhrVar3 == null) {
                bzhrVar3 = bzhr.e;
            }
            bzjj bzjjVar4 = bzhrVar3.b;
            if (bzjjVar4 == null) {
                bzjjVar4 = bzjj.i;
            }
            bzjj bzjjVar5 = bzjjVar4;
            try {
                byut byutVar = byueVar2.a;
                dwoj tripAssistanceNotificationsParameters = byueVar2.g.getTripAssistanceNotificationsParameters();
                bzlf c3 = bzlf.c(tripAssistanceNotificationsParameters.c, tripAssistanceNotificationsParameters.d);
                long seconds = TimeUnit.MILLISECONDS.toSeconds(byutVar.c.b());
                dcdc<bzlh> k2 = bzkv.k(seconds, bzjjVar5);
                bzks bzksVar = byutVar.a;
                dbpy<Object> dbpyVar = dbpy.a;
                dkqz dkqzVar = byutVar.d.getNotificationsParameters().m;
                if (dkqzVar == null) {
                    dkqzVar = dkqz.ap;
                }
                bzkq l2 = bzkr.l();
                l2.b(byutVar.e.e().t);
                l2.h(true);
                l2.e(dkqzVar.O);
                l2.f(dkqzVar.x);
                l2.g(byutVar.d.getTransitPagesParameters().i);
                l2.d();
                l2.i(false);
                l2.c();
                l2.j(1);
                ((bzjy) l2).a = c3;
                ((bzjy) l2).b = byutVar.b.a();
                bzkj a3 = bzksVar.a(bzjjVar5, k2, seconds, dbpyVar, 2131232602, l2.a(), 0L);
                dkqz dkqzVar2 = byueVar2.g.getNotificationsParameters().m;
                if (dkqzVar2 == null) {
                    dkqzVar2 = dkqz.ap;
                }
                if (dkqzVar2.L) {
                    bzjw bzjwVar = (bzjw) a3;
                    if (bzjwVar.e == 3 && !bzjwVar.d) {
                        byueVar2.h.a(205);
                        return;
                    }
                }
                byud byudVar2 = byueVar2.f;
                bzjw bzjwVar2 = (bzjw) a3;
                ddzg f5 = byud.f(b2, bzjwVar2.c, bzjwVar2.d, bzjwVar2.e);
                bzig bzigVar3 = b2.c;
                if (bzigVar3 == null) {
                    bzigVar3 = bzig.i;
                }
                long j2 = bzigVar3.h;
                byuc byucVar2 = byueVar2.d;
                RemoteViews remoteViews = bzjwVar2.a;
                RemoteViews remoteViews2 = bzjwVar2.b;
                augc a4 = byucVar2.a(bzjjVar5, byueVar2.c(bzjjVar5), byueVar2.d(bzjjVar5, bzjwVar2.c, bzjwVar2.d), z4, z5, f5, z, j2);
                if (a4 == null) {
                    a4 = null;
                } else {
                    a4.k(remoteViews, new auoc[0]);
                    a4.i(remoteViews2, new auoc[0]);
                    a4.s = new ic();
                    a4.K(false);
                }
                if (a4 == null || byueVar2.e.j(a4.a()).b != auhh.SHOWN) {
                    return;
                }
                byueVar2.f.e(z, bzjwVar2.c, bzjwVar2.d, bzjwVar2.e);
                byueVar2.b.a(bzjjVar5, f4, bzjwVar2.c, bzjwVar2.d, byueVar2.c.getApplicationInfo().loadLabel(byueVar2.c.getPackageManager()), z6);
            } catch (InterruptedException | ExecutionException unused) {
                byueVar2.h.a(8);
            }
        }
    }

    public final void l() {
        this.v.a(70);
        AlarmManager alarmManager = this.K;
        String str = d;
        Application application = this.C;
        alarmManager.cancel(PendingIntent.getBroadcast(application, 0, byvv.a(str, application, TransitStationService.class), 134217728));
    }

    public final void m() {
        this.K.cancel(this.F.b(e, 268435456));
    }

    public final void n() {
        o();
        this.W.c();
    }

    public final void o() {
        this.v.a(71);
        l();
        this.I.a(this.r.e());
        this.M.a();
        this.M.b();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        dxiq.c(this, context);
        this.t.f(ckhc.TRANSIT_STATION_SERVICE);
        this.x.b();
        if (s() || t()) {
            btrm btrmVar = this.H;
            dceq a2 = dcet.a();
            a2.b(crhp.class, new byvt(0, crhp.class, this, bvrj.UI_THREAD));
            a2.b(byze.class, new byvt(1, byze.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a2.a());
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        byvr byvrVar = this.E;
        byvrVar.a.execute(new Runnable(this, context, intent, goAsync) { // from class: byvg
            private final TransitStationService a;
            private final Context b;
            private final Intent c;
            private final BroadcastReceiver.PendingResult d;

            {
                this.a = this;
                this.b = context;
                this.c = intent;
                this.d = goAsync;
            }

            /* JADX WARN: Removed duplicated region for block: B:159:0x0445 A[Catch: all -> 0x0bb0, SecurityException -> 0x0bb4, TryCatch #12 {SecurityException -> 0x0bb4, all -> 0x0bb0, blocks: (B:10:0x0032, B:12:0x003e, B:15:0x0048, B:17:0x0057, B:19:0x005f, B:21:0x0067, B:22:0x007a, B:26:0x0086, B:28:0x0092, B:29:0x0098, B:31:0x00a0, B:32:0x00a8, B:34:0x00b0, B:35:0x00c9, B:37:0x00d1, B:38:0x00df, B:40:0x00e7, B:41:0x00f9, B:43:0x0101, B:44:0x0113, B:227:0x060b, B:231:0x0617, B:233:0x0623, B:234:0x0646, B:236:0x064e, B:237:0x0671, B:239:0x0679, B:240:0x068d, B:242:0x0695, B:243:0x06a5, B:245:0x06ad, B:246:0x06c1, B:248:0x06c9, B:249:0x06d9, B:264:0x0780, B:267:0x078c, B:269:0x0798, B:271:0x07a7, B:273:0x07ab, B:274:0x07ad, B:276:0x07b3, B:278:0x07b7, B:279:0x07b9, B:281:0x07bd, B:282:0x07bf, B:284:0x07c3, B:285:0x07c5, B:252:0x06e3, B:254:0x06ef, B:255:0x0710, B:257:0x0718, B:258:0x072e, B:260:0x0736, B:261:0x0757, B:263:0x075f, B:47:0x011c, B:49:0x012a, B:51:0x0139, B:53:0x013f, B:55:0x0145, B:58:0x014c, B:61:0x0155, B:63:0x015f, B:64:0x0161, B:67:0x0171, B:68:0x017a, B:72:0x0196, B:78:0x01c5, B:82:0x01d2, B:84:0x01e3, B:87:0x01ef, B:89:0x020d, B:91:0x021c, B:93:0x023c, B:94:0x0241, B:98:0x024c, B:99:0x0264, B:100:0x0265, B:102:0x02ab, B:104:0x02b1, B:105:0x02bc, B:109:0x02f2, B:112:0x02fe, B:114:0x030d, B:115:0x0316, B:117:0x0322, B:118:0x032c, B:119:0x0335, B:123:0x0344, B:125:0x034d, B:127:0x035c, B:128:0x0365, B:130:0x036d, B:132:0x0375, B:134:0x037b, B:137:0x0383, B:140:0x038d, B:142:0x0399, B:144:0x03a7, B:145:0x03b4, B:146:0x03b8, B:148:0x03c7, B:149:0x03c9, B:151:0x03df, B:152:0x040e, B:154:0x041d, B:155:0x0422, B:157:0x0436, B:159:0x0445, B:161:0x0479, B:162:0x047b, B:164:0x0487, B:165:0x0489, B:167:0x04ad, B:168:0x04b6, B:170:0x04c2, B:172:0x04ca, B:173:0x04d3, B:175:0x04e8, B:176:0x04f1, B:178:0x04f9, B:179:0x0502, B:181:0x050a, B:184:0x0524, B:193:0x0592, B:188:0x0581, B:190:0x0585, B:194:0x05a2, B:196:0x05aa, B:223:0x05f4, B:219:0x05eb, B:220:0x05f0, B:224:0x05fe, B:226:0x0606, B:101:0x028b, B:69:0x0180, B:71:0x0188, B:74:0x019b, B:76:0x01a1, B:77:0x01a9), top: B:464:0x0032 }] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0171 A[Catch: all -> 0x0bb0, SecurityException -> 0x0bb4, TryCatch #12 {SecurityException -> 0x0bb4, all -> 0x0bb0, blocks: (B:10:0x0032, B:12:0x003e, B:15:0x0048, B:17:0x0057, B:19:0x005f, B:21:0x0067, B:22:0x007a, B:26:0x0086, B:28:0x0092, B:29:0x0098, B:31:0x00a0, B:32:0x00a8, B:34:0x00b0, B:35:0x00c9, B:37:0x00d1, B:38:0x00df, B:40:0x00e7, B:41:0x00f9, B:43:0x0101, B:44:0x0113, B:227:0x060b, B:231:0x0617, B:233:0x0623, B:234:0x0646, B:236:0x064e, B:237:0x0671, B:239:0x0679, B:240:0x068d, B:242:0x0695, B:243:0x06a5, B:245:0x06ad, B:246:0x06c1, B:248:0x06c9, B:249:0x06d9, B:264:0x0780, B:267:0x078c, B:269:0x0798, B:271:0x07a7, B:273:0x07ab, B:274:0x07ad, B:276:0x07b3, B:278:0x07b7, B:279:0x07b9, B:281:0x07bd, B:282:0x07bf, B:284:0x07c3, B:285:0x07c5, B:252:0x06e3, B:254:0x06ef, B:255:0x0710, B:257:0x0718, B:258:0x072e, B:260:0x0736, B:261:0x0757, B:263:0x075f, B:47:0x011c, B:49:0x012a, B:51:0x0139, B:53:0x013f, B:55:0x0145, B:58:0x014c, B:61:0x0155, B:63:0x015f, B:64:0x0161, B:67:0x0171, B:68:0x017a, B:72:0x0196, B:78:0x01c5, B:82:0x01d2, B:84:0x01e3, B:87:0x01ef, B:89:0x020d, B:91:0x021c, B:93:0x023c, B:94:0x0241, B:98:0x024c, B:99:0x0264, B:100:0x0265, B:102:0x02ab, B:104:0x02b1, B:105:0x02bc, B:109:0x02f2, B:112:0x02fe, B:114:0x030d, B:115:0x0316, B:117:0x0322, B:118:0x032c, B:119:0x0335, B:123:0x0344, B:125:0x034d, B:127:0x035c, B:128:0x0365, B:130:0x036d, B:132:0x0375, B:134:0x037b, B:137:0x0383, B:140:0x038d, B:142:0x0399, B:144:0x03a7, B:145:0x03b4, B:146:0x03b8, B:148:0x03c7, B:149:0x03c9, B:151:0x03df, B:152:0x040e, B:154:0x041d, B:155:0x0422, B:157:0x0436, B:159:0x0445, B:161:0x0479, B:162:0x047b, B:164:0x0487, B:165:0x0489, B:167:0x04ad, B:168:0x04b6, B:170:0x04c2, B:172:0x04ca, B:173:0x04d3, B:175:0x04e8, B:176:0x04f1, B:178:0x04f9, B:179:0x0502, B:181:0x050a, B:184:0x0524, B:193:0x0592, B:188:0x0581, B:190:0x0585, B:194:0x05a2, B:196:0x05aa, B:223:0x05f4, B:219:0x05eb, B:220:0x05f0, B:224:0x05fe, B:226:0x0606, B:101:0x028b, B:69:0x0180, B:71:0x0188, B:74:0x019b, B:76:0x01a1, B:77:0x01a9), top: B:464:0x0032 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x017a A[Catch: all -> 0x0bb0, SecurityException -> 0x0bb4, TRY_LEAVE, TryCatch #12 {SecurityException -> 0x0bb4, all -> 0x0bb0, blocks: (B:10:0x0032, B:12:0x003e, B:15:0x0048, B:17:0x0057, B:19:0x005f, B:21:0x0067, B:22:0x007a, B:26:0x0086, B:28:0x0092, B:29:0x0098, B:31:0x00a0, B:32:0x00a8, B:34:0x00b0, B:35:0x00c9, B:37:0x00d1, B:38:0x00df, B:40:0x00e7, B:41:0x00f9, B:43:0x0101, B:44:0x0113, B:227:0x060b, B:231:0x0617, B:233:0x0623, B:234:0x0646, B:236:0x064e, B:237:0x0671, B:239:0x0679, B:240:0x068d, B:242:0x0695, B:243:0x06a5, B:245:0x06ad, B:246:0x06c1, B:248:0x06c9, B:249:0x06d9, B:264:0x0780, B:267:0x078c, B:269:0x0798, B:271:0x07a7, B:273:0x07ab, B:274:0x07ad, B:276:0x07b3, B:278:0x07b7, B:279:0x07b9, B:281:0x07bd, B:282:0x07bf, B:284:0x07c3, B:285:0x07c5, B:252:0x06e3, B:254:0x06ef, B:255:0x0710, B:257:0x0718, B:258:0x072e, B:260:0x0736, B:261:0x0757, B:263:0x075f, B:47:0x011c, B:49:0x012a, B:51:0x0139, B:53:0x013f, B:55:0x0145, B:58:0x014c, B:61:0x0155, B:63:0x015f, B:64:0x0161, B:67:0x0171, B:68:0x017a, B:72:0x0196, B:78:0x01c5, B:82:0x01d2, B:84:0x01e3, B:87:0x01ef, B:89:0x020d, B:91:0x021c, B:93:0x023c, B:94:0x0241, B:98:0x024c, B:99:0x0264, B:100:0x0265, B:102:0x02ab, B:104:0x02b1, B:105:0x02bc, B:109:0x02f2, B:112:0x02fe, B:114:0x030d, B:115:0x0316, B:117:0x0322, B:118:0x032c, B:119:0x0335, B:123:0x0344, B:125:0x034d, B:127:0x035c, B:128:0x0365, B:130:0x036d, B:132:0x0375, B:134:0x037b, B:137:0x0383, B:140:0x038d, B:142:0x0399, B:144:0x03a7, B:145:0x03b4, B:146:0x03b8, B:148:0x03c7, B:149:0x03c9, B:151:0x03df, B:152:0x040e, B:154:0x041d, B:155:0x0422, B:157:0x0436, B:159:0x0445, B:161:0x0479, B:162:0x047b, B:164:0x0487, B:165:0x0489, B:167:0x04ad, B:168:0x04b6, B:170:0x04c2, B:172:0x04ca, B:173:0x04d3, B:175:0x04e8, B:176:0x04f1, B:178:0x04f9, B:179:0x0502, B:181:0x050a, B:184:0x0524, B:193:0x0592, B:188:0x0581, B:190:0x0585, B:194:0x05a2, B:196:0x05aa, B:223:0x05f4, B:219:0x05eb, B:220:0x05f0, B:224:0x05fe, B:226:0x0606, B:101:0x028b, B:69:0x0180, B:71:0x0188, B:74:0x019b, B:76:0x01a1, B:77:0x01a9), top: B:464:0x0032 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 3078
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.byvg.run():void");
            }
        });
    }

    public final /* synthetic */ void q(BroadcastReceiver.PendingResult pendingResult) {
        this.x.e();
        this.t.g(ckhc.TRANSIT_STATION_SERVICE);
        this.s.a();
        if (s() || t()) {
            bvrj.UI_THREAD.c();
            this.H.a(this);
        }
        pendingResult.finish();
    }
}
