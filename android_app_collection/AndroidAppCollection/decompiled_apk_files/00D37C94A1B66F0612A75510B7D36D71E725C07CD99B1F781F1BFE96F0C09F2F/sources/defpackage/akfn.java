package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akfn  reason: default package */
/* loaded from: classes.dex */
public final class akfn extends View {
    private static final Paint g;
    public final akgb a;
    public final RectF b;
    public final View c;
    public final boolean d;
    public boolean e;
    public boolean f;
    private final int[] h;
    private final Paint i;
    private final float j;

    static {
        Paint paint = new Paint(1);
        g = paint;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
    }

    public akfn(Context context, akgb akgbVar, View view, boolean z) {
        super(context);
        this.a = akgbVar;
        this.d = z;
        this.b = new RectF();
        this.h = new int[2];
        this.e = true;
        this.f = true;
        setClickable(false);
        setFocusable(false);
        setLayerType(2, null);
        this.c = view;
        a();
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setColor(zhn.j(context, R.attr.ytOverlayBackgroundMedium).orElse(0));
        this.j = zew.i(getResources().getDisplayMetrics(), 2);
        setOnTouchListener(new View.OnTouchListener() { // from class: akfm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                akfn akfnVar = akfn.this;
                if (!akfnVar.f) {
                    return false;
                }
                if (akfnVar.b.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    akfnVar.f = false;
                    akfnVar.a.a(1);
                    akfnVar.c.performClick();
                    return true;
                }
                if (akfnVar.d) {
                    akfnVar.f = false;
                    akfnVar.a.a(0);
                }
                return akfnVar.e || akfnVar.d;
            }
        });
    }

    private final void a() {
        this.c.getLocationInWindow(this.h);
        RectF rectF = this.b;
        int[] iArr = this.h;
        int i = iArr[0];
        rectF.set(i, iArr[1], i + this.c.getMeasuredWidth(), this.h[1] + this.c.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.e) {
            return;
        }
        canvas.drawPaint(this.i);
        RectF rectF = this.b;
        float f = this.j;
        canvas.drawRoundRect(rectF, f, f, g);
    }
}
