package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
/* compiled from: AppCompatAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class f extends AutoCompleteTextView implements android.support.v4.j.r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f963a = {16843126};

    /* renamed from: b  reason: collision with root package name */
    private final g f964b;

    /* renamed from: c  reason: collision with root package name */
    private final p f965c;

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0020a.autoCompleteTextViewStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(aj.a(context), attributeSet, i);
        am a2 = am.a(getContext(), attributeSet, f963a, i, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.a();
        this.f964b = new g(this);
        this.f964b.a(attributeSet, i);
        this.f965c = p.a(this);
        this.f965c.a(attributeSet, i);
        this.f965c.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(android.support.v7.b.a.b.b(getContext(), i));
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f964b != null) {
            this.f964b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f964b != null) {
            this.f964b.a(drawable);
        }
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f964b != null) {
            this.f964b.a(colorStateList);
        }
    }

    @Override // android.support.v4.j.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f964b != null) {
            return this.f964b.a();
        }
        return null;
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f964b != null) {
            this.f964b.a(mode);
        }
    }

    @Override // android.support.v4.j.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f964b != null) {
            return this.f964b.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f964b != null) {
            this.f964b.c();
        }
        if (this.f965c != null) {
            this.f965c.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f965c != null) {
            this.f965c.a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return j.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
