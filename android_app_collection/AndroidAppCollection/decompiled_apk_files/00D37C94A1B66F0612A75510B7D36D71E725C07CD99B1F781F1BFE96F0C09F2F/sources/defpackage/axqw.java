package defpackage;
/* compiled from: PG */
/* renamed from: axqw  reason: default package */
/* loaded from: classes2.dex */
public final class axqw implements axqu {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.auth_account"));
        vbr vbrVar2 = new vbr(vbrVar.b, vbrVar.c, vbrVar.d, vbrVar.e, true, vbrVar.h);
        try {
            a = vbrVar2.g("CapabilityFeatures__blocked_packages_for_connectionless", (aoto) aopi.parseFrom(aoto.a, new byte[0]), axqv.a);
            vbrVar2.f("CapabilityFeatures__debug_capability", false);
            vbrVar2.f("CapabilityFeatures__enable_capability", false);
            vbrVar2.f("CapabilityFeatures__enable_fetch_capabilities_in_get_accounts", false);
            vbrVar2.f("CapabilityFeatures__enable_force_sync", true);
            vbrVar2.f("CapabilityFeatures__enable_force_sync_for_unknown_capability", true);
            b = vbrVar2.f("CapabilityFeatures__use_connectionless", false);
            vbrVar2.f("CapabilityFeatures__use_gaia_service_flags", true);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"CapabilityFeatures__blocked_packages_for_connectionless\"");
        }
    }

    @Override // defpackage.axqu
    public final aoto a() {
        return (aoto) a.c();
    }

    @Override // defpackage.axqu
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
