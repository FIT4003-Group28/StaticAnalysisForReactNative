package com.google.android.apps.gmm.offline.update;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineAutoUpdateJobService extends JobService {
    public dxio<awjv> a;
    public ckcw b;
    public gdo c;
    public dxio<avjo> d;
    public bvrv e;
    public Executor f;
    public dxio<avij> g;
    public cqat h;
    public final Map<Integer, awiy> i = Collections.synchronizedMap(new HashMap());
    private boolean j = false;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.b.f(ckhc.OFFLINE_SERVICE);
        this.c.b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.j) {
            this.g.a().B();
            this.j = false;
        }
        this.b.g(ckhc.OFFLINE_SERVICE);
        this.c.e();
        this.e.a();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        avjy bK;
        long e = this.h.e();
        avjo a = this.d.a();
        if (!a.e(jobParameters.getJobId())) {
            jobParameters.getJobId();
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        avjr bZ = avjy.l.bZ();
        if (extras == null) {
            bK = bZ.bK();
        } else {
            avjz.b(extras.getString("options"), bZ);
            if (extras.containsKey("locationRequired")) {
                boolean c = avjz.c(extras.getInt("locationRequired"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar = (avjy) bZ.b;
                avjyVar.a |= 1;
                avjyVar.b = c;
            }
            if (extras.containsKey("connectivityRequired")) {
                boolean c2 = avjz.c(extras.getInt("connectivityRequired"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar2 = (avjy) bZ.b;
                avjyVar2.a |= 2;
                avjyVar2.c = c2;
            }
            if (extras.containsKey("batteryCheckRequired")) {
                boolean c3 = avjz.c(extras.getInt("batteryCheckRequired"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar3 = (avjy) bZ.b;
                avjyVar3.a |= 4;
                avjyVar3.d = c3;
            }
            if (extras.containsKey("batteryCheckType")) {
                avjq g = avjz.g(extras.getInt("batteryCheckType"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar4 = (avjy) bZ.b;
                avjyVar4.e = g.d;
                avjyVar4.a |= 8;
            }
            if (extras.containsKey("intervalCheckType")) {
                avjt e2 = avjz.e(extras.getInt("intervalCheckType"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar5 = (avjy) bZ.b;
                avjyVar5.f = e2.d;
                avjyVar5.a |= 16;
            }
            if (extras.containsKey("screenCheckType")) {
                avjv f = avjz.f(extras.getInt("screenCheckType"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar6 = (avjy) bZ.b;
                avjyVar6.g = f.d;
                avjyVar6.a |= 32;
            }
            if (extras.containsKey("timeBudget")) {
                avjx d = avjz.d(extras.getInt("timeBudget"));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar7 = (avjy) bZ.b;
                avjyVar7.j = d.d;
                avjyVar7.a |= 256;
            }
            if (extras.containsKey("idx")) {
                int i = extras.getInt("idx");
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar8 = (avjy) bZ.b;
                avjyVar8.a |= 64;
                avjyVar8.h = i;
            }
            if (extras.containsKey("policyId")) {
                String string = extras.getString("policyId");
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                avjy avjyVar9 = (avjy) bZ.b;
                string.getClass();
                avjyVar9.a |= 128;
                avjyVar9.i = string;
            }
            bK = bZ.bK();
        }
        a.g(bK);
        if (!this.j) {
            this.g.a().A();
            this.j = true;
        }
        dehn<avjg> a2 = this.a.a().a(bK);
        if (a2 == null) {
            return false;
        }
        this.i.put(Integer.valueOf(jobParameters.getJobId()), new awiy(e, bK));
        deha.q(a2, new awix(this, jobParameters), this.f);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        awiy remove = this.i.remove(Integer.valueOf(jobParameters.getJobId()));
        if (remove != null) {
            ((ckcp) this.b.a(ckia.j)).a(TimeUnit.MILLISECONDS.toSeconds(this.h.e() - remove.a));
            return true;
        }
        return true;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        ((ckco) this.b.a(ckia.g)).a(i);
    }
}
