package defpackage;
/* compiled from: PG */
/* renamed from: cdjr  reason: default package */
/* loaded from: classes4.dex */
class cdjr extends dbrh<ckdw, cdpg> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ckdw b(cdpg cdpgVar) {
        cdpg cdpgVar2 = cdpgVar;
        ckdw ckdwVar = ckdw.UNKNOWN_METHOD;
        int ordinal = cdpgVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ckdw.REVIEW_EDITOR_PAGE_SEND_REVIEW_BUTTON_CLICK;
            }
            if (ordinal == 2) {
                return ckdw.NOTIFICATION_STAR_CLICK;
            }
            if (ordinal == 3) {
                return ckdw.NOTIFICATION_SEND_REVIEW_BUTTON_CLICK;
            }
            String valueOf = String.valueOf(cdpgVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return ckdw.UNKNOWN_METHOD;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ cdpg c(ckdw ckdwVar) {
        ckdw ckdwVar2 = ckdwVar;
        cdpg cdpgVar = cdpg.UNKNOWN_METHOD;
        int ordinal = ckdwVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return cdpg.REVIEW_EDITOR_PAGE_SEND_REVIEW_BUTTON_CLICK;
            }
            if (ordinal == 2) {
                return cdpg.NOTIFICATION_STAR_CLICK;
            }
            if (ordinal == 3) {
                return cdpg.NOTIFICATION_SEND_REVIEW_BUTTON_CLICK;
            }
            String valueOf = String.valueOf(ckdwVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return cdpg.UNKNOWN_METHOD;
    }
}
