package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: zxo  reason: default package */
/* loaded from: classes7.dex */
public abstract class zxo extends jko {
    public final zxl A;
    @dzsi
    public View B;
    public boolean C;
    private final Rect n;

    public zxo(Context context) {
        this(context, null);
    }

    public static boolean J(Context context) {
        btpf c = btpf.c(context);
        return c.e && c.f;
    }

    protected abstract zxm H();

    public final void I() {
        int i = 0;
        if (J(getContext())) {
            this.A.x(0);
            return;
        }
        zxl zxlVar = this.A;
        View rootView = getRootView();
        View view = this.B;
        if (view != null && view.getParent() != null && this.B.getRootView() == rootView) {
            this.n.bottom = this.B.getBottom();
            ViewGroup viewGroup = (ViewGroup) rootView;
            viewGroup.offsetDescendantRectToMyCoords((View) this.B.getParent(), this.n);
            viewGroup.offsetRectIntoDescendantCoords(this, this.n);
            i = this.n.bottom;
        }
        zxlVar.x(i);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I();
    }

    @Override // defpackage.jnq, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ExpandingScrollView u = this.A.u();
        if (u == null || J(getContext()) || u.f == jjn.COLLAPSED) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            I();
        }
        this.A.y();
    }

    @Override // defpackage.jnq, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ExpandingScrollView u = this.A.u();
        if (u == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.C && motionEvent.getAction() == 0) {
            if (u.f == jjn.HIDDEN) {
                return false;
            }
            int M = u.M() - u.getScrollY();
            float y = motionEvent.getY();
            if (u.f == jjn.COLLAPSED && y < M) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.jnq, androidx.viewpager.widget.ViewPager
    public void setAdapter(@dzsi bas basVar) {
        throw new IllegalArgumentException("setAdapter should not be explicitly called on OneDirectionViewPager");
    }

    public zxo(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new Rect();
        zxl zxlVar = new zxl(H(), this);
        this.A = zxlVar;
        super.setAdapter(zxlVar);
        h(new zxi(this));
    }
}
