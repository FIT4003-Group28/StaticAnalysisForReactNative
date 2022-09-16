package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bsl  reason: default package */
/* loaded from: classes2.dex */
public final class bsl implements bqz {
    private static final String a = bqf.b("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final brq d;
    private final bsk e;

    public bsl(Context context, brq brqVar) {
        bsk bskVar = new bsk(context);
        this.b = context;
        this.d = brqVar;
        this.c = (JobScheduler) context.getSystemService("jobscheduler");
        this.e = bskVar;
    }

    public static void a(Context context) {
        List<JobInfo> i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (i = i(context, jobScheduler)) == null || i.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : i) {
            j(jobScheduler, jobInfo.getId());
        }
    }

    public static boolean f(Context context, brq brqVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> i = i(context, jobScheduler);
        bua r = brqVar.d.r();
        boolean z = false;
        bku a2 = bku.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        r.a.e();
        Cursor f = ld.f(r.a, a2, false);
        try {
            ArrayList<String> arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                arrayList.add(f.getString(0));
            }
            HashSet hashSet = new HashSet(i != null ? i.size() : 0);
            if (i != null && !i.isEmpty()) {
                for (JobInfo jobInfo : i) {
                    String g = g(jobInfo);
                    if (!TextUtils.isEmpty(g)) {
                        hashSet.add(g);
                    } else {
                        j(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!hashSet.contains((String) it.next())) {
                    bqf.a().d(new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = brqVar.d;
                workDatabase.f();
                try {
                    bun n = workDatabase.n();
                    for (String str : arrayList) {
                        n.j(str, -1L);
                    }
                    workDatabase.h();
                } finally {
                    workDatabase.g();
                }
            }
            return z;
        } finally {
            f.close();
            a2.i();
        }
    }

    private static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return null;
                }
                return extras.getString("EXTRA_WORK_SPEC_ID");
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    private static List h(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> i = i(context, jobScheduler);
        if (i == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : i) {
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List i(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            bqf.a();
            bqf.e(a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static void j(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            bqf.a();
            bqf.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.bqz
    public final void b(String str) {
        List<Integer> h = h(this.b, this.c, str);
        if (h == null || h.isEmpty()) {
            return;
        }
        for (Integer num : h) {
            j(this.c, num.intValue());
        }
        this.d.d.r().c(str);
    }

    @Override // defpackage.bqz
    public final void c(bum... bumVarArr) {
        int b;
        List h;
        int b2;
        WorkDatabase workDatabase = this.d.d;
        bvh bvhVar = new bvh(workDatabase);
        for (bum bumVar : bumVarArr) {
            workDatabase.f();
            try {
                bum a2 = workDatabase.n().a(bumVar.c);
                if (a2 == null) {
                    bqf.a();
                    bqf.g(a, "Skipping scheduling " + bumVar.c + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (a2.r != 1) {
                    bqf.a();
                    bqf.g(a, "Skipping scheduling " + bumVar.c + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    btx a3 = workDatabase.r().a(bumVar.c);
                    if (a3 != null) {
                        b = a3.b;
                    } else {
                        int i = this.d.c.g;
                        b = bvhVar.b();
                    }
                    if (a3 == null) {
                        this.d.d.r().b(new btx(bumVar.c, b));
                    }
                    e(bumVar, b);
                    if (Build.VERSION.SDK_INT == 23 && (h = h(this.b, this.c, bumVar.c)) != null) {
                        int indexOf = h.indexOf(Integer.valueOf(b));
                        if (indexOf >= 0) {
                            h.remove(indexOf);
                        }
                        if (h.isEmpty()) {
                            int i2 = this.d.c.g;
                            b2 = bvhVar.b();
                        } else {
                            b2 = ((Integer) h.get(0)).intValue();
                        }
                        e(bumVar, b2);
                    }
                    workDatabase.h();
                }
                workDatabase.g();
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }

    @Override // defpackage.bqz
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.bum r17, int r18) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.e(bum, int):void");
    }
}
