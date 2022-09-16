package defpackage;
/* compiled from: PG */
/* renamed from: kuh  reason: default package */
/* loaded from: classes7.dex */
class kuh extends dbrh<ddkt, dhmb> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddkt b(dhmb dhmbVar) {
        dhmb dhmbVar2 = dhmbVar;
        ddkt ddktVar = ddkt.UNKNOWN_ACTIVITY_TYPE;
        int ordinal = dhmbVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ddkt.MAIN_ACTIVITY;
            }
            if (ordinal == 2) {
                return ddkt.LIMITED_ACTIVITY;
            }
            String valueOf = String.valueOf(dhmbVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return ddkt.UNKNOWN_ACTIVITY_TYPE;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmb c(ddkt ddktVar) {
        ddkt ddktVar2 = ddktVar;
        dhmb dhmbVar = dhmb.UNKNOWN_ACTIVITY_TYPE;
        int ordinal = ddktVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dhmb.MAIN_ACTIVITY;
            }
            if (ordinal == 2) {
                return dhmb.LIMITED_ACTIVITY;
            }
            String valueOf = String.valueOf(ddktVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dhmb.UNKNOWN_ACTIVITY_TYPE;
    }
}
