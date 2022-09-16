package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.lang.reflect.Array;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TintableImageView extends ImageView {
    public static final ColorStateList a = new ColorStateList((int[][]) Array.newInstance(int.class, 0, 0), new int[0]);
    private yzh b;
    private ColorStateList c;
    private boolean d;

    public TintableImageView(Context context) {
        super(zhn.n(context, null, 2132084489));
        b();
    }

    private final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = a;
        c();
    }

    private final void c() {
        setImageDrawable(getDrawable());
    }

    public final void a(ColorStateList colorStateList) {
        if (this.c == colorStateList) {
            return;
        }
        this.c = colorStateList;
        c();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null || !this.d) {
            super.setImageDrawable(drawable);
            return;
        }
        if (this.b == null) {
            this.b = new yzh(getContext());
        }
        yzh yzhVar = this.b;
        ColorStateList colorStateList = this.c;
        if (colorStateList != a) {
            super.setImageDrawable(yzhVar.c(drawable, colorStateList));
            return;
        }
        if (yzhVar.b == null) {
            int orElse = zhn.j(yzhVar.a, R.attr.colorControlNormal).orElse(0);
            int orElse2 = zhn.j(yzhVar.a, R.attr.colorControlActivated).orElse(0);
            yzhVar.b = yzhVar.a(orElse2, orElse2, orElse2, orElse2, zhn.j(yzhVar.a, R.attr.colorControlSelected).orElse(orElse2), orElse);
        }
        super.setImageDrawable(yzhVar.d(drawable, yzhVar.b, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }

    public TintableImageView(Context context, AttributeSet attributeSet) {
        super(zhn.n(context, attributeSet, 2132084489), attributeSet);
        b();
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i) {
        super(zhn.n(context, attributeSet, 2132084489), attributeSet, i);
        b();
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(zhn.n(context, attributeSet, 2132084489), attributeSet, i, i2);
        b();
    }
}
