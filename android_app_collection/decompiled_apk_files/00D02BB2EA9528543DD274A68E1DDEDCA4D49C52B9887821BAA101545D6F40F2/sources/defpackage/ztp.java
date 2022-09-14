package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ztp  reason: default package */
/* loaded from: classes7.dex */
public final class ztp extends View implements View.OnTouchListener {
    @dzsi
    private zto a;
    private float b;

    public ztp(Context context) {
        super(context);
        this.b = 1.0f;
        setOnTouchListener(this);
    }

    private final void a() {
        Drawable background = getBackground();
        if (background instanceof ztl) {
            ((ztl) background).a(this.b);
            invalidateDrawable(background);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zto ztoVar = this.a;
        if (ztoVar != null) {
            Drawable background = getBackground();
            if (background instanceof ztl) {
                ztl ztlVar = (ztl) background;
                float x = motionEvent.getX();
                vuk vukVar = ztlVar.d;
                float b = ztlVar.u ? (ztlVar.b() - ztlVar.p) - x : x - ztlVar.o;
                int i = ztlVar.getBounds().left;
                float f = vukVar.a;
                float f2 = vukVar.c;
                float f3 = vukVar.b;
                ztoVar.OL((int) ((akn.a((b - i) / f, 0.0f, 1.0f) * (f2 - f3)) + f3));
            }
        }
        view.performClick();
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a();
    }

    public void setDetailLevel(float f) {
        if (f != this.b) {
            this.b = f;
            a();
        }
    }

    public void setElevationChartTouchedListener(cqnx<cqkp, Void> cqnxVar, cqjz<?> cqjzVar) {
        setElevationChartTouchedListener(new ztn(cqjzVar, cqnxVar));
    }

    public void setElevationChartTouchedListener(@dzsi zto ztoVar) {
        this.a = ztoVar;
    }

    public ztp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 1.0f;
        setOnTouchListener(this);
    }
}
