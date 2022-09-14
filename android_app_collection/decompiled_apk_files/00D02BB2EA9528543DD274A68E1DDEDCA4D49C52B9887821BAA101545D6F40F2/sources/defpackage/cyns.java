package defpackage;
/* renamed from: cyns  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyns implements dbrn {
    static final dbrn a = new cyns();

    private cyns() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i;
        dudx dudxVar = (dudx) obj;
        cykx bZ = cykz.d.bZ();
        int a2 = dudv.a(dudxVar.a);
        if (a2 == 0) {
            a2 = 1;
        }
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        duey dueyVar = duey.UNKNOWN;
        duej duejVar = duej.UNKNOWN_CONTAINER;
        switch (a2 - 1) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            default:
                i = 2;
                break;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cykz) bZ.b).a = cyky.a(i);
        double d = dudxVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cykz cykzVar = (cykz) bZ.b;
        cykzVar.b = d;
        cykzVar.c = dudxVar.c;
        return bZ.bK();
    }
}
