package com.swmansion.gesturehandler.react;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
/* loaded from: classes.dex */
public class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: h  reason: collision with root package name */
        static TypedValue f9908h = new TypedValue();
        static a i;

        /* renamed from: b  reason: collision with root package name */
        int f9909b;

        /* renamed from: c  reason: collision with root package name */
        Integer f9910c;

        /* renamed from: d  reason: collision with root package name */
        boolean f9911d;

        /* renamed from: e  reason: collision with root package name */
        boolean f9912e;

        /* renamed from: f  reason: collision with root package name */
        float f9913f;

        /* renamed from: g  reason: collision with root package name */
        boolean f9914g;

        public a(Context context) {
            super(context);
            this.f9909b = 0;
            this.f9911d = false;
            this.f9912e = false;
            this.f9913f = 0.0f;
            this.f9914g = false;
            setClickable(true);
            setFocusable(true);
            this.f9914g = true;
        }

        private Drawable a() {
            int i2 = Build.VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(getResources().getIdentifier((!this.f9912e || i2 < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless", "attr", "android"), f9908h, true);
            return i2 >= 21 ? getResources().getDrawable(f9908h.resourceId, getContext().getTheme()) : getResources().getDrawable(f9908h.resourceId);
        }

        private Drawable a(Drawable drawable) {
            Integer num = this.f9910c;
            if (num != null && drawable != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{num.intValue()}));
            }
            return drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (!this.f9914g) {
                return;
            }
            this.f9914g = false;
            if (this.f9909b == 0) {
                setBackground(null);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                setForeground(null);
            }
            if (this.f9911d && Build.VERSION.SDK_INT >= 23) {
                Drawable a2 = a();
                a(a2);
                setForeground(a2);
                int i2 = this.f9909b;
                if (i2 == 0) {
                    return;
                }
                setBackgroundColor(i2);
            } else if (this.f9909b == 0 && this.f9910c == null) {
                setBackground(a());
            } else {
                PaintDrawable paintDrawable = new PaintDrawable(this.f9909b);
                Drawable a3 = a();
                float f2 = this.f9913f;
                if (f2 != 0.0f) {
                    paintDrawable.setCornerRadius(f2);
                    if (Build.VERSION.SDK_INT >= 21 && (a3 instanceof RippleDrawable)) {
                        PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                        paintDrawable2.setCornerRadius(this.f9913f);
                        ((RippleDrawable) a3).setDrawableByLayerId(16908334, paintDrawable2);
                    }
                }
                a(a3);
                setBackground(new LayerDrawable(new Drawable[]{paintDrawable, a3}));
            }
        }

        public void a(float f2) {
            this.f9913f = f2 * getResources().getDisplayMetrics().density;
            this.f9914g = true;
        }

        public void a(Integer num) {
            this.f9910c = num;
            this.f9914g = true;
        }

        public void a(boolean z) {
            this.f9912e = z;
        }

        public void b(boolean z) {
            this.f9911d = z;
            this.f9914g = true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f2, float f3) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f2, float f3) {
            a aVar = i;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f2, f3);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        public void setBackgroundColor(int i2) {
            this.f9909b = i2;
            this.f9914g = true;
        }

        @Override // android.view.View
        public void setPressed(boolean z) {
            if (z && i == null) {
                i = this;
            }
            if (!z || i == this) {
                super.setPressed(z);
            }
            if (z || i != this) {
                return;
            }
            i = null;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo345createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerButton";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.b();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "borderRadius")
    public void setBorderRadius(a aVar, float f2) {
        aVar.a(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "borderless")
    public void setBorderless(a aVar, boolean z) {
        aVar.a(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z) {
        aVar.b(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "rippleColor")
    public void setRippleColor(a aVar, Integer num) {
        aVar.a(num);
    }
}
