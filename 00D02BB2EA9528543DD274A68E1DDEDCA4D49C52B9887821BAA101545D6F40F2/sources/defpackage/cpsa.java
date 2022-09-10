package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: cpsa  reason: default package */
/* loaded from: classes5.dex */
public final class cpsa<D> extends cpsb<D> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cpsb, defpackage.cprz
    public final void d(Canvas canvas, cpry<D> cpryVar, Rect rect, Rect rect2, int i, Paint paint) {
        float round = Math.round(cpryVar.e);
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                canvas.drawLine(round, rect.bottom - this.a.d, round, rect2.bottom, paint);
                return;
            } else if (i2 == 1) {
                canvas.drawLine(rect.left + this.a.d, round, rect2.left, round, paint);
                return;
            } else if (i2 == 2) {
                canvas.drawLine(round, rect.top + this.a.d, round, rect2.top, paint);
                return;
            } else {
                canvas.drawLine(rect.right - this.a.d, round, rect2.right, round, paint);
                return;
            }
        }
        throw null;
    }
}
