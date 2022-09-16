package defpackage;
/* compiled from: PG */
/* renamed from: dxxs  reason: default package */
/* loaded from: classes6.dex */
public final class dxxs implements dxxr {
    public static final cxju<Boolean> a;
    public static final cxju<Long> b;

    static {
        cxjs cxjsVar = new cxjs("com.google.android.libraries.notifications.GCM");
        a = cxjsVar.h("QualityOptimizationFeature__enabled", false);
        b = cxjsVar.g("QualityOptimizationFeature__evaluation_interval_ms", 3600000L);
    }

    @Override // defpackage.dxxr
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxxr
    public final long b() {
        return b.f().longValue();
    }
}
