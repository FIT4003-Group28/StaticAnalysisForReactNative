package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.b0;
/* loaded from: classes.dex */
public abstract class f extends b0 {
    private static final float[] C = new float[9];
    private static final float[] D = new float[9];
    protected float z = 1.0f;
    private Matrix A = new Matrix();
    protected final float B = com.facebook.react.uimanager.c.b().density;

    protected void R() {
        float[] fArr = D;
        float[] fArr2 = C;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[2];
        float f2 = fArr2[4];
        float f3 = this.B;
        fArr[2] = f2 * f3;
        fArr[3] = fArr2[1];
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[5] * f3;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        if (this.A == null) {
            this.A = new Matrix();
        }
        this.A.setValues(D);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Canvas canvas) {
        canvas.restore();
    }

    public abstract void a(Canvas canvas, Paint paint, float f2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(Canvas canvas) {
        canvas.save();
        Matrix matrix = this.A;
        if (matrix != null) {
            canvas.concat(matrix);
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f2) {
        this.z = f2;
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = g.a(readableArray, C);
            if (a2 == 6) {
                R();
            } else if (a2 != -1) {
                throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
            }
        } else {
            this.A = null;
        }
        M();
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public boolean y() {
        return true;
    }
}
