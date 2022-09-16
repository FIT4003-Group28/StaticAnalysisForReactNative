package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bry  reason: default package */
/* loaded from: classes2.dex */
final class bry {
    static {
        bqf.b("Alarms");
    }

    public static void a(Context context, brq brqVar, String str) {
        bua r = brqVar.d.r();
        btx a = r.a(str);
        if (a != null) {
            c(context, str, a.b);
            bqf a2 = bqf.a();
            String.format("Removing SystemIdInfo for workSpecId (%s)", str);
            a2.d(new Throwable[0]);
            r.c(str);
        }
    }

    public static void b(Context context, brq brqVar, String str, long j) {
        int a;
        WorkDatabase workDatabase = brqVar.d;
        bua r = workDatabase.r();
        btx a2 = r.a(str);
        if (a2 != null) {
            c(context, str, a2.b);
            d(context, str, a2.b, j);
            return;
        }
        bvh bvhVar = new bvh(workDatabase);
        synchronized (bvh.class) {
            a = bvhVar.a("next_alarm_manager_id");
        }
        r.b(new btx(str, a));
        d(context, str, a, j);
    }

    private static void c(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, brz.c(context, str), 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        bqf a = bqf.a();
        String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i));
        a.d(new Throwable[0]);
        alarmManager.cancel(service);
    }

    private static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, brz.c(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
