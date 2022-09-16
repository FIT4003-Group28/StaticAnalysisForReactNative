package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: cpsc  reason: default package */
/* loaded from: classes5.dex */
public final class cpsc extends View {
    private Paint a;

    public cpsc(Context context) {
        super(context);
        a();
    }

    private final void a() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStrokeWidth(1.0f);
        this.a.setColor(Color.parseColor("#DCDCDC"));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), (getWidth() - getPaddingRight()) - 2, getPaddingTop(), this.a);
        canvas.drawLine((getWidth() - getPaddingRight()) - 2, getPaddingTop(), (getWidth() - getPaddingRight()) - 2, (getHeight() - getPaddingBottom()) - 2, this.a);
        canvas.drawLine((getWidth() - getPaddingRight()) - 2, (getHeight() - getPaddingBottom()) - 2, getPaddingLeft(), (getHeight() - getPaddingBottom()) - 2, this.a);
        canvas.drawLine(getPaddingLeft(), (getHeight() - getPaddingBottom()) - 2, getPaddingLeft(), getPaddingTop(), this.a);
    }

    public cpsc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpsc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
