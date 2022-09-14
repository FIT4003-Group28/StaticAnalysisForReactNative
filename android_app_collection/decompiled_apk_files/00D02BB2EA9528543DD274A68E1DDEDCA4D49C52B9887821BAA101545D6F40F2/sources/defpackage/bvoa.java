package defpackage;

import android.content.Context;
import android.graphics.Color;
/* compiled from: PG */
/* renamed from: bvoa  reason: default package */
/* loaded from: classes4.dex */
public final class bvoa {
    public static boolean a(int i) {
        return !b(i, -1);
    }

    public static boolean b(int i, int i2) {
        return (i & 16777215) == (i2 & 16777215);
    }

    public static int c(@dzsi String str, int i) {
        if (dbsj.d(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }

    public static boolean d(@dzsi String str) {
        if (dbsj.d(str)) {
            return false;
        }
        try {
            Color.parseColor(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static String e(int i) {
        return String.format(null, "#%08x", Integer.valueOf(i));
    }

    public static bvxp f(iuv iuvVar, Context context) {
        bvxo bZ = bvxp.d.bZ();
        int b = iuvVar.a.b(context);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxp bvxpVar = (bvxp) bZ.b;
        bvxpVar.a |= 1;
        bvxpVar.b = b;
        int b2 = iuvVar.b.b(context);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxp bvxpVar2 = (bvxp) bZ.b;
        bvxpVar2.a |= 2;
        bvxpVar2.c = b2;
        return bZ.bK();
    }

    public static iuv g(dgaq dgaqVar) {
        return iva.b(h(dgaqVar.b), h(dgaqVar.c));
    }

    private static cqss h(int i) {
        return cqta.d(Color.argb(i >> 24, (i >> 16) & 255, (i >> 8) & 255, i & 255));
    }
}
