package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ajjs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajjs implements ajkl {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ajjs u = new ajjs(20);
    public static final /* synthetic */ ajjs t = new ajjs(19);
    public static final /* synthetic */ ajjs s = new ajjs(18);
    public static final /* synthetic */ ajjs r = new ajjs(17);
    public static final /* synthetic */ ajjs q = new ajjs(16);
    public static final /* synthetic */ ajjs p = new ajjs(15);
    public static final /* synthetic */ ajjs o = new ajjs(14);
    public static final /* synthetic */ ajjs n = new ajjs(13);
    public static final /* synthetic */ ajjs m = new ajjs(12);
    public static final /* synthetic */ ajjs l = new ajjs(11);
    public static final /* synthetic */ ajjs k = new ajjs(10);
    public static final /* synthetic */ ajjs j = new ajjs(9);
    public static final /* synthetic */ ajjs i = new ajjs(8);
    public static final /* synthetic */ ajjs h = new ajjs(7);
    public static final /* synthetic */ ajjs g = new ajjs(6);
    public static final /* synthetic */ ajjs f = new ajjs(5);
    public static final /* synthetic */ ajjs e = new ajjs(4);
    public static final /* synthetic */ ajjs d = new ajjs(3);
    public static final /* synthetic */ ajjs c = new ajjs(2);
    public static final /* synthetic */ ajjs b = new ajjs(1);
    public static final /* synthetic */ ajjs a = new ajjs();

    private /* synthetic */ ajjs() {
    }

    private /* synthetic */ ajjs(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ajkl
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                if ((((aunf) obj).d & 16) != 0) {
                    return true;
                }
                break;
            case 1:
                return (((aunf) obj).e & 65536) != 0;
            case 2:
                return (((aunf) obj).f & 32) != 0;
            case 3:
                return (((aunf) obj).c & 1048576) != 0;
            case 4:
                return (((aunf) obj).c & 67108864) != 0;
            case 5:
                return (((aunf) obj).c & 33554432) != 0;
            case 6:
                return (((aunf) obj).d & 8192) != 0;
            case 7:
                return (((aunf) obj).c & 134217728) != 0;
            case 8:
                return (((aunf) obj).c & 268435456) != 0;
            case 9:
                return (((aunf) obj).c & 1073741824) != 0;
            case 10:
                return (((aunf) obj).b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0;
            case 11:
                return (((aunf) obj).e & 33554432) != 0;
            case 12:
                return (((aunf) obj).e & 134217728) != 0;
            case 13:
                return (((aunf) obj).e & 16777216) != 0;
            case 14:
                return (((aunf) obj).e & 67108864) != 0;
            case 15:
                amuk amukVar = ajke.a;
                aunf aunfVar = (aunf) obj;
                return ((aunfVar.c & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) == 0 && (aunfVar.d & 1) == 0) ? false : true;
            case 16:
                return (((aunf) obj).d & 268435456) != 0;
            case 17:
                return (((aunf) obj).e & 1048576) != 0;
            case 18:
                return (((aunf) obj).e & 131072) != 0;
            case 19:
                return (((aunf) obj).e & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0;
            default:
                if ((((aunf) obj).e & 536870912) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
