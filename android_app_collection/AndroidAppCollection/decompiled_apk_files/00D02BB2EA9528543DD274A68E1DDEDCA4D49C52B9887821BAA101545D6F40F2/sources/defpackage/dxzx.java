package defpackage;
/* compiled from: PG */
/* renamed from: dxzx  reason: default package */
/* loaded from: classes6.dex */
public final class dxzx implements dxzw {
    public static final cxju<Long> a;
    public static final cxju<Long> b;
    public static final cxju<Long> c;

    static {
        cxjs c2 = new cxjs(cxjd.a("com.google.lighter.android")).c();
        a = c2.g("incoming_typing_indicator_expiry_ms", 60000L);
        b = c2.g("typing_indicators_max_typers", 5L);
        c = c2.g("typing_indicator_timeout_ms", 5000L);
    }

    @Override // defpackage.dxzw
    public final long a() {
        return a.f().longValue();
    }

    @Override // defpackage.dxzw
    public final long b() {
        return b.f().longValue();
    }

    @Override // defpackage.dxzw
    public final long c() {
        return c.f().longValue();
    }
}
