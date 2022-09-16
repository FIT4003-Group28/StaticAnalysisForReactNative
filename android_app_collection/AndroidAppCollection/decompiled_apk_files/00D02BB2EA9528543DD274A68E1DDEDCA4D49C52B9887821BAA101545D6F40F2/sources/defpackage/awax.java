package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.apps.maps.R;
import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: awax  reason: default package */
/* loaded from: classes3.dex */
public final class awax implements awar {
    public static final String a = String.valueOf(awar.class.getCanonicalName()).concat(".ACTION_REMOVE_DOWNLOAD_NOTIFICATION");
    public static final String b = String.valueOf(awar.class.getCanonicalName()).concat(".ACTION_REMOVE_DOWNLOAD_SUCCESS_NOTIFICATION");
    static final cjtd c = cjtd.a(dtxx.bn);
    static final long d = TimeUnit.HOURS.toMillis(1);
    public final Application e;
    public final dxio<auhi> f;
    private final AlarmManager k;
    private final ckcw l;
    private final dxio<auhj> m;
    private final dxio<ausy> n;
    private final aukk o;
    private final cjqq p;
    private final cjqy q;
    @dzsi
    private final avzh r;
    public final crzd<Runnable> g = new crzd<>();
    public final AtomicLong h = new AtomicLong(0);
    @dzsi
    int j = 0;
    @dzsi
    cjql i = null;

    public awax(Application application, ckcw ckcwVar, cjqq cjqqVar, cjqy cjqyVar, aukk aukkVar, dxio<auhi> dxioVar, dxio<auhj> dxioVar2, dxio<ausy> dxioVar3, @dzsi avzh avzhVar) {
        this.e = application;
        this.l = ckcwVar;
        this.k = (AlarmManager) application.getSystemService("alarm");
        this.p = cjqqVar;
        this.q = cjqyVar;
        this.o = aukkVar;
        this.f = dxioVar;
        this.m = dxioVar2;
        this.n = dxioVar3;
        this.r = avzhVar;
    }

    @dzsi
    private final augc K() {
        dpyv dpyvVar = dpyv.OFFLINE_DOWNLOAD;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.E(avst.b(this.e).setFlags(268435456), auhw.ACTIVITY);
        b2.m(new Intent(a), auhw.BROADCAST);
        b2.y(-1);
        b2.I();
        b2.s(true);
        b2.O = true;
        return b2;
    }

    @dzsi
    private final augc L(boolean z) {
        dpyv dpyvVar;
        if (z) {
            dpyvVar = dpyv.OFFLINE_DOWNLOAD_SUCCESS;
        } else {
            dpyvVar = dpyv.OFFLINE_DOWNLOAD_FAILED;
        }
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.E(avst.b(this.e).setFlags(268435456), auhw.ACTIVITY);
        b2.y(-1);
        b2.I();
        b2.s(true);
        b2.r(false);
        b2.C(true);
        return b2;
    }

    private final synchronized void M() {
        Intent intent = new Intent(b);
        intent.putExtra("DownloadSuccessNotificationId", this.h.incrementAndGet());
        this.k.set(3, SystemClock.elapsedRealtime() + d, PendingIntent.getBroadcast(this.e, 0, intent, 134217728));
    }

    private final synchronized void N() {
        this.j = 0;
    }

    private final cjql O() {
        return this.p.g().c(c);
    }

    private final auoe P(int i, ddcu ddcuVar) {
        Intent flags = avst.b(this.e).setFlags(268435456);
        auod k = auoe.k(ddcuVar);
        ((auoa) k).e = 1;
        k.c(2131232661);
        k.g(this.e.getString(i));
        k.j(flags, auhw.ACTIVITY);
        k.f(true);
        return k.h();
    }

    @dzsi
    private final aujb Q(dpyv dpyvVar) {
        try {
            aujb e = this.n.a().e(dpyvVar.dm);
            dbsk.s(e);
            return e;
        } catch (NullPointerException e2) {
            dpyvVar.name();
            bvoo.j(e2);
            return null;
        }
    }

    private final synchronized void R(int i) {
        if (i != this.j) {
            ((ckco) this.l.a(ckia.a)).a(i - 1);
            this.j = i;
        }
    }

