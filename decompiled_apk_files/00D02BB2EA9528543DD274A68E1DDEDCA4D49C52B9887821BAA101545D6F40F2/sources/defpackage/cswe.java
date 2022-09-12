package defpackage;

import android.content.Context;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@Deprecated
/* renamed from: cswe  reason: default package */
/* loaded from: classes5.dex */
public final class cswe {
    private static cswe aD;
    public final cxju<Boolean> A;
    public final cxju<Boolean> B;
    public final cxju<Boolean> C;
    public final cxju<Boolean> D;
    public final cxju<Boolean> E;
    public final cxju<Boolean> F;
    public final cxju<Boolean> G;
    public final cxju<Boolean> H;
    public final cxju<Boolean> I;
    public final cxju<Boolean> J;
    public final cxju<Boolean> K;
    public final cxju<Boolean> L;
    public final cxju<Boolean> M;
    public final cxju<Boolean> N;
    public final cxju<Boolean> O;
    public final cxju<Boolean> P;
    public final cxju<Boolean> Q;
    public final cxju<Integer> R;
    public final cxju<Boolean> S;
    public final cxju<Long> T;
    public final cxju<Integer> U;
    public final cxju<Long> V;
    public final cxju<Long> W;
    public final cxju<Integer> X;
    public final cxju<Long> Y;
    public final cxju<Long> Z;
    public final cxju<String> a;
    public final cxju<Boolean> aA;
    public final cxju<Boolean> aB;
    public final cxju<Boolean> aC;
    public final cxju<Integer> aa;
    public final cxju<Boolean> ab;
    public final cxju<Integer> ac;
    public final cxju<Integer> ad;
    public final cxju<Integer> ae;
    public final cxju<Double> af;
    public final cxju<Double> ag;
    public final cxju<Integer> ah;
    public final cxju<Integer> ai;
    public final cxju<Integer> aj;
    public final cxju<Integer> ak;
    public final cxju<Integer> al;
    public final cxju<Integer> am;
    public final cxju<Integer> an;
    public final cxju<Boolean> ao;
    public final cxju<Boolean> ap;
    public final cxju<Boolean> aq;
    public final cxju<Boolean> ar;
    public final cxju<Long> as;
    public final cxju<Boolean> at;
    public final cxju<Long> au;
    public final cxju<Boolean> av;
    public final cxju<Boolean> aw;
    public final cxju<Boolean> ax;
    public final cxju<Boolean> ay;
    public final cxju<Boolean> az;
    public final cxju<Boolean> b;
    public final cxju<Boolean> c;
    public final cxju<Boolean> d;
    public final cxju<Long> e;
    public final cxju<Long> f;
    public final cxju<Long> g;
    public final cxju<Long> h;
    public final cxju<Long> i;
    public final cxju<Long> j;
    public final cxju<Boolean> k;
    public final cxju<Integer> l;
    public final cxju<Integer> m;
    public final cxju<Integer> n;
    public final cxju<Integer> o;
    public final cxju<Integer> p;
    public final cxju<Boolean> q;
    public final cxju<Long> r;
    public final cxju<Long> s;
    public final cxju<Long> t;
    public final cxju<Long> u;
    public final cxju<Long> v;
    public final cxju<Long> w;
    public final cxju<Long> x;
    public final cxju<Boolean> y;
    public final cxju<Boolean> z;

