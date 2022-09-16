package defpackage;
/* compiled from: PG */
/* renamed from: cbw  reason: default package */
/* loaded from: classes2.dex */
public final class cbw implements ccs {
    public static final cbw a = new cbw();
    private static final ccv b = ccv.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private cbw() {
    }

    @Override // defpackage.ccs
    public final /* bridge */ /* synthetic */ Object a(ccw ccwVar, float f) {
        ccwVar.j();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 3;
        int i2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (ccwVar.p()) {
            switch (ccwVar.c(b)) {
                case 0:
                    str = ccwVar.h();
                    break;
                case 1:
                    str2 = ccwVar.h();
                    break;
                case 2:
                    f2 = (float) ccwVar.a();
                    break;
                case 3:
                    int b2 = ccwVar.b();
                    if (b2 <= 2 && b2 >= 0) {
                        i = new int[]{1, 2, 3}[b2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    i2 = ccwVar.b();
                    break;
                case 5:
                    f3 = (float) ccwVar.a();
                    break;
                case 6:
                    f4 = (float) ccwVar.a();
                    break;
                case 7:
                    i3 = ccd.b(ccwVar);
                    break;
                case 8:
                    i4 = ccd.b(ccwVar);
                    break;
                case 9:
                    f5 = (float) ccwVar.a();
                    break;
                case 10:
                    z = ccwVar.q();
                    break;
                default:
                    ccwVar.n();
                    ccwVar.o();
                    break;
            }
        }
        ccwVar.l();
        return new bzr(str, str2, f2, i, i2, f3, f4, i3, i4, f5, z);
    }
}
