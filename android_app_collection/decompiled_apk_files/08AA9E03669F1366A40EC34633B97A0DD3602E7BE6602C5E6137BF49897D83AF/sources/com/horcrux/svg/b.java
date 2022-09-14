package com.horcrux.svg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Brush.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private a f4840a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.bridge.am f4841b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.react.bridge.am f4842c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4843d;
    private Matrix e;
    private Rect f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, com.facebook.react.bridge.am amVar, EnumC0090b enumC0090b) {
        this.f4840a = a.LINEAR_GRADIENT;
        this.f4840a = aVar;
        this.f4841b = amVar;
        this.f4843d = enumC0090b == EnumC0090b.OBJECT_BOUNDING_BOX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Brush.java */
    /* loaded from: classes.dex */
    public enum a {
        LINEAR_GRADIENT(0),
        RADIAL_GRADIENT(1),
        PATTERN(2);
        

        /* renamed from: d  reason: collision with root package name */
        final int f4847d;

        a(int i) {
            this.f4847d = i;
        }
    }

    /* compiled from: Brush.java */
    /* renamed from: com.horcrux.svg.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    enum EnumC0090b {
        OBJECT_BOUNDING_BOX(0),
        USER_SPACE_ON_USE(1);
        

        /* renamed from: c  reason: collision with root package name */
        final int f4851c;

        EnumC0090b(int i) {
            this.f4851c = i;
        }
    }

    private static void a(com.facebook.react.bridge.am amVar, int i, float[] fArr, int[] iArr, float f) {
        int size = amVar.size() - i;
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = (float) amVar.getDouble(size + i2);
            int i3 = i2 * 4;
            iArr[i2] = Color.argb((int) (amVar.getDouble(i3 + 3) * 255.0d * f), (int) (amVar.getDouble(i3) * 255.0d), (int) (amVar.getDouble(i3 + 1) * 255.0d), (int) (amVar.getDouble(i3 + 2) * 255.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Rect rect) {
        this.f = rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.facebook.react.bridge.am amVar) {
        this.f4842c = amVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Matrix matrix) {
        this.e = matrix;
    }

    private RectF a(RectF rectF) {
        float f;
        if (!this.f4843d) {
            rectF = new RectF(this.f);
        }
        float width = rectF.width();
        float height = rectF.height();
        boolean z = this.f4843d;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f2 = rectF.left;
            f = rectF.top;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return new RectF(f2, f, width + f2, height + f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Paint paint, RectF rectF, float f, float f2) {
        RectF a2 = a(rectF);
        float width = a2.width();
        float height = a2.height();
        float f3 = a2.left;
        float f4 = a2.top;
        int size = this.f4842c.size() / 5;
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        a(this.f4842c, size, fArr, iArr, f2);
        if (this.f4840a == a.LINEAR_GRADIENT) {
            double d2 = width;
            double d3 = f3;
            double d4 = f;
            double d5 = height;
            double d6 = f4;
            LinearGradient linearGradient = new LinearGradient((float) w.a(this.f4841b.getString(0), d2, d3, d4, paint.getTextSize()), (float) w.a(this.f4841b.getString(1), d5, d6, d4, paint.getTextSize()), (float) w.a(this.f4841b.getString(2), d2, d3, d4, paint.getTextSize()), (float) w.a(this.f4841b.getString(3), d5, d6, d4, paint.getTextSize()), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.e != null) {
                Matrix matrix = new Matrix();
                matrix.preConcat(this.e);
                linearGradient.setLocalMatrix(matrix);
            }
            paint.setShader(linearGradient);
        } else if (this.f4840a != a.RADIAL_GRADIENT) {
        } else {
            double d7 = width;
            double d8 = f;
            double a3 = w.a(this.f4841b.getString(2), d7, 0.0d, d8, paint.getTextSize());
            double d9 = height;
            double a4 = w.a(this.f4841b.getString(3), d9, 0.0d, d8, paint.getTextSize());
            double a5 = w.a(this.f4841b.getString(4), d7, f3, d8, paint.getTextSize());
            double a6 = w.a(this.f4841b.getString(5), d9, f4, d8, paint.getTextSize());
            double d10 = a4 / a3;
            RadialGradient radialGradient = new RadialGradient((float) a5, (float) (a6 / d10), (float) a3, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix2 = new Matrix();
            matrix2.preScale(1.0f, (float) d10);
            if (this.e != null) {
                matrix2.preConcat(this.e);
            }
            radialGradient.setLocalMatrix(matrix2);
            paint.setShader(radialGradient);
        }
    }
}
