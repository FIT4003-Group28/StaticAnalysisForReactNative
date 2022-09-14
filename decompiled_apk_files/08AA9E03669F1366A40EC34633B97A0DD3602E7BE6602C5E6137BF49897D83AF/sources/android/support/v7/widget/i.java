package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* compiled from: AppCompatEditText.java */
/* loaded from: classes.dex */
public class i extends EditText implements android.support.v4.j.r {

    /* renamed from: a  reason: collision with root package name */
    private final g f974a;

    /* renamed from: b  reason: collision with root package name */
    private final p f975b;

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f974a != null) {
            this.f974a.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f974a != null) {
            this.f974a.a(drawable);
        }
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f974a != null) {
            this.f974a.a(colorStateList);
        }
    }

    @Override // android.support.v4.j.r
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f974a != null) {
            return this.f974a.a();
        }
        return null;
    }

    @Override // android.support.v4.j.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f974a != null) {
            this.f974a.a(mode);
        }
    }

    @Override // android.support.v4.j.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f974a != null) {
            return this.f974a.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f974a != null) {
            this.f974a.c();
        }
        if (this.f975b != null) {
            this.f975b.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f975b != null) {
            this.f975b.a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return j.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
