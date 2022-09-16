package defpackage;
/* compiled from: PG */
/* renamed from: cjrl  reason: default package */
/* loaded from: classes4.dex */
class cjrl implements dbrn<dnpj, dpkt> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkt a(dnpj dnpjVar) {
        dnpj dnpjVar2 = dnpjVar;
        dnpj dnpjVar3 = dnpj.UNKNOWN_PERSONAL_FEATURE_PROVIDER;
        int ordinal = dnpjVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dpkt.KANSAS;
            }
            if (ordinal == 2) {
                return dpkt.HAPPYHOUR;
            }
            String valueOf = String.valueOf(dnpjVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dpkt.UNKNOWN_PERSONAL_FEATURE_PROVIDER;
    }
}
