package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: ka  reason: default package */
/* loaded from: classes.dex */
public final class ka {
    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    public static int b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, null);
        }
        return resources.getColor(i);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, jx jxVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface d = d(context, resources, typedValue, i, i2, jxVar, z, z2);
        if (d == null && jxVar == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1 A[Catch: IOException -> 0x01e5, XmlPullParserException -> 0x01f6, TryCatch #3 {IOException -> 0x01e5, XmlPullParserException -> 0x01f6, blocks: (B:16:0x003d, B:18:0x0049, B:19:0x004d, B:23:0x0058, B:24:0x005f, B:25:0x0060, B:27:0x006d, B:31:0x009e, B:33:0x00a4, B:35:0x00aa, B:53:0x00f4, B:98:0x01bb, B:101:0x01c1, B:36:0x00af, B:40:0x00bd, B:57:0x0105, B:58:0x010a, B:60:0x0110, B:62:0x0117, B:64:0x0123, B:67:0x0136, B:70:0x0144, B:74:0x014f, B:77:0x0158, B:80:0x0160, B:84:0x0172, B:85:0x017d, B:87:0x0183, B:88:0x0187, B:89:0x0193, B:90:0x0199, B:93:0x01a0, B:94:0x01b3, B:103:0x01d2, B:106:0x01dc, B:107:0x01e0, B:37:0x00b3, B:39:0x00b9, B:42:0x00c2, B:45:0x00ce, B:47:0x00d4, B:49:0x00da, B:50:0x00e5, B:51:0x00e8), top: B:118:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface d(android.content.Context r23, android.content.res.Resources r24, android.util.TypedValue r25, int r26, int r27, defpackage.jx r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka.d(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, jx, boolean, boolean):android.graphics.Typeface");
    }
}
