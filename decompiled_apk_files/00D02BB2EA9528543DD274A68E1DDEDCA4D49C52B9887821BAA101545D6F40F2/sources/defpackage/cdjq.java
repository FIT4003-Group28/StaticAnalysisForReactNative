package defpackage;
/* compiled from: PG */
/* renamed from: cdjq  reason: default package */
/* loaded from: classes4.dex */
abstract class cdjq extends dbrh<chbv, cdpb> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ chbv b(cdpb cdpbVar) {
        cdpb cdpbVar2 = cdpbVar;
        chbv chbvVar = chbv.NEVER_SHOW;
        int ordinal = cdpbVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return chbv.NEVER_SHOW;
            }
            if (ordinal == 2) {
                return chbv.ALWAYS_SHOW;
            }
            if (ordinal == 3) {
                return chbv.OBEY_SERVER_RESPONSE;
            }
            String valueOf = String.valueOf(cdpbVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return d();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ cdpb c(chbv chbvVar) {
        chbv chbvVar2 = chbvVar;
        cdpb cdpbVar = cdpb.UNKNOWN_ACTION_ON_THANKS_PAGE;
        int ordinal = chbvVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return cdpb.ALWAYS_SHOW;
            }
            if (ordinal == 2) {
                return cdpb.OBEY_SERVER_RESPONSE;
            }
            String valueOf = String.valueOf(chbvVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return cdpb.NEVER_SHOW;
    }

    public abstract chbv d();
}
