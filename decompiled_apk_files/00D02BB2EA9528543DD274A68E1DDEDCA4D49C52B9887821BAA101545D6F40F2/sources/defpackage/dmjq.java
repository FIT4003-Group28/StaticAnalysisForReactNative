package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: dmjq  reason: default package */
/* loaded from: classes6.dex */
public final class dmjq extends bqi {
    public final Time L;
    public int M;
    private final int N;
    private final int O;
    private final int P;
    private final SimpleDateFormat Q;
    private final Paint R;
    private final Paint S;
    private final Paint T;
    private Paint U;
    private Paint V;
    private Set<Integer> W;
    private Set<Integer> aa;
    private Set<Integer> ab;
    private final int ac;

    public dmjq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new Time();
        Paint paint = new Paint();
        this.R = paint;
        Paint paint2 = new Paint();
        this.S = paint2;
        Paint paint3 = new Paint();
        this.T = paint3;
        this.U = new Paint();
        this.V = new Paint();
        this.W = new TreeSet();
        this.aa = new TreeSet();
        this.ab = new TreeSet();
        Resources resources = context.getResources();
        setClickable(true);
        paint.setStyle(Paint.Style.STROKE);
        this.k.setAlpha(255);
        this.k.setColor(resources.getColor(R.color.selected_day_in_month));
        paint2.setAntiAlias(true);
        paint2.setColor(resources.getColor(R.color.google_blue));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(255);
        paint3.setAntiAlias(true);
        paint3.setColor(resources.getColor(R.color.day_with_events_circle));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.day_with_events_stroke_width));
        paint3.setAlpha(255);
        Paint paint4 = new Paint(paint3);
        this.U = paint4;
        paint4.setColor(resources.getColor(R.color.day_with_secondary_events_circle));
        Paint paint5 = new Paint(paint3);
        this.V = paint5;
        paint5.setColor(resources.getColor(R.color.day_with_completed_data));
        this.V.setStyle(Paint.Style.FILL);
        this.h.setTypeface(Typeface.create("Roboto-Medium", 0));
        this.h.setTextSize(resources.getDimensionPixelSize(R.dimen.date_picker_text_size));
        this.l.setTypeface(Typeface.create("Roboto-Medium", 0));
        this.l.setTextSize(resources.getDimensionPixelSize(R.dimen.date_picker_text_size));
        this.l.setColor(resources.getColor(R.color.month_day_of_week_label));
        this.I = resources.getColor(R.color.daynight_white);
        this.H = resources.getColor(R.color.day_with_events_in_month);
        this.ac = resources.getColor(R.color.daynight_black);
        this.e = resources.getDimensionPixelOffset(R.dimen.date_picker_circle_size);
        this.g = resources.getDimensionPixelOffset(R.dimen.date_picker_edge_padding);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.date_picker_inter_row_padding);
        int i = this.e;
        this.v = i + i + dimensionPixelOffset;
        this.N = resources.getDimensionPixelOffset(R.dimen.date_picker_text_bottom_margin);
        this.O = resources.getDimensionPixelOffset(R.dimen.date_picker_top_padding);
        this.P = resources.getDimensionPixelOffset(R.dimen.date_picker_bottom_padding);
        this.Q = new SimpleDateFormat("EEEEE", Locale.getDefault());
    }

    public static final boolean q() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    @Override // defpackage.bqi
    protected final bqf b() {
        return new dmjp(this, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqi
    public final int d() {
        return this.v;
    }

    @Override // defpackage.bqi
    protected final void e(Canvas canvas) {
    }

    @Override // defpackage.bqi
    protected final void f(Canvas canvas) {
        int i = this.O;
        int i2 = this.e;
        int i3 = (i + (i2 + i2)) - this.N;
        Date date = new Date();
        int i4 = 0;
        while (true) {
            int i5 = this.A;
            if (i4 < i5) {
                int i6 = (this.z + i4) % i5;
                int i7 = this.g;
                int i8 = this.M;
                int i9 = this.e;
                int i10 = i7 + ((i8 + i9 + i9) * i4) + i9;
                if (q()) {
                    i10 = canvas.getWidth() - i10;
                }
                this.D.set(7, i6);
                date.setTime(this.D.getTimeInMillis());
                canvas.drawText(this.Q.format(date).toUpperCase(Locale.getDefault()), i10, i3, this.l);
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[SYNTHETIC] */
    @Override // defpackage.bqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(android.graphics.Canvas r12) {
        /*
            r11 = this;
            int r0 = r11.O
            int r1 = r11.v
            int r0 = r0 + r1
            int r1 = r11.h()
            r2 = 1
            r3 = 1
        Lb:
            int r4 = r11.B
            if (r3 > r4) goto Lc9
            int r4 = r11.g
            int r5 = r11.M
            int r6 = r11.e
            int r6 = r6 + r6
            int r7 = r0 + r6
            int r8 = r11.s
            int r9 = r11.r
            android.text.format.Time r10 = r11.L
            r10.set(r3, r9, r8)
            android.text.format.Time r8 = r11.L
            r9 = 0
            r8.normalize(r9)
            int r5 = r5 + r6
            int r5 = r5 * r1
            int r4 = r4 + r5
            int r5 = r11.e
            int r4 = r4 + r5
            boolean r5 = q()
            if (r5 == 0) goto L3a
            int r5 = r12.getWidth()
            int r4 = r5 - r4
        L3a:
            boolean r5 = r11.w
            r6 = 0
            if (r5 == 0) goto L5e
            int r5 = r11.y
            if (r5 != r3) goto L4d
            android.graphics.Paint r6 = r11.S
            android.graphics.Paint r5 = r11.h
            int r8 = r11.I
            r5.setColor(r8)
            goto L97
        L4d:
            if (r3 <= r5) goto L5e
            android.graphics.Paint r5 = r11.h
            int r8 = r11.ac
            r5.setColor(r8)
            android.graphics.Paint r5 = r11.h
            r8 = 91
            r5.setAlpha(r8)
            goto L97
        L5e:
            android.graphics.Paint r5 = r11.h
            int r8 = r11.H
            r5.setColor(r8)
            int r5 = r11.x
            if (r5 != r3) goto L6c
            android.graphics.Paint r6 = r11.k
            goto L97
        L6c:
            java.util.Set<java.lang.Integer> r5 = r11.W
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L7b
            android.graphics.Paint r6 = r11.T
            goto L97
        L7b:
            java.util.Set<java.lang.Integer> r5 = r11.aa
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L86
            android.graphics.Paint r6 = r11.U
            goto L97
        L86:
            java.util.Set<java.lang.Integer> r5 = r11.ab
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L97
            android.graphics.Paint r6 = r11.V
            android.graphics.Paint r5 = r11.h
            int r8 = r11.I
            r5.setColor(r8)
        L97:
            if (r6 == 0) goto La3
            int r5 = r11.e
            float r8 = (float) r4
            int r10 = r0 + r5
            float r10 = (float) r10
            float r5 = (float) r5
            r12.drawCircle(r8, r10, r5, r6)
        La3:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5[r9] = r6
            java.lang.String r6 = "%d"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            float r4 = (float) r4
            int r6 = r11.N
            int r7 = r7 - r6
            float r6 = (float) r7
            android.graphics.Paint r7 = r11.h
            r12.drawText(r5, r4, r6, r7)
            int r1 = r1 + 1
            int r4 = r11.A
            if (r1 != r4) goto Lc5
            int r1 = r11.v
            int r0 = r0 + r1
            r1 = 0
        Lc5:
            int r3 = r3 + 1
            goto Lb
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmjq.g(android.graphics.Canvas):void");
    }

    @Override // defpackage.bqi
    public final bqa l(float f, float f2) {
        int i;
        int i2;
        float f3 = this.g - (this.M / 2);
        int i3 = this.v;
        float f4 = (i3 + this.e) - (i3 / 2);
        if (f2 >= f4 && f >= f3 && f < this.t - f3) {
            int i4 = (int) ((f2 - f4) / i3);
            int i5 = (int) ((f - f3) / ((i2 + i2) + i));
            if (q()) {
                i5 = (this.A - i5) - 1;
            }
            int h = (i5 - h()) + 1 + (i4 * this.A);
            if (h > 0 && h <= this.B) {
                return new bqa(this.s, this.r, h);
            }
        }
        return null;
    }

    @Override // defpackage.bqi, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.O;
        int i4 = this.v;
        setMeasuredDimension(size, i3 + (this.F * i4) + i4 + this.P);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqi, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.t;
        int i6 = this.g;
        int i7 = this.e;
        int i8 = this.A;
        this.M = ((i5 - (i6 + i6)) - ((i7 + i7) * i8)) / (i8 - 1);
    }

    public void setCompletedDaysWithData(Set<Integer> set) {
        this.ab = set;
        invalidate();
    }

    public void setDate(int i, int i2, int i3) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("selected_day", Integer.valueOf(i3));
        hashMap.put("year", Integer.valueOf(i));
        hashMap.put("month", Integer.valueOf(i2));
        setMonthParams(hashMap);
        this.L.set(1, this.r, this.s);
        setContentDescription(DateFormat.format("MMMM yyyy", this.L.toMillis(false)));
    }

    public void setHighlightedDays(Set<Integer> set) {
        this.W = set;
        invalidate();
    }

    public void setSecondaryHighlightedDays(Set<Integer> set) {
        this.aa = set;
        invalidate();
    }
}
