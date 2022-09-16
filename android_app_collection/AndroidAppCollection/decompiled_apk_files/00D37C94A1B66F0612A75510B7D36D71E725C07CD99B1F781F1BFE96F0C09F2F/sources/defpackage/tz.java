package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: tz  reason: default package */
/* loaded from: classes4.dex */
public class tz extends CheckBox {
    private final ub a;
    private final ty b;
    private final uz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        aaa.a(context);
        zy.d(this, getContext());
        ub ubVar = new ub(this);
        this.a = ubVar;
        ubVar.a(attributeSet, R.attr.checkboxStyle);
        ty tyVar = new ty(this);
        this.b = tyVar;
        tyVar.b(attributeSet, R.attr.checkboxStyle);
        uz uzVar = new uz(this);
        this.c = uzVar;
        uzVar.g(attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.a();
        }
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(po.b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ub ubVar = this.a;
        if (ubVar != null) {
            ubVar.b();
        }
    }
}
