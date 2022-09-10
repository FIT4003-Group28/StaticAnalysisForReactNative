package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csbz  reason: default package */
/* loaded from: classes5.dex */
public abstract class csbz {
    private final String E;
    public static final float[] a = {-4.0f, -1.0f, 3.5f, -4.5f};
    private static final int[] D = {0, 2, 3, 1};
    public static final csbz b = new csbh();
    public static final csbz c = new csbr();
    public static final csbz d = new csbs();
    public static final csbz e = new csbt();
    public static final csbz f = new csbu();
    public static final csbz g = new csbv();
    public static final csbz h = new csbw();
    public static final csbz i = new csbx();
    public static final csbz j = new csby();
    public static final csbz k = new csax();
    public static final csbz l = new csay();
    public static final csbz m = new csaz();
    public static final csbz n = new csba();
    public static final csbz o = new csbb();
    public static final csbz p = new csbc();
    public static final csbz q = new csbd();
    public static final csbz r = new csbe();
    public static final csbz s = new csbf();
    public static final csbz t = new csbg();
    public static final csbz u = new csbi();
    public static final csbz v = new csbj();
    public static final csbz w = new csbk();
    public static final csbz x = new csbl();
    public static final csbz y = new csbm();
    public static final csbz z = new csbn();
    public static final csbz A = new csbo();
    public static final csbz B = new csbp();
    public static final csbz C = new csbq();

    public csbz(String str) {
        this.E = str;
    }

    public static float e(long j2, long j3, long j4) {
        return ((float) (j3 - j2)) / ((float) j4);
    }

    public static float f(long j2, int i2) {
        return ((float) ((j2 - (D[i2] * 50)) % 1200)) / 1200.0f;
    }

    public static void g(csci csciVar) {
        csch cschVar = csciVar.b;
        cschVar.b(12.0f);
        cschVar.c(3.1415927f);
        csch cschVar2 = csciVar.c;
        cschVar2.b(4.0f);
        cschVar2.c(3.1415927f);
        csch cschVar3 = csciVar.d;
        cschVar3.b(4.0f);
        cschVar3.c(0.0f);
        csch cschVar4 = csciVar.e;
        cschVar4.b(12.0f);
        cschVar4.c(0.0f);
    }

    public static boolean h(csci csciVar) {
        return csciVar.b.f() == 3.1415927f && csciVar.c.f() == 3.1415927f && csciVar.d.f() == 0.0f && csciVar.e.f() == 0.0f;
    }

    public static void i(csci csciVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            int a2 = csciVar.a(next);
            next.e(zArr[a2]);
            next.c(fArr4[a2]);
            next.b(fArr3[a2] * 1.0416666f);
            next.k(fArr2[a2] * 1.0416666f);
            next.l(a[a2] * 1.0416666f);
            next.i(fArr[a2] * 1.0416666f);
        }
    }

    public static boolean j(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            float d2 = it.next().d();
            if (d2 > 0.3926991f && d2 < 2.7488937f) {
                return false;
            }
            if (d2 > 3.5342917f && d2 < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    public static void k(csci csciVar) {
        csciVar.b.r(1);
        csciVar.c.k(-2.0f);
        csciVar.d.k(2.0f);
        csciVar.e.r(1);
        if (csciVar.b.s() > 0.66f) {
            csciVar.c.r(1);
            csciVar.d.r(1);
        }
    }

    public static void l(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.r(1);
            next.l(-6.0f);
            if (next == csciVar.c) {
                next.k(-2.0f);
            }
            if (next == csciVar.d) {
                next.k(2.0f);
            }
        }
    }

    public static void m(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.x(true);
            next.v(true);
            next.w(true);
            next.y(true);
        }
    }

    public static void n(csci csciVar) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.e(true);
            next.v(false);
            next.x(false);
            next.w(false);
            next.y(false);
            next.d.h(true);
        }
    }

    public static void o(csci csciVar, long j2) {
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            p(csciVar, it.next(), j2);
        }
    }

    public static void p(csci csciVar, csch cschVar, long j2) {
        int a2 = csciVar.a(cschVar);
        if (cschVar == csciVar.e) {
            a2 = 3;
        }
        cschVar.l((float) Math.sin((((((float) j2) - (a2 * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f));
    }

    public static void q(csch cschVar, int i2, float f2) {
        cschVar.l(a[i2] + ((float) Math.sin(f2 * 6.2831855f)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void r(csci csciVar) {
        csciVar.d(3.0f);
        Iterator<csch> it = csciVar.iterator();
        while (it.hasNext()) {
            csch next = it.next();
            next.b(5.656f);
            next.l(0.0f);
        }
        csciVar.h(csciVar.b, 4.712389f);
        csciVar.b.c(4.712389f);
        csciVar.c.c(0.0f);
        csciVar.d.c(1.5707964f);
        csciVar.e.c(3.1415927f);
    }

    public abstract void a(csci csciVar);

    public abstract boolean b(long j2, long j3, csci csciVar);

    public abstract void c(csci csciVar);

    public final String toString() {
        return this.E;
    }
}
