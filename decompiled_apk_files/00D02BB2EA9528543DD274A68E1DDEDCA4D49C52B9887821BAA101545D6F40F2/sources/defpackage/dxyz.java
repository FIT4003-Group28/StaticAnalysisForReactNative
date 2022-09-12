package defpackage;
/* compiled from: PG */
/* renamed from: dxyz  reason: default package */
/* loaded from: classes6.dex */
public final class dxyz implements dxyy {
    public static final cxju<Boolean> a;
    public static final cxju<String> b;

    static {
        cxjs cxjsVar = new cxjs(cxjd.a("com.google.android.gms.droidguard"));
        a = cxjsVar.h("droidguard_enable_client_library_telemetry", false);
        b = cxjsVar.j("droidguard_flows_with_fine_client_library_telemetry", "");
    }

    @Override // defpackage.dxyy
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxyy
    public final String b() {
        return b.f();
    }
}
