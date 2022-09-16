package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
/* compiled from: ReactViewBackgroundManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private d f4189a;

    /* renamed from: b  reason: collision with root package name */
    private View f4190b;

    public e(View view) {
        this.f4190b = view;
    }

    private d a() {
        if (this.f4189a == null) {
            this.f4189a = new d(this.f4190b.getContext());
            Drawable background = this.f4190b.getBackground();
            com.facebook.react.views.a.a.a(this.f4190b, null);
            if (background == null) {
                com.facebook.react.views.a.a.a(this.f4190b, this.f4189a);
            } else {
                com.facebook.react.views.a.a.a(this.f4190b, new LayerDrawable(new Drawable[]{this.f4189a, background}));
            }
        }
        return this.f4189a;
    }

    public void a(int i) {
        if (i == 0 && this.f4189a == null) {
            return;
        }
        a().a(i);
    }

    public void a(int i, float f) {
        a().a(i, f);
    }

    public void a(int i, float f, float f2) {
        a().a(i, f, f2);
    }

    public void a(float f) {
        a().a(f);
    }

    public void a(float f, int i) {
        a().a(f, i);
    }

    public void a(String str) {
        a().a(str);
    }
}
