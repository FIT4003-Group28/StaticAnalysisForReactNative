package defpackage;
/* compiled from: PG */
/* renamed from: amgp  reason: default package */
/* loaded from: classes.dex */
public final class amgp {
    private static final ThreadLocal<amgo> a = new amgm();

    public static void a(akzh akzhVar, akra akraVar, float f, float[] fArr) {
        c(akzhVar, akraVar, null, f, true, false, fArr);
    }

    public static void b(akzh akzhVar, akra akraVar, float f, float[] fArr) {
        c(akzhVar, akraVar, null, f, false, false, fArr);
    }

    public static void c(akzh akzhVar, akra akraVar, @dzsi akra akraVar2, float f, boolean z, boolean z2, float[] fArr) {
        ThreadLocal<amgo> threadLocal = a;
        akra akraVar3 = threadLocal.get().a;
        akra akraVar4 = threadLocal.get().b;
        akzhVar.h(akraVar3);
        akra.D(akraVar, akraVar3, akraVar4);
        if (z2) {
            akra.B(akraVar4, new akra(akraVar4.a < 268435456 ? 1073741824 : -1073741824, 0), akraVar4);
        }
        if (z) {
            akraVar4.P(akraVar4);
        }
        if (akraVar2 != null) {
            akra.B(akraVar4, akraVar2, akraVar4);
        }
        float s = akzhVar.s();
        fArr[0] = akraVar4.a * s;
        fArr[1] = akraVar4.b * s;
        fArr[2] = akraVar4.c * s;
        fArr[3] = s * f;
    }
}
