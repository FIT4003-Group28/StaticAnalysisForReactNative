package defpackage;
/* compiled from: PG */
/* renamed from: akwy  reason: default package */
/* loaded from: classes2.dex */
public final class akwy {
    static final float a = (float) Math.sqrt(2.0d);

    public static void a(float f, float f2, float f3, dmlo dmloVar, float[] fArr) {
        dmlo dmloVar2 = dmlo.CENTER;
        switch (dmloVar.ordinal()) {
            case 0:
                fArr[0] = f;
                fArr[1] = f2;
                return;
            case 1:
                fArr[0] = f - f3;
                fArr[1] = f2;
                return;
            case 2:
                fArr[0] = f + f3;
                fArr[1] = f2;
                return;
            case 3:
                fArr[0] = f;
                fArr[1] = f2 - f3;
                return;
            case 4:
                float f4 = a;
                fArr[0] = f - (f3 / f4);
                fArr[1] = f2 - (f3 / f4);
                return;
            case 5:
                float f5 = a;
                fArr[0] = f + (f3 / f5);
                fArr[1] = f2 - (f3 / f5);
                return;
            case 6:
                fArr[0] = f;
                fArr[1] = f2 + f3;
                return;
            case 7:
                float f6 = a;
                fArr[0] = f - (f3 / f6);
                fArr[1] = f2 + (f3 / f6);
                return;
            case 8:
                float f7 = a;
                fArr[0] = f + (f3 / f7);
                fArr[1] = f2 + (f3 / f7);
                return;
            default:
                return;
        }
    }
}
