package com.facebook.imagepipeline.memory;
/* compiled from: BitmapCounterProvider.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2945a = b();

    /* renamed from: b  reason: collision with root package name */
    private static b f2946b;

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }

    public static b a() {
        if (f2946b == null) {
            f2946b = new b(384, f2945a);
        }
        return f2946b;
    }
}
