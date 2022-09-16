package defpackage;

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
/* compiled from: PG */
/* renamed from: hd  reason: default package */
/* loaded from: classes3.dex */
class hd extends hk {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object f() {
        g();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void g() {
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
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
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

    @Override // defpackage.hk
    public Typeface a(Context context, gm gmVar, Resources resources, int i) {
        gn[] gnVarArr;
        Object f = f();
        for (gn gnVar : gmVar.a) {
            File o = iy.o(context);
            if (o != null) {
                try {
                    if (!iy.s(o, resources, gnVar.f)) {
                        return null;
                    }
                    String path = o.getPath();
                    int i2 = gnVar.b;
                    boolean z = gnVar.c;
                    g();
                    try {
                        if (!((Boolean) c.invoke(f, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                            return null;
                        }
                        o.delete();
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (RuntimeException unused) {
                } finally {
                    o.delete();
                }
            }
            return null;
        }
        g();
        try {
            Object newInstance = Array.newInstance(a, 1);
            Array.set(newInstance, 0, f);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.hk
    public Typeface b(Context context, CancellationSignal cancellationSignal, ald[] aldVarArr, int i) {
        if (aldVarArr.length <= 0) {
            return null;
        }
        ald l = l(aldVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l.a, "r", cancellationSignal);
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
            Typeface k = super.k(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return k;
        } catch (IOException unused) {
            return null;
        }
    }
}
