package a.g.f;

import a.g.e.f.c;
import a.g.e.f.f;
import a.g.k.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final j f209a;

    /* renamed from: b  reason: collision with root package name */
    private static final a.e.e<String, Typeface> f210b;

    static {
        int i = Build.VERSION.SDK_INT;
        f209a = i >= 29 ? new i() : i >= 28 ? new h() : i >= 26 ? new g() : (i < 24 || !f.a()) ? Build.VERSION.SDK_INT >= 21 ? new e() : new j() : new f();
        f210b = new a.e.e<>(16);
    }

    public static Typeface a(Context context, c.a aVar, Resources resources, int i, int i2, f.a aVar2, Handler handler, boolean z) {
        Typeface a2;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            a2 = a.g.k.b.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            a2 = f209a.a(context, (c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (a2 != null) {
                    aVar2.a(a2, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            f210b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f209a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f210b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface b2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (b2 = b(context, typeface, i)) == null) ? Typeface.create(typeface, i) : b2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        return f209a.a(context, cancellationSignal, fVarArr, i);
    }

    private static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    private static Typeface b(Context context, Typeface typeface, int i) {
        c.b a2 = f209a.a(typeface);
        if (a2 == null) {
            return null;
        }
        return f209a.a(context, a2, context.getResources(), i);
    }

    public static Typeface b(Resources resources, int i, int i2) {
        return f210b.b(a(resources, i, i2));
    }
}
