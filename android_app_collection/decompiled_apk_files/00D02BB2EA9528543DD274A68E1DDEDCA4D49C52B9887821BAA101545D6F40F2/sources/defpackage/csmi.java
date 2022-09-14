package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csmi  reason: default package */
/* loaded from: classes5.dex */
public final class csmi {
    public final int c;
    public final csme d;
    public int e;
    private final int h;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public boolean f = false;
    public int g = 0;

    public csmi(csme csmeVar) {
        this.d = csmeVar;
        Resources resources = csmeVar.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_max_width);
        this.h = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_horizontal_offset);
        this.c = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_vertical_offset);
    }

    public final int a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = i3 / 2;
        int i6 = i4 - i <= i2 - i4 ? (i4 - i5) + this.h : (i4 - i5) - this.h;
        if (i6 - marginLayoutParams.leftMargin < i) {
            return i + marginLayoutParams.leftMargin;
        }
        return (i6 + i3) + marginLayoutParams.rightMargin > i2 ? (i2 - i3) - marginLayoutParams.rightMargin : i6;
    }

    public final void b(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.e), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }
}
