package defpackage;
/* renamed from: bcca  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bcca implements dbrn {
    static final dbrn a = new bcca();

    private bcca() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        bbur bburVar = bbur.DEFAULT;
        int ordinal = ((bbur) obj).ordinal();
        if (ordinal != 3) {
            if (ordinal == 9) {
                return dweb.IN_STORE;
            }
            if (ordinal == 5) {
                return dweb.ROOM;
            }
            if (ordinal == 6) {
                return dweb.VIBE;
            }
            if (ordinal == 7) {
                return dweb.AMENITY;
            }
            return dweb.UNKNOWN_CATEGORY;
        }
        return dweb.FOOD_AND_DRINK;
    }
}
