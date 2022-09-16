package defpackage;
/* compiled from: PG */
/* renamed from: akvj  reason: default package */
/* loaded from: classes.dex */
public enum akvj {
    BATTERY_SAMPLING("batteryCapturerSamplingCounter", aery.k, agvc.t),
    SCROLL_TRACKER_SAMPLING("scroll_tracker_when_to_sample_counter", aery.n, agvc.p),
    ELEMENT_PERF_SAMPLING("element_performance_metric_sample", aery.l, agvc.u),
    STREAMZ_DEFAULT_IMAGE_CLIENT_SAMPLING("streamz_default_image_client", aery.o, agvc.q),
    STREAMZ_SIZED_IMAGE_CLIENT_SAMPLING("streamz_sized_image_client", aery.q, agvc.s),
    STREAMZ_GLIDE_SAMPLING("streamz_glide_image_manager", aery.p, agvc.r),
    NETWORK_BASELINE_SAMPLING("network_baseline_sampling_key", aery.m, alba.b);
    
    public final String h;
    public final yjb i;
    public final yjc j;

    akvj(String str, yjb yjbVar, yjc yjcVar) {
        this.h = str;
        this.i = yjbVar;
        this.j = yjcVar;
    }
}
