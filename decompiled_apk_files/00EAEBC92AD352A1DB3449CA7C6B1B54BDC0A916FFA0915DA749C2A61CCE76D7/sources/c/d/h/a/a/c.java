package c.d.h.a.a;

import android.content.Context;
import c.d.j.f.h;
import c.d.j.f.i;
import c.d.j.f.k;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2914a = c.class;

    /* renamed from: b  reason: collision with root package name */
    private static f f2915b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f2916c = false;

    private c() {
    }

    public static h a() {
        return b().f();
    }

    public static void a(Context context) {
        a(context, null, null);
    }

    private static void a(Context context, b bVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("Fresco.initializeDrawee");
        }
        f2915b = new f(context, bVar);
        c.d.h.i.e.a(f2915b);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    public static void a(Context context, i iVar) {
        a(context, iVar, null);
    }

    public static void a(Context context, i iVar, b bVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("Fresco#initialize");
        }
        if (f2916c) {
            c.d.d.e.a.c(f2914a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f2916c = true;
        }
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("Fresco.initialize->SoLoader.init");
            }
            SoLoader.a(context, 0);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            Context applicationContext = context.getApplicationContext();
            if (iVar == null) {
                k.b(applicationContext);
            } else {
                k.a(iVar);
            }
            a(applicationContext, bVar);
            if (!c.d.j.p.b.c()) {
                return;
            }
            c.d.j.p.b.a();
        } catch (IOException e2) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            throw new RuntimeException("Could not initialize SoLoader", e2);
        }
    }

    public static k b() {
        return k.o();
    }

    public static boolean c() {
        return f2916c;
    }

    public static e d() {
        return f2915b.mo139get();
    }
}
