package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
/* compiled from: PG */
/* renamed from: cjjb  reason: default package */
/* loaded from: classes4.dex */
public final class cjjb extends RoundRectShape {
    private final float a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cjjb(float r4) {
        /*
            r3 = this;
            r0 = 8
            float[] r1 = new float[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto Lc
            r1[r2] = r4
            int r2 = r2 + 1
            goto L5
        Lc:
            r0 = 0
            r3.<init>(r1, r0, r0)
            r3.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjjb.<init>(float):void");
    }

    @Override // android.graphics.drawable.shapes.RoundRectShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
    public final void getOutline(Outline outline) {
        dzvx.c(outline, "outline");
        RectF rect = rect();
        outline.setRoundRect((int) rect.left, (int) rect.top, (int) rect.right, (int) rect.bottom, this.a);
    }
}
