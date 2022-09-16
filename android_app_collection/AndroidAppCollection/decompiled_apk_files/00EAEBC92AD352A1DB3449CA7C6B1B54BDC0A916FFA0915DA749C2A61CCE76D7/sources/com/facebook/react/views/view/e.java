package com.facebook.react.views.view;

import a.g.m.v;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private d f6401a;

    /* renamed from: b  reason: collision with root package name */
    private View f6402b;

    public e(View view) {
        this.f6402b = view;
    }

    private d a() {
        Drawable layerDrawable;
        View view;
        if (this.f6401a == null) {
            this.f6401a = new d(this.f6402b.getContext());
            Drawable background = this.f6402b.getBackground();
            v.a(this.f6402b, (Drawable) null);
            if (background == null) {
                view = this.f6402b;
                layerDrawable = this.f6401a;
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{this.f6401a, background});
                view = this.f6402b;
            }
            v.a(view, layerDrawable);
        }
        return this.f6401a;
    }

    public void a(float f2) {
        a().a(f2);
    }

    public void a(float f2, int i) {
        a().b(f2, i);
    }

    public void a(int i) {
        if (i == 0 && this.f6401a == null) {
            return;
        }
        a().b(i);
    }

    public void a(int i, float f2) {
        a().a(i, f2);
    }

    public void a(int i, float f2, float f3) {
        a().a(i, f2, f3);
    }

    public void a(String str) {
        a().a(str);
    }
}
