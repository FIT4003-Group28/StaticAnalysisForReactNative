package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
class m extends Animation implements j {

    /* renamed from: b  reason: collision with root package name */
    private final View f5972b;

    /* renamed from: c  reason: collision with root package name */
    private float f5973c;

    /* renamed from: d  reason: collision with root package name */
    private float f5974d;

    /* renamed from: e  reason: collision with root package name */
    private float f5975e;

    /* renamed from: f  reason: collision with root package name */
    private float f5976f;

    /* renamed from: g  reason: collision with root package name */
    private int f5977g;

    /* renamed from: h  reason: collision with root package name */
    private int f5978h;
    private int i;
    private int j;

    public m(View view, int i, int i2, int i3, int i4) {
        this.f5972b = view;
        b(i, i2, i3, i4);
    }

    private void b(int i, int i2, int i3, int i4) {
        this.f5973c = this.f5972b.getX() - this.f5972b.getTranslationX();
        this.f5974d = this.f5972b.getY() - this.f5972b.getTranslationY();
        this.f5977g = this.f5972b.getWidth();
        this.f5978h = this.f5972b.getHeight();
        this.f5975e = i - this.f5973c;
        this.f5976f = i2 - this.f5974d;
        this.i = i3 - this.f5977g;
        this.j = i4 - this.f5978h;
    }

    @Override // com.facebook.react.uimanager.h1.j
    public void a(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f2, Transformation transformation) {
        float f3 = this.f5973c + (this.f5975e * f2);
        float f4 = this.f5974d + (this.f5976f * f2);
        this.f5972b.layout(Math.round(f3), Math.round(f4), Math.round(f3 + this.f5977g + (this.i * f2)), Math.round(f4 + this.f5978h + (this.j * f2)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
