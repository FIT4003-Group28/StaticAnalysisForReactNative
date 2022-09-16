package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: jdp  reason: default package */
/* loaded from: classes7.dex */
public final class jdp extends FrameLayout {
    static final cqkv a = new jdq();
    private static final int c = Color.argb(84, 0, 0, 0);
    public jdo b;
    private jdn d;
    private boolean e;
    private final Paint f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    @dzsi
    private Path o;

    public jdp(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(jdp.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Integer num) {
        return cqjv.i(iug.BUBBLE_CALLOUT_TYPE, num, a);
    }

    public static <T extends cqkp> cqnf<T> c(Integer num) {
        return cqjv.i(iug.BUBBLE_CALLOUT_ALIGNMENT, num, a);
    }

    public static <T extends cqkp> cqnf<T> d(@dzsi cqtv cqtvVar) {
        return cqjv.i(iug.BUBBLE_CALLOUT_POSITION, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(@dzsi cqtv cqtvVar) {
        return cqjv.i(iug.BUBBLE_CALLOUT_WIDTH, cqtvVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(@dzsi cqtv cqtvVar) {
        return cqjv.i(iug.BUBBLE_CALLOUT_HEIGHT, cqtvVar, a);
    }

    private final void h() {
        this.o = null;
        invalidate();
    }

    private final void i() {
        setPadding(j(this.i), j(this.k) + k(), j(this.h), j(this.j) + l());
    }

    private final int j(float f) {
        return jmj.b(getContext(), f);
    }

    private final int k() {
        if (this.b == jdo.TOP) {
            return this.n;
        }
        return 0;
    }

    private final int l() {
        if (this.b == jdo.BOTTOM) {
            return this.n;
        }
        return 0;
    }

    public final void g(@dzsi cqtv cqtvVar) {
        if (cqtvVar != null) {
            setCornerRadiusDp(jmj.e(getContext(), cqtvVar.a(getContext())));
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
        i();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        jdk jdkVar;
        super.onDraw(canvas);
        if (this.o == null) {
            jdo jdoVar = jdo.NONE;
            int ordinal = this.b.ordinal();
            boolean z = true;
            if (ordinal == 0) {
                jdkVar = new jdk();
            } else if (ordinal == 1) {
                jdkVar = new jdm();
            } else if (ordinal == 2) {
                jdkVar = new jdl();
            } else {
                throw new RuntimeException("unknown case in switch");
            }
            jdkVar.a.set(j(4.0f), j(2.0f) + k(), getWidth() - j(4.0f), (getHeight() - j(6.0f)) - l());
            jdkVar.b = j(this.g);
            jdkVar.c = this.m;
            jdkVar.d = this.n;
            jdkVar.e = this.l + 0.5f;
            boolean z2 = this.d == jdn.END;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            if (z != z2 && !this.e) {
                jdkVar.e = getWidth() - jdkVar.e;
            }
            this.f.setShadowLayer(j(4.0f), 0.0f, j(2.0f), c);
            this.o = jdkVar.a();
        }
        canvas.drawPath(this.o, this.f);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h();
        i();
    }

    public void setAbsoluteCalloutPosition(int i) {
        this.l = i;
        this.e = true;
        h();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f.setColor(i);
        invalidate();
    }

    public void setCalloutAlignment(jdn jdnVar) {
        this.d = jdnVar;
        h();
    }

    public void setCalloutHeight(int i) {
        this.n = i;
        h();
        i();
    }

    public void setCalloutPosition(int i) {
        this.l = i;
        this.e = false;
        h();
    }

    public void setCalloutType(jdo jdoVar) {
        this.b = jdoVar;
        h();
        i();
    }

    public void setCalloutWidth(int i) {
        this.m = i;
        h();
    }

    public void setCornerRadiusDp(int i) {
        this.g = i;
        int i2 = i + 4;
        this.h = i2;
        this.i = i2;
        this.j = i + 6;
        this.k = i + 2;
    }

    public jdp(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = jdo.NONE;
        this.d = jdn.START;
        this.e = false;
        setCornerRadiusDp(2);
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ibm.aa().b(context));
        this.m = j(22.0f);
        this.n = j(16.0f);
        setWillNotDraw(false);
        setLayerType(1, null);
        i();
    }
}
