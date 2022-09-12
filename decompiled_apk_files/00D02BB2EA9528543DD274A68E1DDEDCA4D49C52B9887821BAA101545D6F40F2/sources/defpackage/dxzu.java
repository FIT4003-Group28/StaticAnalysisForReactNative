package defpackage;
/* compiled from: PG */
/* renamed from: dxzu  reason: default package */
/* loaded from: classes6.dex */
public final class dxzu implements dxzt {
    public static final cxju<String> a;
    public static final cxju<Long> b;

    static {
        cxjs c = new cxjs(cxjd.a("com.google.lighter.android")).c();
        a = c.j("tachyon_host_name", "instantmessaging-pa.googleapis.com");
        b = c.g("tachyon_port_number", 443L);
    }

    @Override // defpackage.dxzt
    public final String a() {
        return a.f();
    }

    @Override // defpackage.dxzt
    public final long b() {
        return b.f().longValue();
    }
}
