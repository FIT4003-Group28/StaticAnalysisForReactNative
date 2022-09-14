package com.facebook.react.uimanager.c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: BaseLayoutAnimation.java */
/* loaded from: classes.dex */
abstract class c extends a {
    abstract boolean c();

    @Override // com.facebook.react.uimanager.c.a
    boolean a() {
        return this.f3841b > 0 && this.f3840a != null;
    }

    /* compiled from: BaseLayoutAnimation.java */
    /* renamed from: com.facebook.react.uimanager.c.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3847a = new int[b.values().length];

        static {
            try {
                f3847a[b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3847a[b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.facebook.react.uimanager.c.a
    Animation a(View view, int i, int i2, int i3, int i4) {
        if (this.f3840a != null) {
            int i5 = AnonymousClass1.f3847a[this.f3840a.ordinal()];
            float f = BitmapDescriptorFactory.HUE_RED;
            switch (i5) {
                case 1:
                    float alpha = c() ? view.getAlpha() : BitmapDescriptorFactory.HUE_RED;
                    if (!c()) {
                        f = view.getAlpha();
                    }
                    return new l(view, alpha, f);
                case 2:
                    float f2 = c() ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                    float f3 = c() ? BitmapDescriptorFactory.HUE_RED : 1.0f;
                    return new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
                default:
                    throw new com.facebook.react.uimanager.e("Missing animation for property : " + this.f3840a);
            }
        }
        throw new com.facebook.react.uimanager.e("Missing animated property from animation config");
    }
}
