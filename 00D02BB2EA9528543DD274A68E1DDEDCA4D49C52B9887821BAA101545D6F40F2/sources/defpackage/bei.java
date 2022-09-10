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
/* renamed from: bei  reason: default package */
/* loaded from: classes3.dex */
public final class bei implements bcx {
    private final Context a;
    private final JobScheduler b;
    private final bdn c;
    private final beh d;

    static {
        bbz.f("SystemJobScheduler");
    }

    public bei(Context context, bdn bdnVar) {
        beh behVar = new beh(context);
        this.a = context;
        this.c = bdnVar;
        this.b = (JobScheduler) context.getSystemService("jobscheduler");
        this.d = behVar;
    }

    public static void e(Context context) {
        List<JobInfo> h;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (h = h(context, jobScheduler)) == null || h.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : h) {
            g(jobScheduler, jobInfo.getId());
        }
    }

    public static boolean f(Context context, bdn bdnVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> h = h(context, jobScheduler);
        bfx w = bdnVar.c.w();
        boolean z = false;
        br a = br.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        w.a.E();
        Cursor q = w.a.q(a);
        try {
            ArrayList<String> arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(q.getString(0));
            }
            HashSet hashSet = new HashSet(h != null ? h.size() : 0);
            if (h != null && !h.isEmpty()) {
                for (JobInfo jobInfo : h) {
                    String j = j(jobInfo);
                    if (!TextUtils.isEmpty(j)) {
                        hashSet.add(j);
                    } else {
                        g(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!hashSet.contains((String) it.next())) {
                    bbz.e().a(new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = bdnVar.c;
                workDatabase.F();
                try {
                    bgi t = workDatabase.t();
                    for (String str : arrayList) {
                        t.r(str, -1L);
                    }
                    workDatabase.l();
                } finally {
                    workDatabase.k();
                }
            }
            return z;
        } finally {
            q.close();
            a.c();
        }
    }

    private static void g(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            bbz e = bbz.e();
            Locale.getDefault();
            e.b(th);
        }
    }

    private static List<JobInfo> h(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            bbz.e().b(th);
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

    private static List<Integer> i(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> h = h(context, jobScheduler);
        if (h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : h) {
            if (str.equals(j(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static String j(JobInfo jobInfo) {
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.bgh r17, int r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bei.a(bgh, int):void");
    }

    @Override // defpackage.bcx
    public final void b(bgh... bghVarArr) {
        int a;
        List<Integer> i;
        int a2;
        WorkDatabase workDatabase = this.c.c;
        bhd bhdVar = new bhd(workDatabase);
        for (bgh bghVar : bghVarArr) {
            workDatabase.F();
            try {
                bgh c = workDatabase.t().c(bghVar.a);
                if (c == null) {
                    bbz.e();
                    String str = "Skipping scheduling " + bghVar.a + " because it's no longer in the DB";
                    workDatabase.l();
                } else if (c.p != 1) {
                    bbz.e();
                    String str2 = "Skipping scheduling " + bghVar.a + " because it is no longer enqueued";
                    workDatabase.l();
                } else {
                    bfu c2 = workDatabase.w().c(bghVar.a);
                    if (c2 != null) {
                        a = c2.b;
                    } else {
                        bbj bbjVar = this.c.b;
                        a = bhdVar.a(bbjVar.f, bbjVar.g);
                    }
                    if (c2 == null) {
                        this.c.c.w().a(new bfu(bghVar.a, a));
                    }
                    a(bghVar, a);
                    if (Build.VERSION.SDK_INT == 23 && (i = i(this.a, this.b, bghVar.a)) != null) {
                        int indexOf = i.indexOf(Integer.valueOf(a));
                        if (indexOf >= 0) {
                            i.remove(indexOf);
                        }
                        if (i.isEmpty()) {
                            bbj bbjVar2 = this.c.b;
                            a2 = bhdVar.a(bbjVar2.f, bbjVar2.g);
                        } else {
                            a2 = i.get(0).intValue();
                        }
                        a(bghVar, a2);
                    }
                    workDatabase.l();
                }
                workDatabase.k();
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
    }

    @Override // defpackage.bcx
    public final void c(String str) {
        List<Integer> i = i(this.a, this.b, str);
        if (i == null || i.isEmpty()) {
            return;
        }
        for (Integer num : i) {
            g(this.b, num.intValue());
        }
        this.c.c.w().b(str);
    }

    @Override // defpackage.bcx
    public final boolean d() {
        return true;
    }
}
