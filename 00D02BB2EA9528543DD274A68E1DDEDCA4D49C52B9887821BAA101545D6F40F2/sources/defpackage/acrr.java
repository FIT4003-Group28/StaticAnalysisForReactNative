package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acrr  reason: default package */
/* loaded from: classes2.dex */
public final class acrr extends View implements cppu<cpvm, Double> {
    private static final DashPathEffect a = new DashPathEffect(new float[]{10.0f, 8.0f}, 0.0f);
    private final boolean b;
    private final boolean c;
    private cpos<cpvm> d;
    private final float e;
    private final Paint f;
    private final Paint g;
    private final String h;
    private final int i;
    private final Rect j;
    private final Paint k;

    public acrr(Activity activity) {
        super(activity);
        Paint paint = new Paint();
        this.f = paint;
        Paint paint2 = new Paint();
        this.g = paint2;
        this.j = new Rect();
        Paint paint3 = new Paint();
        this.k = paint3;
        Resources resources = activity.getResources();
        cppw cppwVar = new cppw(-1, (byte) 2);
        cppwVar.d();
        setLayoutParams(cppwVar);
        this.e = 110.0f;
        this.c = true;
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(a);
        paint.setStrokeWidth(acpe.c(resources, 0.75f));
        paint.setColor(resources.getColor(R.color.qu_daynight_grey_300));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint2.setColor(resources.getColor(R.color.qu_daynight_grey_500));
        paint2.setTextSize(Math.round(TypedValue.applyDimension(2, 11.0f, resources.getDisplayMetrics())));
        paint2.setTextAlign(Paint.Align.LEFT);
        this.h = resources.getString(R.string.BUSYNESS_PEAK);
        this.i = acpe.b(resources, 5);
        this.b = acpf.a(this);
        paint3.setColor(resources.getColor(R.color.qu_daynight_white));
    }

    private final Path c(float f, float f2) {
        Path path = new Path();
        float d = d();
        path.moveTo(f, d);
        path.lineTo(f2, d);
        return path;
    }

    private final float d() {
        return this.d.c().a.s(Double.valueOf(this.e));
    }

    @Override // defpackage.cppu
    public final void a(cpoj<cpvm, Double> cpojVar) {
        cpwl.c(cpojVar instanceof cpos, "Must be type NumericCartesianChart");
        cpos<cpvm> cposVar = (cpos) cpojVar;
        this.d = cposVar;
        cposVar.addView(this);
    }

    @Override // defpackage.cppu
    public final void b(cpoj<cpvm, Double> cpojVar) {
        cpojVar.removeView(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingLeft;
        float width;
        float f;
        if (this.d != null) {
            if (this.c) {
                canvas.drawPath(c(getPaddingLeft(), getWidth() - getPaddingRight()), this.f);
                return;
            }
            Paint paint = this.g;
            String str = this.h;
            paint.getTextBounds(str, 0, str.length(), this.j);
            if (this.b) {
                paddingLeft = getWidth() - getPaddingRight();
                float paddingLeft2 = getPaddingLeft() + this.i;
                width = paddingLeft2;
                f = this.j.width() + paddingLeft2;
            } else {
                paddingLeft = getPaddingLeft();
                width = ((getWidth() - getPaddingRight()) - this.j.width()) - this.i;
                f = width;
            }
            float d = d() - this.j.exactCenterY();
            canvas.drawRect(width, d, width + this.j.width(), d - this.j.height(), this.k);
            String str2 = this.h;
            canvas.drawText(str2, 0, str2.length(), width, d, this.g);
            canvas.drawPath(c(paddingLeft, f), this.f);
        }
    }
}
