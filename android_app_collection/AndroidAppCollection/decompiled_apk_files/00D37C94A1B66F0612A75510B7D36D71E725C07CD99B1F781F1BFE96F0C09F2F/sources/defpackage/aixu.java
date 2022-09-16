package defpackage;
/* compiled from: PG */
/* renamed from: aixu  reason: default package */
/* loaded from: classes.dex */
public final class aixu extends cvn {
    public static final aixu b = new aixu();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cvn
    public final cvs b(String str, byte[] bArr) {
        char c;
        switch (str.hashCode()) {
            case 3346442:
                if (str.equals("mdat")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3357433:
                if (str.equals("moof")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3357449:
                if (str.equals("moov")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3363941:
                if (str.equals("mvhd")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3556994:
                if (str.equals("tfdt")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3568419:
                if (str.equals("traf")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return new cwk();
            }
            if (c == 2) {
                return new cwl();
            }
            if (c == 3) {
                return new cxj();
            }
            if (c == 4) {
                return new cxn();
            }
            if (c == 5) {
                return new cxm();
            }
            return new cxf(str);
        }
        return new cxr();
    }
}
