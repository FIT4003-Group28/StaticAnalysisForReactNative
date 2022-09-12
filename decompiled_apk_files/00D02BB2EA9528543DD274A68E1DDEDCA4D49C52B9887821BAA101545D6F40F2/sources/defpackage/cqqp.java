package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqqp  reason: default package */
/* loaded from: classes5.dex */
final class cqqp extends cqss {
    final /* synthetic */ cqss a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqqp(Object[] objArr, cqss cqssVar) {
        super(objArr);
        this.a = cqssVar;
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return c(context).getDefaultColor();
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        int b = this.a.b(context);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorButtonNormal});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return new ColorStateList(new int[][]{cslb.a, cslb.b}, new int[]{kc.f(color, Math.round(Color.alpha(color) * f)), b});
    }
}
