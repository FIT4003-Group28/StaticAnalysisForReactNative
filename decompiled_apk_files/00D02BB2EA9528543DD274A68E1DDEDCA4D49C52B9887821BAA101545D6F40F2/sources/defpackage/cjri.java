package defpackage;
/* compiled from: PG */
/* renamed from: cjri  reason: default package */
/* loaded from: classes4.dex */
class cjri implements dbrn<dnpd, dpkn> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkn a(dnpd dnpdVar) {
        dnpd dnpdVar2 = dnpdVar;
        dnpd dnpdVar3 = dnpd.UNKNOWN_LABEL_CONTENT_LOCATION;
        int ordinal = dnpdVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dpkn.PRIMARY;
            }
            if (ordinal == 2) {
                return dpkn.SECONDARY;
            }
            String valueOf = String.valueOf(dnpdVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dpkn.UNKNOWN_LABEL_CONTENT_LOCATION;
    }
}
