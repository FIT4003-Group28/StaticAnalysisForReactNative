package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: bwyy  reason: default package */
/* loaded from: classes4.dex */
final class bwyy extends cqtd {
    public bwyy(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(178, 0, 0, 0), Color.argb(153, 0, 0, 0), Color.argb(102, 0, 0, 0), Color.argb(38, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0)});
    }
}
