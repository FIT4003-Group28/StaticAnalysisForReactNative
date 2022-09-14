package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.a.a.a;
import android.support.v4.g.b;
import android.support.v4.i.l;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
class e extends g {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f368a;

    /* renamed from: b  reason: collision with root package name */
    private static final Constructor f369b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f370c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f371d;

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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f369b = constructor;
        f368a = cls;
        f370c = method2;
        f371d = method;
    }

    public static boolean a() {
        if (f370c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f370c != null;
    }

    private static Object b() {
        try {
            return f369b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f370c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f368a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f371d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.support.v4.b.g, android.support.v4.b.c.a
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.C0008b[] c0008bArr, int i) {
        Object b2 = b();
        l lVar = new l();
        for (b.C0008b c0008b : c0008bArr) {
            Uri a2 = c0008b.a();
            ByteBuffer byteBuffer = (ByteBuffer) lVar.get(a2);
            if (byteBuffer == null) {
                byteBuffer = h.a(context, cancellationSignal, a2);
                lVar.put(a2, byteBuffer);
            }
            if (!a(b2, byteBuffer, c0008b.b(), c0008b.c(), c0008b.d())) {
                return null;
            }
        }
        return Typeface.create(a(b2), i);
    }

    @Override // android.support.v4.b.g, android.support.v4.b.c.a
    public Typeface a(Context context, a.b bVar, Resources resources, int i) {
        a.c[] a2;
        Object b2 = b();
        for (a.c cVar : bVar.a()) {
            ByteBuffer a3 = h.a(context, resources, cVar.d());
            if (a3 == null || !a(b2, a3, 0, cVar.b(), cVar.c())) {
                return null;
            }
        }
        return a(b2);
    }
}
