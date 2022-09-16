package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: ki  reason: default package */
/* loaded from: classes.dex */
class ki extends kq {
    private static Class<?> a = null;
    private static Constructor<?> b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static void f() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    private static Object g() {
        f();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static final File h(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.kq
    public Typeface a(Context context, jo joVar, Resources resources, int i) {
        jp[] jpVarArr;
        Object g = g();
        for (jp jpVar : joVar.a) {
            File a2 = kr.a(context);
            if (a2 != null) {
                try {
                    if (!kr.c(a2, resources, jpVar.f)) {
                        return null;
                    }
                    String path = a2.getPath();
                    int i2 = jpVar.b;
                    boolean z = jpVar.c;
                    f();
                    try {
                        if (!((Boolean) c.invoke(g, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                            return null;
                        }
                        a2.delete();
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (RuntimeException unused) {
                } finally {
                    a2.delete();
                }
            }
            return null;
        }
        f();
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, g);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.kq
    public Typeface b(Context context, alf[] alfVarArr, int i) {
        if (alfVarArr.length <= 0) {
            return null;
        }
        alf k = k(alfVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k.a, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            File h = h(openFileDescriptor);
            if (h != null && h.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(h);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface l = super.l(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return l;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
