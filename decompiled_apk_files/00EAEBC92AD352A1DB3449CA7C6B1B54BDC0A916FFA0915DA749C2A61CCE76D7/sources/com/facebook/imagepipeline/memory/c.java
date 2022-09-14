package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5210a = b();

    /* renamed from: b  reason: collision with root package name */
    private static int f5211b = 384;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f5212c;

    public static b a() {
        if (f5212c == null) {
            synchronized (c.class) {
                if (f5212c == null) {
                    f5212c = new b(f5211b, f5210a);
                }
            }
        }
        return f5212c;
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
