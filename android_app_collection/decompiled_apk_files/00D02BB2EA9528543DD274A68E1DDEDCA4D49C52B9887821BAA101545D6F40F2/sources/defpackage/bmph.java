package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import com.google.android.apps.gmm.place.timeline.service.SaveVisitBadgeLocationSurveyService;
import com.google.android.apps.gmm.place.timeline.service.detection.LocalLocationSignalDetectorService;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bmph  reason: default package */
/* loaded from: classes3.dex */
public final class bmph implements bmnh {
    public final btvo a;
    public final Context b;
    public final cqat c;
    public final dxio<ckcw> d;
    public final dehq e;
    public final axru f;
    public final colr g;
    private final dxio<akfa> h;
    private final bmpg i;

    public bmph(btvo btvoVar, Application application, cqat cqatVar, dxio<ckcw> dxioVar, dxio<akfa> dxioVar2, dehq dehqVar, axru axruVar, colr colrVar, bmpg bmpgVar) {
        this.a = btvoVar;
        this.b = application;
        this.c = cqatVar;
        this.d = dxioVar;
        this.h = dxioVar2;
        this.e = dehqVar;
        this.f = axruVar;
        this.g = colrVar;
        this.i = bmpgVar;
    }

    public static void b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.bmnh
    public final bmoc a(final btlu btluVar, final eapd eapdVar, final dmjz dmjzVar) {
        ((ckcn) this.d.a().a(ckgo.D)).a();
        ((ckco) this.d.a().a(ckgo.E)).a(dmjzVar.e);
        int i = 29;
        if (!this.h.a().j().m()) {
            final deig d = deig.d();
            degp r = degp.q(d).r(5L, TimeUnit.SECONDS, this.e);
            coqh a = this.i.a();
            final Account s = btluVar.s();
            cntc builder = cntd.builder();
            builder.a = new cnsr(s) { // from class: coqf
                private final Account a;

                {
                    this.a = s;
                }

                @Override // defpackage.cnsr
                public final void a(Object obj, Object obj2) {
                    cpct cpctVar = (cpct) obj2;
                    cpctVar.a(((coqr) ((coqt) obj).L()).e(this.a));
                }
            };
            builder.c = 2427;
            a.c(builder.a()).m(new cpcf(this, d, btluVar, eapdVar, dmjzVar) { // from class: bmor
                private final bmph a;
                private final deig b;
                private final btlu c;
                private final eapd d;
                private final dmjz e;

                {
                    this.a = this;
                    this.b = d;
                    this.c = btluVar;
                    this.d = eapdVar;
                    this.e = dmjzVar;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    dehn dehnVar;
                    final bmph bmphVar = this.a;
                    deig deigVar = this.b;
                    final btlu btluVar2 = this.c;
                    final eapd eapdVar2 = this.d;
                    final dmjz dmjzVar2 = this.e;
                    bvrj.UI_THREAD.c();
                    if (!cpcqVar.b()) {
                        deigVar.j(bmnu.c(bmnt.TASK_FAILED));
                        return;
                    }
                    int b = ((ReportingState) cpcqVar.d()).b();
                    if (b == -1) {
                        deigVar.j(bmnu.c(bmnt.SETTING_DISABLED));
                    } else if (b == 0) {
                        deigVar.j(bmnu.c(bmnt.SETTING_NOT_FOUND));
                    } else if (b == 1) {
                        if (!bmphVar.f.a("android.permission.ACCESS_COARSE_LOCATION") && !bmphVar.f.a("android.permission.ACCESS_FINE_LOCATION")) {
                            dehnVar = deha.a(bmny.c(bmnx.APP_LOCATION_PERMISSION_DISABLED));
                        } else {
                            final deig d2 = deig.d();
                            degp r2 = degp.q(d2).r(5L, TimeUnit.SECONDS, bmphVar.e);
                            colg colgVar = new colg();
                            LocationRequest create = LocationRequest.create();
                            create.setPriority(102);
                            colgVar.b(create);
                            cpcq<coli> a2 = bmphVar.g.a(colgVar.a());
                            a2.s(new cpcl(bmphVar, d2, eapdVar2, btluVar2, dmjzVar2) { // from class: bmos
                                private final bmph a;
                                private final deig b;
                                private final eapd c;
                                private final btlu d;
                                private final dmjz e;

                                {
                                    this.a = bmphVar;
                                    this.b = d2;
                                    this.c = eapdVar2;
                                    this.d = btluVar2;
                                    this.e = dmjzVar2;
                                }

                                @Override // defpackage.cpcl
                                public final void c(Object obj) {
                                    final bmph bmphVar2 = this.a;
                                    deig deigVar2 = this.b;
                                    final eapd eapdVar3 = this.c;
                                    final btlu btluVar3 = this.d;
                                    final dmjz dmjzVar3 = this.e;
                                    coli coliVar = (coli) obj;
                                    deig d3 = deig.d();
                                    final bmpd bmpdVar = new bmpd(d3);
                                    Intent intent = new Intent(bmphVar2.b, LocalLocationSignalDetectorService.class);
                                    bmphVar2.b.startService(intent);
                                    degp r3 = degp.q(d3).r(30L, TimeUnit.SECONDS, bmphVar2.e);
                                    if (!bmphVar2.b.bindService(intent, bmpdVar, 1)) {
                                        d3.j(bmpf.c(bmno.BIND_SERVICE_FAILED));
                                    }
                                    deha.q(r3, new bmpe(bmphVar2, bmpdVar), dege.a);
                                    deigVar2.j(new bmnf(dbsg.i(deew.h(r3, new dbrn(bmphVar2, eapdVar3, btluVar3, bmpdVar, dmjzVar3) { // from class: bmov
                                        private final bmph a;
                                        private final eapd b;
                                        private final btlu c;
                                        private final ServiceConnection d;
                                        private final dmjz e;

                                        {
                                            this.a = bmphVar2;
                                            this.b = eapdVar3;
                                            this.c = btluVar3;
                                            this.d = bmpdVar;
                                            this.e = dmjzVar3;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj2) {
                                            bmph bmphVar3 = this.a;
                                            final eapd eapdVar4 = this.b;
                                            final btlu btluVar4 = this.c;
                                            final ServiceConnection serviceConnection = this.d;
                                            dmjz dmjzVar4 = this.e;
                                            bmpf bmpfVar = (bmpf) obj2;
                                            dbsg<dmkd> a3 = bmpfVar.a();
                                            if (a3.a()) {
                                                dmkd b2 = a3.b();
                                                final JobScheduler jobScheduler = (JobScheduler) bmphVar3.b.getSystemService("jobscheduler");
                                                final Context context = bmphVar3.b;
                                                final btvo btvoVar = bmphVar3.a;
                                                final cqat cqatVar = bmphVar3.c;
                                                dehq dehqVar = bmphVar3.e;
                                                dvka dvkaVar = btvoVar.getPersonalContextParameters().a;
                                                if (dvkaVar == null) {
                                                    dvkaVar = dvka.i;
                                                }
                                                dmjs dmjsVar = new dmjs();
                                                dmjsVar.a = Integer.valueOf(dvkaVar.a);
                                                dmjsVar.b = Integer.valueOf(dvkaVar.b);
                                                dmjsVar.c = Integer.valueOf(dvkaVar.c);
                                                dmjsVar.d = Integer.valueOf(dvkaVar.d);
                                                dqgu dqguVar = dvkaVar.g;
                                                if (dqguVar == null) {
                                                    dqguVar = dqgu.d;
                                                }
                                                dmjsVar.a(dqguVar);
                                                if (dmjzVar4 != null) {
                                                    dmjsVar.f = dmjzVar4;
                                                    dqgu dqguVar2 = dvkaVar.g;
                                                    if (dqguVar2 == null) {
                                                        dqguVar2 = dqgu.d;
                                                    }
                                                    if ((dqguVar2.a & 1) == 0) {
                                                        dqgu dqguVar3 = dvkaVar.g;
                                                        if (dqguVar3 == null) {
                                                            dqguVar3 = dqgu.d;
                                                        }
                                                        dsqp dsqpVar = (dsqp) dqguVar3.cu(5);
                                                        dsqpVar.bC(dqguVar3);
                                                        dqgt dqgtVar = (dqgt) dsqpVar;
                                                        int i2 = (int) dvkaVar.e;
                                                        if (dqgtVar.c) {
                                                            dqgtVar.bF();
                                                            dqgtVar.c = false;
                                                        }
                                                        dqgu dqguVar4 = (dqgu) dqgtVar.b;
                                                        dqguVar4.a |= 1;
                                                        dqguVar4.b = i2;
                                                        dmjsVar.a(dqgtVar.bK());
                                                    }
                                                    String str = dmjsVar.a == null ? " maxWifiObservations" : "";
                                                    if (dmjsVar.b == null) {
                                                        str = str.concat(" maxValidWifiObservations");
                                                    }
                                                    if (dmjsVar.c == null) {
                                                        str = String.valueOf(str).concat(" maxBluetoothObservations");
                                                    }
                                                    if (dmjsVar.d == null) {
                                                        str = String.valueOf(str).concat(" maxValidBluetoothObservations");
                                                    }
                                                    if (dmjsVar.e == null) {
                                                        str = String.valueOf(str).concat(" scanParameters");
                                                    }
                                                    if (dmjsVar.f == null) {
                                                        str = String.valueOf(str).concat(" client");
                                                    }
                                                    if (!str.isEmpty()) {
                                                        String valueOf = String.valueOf(str);
                                                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                                    }
                                                    dehn h = deha.h(b2.a(new dmjt(dmjsVar.a.intValue(), dmjsVar.b.intValue(), dmjsVar.c.intValue(), dmjsVar.d.intValue(), dmjsVar.e, dmjsVar.f)), 80L, TimeUnit.SECONDS, dehqVar);
                                                    h.Pk(new Runnable(context, serviceConnection) { // from class: bmow
                                                        private final Context a;
                                                        private final ServiceConnection b;

                                                        {
                                                            this.a = context;
                                                            this.b = serviceConnection;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            bmph.b(this.a, this.b);
                                                        }
                                                    }, dege.a);
                                                    return new bmnc(dbsg.i(new bmnd(deew.h(h, new dbrn(eapdVar4, jobScheduler, context, btluVar4, btvoVar, cqatVar) { // from class: bmox
                                                        private final eapd a;
                                                        private final JobScheduler b;
                                                        private final Context c;
                                                        private final btlu d;
                                                        private final btvo e;
                                                        private final cqat f;

                                                        {
                                                            this.a = eapdVar4;
                                                            this.b = jobScheduler;
                                                            this.c = context;
                                                            this.d = btluVar4;
                                                            this.e = btvoVar;
                                                            this.f = cqatVar;
                                                        }

                                                        @Override // defpackage.dbrn
                                                        public final Object a(Object obj3) {
                                                            JobInfo jobInfo;
                                                            bmsd b3;
                                                            eapd eapdVar5 = this.a;
                                                            JobScheduler jobScheduler2 = this.b;
                                                            Context context2 = this.c;
                                                            btlu btluVar5 = this.d;
                                                            btvo btvoVar2 = this.e;
                                                            cqat cqatVar2 = this.f;
                                                            dtcc dtccVar = (dtcc) obj3;
                                                            try {
                                                                ComponentName componentName = new ComponentName(context2, SaveVisitBadgeLocationSurveyService.class);
                                                                eaow d4 = bmsh.d(btvoVar2);
                                                                JobInfo.Builder a4 = bmsh.a(componentName);
                                                                bmsg d5 = bmsg.d(btluVar5.d, eapdVar5, dtccVar);
                                                                if (Build.VERSION.SDK_INT >= 24) {
                                                                    jobInfo = jobScheduler2.getPendingJob(159560342);
                                                                } else {
                                                                    jobInfo = (JobInfo) dcft.l(jobScheduler2.getAllPendingJobs(), bmoy.a, null);
                                                                }
                                                                if (jobInfo != null) {
                                                                    b3 = bmsh.c(jobInfo.getExtras());
                                                                    b3.a().size();
                                                                } else {
                                                                    b3 = bmsd.b();
                                                                }
                                                                dccx F = dcdc.F();
                                                                dcdc<bmsg> a5 = b3.a();
                                                                int size = a5.size();
                                                                for (int i3 = 0; i3 < size; i3++) {
                                                                    bmsg bmsgVar = a5.get(i3);
                                                                    if (!bmsgVar.b().x(((bmry) d5).a)) {
                                                                        break;
                                                                    }
                                                                    F.g(bmsgVar);
                                                                }
                                                                F.g(d5);
                                                                bmsd d6 = bmsd.d(F.f());
                                                                dbsk.l(!d6.e().b().w(eapdVar5));
                                                                a4.setOverrideDeadline(bmsh.f(d4, d6.e().b(), new eapd(cqatVar2.b())).b);
                                                                a4.setExtras(bmsh.b(d6));
                                                                if (bmsh.e(jobScheduler2, a4.build()) == 1) {
                                                                    return new bmng(dtccVar, dbpy.a);
                                                                }
                                                            } catch (RuntimeException unused) {
                                                            }
                                                            return new bmng(dtccVar, dbsg.i(bmnz.a));
                                                        }
                                                    }, dege.a))), dbpy.a);
                                                }
                                                throw new NullPointerException("Null client");
                                            }
                                            return new bmnc(dbpy.a, dbsg.i(bmpfVar.b().b()));
                                        }
                                    }, dege.a)), dbpy.a));
                                }
                            });
                            a2.r(new cpci(d2) { // from class: bmot
                                private final deig a;

                                {
                                    this.a = d2;
                                }

                                @Override // defpackage.cpci
                                public final void d(Exception exc) {
                                    this.a.j(bmny.c(bmnx.LOCATION_MODE_INCOMPATIBLE_FOR_WIFI_SCANS));
                                }
                            });
                            a2.k(new cpcc(d2) { // from class: bmou
                                private final deig a;

                                {
                                    this.a = d2;
                                }

                                @Override // defpackage.cpcc
                                public final void e() {
                                    this.a.j(bmny.c(bmnx.LOCATION_SETTINGS_LOOKUP_FAILED));
                                }
                            });
                            dehnVar = r2;
                        }
                        deigVar.j(new bmne(dbsg.i(dehnVar), dbpy.a));
                    } else {
                        deigVar.j(bmnu.c(bmnt.SETTING_UNKNOWN));
                    }
                }
            });
            bmnb bmnbVar = new bmnb(dbsg.i(r), dbpy.a);
            dbsg<dehn<bmnu>> dbsgVar = bmnbVar.a;
            if (!dbsgVar.a()) {
                bmob b = bmnbVar.b.b();
                bmnx bmnxVar = bmnx.LOCATION_MODE_INCOMPATIBLE_FOR_WIFI_SCANS;
                bmnt bmntVar = bmnt.TASK_FAILED;
                bmob bmobVar = bmob.UNSUPPORTED_SDK;
                int ordinal = b.ordinal();
                if (ordinal == 0) {
                    i = 16;
                } else if (ordinal != 1) {
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    sb.append("Unknown synchronous error: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                c(i, dmjzVar);
            } else {
                deha.q(dbsgVar.b(), new bmoz(this, dmjzVar), dege.a);
            }
            return bmnbVar;
        }
        ((ckco) this.d.a().a(ckgo.x)).a(ckgk.a(29));
        return new bmnb(dbpy.a, dbsg.i(bmob.INCOGNITO_MODE_ON));
    }

    public final void c(int i, dmjz dmjzVar) {
        ckgz ckgzVar;
        ((ckco) this.d.a().a(ckgo.x)).a(ckgk.a(i));
        ckcw a = this.d.a();
        bmnx bmnxVar = bmnx.LOCATION_MODE_INCOMPATIBLE_FOR_WIFI_SCANS;
        bmnt bmntVar = bmnt.TASK_FAILED;
        dmjz dmjzVar2 = dmjz.UNKNOWN;
        bmob bmobVar = bmob.UNSUPPORTED_SDK;
        int ordinal = dmjzVar.ordinal();
        if (ordinal == 1) {
            ckgzVar = ckgo.z;
        } else if (ordinal != 2) {
            ckgzVar = ordinal != 3 ? ckgo.y : ckgo.B;
        } else {
            ckgzVar = ckgo.A;
        }
        ((ckco) a.a(ckgzVar)).a(ckgk.a(i));
    }
}
