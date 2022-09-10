package defpackage;
/* renamed from: cyno  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyno implements dbrn {
    static final dbrn a = new cyno();

    private cyno() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        duey dueyVar = duey.UNKNOWN;
        duej duejVar = duej.UNKNOWN_CONTAINER;
        int ordinal = ((duey) obj).ordinal();
        if (ordinal != 2) {
            if (ordinal == 5) {
                return cykg.PHOTOS;
            }
            if (ordinal == 7) {
                return cykg.KABOO;
            }
            if (ordinal == 15) {
                return cykg.NEWS_360;
            }
            if (ordinal == 9) {
                return cykg.SPACES;
            }
            if (ordinal == 10) {
                return cykg.MAPS;
            }
            return cykg.UNKNOWN;
        }
        return cykg.YOUTUBE;
    }
}
