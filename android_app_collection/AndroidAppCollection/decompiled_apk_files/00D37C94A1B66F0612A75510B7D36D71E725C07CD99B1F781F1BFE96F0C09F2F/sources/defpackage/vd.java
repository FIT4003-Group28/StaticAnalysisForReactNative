package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* compiled from: PG */
/* renamed from: vd  reason: default package */
/* loaded from: classes4.dex */
public class vd extends ToggleButton {
    private final ty a;
    private final uz b;

    public vd(Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.a();
        }
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.a;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    public vd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public vd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zy.d(this, getContext());
        ty tyVar = new ty(this);
        this.a = tyVar;
        tyVar.b(attributeSet, i);
        uz uzVar = new uz(this);
        this.b = uzVar;
        uzVar.g(attributeSet, i);
    }
}
