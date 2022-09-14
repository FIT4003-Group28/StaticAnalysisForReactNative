package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* loaded from: classes.dex */
public class g extends CheckBox implements androidx.core.widget.j, a.g.m.u {

    /* renamed from: b  reason: collision with root package name */
    private final i f1253b;

    /* renamed from: c  reason: collision with root package name */
    private final e f1254c;

    /* renamed from: d  reason: collision with root package name */
    private final y f1255d;

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.checkboxStyle);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        this.f1253b = new i(this);
        this.f1253b.a(attributeSet, i);
        this.f1254c = new e(this);
        this.f1254c.a(attributeSet, i);
        this.f1255d = new y(this);
        this.f1255d.a(attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1254c;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1255d;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f1253b;
        return iVar != null ? iVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1254c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1254c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f1253b;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f1253b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1254c;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1254c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.a.k.a.a.c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f1253b;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1254c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1254c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f1253b;
        if (iVar != null) {
            iVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1253b;
        if (iVar != null) {
            iVar.a(mode);
        }
    }
}
