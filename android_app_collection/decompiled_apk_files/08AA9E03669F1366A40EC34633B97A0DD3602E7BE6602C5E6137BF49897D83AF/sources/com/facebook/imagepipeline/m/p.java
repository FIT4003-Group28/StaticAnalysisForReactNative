package com.facebook.imagepipeline.m;
/* compiled from: DownsampleUtil.java */
/* loaded from: classes.dex */
public class p {
    static int b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d2 = 1.0d / i2;
            if (d2 + (0.3333333432674408d * d2) <= f) {
                return i;
            }
            i = i2;
        }
    }

    public static int a(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar) {
        int a2;
        if (!com.facebook.imagepipeline.i.d.c(dVar)) {
            return 1;
        }
        float b2 = b(bVar, dVar);
        if (dVar.e() == com.facebook.h.b.f2509a) {
            a2 = b(b2);
        } else {
            a2 = a(b2);
        }
        int max = Math.max(dVar.h(), dVar.g());
        com.facebook.imagepipeline.e.d g = bVar.g();
        float f = g != null ? g.f2634c : 2048.0f;
        while (max / a2 > f) {
            a2 = dVar.e() == com.facebook.h.b.f2509a ? a2 * 2 : a2 + 1;
        }
        return a2;
    }

    static float b(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar) {
        com.facebook.common.d.i.a(com.facebook.imagepipeline.i.d.c(dVar));
        com.facebook.imagepipeline.e.d g = bVar.g();
        if (g == null || g.f2633b <= 0 || g.f2632a <= 0 || dVar.g() == 0 || dVar.h() == 0) {
            return 1.0f;
        }
        int c2 = c(bVar, dVar);
        boolean z = c2 == 90 || c2 == 270;
        int h = z ? dVar.h() : dVar.g();
        int g2 = z ? dVar.g() : dVar.h();
        float f = g.f2632a / h;
        float f2 = g.f2633b / g2;
        float max = Math.max(f, f2);
        com.facebook.common.e.a.a("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f for %s", Integer.valueOf(g.f2632a), Integer.valueOf(g.f2633b), Integer.valueOf(h), Integer.valueOf(g2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max), bVar.b().toString());
        return max;
    }

    static int a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d2 = i;
            if ((1.0d / d2) + ((1.0d / (Math.pow(d2, 2.0d) - d2)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    private static int c(com.facebook.imagepipeline.n.b bVar, com.facebook.imagepipeline.i.d dVar) {
        boolean z = false;
        if (!bVar.h().d()) {
            return 0;
        }
        int f = dVar.f();
        if (f == 0 || f == 90 || f == 180 || f == 270) {
            z = true;
        }
        com.facebook.common.d.i.a(z);
        return f;
    }
}
