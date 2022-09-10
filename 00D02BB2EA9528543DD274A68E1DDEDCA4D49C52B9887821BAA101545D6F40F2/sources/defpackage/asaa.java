package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: asaa  reason: default package */
/* loaded from: classes2.dex */
public final class asaa {
    public static Bitmap a(amuo amuoVar, boolean z, int i) {
        amuo amuoVar2 = amuoVar.R;
        if (z && amuoVar2 != null && amuoVar2.b() != null) {
            amun h = amuoVar.h();
            h.a = dgau.STRAIGHT;
            h.b = dpdn.SIDE_UNSPECIFIED;
            h.c = dpdp.TURN_STRAIGHT;
            amuoVar = h.a();
        }
        return b(vrv.i(amuoVar, -1), i);
    }

    public static Bitmap b(Drawable drawable, int i) {
        dbsk.s(drawable);
        dbsk.a(i > 0);
        return bvlf.d(drawable, i, i, Bitmap.Config.ARGB_8888);
    }
}
