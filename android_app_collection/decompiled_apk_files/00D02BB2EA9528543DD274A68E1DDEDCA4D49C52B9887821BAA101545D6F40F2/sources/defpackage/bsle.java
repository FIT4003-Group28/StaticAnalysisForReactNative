package defpackage;
/* compiled from: PG */
/* renamed from: bsle  reason: default package */
/* loaded from: classes4.dex */
class bsle implements dbrn<djme, dfpd> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpd a(djme djmeVar) {
        djme djmeVar2 = djmeVar;
        djme djmeVar3 = djme.UNKNOWN_SEMANTIC_CONSTRAINT;
        int ordinal = djmeVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dfpd.OPEN_NOW;
            }
            if (ordinal == 2) {
                return dfpd.OPEN_24_HOURS;
            }
            String valueOf = String.valueOf(djmeVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dfpd.UNKNOWN_SEMANTIC_CONSTRAINT;
    }
}
