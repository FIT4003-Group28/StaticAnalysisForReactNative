package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asvf  reason: default package */
/* loaded from: classes2.dex */
public final class asvf extends ImageView {
    ColorFilter b;
    public cren c;
    public cqsn d;
    public RectF e;
    public boolean f;
    public boolean g;
    public float h;
    private final cqss l;
    private ColorFilter m;
    private cqsn n;
    private cqsn o;
    private boolean p;
    private cqtv q;
    private cqtv r;
    private final RectF s;
    private final RectF t;
    private final Matrix u;
    private final aufc v;
    private final crzp<aufb> w;
    private static final cqrp i = cqrp.d(21.0d);
    static final cqrp a = cqrp.d(24.0d);
    private static final cqrp j = cqrp.d(56.0d);
    private static final cqss k = ibl.H();

    public asvf(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(asvf.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(asvg asvgVar) {
        return cqjv.i(iug.MUTE_ICON_PROPERTIES, asvgVar, asva.a);
    }

    public final String c() {
        return this.n.a(getContext()).toString();
    }

    public final void d() {
        RectF rectF;
        int e;
        float width;
        float height;
        if (this.o == null || (rectF = this.e) == null) {
            return;
        }
        float f = this.h;
        boolean z = this.f || (this.g && rectF.width() >= ((float) this.r.e(getContext())));
        RectF rectF2 = this.e;
        if (z) {
            int right = getRight();
            int width2 = getWidth();
            int top = getTop();
            int height2 = getHeight();
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            setTranslationX(centerX - (right - (width2 / 2.0f)));
            setTranslationY(centerY - (top + (height2 / 2.0f)));
        } else {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        if (f == 0.0f) {
            setClickable(false);
            setContentDescription(null);
        } else {
            setClickable(true);
            setContentDescription(this.o.a(getContext()).toString());
        }
        if (z) {
            float f2 = this.h;
            float e2 = this.q.e(getContext()) + (f2 * (this.r.e(getContext()) - e));
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            float f3 = intrinsicWidth;
            if (e2 > f3) {
                width = (getWidth() / 2) - (intrinsicWidth / 2);
            } else {
                width = (getWidth() / 2) - (e2 / 2.0f);
            }
            float f4 = intrinsicHeight;
            if (e2 > f4) {
                height = (getHeight() / 2) - (intrinsicHeight / 2);
            } else {
                height = (getHeight() / 2) - (e2 / 2.0f);
            }
            this.s.left = 0.0f;
            this.s.top = 0.0f;
            this.s.right = getDrawable().getIntrinsicWidth();
            this.s.bottom = getDrawable().getIntrinsicHeight();
            this.t.left = width;
            this.t.top = height;
            this.t.right = e2 > f3 ? width + f3 : width + e2;
            this.t.bottom = e2 > f4 ? height + f4 : height + e2;
            this.u.setRectToRect(this.s, this.t, Matrix.ScaleToFit.CENTER);
            setImageMatrix(this.u);
            boolean z2 = this.f;
            float f5 = this.h;
            if (true == z2) {
                f5 = 1.0f;
            }
            setAlpha(f5);
            if (!this.f || f == 0.0f) {
                setColorFilter(this.b);
            } else {
                setColorFilter(this.m);
            }
            setVisibility(0);
            return;
        }
        setVisibility(4);
    }

    public final void e() {
        int b;
        this.m = new LightingColorFilter(0, k.b(getContext()));
        if (this.p) {
            b = getResources().getColor(R.color.quantum_grey300);
        } else {
            b = this.l.b(getContext());
        }
        this.b = new LightingColorFilter(0, b);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.i().d(this.w, dege.a);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.i().c(this.w);
    }

    public void setButtonSize(cjxf cjxfVar) {
        cqtv f = cqsg.f(cjxh.b(cjxfVar), Float.valueOf(0.5f));
        if (cjxh.b(cjxfVar).a(getContext()) == j.a(getContext())) {
            f = cqsg.d(f, cqrp.d(4.0d));
        }
        this.q = cqsg.i(f, i, cjxh.b(cjxfVar));
        this.r = cqsg.i(f, a, cjxh.b(cjxfVar));
        d();
    }

    public void setMuteLevelChangedListener(asvp asvpVar) {
        super.setOnClickListener(new asve(this, asvpVar, this));
    }

    public void setProperties(asvg asvgVar) {
        this.c = asvgVar.a;
        this.n = asvgVar.b;
        this.o = asvgVar.c;
        this.d = asvgVar.d;
        d();
    }

    public void setShowPowerSaveColors(boolean z) {
        if (this.p != z) {
            this.p = z;
            e();
        }
    }

    public asvf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public asvf(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.p = false;
        setButtonSize(cjxf.EXTRA_LARGE);
        this.s = new RectF();
        this.t = new RectF();
        this.u = new Matrix();
        this.w = new asvd(this);
        final aufc sB = ((aufd) btsr.a(aufd.class)).sB();
        this.v = sB;
        sB.getClass();
        this.l = iva.d(new aufe(sB) { // from class: asvc
            private final aufc a;

            {
                this.a = sB;
            }

            @Override // defpackage.aufe
            public final boolean b() {
                return this.a.b();
            }
        }, ibl.s(), ibl.i());
        e();
        setScaleType(ImageView.ScaleType.MATRIX);
        setVisibility(4);
        setClickable(false);
    }
}
