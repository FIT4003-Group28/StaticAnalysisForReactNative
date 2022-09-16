package defpackage;
/* compiled from: PG */
/* renamed from: aqwv  reason: default package */
/* loaded from: classes2.dex */
abstract class aqwv extends dbrh<dgah, aqxi> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dgah b(aqxi aqxiVar) {
        aqxi aqxiVar2 = aqxiVar;
        dgah dgahVar = dgah.UNKNOWN_MESSAGING_APP;
        int ordinal = aqxiVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dgah.GMM;
            }
            if (ordinal == 2) {
                return dgah.GMB;
            }
            if (ordinal == 3) {
                return d();
            }
            String valueOf = String.valueOf(aqxiVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dgah.UNKNOWN_MESSAGING_APP;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aqxi c(dgah dgahVar) {
        dgah dgahVar2 = dgahVar;
        aqxi aqxiVar = aqxi.UNKNOWN_MESSAGING_APP;
        int ordinal = dgahVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aqxi.GMM;
            }
            if (ordinal == 2) {
                return aqxi.GMB;
            }
            String valueOf = String.valueOf(dgahVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return aqxi.UNKNOWN_MESSAGING_APP;
    }

    public abstract dgah d();
}
