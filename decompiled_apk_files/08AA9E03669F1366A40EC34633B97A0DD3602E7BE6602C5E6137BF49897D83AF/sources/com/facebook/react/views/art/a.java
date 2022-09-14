package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.n;
/* compiled from: ARTGroupShadowNode.java */
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    protected RectF f3939a;

    @Override // com.facebook.react.views.art.f, com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return true;
    }

    @com.facebook.react.uimanager.a.a(a = "clipping")
    public void setClipping(am amVar) {
        float[] a2 = g.a(amVar);
        if (a2 != null) {
            this.f3939a = a(a2);
            markUpdated();
        }
    }

    @Override // com.facebook.react.views.art.f
    public void a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f3947b;
        if (f2 > 0.01f) {
            a(canvas);
            if (this.f3939a != null) {
                canvas.clipRect(this.f3939a.left * this.f3948c, this.f3939a.top * this.f3948c, this.f3939a.right * this.f3948c, this.f3939a.bottom * this.f3948c, Region.Op.REPLACE);
            }
            for (int i = 0; i < getChildCount(); i++) {
                f fVar = (f) getChildAt(i);
                fVar.a(canvas, paint, f2);
                fVar.markUpdateSeen();
            }
            b(canvas);
        }
    }

    private static RectF a(float[] fArr) {
        if (fArr.length != 4) {
            throw new n("Clipping should be array of length 4 (e.g. [x, y, width, height])");
        }
        return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
    }
}
