package defpackage;
/* compiled from: PG */
/* renamed from: bslf  reason: default package */
/* loaded from: classes4.dex */
class bslf implements dbrn<djmq, dfpj> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpj a(djmq djmqVar) {
        djmq djmqVar2 = djmqVar;
        djmq djmqVar3 = djmq.UNKNOWN_SEMANTIC_LEVEL;
        int ordinal = djmqVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dfpj.CHEAP;
            }
            if (ordinal == 2) {
                return dfpj.UPSCALE;
            }
            String valueOf = String.valueOf(djmqVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dfpj.UNKNOWN_SEMANTIC_LEVEL;
    }
}
