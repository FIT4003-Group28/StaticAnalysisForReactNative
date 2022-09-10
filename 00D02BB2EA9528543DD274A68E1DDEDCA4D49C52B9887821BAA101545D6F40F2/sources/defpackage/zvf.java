package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: zvf  reason: default package */
/* loaded from: classes7.dex */
public final class zvf extends zsy {
    private int l;

    public zvf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.l != 0) {
            h(canvas, 0.0f, getHeight(), this.l);
        }
    }

    public void setLineColor(@dzsi Integer num) {
        this.l = num == null ? 0 : num.intValue();
        invalidate();
    }
}