    @dzsi
    private final auhk S(int i, int i2, dpyv dpyvVar, ddcu ddcuVar, int i3, int i4) {
        Intent flags = avst.b(this.e).setFlags(268435456);
        auod k = auoe.k(ddcuVar);
        ((auoa) k).e = 1;
        k.c(2131232661);
        k.g(this.e.getString(i3));
        k.j(flags, auhw.ACTIVITY);
        k.f(true);
        return U(i2, i, dpyvVar, i4, k.h());
    }

    @dzsi
    private final auhk T(int i, int i2, dpyv dpyvVar, int i3) {
        return U(i, i2, dpyvVar, i3, null);
    }

    @dzsi
    private final auhk U(int i, int i2, dpyv dpyvVar, int i3, @dzsi auoe auoeVar) {
        Intent flags = avst.b(this.e).setFlags(268435456);
        String string = this.e.getString(i2);
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.y(-1);
        b2.s(true);
        ia iaVar = new ia();
        iaVar.e(string);
        b2.s = iaVar;
        b2.C(true);
        b2.f = this.e.getString(i);
        b2.g = string;
        b2.E(flags, auhw.ACTIVITY);
        if (auoeVar != null) {
            b2.B(auoeVar);
        }
        auhk j = this.f.a().j(b2.a());
        R(i3);
        return j;
    }

    @Override // defpackage.awar
    @dzsi
    public final void A(akqs akqsVar, String str) {
        Intent data = afft.a(this.e).setAction("android.intent.action.VIEW").setFlags(268435456).setData(afhl.b(this.e, akqsVar));
        String string = this.e.getString(R.string.OFFLINE_CURRENT_TRIP_TITLE);
        dpyv dpyvVar = dpyv.OFFLINE_CURRENT_TRIP;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.C(true);
        b2.f = string;
        b2.g = this.e.getString(R.string.OFFLINE_CURRENT_TRIP_CONTENT, new Object[]{str});
        b2.E(data, auhw.ACTIVITY);
        b2.a();
        this.f.a().j(b2.a());
        R(18);
    }

    @Override // defpackage.awar
    @dzsi
    public final void B() {
        Intent flags = avst.b(this.e).setFlags(268435456);
        dpyv dpyvVar = dpyv.OFFLINE_MUTLI_UPCOMING_TRIPS;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.C(true);
        b2.f = this.e.getString(R.string.OFFLINE_MULTI_UPCOMING_TRIPS_TITLE);
        b2.g = this.e.getString(R.string.OFFLINE_MULTI_UPCOMING_TRIPS_CONTENT);
        b2.E(flags, auhw.ACTIVITY);
        b2.a();
        this.f.a().j(b2.a());
        R(19);
    }

    @Override // defpackage.awar
    @dzsi
    public final synchronized void C() {
        avzh avzhVar = this.r;
        if (avzhVar == null) {
            return;
        }
        dltm a2 = avzhVar.a();
        if (a2 == null) {
            return;
        }
        Intent putExtra = avst.b(this.e).setFlags(268435456).putExtra("OfflineDownloadHomeAreaExtra", true);
        String string = this.e.getString(R.string.OFFLINE_ONBOARDING_NOTIFICATION_TEXT, new Object[]{a2.a});
        dpyv dpyvVar = dpyv.OFFLINE_ONBOARDING_PROMPT;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.y(-1);
        b2.s(true);
        ia iaVar = new ia();
        iaVar.e(string);
        b2.s = iaVar;
        b2.C(true);
        b2.f = this.e.getString(R.string.OFFLINE_ONBOADRING_ENABLE_AUTODOWNLOAD);
        b2.g = string;
        b2.E(putExtra, auhw.ACTIVITY);
        this.f.a().j(b2.a());
        R(13);
        this.i = O();
    }

    @Override // defpackage.awar
    @dzsi
    public final void D() {
        S(R.string.OFFLINE_MAP_TRIP_EXPIRED_NOTIFICATION_BODY, R.string.OFFLINE_MAP_TRIP_EXPIRATION_NOTIFICATION_TITLE, dpyv.OFFLINE_TRIP_REGION_EXPIRED, ddcu.R, R.string.OFFLINE_AUTODOWNLOAD_DIALOG_MANAGE_BUTTON, 22);
    }

