package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dmkw  reason: default package */
/* loaded from: classes6.dex */
public final class dmkw extends bqi {
    public float L;
    public final Time M;
    public int N;
    public int O;
    private final int P;
    private final int Q;
    private final int R;
    private final Paint S;
    private final Paint T;
    private final Paint U;
    private final Paint V;
    private final Paint W;
    private int aa;
    private int ab;
    private String ac;
    private final int ad;
    private final int ae;
    private final int af;

    public dmkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new Time();
        Paint paint = new Paint();
        this.S = paint;
        Paint paint2 = new Paint();
        this.T = paint2;
        Paint paint3 = new Paint();
        this.U = paint3;
        Paint paint4 = new Paint();
        this.V = paint4;
        Paint paint5 = new Paint();
        this.W = paint5;
        Resources resources = context.getResources();
        setClickable(true);
        int color = resources.getColor(R.color.experience_date_picker_light_blue);
        this.ad = color;
        this.ae = Color.argb(0, Color.red(color), Color.green(color), Color.blue(color));
        paint.setAntiAlias(true);
        paint.setColor(resources.getColor(R.color.experience_date_picker_blue));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(255);
        paint2.setAntiAlias(true);
        paint2.setColor(color);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAlpha(255);
        paint4.setAntiAlias(true);
        paint4.setColor(-1);
        paint4.setTextAlign(Paint.Align.CENTER);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setAlpha(255);
        paint5.setAntiAlias(true);
        paint5.setColor(resources.getColor(R.color.experience_date_picker_blue));
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.experience_date_picker_circle_stroke_width));
        paint5.setAlpha(255);
        this.i.setTextSize(resources.getDimensionPixelSize(R.dimen.experience_date_picker_text_size));
        this.i.setColor(-16777216);
        this.i.setFakeBoldText(false);
        this.i.setLetterSpacing(0.05f);
        this.i.setAlpha(204);
        this.i.setTextAlign(r() ? Paint.Align.RIGHT : Paint.Align.LEFT);
        this.h.setTypeface(Typeface.create("Roboto-Medium", 0));
        this.h.setTextSize(resources.getDimensionPixelSize(R.dimen.experience_date_picker_text_size));
        this.H = resources.getColor(R.color.experience_date_picker_text_color);
        this.af = -1;
        this.R = resources.getDimensionPixelOffset(R.dimen.experience_date_picker_gradient_width);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.experience_date_picker_top_padding);
        this.P = dimensionPixelOffset;
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.experience_date_picker_inter_row_padding);
        this.Q = dimensionPixelOffset2;
        this.d = dimensionPixelOffset + ((int) (this.i.descent() - this.i.ascent())) + dimensionPixelOffset2;
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.experience_date_picker_circle_radius);
        this.e = dimensionPixelOffset3;
        this.v = dimensionPixelOffset3 + dimensionPixelOffset3 + dimensionPixelOffset2;
        new SimpleDateFormat("EEEEE", Locale.getDefault());
    }

    public static final boolean r() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(android.graphics.Canvas r7, android.graphics.Rect r8, int r9) {
        /*
            r6 = this;
            int r0 = r8.left
            int r1 = r8.right
            int r0 = r0 + r1
            int r0 = r0 / 2
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r8.left
            int r3 = r8.top
            int r4 = r8.bottom
            r1.<init>(r2, r3, r0, r4)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r8.top
            int r4 = r8.right
            int r5 = r8.bottom
            r2.<init>(r0, r3, r4, r5)
            int r0 = r6.aa
            r3 = 1
            if (r9 != r0) goto L2f
            boolean r0 = r()
            if (r3 == r0) goto L29
            r1 = r2
        L29:
            android.graphics.Paint r0 = r6.T
            r7.drawRect(r1, r0)
            goto L46
        L2f:
            int r0 = r6.ab
            if (r9 != r0) goto L41
            boolean r0 = r()
            if (r3 == r0) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            android.graphics.Paint r0 = r6.T
            r7.drawRect(r1, r0)
            goto L46
        L41:
            android.graphics.Paint r0 = r6.T
            r7.drawRect(r8, r0)
        L46:
            r0 = 0
            if (r9 != r3) goto L53
            int r1 = r6.aa
            if (r1 > 0) goto L53
            int r1 = r6.ab
            if (r1 <= 0) goto L53
            r1 = 1
            goto L54
        L53:
            r1 = 0
        L54:
            int r2 = r6.B
            if (r9 != r2) goto L61
            int r2 = r6.aa
            if (r9 < r2) goto L61
            int r2 = r6.ab
            if (r9 >= r2) goto L61
            goto L62
        L61:
            r3 = 0
        L62:
            if (r1 == 0) goto L6a
            boolean r9 = r()
            if (r9 == 0) goto L72
        L6a:
            if (r3 == 0) goto L90
            boolean r9 = r()
            if (r9 == 0) goto L8a
        L72:
            android.graphics.Rect r9 = new android.graphics.Rect
            int r0 = r8.left
            int r1 = r6.R
            int r0 = r0 - r1
            int r1 = r8.top
            int r2 = r8.left
            int r8 = r8.bottom
            r9.<init>(r0, r1, r2, r8)
            int r8 = r6.ae
            int r0 = r6.ad
            r6.q(r7, r9, r8, r0)
            return
        L8a:
            boolean r9 = r()
            if (r9 == 0) goto L98
        L90:
            if (r1 == 0) goto Laf
            boolean r9 = r()
            if (r9 == 0) goto Laf
        L98:
            android.graphics.Rect r9 = new android.graphics.Rect
            int r0 = r8.right
            int r1 = r8.top
            int r2 = r8.right
            int r3 = r6.R
            int r2 = r2 + r3
            int r8 = r8.bottom
            r9.<init>(r0, r1, r2, r8)
            int r8 = r6.ad
            int r0 = r6.ae
            r6.q(r7, r9, r8, r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmkw.s(android.graphics.Canvas, android.graphics.Rect, int):void");
    }

    @Override // defpackage.bqi
    protected final bqf b() {
        return new dmkv(this, this);
    }

    @Override // defpackage.bqi
    protected final void e(Canvas canvas) {
        int i = (int) ((this.L * 3.0f) / 10.0f);
        canvas.drawText(this.ac, r() ? this.t - i : i, this.d - this.Q, this.i);
    }

    @Override // defpackage.bqi
    protected final void f(Canvas canvas) {
    }

    @Override // defpackage.bqi
    protected final void g(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.d;
        int h = h();
        for (int i6 = 1; i6 <= this.B; i6++) {
            float f2 = this.L;
            float f3 = (f2 * h) + (f2 / 2.0f);
            if (r()) {
                f3 = canvas.getWidth() - f3;
            }
            int floor = (int) Math.floor(f3 - f);
            int ceil = (int) Math.ceil(f3 + f);
            int i7 = (this.Q / 2) + i5;
            int i8 = this.e;
            this.M.set(i6, this.r, this.s);
            this.M.normalize(false);
            Rect rect = new Rect(floor, i7, ceil, i8 + i8 + i7);
            int i9 = (floor + ceil) / 2;
            int i10 = this.aa;
            if (i6 == i10 && this.ab <= i10) {
                this.h.setColor(this.af);
                canvas.drawCircle(i9, i7 + i4, this.e, this.S);
            } else if (i6 == i10) {
                this.h.setColor(this.af);
                s(canvas, rect, i6);
                canvas.drawCircle(i9, i7 + i3, this.e, this.S);
            } else {
                int i11 = this.ab;
                if (i6 == i11) {
                    this.h.setColor(this.H);
                    s(canvas, rect, i6);
                    float f4 = i9;
                    canvas.drawCircle(f4, i7 + i, this.e, this.V);
                    canvas.drawCircle(f4, i7 + i2, this.e, this.W);
                } else if (i6 > i10 && i6 < i11) {
                    this.h.setColor(this.H);
                    s(canvas, rect, i6);
                } else if (i6 < this.N || i6 > this.O) {
                    this.h.setColor(this.H);
                    this.h.setAlpha(91);
                } else {
                    this.h.setColor(this.H);
                }
            }
            canvas.drawText(String.format("%d", Integer.valueOf(i6)), i9, (i7 + this.e) - ((this.h.descent() + this.h.ascent()) / 2.0f), this.h);
            h++;
            if (h == this.A) {
                i5 += this.v;
                h = 0;
            }
        }
    }

    @Override // defpackage.bqi
    public final bqa l(float f, float f2) {
        float f3 = this.d;
        if (f2 >= f3 && f >= 0.0f && f < this.t + 0.0f) {
            int i = (int) ((f2 - f3) / this.v);
            int i2 = (int) ((f + 0.0f) / this.L);
            if (r()) {
                i2 = (this.A - i2) - 1;
            }
            int h = (i2 - h()) + 1 + (i * this.A);
            if (h >= this.N && h <= this.O) {
                return new bqa(this.s, this.r, h);
            }
        }
        return null;
    }

    @Override // defpackage.bqi, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.d + (this.v * this.F));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqi, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.L = this.t / this.A;
    }

    public final void q(Canvas canvas, Rect rect, int i, int i2) {
        this.U.setShader(new LinearGradient(rect.left, rect.top, rect.right, rect.top, i, i2, Shader.TileMode.CLAMP));
        canvas.drawRect(rect, this.U);
    }

    public void setDate(int i, int i2, int i3) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("selected_day", Integer.valueOf(i3));
        hashMap.put("year", Integer.valueOf(i));
        hashMap.put("month", Integer.valueOf(i2));
        setMonthParams(hashMap);
        setContentDescription(this.ac);
        invalidate();
    }

    public void setEndDay(int i) {
        this.ab = i;
        invalidate();
    }

    public void setMaxClickableDay(int i) {
        this.O = Math.min(this.B, i);
    }

    public void setMinClickableDay(int i) {
        this.N = Math.max(1, i);
    }

    public void setMonthTitle(String str) {
        this.ac = str;
        invalidate();
    }

    public void setStartDay(int i) {
        this.aa = i;
        invalidate();
    }
}
