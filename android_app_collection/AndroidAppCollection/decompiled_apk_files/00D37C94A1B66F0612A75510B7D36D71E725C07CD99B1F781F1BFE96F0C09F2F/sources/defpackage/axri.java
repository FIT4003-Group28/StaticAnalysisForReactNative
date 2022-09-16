package defpackage;
/* compiled from: PG */
/* renamed from: axri  reason: default package */
/* loaded from: classes2.dex */
public final class axri implements axrh {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.droidguard"));
        a = vbrVar.f("droidguard_enable_client_library_telemetry", false);
        b = vbrVar.e("droidguard_flows_with_fine_client_library_telemetry", "");
    }

    @Override // defpackage.axrh
    public final String a() {
        return (String) b.c();
    }

    @Override // defpackage.axrh
    public final boolean b() {
        return ((Boolean) a.c()).booleanValue();
    }
}
