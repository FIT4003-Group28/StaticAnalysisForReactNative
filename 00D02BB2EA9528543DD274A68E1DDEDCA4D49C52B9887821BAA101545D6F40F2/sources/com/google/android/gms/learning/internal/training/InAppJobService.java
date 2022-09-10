package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    @dzsi
    coie dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            coie coieVar = (coie) cohu.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", coij.a);
            if (!coieVar.l(cobb.b(this), cobb.b(getBgExecutor()))) {
                return false;
            }
            this.dynamiteImpl = coieVar;
            return true;
        } catch (RemoteException | cohs unused) {
            return false;
        }
    }

    public ExecutorService getBgExecutor() {
        return coik.a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        coie coieVar = this.dynamiteImpl;
        if (coieVar != null) {
            try {
                coieVar.e();
            } catch (RemoteException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        coie coieVar = this.dynamiteImpl;
        if (coieVar != null) {
            try {
                coieVar.i(intent);
                return;
            } catch (RemoteException unused) {
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        coie coieVar = this.dynamiteImpl;
        if (coieVar != null) {
            try {
                return coieVar.g(intent, i, i2);
            } catch (RemoteException unused) {
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            coic.a(this, jobParameters);
            return false;
        } else if (!tryLoadDynamiteImpl()) {
            coic.a(this, jobParameters);
            return false;
        } else {
            try {
                return this.dynamiteImpl.j(jobParameters);
            } catch (RemoteException unused) {
                coic.a(this, jobParameters);
                return false;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        coie coieVar = this.dynamiteImpl;
        if (coieVar != null) {
            try {
                return coieVar.k(jobParameters);
            } catch (RemoteException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        coie coieVar = this.dynamiteImpl;
        if (coieVar != null) {
            try {
                coieVar.f(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        coie coieVar = this.dynamiteImpl;
        if (coieVar != null) {
            try {
                return coieVar.h(intent);
            } catch (RemoteException unused) {
            }
        }
        return super.onUnbind(intent);
    }
}
