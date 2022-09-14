package defpackage;
/* compiled from: PG */
/* renamed from: lxd  reason: default package */
/* loaded from: classes7.dex */
final class lxd {
    public static void a(int i, dpdn dpdnVar, cny cnyVar) {
        dgau dgauVar = dgau.MANEUVER_UNKNOWN;
        dpdp dpdpVar = dpdp.TURN_UNKNOWN;
        dozc dozcVar = dozc.NONE;
        int ordinal = dpdnVar.ordinal();
        if (ordinal == 0) {
            cnyVar.a(i);
            cnyVar.b(1);
        } else if (ordinal != 1) {
        } else {
            cnyVar.a(i);
            cnyVar.b(2);
        }
    }

    public static void b(dpdn dpdnVar, cny cnyVar) {
        dgau dgauVar = dgau.MANEUVER_UNKNOWN;
        dpdp dpdpVar = dpdp.TURN_UNKNOWN;
        dozc dozcVar = dozc.NONE;
        int ordinal = dpdnVar.ordinal();
        if (ordinal == 0) {
            cnyVar.b(1);
        } else if (ordinal != 1) {
        } else {
            cnyVar.b(2);
        }
    }
}
