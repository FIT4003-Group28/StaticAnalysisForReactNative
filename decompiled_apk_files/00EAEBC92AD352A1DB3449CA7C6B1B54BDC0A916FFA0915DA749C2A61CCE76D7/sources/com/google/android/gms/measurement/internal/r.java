package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class r {
    public static s3<Long> A;
    public static s3<Boolean> A0;
    public static s3<Long> B;
    public static s3<Boolean> B0;
    public static s3<Integer> C;
    public static s3<Boolean> C0;
    public static s3<Long> D;
    public static s3<Boolean> D0;
    public static s3<Integer> E;
    public static s3<Boolean> E0;
    public static s3<Integer> F;
    public static s3<Boolean> F0;
    public static s3<Integer> G;
    public static s3<Boolean> G0;
    public static s3<Integer> H;
    public static s3<Boolean> H0;
    public static s3<Integer> I;
    public static s3<Boolean> I0;
    public static s3<Long> J;
    public static s3<Boolean> J0;
    public static s3<Boolean> K;
    public static s3<Boolean> K0;
    public static s3<String> L;
    public static s3<Boolean> L0;
    public static s3<Long> M;
    public static s3<Boolean> M0;
    public static s3<Integer> N;
    public static s3<Boolean> N0;
    public static s3<Double> O;
    public static s3<Boolean> O0;
    public static s3<Integer> P;
    public static s3<Boolean> P0;
    public static s3<Integer> Q;
    public static s3<Boolean> Q0;
    public static s3<Boolean> R;
    public static s3<Boolean> R0;
    public static s3<Boolean> S;
    public static s3<Long> S0;
    public static s3<Boolean> T;
    public static s3<Boolean> T0;
    public static s3<Boolean> U;
    public static s3<Boolean> V;
    public static s3<Boolean> W;
    public static s3<Boolean> X;
    public static s3<Boolean> Y;
    public static s3<Boolean> Z;

    /* renamed from: a */
    private static List<s3<?>> f7630a = Collections.synchronizedList(new ArrayList());
    public static s3<Boolean> a0;

    /* renamed from: b */
    public static s3<Long> f7631b;
    public static s3<Boolean> b0;

    /* renamed from: c */
    public static s3<Long> f7632c;
    public static s3<Boolean> c0;

    /* renamed from: d */
    public static s3<Long> f7633d;
    public static s3<Boolean> d0;

    /* renamed from: e */
    public static s3<String> f7634e;
    public static s3<Boolean> e0;

    /* renamed from: f */
    public static s3<String> f7635f;
    public static s3<Boolean> f0;

    /* renamed from: g */
    public static s3<Integer> f7636g;
    public static s3<Boolean> g0;

    /* renamed from: h */
    public static s3<Integer> f7637h;
    public static s3<Boolean> h0;
    public static s3<Integer> i;
    public static s3<Boolean> i0;
    public static s3<Integer> j;
    public static s3<Boolean> j0;
    public static s3<Integer> k;
    public static s3<Boolean> k0;
    public static s3<Integer> l;
    public static s3<Boolean> l0;
    public static s3<Integer> m;
    public static s3<Boolean> m0;
    public static s3<Integer> n;
    public static s3<Boolean> n0;
    public static s3<Integer> o;
    public static s3<Boolean> o0;
    public static s3<Integer> p;
    public static s3<Boolean> p0;
    public static s3<String> q;
    public static s3<Boolean> q0;
    public static s3<Long> r;
    public static s3<Boolean> r0;
    public static s3<Long> s;
    public static s3<Boolean> s0;
    public static s3<Long> t;
    public static s3<Boolean> t0;
    public static s3<Long> u;
    public static s3<Boolean> u0;
    public static s3<Long> v;
    public static s3<Boolean> v0;
    public static s3<Long> w;
    public static s3<Boolean> w0;
    public static s3<Long> x;
    public static s3<Boolean> x0;
    public static s3<Long> y;
    public static s3<Boolean> y0;
    public static s3<Long> z;
    public static s3<Boolean> z0;

    static {
        Collections.synchronizedSet(new HashSet());
        f7631b = a("measurement.ad_id_cache_time", 10000L, 10000L, u.f7715a);
        f7632c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, t.f7696a);
        f7633d = a("measurement.config.cache_time", 86400000L, 3600000L, h0.f7339a);
        f7634e = a("measurement.config.url_scheme", "https", "https", q0.f7596a);
        f7635f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", e1.f7263a);
        f7636g = a("measurement.upload.max_bundles", 100, 100, n1.f7514a);
        f7637h = a("measurement.upload.max_batch_size", 65536, 65536, a2.f7158a);
        i = a("measurement.upload.max_bundle_size", 65536, 65536, k2.f7415a);
        Integer valueOf = Integer.valueOf((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        j = a("measurement.upload.max_events_per_bundle", valueOf, valueOf, x2.f7774a);
        k = a("measurement.upload.max_events_per_day", 100000, 100000, h3.f7342a);
        l = a("measurement.upload.max_error_events_per_day", valueOf, valueOf, w.f7744a);
        m = a("measurement.upload.max_public_events_per_day", 50000, 50000, v.f7730a);
        n = a("measurement.upload.max_conversions_per_day", 10000, 10000, y.f7792a);
        o = a("measurement.upload.max_realtime_events_per_day", 10, 10, x.f7771a);
        p = a("measurement.store.max_stored_events_per_app", 100000, 100000, a0.f7156a);
        q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", z.f7822a);
        r = a("measurement.upload.backoff_period", 43200000L, 43200000L, d0.f7231a);
        s = a("measurement.upload.window_interval", 3600000L, 3600000L, c0.f7201a);
        t = a("measurement.upload.interval", 3600000L, 3600000L, f0.f7281a);
        u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, e0.f7262a);
        v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, g0.f7310a);
        w = a("measurement.upload.minimum_delay", 500L, 500L, j0.f7386a);
        x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, i0.f7349a);
        y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, l0.f7445a);
        z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, k0.f7413a);
        A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, n0.f7513a);
        B = a("measurement.upload.retry_time", 1800000L, 1800000L, m0.f7480a);
        C = a("measurement.upload.retry_count", 6, 6, p0.f7573a);
        D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, o0.f7541a);
        E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, r0.f7638a);
        F = a("measurement.audience.filter_result_max_count", 200, 200, t0.f7697a);
        G = a("measurement.upload.max_public_user_properties", 25, 25, null);
        H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        I = a("measurement.upload.max_public_event_params", 25, 25, null);
        J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, s0.f7669a);
        K = a("measurement.test.boolean_flag", false, false, v0.f7731a);
        L = a("measurement.test.string_flag", "---", "---", u0.f7716a);
        M = a("measurement.test.long_flag", -1L, -1L, x0.f7772a);
        N = a("measurement.test.int_flag", -2, -2, w0.f7745a);
        Double valueOf2 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf2, valueOf2, z0.f7823a);
        P = a("measurement.experiment.max_ids", 50, 50, y0.f7793a);
        Q = a("measurement.max_bundles_per_iteration", 2, 2, b1.f7181a);
        R = a("measurement.validation.internal_limits_internal_event_params", false, false, a1.f7157a);
        S = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", true, true, d1.f7232a);
        T = a("measurement.collection.firebase_global_collection_flag_enabled", true, true, g1.f7311a);
        U = a("measurement.collection.efficient_engagement_reporting_enabled_2", true, true, f1.f7282a);
        V = a("measurement.collection.redundant_engagement_removal_enabled", false, false, i1.f7350a);
        W = a("measurement.client.freeride_engagement_fix", true, true, h1.f7340a);
        X = a("measurement.experiment.enable_experiment_reporting", true, true, k1.f7414a);
        Y = a("measurement.collection.log_event_and_bundle_v2", true, true, j1.f7387a);
        Z = a("measurement.quality.checksum", false, false, null);
        a0 = a("measurement.sdk.dynamite.allow_remote_dynamite2", false, false, m1.f7481a);
        b0 = a("measurement.sdk.collection.validate_param_names_alphabetical", true, true, l1.f7446a);
        c0 = a("measurement.collection.event_safelist", true, true, o1.f7542a);
        a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, q1.f7597a);
        d0 = a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, p1.f7574a);
        e0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, s1.f7670a);
        f0 = a("measurement.audience.refresh_event_count_filters_timestamp", false, false, r1.f7639a);
        g0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, u1.f7717a);
        h0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, t1.f7698a);
        i0 = a("measurement.sdk.collection.last_deep_link_referrer2", true, true, w1.f7746a);
        j0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, v1.f7732a);
        k0 = a("measurement.sdk.collection.last_gclid_from_referrer2", false, false, y1.f7794a);
        l0 = a("measurement.sdk.collection.enable_extend_user_property_size", true, true, x1.f7773a);
        m0 = a("measurement.upload.file_lock_state_check", false, false, z1.f7824a);
        n0 = a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, c2.f7205a);
        o0 = a("measurement.ga.ga_app_id", false, false, b2.f7182a);
        p0 = a("measurement.lifecycle.app_backgrounded_tracking", true, true, f2.f7283a);
        q0 = a("measurement.lifecycle.app_in_background_parameter", false, false, e2.f7264a);
        r0 = a("measurement.integration.disable_firebase_instance_id", false, false, h2.f7341a);
        s0 = a("measurement.lifecycle.app_backgrounded_engagement", false, false, g2.f7312a);
        t0 = a("measurement.collection.service.update_with_analytics_fix", false, false, j2.f7388a);
        u0 = a("measurement.service.use_appinfo_modified", false, false, i2.f7351a);
        v0 = a("measurement.client.firebase_feature_rollout.v1.enable", true, true, l2.f7447a);
        w0 = a("measurement.client.sessions.check_on_reset_and_enable2", true, true, n2.f7515a);
        x0 = a("measurement.config.string.always_update_disk_on_set", true, true, m2.f7482a);
        y0 = a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, p2.f7575a);
        z0 = a("measurement.upload.file_truncate_fix", false, false, o2.f7543a);
        A0 = a("measurement.engagement_time_main_thread", true, true, r2.f7640a);
        B0 = a("measurement.sdk.referrer.delayed_install_referrer_api", false, false, q2.f7598a);
        C0 = a("measurement.sdk.screen.disabling_automatic_reporting", false, false, t2.f7699a);
        D0 = a("measurement.sdk.screen.manual_screen_view_logging", false, false, s2.f7671a);
        E0 = a("measurement.gold.enhanced_ecommerce.format_logs", true, true, v2.f7733a);
        F0 = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true, true, u2.f7718a);
        G0 = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true, true, w2.f7747a);
        H0 = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true, true, z2.f7825a);
        I0 = a("measurement.gold.enhanced_ecommerce.updated_schema.client", true, true, y2.f7795a);
        J0 = a("measurement.gold.enhanced_ecommerce.updated_schema.service", true, true, b3.f7183a);
        a("measurement.collection.synthetic_data_mitigation", false, false, a3.f7159a);
        K0 = a("measurement.service.configurable_service_limits", false, false, d3.f7233a);
        L0 = a("measurement.client.configurable_service_limits", false, false, c3.f7206a);
        M0 = a("measurement.androidId.delete_feature", true, true, g3.f7313a);
        N0 = a("measurement.client.global_params.dev", false, false, f3.f7284a);
        O0 = a("measurement.service.global_params", false, false, i3.f7352a);
        P0 = a("measurement.service.global_params_in_payload", true, true, k3.f7416a);
        Q0 = a("measurement.client.string_reader", true, true, j3.f7389a);
        R0 = a("measurement.sdk.attribution.cache", true, true, m3.f7483a);
        S0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, l3.f7448a);
        T0 = a("measurement.service.database_return_empty_collection", true, true, o3.f7544a);
    }

    private static <V> s3<V> a(String str, V v2, V v3, q3<V> q3Var) {
        s3<V> s3Var = new s3<>(str, v2, v3, q3Var);
        f7630a.add(s3Var);
        return s3Var;
    }

    public static Map<String, String> a(Context context) {
        c.e.a.b.d.g.w1 a2 = c.e.a.b.d.g.w1.a(context.getContentResolver(), c.e.a.b.d.g.l2.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.a();
    }
}
