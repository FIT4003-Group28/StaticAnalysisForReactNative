package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bra  reason: default package */
/* loaded from: classes2.dex */
public final class bra {
    static {
        bqf.b("Schedulers");
    }

    public static void b(WorkDatabase workDatabase, List list) {
        bku bkuVar;
        if (list == null || list.size() == 0) {
            return;
        }
        bun n = workDatabase.n();
        workDatabase.f();
        try {
            int a = bps.a();
            bku a2 = bku.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
            a2.d(1, a);
            ((bux) n).a.e();
            Cursor f = ld.f(((bux) n).a, a2, false);
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
                bun bunVar = n;
                int h14 = ld.h(f, "output");
                bkuVar = a2;
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
                    int i = h14;
                    ArrayList<bum> arrayList = new ArrayList(f.getCount());
                    while (f.moveToNext()) {
                        String string = f.getString(h9);
                        int i2 = h9;
                        String string2 = f.getString(h11);
                        int i3 = h11;
                        bpu bpuVar = new bpu();
                        int i4 = h;
                        bpuVar.i = aeh.f(f.getInt(h));
                        bpuVar.b = f.getInt(h2) != 0;
                        bpuVar.c = f.getInt(h3) != 0;
                        bpuVar.d = f.getInt(h4) != 0;
                        bpuVar.e = f.getInt(h5) != 0;
                        int i5 = h2;
                        bpuVar.f = f.getLong(h6);
                        bpuVar.g = f.getLong(h7);
                        bpuVar.h = aeh.c(f.getBlob(h8));
                        bum bumVar = new bum(string, string2);
                        bumVar.r = aeh.g(f.getInt(h10));
                        bumVar.e = f.getString(h12);
                        bumVar.f = bpx.a(f.getBlob(h13));
                        int i6 = i;
                        bumVar.g = bpx.a(f.getBlob(i6));
                        int i7 = h12;
                        int i8 = h15;
                        int i9 = h13;
                        bumVar.h = f.getLong(i8);
                        int i10 = h3;
                        int i11 = h16;
                        bumVar.i = f.getLong(i11);
                        int i12 = h17;
                        bumVar.j = f.getLong(i12);
                        int i13 = h18;
                        bumVar.l = f.getInt(i13);
                        int i14 = h19;
                        i = i6;
                        bumVar.s = aeh.e(f.getInt(i14));
                        h18 = i13;
                        h19 = i14;
                        int i15 = h20;
                        bumVar.m = f.getLong(i15);
                        int i16 = h21;
                        bumVar.n = f.getLong(i16);
                        h21 = i16;
                        int i17 = h22;
                        bumVar.o = f.getLong(i17);
                        h22 = i17;
                        int i18 = h23;
                        bumVar.p = f.getLong(i18);
                        int i19 = h24;
                        bumVar.q = f.getInt(i19) != 0;
                        int i20 = h25;
                        bumVar.t = aeh.h(f.getInt(i20));
                        bumVar.k = bpuVar;
                        arrayList.add(bumVar);
                        h23 = i18;
                        h25 = i20;
                        h12 = i7;
                        h3 = i10;
                        h9 = i2;
                        h11 = i3;
                        h = i4;
                        h17 = i12;
                        h13 = i9;
                        h15 = i8;
                        h16 = i11;
                        h20 = i15;
                        h24 = i19;
                        h2 = i5;
                    }
                    f.close();
                    bkuVar.i();
                    List i21 = bunVar.i();
                    if (arrayList.size() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        for (bum bumVar2 : arrayList) {
                            bun bunVar2 = bunVar;
                            bunVar2.j(bumVar2.c, currentTimeMillis);
                            bunVar = bunVar2;
                        }
                    }
                    workDatabase.h();
                    workDatabase.g();
                    if (arrayList.size() > 0) {
                        bum[] bumVarArr = (bum[]) arrayList.toArray(new bum[arrayList.size()]);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            bqz bqzVar = (bqz) it.next();
                            if (bqzVar.d()) {
                                bqzVar.c(bumVarArr);
                            }
                        }
                    }
                    if (i21.size() <= 0) {
                        return;
                    }
                    bum[] bumVarArr2 = (bum[]) i21.toArray(new bum[i21.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        bqz bqzVar2 = (bqz) it2.next();
                        if (!bqzVar2.d()) {
                            bqzVar2.c(bumVarArr2);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    f.close();
                    bkuVar.i();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bkuVar = a2;
            }
        } catch (Throwable th3) {
            workDatabase.g();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bqz a(Context context, brq brqVar) {
        bqz bqzVar;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                bqzVar = (bqz) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
                bqf a = bqf.a();
                String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler");
                a.d(new Throwable[0]);
            } catch (Throwable th) {
                bqf.a().d(th);
                bqzVar = null;
            }
            bqz bqzVar2 = bqzVar;
            if (bqzVar2 != null) {
                return bqzVar2;
            }
            bsj bsjVar = new bsj(context);
            bvi.a(context, SystemAlarmService.class, true);
            bqf.a().d(new Throwable[0]);
            return bsjVar;
        }
        bsl bslVar = new bsl(context, brqVar);
        bvi.a(context, SystemJobService.class, true);
        bqf.a().d(new Throwable[0]);
        return bslVar;
    }
}
