package c.d.j.a.a;

import c.d.b.a.d;
import c.d.j.c.f;
import c.d.j.d.h;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f3158a;

    /* renamed from: b  reason: collision with root package name */
    private static a f3159b;

    public static a a(f fVar, c.d.j.f.f fVar2, h<d, c.d.j.k.b> hVar, boolean z) {
        if (!f3158a) {
            try {
                f3159b = (a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(f.class, c.d.j.f.f.class, h.class, Boolean.TYPE).newInstance(fVar, fVar2, hVar, Boolean.valueOf(z));
            } catch (Throwable unused) {
            }
            if (f3159b != null) {
                f3158a = true;
            }
        }
        return f3159b;
    }
}
