package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hf  reason: default package */
/* loaded from: classes3.dex */
public class hf extends hd {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public hf() {
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
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
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

    private final Object f() {
        try {
            return this.b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void g(Object obj) {
        try {
            this.f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
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

    private final boolean j() {
        if (this.c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.c != null;
    }

    @Override // defpackage.hd, defpackage.hk
    public final Typeface a(Context context, gm gmVar, Resources resources, int i) {
        gn[] gnVarArr;
        if (!j()) {
            return super.a(context, gmVar, resources, i);
        }
        Object f = f();
        if (f == null) {
            return null;
        }
        for (gn gnVar : gmVar.a) {
            if (!h(context, f, gnVar.a, gnVar.e, gnVar.b, gnVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gnVar.d))) {
                g(f);
                return null;
            }
        }
        if (i(f)) {
            return c(f);
        }
        return null;
    }

    @Override // defpackage.hd, defpackage.hk
    public final Typeface b(Context context, CancellationSignal cancellationSignal, ald[] aldVarArr, int i) {
        Typeface c;
        if (aldVarArr.length <= 0) {
            return null;
        }
        if (j()) {
            HashMap hashMap = new HashMap();
            for (ald aldVar : aldVarArr) {
                if (aldVar.e == 0) {
                    Uri uri = aldVar.a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, iy.p(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object f = f();
            if (f == null) {
                return null;
            }
            boolean z = false;
            for (ald aldVar2 : aldVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(aldVar2.a);
                if (byteBuffer != null) {
                    if (!((Boolean) this.d.invoke(f, byteBuffer, Integer.valueOf(aldVar2.b), null, Integer.valueOf(aldVar2.c), Integer.valueOf(aldVar2.d ? 1 : 0))).booleanValue()) {
                        g(f);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                g(f);
                return null;
            } else if (i(f) && (c = c(f)) != null) {
                return Typeface.create(c, i);
            } else {
                return null;
            }
        }
        ald l = l(aldVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l.a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l.c).setItalic(l.d).build();
            openFileDescriptor.close();
            return build;
        } catch (IOException unused) {
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

    @Override // defpackage.hk
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!j()) {
            return super.d(context, resources, i, str, i2);
        }
        Object f = f();
        if (f == null) {
            return null;
        }
        if (!h(context, f, str, 0, -1, -1, null)) {
            g(f);
            return null;
        } else if (i(f)) {
            return c(f);
        } else {
            return null;
        }
    }

    protected Method e(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
