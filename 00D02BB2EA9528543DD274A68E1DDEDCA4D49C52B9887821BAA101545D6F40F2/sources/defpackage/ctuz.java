package defpackage;
/* renamed from: ctuz  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctuz implements dbrn {
    static final dbrn a = new ctuz();

    private ctuz() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i;
        cuhu cuhuVar = (cuhu) obj;
        switch (cuhuVar.j) {
            case 0:
                i = 2;
                break;
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
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            String valueOf = String.valueOf(cuhuVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Unrecognized typeface with weight type: ");
            sb.append(valueOf);
            sb.toString();
            cstl.a("RichTextProtoConvUtils");
            return dxsw.b;
        }
        dxsv bZ = dxsw.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxsw) bZ.b).a = dxpg.a(i);
        return bZ.bK();
    }
}
