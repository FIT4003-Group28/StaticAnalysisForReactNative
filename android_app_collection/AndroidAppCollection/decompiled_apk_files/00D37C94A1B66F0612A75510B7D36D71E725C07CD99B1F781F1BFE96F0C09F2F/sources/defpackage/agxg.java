package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agxg  reason: default package */
/* loaded from: classes.dex */
public final class agxg {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static void A(agpw agpwVar, String str) {
        agpwVar.j("disco_session_nonce", str);
    }

    public static void B(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(zhn.p("offline_active_transfers_%s", str), z).apply();
    }

    public static void C(agpw agpwVar, boolean z) {
        agpwVar.f("sd_card_offline_disk_error", z);
    }

    public static void D(agpw agpwVar, boolean z) {
        agpwVar.f("is_sync", z);
    }

    public static void E(agpw agpwVar, boolean z) {
        agpwVar.f("triggered_by_refresh", z);
    }

    public static void F(agpw agpwVar, boolean z) {
        agpwVar.f("is_truncated_hash", z);
    }

    public static void G(agpw agpwVar, boolean z) {
        agpwVar.f("user_triggered", z);
    }

    public static void H(agpw agpwVar, byte[] bArr) {
        agpwVar.g("logging_params", bArr);
    }

    public static void I(agpw agpwVar, int i) {
        agpwVar.h("max_retries", i);
    }

    public static void J(agpw agpwVar, long j) {
        agpwVar.i("max_retry_milli_secs", j);
    }

    public static void K(agpw agpwVar, String str) {
        agpwVar.j("audio_track_id", str);
    }

    public static void L(agpw agpwVar, int i) {
        agpwVar.h("offline_digest_store_level", i);
    }

    public static void M(agpw agpwVar, int i) {
        agpwVar.h("stream_quality", i);
    }

    public static void N(agpw agpwVar, String str) {
        agpwVar.j("playlist_id", str);
    }

    public static void O(agpw agpwVar, boolean z) {
        agpwVar.f("requireTimeWindow", z);
    }

    public static void P(agpw agpwVar, agqe agqeVar) {
        agpwVar.h("running_media_status", agqeVar.q);
    }

    public static void Q(agpw agpwVar, long j) {
        agpwVar.i("storage_bytes_read", j);
    }

    public static void R(agpw agpwVar, long j) {
        agpwVar.i("transfer_added_time_millis", j);
    }

    public static void S(agpw agpwVar, String str) {
        agpwVar.j("transfer_nonce", str);
    }

    public static void T(agpw agpwVar, int i) {
        agpwVar.h("retry_strategy", i);
    }

    public static void U(agpw agpwVar, double d) {
        synchronized (((agqy) agpwVar).a) {
            ((agqy) agpwVar).a.put("bytes_per_sec", Double.valueOf(d));
        }
    }

    public static void V(agpw agpwVar, int i) {
        agpwVar.h("transfer_type", i);
    }

    public static void W(agpw agpwVar, boolean z) {
        agpwVar.f("use_cached_disco", z);
    }

    public static void X(agpw agpwVar, String str) {
        agpwVar.j("video_id", str);
    }

    public static void Y(agpw agpwVar, String str) {
        agpwVar.j("video_list_id", str);
    }

    public static boolean Z(agpw agpwVar) {
        return agpwVar.k("sd_card_offline_disk_error");
    }

    public static int a(agpw agpwVar) {
        return agpwVar.a("max_retries", 35);
    }

    public static boolean aa(agpw agpwVar) {
        return agpwVar.l("is_sync", false);
    }

    public static boolean ab(agpw agpwVar) {
        return agpwVar.l("triggered_by_refresh", false);
    }

    public static boolean ac(agpw agpwVar) {
        return agpwVar.l("is_truncated_hash", false);
    }

    public static boolean ad(agpw agpwVar) {
        return agpwVar.l("is_unmetered_5g", false);
    }

    public static boolean ae(agpw agpwVar) {
        return agpwVar.l("user_triggered", true);
    }

