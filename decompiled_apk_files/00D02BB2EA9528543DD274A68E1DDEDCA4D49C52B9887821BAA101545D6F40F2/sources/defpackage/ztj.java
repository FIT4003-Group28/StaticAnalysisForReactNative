package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: ztj  reason: default package */
/* loaded from: classes7.dex */
public final class ztj extends zsy {
    private int l;

    public ztj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> q(cqmp<T>... cqmpVarArr) {
        return new cqmh(ztj.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> r(@dzsi cqss cqssVar) {
        return cqjv.i(ztg.DOTTED_LINE_COLOR, cqssVar, zth.a);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float height = getHeight();
        int i = this.l;
        int g = g();
        zsy.e.setColor(i);
        float f = (this.d + 0.0f) - f();
        while (f < height - f()) {
            canvas.drawCircle(g, f, f(), zsy.e);
            f += this.d;
        }
    }

    public void setDottedLineColor(@dzsi Integer num) {
        this.l = num == null ? 0 : num.intValue();
        invalidate();
    }
}
