package defpackage;
/* compiled from: PG */
/* renamed from: ama  reason: default package */
/* loaded from: classes2.dex */
public final class ama {
    public static final alu a = new alz(null, false);
    public static final alu b = new alz(null, true);
    public static final alu c = new alz(alw.a, false);
    public static final alu d = new alz(alw.a, true);

    static {
        new alz(alv.a, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
