package defpackage;
/* compiled from: PG */
/* renamed from: qdi  reason: default package */
/* loaded from: classes4.dex */
public final class qdi {
    public static final qdd a = new qdd("gads:dynamite_load:fail:sample_rate", 10000L, 2);
    public static final qdd b;
    public static final qdd c;
    public static final qdd d;
    public static final qdd e;

    static {
        qdd.b("gads:report_dynamite_crash_in_background_thread", false);
        b = qdd.a("gads:public_beta:traffic_multiplier", "1.0");
        c = qdd.a("gads:sdk_crash_report_class_prefix", "com.google.");
        d = qdd.b("gads:sdk_crash_report_enabled", false);
        e = qdd.b("gads:sdk_crash_report_full_stacktrace", false);
        new qdd("gads:trapped_exception_sample_rate", Double.valueOf(0.01d), 3);
    }
}
