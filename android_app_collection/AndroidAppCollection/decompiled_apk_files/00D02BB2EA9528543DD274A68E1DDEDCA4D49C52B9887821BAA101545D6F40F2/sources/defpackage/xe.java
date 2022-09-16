package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xe  reason: default package */
/* loaded from: classes.dex */
public class xe extends CheckBox {
    private final xg a;
    private final xc b;
    private final yh c;

    public xe(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.e();
        }
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        xg xgVar = this.a;
        return compoundPaddingLeft;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(sl.b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        xg xgVar = this.a;
        if (xgVar != null) {
            xgVar.b(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        xg xgVar = this.a;
        if (xgVar != null) {
            xgVar.c(mode);
        }
    }

    public xe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        xg xgVar = this.a;
        if (xgVar != null) {
            xgVar.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        ael.d(this, getContext());
        xg xgVar = new xg(this);
        this.a = xgVar;
        xgVar.a(attributeSet, i);
        xc xcVar = new xc(this);
        this.b = xcVar;
        xcVar.a(attributeSet, i);
        yh yhVar = new yh(this);
        this.c = yhVar;
        yhVar.a(attributeSet, i);
    }
}
