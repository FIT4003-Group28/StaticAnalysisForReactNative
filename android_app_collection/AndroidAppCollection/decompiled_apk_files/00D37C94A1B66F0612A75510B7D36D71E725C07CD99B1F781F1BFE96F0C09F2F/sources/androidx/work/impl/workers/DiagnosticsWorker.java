package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        bqf.b("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static void j(bud budVar, bva bvaVar, bua buaVar, List list) {
        String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bum bumVar = (bum) it.next();
            btx a = buaVar.a(bumVar.c);
            Integer valueOf = a != null ? Integer.valueOf(a.b) : null;
            String str = bumVar.c;
            bku a2 = bku.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                a2.e(1);
            } else {
                a2.f(1, str);
            }
            budVar.a.e();
            Cursor f = ld.f(budVar.a, a2, false);
            try {
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    arrayList.add(f.getString(0));
                }
                f.close();
                a2.i();
                List a3 = bvaVar.a(bumVar.c);
                String join = TextUtils.join(",", arrayList);
                String join2 = TextUtils.join(",", a3);
                Object[] objArr = new Object[6];
                objArr[0] = bumVar.c;
                objArr[1] = bumVar.d;
                objArr[2] = valueOf;
                int i = bumVar.r;
                String d = adz.d(i);
                if (i == 0) {
                    throw null;
                }
                objArr[3] = d;
                objArr[4] = join;
                objArr[5] = join2;
                String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", objArr);
            } catch (Throwable th) {
                f.close();
                a2.i();
                throw th;
            }
        }
    }

    @Override // androidx.work.Worker
    public final adz i() {
        bku bkuVar;
        bua buaVar;
        bud budVar;
        bva bvaVar;
        int i;
        WorkDatabase workDatabase = brq.h(this.a).d;
        bun n = workDatabase.n();
        bud s = workDatabase.s();
        bva u = workDatabase.u();
        bua r = workDatabase.r();
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(1L);
        bku a = bku.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        a.d(1, currentTimeMillis - millis);
        bux buxVar = (bux) n;
        buxVar.a.e();
        Cursor f = ld.f(buxVar.a, a, false);
        try {
            int h = ld.h(f, "required_network_type");
            int h2 = ld.h(f, "requires_charging");
            int h3 = ld.h(f, "requires_device_idle");
            int h4 = ld.h(f, "requires_battery_not_low");
            int h5 = ld.h(f, "requires_storage_not_low");
            int h6 = ld.h(f, "trigger_content_update_delay");
            int h7 = ld.h(f, "trigger_max_content_delay");
            int h8 = ld.h(f, "content_uri_triggers");
            int h9 = ld.h(f, "id");
            int h10 = ld.h(f, "state");
            int h11 = ld.h(f, "worker_class_name");
            int h12 = ld.h(f, "input_merger_class_name");
            int h13 = ld.h(f, "input");
            int h14 = ld.h(f, "output");
            bkuVar = a;
            try {
                int h15 = ld.h(f, "initial_delay");
                int h16 = ld.h(f, "interval_duration");
                int h17 = ld.h(f, "flex_duration");
                int h18 = ld.h(f, "run_attempt_count");
                int h19 = ld.h(f, "backoff_policy");
                int h20 = ld.h(f, "backoff_delay_duration");
                int h21 = ld.h(f, "period_start_time");
                int h22 = ld.h(f, "minimum_retention_duration");
                int h23 = ld.h(f, "schedule_requested_at");
                int h24 = ld.h(f, "run_in_foreground");
                int h25 = ld.h(f, "out_of_quota_policy");
                int i2 = h14;
                ArrayList arrayList = new ArrayList(f.getCount());
                while (f.moveToNext()) {
                    String string = f.getString(h9);
                    int i3 = h9;
                    String string2 = f.getString(h11);
                    int i4 = h11;
                    bpu bpuVar = new bpu();
                    int i5 = h;
                    bpuVar.i = aeh.f(f.getInt(h));
                    bpuVar.b = f.getInt(h2) != 0;
                    bpuVar.c = f.getInt(h3) != 0;
                    bpuVar.d = f.getInt(h4) != 0;
                    bpuVar.e = f.getInt(h5) != 0;
                    int i6 = h2;
                    bpuVar.f = f.getLong(h6);
                    bpuVar.g = f.getLong(h7);
                    bpuVar.h = aeh.c(f.getBlob(h8));
                    bum bumVar = new bum(string, string2);
                    bumVar.r = aeh.g(f.getInt(h10));
                    bumVar.e = f.getString(h12);
                    bumVar.f = bpx.a(f.getBlob(h13));
                    int i7 = i2;
                    bumVar.g = bpx.a(f.getBlob(i7));
                    int i8 = h10;
                    i2 = i7;
                    int i9 = h15;
                    bumVar.h = f.getLong(i9);
                    int i10 = h12;
                    int i11 = h16;
                    bumVar.i = f.getLong(i11);
                    int i12 = h13;
                    int i13 = h17;
                    bumVar.j = f.getLong(i13);
                    int i14 = h18;
                    bumVar.l = f.getInt(i14);
                    int i15 = h19;
                    bumVar.s = aeh.e(f.getInt(i15));
                    h17 = i13;
                    int i16 = h20;
                    bumVar.m = f.getLong(i16);
                    int i17 = h21;
                    bumVar.n = f.getLong(i17);
                    h21 = i17;
                    int i18 = h22;
                    bumVar.o = f.getLong(i18);
                    h22 = i18;
                    int i19 = h23;
                    bumVar.p = f.getLong(i19);
                    int i20 = h24;
                    bumVar.q = f.getInt(i20) != 0;
                    int i21 = h25;
                    bumVar.t = aeh.h(f.getInt(i21));
                    bumVar.k = bpuVar;
                    arrayList.add(bumVar);
                    h25 = i21;
                    h10 = i8;
                    h12 = i10;
                    h23 = i19;
                    h11 = i4;
                    h2 = i6;
                    h = i5;
                    h24 = i20;
                    h15 = i9;
                    h9 = i3;
                    h20 = i16;
                    h13 = i12;
                    h16 = i11;
                    h18 = i14;
                    h19 = i15;
                }
                f.close();
                bkuVar.i();
                List b = n.b();
                List i22 = n.i();
                if (!arrayList.isEmpty()) {
                    bqf.a();
                    i = 0;
                    bqf.f(new Throwable[0]);
                    bqf.a();
                    buaVar = r;
                    budVar = s;
                    bvaVar = u;
                    j(budVar, bvaVar, buaVar, arrayList);
                    bqf.f(new Throwable[0]);
                } else {
                    buaVar = r;
                    budVar = s;
                    bvaVar = u;
                    i = 0;
                }
                if (!b.isEmpty()) {
                    bqf.a();
                    bqf.f(new Throwable[i]);
                    bqf.a();
                    j(budVar, bvaVar, buaVar, b);
                    bqf.f(new Throwable[i]);
                }
                if (!i22.isEmpty()) {
                    bqf.a();
                    bqf.f(new Throwable[i]);
                    bqf.a();
                    j(budVar, bvaVar, buaVar, i22);
                    bqf.f(new Throwable[i]);
                }
                return adz.i();
            } catch (Throwable th) {
                th = th;
                f.close();
                bkuVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bkuVar = a;
        }
    }
}
