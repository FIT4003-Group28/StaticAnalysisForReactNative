package com.google.android.apps.gmm.locationsharing.reporting;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.apps.gmm.locationsharing.reporting.ReporterService;
import com.google.android.apps.maps.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReporterService extends affo {
    public static final dcqe a = dcqe.c("com.google.android.apps.gmm.locationsharing.reporting.ReporterService");
    public ckcw b;
    public cqat c;
    public btvo d;
    public bvrv e;
    public akfa f;
    public auhi g;
    public auhj h;
    public ajzz i;
    public ajmq j;
    public bvrb k;
    public ajlw l;
    public Executor m;
    private final Object n = new Object();
    private dbsg<Integer> o = dbpy.a;

    public static void a(boolean z, String str, Object... objArr) {
        if (z) {
            bvoo.h(str, objArr);
        }
    }

    private final void c(List<String> list, boolean z) {
        if (!z) {
            ((ckco) this.b.a(ckgd.j)).a(ckgb.a(1));
        }
        String string = getResources().getString(R.string.UPDATING_YOUR_SHARED_LOCATION_NOTIFICATION_TITLE);
        dbsg i = dbsg.i(list.get(0));
        auhj auhjVar = this.h;
        int i2 = dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm;
        aujb h = this.g.h(dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm);
        dbsk.s(h);
        augc b = auhjVar.b(i2, h);
        b.w(2131232871);
        b.f = string;
        b.E(ahyr.m(this, ahwe.BURSTING_NOTIFICATION, i), auhw.ACTIVITY);
        b.y(0);
        b.I();
        b.s(true);
        b.H(0);
        b.e();
        b.v = -2;
        startForeground(dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm, this.g.j(b.a()).c);
    }

    public final void b(eapd eapdVar, dbsg<dqxv> dbsgVar, int i, boolean z) {
        synchronized (this.n) {
            dbsg<Integer> dbsgVar2 = this.o;
            Integer valueOf = Integer.valueOf(i);
            if (!dbsd.a(dbsgVar2, dbsg.i(valueOf))) {
                return;
            }
            if (z) {
                a(false, "%d - Failed to complete report in a timely manner", valueOf);
                if (dbsgVar.a() && (((dqxx) dbsgVar.b().b).a & 1) != 0) {
                    ajlw ajlwVar = this.l;
                    dbsk.s(ajlwVar);
                    ajlwVar.c(((dqxx) dbsgVar.b().b).b, 12);
                }
            } else {
                a(false, "%d - Report complete", valueOf);
            }
            if (dbsgVar.a()) {
                ((ckco) this.b.a(ckgd.u)).a((int) new eaow(eapdVar, new eapd(this.c.b())).b);
            }
            a(false, "%d - stopSelf", valueOf);
            this.o = dbpy.a;
            a(false, "%d - Removing notification", valueOf);
            stopForeground(true);
            this.g.o(dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm);
            stopSelf();
        }
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String valueOf = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(valueOf.length() != 0 ? "ReporterService #".concat(valueOf) : new String("ReporterService #"));
    }

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        bvrj.UI_THREAD.c();
        dxiq.b(this);
        this.b.f(ckhc.LOCATION_SHARING_REPORTER_SERVICE);
        a(false, "onCreate", new Object[0]);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        bvrj.UI_THREAD.c();
        a(false, "onDestroy", new Object[0]);
        synchronized (this.n) {
            this.o = dbpy.a;
            stopForeground(true);
            this.g.o(dpyv.LOCATION_SHARING_ONGOING_BURSTING.dm);
        }
        this.b.g(ckhc.LOCATION_SHARING_REPORTER_SERVICE);
        this.e.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(@dzsi Intent intent, int i, final int i2) {
        dbsg i3;
        bvrj.UI_THREAD.c();
        Integer valueOf = Integer.valueOf(i2);
        a(false, "%d - onStartCommand", valueOf);
        final eapd eapdVar = new eapd(this.c.b());
        if (intent == null) {
            stopSelf();
            a(true, "Null intent.", new Object[0]);
            return 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            stopSelf();
            a(true, "%d - Early exit. Empty intent.", valueOf);
            return 2;
        }
        boolean z = extras.getBoolean("extra_show_notification");
        byte[] byteArray = extras.getByteArray("extra_collection_parameters");
        if (byteArray == null) {
            stopSelf();
            a(true, "%d - Early exit. No collection parameters", valueOf);
            return 2;
        }
        byte[] byteArray2 = extras.getByteArray("extra_quality_requirements");
        if (byteArray2 == null) {
            stopSelf();
            a(true, "%d - Early exit. No quality requirements", valueOf);
            return 2;
        }
        byte[] byteArray3 = extras.getByteArray("extra_upload_parameters");
        if (byteArray3 == null) {
            stopSelf();
            a(true, "%d - Early exit. No upload parameters", valueOf);
            return 2;
        }
        ArrayList<Integer> integerArrayList = extras.getIntegerArrayList("extra_collection_reasons");
        if (integerArrayList == null) {
            stopSelf();
            a(true, "%d - Early exit. No collectionReasons", valueOf);
            return 2;
        }
        final ArrayList<String> stringArrayList = extras.getStringArrayList("extra_accounts");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            stopSelf();
            a(true, "%d - Early exit. No accounts", valueOf);
            return 2;
        }
        byte[] byteArray4 = extras.getByteArray("extra_active_ovenfresh");
        try {
            final dqyy bK = ((dqyx) dqyy.c.bZ().by(byteArray)).bK();
            try {
                final dqza bK2 = ((dqyz) dqza.c.bZ().by(byteArray2)).bK();
                try {
                    final dqzg bK3 = ((dqzf) dqzg.c.bZ().by(byteArray3)).bK();
                    if (byteArray4 != null) {
                        try {
                            i3 = dbsg.i((dqxv) dqxx.h.bZ().by(byteArray4));
                        } catch (dsrm unused) {
                            stopSelf();
                            a(true, "%d - Early exit. Corrupted active oven fresh parameter. %s", Integer.valueOf(i2), Arrays.toString(byteArray4));
                            return 2;
                        }
                    } else {
                        i3 = dbpy.a;
                    }
                    final dbsg dbsgVar = i3;
                    dcen N = dcep.N();
                    int size = integerArrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Integer num = integerArrayList.get(i4);
                        if (num != null) {
                            dqym b = dqym.b(num.intValue());
                            if (b != null) {
                                N.b(b);
                            } else {
                                stopSelf();
                                a(true, "%d - Early exit. Corrupted collectionReasons. %s", Integer.valueOf(i2), integerArrayList);
                                return 2;
                            }
                        } else {
                            stopSelf();
                            a(true, "%d - Early exit. Corrupted collectionReasons. %s", Integer.valueOf(i2), integerArrayList);
                            return 2;
                        }
                    }
                    final dcep f = N.f();
                    final dbpy<Object> dbpyVar = dbpy.a;
                    synchronized (this.n) {
                        if (this.o.a()) {
                            a(false, "%d - Incomplete action with id=%s. Not continuing", Integer.valueOf(i2), this.o.b());
                            if (z) {
                                c(stringArrayList, true);
                            }
                            if (dbsgVar.a() && (1 & ((dqxx) ((dqxv) dbsgVar.b()).b).a) != 0) {
                                ajlw ajlwVar = this.l;
                                dbsk.s(ajlwVar);
                                ajlwVar.c(((dqxx) ((dqxv) dbsgVar.b()).b).b, 7);
                            }
                            return 2;
                        }
                        Integer valueOf2 = Integer.valueOf(i2);
                        this.o = dbsg.i(valueOf2);
                        a(false, "%d - Successfully started", valueOf2);
                        if (dbsgVar.a() && (((dqxx) ((dqxv) dbsgVar.b()).b).a & 1) != 0) {
                            ajlw ajlwVar2 = this.l;
                            dbsk.s(ajlwVar2);
                            String str = ((dqxx) ((dqxv) dbsgVar.b()).b).b;
                            if (ajlwVar2.b()) {
                                cjqy cjqyVar = ajlwVar2.a;
                                cjtk[] cjtkVarArr = new cjtk[1];
                                cqat cqatVar = ajlwVar2.b;
                                ddpn a2 = ajlw.a(str);
                                ddpp ddppVar = ddpp.a;
                                if (a2.c) {
                                    a2.bF();
                                    a2.c = false;
                                }
                                ddpz ddpzVar = (ddpz) a2.b;
                                ddpz ddpzVar2 = ddpz.f;
                                ddppVar.getClass();
                                ddpzVar.c = ddppVar;
                                ddpzVar.b = 4;
                                cjtkVarArr[0] = new ajlv(cqatVar, a2, ajlwVar2.a.G());
                                cjqyVar.u(cjtkVarArr);
                            }
                        }
                        this.k.a(new Runnable(this, stringArrayList, eapdVar, dbsgVar, i2) { // from class: ajmr
                            private final ReporterService a;
                            private final ArrayList b;
                            private final eapd c;
                            private final dbsg d;
                            private final int e;

                            {
                                this.a = this;
                                this.b = stringArrayList;
                                this.c = eapdVar;
                                this.d = dbsgVar;
                                this.e = i2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ReporterService reporterService = this.a;
                                ArrayList arrayList = this.b;
                                eapd eapdVar2 = this.c;
                                dbsg<dqxv> dbsgVar2 = this.d;
                                int i5 = this.e;
                                String str2 = (String) arrayList.get(0);
                                reporterService.b(eapdVar2, dbsgVar2, i5, true);
                            }
                        }, bvrj.UI_THREAD, eaow.d(this.d.getLocationSharingParameters().h).b);
                        synchronized (this.n) {
                            if (!z) {
                                a(false, "%d - Not showing notification, not requested", valueOf2);
                            } else {
                                a(false, "%d - Showing notification", valueOf2);
                                c(stringArrayList, false);
                            }
                        }
                        if (dbsgVar.a()) {
                            ((ckco) this.b.a(ckgd.n)).a((int) new eaow(new eapd(((dqxx) ((dqxv) dbsgVar.b()).b).f), new eapd(this.c.b())).b);
                        }
                        if (!this.i.c()) {
                            a(false, "%d - Not internet capable, shutting down", valueOf2);
                            stopSelf();
                            return 2;
                        }
                        a(false, "%d - Acquiring accounts...", valueOf2);
                        final dcdc r = dcdc.r(stringArrayList);
                        final deig d = deig.d();
                        Executor executor = this.m;
                        final boolean a3 = dbsgVar.a();
                        executor.execute(new Runnable(this, r, a3, i2, d) { // from class: ajmt
                            private final ReporterService a;
                            private final dcdc b;
                            private final boolean c;
                            private final int d;
                            private final deig e;

                            {
                                this.a = this;
                                this.b = r;
                                this.c = a3;
                                this.d = i2;
                                this.e = d;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ReporterService reporterService = this.a;
                                dcdc dcdcVar = this.b;
                                boolean z2 = this.c;
                                int i5 = this.d;
                                deig deigVar = this.e;
                                dcen N2 = dcep.N();
                                int size2 = dcdcVar.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    btlu n = reporterService.f.n((String) dcdcVar.get(i6));
                                    if (n == null) {
                                        if (z2) {
                                            ((ckco) reporterService.b.a(ckgd.l)).a(ckfx.SERVICE_NOT_LOGGED_IN.l);
                                        }
                                        ReporterService.a(true, "%d - Failed to load account for ReporterService.", Integer.valueOf(i5));
                                    } else {
                                        N2.b(n);
                                    }
                                }
                                deigVar.j(N2.f());
                            }
                        });
                        d.Pk(new Runnable(this, d, i2, bK, bK2, bK3, f, dbsgVar, stringArrayList, dbpyVar, eapdVar) { // from class: ajms
                            private final ReporterService a;
                            private final dehn b;
                            private final int c;
                            private final dqyy d;
                            private final dqza e;
                            private final dqzg f;
                            private final dcep g;
                            private final dbsg h;
                            private final ArrayList i;
                            private final dbsg j;
                            private final eapd k;

                            {
                                this.a = this;
                                this.b = d;
                                this.c = i2;
                                this.d = bK;
                                this.e = bK2;
                                this.f = bK3;
                                this.g = f;
                                this.h = dbsgVar;
                                this.i = stringArrayList;
                                this.j = dbpyVar;
                                this.k = eapdVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                final ReporterService reporterService = this.a;
                                dehn dehnVar = this.b;
                                final int i5 = this.c;
                                dqyy dqyyVar = this.d;
                                dqza dqzaVar = this.e;
                                dqzg dqzgVar = this.f;
                                dcep<dqym> dcepVar = this.g;
                                final dbsg<dqxv> dbsgVar2 = this.h;
                                final ArrayList arrayList = this.i;
                                final eapd eapdVar2 = this.k;
                                dcep<btlu> dcepVar2 = (dcep) deha.s(dehnVar);
                                if (dcepVar2.isEmpty()) {
                                    reporterService.stopSelf();
                                    ReporterService.a(true, "%d - Early exit. No accounts to report for.", Integer.valueOf(i5));
                                    return;
                                }
                                ReporterService.a(false, "%d - Attempting to report...", Integer.valueOf(i5));
                                reporterService.j.c(dqyyVar, dqzaVar, dqzgVar, dcepVar2, dcepVar, dbsgVar2).Pk(new Runnable(reporterService, arrayList, eapdVar2, dbsgVar2, i5) { // from class: ajmu
                                    private final ReporterService a;
                                    private final ArrayList b;
                                    private final eapd c;
                                    private final dbsg d;
                                    private final int e;

                                    {
                                        this.a = reporterService;
                                        this.b = arrayList;
                                        this.c = eapdVar2;
                                        this.d = dbsgVar2;
                                        this.e = i5;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ReporterService reporterService2 = this.a;
                                        ArrayList arrayList2 = this.b;
                                        eapd eapdVar3 = this.c;
                                        dbsg<dqxv> dbsgVar3 = this.d;
                                        int i6 = this.e;
                                        String str2 = (String) arrayList2.get(0);
                                        reporterService2.b(eapdVar3, dbsgVar3, i6, false);
                                    }
                                }, reporterService.m);
                            }
                        }, this.m);
                        return 2;
                    }
                } catch (dsrm unused2) {
                    stopSelf();
                    a(true, "%d - Early exit. Corrupted upload parameters. %s", Integer.valueOf(i2), Arrays.toString(byteArray3));
                    return 2;
                }
            } catch (dsrm unused3) {
                stopSelf();
                a(true, "%d - Early exit. Corrupted quality requirements. %s", Integer.valueOf(i2), Arrays.toString(byteArray2));
                return 2;
            }
        } catch (dsrm unused4) {
            stopSelf();
            a(true, "%d - Early exit. Corrupted collection parameters. %s", Integer.valueOf(i2), Arrays.toString(byteArray));
            return 2;
        }
    }
}
