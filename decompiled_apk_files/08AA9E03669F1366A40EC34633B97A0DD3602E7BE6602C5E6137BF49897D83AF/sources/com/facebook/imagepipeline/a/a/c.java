package com.facebook.imagepipeline.a.a;

import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.f.e;
/* compiled from: AnimatedFactoryProvider.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2526a;

    /* renamed from: b  reason: collision with root package name */
    private static b f2527b;

    public static b a(f fVar, e eVar) {
        if (!f2526a) {
            try {
                f2527b = (b) Class.forName("com.facebook.imagepipeline.animated.factory.AnimatedFactoryImplSupport").getConstructor(f.class, e.class).newInstance(fVar, eVar);
            } catch (Throwable unused) {
            }
            if (f2527b != null) {
                f2526a = true;
                return f2527b;
            }
            try {
                f2527b = (b) Class.forName("com.facebook.imagepipeline.animated.factory.AnimatedFactoryImpl").getConstructor(f.class, e.class).newInstance(fVar, eVar);
            } catch (Throwable unused2) {
            }
            f2526a = true;
        }
        return f2527b;
    }
}
