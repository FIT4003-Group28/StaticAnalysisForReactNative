package com.facebook.react.uimanager.c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PositionAndSizeAnimation.java */
/* loaded from: classes.dex */
class m extends Animation implements d {

    /* renamed from: a  reason: collision with root package name */
    private final View f3867a;

    /* renamed from: b  reason: collision with root package name */
    private final float f3868b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3869c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3870d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }

    public m(View view, int i, int i2, int i3, int i4) {
        this.f3867a = view;
        this.f3868b = view.getX() - view.getTranslationX();
        this.f3869c = view.getY() - view.getTranslationY();
        this.f = view.getWidth();
        this.g = view.getHeight();
        this.f3870d = i - this.f3868b;
        this.e = i2 - this.f3869c;
        this.h = i3 - this.f;
        this.i = i4 - this.g;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f3868b + (this.f3870d * f);
        float f3 = this.f3869c + (this.e * f);
        this.f3867a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + this.f + (this.h * f)), Math.round(f3 + this.g + (this.i * f)));
    }
}