    @Override // defpackage.awar
    @dzsi
    public final void E() {
        S(R.string.OFFLINE_MAP_TRIP_EXPIRING_SOON_NOTIFICATION_BODY, R.string.OFFLINE_MAP_TRIP_EXPIRATION_NOTIFICATION_TITLE, dpyv.OFFLINE_TRIP_REGION_EXPIRING_SOON, ddcu.S, R.string.OFFLINE_MENU_VIEW_AREA, 23);
    }

    @Override // defpackage.awar
    @dzsi
    public final void F() {
        S(R.string.OFFLINE_MAP_DISUSE_EXPIRED_NOTIFICATION_BODY, R.string.OFFLINE_MAP_DISUSE_EXPIRATION_NOTIFICATION_TITLE, dpyv.OFFLINE_UNUSED_REGION_EXPIRED, ddcu.T, R.string.OFFLINE_AUTODOWNLOAD_DIALOG_MANAGE_BUTTON, 24);
    }

    @Override // defpackage.awar
    @dzsi
    public final void G() {
        S(R.string.OFFLINE_MAP_DISUSE_EXPIRING_SOON_NOTIFICATION_BODY, R.string.OFFLINE_MAP_DISUSE_EXPIRATION_NOTIFICATION_TITLE, dpyv.OFFLINE_UNUSED_REGION_EXPIRING_SOON, ddcu.U, R.string.OFFLINE_MENU_VIEW_AREA, 25);
    }

    @Override // defpackage.awar
    @dzsi
    public final void H(dltm dltmVar) {
        String str = dltmVar.a;
        Intent putExtra = avst.b(this.e).setFlags(268435456).putExtra("OfflineRegionIdExtra", dltmVar.b.G()).putExtra("OfflinePreviewTripRegionsButtonExtra", true).putExtra("android.intent.extra.TEXT", str);
        Intent putExtra2 = avst.b(this.e).setFlags(268435456).putExtra("OfflineDownloadTripRegionsButtonExtra", true).putExtra("android.intent.extra.TEXT", str).putExtra("OfflineRegionIdExtra", dltmVar.b.G());
        dlug dlugVar = dltmVar.c;
        if (dlugVar == null) {
            dlugVar = dlug.c;
        }
        Intent putExtra3 = putExtra2.putExtra("RegionGeometryExtra", dlugVar.bS());
        dpyv dpyvVar = dpyv.OFFLINE_UPCOMING_TRIP;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        String string = this.e.getString(R.string.OFFLINE_UPCOMING_TRIP_CONTENT, new Object[]{str});
        b2.C(true);
        b2.f = this.e.getString(R.string.OFFLINE_UPCOMING_TRIP_TITLE);
        b2.g = string;
        b2.E(putExtra, auhw.ACTIVITY);
        auod k = auoe.k(ddcu.aa);
        ((auoa) k).e = 1;
        k.c(2131232775);
        k.g(this.e.getString(R.string.OFFLINE_PREVIEW_TRIP));
        k.j(putExtra, auhw.ACTIVITY);
        k.f(true);
        b2.B(k.h());
        auod k2 = auoe.k(ddcu.Z);
        ((auoa) k2).e = 2;
        k2.c(2131232692);
        k2.g(this.e.getString(R.string.OFFLINE_MENU_DOWNLOAD_AREA));
        k2.j(putExtra3, auhw.ACTIVITY);
        k2.f(true);
        b2.B(k2.h());
        this.f.a().j(b2.a());
        R(17);
    }

