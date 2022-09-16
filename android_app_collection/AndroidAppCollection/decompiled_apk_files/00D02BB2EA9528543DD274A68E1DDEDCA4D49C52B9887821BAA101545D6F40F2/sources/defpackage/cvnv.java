package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
/* compiled from: PG */
/* renamed from: cvnv  reason: default package */
/* loaded from: classes5.dex */
public final class cvnv implements cvnp {
    private static final String a = String.format("JobScheduler returned RESULT_FAILURE. Did you forget to add [%s] to your app dependencies?", "java/com/google/android/libraries/notifications/entrypoints/scheduled");
    private final Context b;
    private final cvjs c;

    public cvnv(Context context, cvjs cvjsVar) {
        this.b = context;
        this.c = cvjsVar;
    }

    private final void f(@dzsi cvkc cvkcVar, int i, String str, Bundle bundle, @dzsi Long l, @dzsi Long l2) {
        PersistableBundle persistableBundle = new PersistableBundle(bundle.keySet().size());
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                if (obj instanceof Integer) {
                    persistableBundle.putInt(str2, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    persistableBundle.putLong(str2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    persistableBundle.putDouble(str2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    persistableBundle.putString(str2, (String) obj);
                } else if (obj instanceof String[]) {
                    persistableBundle.putStringArray(str2, (String[]) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 92 + String.valueOf(valueOf).length());
                    sb.append("Extra parameter types supported: Integer, Long, Double, String.Error for, key: [");
                    sb.append(str2);
                    sb.append("] value: [");
                    sb.append(valueOf);
                    sb.append("].");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        persistableBundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", str);
        int g = g(cvkcVar == null ? null : cvkcVar.a(), i);
        JobInfo.Builder persisted = new JobInfo.Builder(g, new ComponentName(this.b, this.c.h())).setExtras(persistableBundle).setRequiredNetworkType(1).setPersisted(cvpo.c(this.b, "android.permission.RECEIVE_BOOT_COMPLETED"));
        if (l2 != null) {
            persisted.setPeriodic(l2.longValue());
        } else if (l != null) {
            persisted.setMinimumLatency(l.longValue());
        }
        try {
            if (((JobScheduler) this.b.getSystemService("jobscheduler")).schedule(persisted.build()) != 0) {
                cvlw.b("ChimeScheduledTaskHelper", "Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.b.getApplicationContext().getPackageName(), Integer.valueOf(g), Integer.valueOf(i));
                return;
            }
        } catch (IllegalStateException | NullPointerException unused) {
            cvlw.e("ChimeScheduledTaskHelper", "Failed to scheduled job %s", Integer.valueOf(g));
        }
        Object[] objArr = {this.b.getApplicationContext().getPackageName(), Integer.valueOf(g), Integer.valueOf(i)};
        if (cvlw.b.a(5)) {
            cvlx.b("ChimeScheduledTaskHelper", "Failed to schedule a job for package [%s] with ID: %s, type: %s", objArr);
        }
        throw new cvno(a);
    }

    private final int g(@dzsi Long l, int i) {
        long j;
        if (l != null) {
            j = l.longValue();
            boolean z = false;
            dbsk.f(j >= 0, "accountId must be >= 0, got: %s.", j);
            if (j <= 998) {
                z = true;
            }
            dbsk.f(z, "accountId must be <= 998, got: %s.", j);
        } else {
            j = 999;
        }
        dbsk.e(true, "jobType must be >= 0, got: %s.", i);
        dbsk.e(true, "jobType must be <= 999, got: %s.", i);
        return this.c.j().intValue() + (i * 1000) + ((int) j);
    }

    @Override // defpackage.cvnp
    public final void a(@dzsi cvkc cvkcVar, int i, String str, Bundle bundle) {
        f(cvkcVar, i, str, bundle, null, null);
    }

    @Override // defpackage.cvnp
    public final void b(@dzsi cvkc cvkcVar, int i, String str, Bundle bundle, long j) {
        dbsk.f(j > 0, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        f(cvkcVar, i, str, bundle, Long.valueOf(j), null);
    }

    @Override // defpackage.cvnp
    public final boolean d(int i) {
        for (JobInfo jobInfo : ((JobScheduler) this.b.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (jobInfo.getId() == g(null, i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvnp
    public final void e(int i, String str, Bundle bundle, long j) {
        dbsk.f(j > 0, "Scheduled job periodicIntervalMs must be > 0, got: %s.", j);
        f(null, i, str, bundle, null, Long.valueOf(j));
    }

    @Override // defpackage.cvnp
    public final void c(@dzsi cvkc cvkcVar, int i) {
        int g = g(cvkcVar == null ? null : cvkcVar.a(), i);
        cvlw.b("ChimeScheduledTaskHelper", "Cancelling a scheduled job for package [%s] with ID: %s, type: %s", this.b.getApplicationContext().getPackageName(), Integer.valueOf(g), Integer.valueOf(i));
        ((JobScheduler) this.b.getSystemService("jobscheduler")).cancel(g);
    }
}
