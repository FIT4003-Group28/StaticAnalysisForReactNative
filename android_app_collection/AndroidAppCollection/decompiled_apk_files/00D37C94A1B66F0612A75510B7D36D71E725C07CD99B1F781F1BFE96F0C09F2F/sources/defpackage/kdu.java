package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: kdu  reason: default package */
/* loaded from: classes3.dex */
public final class kdu extends FrameLayout implements axoo, aizf {
    public kok a;
    public ayor b;
    public final Rect c;
    public aizf d;
    private axok e;
    private boolean f;
    private View g;
    private aypg h;

    public kdu(Context context) {
        super(context);
        if (!this.f) {
            this.f = true;
            ((kia) lI()).l(this);
        }
        this.c = new Rect();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axok lH() {
        if (this.e == null) {
            this.e = new axok(this, false);
        }
        return this.e;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return this.d.c();
    }

    @Override // defpackage.aizf
    public final View kZ() {
        if (this.g == null) {
            View kZ = this.d.kZ();
            this.g = kZ;
            kZ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addView(this.g);
        }
        return this;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = this.a.t().W().X(this.b).as(new ayqb() { // from class: khz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kdu kduVar = kdu.this;
                kduVar.c.set((Rect) obj);
                kduVar.requestLayout();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aypg aypgVar = this.h;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.h);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.g;
        if (view == null) {
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int min = Math.min(view.getMeasuredWidth(), i5);
        int min2 = Math.min(this.g.getMeasuredHeight(), i6);
        int i7 = ((this.c.left + (i5 - min)) - this.c.right) / 2;
        int i8 = (i6 - min2) / 2;
        this.g.layout(i7, i8, min + i7, min2 + i8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View view = this.g;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            this.g.measure(getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec((size - this.c.left) - this.c.right, 1073741824), 0, layoutParams.width), getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0, layoutParams.height));
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
