package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hk  reason: default package */
/* loaded from: classes3.dex */
public class hk {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long f(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object g(Object[] objArr, int i, hj hjVar) {
        int i2 = 1 != (i & 1) ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(hjVar.a(obj2) - i2);
            int i4 = abs + abs + (hjVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    public Typeface a(Context context, gm gmVar, Resources resources, int i) {
        gn gnVar = (gn) g(gmVar.a, i, new hi());
        if (gnVar == null) {
            return null;
        }
        Typeface c = hc.c(context, resources, gnVar.f, gnVar.a, i);
        long f = f(c);
        if (f != 0) {
            this.a.put(Long.valueOf(f), gmVar);
        }
        return c;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, ald[] aldVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (aldVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(l(aldVarArr, i).a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface k = k(context, inputStream);
            iy.q(inputStream);
            return k;
        } catch (IOException unused2) {
            iy.q(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            iy.q(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File o = iy.o(context);
        if (o == null) {
            return null;
        }
        try {
            if (iy.s(o, resources, i)) {
                return Typeface.createFromFile(o.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface k(Context context, InputStream inputStream) {
        File o = iy.o(context);
        if (o == null) {
            return null;
        }
        try {
            if (iy.r(o, inputStream)) {
                return Typeface.createFromFile(o.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ald l(ald[] aldVarArr, int i) {
        return (ald) g(aldVarArr, i, new hi(1));
    }
}
