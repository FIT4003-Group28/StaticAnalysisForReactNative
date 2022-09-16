package defpackage;
/* compiled from: PG */
/* renamed from: bsld  reason: default package */
/* loaded from: classes4.dex */
class bsld implements dbrn<djlz, dfpa> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpa a(djlz djlzVar) {
        djlz djlzVar2 = djlzVar;
        djlz djlzVar3 = djlz.UNKNOWN_SEMANTIC_TIME;
        int ordinal = djlzVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dfpa.ANY_TIME;
            }
            String valueOf = String.valueOf(djlzVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dfpa.UNKNOWN_SEMANTIC_TIME;
    }
}
