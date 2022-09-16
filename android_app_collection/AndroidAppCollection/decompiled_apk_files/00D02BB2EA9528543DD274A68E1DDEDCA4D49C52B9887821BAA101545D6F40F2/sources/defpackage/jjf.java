package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.sidepanel.CollapsibleSidePanelView$SavedState;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: jjf  reason: default package */
/* loaded from: classes.dex */
public final class jjf extends FrameLayout implements glg {
    private static final cqtv e = cqrp.d(48.0d);
    public int a;
    public int b;
    @dzsi
    public jjd c;
    public boolean d;
    private final List<glf> f;
    private int g;
    private int h;

    public jjf(Context context) {
        super(context);
        this.f = new ArrayList();
        this.a = Integer.MAX_VALUE;
        this.b = 0;
        this.g = -1;
        this.h = -1;
        this.d = false;
    }

    private final void n(int i, TimeInterpolator timeInterpolator) {
        jjd jjdVar = this.c;
        if (jjdVar == null || jjdVar.a != i) {
            if (this.a != i) {
                new jjd(this, i, timeInterpolator).start();
            } else if (jjdVar == null) {
            } else {
                jjdVar.cancel();
                this.c = null;
            }
        }
    }

    @Override // defpackage.glg
    public final int a() {
        if (this.d || this.a != Integer.MAX_VALUE) {
            return this.a;
        }
        return 0;
    }

    @Override // defpackage.glg
    public final void b(glf glfVar) {
        this.f.add(glfVar);
    }

    @Override // defpackage.glg
    public final void c(glf glfVar) {
        this.f.remove(glfVar);
    }

    @Override // defpackage.glg
    public final View d() {
        return this;
    }

    @Override // defpackage.glg
    public final boolean e() {
        return true;
    }

    public final boolean f() {
        jjd jjdVar = this.c;
        return jjdVar != null ? jjdVar.a == this.b : this.a == this.b;
    }

    public final void g() {
        n(this.b, irf.b);
    }

    public final void h() {
        n(k(), irf.c);
    }

    @dzsi
    public final View i() {
        int i = this.g;
        if (i == -1) {
            return getChildAt(0);
        }
        return findViewById(i);
    }

    @dzsi
    public final View j() {
        int i = this.h;
        if (i == -1) {
            return null;
        }
        return findViewById(i);
    }

    public final int k() {
        View i = i();
        if (!this.d || i == null) {
            return Integer.MAX_VALUE;
        }
        return Math.max(Math.min(getWidth(), i.getWidth()), this.b);
    }

    public final void l(int i, int i2) {
        int min = Math.min(this.a, i2);
        this.a = min;
        this.a = Math.max(min, i);
    }

    public final void m() {
        for (glf glfVar : this.f) {
            glfVar.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        boolean z2 = !this.d;
        this.d = true;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        View i6 = i();
        if (i6 == null) {
            return;
        }
        l(this.b, i6.getMeasuredWidth());
        m();
        if (bvox.a(this)) {
            measuredWidth = i3 - this.a;
            i5 = i6.getMeasuredWidth() + measuredWidth;
        } else {
            i5 = this.a;
            measuredWidth = i5 - i6.getMeasuredWidth();
        }
        i6.layout(measuredWidth, 0, i5, i6.getMeasuredHeight());
        View j = j();
        if (j == null) {
            return;
        }
        int NR = (((e.NR(getContext()) / 2) + hps.a.e(getContext())) + ird.b().NR(getContext())) - (j.getMeasuredHeight() / 2);
        int e2 = cqrp.d(5.0d).e(getContext());
        if (!z2 && this.c != null) {
            measuredWidth = j.getLeft() - i;
            i5 = measuredWidth + j.getMeasuredWidth();
            NR -= i2;
        } else if (f()) {
            if (bvox.a(this)) {
                measuredWidth2 = j.getMeasuredWidth();
                i5 = measuredWidth + measuredWidth2;
            } else {
                measuredWidth3 = j.getMeasuredWidth();
                measuredWidth = i5 - measuredWidth3;
            }
        } else if (bvox.a(this)) {
            i5 = measuredWidth + e2;
            measuredWidth3 = j.getMeasuredWidth();
            measuredWidth = i5 - measuredWidth3;
        } else {
            measuredWidth = i5 - e2;
            measuredWidth2 = j.getMeasuredWidth();
            i5 = measuredWidth + measuredWidth2;
        }
        j.layout(measuredWidth, NR, i5, j.getMeasuredHeight() + NR);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        CollapsibleSidePanelView$SavedState collapsibleSidePanelView$SavedState = (CollapsibleSidePanelView$SavedState) parcelable;
        super.onRestoreInstanceState(collapsibleSidePanelView$SavedState.getSuperState());
        this.a = collapsibleSidePanelView$SavedState.a ? this.b : k();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new CollapsibleSidePanelView$SavedState(super.onSaveInstanceState(), f());
    }

    public void setCloseButtonViewId(int i) {
        this.h = i;
    }

    public void setCollapsedExposurePixels(int i) {
        this.b = i;
    }

    public void setNestedCollapsibleViewId(int i) {
        this.g = i;
    }

    public jjf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new ArrayList();
        this.a = Integer.MAX_VALUE;
        this.b = 0;
        this.g = -1;
        this.h = -1;
        this.d = false;
    }

    public jjf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
        this.a = Integer.MAX_VALUE;
        this.b = 0;
        this.g = -1;
        this.h = -1;
        this.d = false;
    }
}
