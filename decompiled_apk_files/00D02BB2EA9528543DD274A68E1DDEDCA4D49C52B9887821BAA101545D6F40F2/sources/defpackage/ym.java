package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* compiled from: PG */
/* renamed from: ym  reason: default package */
/* loaded from: classes.dex */
public final class ym extends ToggleButton {
    private final xc a;
    private final yh b;

    public ym(Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.e();
        }
        yh yhVar = this.b;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    public ym(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public ym(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ael.d(this, getContext());
        xc xcVar = new xc(this);
        this.a = xcVar;
        xcVar.a(attributeSet, i);
        yh yhVar = new yh(this);
        this.b = yhVar;
        yhVar.a(attributeSet, i);
    }
}
