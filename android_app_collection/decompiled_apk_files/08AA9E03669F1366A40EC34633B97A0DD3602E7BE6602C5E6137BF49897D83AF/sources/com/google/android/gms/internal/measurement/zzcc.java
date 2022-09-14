package com.google.android.gms.internal.measurement;

import com.baidu.mapapi.UIMsg;
import com.google.android.gms.common.util.VisibleForTesting;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzcc {
    public static zzcd<Long> zzaaa;
    private static zzcd<Boolean> zzyk = zzcd.zza("analytics.service_enabled", false, false);
    public static zzcd<Boolean> zzyl = zzcd.zza("analytics.service_client_enabled", true, true);
    public static zzcd<String> zzym = zzcd.zza("analytics.log_tag", "GAv4", "GAv4-SVC");
    private static zzcd<Long> zzyn = zzcd.zza("analytics.max_tokens", 60L, 60L);
    private static zzcd<Float> zzyo = zzcd.zza("analytics.tokens_per_sec", 0.5f, 0.5f);
    public static zzcd<Integer> zzyp = zzcd.zza("analytics.max_stored_hits", (int) UIMsg.m_AppUI.MSG_APP_DATA_OK, 20000);
    private static zzcd<Integer> zzyq = zzcd.zza("analytics.max_stored_hits_per_app", (int) UIMsg.m_AppUI.MSG_APP_DATA_OK, (int) UIMsg.m_AppUI.MSG_APP_DATA_OK);
    public static zzcd<Integer> zzyr = zzcd.zza("analytics.max_stored_properties_per_app", 100, 100);
    public static zzcd<Long> zzys = zzcd.zza("analytics.local_dispatch_millis", 1800000L, 120000L);
    public static zzcd<Long> zzyt = zzcd.zza("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    private static zzcd<Long> zzyu = zzcd.zza("analytics.min_local_dispatch_millis", 120000L, 120000L);
    private static zzcd<Long> zzyv = zzcd.zza("analytics.max_local_dispatch_millis", 7200000L, 7200000L);
    public static zzcd<Long> zzyw = zzcd.zza("analytics.dispatch_alarm_millis", 7200000L, 7200000L);
    public static zzcd<Long> zzyx = zzcd.zza("analytics.max_dispatch_alarm_millis", 32400000L, 32400000L);
    public static zzcd<Integer> zzyy = zzcd.zza("analytics.max_hits_per_dispatch", 20, 20);
    public static zzcd<Integer> zzyz = zzcd.zza("analytics.max_hits_per_batch", 20, 20);
    public static zzcd<String> zzza = zzcd.zza("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
    public static zzcd<String> zzzb = zzcd.zza("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
    public static zzcd<String> zzzc = zzcd.zza("analytics.simple_endpoint", "/collect", "/collect");
    public static zzcd<String> zzzd = zzcd.zza("analytics.batching_endpoint", "/batch", "/batch");
    public static zzcd<Integer> zzze = zzcd.zza("analytics.max_get_length", 2036, 2036);
    public static zzcd<String> zzzf = zzcd.zza("analytics.batching_strategy.k", zzbk.BATCH_BY_COUNT.name(), zzbk.BATCH_BY_COUNT.name());
    public static zzcd<String> zzzg;
    private static zzcd<Integer> zzzh;
    public static zzcd<Integer> zzzi;
    public static zzcd<Integer> zzzj;
    public static zzcd<Integer> zzzk;
    public static zzcd<String> zzzl;
    public static zzcd<Integer> zzzm;
    private static zzcd<Long> zzzn;
    public static zzcd<Integer> zzzo;
    public static zzcd<Integer> zzzp;
    public static zzcd<Long> zzzq;
    private static zzcd<String> zzzr;
    private static zzcd<Integer> zzzs;
    public static zzcd<Boolean> zzzt;
    public static zzcd<Long> zzzu;
    public static zzcd<Long> zzzv;
    private static zzcd<Long> zzzw;
    private static zzcd<Long> zzzx;
    public static zzcd<Long> zzzy;
    public static zzcd<Long> zzzz;

    static {
        String name = zzbq.GZIP.name();
        zzzg = zzcd.zza("analytics.compression_strategy.k", name, name);
        zzzh = zzcd.zza("analytics.max_hits_per_request.k", 20, 20);
        zzzi = zzcd.zza("analytics.max_hit_length.k", (int) PKIFailureInfo.certRevoked, (int) PKIFailureInfo.certRevoked);
        zzzj = zzcd.zza("analytics.max_post_length.k", (int) PKIFailureInfo.certRevoked, (int) PKIFailureInfo.certRevoked);
        zzzk = zzcd.zza("analytics.max_batch_post_length", (int) PKIFailureInfo.certRevoked, (int) PKIFailureInfo.certRevoked);
        zzzl = zzcd.zza("analytics.fallback_responses.k", "404,502", "404,502");
        zzzm = zzcd.zza("analytics.batch_retry_interval.seconds.k", 3600, 3600);
        zzzn = zzcd.zza("analytics.service_monitor_interval", 86400000L, 86400000L);
        zzzo = zzcd.zza("analytics.http_connection.connect_timeout_millis", 60000, 60000);
        zzzp = zzcd.zza("analytics.http_connection.read_timeout_millis", 61000, 61000);
        zzzq = zzcd.zza("analytics.campaigns.time_limit", 86400000L, 86400000L);
        zzzr = zzcd.zza("analytics.first_party_experiment_id", "", "");
        zzzs = zzcd.zza("analytics.first_party_experiment_variant", 0, 0);
        zzzt = zzcd.zza("analytics.test.disable_receiver", false, false);
        zzzu = zzcd.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
        zzzv = zzcd.zza("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
        zzzw = zzcd.zza("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
        zzzx = zzcd.zza("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
        zzzy = zzcd.zza("analytics.service_client.reconnect_throttle_millis", 1800000L, 1800000L);
        zzzz = zzcd.zza("analytics.monitoring.sample_period_millis", 86400000L, 86400000L);
        zzaaa = zzcd.zza("analytics.initialization_warning_threshold", 5000L, 5000L);
    }
}
