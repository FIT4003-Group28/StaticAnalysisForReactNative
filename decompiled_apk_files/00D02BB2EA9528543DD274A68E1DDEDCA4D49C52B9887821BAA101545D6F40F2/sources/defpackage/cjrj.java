package defpackage;
/* compiled from: PG */
/* renamed from: cjrj  reason: default package */
/* loaded from: classes4.dex */
class cjrj implements dbrn<dnpf, dpkp> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkp a(dnpf dnpfVar) {
        dnpf dnpfVar2 = dnpfVar;
        dnpf dnpfVar3 = dnpf.UNKNOWN_LABEL_CONTENT_TYPE;
        int ordinal = dnpfVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dpkp.GAS_PRICE;
            }
            if (ordinal == 2) {
                return dpkp.RATING;
            }
            String valueOf = String.valueOf(dnpfVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dpkp.UNKNOWN_LABEL_CONTENT_TYPE;
    }
}
