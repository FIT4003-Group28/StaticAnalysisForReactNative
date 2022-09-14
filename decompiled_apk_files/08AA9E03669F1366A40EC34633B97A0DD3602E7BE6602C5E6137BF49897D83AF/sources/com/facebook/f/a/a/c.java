package com.facebook.f.a.a;

import android.content.Context;
import com.facebook.imagepipeline.f.h;
import com.facebook.imagepipeline.f.j;
/* compiled from: Fresco.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2347a = c.class;

    /* renamed from: b  reason: collision with root package name */
    private static f f2348b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f2349c = false;

    private c() {
    }

    public static void a(Context context, h hVar) {
        a(context, hVar, null);
    }

    public static void a(Context context, h hVar, b bVar) {
        if (f2349c) {
            com.facebook.common.e.a.c(f2347a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f2349c = true;
        }
        Context applicationContext = context.getApplicationContext();
        if (hVar == null) {
            j.a(applicationContext);
        } else {
            j.a(hVar);
        }
        a(applicationContext, bVar);
    }

    private static void a(Context context, b bVar) {
        f2348b = new f(context, bVar);
        com.facebook.f.i.f.a(f2348b);
    }

    public static e a() {
        return f2348b.b();
    }

    public static j b() {
        return j.a();
    }

    public static com.facebook.imagepipeline.f.g c() {
        return b().i();
    }
}
