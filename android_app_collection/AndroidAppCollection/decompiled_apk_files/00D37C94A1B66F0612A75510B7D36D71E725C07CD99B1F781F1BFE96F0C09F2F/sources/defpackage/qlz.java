package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: qlz  reason: default package */
/* loaded from: classes4.dex */
public final class qlz {
    public static long a;
    public String b;
    public String c;
    public long d = a;
    public int e = 1;
    public String f;
    public int g;
    public String h;
    public int i;

    static {
        new qpu("ApplicationAnalyticsSession");
        a = System.currentTimeMillis();
    }

    private qlz() {
    }

    public static qlz a() {
        qlz qlzVar = new qlz();
        a++;
        return qlzVar;
    }

    public static qlz b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        qlz qlzVar = new qlz();
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        qlzVar.b = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        qlzVar.c = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        qlzVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        qlzVar.e = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        qlzVar.f = sharedPreferences.getString("receiver_session_id", "");
        qlzVar.g = sharedPreferences.getInt("device_capabilities", 0);
        qlzVar.h = sharedPreferences.getString("device_model_name", "");
        qlzVar.i = sharedPreferences.getInt("analytics_session_start_type", 0);
        return qlzVar;
    }
}
