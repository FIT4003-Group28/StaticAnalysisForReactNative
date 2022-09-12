package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: jhf  reason: default package */
/* loaded from: classes7.dex */
public final class jhf extends View {
    private final Context a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private List<Integer> m;
    private final Paint n;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private Bitmap t;
    private boolean u;

    public jhf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = false;
        this.a = context;
        Paint paint = new Paint();
        this.n = paint;
        paint.setColorFilter(new LightingColorFilter(getResources().getColor(R.color.qu_daynight_oob_sky_blue), 0));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setColor(context.getResources().getColor(R.color.qu_daynight_grey_300));
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.p = paint3;
        paint3.setColor(context.getResources().getColor(R.color.qu_daynight_oob_sky_blue));
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint();
        this.q = paint4;
        paint4.setColor(context.getResources().getColor(R.color.qu_daynight_white_alpha_66));
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.r = paint5;
        paint5.setColor(-1);
        paint5.setTextAlign(Paint.Align.CENTER);
        Paint paint6 = new Paint();
        this.s = paint6;
        paint6.setColor(context.getResources().getColor(R.color.qu_daynight_grey_500));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int width = canvas.getWidth();
        int width2 = canvas.getWidth();
        int i6 = this.f;
        int i7 = width2 - (i6 + i6);
        int max = Math.max(Math.min(this.l, this.k), this.j);
        int i8 = this.j;
        int i9 = ((max - i8) * i7) / (this.k - i8);
        int i10 = this.u ? (width - this.f) - i9 : this.f + i9;
        if (this.b) {
            float f2 = i10;
            canvas.drawBitmap(this.t, f2 - (this.c * 0.5f), 0.0f, this.n);
            canvas.drawText(String.format(Locale.getDefault(), "%d", Integer.valueOf(this.l)), f2, this.d * 0.55f, this.r);
        }
        canvas.drawRoundRect(new RectF(this.f, this.d, i + i7, i2 + this.e), 3.0f, 3.0f, this.o);
        if (this.u) {
            canvas.drawRoundRect(new RectF(i10, this.d, width - this.f, i5 + this.e), 3.0f, 3.0f, this.p);
        } else {
            canvas.drawRoundRect(new RectF(this.f, this.d, i10, i3 + this.e), 3.0f, 3.0f, this.p);
        }
        for (Integer num : this.m) {
            if (this.u) {
                int i11 = this.f;
                int intValue = num.intValue();
                int i12 = this.j;
                f = (width - i11) - ((i7 * (intValue - i12)) / (this.k - i12));
            } else {
                int i13 = this.f;
                int intValue2 = num.intValue();
                int i14 = this.j;
                f = i13 + ((i7 * (intValue2 - i14)) / (this.k - i14));
            }
            float f3 = f;
            if (num.intValue() == this.j) {
                this.s.setTextAlign(this.u ? Paint.Align.RIGHT : Paint.Align.LEFT);
            } else if (num.intValue() == this.k) {
                this.s.setTextAlign(this.u ? Paint.Align.LEFT : Paint.Align.RIGHT);
            } else {
                this.s.setTextAlign(Paint.Align.CENTER);
                float f4 = this.g / 2;
                canvas.drawRect(f3 - f4, this.d, f3 + f4, i4 + this.e, this.q);
            }
            canvas.drawText(String.format(Locale.getDefault(), "%d", num), f3, this.d + this.e + this.i + this.h, this.s);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.e;
        int i4 = this.d;
        int i5 = this.i;
        setMeasuredDimension(size, i3 + i4 + i5 + i5 + this.h);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (this.u != z) {
            this.u = z;
            invalidate();
        }
    }

    public void setBottomColor(int i) {
        this.o.setColor(i);
    }

    public void setProperties(jhg jhgVar) {
        if (jhgVar == null) {
            return;
        }
        Context context = getContext();
        this.b = jhgVar.a();
        if (jhgVar.b() != null) {
            this.e = jhgVar.b().NR(context);
        }
        if (jhgVar.c() != null) {
            this.f = jhgVar.c().NR(context);
        }
        if (jhgVar.d() != null) {
            this.g = jhgVar.d().NR(context);
        }
        int i = 0;
        if (jhgVar.e() != null) {
            this.s.setTextSize(jhgVar.e().NR(context));
            Paint paint = this.s;
            Rect rect = new Rect();
            paint.getTextBounds("1", 0, 1, rect);
            this.h = rect.bottom - rect.top;
        }
        if (jhgVar.f() != null) {
            this.i = jhgVar.f().NR(context);
        }
        this.l = jhgVar.g();
        List<Integer> h = jhgVar.h();
        this.m = h;
        if (!h.isEmpty()) {
            this.j = this.m.get(0).intValue();
            List<Integer> list = this.m;
            this.k = list.get(list.size() - 1).intValue();
        } else {
            this.j = 0;
            this.k = 0;
        }
        if (this.b) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.a.getResources(), 2131231862);
            this.t = decodeResource;
            this.c = decodeResource.getWidth();
            i = this.t.getHeight();
            this.d = i;
        } else {
            this.c = 0;
            this.d = 0;
        }
        float length = (this.c * 0.8f) / Integer.toString(this.l).length();
        this.r.setTextSize((int) Math.min(i * 0.45f, length + length));
    }

    public void setTopColor(int i) {
        this.p.setColor(i);
        this.n.setColorFilter(new LightingColorFilter(i, 0));
    }
}