    @Override // defpackage.awar
    @dzsi
    public final void I(boolean z) {
        String string;
        if (z) {
            string = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_DOWNLOAD_COMPLETE_PLURAL);
        } else {
            string = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_DOWNLOAD_COMPLETE);
        }
        String string2 = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_DOWNLOAD_COMPLETE);
        augc L = L(true);
        if (L == null) {
            return;
        }
        L.f = string;
        L.g = string2;
        ia iaVar = new ia();
        iaVar.e(string2);
        L.s = iaVar;
        L.r(false);
        L.C(true);
        this.f.a().j(L.a());
        R(4);
        M();
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk J(int i, @dzsi String str, int i2, boolean z) {
        String string;
        String string2 = this.e.getString(true != z ? R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_UPDATING : R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_SAVING);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 17301539;
        if (i3 == 0) {
            if (str == null) {
                string = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_PROGRESS, new Object[]{Integer.valueOf(i)});
            } else {
                string = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_SINGLE_REGION_PROGRESS, new Object[]{str, Integer.valueOf(i)});
            }
            i4 = 17301633;
        } else if (i3 == 2) {
            string = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_WAITING_FOR_WIFI);
        } else {
            string = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_WAITING_FOR_DATA_CONNECTION);
        }
        Intent putExtra = avst.b(this.e).setFlags(268435456).putExtra("OfflineCancelUpdateExtra", true);
        augc K = K();
        if (K == null) {
            return null;
        }
        K.f = string2;
        K.g = string;
        K.w(i4);
        auod k = auoe.k(ddcu.N);
        ((auoa) k).e = 1;
        k.c(2131232205);
        k.g(this.e.getString(R.string.CANCEL_BUTTON));
        k.j(putExtra, auhw.ACTIVITY);
        k.f(true);
        K.B(k.h());
        if (i > 0) {
            K.t(i, false);
            ia iaVar = new ia();
            iaVar.e(string);
            K.s = iaVar;
        }
        auhk j = this.f.a().j(K.a());
        R(2);
        return j;
    }

    @Override // defpackage.awar
    public final void a(Runnable runnable, Executor executor) {
        this.g.a(runnable, executor);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk b() {
        augc L = L(false);
        if (L == null) {
            return null;
        }
        L.f = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_UPDATE_FAILED);
        L.g = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TEXT_DOWNLOAD_ERROR);
        L.w(2131232981);
        L.r(false);
        L.C(true);
        auhk j = this.f.a().j(L.a());
        R(3);
        return j;
    }

    @Override // defpackage.awar
    public final void c() {
        this.f.a().m(dpyv.OFFLINE_DOWNLOAD_FAILED.dm);
    }

    @Override // defpackage.awar
    public final void d() {
        this.f.a().m(dpyv.OFFLINE_DOWNLOAD_SUCCESS.dm);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk e() {
        augc K = K();
        if (K == null) {
            return null;
        }
        K.f = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_UPDATING);
        K.t = this.e.getString(R.string.OFFLINE_NOTIFICATION_CONTENT_TITLE_UPDATING);
        K.w(17301633);
        K.t(0, true);
        auhk j = this.f.a().j(K.a());
        R(1);
        return j;
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk f() {
        augc K = K();
        if (K == null) {
            return null;
        }
        K.f = this.e.getString(R.string.OFFLINE_AREA_CANCELING);
        K.w(17301633);
        K.t(0, true);
        return this.f.a().j(K.a());
    }

    @Override // defpackage.awar
    public final void g() {
        N();
        this.f.a().m(dpyv.OFFLINE_DOWNLOAD.dm);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk h() {
        String packageName = this.e.getPackageName();
        Intent flags = new Intent("android.intent.action.VIEW", cjxr.t(packageName)).setFlags(268435456);
        if (!afhl.a(this.e.getPackageManager(), flags)) {
            flags = new Intent("android.intent.action.VIEW", cjxr.s(packageName)).setFlags(268435456);
        }
        String string = this.e.getString(R.string.OFFLINE_APP_UPGRADE_CONTENT);
        dpyv dpyvVar = dpyv.OFFLINE_APP_UPGRADE;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.y(-1);
        b2.s(true);
        ia iaVar = new ia();
        iaVar.e(string);
        b2.s = iaVar;
        b2.w(2131232981);
        b2.C(true);
        b2.f = this.e.getString(R.string.OFFLINE_APP_UPGRADE_TITLE);
        b2.g = string;
        b2.E(flags, auhw.ACTIVITY_WITHOUT_TASK_AFFINITY);
        auod k = auoe.k(ddcu.H);
        ((auoa) k).e = 1;
        k.c(2131232692);
        k.g(this.e.getString(R.string.OFFLINE_APP_UPGRADE_ACTION));
        k.j(flags, auhw.ACTIVITY_WITHOUT_TASK_AFFINITY);
        k.f(true);
        b2.B(k.h());
        auhk j = this.f.a().j(b2.a());
        R(5);
        return j;
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk i() {
        return U(R.string.OFFLINE_BACKEND_CLEARED_NOTIFICATION_TITLE, R.string.OFFLINE_UPDATE_FAILURE_NOTIFICATION_BODY, dpyv.OFFLINE_BACKEND_CLEARED_ERROR, 7, P(R.string.SHOW_BUTTON, ddcu.I));
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk j(long j) {
        String string = this.e.getString(R.string.OFFLINE_REGION_EXPIRING_SOON_BODY);
        int[] iArr = {R.string.OFFLINE_REGION_EXPIRING_SUNDAY_TITLE, R.string.OFFLINE_REGION_EXPIRING_MONDAY_TITLE, R.string.OFFLINE_REGION_EXPIRING_TUESDAY_TITLE, R.string.OFFLINE_REGION_EXPIRING_WEDNESDAY_TITLE, R.string.OFFLINE_REGION_EXPIRING_THURSDAY_TITLE, R.string.OFFLINE_REGION_EXPIRING_FRIDAY_TITLE, R.string.OFFLINE_REGION_EXPIRING_SATURDAY_TITLE};
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        String string2 = this.e.getString(iArr[calendar.get(7) - 1]);
        Intent flags = avst.b(this.e).setFlags(268435456);
        Intent putExtra = avst.b(this.e).setFlags(268435456).putExtra("OfflineUpdateExpiringRegionsExtra", true);
        auod k = auoe.k(ddcu.Q);
        ((auoa) k).e = 1;
        k.c(2131232692);
        k.g(this.e.getString(R.string.OFFLINE_REGION_EXPIRING_UPDATE_ACTION));
        k.j(putExtra, auhw.ACTIVITY);
        k.f(true);
        auoe h = k.h();
        dpyv dpyvVar = dpyv.OFFLINE_REGION_EXPIRING_SOON;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.E(flags, auhw.ACTIVITY);
        b2.y(-1);
        b2.I();
        b2.s(true);
        b2.f = string2;
        b2.g = string;
        ia iaVar = new ia();
        iaVar.e(string);
        b2.s = iaVar;
        b2.C(true);
        b2.B(h);
        auhk j2 = this.f.a().j(b2.a());
        R(8);
        return j2;
    }

    @Override // defpackage.awar
    public final void k() {
        this.f.a().m(dpyv.OFFLINE_REGION_EXPIRING_SOON.dm);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk l() {
        return S(R.string.OFFLINE_MAP_EXPIRED_BODY, R.string.OFFLINE_MAP_EXPIRED_TITLE, dpyv.OFFLINE_MAP_EXPIRED, ddcu.P, R.string.OFFLINE_GO_TO_MANAGEMENT_ACTION, 14);
    }

    @Override // defpackage.awar
    public final void m() {
        this.f.a().m(dpyv.OFFLINE_MAP_EXPIRED.dm);
    }

    @Override // defpackage.awar
    public final void n() {
        this.f.a().m(dpyv.OFFLINE_TRIP_REGION_EXPIRED.dm);
    }

    @Override // defpackage.awar
    public final void o() {
        this.f.a().m(dpyv.OFFLINE_TRIP_REGION_EXPIRING_SOON.dm);
    }

    @Override // defpackage.awar
    public final void p() {
        this.f.a().m(dpyv.OFFLINE_UNUSED_REGION_EXPIRED.dm);
    }

    @Override // defpackage.awar
    public final void q() {
        this.f.a().m(dpyv.OFFLINE_UNUSED_REGION_EXPIRING_SOON.dm);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk r() {
        this.o.a(false);
        Intent flags = avst.b(this.e).setFlags(268435456);
        dpyv dpyvVar = dpyv.OFFLINE_DYNAMIC_PADDING;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.y(-1);
        b2.f = this.e.getString(avgp.OFFLINE_DYNAMIC_PADDING_FOREGROUND_NOTIFICATION_TITLE);
        b2.g = this.e.getString(avgp.OFFLINE_DYNAMIC_PADDING_FOREGROUND_NOTIFICATION_BODY);
        b2.E(flags, auhw.ACTIVITY);
        R(20);
        return this.f.a().j(b2.a());
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk s(boolean z) {
        int i;
        this.o.a(false);
        Intent flags = avst.b(this.e).setFlags(268435456);
        String string = this.e.getString(avgp.OFFLINE_DYNAMIC_PADDING_COVERAGE_LOST_NOTIFICATION_TITLE_PHONE);
        Application application = this.e;
        if (z) {
            i = avgp.OFFLINE_DYNAMIC_PADDING_COVERAGE_LOST_NOTIFICATION_BODY_PHONE;
        } else {
            i = avgp.OFFLINE_NO_DYNAMIC_PADDING_COVERAGE_LOST_NOTIFICATION_BODY_PHONE;
        }
        String string2 = application.getString(i);
        dpyv dpyvVar = dpyv.OFFLINE_COVERAGE_LOST;
        aujb Q = Q(dpyvVar);
        if (Q == null) {
            return null;
        }
        augc b2 = this.m.a().b(dpyvVar.dm, Q);
        b2.y(-1);
        b2.f = string;
        b2.g = string2;
        b2.E(flags, auhw.ACTIVITY);
        R(true != z ? 30 : 21);
        return this.f.a().j(b2.a());
    }

    @Override // defpackage.awar
    public final void t() {
        this.f.a().m(dpyv.OFFLINE_COVERAGE_LOST.dm);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk u(dluo dluoVar) {
        int a2 = dluq.a(dluoVar.a);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        return U(R.string.OFFLINE_REGION_GEOMETRIES_CHANGED_GENERIC_HEADER, i != 1 ? i != 2 ? i != 3 ? R.string.OFFLINE_REGION_GEOMETRIES_CHANGED_GENERIC : R.string.OFFLINE_LOCAL_REGION_SOURCES_GONE : R.string.OFFLINE_WORK_REGION_SOURCES_GONE : R.string.OFFLINE_HOME_REGION_SOURCES_GONE, dpyv.OFFLINE_REGION_SOURCES_GONE, 26, P(R.string.OFFLINE_GO_TO_MANAGEMENT_ACTION, ddcu.aE));
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk v() {
        return T(R.string.OFFLINE_RECOMMENDATION_FROM_GEOMETRY_CHANGE_HEADER, R.string.OFFLINE_REGION_RECREATED, dpyv.OFFLINE_RECOMMENDATION_FROM_GEOMETRY_CHANGE, 27);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk w() {
        return T(R.string.OFFLINE_REGION_REPLACED_FROM_GEOMETRY_CHANGE_HEADER, R.string.OFFLINE_REGION_REPLACED_FROM_GEOMETRY_CHANGE, dpyv.OFFLINE_REGION_REPLACED_FROM_GEOMETRY_CHANGE, 28);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk x() {
        return T(R.string.OFFLINE_REGION_REPLACED_FROM_GEOMETRY_CHANGE_HEADER, R.string.OFFLINE_REGION_PARTLY_REPLACED_FROM_GEOMETRY_CHANGE, dpyv.OFFLINE_REGION_PARTLY_REPLACED_FROM_GEOMETRY_CHANGE, 29);
    }

    @Override // defpackage.awar
    @dzsi
    public final auhk y() {
        return U(R.string.OFFLINE_REGION_GEOMETRIES_CHANGED_GENERIC_HEADER, R.string.OFFLINE_REGION_GEOMETRIES_CHANGED_GENERIC, dpyv.OFFLINE_RECOMMENDED_REGIONS_CHANGED, 9, P(R.string.OFFLINE_GO_TO_MANAGEMENT_ACTION, ddcu.X));
    }

    @Override // defpackage.awar
    public final void z() {
        this.f.a().m(dpyv.OFFLINE_ONBOARDING_PROMPT.dm);
        if (this.i == null) {
            this.i = O();
        }
        this.q.j(this.i, c);
    }
}
