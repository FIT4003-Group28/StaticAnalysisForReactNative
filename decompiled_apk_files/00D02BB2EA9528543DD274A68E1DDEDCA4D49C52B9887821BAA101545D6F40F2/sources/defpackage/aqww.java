package defpackage;
/* compiled from: PG */
/* renamed from: aqww  reason: default package */
/* loaded from: classes2.dex */
abstract class aqww extends dbrh<dgaj, aqxj> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgaj b(aqxj aqxjVar) {
        aqxj aqxjVar2 = aqxjVar;
        dgaj dgajVar = dgaj.STATE_UNSPECIFIED;
        switch (aqxjVar2.ordinal()) {
            case 0:
                return dgaj.STATE_UNSPECIFIED;
            case 1:
                return dgaj.UNREGISTERED;
            case 2:
                return dgaj.ENABLED;
            case 3:
                return dgaj.DISABLED;
            case 4:
                return dgaj.UNSUPPORTED;
            case 5:
                return dgaj.TEMPORARILY_UNAVAILABLE;
            case 6:
                return d();
            default:
                String valueOf = String.valueOf(aqxjVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aqxj c(dgaj dgajVar) {
        dgaj dgajVar2 = dgajVar;
        aqxj aqxjVar = aqxj.STATE_UNSPECIFIED;
        int ordinal = dgajVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aqxj.UNREGISTERED;
            }
            if (ordinal == 2) {
                return aqxj.ENABLED;
            }
            if (ordinal == 3) {
                return aqxj.DISABLED;
            }
            if (ordinal == 4) {
                return aqxj.UNSUPPORTED;
            }
            if (ordinal == 5) {
                return aqxj.TEMPORARILY_UNAVAILABLE;
            }
            String valueOf = String.valueOf(dgajVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return aqxj.STATE_UNSPECIFIED;
    }

    public abstract dgaj d();
}
