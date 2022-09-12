package defpackage;
/* renamed from: ahze  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ahze implements dbrn {
    static final dbrn a = new ahze();

    private ahze() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        akaf akafVar = (akaf) obj;
        akaf akafVar2 = akaf.LOCATION_PERMISSION_NOT_GRANTED;
        switch (akafVar.ordinal()) {
            case 0:
                return dbsg.i(6);
            case 1:
                return dbsg.i(7);
            case 2:
                return dbsg.i(8);
            case 3:
                return dbsg.i(9);
            case 4:
            case 10:
                return dbpy.a;
            case 5:
            case 6:
            case 11:
            case 12:
            case 14:
                return dbsg.i(5);
            case 7:
                return dbsg.i(4);
            case 8:
                return dbsg.i(3);
            case 9:
                return dbsg.i(2);
            case 13:
                return dbsg.i(10);
            default:
                throw new AssertionError(String.format("unknown misconfiguredSetting: %s", akafVar));
        }
    }
}
