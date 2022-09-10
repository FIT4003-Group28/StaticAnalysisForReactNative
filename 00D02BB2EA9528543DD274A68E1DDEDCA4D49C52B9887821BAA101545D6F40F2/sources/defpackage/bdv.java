package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bdv  reason: default package */
/* loaded from: classes3.dex */
final class bdv {
    static {
        bbz.f("Alarms");
    }

    public static void a(Context context, bdn bdnVar, String str, long j) {
        int b;
        WorkDatabase workDatabase = bdnVar.c;
        bfx w = workDatabase.w();
        bfu c = w.c(str);
        if (c != null) {
            c(context, str, c.b);
            d(context, str, c.b, j);
            return;
        }
        bhd bhdVar = new bhd(workDatabase);
        synchronized (bhd.class) {
            b = bhdVar.b("next_alarm_manager_id");
        }
        w.a(new bfu(str, b));
        d(context, str, b, j);
    }

    public static void b(Context context, bdn bdnVar, String str) {
        bfx w = bdnVar.c.w();
        bfu c = w.c(str);
        if (c != null) {
            c(context, str, c.b);
            bbz.e().a(new Throwable[0]);
            w.b(str);
        }
    }

    private static void c(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, bdw.c(context, str), 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        bbz.e().a(new Throwable[0]);
        alarmManager.cancel(service);
    }

    private static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, bdw.c(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
