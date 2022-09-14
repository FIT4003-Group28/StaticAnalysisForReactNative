package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.q;
/* loaded from: classes.dex */
public class b extends View {

    /* renamed from: b  reason: collision with root package name */
    private final Paint f4953b;

    /* renamed from: c  reason: collision with root package name */
    private Path f4954c;

    /* renamed from: d  reason: collision with root package name */
    private RectF f4955d;

    /* renamed from: e  reason: collision with root package name */
    private LinearGradient f4956e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f4957f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f4958g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f4959h;
    private int[] i;
    private boolean j;
    private float[] k;
    private float l;
    private int[] m;
    private float[] n;

    public b(Context context) {
        super(context);
        this.f4953b = new Paint(1);
        this.f4958g = new float[]{0.0f, 0.0f};
        this.f4959h = new float[]{0.0f, 1.0f};
        this.j = false;
        this.k = new float[]{0.5f, 0.5f};
        this.l = 45.0f;
        this.m = new int[]{0, 0};
        this.n = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private void a() {
        int[] iArr = this.i;
        if (iArr != null) {
            float[] fArr = this.f4957f;
            if (fArr != null && iArr.length != fArr.length) {
                return;
            }
            float[] fArr2 = this.f4958g;
            float[] fArr3 = this.f4959h;
            if (this.j && this.k != null) {
                float[] a2 = a(this.l);
                float[] fArr4 = this.k;
                float[] fArr5 = {fArr4[0] - (a2[0] / 2.0f), fArr4[1] - (a2[1] / 2.0f)};
                fArr3 = new float[]{fArr4[0] + (a2[0] / 2.0f), fArr4[1] + (a2[1] / 2.0f)};
                fArr2 = fArr5;
            }
            float f2 = fArr2[0];
            int[] iArr2 = this.m;
            this.f4956e = new LinearGradient(iArr2[0] * f2, fArr2[1] * iArr2[1], fArr3[0] * iArr2[0], fArr3[1] * iArr2[1], this.i, this.f4957f, Shader.TileMode.CLAMP);
            this.f4953b.setShader(this.f4956e);
            invalidate();
        }
    }

    private float[] a(float f2) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d2 = (f2 - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d2)) * sqrt, ((float) Math.sin(d2)) * sqrt};
    }

    private void b() {
        if (this.f4954c == null) {
            this.f4954c = new Path();
            this.f4955d = new RectF();
        }
        this.f4954c.reset();
        RectF rectF = this.f4955d;
        int[] iArr = this.m;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f4954c.addRoundRect(this.f4955d, this.n, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f4954c;
        if (path == null) {
            canvas.drawPaint(this.f4953b);
        } else {
            canvas.drawPath(path, this.f4953b);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.m = new int[]{i, i2};
        b();
        a();
    }

    public void setAngle(float f2) {
        this.l = f2;
        a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.k = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = q.b((float) readableArray.getDouble(i));
        }
        this.n = fArr;
        b();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.i = iArr;
        a();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.f4959h = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f4957f = fArr;
        a();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f4958g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setUseAngle(boolean z) {
        this.j = z;
        a();
    }
}
