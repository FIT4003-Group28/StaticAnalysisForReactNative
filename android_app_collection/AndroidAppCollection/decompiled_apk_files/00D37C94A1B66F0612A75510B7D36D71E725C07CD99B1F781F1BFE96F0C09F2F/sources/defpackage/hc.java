package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
/* compiled from: PG */
/* renamed from: hc  reason: default package */
/* loaded from: classes3.dex */
public final class hc {
    public static final agc a;
    private static final hk b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            b = new hh();
        } else if (Build.VERSION.SDK_INT >= 28) {
            b = new hg();
        } else if (Build.VERSION.SDK_INT >= 26) {
            b = new hf();
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                if (he.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (he.a != null) {
                    b = new he();
                }
            }
            b = new hd();
        }
        a = new agc(16);
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, ald[] aldVarArr, int i) {
        return b.b(context, cancellationSignal, aldVarArr, i);
    }

    public static Typeface c(Context context, Resources resources, int i, String str, int i2) {
        Typeface d = b.d(context, resources, i, str, i2);
        if (d != null) {
            a.d(d(resources, i, i2), d);
        }
        return d;
    }

    public static String d(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface e(android.content.Context r6, defpackage.gl r7, android.content.res.Resources r8, int r9, int r10, defpackage.gt r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc.e(android.content.Context, gl, android.content.res.Resources, int, int, gt, boolean):android.graphics.Typeface");
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface, i);
    }
}
