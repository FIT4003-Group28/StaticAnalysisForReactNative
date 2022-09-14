package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: zub  reason: default package */
/* loaded from: classes7.dex */
public final class zub extends ztx {
    public static final /* synthetic */ int l = 0;
    @dzsi
    private Integer m;
    private cqtv n;
    private cqtv o;
    private int p;
    private int q;
    private int r;
    private int s;

    public zub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = null;
        this.n = cqrp.d(34.0d);
        this.o = cqrp.d(4.0d);
        this.p = 0;
        this.q = -1;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.J = true;
        this.I = false;
    }

    private final int K() {
        int i = this.q;
        return (i < this.p || i > this.s) ? u() : this.G;
    }

    private final int L() {
        if (bvoa.a(this.G)) {
            int i = this.q;
            return (i <= this.p || i >= this.s) ? this.H : kc.f(this.H, 178);
        }
        return -1;
    }

    public static <T extends cqkp> cqnf<T> q(@dzsi cqtv cqtvVar) {
        return cqjv.i(ztg.INTERMEDIATE_STOP_RADIUS, cqtvVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> r(cqtv cqtvVar) {
        return cqjv.i(ztg.STOP_ICON_OFFSET, cqtvVar, zth.a);
    }

    private final int s() {
        return this.o.e(getContext());
    }

    private final int t() {
        cqtv cqtvVar = this.n;
        dbsk.s(cqtvVar);
        return cqtvVar.NR(getContext());
    }

    private final int u() {
        return kc.f(this.G, 127);
    }

    @Override // defpackage.ztx
    protected final void B(Canvas canvas) {
        Integer num = this.m;
        if (num != null) {
            int intValue = num.intValue();
            float f = this.w;
            p(canvas, intValue, f, f, this.y);
            Drawable drawable = this.z.b;
            if (drawable == null) {
                return;
            }
            int intValue2 = num.intValue();
            float f2 = this.x;
            p(canvas, intValue2, f2, f2, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ztx, defpackage.ztz
    public final float D() {
        if (this.q == 0) {
            return t();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ztx, defpackage.ztz
    public final float E() {
        return this.q == this.r + (-1) ? t() : getHeight();
    }

    @Override // defpackage.ztz
    protected final void I(Canvas canvas) {
        int i = this.q;
        if (i == this.p) {
            h(canvas, D(), t(), u());
            h(canvas, t(), E(), this.G);
        } else if (i == this.s) {
            h(canvas, D(), t(), this.G);
            h(canvas, t(), E(), u());
        } else {
            h(canvas, D(), E(), K());
        }
    }

    public void setDestinationStopIndex(@dzsi Integer num) {
        if (num == null || num.equals(Integer.valueOf(this.s))) {
            return;
        }
        this.s = num.intValue();
        invalidate();
    }

    public void setIntermediateStopRadius(cqtv cqtvVar) {
        if (!cqtvVar.equals(this.o)) {
            this.o = cqtvVar;
            invalidate();
        }
    }

    public void setNumStops(@dzsi Integer num) {
        if (num == null || num.equals(Integer.valueOf(this.r))) {
            return;
        }
        this.r = num.intValue();
        invalidate();
    }

    public void setOriginStopIndex(@dzsi Integer num) {
        if (num == null || num.equals(Integer.valueOf(this.p))) {
            return;
        }
        this.p = num.intValue();
        invalidate();
    }

    public void setStopIconOffset(cqtv cqtvVar) {
        if (!cqtvVar.equals(this.n)) {
            this.n = cqtvVar;
            invalidate();
        }
    }

    public void setStopIndex(@dzsi Integer num) {
        if (num == null || num.equals(Integer.valueOf(this.q))) {
            return;
        }
        this.q = num.intValue();
        invalidate();
    }

    public void setVehicleIconOffsetPx(@dzsi Integer num) {
        if (!dbsd.a(num, this.m)) {
            this.m = num;
            invalidate();
        }
    }

    @Override // defpackage.ztz
    protected final void J(Canvas canvas) {
        int i = this.q;
        if (i == 0 || i == this.p) {
            m(canvas, t(), this.C, s(), K(), L());
        } else if (i == this.r - 1 || i == this.s) {
            n(canvas, t(), this.C, s(), K(), L());
        } else {
            k(canvas, t(), s(), s(), K(), L());
        }
    }
}
