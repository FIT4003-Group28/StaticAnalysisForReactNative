package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
public class b extends f {
    protected Path E;
    private float[] F;
    private float[] G;
    private float[] H;
    private float I = 1.0f;
    private int J = 1;
    private int K = 1;

    private Path a(float[] fArr) {
        int i;
        int i2;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i3 = 0;
        while (i3 < fArr.length) {
            int i4 = i3 + 1;
            int i5 = (int) fArr[i3];
            if (i5 != 0) {
                boolean z = true;
                if (i5 == 1) {
                    path.close();
                    i3 = i4;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        int i6 = i4 + 1;
                        float f2 = fArr[i4];
                        float f3 = this.B;
                        int i7 = i6 + 1;
                        float f4 = fArr[i6] * f3;
                        int i8 = i7 + 1;
                        int i9 = i8 + 1;
                        float f5 = fArr[i8] * f3;
                        int i10 = i9 + 1;
                        i2 = i10 + 1;
                        path.cubicTo(f2 * f3, f4, fArr[i7] * f3, f5, fArr[i9] * f3, fArr[i10] * f3);
                    } else if (i5 != 4) {
                        throw new JSApplicationIllegalArgumentException("Unrecognized drawing instruction " + i5);
                    } else {
                        int i11 = i4 + 1;
                        float f6 = fArr[i4];
                        float f7 = this.B;
                        float f8 = f6 * f7;
                        int i12 = i11 + 1;
                        float f9 = fArr[i11] * f7;
                        int i13 = i12 + 1;
                        float f10 = fArr[i12] * f7;
                        int i14 = i13 + 1;
                        float degrees = (float) Math.toDegrees(fArr[i13]);
                        int i15 = i14 + 1;
                        float degrees2 = (float) Math.toDegrees(fArr[i14]);
                        i2 = i15 + 1;
                        if (fArr[i15] == 1.0f) {
                            z = false;
                        }
                        float f11 = degrees2 - degrees;
                        if (Math.abs(f11) >= 360.0f) {
                            path.addCircle(f8, f9, f10, z ? Path.Direction.CCW : Path.Direction.CW);
                        } else {
                            float b2 = b(f11, 360.0f);
                            if (z && b2 < 360.0f) {
                                b2 = (360.0f - b2) * (-1.0f);
                            }
                            path.arcTo(new RectF(f8 - f10, f9 - f10, f8 + f10, f9 + f10), degrees, b2);
                        }
                    }
                    i3 = i2;
                } else {
                    int i16 = i4 + 1;
                    float f12 = fArr[i4];
                    float f13 = this.B;
                    i = i16 + 1;
                    path.lineTo(f12 * f13, fArr[i16] * f13);
                }
            } else {
                int i17 = i4 + 1;
                float f14 = fArr[i4];
                float f15 = this.B;
                i = i17 + 1;
                path.moveTo(f14 * f15, fArr[i17] * f15);
            }
            i3 = i;
        }
        return path;
    }

    private float b(float f2, float f3) {
        float f4 = f2 % f3;
        return f4 < 0.0f ? f4 + f3 : f4;
    }

    @Override // com.facebook.react.views.art.f
    public void a(Canvas canvas, Paint paint, float f2) {
        float f3 = f2 * this.z;
        if (f3 > 0.01f) {
            b(canvas);
            if (this.E == null) {
                throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
            }
            if (a(paint, f3)) {
                canvas.drawPath(this.E, paint);
            }
            if (b(paint, f3)) {
                canvas.drawPath(this.E, paint);
            }
            a(canvas);
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(Paint paint, float f2) {
        int[] iArr;
        float[] fArr;
        float[] fArr2 = this.G;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        float[] fArr3 = this.G;
        int i2 = (int) fArr3[0];
        if (i2 == 0) {
            float f3 = fArr3.length > 4 ? fArr3[4] * f2 * 255.0f : f2 * 255.0f;
            float[] fArr4 = this.G;
            paint.setARGB((int) f3, (int) (fArr4[1] * 255.0f), (int) (fArr4[2] * 255.0f), (int) (fArr4[3] * 255.0f));
            return true;
        }
        if (i2 != 1) {
            c.d.d.e.a.d("ReactNative", "ART: Color type " + i2 + " not supported!");
        } else {
            int i3 = 5;
            if (fArr3.length < 5) {
                c.d.d.e.a.d("ReactNative", "[ARTShapeShadowNode setupFillPaint] expects 5 elements, received " + this.G.length);
                return false;
            }
            float f4 = fArr3[1];
            float f5 = this.B;
            float f6 = f4 * f5;
            float f7 = fArr3[2] * f5;
            float f8 = fArr3[3] * f5;
            float f9 = fArr3[4] * f5;
            int length = (fArr3.length - 5) / 5;
            if (length > 0) {
                int[] iArr2 = new int[length];
                float[] fArr5 = new float[length];
                while (i < length) {
                    float[] fArr6 = this.G;
                    fArr5[i] = fArr6[(length * 4) + i3 + i];
                    int i4 = (i * 4) + i3;
                    iArr2[i] = Color.argb((int) (fArr6[i4 + 3] * 255.0f), (int) (fArr6[i4 + 0] * 255.0f), (int) (fArr6[i4 + 1] * 255.0f), (int) (fArr6[i4 + 2] * 255.0f));
                    i++;
                    i3 = 5;
                }
                iArr = iArr2;
                fArr = fArr5;
            } else {
                iArr = null;
                fArr = null;
            }
            paint.setShader(new LinearGradient(f6, f7, f8, f9, iArr, fArr, Shader.TileMode.CLAMP));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(Paint paint, float f2) {
        float[] fArr;
        Paint.Cap cap;
        Paint.Join join;
        if (this.I == 0.0f || (fArr = this.F) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        int i = this.J;
        if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i != 2) {
            throw new JSApplicationIllegalArgumentException("strokeCap " + this.J + " unrecognized");
        } else {
            cap = Paint.Cap.SQUARE;
        }
        paint.setStrokeCap(cap);
        int i2 = this.K;
        if (i2 == 0) {
            join = Paint.Join.MITER;
        } else if (i2 == 1) {
            join = Paint.Join.ROUND;
        } else if (i2 != 2) {
            throw new JSApplicationIllegalArgumentException("strokeJoin " + this.K + " unrecognized");
        } else {
            join = Paint.Join.BEVEL;
        }
        paint.setStrokeJoin(join);
        paint.setStrokeWidth(this.I * this.B);
        float[] fArr2 = this.F;
        int i3 = (int) (fArr2.length > 3 ? fArr2[3] * f2 * 255.0f : f2 * 255.0f);
        float[] fArr3 = this.F;
        paint.setARGB(i3, (int) (fArr3[0] * 255.0f), (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f));
        float[] fArr4 = this.H;
        if (fArr4 != null && fArr4.length > 0) {
            paint.setPathEffect(new DashPathEffect(fArr4, 0.0f));
        }
        return true;
    }

    @com.facebook.react.uimanager.e1.a(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.G = g.a(readableArray);
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        this.E = a(g.a(readableArray));
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.F = g.a(readableArray);
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.J = i;
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.H = g.a(readableArray);
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.K = i;
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f2) {
        this.I = f2;
        M();
    }
}
