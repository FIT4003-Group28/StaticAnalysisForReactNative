package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: LinearGradientView.java */
/* loaded from: classes.dex */
public class b extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f1326a;

    /* renamed from: b  reason: collision with root package name */
    private Path f1327b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f1328c;

    /* renamed from: d  reason: collision with root package name */
    private LinearGradient f1329d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private float[] j;

    public b(Context context) {
        super(context);
        this.f1326a = new Paint(1);
        this.f = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.g = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        this.i = new int[]{0, 0};
        this.j = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    public void setStartPosition(am amVar) {
        this.f = new float[]{(float) amVar.getDouble(0), (float) amVar.getDouble(1)};
        a();
    }

    public void setEndPosition(am amVar) {
        this.g = new float[]{(float) amVar.getDouble(0), (float) amVar.getDouble(1)};
        a();
    }

    public void setColors(am amVar) {
        int[] iArr = new int[amVar.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = amVar.getInt(i);
        }
        this.h = iArr;
        a();
    }

    public void setLocations(am amVar) {
        float[] fArr = new float[amVar.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) amVar.getDouble(i);
        }
        this.e = fArr;
        a();
    }

    public void setBorderRadii(am amVar) {
        float[] fArr = new float[amVar.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = o.a((float) amVar.getDouble(i));
        }
        this.j = fArr;
        b();
        a();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.i = new int[]{i, i2};
        b();
        a();
    }

    private void a() {
        if (this.h != null) {
            if (this.e != null && this.h.length != this.e.length) {
                return;
            }
            this.f1329d = new LinearGradient(this.i[0] * this.f[0], this.f[1] * this.i[1], this.g[0] * this.i[0], this.g[1] * this.i[1], this.h, this.e, Shader.TileMode.CLAMP);
            this.f1326a.setShader(this.f1329d);
            invalidate();
        }
    }

    private void b() {
        if (this.f1327b == null) {
            this.f1327b = new Path();
            this.f1328c = new RectF();
        }
        this.f1327b.reset();
        this.f1328c.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.i[0], this.i[1]);
        this.f1327b.addRoundRect(this.f1328c, this.j, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1327b == null) {
            canvas.drawPaint(this.f1326a);
        } else {
            canvas.drawPath(this.f1327b, this.f1326a);
        }
    }
}
