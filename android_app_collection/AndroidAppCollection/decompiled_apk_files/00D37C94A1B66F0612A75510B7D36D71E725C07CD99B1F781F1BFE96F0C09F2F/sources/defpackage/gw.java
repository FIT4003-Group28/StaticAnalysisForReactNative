package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: gw  reason: default package */
/* loaded from: classes3.dex */
public final class gw {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static int a(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        gp gpVar;
        gq gqVar = new gq(resources, theme);
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(gqVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (gpVar = (gp) sparseArray.get(i)) != null) {
                if (gpVar.b.equals(gqVar.a.getConfiguration())) {
                    colorStateList2 = gpVar.a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateList = gj.a(resources, resources.getXml(i), theme);
                } catch (Exception e) {
                    Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                synchronized (c) {
                    WeakHashMap weakHashMap = b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(gqVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(gqVar, sparseArray2);
                    }
                    sparseArray2.append(i, new gp(colorStateList, gqVar.a.getConfiguration()));
                }
                return colorStateList;
            }
            return resources.getColorStateList(i);
        }
        return colorStateList2;
    }

    public static Typeface c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return h(context, i, new TypedValue(), 0, null, false, true);
    }

    public static Typeface d(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return h(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface e(Context context, int i, TypedValue typedValue, int i2, gt gtVar) {
        if (context.isRestricted()) {
            return null;
        }
        return h(context, i, typedValue, i2, gtVar, true, false);
    }

    public static Drawable f(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static void g(Context context, int i, gt gtVar) {
        if (context.isRestricted()) {
            gtVar.b(-4);
        } else {
            h(context, i, new TypedValue(), 0, gtVar, false, false);
        }
    }

    private static Typeface h(Context context, int i, TypedValue typedValue, int i2, gt gtVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface i3 = i(context, resources, typedValue, i, i2, gtVar, z, z2);
        if (i3 == null && gtVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d A[Catch: IOException -> 0x01ae, XmlPullParserException -> 0x01c4, TryCatch #2 {IOException -> 0x01ae, XmlPullParserException -> 0x01c4, blocks: (B:16:0x003f, B:18:0x004b, B:19:0x004f, B:23:0x005a, B:24:0x0061, B:25:0x0062, B:27:0x006f, B:31:0x00a5, B:33:0x00ac, B:34:0x00b0, B:76:0x017d, B:78:0x0184, B:81:0x018a, B:35:0x00c0, B:36:0x00c5, B:38:0x00cc, B:40:0x00d3, B:42:0x00df, B:45:0x00f3, B:49:0x0102, B:53:0x010e, B:56:0x0117, B:59:0x011f, B:63:0x0132, B:64:0x013d, B:66:0x0144, B:67:0x0148, B:68:0x0154, B:69:0x015d, B:72:0x0164, B:73:0x0177, B:83:0x019b, B:86:0x01a5, B:87:0x01a9), top: B:100:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a A[Catch: IOException -> 0x01ae, XmlPullParserException -> 0x01c4, TryCatch #2 {IOException -> 0x01ae, XmlPullParserException -> 0x01c4, blocks: (B:16:0x003f, B:18:0x004b, B:19:0x004f, B:23:0x005a, B:24:0x0061, B:25:0x0062, B:27:0x006f, B:31:0x00a5, B:33:0x00ac, B:34:0x00b0, B:76:0x017d, B:78:0x0184, B:81:0x018a, B:35:0x00c0, B:36:0x00c5, B:38:0x00cc, B:40:0x00d3, B:42:0x00df, B:45:0x00f3, B:49:0x0102, B:53:0x010e, B:56:0x0117, B:59:0x011f, B:63:0x0132, B:64:0x013d, B:66:0x0144, B:67:0x0148, B:68:0x0154, B:69:0x015d, B:72:0x0164, B:73:0x0177, B:83:0x019b, B:86:0x01a5, B:87:0x01a9), top: B:100:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface i(android.content.Context r23, android.content.res.Resources r24, android.util.TypedValue r25, int r26, int r27, defpackage.gt r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw.i(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, gt, boolean, boolean):android.graphics.Typeface");
    }
}
