package com.facebook.react.uimanager.h1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
/* loaded from: classes.dex */
abstract class c extends com.facebook.react.uimanager.h1.a {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5943a = new int[b.values().length];

        static {
            try {
                f5943a[b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5943a[b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5943a[b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5943a[b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.react.uimanager.h1.a
    boolean a() {
        return this.f5937d > 0 && this.f5936c != null;
    }

    @Override // com.facebook.react.uimanager.h1.a
    Animation b(View view, int i, int i2, int i3, int i4) {
        b bVar = this.f5936c;
        if (bVar != null) {
            int i5 = a.f5943a[bVar.ordinal()];
            float f2 = 0.0f;
            if (i5 == 1) {
                float alpha = c() ? view.getAlpha() : 0.0f;
                if (!c()) {
                    f2 = view.getAlpha();
                }
                return new l(view, alpha, f2);
            } else if (i5 == 2) {
                float f3 = c() ? 1.0f : 0.0f;
                float f4 = c() ? 0.0f : 1.0f;
                return new ScaleAnimation(f3, f4, f3, f4, 1, 0.5f, 1, 0.5f);
            } else if (i5 == 3) {
                return new ScaleAnimation(c() ? 1.0f : 0.0f, c() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            } else if (i5 == 4) {
                return new ScaleAnimation(1.0f, 1.0f, c() ? 1.0f : 0.0f, c() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
            } else {
                throw new com.facebook.react.uimanager.g("Missing animation for property : " + this.f5936c);
            }
        }
        throw new com.facebook.react.uimanager.g("Missing animated property from animation config");
    }

    abstract boolean c();
}
