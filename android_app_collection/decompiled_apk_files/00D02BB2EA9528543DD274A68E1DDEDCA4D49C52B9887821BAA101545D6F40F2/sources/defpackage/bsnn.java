package defpackage;
/* compiled from: PG */
/* renamed from: bsnn  reason: default package */
/* loaded from: classes4.dex */
final class bsnn extends bsob {
    private final akqi a;
    private final int b;
    private final int c;

    public bsnn(int i, @dzsi akqi akqiVar, int i2) {
        this.c = i;
        this.a = akqiVar;
        this.b = i2;
    }

    @Override // defpackage.bsob
    @dzsi
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.bsob
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bsob
    public final int c() {
        return this.c;
    }

    @Override // defpackage.ght
    public final boolean equals(Object obj) {
        akqi akqiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsob) {
            bsob bsobVar = (bsob) obj;
            if (this.c == bsobVar.c() && ((akqiVar = this.a) != null ? akqiVar.equals(bsobVar.a()) : bsobVar.a() == null) && this.b == bsobVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.c ^ 1000003) * 1000003;
        akqi akqiVar = this.a;
        return ((i ^ (akqiVar == null ? 0 : akqiVar.hashCode())) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str;
        switch (this.c) {
            case 1:
                str = "PLACE";
                break;
            case 2:
                str = "AD";
                break;
            case 3:
                str = "NO_RESULTS";
                break;
            case 4:
                str = "LOADING";
                break;
            case 5:
                str = "GRIPPY_AND_TOP_PADDING";
                break;
            case 6:
                str = "OFFLINE";
                break;
            case 7:
                str = "PERSONAL_SEARCH";
                break;
            case 8:
                str = "NETWORK_ERROR";
                break;
            case 9:
                str = "ALERT";
                break;
            case 10:
                str = "LIST_HOLIDAY_WARNING";
                break;
            case 11:
                str = "ONSITE_PARKING_AVAILABLE";
                break;
            case 12:
                str = "HOTEL_ABOUT_PRICING";
                break;
            case 13:
                str = "NO_PERSONAL_SEARCH_INFO_LAYOUT";
                break;
            case 14:
                str = "ADD_A_PLACE";
                break;
            case 15:
                str = "CITY_QA_PROMO";
                break;
            case 16:
                str = "SUGGESTED_SETS";
                break;
            case 17:
                str = "FEEDBACK_CARD";
                break;
            case 18:
                str = "EV_PROFILE_PROMO";
                break;
            case 19:
                str = "SEARCH_RESULT_PROMO";
                break;
            case 20:
                str = "MAJOR_EVENT_CARD_LIST";
                break;
            default:
                str = "PLACEHOLDER_LOADING";
                break;
        }
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 61 + String.valueOf(valueOf).length());
        sb.append("CardId{cardType=");
        sb.append(str);
        sb.append(", featureId=");
        sb.append(valueOf);
        sb.append(", traversalCardIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
