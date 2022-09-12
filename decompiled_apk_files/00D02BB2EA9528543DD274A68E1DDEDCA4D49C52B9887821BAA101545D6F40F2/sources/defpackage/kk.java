package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kk  reason: default package */
/* loaded from: classes7.dex */
public class kk extends ki {
    protected final Class<?> a;
    protected final Constructor<?> b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public kk() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
            method4 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            String str = "Unable to collect necessary methods for class " + e.getClass().getName();
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method3;
        this.d = method4;
        this.e = method5;
        this.f = method2;
        this.g = method;
    }

    private final boolean f() {
        return this.c != null;
    }

    private final Object g() {
        try {
            return this.b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final boolean h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean i(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final void j(Object obj) {
        try {
            this.f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // defpackage.ki, defpackage.kq
    public final Typeface a(Context context, jo joVar, Resources resources, int i) {
        jp[] jpVarArr;
        if (!f()) {
            return super.a(context, joVar, resources, i);
        }
        Object g = g();
        if (g == null) {
            return null;
        }
        for (jp jpVar : joVar.a) {
            if (!h(context, g, jpVar.a, jpVar.e, jpVar.b, jpVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(jpVar.d))) {
                j(g);
                return null;
            }
        }
        if (i(g)) {
            return c(g);
        }
        return null;
    }

    @Override // defpackage.ki, defpackage.kq
    public final Typeface b(Context context, alf[] alfVarArr, int i) {
        Typeface c;
        if (alfVarArr.length <= 0) {
            return null;
        }
        if (!f()) {
            alf k = k(alfVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k.a, "r", null);
                if (openFileDescriptor != null) {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(k.c).setItalic(k.d).build();
                    openFileDescriptor.close();
                    return build;
                }
            } catch (IOException unused) {
            }
            return null;
        }
        Map<Uri, ByteBuffer> c2 = alh.c(context, alfVarArr);
        Object g = g();
        if (g == null) {
            return null;
        }
        boolean z = false;
        for (alf alfVar : alfVarArr) {
            ByteBuffer byteBuffer = c2.get(alfVar.a);
            if (byteBuffer != null) {
                if (!((Boolean) this.d.invoke(g, byteBuffer, Integer.valueOf(alfVar.b), null, Integer.valueOf(alfVar.c), Integer.valueOf(alfVar.d ? 1 : 0))).booleanValue()) {
                    j(g);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            j(g);
            return null;
        } else if (i(g) && (c = c(g)) != null) {
            return Typeface.create(c, i);
        } else {
            return null;
        }
    }

    protected Typeface c(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.kq
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!f()) {
            return super.d(context, resources, i, str, i2);
        }
        Object g = g();
        if (g == null) {
            return null;
        }
        if (!h(context, g, str, 0, -1, -1, null)) {
            j(g);
            return null;
        } else if (i(g)) {
            return c(g);
        } else {
            return null;
        }
    }

    protected Method e(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
