package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ARTShapeShadowNode.java */
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: a  reason: collision with root package name */
    protected Path f3940a;

    /* renamed from: d  reason: collision with root package name */
    private float[] f3941d;
    private float[] e;
    private float[] f;
    private float g = 1.0f;
    private int h = 1;
    private int i = 1;

    private float a(float f, float f2) {
        float f3 = f % f2;
        return f3 < BitmapDescriptorFactory.HUE_RED ? f3 + f2 : f3;
    }

    @com.facebook.react.uimanager.a.a(a = com.baidu.platform.comapi.d.f1997a)
    public void setShapePath(am amVar) {
        this.f3940a = a(g.a(amVar));
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "stroke")
    public void setStroke(am amVar) {
        this.f3941d = g.a(amVar);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeDash")
    public void setStrokeDash(am amVar) {
        this.f = g.a(amVar);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "fill")
    public void setFill(am amVar) {
        this.e = g.a(amVar);
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeWidth", d = 1.0f)
    public void setStrokeWidth(float f) {
        this.g = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeCap", e = 1)
    public void setStrokeCap(int i) {
        this.h = i;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "strokeJoin", e = 1)
    public void setStrokeJoin(int i) {
        this.i = i;
        markUpdated();
    }

    @Override // com.facebook.react.views.art.f
    public void a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f3947b;
        if (f2 > 0.01f) {
            a(canvas);
            if (this.f3940a == null) {
                throw new n("Shapes should have a valid path (d) prop");
            }
            if (b(paint, f2)) {
                canvas.drawPath(this.f3940a, paint);
            }
            if (a(paint, f2)) {
                canvas.drawPath(this.f3940a, paint);
            }
            b(canvas);
        }
        markUpdateSeen();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(Paint paint, float f) {
        if (this.g == BitmapDescriptorFactory.HUE_RED || this.f3941d == null || this.f3941d.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        switch (this.h) {
            case 0:
                paint.setStrokeCap(Paint.Cap.BUTT);
                break;
            case 1:
                paint.setStrokeCap(Paint.Cap.ROUND);
                break;
            case 2:
                paint.setStrokeCap(Paint.Cap.SQUARE);
                break;
            default:
                throw new n("strokeCap " + this.h + " unrecognized");
        }
        switch (this.i) {
            case 0:
                paint.setStrokeJoin(Paint.Join.MITER);
                break;
            case 1:
                paint.setStrokeJoin(Paint.Join.ROUND);
                break;
            case 2:
                paint.setStrokeJoin(Paint.Join.BEVEL);
                break;
            default:
                throw new n("strokeJoin " + this.i + " unrecognized");
        }
        paint.setStrokeWidth(this.g * this.f3948c);
        paint.setARGB((int) (this.f3941d.length > 3 ? this.f3941d[3] * f * 255.0f : f * 255.0f), (int) (this.f3941d[0] * 255.0f), (int) (this.f3941d[1] * 255.0f), (int) (this.f3941d[2] * 255.0f));
        if (this.f != null && this.f.length > 0) {
            paint.setPathEffect(new DashPathEffect(this.f, BitmapDescriptorFactory.HUE_RED));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(Paint paint, float f) {
        float f2;
        float f3;
        int[] iArr;
        float[] fArr;
        int i = 0;
        if (this.e == null || this.e.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        int i2 = (int) this.e[0];
        float f4 = 255.0f;
        switch (i2) {
            case 0:
                if (this.e.length > 4) {
                    f2 = 255.0f;
                    f3 = this.e[4] * f * 255.0f;
                } else {
                    f2 = 255.0f;
                    f3 = f * 255.0f;
                }
                paint.setARGB((int) f3, (int) (this.e[1] * f2), (int) (this.e[2] * f2), (int) (this.e[3] * f2));
                return true;
            case 1:
                int i3 = 5;
                if (this.e.length < 5) {
                    com.facebook.common.e.a.c("ReactNative", "[ARTShapeShadowNode setupFillPaint] expects 5 elements, received " + this.e.length);
                    return false;
                }
                float f5 = this.e[1] * this.f3948c;
                float f6 = this.e[2] * this.f3948c;
                float f7 = this.e[3] * this.f3948c;
                float f8 = this.e[4] * this.f3948c;
                int length = (this.e.length - 5) / 5;
                if (length > 0) {
                    int[] iArr2 = new int[length];
                    float[] fArr2 = new float[length];
                    while (i < length) {
                        fArr2[i] = this.e[(length * 4) + i3 + i];
                        int i4 = (i * 4) + i3;
                        iArr2[i] = Color.argb((int) (this.e[i4 + 3] * 255.0f), (int) (this.e[i4 + 0] * f4), (int) (this.e[i4 + 1] * f4), (int) (this.e[i4 + 2] * f4));
                        i++;
                        i3 = 5;
                        f4 = 255.0f;
                    }
                    iArr = iArr2;
                    fArr = fArr2;
                } else {
                    iArr = null;
                    fArr = null;
                }
                paint.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
                return true;
            default:
                com.facebook.common.e.a.c("ReactNative", "ART: Color type " + i2 + " not supported!");
                return true;
        }
    }

    private Path a(float[] fArr) {
        int i;
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i2 = 0;
        while (i2 < fArr.length) {
            int i3 = i2 + 1;
            int i4 = (int) fArr[i2];
            switch (i4) {
                case 0:
                    int i5 = i3 + 1;
                    i = i5 + 1;
                    path.moveTo(fArr[i3] * this.f3948c, fArr[i5] * this.f3948c);
                    break;
                case 1:
                    path.close();
                    i2 = i3;
                    continue;
                case 2:
                    int i6 = i3 + 1;
                    i = i6 + 1;
                    path.lineTo(fArr[i3] * this.f3948c, fArr[i6] * this.f3948c);
                    break;
                case 3:
                    int i7 = i3 + 1;
                    float f = fArr[i3] * this.f3948c;
                    int i8 = i7 + 1;
                    float f2 = this.f3948c * fArr[i7];
                    int i9 = i8 + 1;
                    float f3 = this.f3948c * fArr[i8];
                    int i10 = i9 + 1;
                    float f4 = this.f3948c * fArr[i9];
                    int i11 = i10 + 1;
                    path.cubicTo(f, f2, f3, f4, this.f3948c * fArr[i10], fArr[i11] * this.f3948c);
                    i2 = i11 + 1;
                    continue;
                case 4:
                    int i12 = i3 + 1;
                    float f5 = fArr[i3] * this.f3948c;
                    int i13 = i12 + 1;
                    float f6 = fArr[i12] * this.f3948c;
                    int i14 = i13 + 1;
                    float f7 = fArr[i13] * this.f3948c;
                    int i15 = i14 + 1;
                    float degrees = (float) Math.toDegrees(fArr[i14]);
                    int i16 = i15 + 1;
                    float degrees2 = (float) Math.toDegrees(fArr[i15]);
                    int i17 = i16 + 1;
                    boolean z = fArr[i16] != 1.0f;
                    float f8 = degrees2 - degrees;
                    if (Math.abs(f8) >= 360.0f) {
                        path.addCircle(f5, f6, f7, z ? Path.Direction.CCW : Path.Direction.CW);
                    } else {
                        float a2 = a(f8, 360.0f);
                        if (z && a2 < 360.0f) {
                            a2 = (360.0f - a2) * (-1.0f);
                        }
                        path.arcTo(new RectF(f5 - f7, f6 - f7, f5 + f7, f6 + f7), degrees, a2);
                    }
                    i2 = i17;
                    continue;
                    break;
                default:
                    throw new n("Unrecognized drawing instruction " + i4);
            }
            i2 = i;
        }
        return path;
    }
}
