package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: kq  reason: default package */
/* loaded from: classes.dex */
public class kq {
    private final ConcurrentHashMap<Long, jo> a = new ConcurrentHashMap<>();

    private static <T> T f(T[] tArr, int i, kp<T> kpVar) {
        int i2 = 1 != (i & 1) ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(kpVar.b(t2) - i2);
            int i4 = abs + abs + (kpVar.a(t2) == z ? 0 : 1);
            if (t == null || i3 > i4) {
                t = t2;
                i3 = i4;
            }
        }
        return t;
    }

    private static long g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    public Typeface a(Context context, jo joVar, Resources resources, int i) {
        jp jpVar = (jp) f(joVar.a, i, new ko());
        if (jpVar == null) {
            return null;
        }
        Typeface b = kh.b(context, resources, jpVar.f, jpVar.a, i);
        long g = g(b);
        if (g != 0) {
            this.a.put(Long.valueOf(g), joVar);
        }
        return b;
    }

    public Typeface b(Context context, alf[] alfVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (alfVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(k(alfVarArr, i).a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface l = l(context, inputStream);
            kr.d(inputStream);
            return l;
        } catch (IOException unused2) {
            kr.d(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            kr.d(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File a = kr.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (kr.c(a, resources, i)) {
                return Typeface.createFromFile(a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public alf k(alf[] alfVarArr, int i) {
        return (alf) f(alfVarArr, i, new kn());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface l(Context context, InputStream inputStream) {
        File a = kr.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (kr.b(a, inputStream)) {
                return Typeface.createFromFile(a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
