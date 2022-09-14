package defpackage;
/* compiled from: PG */
/* renamed from: bslg  reason: default package */
/* loaded from: classes4.dex */
class bslg implements dbrn<djnu, dfpr> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dfpr a(djnu djnuVar) {
        djnu djnuVar2 = djnuVar;
        djnu djnuVar3 = djnu.UNKNOWN_NUMERIC_RATING;
        switch (djnuVar2.ordinal()) {
            case 0:
                return dfpr.UNKNOWN_NUMERIC_RATING;
            case 1:
                return dfpr.RATING_0_5;
            case 2:
                return dfpr.RATING_1_0;
            case 3:
                return dfpr.RATING_1_5;
            case 4:
                return dfpr.RATING_2_0;
            case 5:
                return dfpr.RATING_2_5;
            case 6:
                return dfpr.RATING_3_0;
            case 7:
                return dfpr.RATING_3_5;
            case 8:
                return dfpr.RATING_4_0;
            case 9:
                return dfpr.RATING_4_5;
            case 10:
                return dfpr.RATING_5_0;
            default:
                String valueOf = String.valueOf(djnuVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
