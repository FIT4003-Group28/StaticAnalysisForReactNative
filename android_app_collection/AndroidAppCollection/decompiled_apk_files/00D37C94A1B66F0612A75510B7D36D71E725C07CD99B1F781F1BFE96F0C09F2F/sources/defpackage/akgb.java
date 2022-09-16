package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akgb  reason: default package */
/* loaded from: classes.dex */
public final class akgb extends ViewGroup {
    private int A;
    private int B;
    private final int C;
    public final Context a;
    public akfn b;
    public PopupWindow c;
    public akfz d;
    public boolean e;
    public boolean f;
    public View g;
    public View h;
    boolean i;
    public int j;
    public float k;
    public int l;
    public int m;
    private final Path n;
    private final RectF o;
    private final Paint p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final Rect w;
    private final int[] x;
    private final Point y;
    private int z;

    public akgb(Context context, int i) {
        super(context);
        this.w = new Rect();
        this.x = new int[2];
        this.y = new Point();
        this.A = 0;
        this.k = 1.0f;
        this.l = 0;
        this.m = 0;
        this.a = context;
        setWillNotDraw(false);
        this.n = new Path();
        this.o = new RectF();
        Paint paint = new Paint(1);
        this.p = paint;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, akfj.a, 0, i);
        this.q = obtainStyledAttributes.getDimensionPixelSize(5, zew.i(displayMetrics, 16));
        this.v = obtainStyledAttributes.getDimensionPixelSize(5, zew.i(displayMetrics, 8));
        this.r = obtainStyledAttributes.getDimensionPixelSize(4, zew.i(displayMetrics, 8));
        this.s = obtainStyledAttributes.getDimensionPixelSize(1, zew.i(displayMetrics, 10));
        this.t = obtainStyledAttributes.getDimensionPixelSize(0, zew.i(displayMetrics, 24));
        this.u = obtainStyledAttributes.getDimensionPixelSize(3, zew.i(displayMetrics, 2));
        int color = obtainStyledAttributes.getColor(2, zhn.d(context, R.attr.ytThemedBlue));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.C = dimensionPixelSize;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int color2 = obtainStyledAttributes.getColor(6, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize2 > 0) {
            paint.setStyle(Paint.Style.FILL);
            float f = dimensionPixelSize;
            paint.setShadowLayer(dimensionPixelSize2, f, f, color2);
        }
        d(color);
        this.e = true;
        this.f = false;
    }

    private static int f(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final void g(Canvas canvas) {
        canvas.save();
        if (j(this.A)) {
            canvas.translate(this.r - this.l, 0.0f);
        } else {
            int i = this.A;
            if (i == 3 || i == 4) {
                canvas.translate(0.0f, this.r - this.m);
            }
        }
        canvas.drawPath(this.n, this.p);
        canvas.restore();
    }

    private final void h(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private final boolean i() {
        TextView textView = (TextView) this.g.findViewById(R.id.action_button);
        TextView textView2 = (TextView) this.g.findViewById(R.id.dismiss_button);
        if (textView == null || textView.getVisibility() != 0) {
            return textView2 != null && textView2.getVisibility() == 0;
        }
        return true;
    }

    private static boolean j(int i) {
        return i == 1 || i == 2;
    }

    public final void a(int i) {
        if (this.c != null) {
            akfn akfnVar = this.b;
            if (akfnVar != null && (akfnVar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
                this.b = null;
            }
            this.c.setOnDismissListener(null);
            this.c.dismiss();
            akfz akfzVar = this.d;
            if (akfzVar == null) {
                return;
            }
            akfzVar.a(i);
        }
    }

    public final void b(View view, Rect rect, int i, int i2, int i3) {
        this.h = view;
        c(rect);
        this.z = i;
        this.A = 0;
        this.B = i2;
        this.j = i3;
        this.i = true;
    }

    public final void c(Rect rect) {
        this.w.set(rect);
    }

    public final void d(int i) {
        this.p.setColor(i);
        setLayerType(1, this.p);
    }

    public final void e() {
        int i;
        int i2;
        int i3;
        int i4;
        int width;
        h(this.y);
        int i5 = this.y.x;
        int i6 = this.y.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i7 = this.A;
        int i8 = 0;
        if (i7 == 1) {
            i = -measuredHeight;
        } else if (i7 == 2) {
            i = this.w.height();
        } else if (i7 == 3) {
            i8 = -measuredWidth;
            i = (this.w.height() - measuredHeight) / 2;
        } else if (i7 == 4) {
            i8 = this.w.width();
            i = (this.w.height() - measuredHeight) / 2;
        } else {
            i = 0;
        }
        int e = lj.e(this);
        if (j(this.A)) {
            i2 = this.w.top + i;
            int i9 = this.B;
            if (i9 != 1) {
                if (i9 == 2) {
                    i3 = this.w.left + ((this.w.width() - measuredWidth) / 2);
                } else if (i9 != 3) {
                    throw new IllegalStateException();
                } else {
                    if (e == 1) {
                        i3 = this.w.left;
                    } else {
                        i4 = this.w.left;
                        width = this.w.width();
                        i3 = (i4 + width) - measuredWidth;
                    }
                }
            } else if (e == 1) {
                i4 = this.w.left;
                width = this.w.width();
                i3 = (i4 + width) - measuredWidth;
            } else {
                i3 = this.w.left;
            }
        } else {
            int i10 = this.w.left + i8;
            i2 = this.w.top + i;
            i3 = i10;
        }
        int i11 = this.r;
        this.l = f(i3, i11, (i5 - i11) - measuredWidth);
        int i12 = this.r;
        this.m = f(i2, i12, (i6 - i12) - measuredHeight);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.A;
        if (i == 2 || i == 4) {
            g(canvas);
        }
        RectF rectF = this.o;
        float f = this.u;
        canvas.drawRoundRect(rectF, f, f, this.p);
        int i2 = this.A;
        if (i2 == 1 || i2 == 3) {
            g(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = ((i3 - i) - this.q) - (this.A == 3 ? this.s : 0);
        if (i()) {
            i5 = (i4 - i2) - this.v;
            if (this.A == 1) {
                i6 = this.s;
            }
            i6 = 0;
        } else {
            i5 = (i4 - i2) - this.q;
            if (this.A == 1) {
                i6 = this.s;
            }
            i6 = 0;
        }
        int i10 = i5 - i6;
        View view = this.g;
        int i11 = this.q;
        int i12 = this.A;
        int i13 = (i12 == 4 ? this.s : 0) + i11;
        if (i12 == 2) {
            i8 = this.s;
        }
        view.layout(i13, i11 + i8, i9, i10);
        akfn akfnVar = this.b;
        if (akfnVar != null) {
            akfnVar.postInvalidate();
        }
        e();
        this.c.update(this.l, this.m, getMeasuredWidth(), getMeasuredHeight(), true);
        int i14 = this.B;
        if (i14 == 1) {
            int i15 = this.t;
            int i16 = this.r;
            i7 = (i15 / 2) + i16 + i16;
        } else if (i14 == 2) {
            i7 = this.w.width() / 2;
        } else if (i14 == 3) {
            int width = this.w.width();
            int i17 = this.t;
            int i18 = this.r;
            i7 = (width - (i17 / 2)) - (i18 + i18);
        } else {
            throw new IllegalStateException();
        }
        if (lj.e(this) == 1) {
            i7 = this.w.width() - i7;
        }
        int i19 = i7 + this.w.left;
        this.n.reset();
        int i20 = this.A;
        if (i20 == 1) {
            this.n.moveTo((i19 - this.r) - (this.t / 2), this.o.bottom);
            this.n.rLineTo(this.t, 0.0f);
            this.n.rLineTo((-this.t) / 2, this.s);
            this.n.rLineTo((-this.t) / 2, -this.s);
            this.n.close();
        } else if (i20 == 2) {
            this.n.moveTo((i19 - this.r) + (this.t / 2), this.o.top);
            this.n.rLineTo(-this.t, 0.0f);
            this.n.rLineTo(this.t / 2, -this.s);
            this.n.rLineTo(this.t / 2, this.s);
            this.n.close();
        } else if (i20 == 3) {
            this.n.moveTo(this.o.right, (this.w.centerY() - this.t) + (this.r / 2));
            this.n.rLineTo(this.s, this.t / 2);
            this.n.rLineTo(-this.s, this.t / 2);
            this.n.rLineTo(0.0f, -this.t);
            this.n.close();
        } else if (i20 != 4) {
        } else {
            this.n.moveTo(this.o.left, (this.w.centerY() - this.t) + (this.r / 2));
            this.n.rLineTo(0.0f, this.t);
            this.n.rLineTo(-this.s, (-this.t) / 2);
            this.n.rLineTo(this.s, (-this.t) / 2);
            this.n.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgb.onMeasure(int, int):void");
    }
}
