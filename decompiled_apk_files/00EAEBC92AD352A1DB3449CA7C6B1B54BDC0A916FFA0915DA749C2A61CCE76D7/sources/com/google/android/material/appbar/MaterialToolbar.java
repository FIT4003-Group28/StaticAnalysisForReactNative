package com.google.android.material.appbar;

import a.g.m.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import c.e.a.c.a0.h;
import c.e.a.c.j;
import com.google.android.material.internal.g;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final int Q = j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.e.a.c.b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(g.b(context, attributeSet, i, Q), attributeSet, i);
        a(getContext());
    }

    private void a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            c.e.a.c.a0.g gVar = new c.e.a.c.a0.g();
            gVar.a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.a(context);
            gVar.a(v.l(this));
            v.a(this, gVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.a(this, f2);
    }
}
