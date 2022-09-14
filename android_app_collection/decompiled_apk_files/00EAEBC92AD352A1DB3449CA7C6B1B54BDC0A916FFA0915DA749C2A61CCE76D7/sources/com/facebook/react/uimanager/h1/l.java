package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
class l extends Animation {

    /* renamed from: b  reason: collision with root package name */
    private final View f5967b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5968c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5969d;

    /* loaded from: classes.dex */
    static class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f5970a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5971b = false;

        public a(View view) {
            this.f5970a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f5971b) {
                this.f5970a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (!this.f5970a.hasOverlappingRendering() || this.f5970a.getLayerType() != 0) {
                return;
            }
            this.f5971b = true;
            this.f5970a.setLayerType(2, null);
        }
    }

    public l(View view, float f2, float f3) {
        this.f5967b = view;
        this.f5968c = f2;
        this.f5969d = f3 - f2;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f2, Transformation transformation) {
        this.f5967b.setAlpha(this.f5968c + (this.f5969d * f2));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}
