package defpackage;
/* compiled from: PG */
/* renamed from: aefp  reason: default package */
/* loaded from: classes.dex */
public class aefp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static aefo a(String str) {
        char c;
        switch (str.hashCode()) {
            case -809938602:
                if (str.equals("vr100k")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3002541:
                if (str.equals("arfb")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3002919:
                if (str.equals("arrh")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3433448:
                if (str.equals("pari")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3453629:
                if (str.equals("pvri")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3628152:
                if (str.equals("vrfb")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3628530:
                if (str.equals("vrrh")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 93029278:
                if (str.equals("ar40k")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 93112086:
                if (str.equals("asisr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 112506027:
                if (str.equals("vsisr")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new aecp();
            case 1:
                return new aeco();
            case 2:
                return new aeer();
            case 3:
                return new aebh();
            case 4:
                return new aeev();
            case 5:
                return new aebl();
            case 6:
                return new aeep();
            case 7:
                return new aebf();
            case '\b':
                return new aeeo();
            case '\t':
                return new aebe();
            default:
                return null;
        }
    }
}
