package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        a();
    }

    private final void a() {
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i = 0; i < compoundDrawablesRelative.length; i++) {
            Drawable drawable = compoundDrawablesRelative[i];
            if (drawable != null) {
                compoundDrawablesRelative[i] = daqf.a(drawable);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    private final void b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3], compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i = 0; i < 6; i++) {
                Drawable drawable = drawableArr[i];
                if (drawable instanceof daqf) {
                    daqf daqfVar = (daqf) drawable;
                    daqfVar.a = textColors;
                    if (daqfVar.b()) {
                        daqfVar.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = daqf.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = daqf.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = daqf.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = daqf.a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = daqf.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = daqf.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = daqf.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = daqf.a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
