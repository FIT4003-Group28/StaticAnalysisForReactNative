package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.shapes.Shape;
/* compiled from: PG */
/* renamed from: awnh  reason: default package */
/* loaded from: classes3.dex */
public final class awnh extends Shape {
    @dzsi
    public akzh a = null;
    @dzsi
    public dcdc<akqs> b = null;

    @Override // android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        akzh akzhVar = this.a;
        dcdc<akqs> dcdcVar = this.b;
        if (dcdcVar == null || dcdcVar.isEmpty() || akzhVar == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Path path = new Path();
        path.addRect(0.0f, 0.0f, width, height, Path.Direction.CCW);
        int size = dcdcVar.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            akqs akqsVar = dcdcVar.get(i);
            int[] n = akyx.n(akzhVar, akqg.a(akqsVar.b));
            int[] n2 = akyx.n(akzhVar, akqg.a(akqsVar.a));
            if (n != null && n2 != null) {
                int i2 = n[1];
                path.addRect(n2[0], i2, n[0], n2[1], Path.Direction.CW);
                z = true;
            }
        }
        if (!z) {
            return;
        }
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, paint);
    }
}
