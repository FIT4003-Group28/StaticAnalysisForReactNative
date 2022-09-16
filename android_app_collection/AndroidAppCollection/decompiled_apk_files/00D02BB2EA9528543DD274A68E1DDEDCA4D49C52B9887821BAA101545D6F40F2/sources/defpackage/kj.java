package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: PG */
/* renamed from: kj  reason: default package */
/* loaded from: classes7.dex */
final class kj extends kq {
    public static final Method a;
    private static final Class<?> b;
    private static final Constructor<?> c;
    private static final Method d;

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
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        a = method2;
        d = method;
    }

    private static Object f() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.kq
    public final Typeface a(Context context, jo joVar, Resources resources, int i) {
        jp[] jpVarArr;
        MappedByteBuffer mappedByteBuffer;
        Object f = f();
        if (f == null) {
            return null;
        }
        for (jp jpVar : joVar.a) {
            int i2 = jpVar.f;
            File a2 = kr.a(context);
            if (a2 != null) {
                try {
                    if (kr.c(a2, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(a2);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !g(f, mappedByteBuffer, jpVar.e, jpVar.b, jpVar.c)) {
                            return null;
                        }
                    }
                } finally {
                    a2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return h(f);
    }

    @Override // defpackage.kq
    public final Typeface b(Context context, alf[] alfVarArr, int i) {
        Object f = f();
        if (f == null) {
            return null;
        }
        aim aimVar = new aim();
        for (alf alfVar : alfVarArr) {
            Uri uri = alfVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) aimVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = kr.e(context, uri);
                aimVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(f, byteBuffer, alfVar.b, alfVar.c, alfVar.d)) {
                return null;
            }
        }
        Typeface h = h(f);
        if (h != null) {
            return Typeface.create(h, i);
        }
        return null;
    }
}
