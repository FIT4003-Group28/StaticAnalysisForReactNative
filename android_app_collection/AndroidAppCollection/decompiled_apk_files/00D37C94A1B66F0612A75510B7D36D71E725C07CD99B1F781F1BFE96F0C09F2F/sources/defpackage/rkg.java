package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: rkg  reason: default package */
/* loaded from: classes4.dex */
public final class rkg {
    public static final rkf A;
    public static final rkf B;
    public static final rkf C;
    public static final rkf D;
    public static final rkf E;
    public static final rkf F;
    public static final rkf G;
    public static final rkf H;
    public static final rkf I;

    /* renamed from: J  reason: collision with root package name */
    public static final rkf f264J;
    public static final rkf K;
    public static final rkf L;
    public static final rkf M;
    public static final rkf N;
    public static final rkf O;
    public static final rkf P;
    public static final rkf Q;
    public static final rkf R;
    public static final rkf S;
    public static final rkf T;
    public static final rkf U;
    public static final rkf V;
    public static final rkf W;
    public static final rkf X;
    public static final rkf Y;
    public static final rkf Z;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final rkf aa;
    public static final rkf ab;
    public static final rkf ac;
    public static final rkf ad;
    public static final rkf ae;
    public static final rkf af;
    public static final rkf ag;
    public static final rkf ah;
    public static final rkf ai;
    public static final rkf aj;
    public static final rkf ak;
    public static final rkf al;
    public static final rkf am;
    public static final rkf an;
    public static final rkf ao;
    public static final rkf ap;
    public static final rkf aq;
    public static final rkf ar;
    public static final rkf as;
    public static final rkf at;
    public static final rkf au;
    public static final rkf av;
    public static final rkf aw;
    public static final rkf ax;
    public static final rkf b;
    public static final rkf c;
    public static final rkf d;
    public static final rkf e;
    public static final rkf f;
    public static final rkf g;
    public static final rkf h;
    public static final rkf i;
    public static final rkf j;
    public static final rkf k;
    public static final rkf l;
    public static final rkf m;
    public static final rkf n;
    public static final rkf o;
    public static final rkf p;
    public static final rkf q;
    public static final rkf r;
    public static final rkf s;
    public static final rkf t;
    public static final rkf u;
    public static final rkf v;
    public static final rkf w;
    public static final rkf x;
    public static final rkf y;
    public static final rkf z;

