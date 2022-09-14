package defpackage;
/* compiled from: PG */
/* renamed from: dxxp  reason: default package */
/* loaded from: classes6.dex */
public final class dxxp implements dxxo {
    public static final cxju<Boolean> a;
    public static final cxju<Long> b;

    static {
        cxjs cxjsVar = new cxjs("com.google.android.libraries.notifications.GCM");
        a = cxjsVar.h("PeriodicWipeoutFeature__enabled", true);
        b = cxjsVar.g("PeriodicWipeoutFeature__notifications_storage_duration", 2419200000L);
    }

    @Override // defpackage.dxxo
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxxo
    public final long b() {
        return b.f().longValue();
    }
}
