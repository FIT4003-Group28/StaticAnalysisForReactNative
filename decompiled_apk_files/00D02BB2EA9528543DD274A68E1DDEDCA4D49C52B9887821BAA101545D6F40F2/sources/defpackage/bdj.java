package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: bdj  reason: default package */
/* loaded from: classes3.dex */
public final class bdj extends bw {
    final Context c;

    public bdj(Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        avuVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (true == sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            avuVar.a();
            try {
                avuVar.m(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                avuVar.m(new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                avuVar.d();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            avuVar.a();
            try {
                avuVar.m(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                avuVar.m(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                avuVar.d();
            } finally {
            }
        }
    }
}
