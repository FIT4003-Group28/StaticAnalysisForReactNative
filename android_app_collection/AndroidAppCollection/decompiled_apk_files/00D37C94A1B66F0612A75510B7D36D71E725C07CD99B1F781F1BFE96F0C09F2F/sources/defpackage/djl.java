package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.List;
/* compiled from: PG */
/* renamed from: djl  reason: default package */
/* loaded from: classes3.dex */
final class djl extends HorizontalScrollView implements dbc {
    public final dci a;
    public int b;
    public int c;
    public swv d;
    public djb e;
    public dmm f;
    private dah g;

    public djl(Context context) {
        super(context);
        dci dciVar = new dci(context);
        this.a = dciVar;
        addView(dciVar);
    }

    @Override // defpackage.dbc
    public final void a(List list) {
        list.add(this.a);
    }

    @Override // defpackage.dba
    public final dah b() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dah dahVar = this.g;
        if (dahVar != null) {
            dahVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        djb djbVar = this.e;
        if (djbVar != null) {
            djbVar.a(this);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        super.fling(i);
        djb djbVar = this.e;
        if (djbVar != null) {
            djbVar.d();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f != null) {
            swv swvVar = this.d;
            if (swvVar != null) {
                int scrollX = getScrollX();
                int i5 = this.f.a;
                tcu tcuVar = swvVar.a;
                tfw tfwVar = swvVar.b;
                tda tdaVar = swvVar.c;
                awmt a = tfwVar.a();
                tdz tdzVar = tdaVar.u;
                tdh tdhVar = tdaVar.r;
                aopa createBuilder = awoj.a.createBuilder();
                createBuilder.copyOnWrite();
                awoj awojVar = (awoj) createBuilder.instance;
                awojVar.b |= 1;
                awojVar.c = scrollX;
                tck.g(this, tcuVar, a, tdzVar, tdhVar, (awoj) createBuilder.mo39build());
            }
            this.f.a = getScrollX();
        }
        djb djbVar = this.e;
        if (djbVar != null) {
            djbVar.b(this);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        djb djbVar = this.e;
        if (djbVar != null) {
            djbVar.c(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override // defpackage.dba
    public final void r(dah dahVar) {
        this.g = dahVar;
    }
}
