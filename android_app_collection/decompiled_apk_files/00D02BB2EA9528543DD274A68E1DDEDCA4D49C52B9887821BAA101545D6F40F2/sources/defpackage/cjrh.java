package defpackage;
/* compiled from: PG */
/* renamed from: cjrh  reason: default package */
/* loaded from: classes4.dex */
class cjrh implements dbrn<dnoz, dpkl> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkl a(dnoz dnozVar) {
        dnoz dnozVar2 = dnozVar;
        dnoz dnozVar3 = dnoz.UNKNOWN_PROVIDER;
        int ordinal = dnozVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dpkl.TRAFFICCAST;
            }
            if (ordinal == 2) {
                return dpkl.WAZE;
            }
            if (ordinal == 3) {
                return dpkl.TOMTOM;
            }
            if (ordinal == 4) {
                return dpkl.GT;
            }
            if (ordinal == 5) {
                return dpkl.USER_REPORT;
            }
            String valueOf = String.valueOf(dnozVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dpkl.UNKNOWN_PROVIDER;
    }
}
