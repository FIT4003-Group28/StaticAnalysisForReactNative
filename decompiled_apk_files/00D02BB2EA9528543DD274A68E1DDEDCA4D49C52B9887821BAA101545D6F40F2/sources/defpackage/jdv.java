package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jdv  reason: default package */
/* loaded from: classes7.dex */
public final class jdv extends FrameLayout {
    @dzsi
    public jdu a;
    private final Rect b;
    private final Paint c;
    private final Paint d;
    private ValueAnimator e;
    private float f;

    public jdv(Context context) {
        this(context, null);
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        this.e.removeAllListeners();
        this.e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        bvrj.UI_THREAD.c();
        a();
        this.e.addListener(new jds(this));
        this.e.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.b);
        float f = getResources().getDisplayMetrics().density;
        Rect rect = this.b;
        rect.bottom = (int) (rect.top + (f * 3.0f));
        canvas.drawRect(this.b, this.d);
        if (cjxu.d(this)) {
            Rect rect2 = this.b;
            rect2.left = (int) (rect2.right - (this.b.width() * this.f));
        } else {
            Rect rect3 = this.b;
            rect3.right = (int) (rect3.left + (this.b.width() * this.f));
        }
        canvas.drawRect(this.b, this.c);
    }

    public void setDuration(long j) {
        dbsk.f(j > 0, "duration must be greater than 0", j);
        this.e.setDuration(j);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new jdt(this, onClickListener));
    }

    public void setOnTimeoutListener(@dzsi jdu jduVar) {
        this.a = jduVar;
    }

    public void setProgress(float f) {
        this.f = f;
        invalidate();
    }

    public void setTimeoutBackgroundColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public jdv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jdv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint();
        paint.setColor(getResources().getColor(R.color.quantum_googblue));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", 0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        setMinimumHeight(jmj.a(getContext(), 3));
        setDuration(5000L);
    }
}
