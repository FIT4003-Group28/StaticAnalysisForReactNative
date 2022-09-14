package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final EnumC0193a f9536a;

    /* renamed from: b  reason: collision with root package name */
    private final SVGLength[] f9537b;

    /* renamed from: c  reason: collision with root package name */
    private ReadableArray f9538c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9539d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9540e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f9541f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f9542g;

    /* renamed from: h  reason: collision with root package name */
    private u f9543h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0193a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(EnumC0193a enumC0193a, SVGLength[] sVGLengthArr, b bVar) {
        this.f9536a = enumC0193a;
        this.f9537b = sVGLengthArr;
        this.f9539d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private double a(SVGLength sVGLength, double d2, float f2, float f3) {
        double d3;
        if (this.f9539d && sVGLength.f9526b == SVGLength.UnitType.NUMBER) {
            d3 = d2;
            return w.a(sVGLength, d2, 0.0d, d3, f3);
        }
        d3 = f2;
        return w.a(sVGLength, d2, 0.0d, d3, f3);
    }

    private RectF a(RectF rectF) {
        float f2;
        if (!this.f9539d) {
            rectF = new RectF(this.f9542g);
        }
        float width = rectF.width();
        float height = rectF.height();
        float f3 = 0.0f;
        if (this.f9539d) {
            f3 = rectF.left;
            f2 = rectF.top;
        } else {
            f2 = 0.0f;
        }
        return new RectF(f3, f2, width + f3, height + f2);
    }

    private static void a(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f2) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            fArr[i2] = (float) readableArray.getDouble(i3);
            int i4 = readableArray.getInt(i3 + 1);
            iArr[i2] = (i4 & 16777215) | (Math.round((i4 >>> 24) * f2) << 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Matrix matrix) {
        this.f9541f = matrix;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Paint paint, RectF rectF, float f2, float f3) {
        int[] iArr;
        float[] fArr;
        RectF a2 = a(rectF);
        float width = a2.width();
        float height = a2.height();
        float f4 = a2.left;
        float f5 = a2.top;
        float textSize = paint.getTextSize();
        if (this.f9536a == EnumC0193a.PATTERN) {
            double d2 = width;
            double a3 = a(this.f9537b[0], d2, f2, textSize);
            double d3 = height;
            double a4 = a(this.f9537b[1], d3, f2, textSize);
            double a5 = a(this.f9537b[2], d2, f2, textSize);
            double a6 = a(this.f9537b[3], d3, f2, textSize);
            if (a5 <= 1.0d || a6 <= 1.0d) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap((int) a5, (int) a6, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF viewBox = this.f9543h.getViewBox();
            if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                RectF rectF2 = new RectF((float) a3, (float) a4, (float) a5, (float) a6);
                u uVar = this.f9543h;
                canvas.concat(s0.a(viewBox, rectF2, uVar.n, uVar.o));
            }
            if (this.f9540e) {
                canvas.scale(width / f2, height / f2);
            }
            this.f9543h.draw(canvas, new Paint(), f3);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f9541f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f9538c.size();
        if (size == 0) {
            c.d.d.e.a.d("ReactNative", "Gradient contains no stops");
            return;
        }
        int i = size / 2;
        int[] iArr2 = new int[i];
        float[] fArr2 = new float[i];
        a(this.f9538c, i, fArr2, iArr2, f3);
        if (fArr2.length == 1) {
            int[] iArr3 = {iArr2[0], iArr2[0]};
            float[] fArr3 = {fArr2[0], fArr2[0]};
            c.d.d.e.a.d("ReactNative", "Gradient contains only one stop");
            iArr = iArr3;
            fArr = fArr3;
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        EnumC0193a enumC0193a = this.f9536a;
        if (enumC0193a == EnumC0193a.LINEAR_GRADIENT) {
            double d4 = width;
            double a7 = a(this.f9537b[0], d4, f2, textSize);
            double d5 = f4;
            double d6 = height;
            double d7 = f5;
            Shader linearGradient = new LinearGradient((float) (a7 + d5), (float) (a(this.f9537b[1], d6, f2, textSize) + d7), (float) (a(this.f9537b[2], d4, f2, textSize) + d5), (float) (a(this.f9537b[3], d6, f2, textSize) + d7), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f9541f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f9541f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
        } else if (enumC0193a != EnumC0193a.RADIAL_GRADIENT) {
        } else {
            double d8 = width;
            double a8 = a(this.f9537b[2], d8, f2, textSize);
            double d9 = height;
            double a9 = a(this.f9537b[3], d9, f2, textSize) / a8;
            Shader radialGradient = new RadialGradient((float) (a(this.f9537b[4], d8, f2, textSize) + f4), (float) (a(this.f9537b[5], d9 / a9, f2, textSize) + (f5 / a9)), (float) a8, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) a9);
            Matrix matrix5 = this.f9541f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Rect rect) {
        this.f9542g = rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ReadableArray readableArray) {
        this.f9538c = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        this.f9540e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(u uVar) {
        this.f9543h = uVar;
    }
}
