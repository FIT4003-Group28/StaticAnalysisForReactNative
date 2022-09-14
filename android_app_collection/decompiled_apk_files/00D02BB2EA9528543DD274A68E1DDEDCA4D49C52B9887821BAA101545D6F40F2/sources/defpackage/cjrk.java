package defpackage;
/* compiled from: PG */
/* renamed from: cjrk  reason: default package */
/* loaded from: classes4.dex */
class cjrk implements dbrn<dnph, dpkr> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dpkr a(dnph dnphVar) {
        dnph dnphVar2 = dnphVar;
        dnph dnphVar3 = dnph.GEO_PORTRAIT;
        switch (dnphVar2.ordinal()) {
            case 0:
                return dpkr.GEO_PORTRAIT;
            case 1:
                return dpkr.RATED;
            case 2:
                return dpkr.RECOMMENDED;
            case 3:
                return dpkr.HOME;
            case 4:
                return dpkr.WORK;
            case 5:
                return dpkr.PERSONAL_SEARCH_RESULT;
            case 6:
                return dpkr.STARRED;
            case 7:
                return dpkr.CHECKIN;
            case 8:
                return dpkr.EVENT;
            case 9:
                return dpkr.HAPTIC_PLACE;
            case 10:
                return dpkr.HAPTIC_PLACE_LIST;
            case 11:
                return dpkr.PLACE_LIST_FAVORITES;
            case 12:
                return dpkr.PLACE_LIST_WANT_TO_GO;
            case 13:
                return dpkr.PLACE_LIST_CUSTOM;
            case 14:
                return dpkr.LOCATION_HISTORY;
            case 15:
                return dpkr.PERSONAL_BOOSTED;
            case 16:
                return dpkr.RECENTLY_VIEWED_PLACE;
            default:
                String valueOf = String.valueOf(dnphVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