    private cswe(Context context) {
        cxjs cxjsVar = new cxjs(cxjd.a(csvx.a(context)));
        this.a = cxju.j(cxjsVar, "scotty_url", "https://instantmessaging-pa.googleapis.com/upload", false);
        this.b = cxjsVar.d("pull_messages_when_stream_open", true);
        this.c = cxjsVar.d("ensure_stream_open_when_pull_messages", true);
        this.d = cxjsVar.d("ensure_stream_open_on_complete", true);
        this.e = cswa.a("delay_to_open_stream_when_pull_messages_millis", TimeUnit.SECONDS.toMillis(3L), cxjsVar);
        this.f = cswa.a("delay_to_pull_messages_if_stream_open_millis", TimeUnit.SECONDS.toMillis(3L), cxjsVar);
        this.g = cswa.a("stream_check_interval_millis", TimeUnit.SECONDS.toMillis(30L), cxjsVar);
        this.R = cxjsVar.e("minimum_pull_period_seconds", 60);
        this.h = cswa.a("stop_stream_grace_period_ms", TimeUnit.SECONDS.toMillis(15L), cxjsVar);
        this.i = cswa.a("token_expiry_window_in_millis", TimeUnit.HOURS.toMillis(1L), cxjsVar);
        this.j = cswa.a("max_token_validity_window_in_millis", TimeUnit.DAYS.toMillis(7L), cxjsVar);
        this.k = cxjsVar.d("refresh_token_in_get_account_context", false);
        this.l = cxjsVar.e("default_message_query_limit", 40);
        this.m = cxjsVar.e("fixed_filtered_query_batch_size", -1);
        this.n = cxjsVar.e("filtered_query_batch_multiplier", 1);
        cxjsVar.e("default_conversation_query_limit", 40);
        this.o = cxjsVar.e("default_blocks_query_limit", 40);
        this.p = cxjsVar.e("monitor_cache_size_support_0", 0);
        this.q = cxjsVar.d("enable_live_data_support", false);
        this.r = cswa.a("block_list_refresh_interval_millis", TimeUnit.HOURS.toMillis(24L), cxjsVar);
        this.s = cswa.a("stale_sending_time_ms", TimeUnit.SECONDS.toMillis(180L), cxjsVar);
        this.t = cswa.a("sending_message_time_offset_ms", TimeUnit.DAYS.toMillis(1L), cxjsVar);
        this.u = cswa.a("max_stale_receipt_retry_time_ms", TimeUnit.DAYS.toMillis(7L), cxjsVar);
        this.v = cswa.a("delivery_receipt_retry_time_ms", TimeUnit.MINUTES.toMillis(5L), cxjsVar);
        this.w = cswa.a("receipt_batch_time_ms", TimeUnit.SECONDS.toMillis(3L), cxjsVar);
        this.x = cswa.a("ack_batch_time_ms", TimeUnit.SECONDS.toMillis(3L), cxjsVar);
        this.y = cxjsVar.d("should_handle_read_notifications", false);
        this.z = cxjsVar.d("enable_notifications_storage", true);
        this.A = cxjsVar.d("enable_periodic_pull_messages", false);
        this.B = cxjsVar.d("queue_send_messages", true);
        this.C = cxjsVar.d("sync_block_on_message", true);
        this.D = cxjsVar.d("conversation_list_enable_pagination_after_fix", true);
        this.E = cxjsVar.d("enable_fail_to_deliver_receipts", true);
        this.F = cxjsVar.d("send_delivery_receipts_on_notification", true);
        this.G = cxjsVar.d("send_delivery_receipts_on_download", true);
        this.H = cxjsVar.d("enable_delivery_receipt_retry", true);
        this.I = cxjsVar.d("handle_add_group_users_push", true);
        this.J = cxjsVar.d("handle_kick_group_users_push", true);
        this.K = cxjsVar.d("handle_create_group_push", true);
        this.L = cxjsVar.d("enable_send_conversation_intent_opened", true);
        this.M = cxjsVar.d("enable_suggestion_chip_second_line_parsing", false);
        this.N = cxjsVar.d("enable_suggestion_hint_text_parsing", false);
        cxjsVar.d("enable_overlay_deactivate_conversation", true);
        this.O = cxjsVar.d("enable_profile_label_styles", true);
        this.P = cxjsVar.d("enable_unsupported_message_handling", true);
        this.Q = cxjsVar.d("enable_composed_overlay_action", false);
        this.Y = cswa.a("bitmap_download_connection_timeout_millis", TimeUnit.SECONDS.toMillis(15L), cxjsVar);
        this.Z = cswa.a("bitmap_download_read_timeout_millis", TimeUnit.SECONDS.toMillis(30L), cxjsVar);
        this.aa = cxjsVar.e("maximum_avatar_dimension_pixels", 256);
        this.S = cxjsVar.d("enable_capabilities", false);
        this.T = cswa.a("conversation_properties_freshness_interval_millis", TimeUnit.HOURS.toMillis(24L), cxjsVar);
        this.U = cxjsVar.e("conversation_properties_refresh_jitter_millis", decl.b(TimeUnit.HOURS.toMillis(2L)));
        this.V = cswa.a("register_capabilities_check_change_interval_millis", TimeUnit.HOURS.toMillis(24L), cxjsVar);
        this.W = cswa.a("register_capabilities_report_anyway_interval_millis", TimeUnit.DAYS.toMillis(30L), cxjsVar);
        this.X = cxjsVar.e("register_capabilities_refresh_jitter_millis", decl.b(TimeUnit.HOURS.toMillis(2L)));
        this.ab = cxjsVar.d("advanced_fallback_enabled", true);
        this.ac = cxjsVar.e("image_compression_min_image_quality", 69);
        this.ad = cxjsVar.e("image_compression_min_thumbnail_quality", 30);
        this.ae = cxjsVar.e("image_compression_max_image_quality", 100);
        this.af = cxjsVar.f("image_compression_downscale_factor", Math.sqrt(0.5d));
        this.ag = cxjsVar.f("image_compression_fast_exit_threshold", 0.949999988079071d);
        this.ah = cxjsVar.e("image_compressiong_max_image_dimension", 8192);
        this.ai = cxjsVar.e("max_thumbnail_size_bytes", 16384);
        this.aj = cxjsVar.e("max_thumbnail_size_width", 1296);
        this.ak = cxjsVar.e("max_thumbnail_size_height", 972);
        this.al = cxjsVar.e("max_image_size_bytes", ImageMetadata.SHADING_MODE);
        this.am = cxjsVar.e("max_image_size_width", 2592);
        this.an = cxjsVar.e("max_image_size_height", 1944);
        cxjsVar.d("enable_android_restricted_api_key_auth", false);
        this.ao = cxjsVar.d("enable_grpc_preemptive_connect", false);
        this.ap = cxjsVar.d("enable_custom_channel_builder", false);
        this.aq = cxjsVar.d("enable_unauthenticated_fast_path", true);
        this.ar = cxjsVar.d("enable_lighter_intent_welcome_message", false);
        this.as = cswa.a("welcome_message_latency", 0L, cxjsVar);
        this.at = cxjsVar.d("enable_lighter_intent_profile", false);
        this.au = cswa.a("profile_load_latency", 0L, cxjsVar);
        this.av = cxjsVar.d("log_upload_account_name", true);
        this.aw = cxjsVar.d("enable_link_click_logging", false);
        this.ax = cxjsVar.d("enable_action_callback_failure_handling", false);
        this.ay = cxjsVar.d("enable_action_callback_failure_parsing", false);
        this.az = cxjsVar.d("enable_header_buttons_from_profile", false);
        this.aA = cxjsVar.d("enable_copy_functionality_for_text", false);
        this.aB = cxjsVar.d("refreshes_after_conversation_opened_intent_enabled", false);
        this.aC = cxjsVar.d("show_call_button_on_header", false);
    }

    public static synchronized cswe a(Context context) {
        cswe csweVar;
        synchronized (cswe.class) {
            csweVar = aD;
            if (csweVar == null) {
                csweVar = new cswe(context.getApplicationContext());
                aD = csweVar;
            }
        }
        return csweVar;
    }

    public static <T> dehn<T> b(final cxju<T> cxjuVar, dehp dehpVar) {
        cxjuVar.getClass();
        return dehpVar.c(new Callable(cxjuVar) { // from class: cswb
            private final cxju a;

            {
                this.a = cxjuVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.f();
            }
        });
    }
}
