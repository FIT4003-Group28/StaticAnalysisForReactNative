package a.g.f;

import a.g.e.f.c;
import a.g.k.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class e extends j {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f211b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<?> f212c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f213d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f214e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f215f = false;

    private static Typeface a(Object obj) {
        a();
        try {
            Object newInstance = Array.newInstance(f211b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f214e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f215f) {
            return;
        }
        f215f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f212c = constructor;
        f211b = cls;
        f213d = method2;
        f214e = method;
    }

    private static boolean a(Object obj, String str, int i, boolean z) {
        a();
        try {
            return ((Boolean) f213d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object b() {
        a();
        try {
            return f212c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.g.f.j
    public Typeface a(Context context, c.b bVar, Resources resources, int i) {
        c.C0006c[] a2;
        Object b2 = b();
        for (c.C0006c c0006c : bVar.a()) {
            File a3 = k.a(context);
            if (a3 == null) {
                return null;
            }
            try {
                if (!k.a(a3, resources, c0006c.b())) {
                    return null;
                }
                if (!a(b2, a3.getPath(), c0006c.e(), c0006c.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a3.delete();
            }
        }
        return a(b2);
    }

    @Override // a.g.f.j
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        b.f a2 = a(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.c(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File a3 = a(openFileDescriptor);
            if (a3 != null && a3.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(a3);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface a4 = super.a(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return a4;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
