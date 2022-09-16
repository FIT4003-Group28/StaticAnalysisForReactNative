package defpackage;
/* compiled from: PG */
/* renamed from: cjrm  reason: default package */
/* loaded from: classes4.dex */
class cjrm implements dbrn<dnpn, dpkw> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkw a(dnpn dnpnVar) {
        dnpn dnpnVar2 = dnpnVar;
        dnpn dnpnVar3 = dnpn.UNKNOWN_REASON;
        int ordinal = dnpnVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dpkw.TRUMPED;
            }
            String valueOf = String.valueOf(dnpnVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dpkw.UNKNOWN_REASON;
    }
}
