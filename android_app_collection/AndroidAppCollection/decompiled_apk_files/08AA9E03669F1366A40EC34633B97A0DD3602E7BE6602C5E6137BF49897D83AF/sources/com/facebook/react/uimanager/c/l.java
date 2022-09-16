package com.facebook.react.uimanager.c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: OpacityAnimation.java */
/* loaded from: classes.dex */
class l extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private final View f3862a;

    /* renamed from: b  reason: collision with root package name */
    private final float f3863b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3864c;

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }

    /* compiled from: OpacityAnimation.java */
    /* loaded from: classes.dex */
    static class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f3865a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3866b = false;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        public a(View view) {
            this.f3865a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (!this.f3865a.hasOverlappingRendering() || this.f3865a.getLayerType() != 0) {
                return;
            }
            this.f3866b = true;
            this.f3865a.setLayerType(2, null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f3866b) {
                this.f3865a.setLayerType(0, null);
            }
        }
    }

    public l(View view, float f, float f2) {
        this.f3862a = view;
        this.f3863b = f;
        this.f3864c = f2 - f;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        this.f3862a.setAlpha(this.f3863b + (this.f3864c * f));
    }
}
