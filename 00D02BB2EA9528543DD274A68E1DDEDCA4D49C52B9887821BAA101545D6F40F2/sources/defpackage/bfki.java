package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfki  reason: default package */
/* loaded from: classes3.dex */
public final class bfki {
    public static float a(Resources resources) {
        btpf d = btpf.d(resources.getConfiguration());
        return b(d.e, d.f, resources);
    }

    public static float b(boolean z, boolean z2, Resources resources) {
        dhkd f = f(resources.getDisplayMetrics());
        return ((int) (i(resources, z, z2) / resources.getDisplayMetrics().density)) / Math.max(180, (z2 ? Math.min(f.b, f.c) : Math.max(f.b, f.c)) / 3);
    }

    public static dvxv c(Resources resources, @dzsi String str) {
        dvxu bZ = dvxv.e.bZ();
        boolean z = btpf.d(resources.getConfiguration()).e;
        bZ.a(h(resources, z, false));
        bZ.a(h(resources, z, true));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvxv dvxvVar = (dvxv) bZ.b;
        int i = dvxvVar.a | 1;
        dvxvVar.a = i;
        dvxvVar.c = z;
        if (str != null) {
            str.getClass();
            dvxvVar.a = i | 2;
            dvxvVar.d = str;
        }
        return bZ.bK();
    }

    public static dhkd d(Resources resources) {
        btpf d = btpf.d(resources.getConfiguration());
        return h(resources, d.e, d.f);
    }

    public static dhkd e(Context context) {
        return f(context.getResources().getDisplayMetrics());
    }

    public static dhkd f(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        dhkc bZ = dhkd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        int i3 = dhkdVar.a | 1;
        dhkdVar.a = i3;
        dhkdVar.b = i2;
        dhkdVar.a = i3 | 2;
        dhkdVar.c = i;
        return bZ.bK();
    }

    public static float g(jkj jkjVar, jjn jjnVar, float f) {
        int C = jkjVar.C(jjnVar);
        return (jkjVar.M() + jkjVar.getTop()) - (C + ((jkjVar.C(jkjVar.D(jjnVar)) - C) * f));
    }

    private static dhkd h(Resources resources, boolean z, boolean z2) {
        int i = i(resources, z, z2);
        int b = (int) (i / b(z, z2, resources));
        dhkc bZ = dhkd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        int i2 = dhkdVar.a | 2;
        dhkdVar.a = i2;
        dhkdVar.c = b;
        dhkdVar.a = i2 | 1;
        dhkdVar.b = i;
        return bZ.bK();
    }

    private static int i(Resources resources, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return resources.getDimensionPixelOffset(R.dimen.tablet_landscape_side_sheet_width);
            }
            Configuration configuration = resources.getConfiguration();
            return (int) TypedValue.applyDimension(1, Math.max(configuration.screenHeightDp, configuration.screenWidthDp), resources.getDisplayMetrics());
        }
        return (int) TypedValue.applyDimension(1, resources.getConfiguration().smallestScreenWidthDp, resources.getDisplayMetrics());
    }
}
