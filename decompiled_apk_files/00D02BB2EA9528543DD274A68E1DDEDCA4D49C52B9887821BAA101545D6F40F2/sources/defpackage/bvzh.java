package defpackage;
/* compiled from: PG */
/* renamed from: bvzh  reason: default package */
/* loaded from: classes4.dex */
class bvzh extends dbrh<dmhh, aufs> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dmhh b(aufs aufsVar) {
        aufs aufsVar2 = aufsVar;
        dmhh dmhhVar = dmhh.UNKNOWN_STATE;
        int ordinal = aufsVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dmhh.ENABLED;
            }
            if (ordinal == 2) {
                return dmhh.INBOX_ONLY;
            }
            if (ordinal == 3) {
                return dmhh.DISABLED;
            }
            String valueOf = String.valueOf(aufsVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dmhh.UNKNOWN_STATE;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aufs c(dmhh dmhhVar) {
        dmhh dmhhVar2 = dmhhVar;
        aufs aufsVar = aufs.UNKNOWN_STATE;
        int ordinal = dmhhVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aufs.ENABLED;
            }
            if (ordinal == 2) {
                return aufs.INBOX_ONLY;
            }
            if (ordinal == 3) {
                return aufs.DISABLED;
            }
            String valueOf = String.valueOf(dmhhVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return aufs.UNKNOWN_STATE;
    }
}
