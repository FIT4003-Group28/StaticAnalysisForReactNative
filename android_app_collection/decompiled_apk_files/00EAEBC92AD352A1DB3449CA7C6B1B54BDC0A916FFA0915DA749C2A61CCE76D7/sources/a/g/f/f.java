package a.g.f;

import a.g.e.f.c;
import a.g.k.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
class f extends j {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f216b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f217c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f218d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f219e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f217c = constructor;
        f216b = cls;
        f218d = method2;
        f219e = method;
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f216b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f219e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean a() {
        if (f218d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f218d != null;
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f218d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Object b() {
        try {
            return f217c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.g.f.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        c.C0006c[] a2;
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        for (c.C0006c c0006c : bVar.a()) {
            ByteBuffer a3 = k.a(context, resources, c0006c.b());
            if (a3 == null || !a(b2, a3, c0006c.c(), c0006c.e(), c0006c.f())) {
                return null;
            }
        }
        return a(b2);
    }

    @Override // a.g.f.j
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        Object b2 = b();
        if (b2 == null) {
            return null;
        }
        a.e.g gVar = new a.e.g();
        for (b.f fVar : fVarArr) {
            Uri c2 = fVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = k.a(context, cancellationSignal, c2);
                gVar.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !a(b2, byteBuffer, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface a2 = a(b2);
        if (a2 != null) {
            return Typeface.create(a2, i);
        }
        return null;
    }
}
