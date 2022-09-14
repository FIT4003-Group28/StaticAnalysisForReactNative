package defpackage;
/* compiled from: PG */
/* renamed from: ampn  reason: default package */
/* loaded from: classes.dex */
public final class ampn {
    public static final dcqe a = dcqe.c("ampn");
    public static final int[] b = new int[0];
    public static final float[] c = new float[0];

    public static float[] a(int[] iArr, alxp[] alxpVarArr, float f, boolean z) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            alxo c2 = alxpVarArr[i].c((int) f);
            alxl[] alxlVarArr = z ? c2.n : c2.o;
            if (alxlVarArr.length > 0) {
                fArr[i] = alxlVarArr[0].g;
            }
        }
        return fArr;
    }

    @dzsi
    public static bnvn b(amgr amgrVar, boolean z) {
        if (amgrVar.f > 0) {
            bnvn n = amgrVar.n(true != z ? 5 : 4);
            n.a(false);
            return n;
        }
        return null;
    }

    public static void c(alxp alxpVar, int i, int i2, float[] fArr) {
        int min = Math.min(4, alxpVar.i(i));
        for (int i3 = 0; i3 < min; i3++) {
            alxl[] alxlVarArr = alxpVar.c(i3 + i).o;
            if (alxlVarArr.length > i2) {
                fArr[i3] = alxlVarArr[i2].c;
            }
        }
    }

    public static ampk d(amoa amoaVar, alxp alxpVar, float f, int i, int i2) {
        alxo d = alxpVar.d(f);
        ampk ampkVar = new ampk(i, i2);
        if (amoaVar.h(d) <= 0) {
            return ampkVar;
        }
        alxl g = amoaVar.g(d, 0);
        if (ampkVar.a == 4 && g.i.d()) {
            ampkVar.a = 0;
        }
        if (ampkVar.b == 4 && g.j.d()) {
            ampkVar.b = 0;
        }
        return ampkVar;
    }
}
