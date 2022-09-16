package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
public class a extends f {
    protected RectF E;

    private static RectF a(float[] fArr) {
        if (fArr.length == 4) {
            return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
        }
        throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }

    @Override // com.facebook.react.views.art.f
    public void a(Canvas canvas, Paint paint, float f2) {
        float f3 = f2 * this.z;
        if (f3 > 0.01f) {
            b(canvas);
            RectF rectF = this.E;
            if (rectF != null) {
                float f4 = rectF.left;
                float f5 = this.B;
                canvas.clipRect(f4 * f5, rectF.top * f5, rectF.right * f5, rectF.bottom * f5);
            }
            for (int i = 0; i < a(); i++) {
                f fVar = (f) a(i);
                fVar.a(canvas, paint, f3);
                fVar.e();
            }
            a(canvas);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] a2 = g.a(readableArray);
        if (a2 != null) {
            this.E = a(a2);
            M();
        }
    }

    @Override // com.facebook.react.views.art.f, com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public boolean y() {
        return true;
    }
}
