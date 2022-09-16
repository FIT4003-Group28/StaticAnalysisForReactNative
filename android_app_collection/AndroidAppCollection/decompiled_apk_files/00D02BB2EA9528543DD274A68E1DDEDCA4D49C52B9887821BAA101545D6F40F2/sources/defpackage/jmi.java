package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@Deprecated
/* renamed from: jmi  reason: default package */
/* loaded from: classes7.dex */
public final class jmi extends ViewGroup {
    private jlj A;
    public final Paint a;
    public PopupWindow b;
    public boolean c;
    public boolean d;
    public View e;
    public View f;
    public PopupWindow.OnDismissListener g;
    public int h;
    public int i;
    private final Context j;
    private final int[] k;
    private final Path l;
    private final RectF m;
    private final int n;
    private final int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private jll v;
    private Rect w;
    private jlk x;
    private float y;
    private int z;

    public jmi(Context context) {
        super(context);
        this.k = new int[2];
        this.l = new Path();
        this.m = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        this.c = true;
        this.y = 1.0f;
        this.j = context;
        this.n = context.getResources().getDimensionPixelSize(R.dimen.tooltip_horizontal_container_padding);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.tooltip_view_margin);
        int b = ibm.w().b(context);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(b);
        paint.setAntiAlias(true);
        setStyle(jln.QUANTUM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b0, code lost:
        if (r16.A == defpackage.jlj.ANCHOR_VIEW_END) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b3, code lost:
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ca, code lost:
        if (r16.A == defpackage.jlj.ANCHOR_VIEW_END) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ce, code lost:
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0240, code lost:
        if (r16.A == defpackage.jlj.ANCHOR_VIEW_END) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0259, code lost:
        if (r16.A == defpackage.jlj.ANCHOR_VIEW_END) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmi.b():void");
    }

    private final Point c() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    private final void d(Canvas canvas) {
        canvas.drawPath(this.l, this.a);
    }

    private final boolean e() {
        return this.v == jll.START && od.s(this) == 1;
    }

    private final boolean f() {
        return this.v == jll.BELOW;
    }

    private final boolean g() {
        return this.v == jll.START && od.s(this) != 1;
    }

    private final boolean h() {
        return this.v == jll.ABOVE;
    }

    private final boolean i() {
        return f() || h();
    }

    private final boolean j() {
        return this.v == jll.START;
    }

    public final void a() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (f()) {
            canvas.translate(0.0f, this.p);
            d(canvas);
        } else if (e()) {
            canvas.translate(this.p, 0.0f);
            d(canvas);
        }
        RectF rectF = this.m;
        float f = this.r;
        canvas.drawRoundRect(rectF, f, f, this.a);
        if (h() || g()) {
            d(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.n;
        int i6 = this.s;
        int i7 = (i3 - i) - i5;
        int i8 = (i4 - i2) - i6;
        View view = this.e;
        int i9 = 0;
        int i10 = i5 + (e() ? this.p : 0);
        int i11 = i6 + (f() ? this.p : 0);
        int i12 = i7 - (g() ? this.p : 0);
        if (h()) {
            i9 = this.p;
        }
        view.layout(i10, i11, i12, i8 - i9);
        b();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.n;
        int i4 = 0;
        int i5 = ((size - (i3 + i3)) - this.t) - (j() ? this.p : 0);
        int i6 = this.s;
        int i7 = ((size2 - (i6 + i6)) - this.t) - (i() ? this.p : 0);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (c().x * this.y), i5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, 0));
        if (this.e.getMeasuredHeight() > i7) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        }
        int measuredWidth = this.e.getMeasuredWidth();
        int i8 = this.n;
        int i9 = measuredWidth + i8 + i8;
        int measuredHeight = this.e.getMeasuredHeight();
        int i10 = this.s;
        int i11 = measuredHeight + i10 + i10;
        int i12 = this.q;
        int i13 = this.r;
        int i14 = i12 + i13 + i13;
        if (j()) {
            i11 = Math.max(i11, i14);
        } else if (i()) {
            i9 = Math.max(i9, i14);
        }
        this.m.set(0.0f, 0.0f, i9, i11);
        int width = ((int) this.m.width()) + this.t + (j() ? this.p : 0);
        int height = ((int) this.m.height()) + this.t;
        if (i()) {
            i4 = this.p;
        }
        setMeasuredDimension(width, height + i4);
    }

    public void setAnchor(View view, jll jllVar, jlk jlkVar, int i, jlj jljVar) {
        this.f = view;
        int[] iArr = this.k;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        view.getLocationOnScreen(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.w = new Rect(i2, i3, measuredWidth + i2, measuredHeight + i3);
        this.v = jllVar;
        this.x = jlkVar;
        this.z = i;
        this.A = jljVar;
    }

    public void setAnchorRect(Rect rect) {
        this.w = rect;
        b();
    }

    public void setBackgroundPaintColor(int i) {
        this.a.setColor(i);
    }

    public void setDismissWhenTouchedInside(boolean z) {
        this.d = z;
    }

    public void setDismissWhenTouchedOutside(boolean z) {
        this.c = z;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.g = onDismissListener;
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(onDismissListener);
        }
    }

    public void setStyle(jln jlnVar) {
        Resources resources = getResources();
        jlk jlkVar = jlk.ANCHOR_VIEW_START;
        jln jlnVar2 = jln.QUANTUM;
        int ordinal = jlnVar.ordinal();
        if (ordinal == 0) {
            this.p = resources.getDimensionPixelSize(R.dimen.tooltip_arrow_length);
            this.q = resources.getDimensionPixelSize(R.dimen.tooltip_arrow_base_width);
            this.r = resources.getDimensionPixelSize(R.dimen.tooltip_container_corner_radius);
            this.s = resources.getDimensionPixelSize(R.dimen.tooltip_vertical_container_padding);
            this.t = resources.getDimensionPixelSize(R.dimen.tooltip_shadow_offset);
            this.u = resources.getDimensionPixelSize(R.dimen.tooltip_shadow_radius);
        } else if (ordinal == 1) {
            this.p = resources.getDimensionPixelSize(R.dimen.tooltip_arrow_length_gm2);
            this.q = resources.getDimensionPixelSize(R.dimen.tooltip_arrow_base_width_gm2);
            this.r = resources.getDimensionPixelSize(R.dimen.tooltip_container_corner_radius_gm2);
            this.s = resources.getDimensionPixelSize(R.dimen.tooltip_vertical_container_padding_gm2);
            this.t = 0;
            this.u = 0;
        }
        Paint paint = this.a;
        int i = this.u;
        float f = this.t;
        paint.setShadowLayer(i, f, f, ibl.a().b(this.j));
    }

    public void setSuggestedMaxWidthPercentage(float f) {
        this.y = f;
    }
}