    static {
        Collections.synchronizedSet(new HashSet());
        b = c("measurement.ad_id_cache_time", 10000L, rka.b);
        c = c("measurement.monitoring.sample_period_millis", 86400000L, rka.l);
        d = c("measurement.config.cache_time", 86400000L, rka.d);
        e = c("measurement.config.url_scheme", "https", rka.p);
        f = c("measurement.config.url_authority", "app-measurement.com", rkb.g);
        g = c("measurement.upload.max_bundles", 100, rkb.s);
        h = c("measurement.upload.max_batch_size", 65536, rkc.j);
        i = c("measurement.upload.max_bundle_size", 65536, rkd.b);
        j = c("measurement.upload.max_events_per_bundle", 1000, rkd.i);
        k = c("measurement.upload.max_events_per_day", 100000, rkd.j);
        l = c("measurement.upload.max_error_events_per_day", 1000, rkb.a);
        m = c("measurement.upload.max_public_events_per_day", 50000, rkb.m);
        n = c("measurement.upload.max_conversions_per_day", 10000, rkc.c);
        o = c("measurement.upload.max_realtime_events_per_day", 10, rkc.n);
        p = c("measurement.store.max_stored_events_per_app", 100000, rkd.d);
        q = c("measurement.upload.url", "https://app-measurement.com/a", rkd.k);
        r = c("measurement.upload.backoff_period", 43200000L, rkd.l);
        s = c("measurement.upload.window_interval", 3600000L, rkd.m);
        t = c("measurement.upload.interval", 3600000L, rka.a);
        u = c("measurement.upload.realtime_upload_interval", 10000L, rka.c);
        v = c("measurement.upload.debug_upload_interval", 1000L, rka.e);
        w = c("measurement.upload.minimum_delay", 500L, rka.f);
        x = c("measurement.alarm_manager.minimum_interval", 60000L, rka.g);
        y = c("measurement.upload.stale_data_deletion_interval", 86400000L, rka.h);
        z = c("measurement.upload.refresh_blacklisted_config_interval", 604800000L, rka.i);
        A = c("measurement.upload.initial_upload_delay_time", 15000L, rka.j);
        B = c("measurement.upload.retry_time", 1800000L, rka.k);
        C = c("measurement.upload.retry_count", 6, rka.m);
        D = c("measurement.upload.max_queue_time", 2419200000L, rka.n);
        E = c("measurement.lifetimevalue.max_currency_tracked", 4, rka.o);
        F = c("measurement.audience.filter_result_max_count", 200, rka.q);
        G = a("measurement.upload.max_public_user_properties", 25);
        H = a("measurement.upload.max_event_name_cardinality", 500);
        I = a("measurement.upload.max_public_event_params", 25);
        f264J = c("measurement.service_client.idle_disconnect_millis", 5000L, rka.r);
        K = c("measurement.test.boolean_flag", false, rka.s);
        L = c("measurement.test.string_flag", "---", rka.t);
        M = c("measurement.test.long_flag", -1L, rka.u);
        N = c("measurement.test.int_flag", -2, rkb.b);
        O = c("measurement.test.double_flag", Double.valueOf(-3.0d), rkb.c);
        P = c("measurement.experiment.max_ids", 50, rkb.d);
        Q = c("measurement.max_bundles_per_iteration", 100, rkb.e);
        R = c("measurement.sdk.attribution.cache.ttl", 604800000L, rkb.f);
        S = c("measurement.validation.internal_limits_internal_event_params", false, rkb.h);
        T = c("measurement.collection.firebase_global_collection_flag_enabled", true, rkb.i);
        U = c("measurement.collection.redundant_engagement_removal_enabled", false, rkb.j);
        V = c("measurement.collection.log_event_and_bundle_v2", true, rkb.k);
        W = a("measurement.quality.checksum", false);
        X = c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, rkb.l);
        Y = c("measurement.audience.refresh_event_count_filters_timestamp", false, rkb.n);
        Z = c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, rkb.o);
        aa = c("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, rkb.p);
        ab = c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, rkb.q);
        ac = c("measurement.sdk.collection.enable_extend_user_property_size", true, rkb.r);
        ad = c("measurement.upload.file_lock_state_check", true, rkb.t);
        ae = c("measurement.ga.ga_app_id", false, rkb.u);
        af = c("measurement.lifecycle.app_in_background_parameter", false, rkc.b);
        ag = c("measurement.integration.disable_firebase_instance_id", false, rkc.a);
        ah = c("measurement.lifecycle.app_backgrounded_engagement", false, rkc.d);
        ai = c("measurement.collection.service.update_with_analytics_fix", false, rkc.e);
        aj = c("measurement.client.firebase_feature_rollout.v1.enable", true, rkc.f);
        ak = c("measurement.client.sessions.check_on_reset_and_enable2", true, rkc.g);
        al = c("measurement.scheduler.task_thread.cleanup_on_exit", false, rkc.h);
        am = c("measurement.upload.file_truncate_fix", false, rkc.i);
        c("measurement.collection.synthetic_data_mitigation", false, rkc.k);
        an = c("measurement.androidId.delete_feature", true, rkc.l);
        ao = c("measurement.service.storage_consent_support_version", 203600, rkc.m);
        ap = c("measurement.client.properties.non_null_origin", true, rkc.o);
        c("measurement.client.click_identifier_control.dev", false, rkc.p);
        c("measurement.service.click_identifier_control", false, rkc.q);
        aq = c("measurement.client.reject_blank_user_id", true, rkc.r);
        ar = c("measurement.config.persist_last_modified", true, rkc.s);
        as = c("measurement.client.consent.suppress_1p_in_ga4f_install", true, rkc.t);
        at = c("measurement.client.consent.gmpappid_worker_thread_fix", true, rkc.u);
        au = c("measurement.module.pixie.ees", true, rkd.a);
        c("measurement.euid.client.dev", false, rkd.c);
        c("measurement.euid.service", false, rkd.e);
        av = c("measurement.adid_zero.service", false, rkd.f);
        aw = c("measurement.adid_zero.remove_lair_if_adidzero_false", true, rkd.g);
        ax = c("measurement.service.refactor.package_side_screen", true, rkd.h);
    }

    static rkf a(String str, Object obj) {
        return c(str, obj, null);
    }

    public static Map b(Context context) {
        vaz a2 = vaz.a(context.getContentResolver(), vbi.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.c();
    }

    static rkf c(String str, Object obj, rke rkeVar) {
        rkf rkfVar = new rkf(str, obj, rkeVar);
        a.add(rkfVar);
        return rkfVar;
    }
}
