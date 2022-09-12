package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: cwep  reason: default package */
/* loaded from: classes5.dex */
public final class cwep {
    public final Paint a;
    public final RectF b;
    public int c;

    public cwep(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.b = new RectF();
    }
}
