package defpackage;
/* compiled from: PG */
/* renamed from: ange  reason: default package */
/* loaded from: classes2.dex */
class ange extends dbrh<anhw, aoul> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ anhw b(aoul aoulVar) {
        aoul aoulVar2 = aoulVar;
        anhw anhwVar = anhw.NOTHING;
        switch (aoulVar2.ordinal()) {
            case 0:
                return anhw.NOTHING;
            case 1:
                return anhw.DAY_VIEW;
            case 2:
                return anhw.SEGMENT_EDITING;
            case 3:
                return anhw.VISITED_PLACES;
            case 4:
                return anhw.VISITED_CITIES;
            case 5:
                return anhw.VISITED_COUNTRIES;
            case 6:
                return anhw.TRIPS;
            case 7:
                return anhw.EXPERIENCES_IN_PLACE;
            default:
                String valueOf = String.valueOf(aoulVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aoul c(anhw anhwVar) {
        anhw anhwVar2 = anhwVar;
        aoul aoulVar = aoul.NONE_TARGET;
        switch (anhwVar2.ordinal()) {
            case 0:
                return aoul.NONE_TARGET;
            case 1:
                return aoul.DAY_VIEW;
            case 2:
                return aoul.SEGMENT_EDITING;
            case 3:
                return aoul.VISITED_PLACES;
            case 4:
                return aoul.VISITED_CITIES;
            case 5:
                return aoul.VISITED_COUNTRIES;
            case 6:
                return aoul.TRIPS;
            case 7:
                return aoul.EXPERIENCES_IN_PLACE;
            default:
                String valueOf = String.valueOf(anhwVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
