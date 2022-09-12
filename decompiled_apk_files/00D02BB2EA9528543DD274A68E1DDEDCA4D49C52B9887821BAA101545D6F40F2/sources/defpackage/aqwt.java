package defpackage;
/* compiled from: PG */
/* renamed from: aqwt  reason: default package */
/* loaded from: classes2.dex */
abstract class aqwt extends dbrh<dgaf, aqxh> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgaf b(aqxh aqxhVar) {
        aqxh aqxhVar2 = aqxhVar;
        dgaf dgafVar = dgaf.DISABLE_REASON_UNSPECIFIED;
        switch (aqxhVar2.ordinal()) {
            case 0:
                return dgaf.DISABLE_REASON_UNSPECIFIED;
            case 1:
                return dgaf.BUSINESS_UNRESPONSIVE;
            case 2:
                return dgaf.BUSINESS_ABUSE;
            case 3:
                return dgaf.BUSINESS_OPT_OUT;
            case 4:
                return dgaf.MAPS_DISCONNECTED;
            case 5:
                return dgaf.MERCHANT_UNREACHABLE_AUTO_DETECTED;
            case 6:
                return dgaf.MERCHANT_UNRESPONSIVE_AUTO_DETECTED;
            case 7:
                return d();
            default:
                String valueOf = String.valueOf(aqxhVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aqxh c(dgaf dgafVar) {
        dgaf dgafVar2 = dgafVar;
        aqxh aqxhVar = aqxh.DISABLE_REASON_UNSPECIFIED;
        switch (dgafVar2.ordinal()) {
            case 0:
                return aqxh.DISABLE_REASON_UNSPECIFIED;
            case 1:
                return aqxh.BUSINESS_UNRESPONSIVE;
            case 2:
                return aqxh.BUSINESS_ABUSE;
            case 3:
                return aqxh.BUSINESS_OPT_OUT;
            case 4:
                return aqxh.MAPS_DISCONNECTED;
            case 5:
                return aqxh.MERCHANT_UNREACHABLE_AUTO_DETECTED;
            case 6:
                return aqxh.MERCHANT_UNRESPONSIVE_AUTO_DETECTED;
            default:
                String valueOf = String.valueOf(dgafVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public abstract dgaf d();
}
