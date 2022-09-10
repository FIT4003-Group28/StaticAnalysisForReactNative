package com.google.android.apps.gmm.place.timeline.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SaveVisitBadgeLocationSurveyService extends JobService {
    public gdo a;
    public bvrv b;
    public ckcw c;
    public bmsx d;

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.a.b();
        this.c.f(ckhc.SAVE_VISIT_BADGE_LOCATION_SURVEY_SERVICE);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.e();
        this.c.g(ckhc.SAVE_VISIT_BADGE_LOCATION_SURVEY_SERVICE);
        this.b.a();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ((ckcm) this.c.a(ckgo.w)).a(jobParameters.isOverrideDeadlineExpired());
        try {
            bmsx bmsxVar = this.d;
            eapd eapdVar = new eapd(bmsxVar.d.b());
            bmsd c = bmsh.c(jobParameters.getExtras());
            if (c.a().isEmpty()) {
                return false;
            }
            bmso bmsoVar = bmsxVar.c;
            final bmsg e = c.e();
            ((ckcn) ((bmsu) bmsoVar).b.a(ckgo.F)).a();
            final bmsu bmsuVar = (bmsu) bmsoVar;
            final bmsu bmsuVar2 = (bmsu) bmsoVar;
            bmsc bmscVar = new bmsc(deew.h(deha.h(((bmsu) bmsoVar).d.c(new Callable(bmsuVar, e) { // from class: bmsp
                private final bmsu a;
                private final bmsg b;

                {
                    this.a = bmsuVar;
                    this.b = e;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c.a().n(this.b.a());
                }
            }), 5L, TimeUnit.SECONDS, ((bmsu) bmsoVar).d), new dbrn(bmsuVar2, e) { // from class: bmsq
                private final bmsu a;
                private final bmsg b;

                {
                    this.a = bmsuVar2;
                    this.b = e;
                }

                /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
                @Override // defpackage.dbrn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 1086
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bmsq.a(java.lang.Object):java.lang.Object");
                }
            }, dege.a));
            deha.q(bmscVar.a, new bmsr((bmsu) bmsoVar), dege.a);
            deha.q(bmscVar.a(), new bmsw(bmsxVar, c, eapdVar, jobParameters, this), dege.a);
            return true;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        ((ckco) this.d.b.a(ckgo.x)).a(ckgk.a(9));
        return true;
    }
}
