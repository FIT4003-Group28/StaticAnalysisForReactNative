package com.facebook.imagepipeline.m;
/* compiled from: ThumbnailSizeChecker.java */
/* loaded from: classes.dex */
public final class ax {
    public static int a(int i) {
        return (int) (i * 1.3333334f);
    }

    public static boolean a(int i, int i2, com.facebook.imagepipeline.e.d dVar) {
        return dVar == null ? ((float) a(i)) >= 2048.0f && a(i2) >= 2048 : a(i) >= dVar.f2632a && a(i2) >= dVar.f2633b;
    }

    public static boolean a(com.facebook.imagepipeline.i.d dVar, com.facebook.imagepipeline.e.d dVar2) {
        if (dVar == null) {
            return false;
        }
        int f = dVar.f();
        if (f == 90 || f == 270) {
            return a(dVar.h(), dVar.g(), dVar2);
        }
        return a(dVar.g(), dVar.h(), dVar2);
    }
}
