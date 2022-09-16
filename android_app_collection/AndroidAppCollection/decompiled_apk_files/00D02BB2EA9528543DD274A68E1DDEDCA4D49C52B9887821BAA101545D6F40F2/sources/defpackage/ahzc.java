package defpackage;
/* renamed from: ahzc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ahzc implements dbrn {
    static final dbrn a = new ahzc();

    private ahzc() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i;
        akaf akafVar = (akaf) obj;
        akaf akafVar2 = akaf.LOCATION_PERMISSION_NOT_GRANTED;
        switch (akafVar.ordinal()) {
            case 0:
                i = 6;
                break;
            case 1:
                return 7;
            case 2:
                i = 8;
                break;
            case 3:
                i = 9;
                break;
            case 4:
            case 6:
                i = 11;
                break;
            case 5:
            case 11:
            case 12:
            case 14:
                i = 5;
                break;
            case 7:
                i = 4;
                break;
            case 8:
                i = 3;
                break;
            case 9:
                i = 2;
                break;
            case 10:
                i = 10;
                break;
            case 13:
                i = 12;
                break;
            default:
                throw new AssertionError(String.format("unknown misconfiguredSetting: %s", akafVar));
        }
        return Integer.valueOf(i);
    }
}
