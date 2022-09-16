package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: sts  reason: default package */
/* loaded from: classes4.dex */
public final class sts implements tex {
    private final teb a;

    public sts(teb tebVar) {
        this.a = tebVar;
    }

    private static int c(cyv cyvVar, awol awolVar, teb tebVar) {
        Context context = cyvVar.b;
        int i = awolVar.c;
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(16843820, typedValue, true)) {
            tebVar.b(22, String.format(Locale.US, "Ripple color (attribute = %s) not defined in the theme", "android.R.attr.colorControlHighlight"));
            return 0;
        }
        try {
            return ake.d(context, typedValue.resourceId);
        } catch (Resources.NotFoundException e) {
            tebVar.d(22, String.format(Locale.US, "Ripple Color (attribute = %s) is associated with undefined (colorId = %s)", "android.R.attr.colorControlHighlight", Integer.toHexString(typedValue.resourceId)), e);
            return 0;
        }
    }

    private static void d(awol awolVar, RippleDrawable rippleDrawable, DisplayMetrics displayMetrics) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || (i = awolVar.d) == 0) {
            return;
        }
        rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, i, displayMetrics)));
    }

    @Override // defpackage.tex
    public final aooq a() {
        return awol.b;
    }

    @Override // defpackage.tex
    public final /* bridge */ /* synthetic */ void b(cyv cyvVar, Object obj, tew tewVar) {
        awol awolVar = (awol) obj;
        int c = c(cyvVar, awolVar, this.a);
        if (c == 0) {
            return;
        }
        boolean z = awolVar.e;
        Drawable drawable = tewVar.d;
        DisplayMetrics displayMetrics = cyvVar.b().getDisplayMetrics();
        tac tacVar = null;
        if (z) {
            if (drawable == null) {
                tacVar = new tac();
                tacVar.c = -1;
                tacVar.d = tewVar.a;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(c), drawable, tacVar);
            d(awolVar, rippleDrawable, displayMetrics);
            tewVar.d = rippleDrawable;
            return;
        }
        RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(c), null, null);
        d(awolVar, rippleDrawable2, displayMetrics);
        if (drawable == null) {
            tewVar.d = rippleDrawable2;
        } else {
            tewVar.d = new LayerDrawable(new Drawable[]{drawable, rippleDrawable2});
        }
    }
}
