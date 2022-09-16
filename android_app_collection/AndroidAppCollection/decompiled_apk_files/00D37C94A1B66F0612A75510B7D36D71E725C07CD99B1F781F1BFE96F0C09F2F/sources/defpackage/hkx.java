package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hkx  reason: default package */
/* loaded from: classes3.dex */
abstract class hkx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private final int e;

    public hkx(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_border_width);
        this.e = dimensionPixelSize;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_corner_radius);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_width) - dimensionPixelSize;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_height) - dimensionPixelSize;
        this.d = zhn.d(context, R.attr.ytIconActiveOther);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(Object obj) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract hld b(Object obj, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public ampq c(Object obj) {
        throw null;
    }
}