    public static boolean af(agpw agpwVar) {
        return agpwVar.l("requireTimeWindow", false);
    }

    public static boolean ag(agpw agpwVar) {
        return agpwVar.k("use_cached_disco");
    }

    public static boolean ah(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(zhn.p("offline_active_transfers_%s", str), true);
    }

    public static boolean ai(agqz agqzVar) {
        int f = f(agqzVar.f);
        return f == 1 || f == 4 || f == 7 || f == 6;
    }

    public static byte[] aj(agpw agpwVar) {
        return agpwVar.m("click_tracking_params");
    }

    public static byte[] ak(agpw agpwVar) {
        return agpwVar.m("logging_params");
    }

    public static void al(agpw agpwVar) {
        agpwVar.f("is_unmetered_5g", true);
    }

    public static int am(agpw agpwVar) {
        return akel.av(agpwVar.a("offline_audio_quality", 0));
    }

    public static void an(agpw agpwVar, int i) {
        agpwVar.h("offline_audio_quality", i - 1);
    }

    public static int b(agpw agpwVar) {
        return agpwVar.a("stream_verification_attempts", 0);
    }

    public static int c(agpw agpwVar) {
        return agpwVar.a("offline_digest_store_level", -1);
    }

    public static int d(agpw agpwVar) {
        return ((agqy) agpwVar).a("stream_quality", 0);
    }

    public static int e(agpw agpwVar) {
        return agpwVar.a("retry_strategy", 1);
    }

    public static int f(agpw agpwVar) {
        return agpwVar.a("transfer_type", 0);
    }

    public static long g(agpw agpwVar) {
        return agpwVar.c("back_off_total_millis", 0L);
    }

    public static long h(agpw agpwVar) {
        return agpwVar.c("base_retry_milli_secs", 2000L);
    }

    public static long i(agpw agpwVar) {
        return agpwVar.b("cache_bytes_read");
    }

    public static long j(agpw agpwVar) {
        return agpwVar.b("storage_bytes_read");
    }

    public static long k(agpw agpwVar) {
        return agpwVar.b("transfer_added_time_millis");
    }

    public static agqe l(agpw agpwVar) {
        return agqe.a(agpwVar.a("complete_media_status", agqe.COMPLETE.q));
    }

    public static agqe m(agpw agpwVar) {
        return agqe.a(agpwVar.a("running_media_status", agqe.ACTIVE.q));
    }

    public static String n(agpw agpwVar) {
        return agpwVar.e("disco_session_nonce");
    }

    public static String o(agpw agpwVar) {
        String r = r(agpwVar);
        return TextUtils.isEmpty(r) ? u(agpwVar) : r;
    }

    public static String p(agpw agpwVar) {
        return agpwVar.e("audio_track_id");
    }

    public static String q(agpw agpwVar) {
        return agpwVar.e("partial_playback_nonce");
    }

    public static String r(agpw agpwVar) {
        return agpwVar.e("playlist_id");
    }

    public static String s(agpw agpwVar) {
        return agpwVar.e("transfer_nonce");
    }

    public static String t(agpw agpwVar) {
        return amps.d(agpwVar.e("video_id"));
    }

    public static String u(agpw agpwVar) {
        return agpwVar.e("video_list_id");
    }

    public static void v(agpw agpwVar, long j) {
        long g = g(agpwVar);
        long c = agpwVar.c("back_off_start_millis", -1L);
        if (c >= 0) {
            w(agpwVar, -1L);
            agpwVar.i("back_off_total_millis", g + (j - c));
        }
    }

    public static void w(agpw agpwVar, long j) {
        agpwVar.i("back_off_start_millis", j);
    }

    public static void x(agpw agpwVar, long j) {
        agpwVar.i("base_retry_milli_secs", j);
    }

    public static void y(agpw agpwVar, long j) {
        agpwVar.i("cache_bytes_read", j);
    }

    public static void z(agpw agpwVar, byte[] bArr) {
        agpwVar.g("click_tracking_params", bArr);
    }
}
