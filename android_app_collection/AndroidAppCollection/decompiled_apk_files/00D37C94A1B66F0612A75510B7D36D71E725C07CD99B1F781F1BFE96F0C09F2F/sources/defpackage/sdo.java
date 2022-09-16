package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: sdo  reason: default package */
/* loaded from: classes4.dex */
public final class sdo extends sds {
    @Override // defpackage.sds, defpackage.sdn
    protected final void h(Canvas canvas, sdm sdmVar, Rect rect, Rect rect2, int i, Paint paint) {
        float round = Math.round(sdmVar.e);
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                canvas.drawLine(round, rect.bottom - this.a.c, round, rect2.bottom, paint);
                return;
            } else if (i2 == 1) {
                canvas.drawLine(rect.left + this.a.c, round, rect2.left, round, paint);
                return;
            } else if (i2 == 2) {
                canvas.drawLine(round, rect.top + this.a.c, round, rect2.top, paint);
                return;
            } else {
                canvas.drawLine(rect.right - this.a.c, round, rect2.right, round, paint);
                return;
            }
        }
        throw null;
    }
}
