package defpackage;
/* compiled from: PG */
/* renamed from: bslh  reason: default package */
/* loaded from: classes4.dex */
class bslh implements dbrn<djnx, dfpt> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpt a(djnx djnxVar) {
        djnx djnxVar2 = djnxVar;
        djnx djnxVar3 = djnx.UNKNOWN_SEMANTIC_RATING;
        int ordinal = djnxVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dfpt.TOP_RATED;
            }
            String valueOf = String.valueOf(djnxVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dfpt.UNKNOWN_SEMANTIC_RATING;
    }
}
