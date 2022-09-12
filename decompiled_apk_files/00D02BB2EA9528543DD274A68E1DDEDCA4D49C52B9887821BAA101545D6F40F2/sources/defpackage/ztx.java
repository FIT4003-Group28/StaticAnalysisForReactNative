package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ztx  reason: default package */
/* loaded from: classes7.dex */
public class ztx extends ztz {
    public static final cqrp u = cqrp.d(28.0d);
    public static final cqrp v = cqrp.d(18.0d);
    protected final ztf A;
    protected final ztf B;
    protected final int w;
    protected final int x;
    protected final Drawable y;
    protected final ztf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int e = u.e(context);
        Drawable a = iup.e(R.raw.transit_details_vehicle_circle).a(context);
        int e2 = v.e(context);
        this.w = e;
        this.y = a;
        this.x = e2;
        this.z = new ztu(this);
        this.A = new ztv(this);
        this.B = new ztw(this);
    }

    public static <T extends cqkp> cqnf<T> A(cqlc<T, jhk> cqlcVar) {
        return cqjv.g(ztg.ARRIVAL_STOP_ICON, cqlcVar, zth.a);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> x(cqmp<T>... cqmpVarArr) {
        return new cqmh(ztx.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> y(cqlc<T, ?> cqlcVar) {
        return cqjv.g(ztg.DIRECTIONS_ICON, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> z(cqlc<T, jhk> cqlcVar) {
        return cqjv.g(ztg.DEPARTURE_STOP_ICON, cqlcVar, zth.a);
    }

    protected void B(Canvas canvas) {
        C(canvas, D());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(Canvas canvas, float f) {
        Drawable drawable = this.z.b;
        if (drawable == null) {
            return;
        }
        float f2 = this.w;
        p(canvas, f, f2, f2, this.y);
        float f3 = this.x;
        p(canvas, f, f3, f3, drawable);
    }

    @Override // defpackage.ztz
    protected float D() {
        if (this.I) {
            return 0.0f;
        }
        return (this.w / 2) + getPaddingTop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ztz, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v(canvas);
        Drawable drawable = this.A.b;
        Drawable drawable2 = this.B.b;
        if (drawable != null) {
            float D = D();
            float f = this.w;
            p(canvas, D, f, f, drawable);
        } else if (w()) {
            B(canvas);
        }
        if (drawable2 != null) {
            float E = E();
            float f2 = this.w;
            p(canvas, E, f2, f2, drawable2);
        }
    }

    public void setArrivalStopIcon(@dzsi jhk jhkVar) {
        this.B.b(jhkVar);
    }

    public void setDepartureStopIcon(@dzsi jhk jhkVar) {
        this.A.b(jhkVar);
    }

    public void setDirectionsIcon(@dzsi jhk jhkVar) {
        this.z.b(jhkVar);
    }

    protected void v(Canvas canvas) {
    }

    protected boolean w() {
        return true;
    }

    @Override // defpackage.ztz
    protected float E() {
        if (this.B.b == null || !this.J) {
            return super.E();
        }
        return (getHeight() - (this.w / 2)) - getPaddingBottom();
    }

    public void setDirectionsIcon(@dzsi cqtd cqtdVar) {
        if (cqtdVar != null) {
            ztf ztfVar = this.z;
            ztfVar.b = cqtdVar.a(getContext());
            ztfVar.c = null;
            ztfVar.a();
        }
    }
}
