package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bqi  reason: default package */
/* loaded from: classes4.dex */
public class bqi extends View {
    public int A;
    protected int B;
    protected boolean C;
    protected final Calendar D;
    protected final bqf E;
    protected int F;
    protected bqh G;
    protected int H;
    protected int I;
    protected int J;
    protected Runnable K;
    private String L;
    private String M;
    private final StringBuilder N;
    private String O;
    private final Calendar P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private final GestureDetector T;
    private int U;
    protected int a;
    protected int b;
    protected int c;
    public int d;
    public int e;
    protected bpz f;
    public int g;
    protected Paint h;
    protected Paint i;
    protected Paint j;
    protected Paint k;
    protected Paint l;
    protected Paint m;
    protected Drawable n;
    protected boolean o;
    public final Rect p;
    protected int q;
    public int r;
    public int s;
    public int t;
    protected int u;
    public int v;
    protected boolean w;
    protected int x;
    protected int y;
    protected int z;

    public bqi(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a() {
        return this.R && this.S;
    }

    protected bqf b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(float f, float f2, final bqg bqgVar) {
        if (this.p.isEmpty()) {
            return false;
        }
        if (!this.p.contains((int) f, (int) f2)) {
            this.p.setEmpty();
            p();
            return false;
        }
        final bqa l = l(f, f2);
        if (l == null) {
            return false;
        }
        if (this.o) {
            this.n.setHotspot(f, f2);
            Runnable runnable = new Runnable(this, bqgVar, l) { // from class: bqb
                private final bqi a;
                private final bqg b;
                private final bqa c;

                {
                    this.a = this;
                    this.b = bqgVar;
                    this.c = l;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bqi bqiVar = this.a;
                    this.b.a(this.c);
                    bqiVar.K = null;
                }
            };
            this.K = runnable;
            postDelayed(runnable, 75L);
            return true;
        }
        bqgVar.a(l);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.E.k(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        p();
    }

    protected void e(Canvas canvas) {
        throw null;
    }

    protected void f(Canvas canvas) {
        throw null;
    }

    protected void g(Canvas canvas) {
        throw null;
    }

    public final int h() {
        int i = this.U;
        int i2 = this.z;
        if (i < i2) {
            i += this.A;
        }
        return i - i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int i() {
        return a() ? this.g : k() + this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int j() {
        return a() ? this.g + k() : this.g;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    protected final int k() {
        if (this.C) {
            return this.u;
        }
        return 0;
    }

    public bqa l(float f, float f2) {
        throw null;
    }

    public final void m(bqa bqaVar) {
        if (o(bqaVar)) {
            return;
        }
        bqh bqhVar = this.G;
        if (bqhVar != null) {
            bqhVar.a(bqaVar);
        }
        this.E.A(bqaVar.c, 1);
    }

    public final void n(bqa bqaVar) {
        if (o(bqaVar)) {
            return;
        }
        this.E.A(bqaVar.c, 2);
    }

    protected final boolean o(bqa bqaVar) {
        Calendar b;
        Calendar a;
        bpz bpzVar = this.f;
        if (bpzVar == null || (a = bpzVar.a()) == null || bqaVar.compareTo(new bqa(a)) >= 0) {
            bpz bpzVar2 = this.f;
            return (bpzVar2 == null || (b = bpzVar2.b()) == null || bqaVar.compareTo(new bqa(b)) <= 0) ? false : true;
        }
        return true;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        if (this.K != null) {
            getHandler().removeCallbacks(this.K);
            this.K = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        e(canvas);
        f(canvas);
        g(canvas);
        if (this.C) {
            int d = (((this.v + this.a) / 2) - 1) + d();
            int i2 = ((this.v + this.a) / 2) - 1;
            int i3 = this.u;
            if (a()) {
                i = (canvas.getWidth() - this.g) - i3;
            } else {
                i = this.g;
            }
            int i4 = i3 + i;
            int b = bpy.b(this.q, bpy.a(this.z));
            int i5 = 0;
            while (true) {
                int i6 = this.F;
                if (i5 >= i6) {
                    return;
                }
                int i7 = this.r;
                if (i7 == 11) {
                    if (i5 != i6 - 1) {
                        int i8 = this.v + d;
                        canvas.drawText(String.valueOf(b), ((i4 - i) / 2) + i, ((d - i2) + (d + i2)) / 2, this.m);
                        b++;
                        i5++;
                        d = i8;
                    }
                    b = bpy.b(this.q + (i5 * 7), bpy.a(this.z));
                    int i82 = this.v + d;
                    canvas.drawText(String.valueOf(b), ((i4 - i) / 2) + i, ((d - i2) + (d + i2)) / 2, this.m);
                    b++;
                    i5++;
                    d = i82;
                } else {
                    if (i7 == 0) {
                        if (i5 != 1) {
                        }
                        b = bpy.b(this.q + (i5 * 7), bpy.a(this.z));
                    }
                    int i822 = this.v + d;
                    canvas.drawText(String.valueOf(b), ((i4 - i) / 2) + i, ((d - i2) + (d + i2)) / 2, this.m);
                    b++;
                    i5++;
                    d = i822;
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.v * this.F) + d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.t = i;
        this.E.n();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.T.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setState(this.p.isEmpty() ? StateSet.NOTHING : getDrawableState());
        }
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (!this.Q) {
            super.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    public void setDatePickerController(bpz bpzVar) {
        this.f = bpzVar;
    }

    public void setMonthParams(HashMap<String, Integer> hashMap) {
        int i;
        if (hashMap.containsKey("month") || hashMap.containsKey("year")) {
            setTag(hashMap);
            if (hashMap.containsKey("height")) {
                int intValue = hashMap.get("height").intValue();
                this.v = intValue;
                if (intValue < 10) {
                    this.v = 10;
                }
            }
            if (hashMap.containsKey("selected_day")) {
                this.x = hashMap.get("selected_day").intValue();
            }
            int i2 = 0;
            this.C = hashMap.containsKey("show_wk_num") && hashMap.get("show_wk_num").intValue() != 0;
            this.r = hashMap.get("month").intValue();
            this.s = hashMap.get("year").intValue();
            Time time = new Time(TextUtils.isEmpty(this.O) ? Time.getCurrentTimezone() : this.O);
            time.setToNow();
            this.w = false;
            this.y = -1;
            this.P.set(2, this.r);
            this.P.set(1, this.s);
            this.P.set(5, 1);
            this.U = this.P.get(7);
            if (hashMap.containsKey("week_start")) {
                this.z = hashMap.get("week_start").intValue();
            } else {
                this.z = this.P.getFirstDayOfWeek();
            }
            int i3 = this.r;
            int i4 = this.s;
            switch (i3) {
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                    i = 31;
                    break;
                case 1:
                    if (i4 % 4 != 0) {
                        i = 28;
                        break;
                    } else {
                        i = 29;
                        break;
                    }
                case 3:
                case 5:
                case 8:
                case 10:
                    i = 30;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Month");
            }
            this.B = i;
            int i5 = 0;
            while (i5 < this.B) {
                i5++;
                if (this.s == time.year && this.r == time.month && i5 == time.monthDay) {
                    this.w = true;
                    this.y = i5;
                }
            }
            int h = h() + this.B;
            int i6 = this.A;
            int i7 = h / i6;
            if (h % i6 > 0) {
                i2 = 1;
            }
            this.F = i7 + i2;
            this.E.n();
            return;
        }
        throw new InvalidParameterException("You must specify month and year for this view");
    }

    public void setOnDayClickListener(bqh bqhVar) {
        this.G = bqhVar;
    }

    public void setRtlEnabled(boolean z) {
        this.R = z;
    }

    public void setSelectedDay(int i) {
        this.x = i;
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.n);
        }
        if (drawable != null) {
            setClickable(true);
            setFocusable(true);
            this.n = drawable;
            drawable.setCallback(this);
            p();
            this.o = drawable instanceof RippleDrawable;
            return;
        }
        this.n = null;
        setClickable(false);
        setFocusable(false);
        this.o = false;
    }

    public void setTimezone(String str) {
        this.O = str;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return this.n == drawable || super.verifyDrawable(drawable);
    }

    public bqi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.p = new Rect();
        this.q = -1;
        this.v = 32;
        this.w = false;
        this.x = -1;
        this.y = -1;
        this.z = 1;
        this.A = 7;
        this.B = 7;
        this.F = 6;
        this.R = false;
        this.U = 0;
        Resources resources = context.getResources();
        this.D = Calendar.getInstance();
        this.P = Calendar.getInstance();
        this.L = resources.getString(R.string.day_of_week_label_typeface);
        this.M = resources.getString(R.string.sans_serif);
        this.H = resources.getColor(R.color.date_picker_text_normal);
        this.I = resources.getColor(R.color.date_picker_blue);
        resources.getColor(R.color.date_picker_text_disabled);
        resources.getColor(17170443);
        this.J = resources.getColor(R.color.circle_background);
        StringBuilder sb = new StringBuilder(50);
        this.N = sb;
        new Formatter(sb, Locale.getDefault());
        this.a = resources.getDimensionPixelSize(R.dimen.day_number_size);
        this.b = resources.getDimensionPixelSize(R.dimen.month_label_size);
        this.c = resources.getDimensionPixelSize(R.dimen.month_day_label_text_size);
        this.d = resources.getDimensionPixelOffset(R.dimen.month_list_item_header_height);
        this.e = resources.getDimensionPixelSize(R.dimen.day_number_select_circle_radius);
        this.u = resources.getDimensionPixelSize(R.dimen.date_picker_week_number_column_width);
        this.v = (resources.getDimensionPixelOffset(R.dimen.date_picker_view_animator_height) - d()) / 6;
        bqf b = b();
        this.E = b;
        od.c(this, b);
        od.m(this, 1);
        this.Q = true;
        this.S = getContext().getResources().getConfiguration().getLayoutDirection() == 1;
        this.T = new GestureDetector(context, new bqe(this));
        Paint paint = new Paint();
        this.i = paint;
        paint.setFakeBoldText(true);
        this.i.setAntiAlias(true);
        this.i.setTextSize(this.b);
        this.i.setTypeface(Typeface.create(this.M, 1));
        this.i.setColor(this.H);
        this.i.setTextAlign(Paint.Align.CENTER);
        this.i.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.j = paint2;
        paint2.setFakeBoldText(true);
        this.j.setAntiAlias(true);
        this.j.setColor(this.J);
        this.j.setTextAlign(Paint.Align.CENTER);
        this.j.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.k = paint3;
        paint3.setFakeBoldText(true);
        this.k.setAntiAlias(true);
        this.k.setColor(this.I);
        this.k.setTextAlign(Paint.Align.CENTER);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setAlpha(60);
        Paint paint4 = new Paint();
        this.l = paint4;
        paint4.setAntiAlias(true);
        this.l.setTextSize(this.c);
        this.l.setColor(this.H);
        this.l.setTypeface(Typeface.create(this.L, 0));
        this.l.setStyle(Paint.Style.FILL);
        this.l.setTextAlign(Paint.Align.CENTER);
        this.l.setFakeBoldText(true);
        Paint paint5 = new Paint();
        this.h = paint5;
        paint5.setAntiAlias(true);
        this.h.setTextSize(this.a);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setTextAlign(Paint.Align.CENTER);
        this.h.setFakeBoldText(false);
        Paint paint6 = new Paint();
        this.m = paint6;
        paint6.setAntiAlias(true);
        this.m.setTextSize(this.a);
        this.m.setStyle(Paint.Style.FILL);
        this.m.setTextAlign(Paint.Align.CENTER);
    }
}
