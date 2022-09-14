package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.n;
import com.facebook.react.uimanager.x;
/* compiled from: ARTVirtualNode.java */
/* loaded from: classes.dex */
public abstract class f extends x {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f3945a = new float[9];

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f3946d = new float[9];

    /* renamed from: b  reason: collision with root package name */
    protected float f3947b = 1.0f;
    private Matrix e = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    protected final float f3948c = com.facebook.react.uimanager.b.a().density;

    public abstract void a(Canvas canvas, Paint paint, float f);

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Canvas canvas) {
        canvas.save();
        if (this.e != null) {
            canvas.concat(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Canvas canvas) {
        canvas.restore();
    }

    @com.facebook.react.uimanager.a.a(a = "opacity", d = 1.0f)
    public void setOpacity(float f) {
        this.f3947b = f;
        markUpdated();
    }

    @com.facebook.react.uimanager.a.a(a = "transform")
    public void setTransform(am amVar) {
        if (amVar != null) {
            int a2 = g.a(amVar, f3945a);
            if (a2 == 6) {
                a();
            } else if (a2 != -1) {
                throw new n("Transform matrices must be of size 6");
            }
        } else {
            this.e = null;
        }
        markUpdated();
    }

    protected void a() {
        f3946d[0] = f3945a[0];
        f3946d[1] = f3945a[2];
        f3946d[2] = f3945a[4] * this.f3948c;
        f3946d[3] = f3945a[1];
        f3946d[4] = f3945a[3];
        f3946d[5] = f3945a[5] * this.f3948c;
        f3946d[6] = 0.0f;
        f3946d[7] = 0.0f;
        f3946d[8] = 1.0f;
        if (this.e == null) {
            this.e = new Matrix();
        }
        this.e.setValues(f3946d);
    }
}
