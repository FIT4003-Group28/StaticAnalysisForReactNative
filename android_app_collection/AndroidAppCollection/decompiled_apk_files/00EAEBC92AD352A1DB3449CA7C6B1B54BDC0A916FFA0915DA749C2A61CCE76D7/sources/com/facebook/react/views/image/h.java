package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import c.d.h.e.r;
/* loaded from: classes.dex */
public class h extends r.a {

    /* renamed from: g  reason: collision with root package name */
    public static final r.b f6163g = new h();

    @Override // c.d.h.e.r.a
    public void a(Matrix matrix, Rect rect, int i, int i2, float f2, float f3, float f4, float f5) {
        float min = Math.min(Math.min(f4, f5), 1.0f);
        matrix.setScale(min, min);
        matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
    }

    public String toString() {
        return "start_inside";
    }
}
