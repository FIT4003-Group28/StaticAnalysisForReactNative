package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: zsz  reason: default package */
/* loaded from: classes7.dex */
public final class zsz extends zsy {
    private int l;
    private int m;

    public zsz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static <T extends cqkp> cqnf<T> q(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(ztg.SCHEMATIC_BOTTOM_COLOR, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> r(@dzsi Integer num) {
        return cqjv.i(ztg.SCHEMATIC_TOP_COLOR, num, zth.a);
    }

    public static <T extends cqkp> cqnf<T> s(cqlc<T, ?> cqlcVar) {
        return cqjv.g(ztg.SCHEMATIC_TOP_COLOR, cqlcVar, zth.a);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        j(canvas, 0.0f, 0.0f, getHeight(), this.l, this.m);
    }

    public void setSchematicBottomColor(@dzsi Integer num) {
        this.m = num == null ? 0 : num.intValue();
        invalidate();
    }

    public void setSchematicTopColor(@dzsi Integer num) {
        this.l = num == null ? 0 : num.intValue();
        invalidate();
    }
}
