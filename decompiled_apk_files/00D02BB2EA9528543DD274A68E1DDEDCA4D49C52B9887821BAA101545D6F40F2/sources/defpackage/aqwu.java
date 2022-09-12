package defpackage;
/* compiled from: PG */
/* renamed from: aqwu  reason: default package */
/* loaded from: classes2.dex */
abstract class aqwu extends dbrh<dgan, aqxo> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgan b(aqxo aqxoVar) {
        aqxo aqxoVar2 = aqxoVar;
        dgan dganVar = dgan.STAGE_UNSPECIFIED;
        int ordinal = aqxoVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dgan.UNSET;
            }
            if (ordinal == 2) {
                return dgan.PENDING_ACTIVATION;
            }
            if (ordinal == 3) {
                return dgan.IN_PROBATION;
            }
            if (ordinal == 4) {
                return dgan.ENABLED;
            }
            if (ordinal == 5) {
                return d();
            }
            String valueOf = String.valueOf(aqxoVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dgan.STAGE_UNSPECIFIED;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aqxo c(dgan dganVar) {
        dgan dganVar2 = dganVar;
        aqxo aqxoVar = aqxo.STAGE_UNSPECIFIED;
        int ordinal = dganVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aqxo.UNSET;
            }
            if (ordinal == 2) {
                return aqxo.PENDING_ACTIVATION;
            }
            if (ordinal == 3) {
                return aqxo.IN_PROBATION;
            }
            if (ordinal == 4) {
                return aqxo.ENABLED;
            }
            String valueOf = String.valueOf(dganVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return aqxo.STAGE_UNSPECIFIED;
    }

    public abstract dgan d();
}
