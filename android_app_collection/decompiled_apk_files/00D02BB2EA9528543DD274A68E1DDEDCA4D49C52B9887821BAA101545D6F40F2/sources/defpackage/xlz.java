package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: xlz  reason: default package */
/* loaded from: classes7.dex */
final class xlz {
    public final Resources a;
    public final vtn b;

    public xlz(Resources resources, vtn vtnVar) {
        this.a = resources;
        this.b = vtnVar;
    }

    public final Bitmap a(Drawable drawable, int i) {
        int c = jmj.c(this.a, i);
        return bvlf.c(drawable, c, c, Bitmap.Config.ARGB_8888);
    }
}
