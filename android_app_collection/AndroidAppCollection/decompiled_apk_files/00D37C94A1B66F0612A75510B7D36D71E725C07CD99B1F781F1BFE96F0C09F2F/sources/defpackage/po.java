package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: po  reason: default package */
/* loaded from: classes4.dex */
public final class po {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        pn pnVar;
        if (Build.VERSION.SDK_INT < 23) {
            synchronized (c) {
                SparseArray sparseArray = (SparseArray) b.get(context);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (pnVar = (pn) sparseArray.get(i)) != null) {
                    if (pnVar.b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = pnVar.a;
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
            ThreadLocal threadLocal = a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                Resources resources2 = context.getResources();
                try {
                    colorStateList = gj.a(resources2, resources2.getXml(i), context.getTheme());
                } catch (Exception e) {
                    Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (c) {
                    WeakHashMap weakHashMap = b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(context, sparseArray2);
                    }
                    sparseArray2.append(i, new pn(colorStateList, context.getResources().getConfiguration()));
                }
                return colorStateList;
            }
            return ake.f(context, i);
        }
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return yv.e().c(context, i);
    }
}
