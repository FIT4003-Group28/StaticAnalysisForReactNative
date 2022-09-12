package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: sl  reason: default package */
/* loaded from: classes.dex */
public final class sl {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<sk>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        sk skVar;
        if (Build.VERSION.SDK_INT < 23) {
            synchronized (c) {
                SparseArray<sk> sparseArray = b.get(context);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (skVar = sparseArray.get(i)) != null) {
                    if (skVar.b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = skVar.a;
                    } else {
                        sparseArray.remove(i);
                    }
                }
                colorStateList2 = null;
            }
            if (colorStateList2 != null) {
                return colorStateList2;
            }
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                Resources resources2 = context.getResources();
                try {
                    colorStateList = jl.a(resources2, resources2.getXml(i), context.getTheme());
                } catch (Exception unused) {
                }
            }
            if (colorStateList != null) {
                synchronized (c) {
                    WeakHashMap<Context, SparseArray<sk>> weakHashMap = b;
                    SparseArray<sk> sparseArray2 = weakHashMap.get(context);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                        weakHashMap.put(context, sparseArray2);
                    }
                    sparseArray2.append(i, new sk(colorStateList, context.getResources().getConfiguration()));
                }
                return colorStateList;
            }
            return akm.b(context, i);
        }
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return acv.a().c(context, i);
    }
}
