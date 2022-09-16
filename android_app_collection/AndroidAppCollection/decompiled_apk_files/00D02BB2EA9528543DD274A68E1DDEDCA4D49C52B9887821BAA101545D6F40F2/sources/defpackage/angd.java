package defpackage;
/* compiled from: PG */
/* renamed from: angd  reason: default package */
/* loaded from: classes2.dex */
class angd extends dbrh<anhu, aouj> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ anhu b(aouj aoujVar) {
        aouj aoujVar2 = aoujVar;
        anhu anhuVar = anhu.NO;
        int ordinal = aoujVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return anhu.MAYBE;
            }
            if (ordinal == 2) {
                return anhu.FORCE;
            }
            String valueOf = String.valueOf(aoujVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return anhu.NO;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aouj c(anhu anhuVar) {
        anhu anhuVar2 = anhuVar;
        aouj aoujVar = aouj.NONE_OPTION;
        int ordinal = anhuVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aouj.MAYBE;
            }
            if (ordinal == 2) {
                return aouj.FORCE;
            }
            String valueOf = String.valueOf(anhuVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return aouj.NONE_OPTION;
    }
}
