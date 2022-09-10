package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czxf  reason: default package */
/* loaded from: classes5.dex */
public final class czxf {
    public final czxe a;
    final czxe b;
    final czxe c;
    final czxe d;
    final czxe e;
    final czxe f;
    final czxe g;
    public final Paint h;

    public czxf(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(dacz.b(context, R.attr.materialCalendarStyle, czxs.class.getCanonicalName()), czyj.a);
        this.a = czxe.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = czxe.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.b = czxe.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.c = czxe.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a = dada.a(context, obtainStyledAttributes, 6);
        this.d = czxe.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.e = czxe.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f = czxe.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
