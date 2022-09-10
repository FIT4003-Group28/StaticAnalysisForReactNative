package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: ztt  reason: default package */
/* loaded from: classes7.dex */
public final class ztt extends ExpandingScrollView {
    private static final cqrp C = cqrp.d(128.0d);
    private final float D;
    private final float E;
    private float F;
    private final int G;
    private final Paint H;
    private final Rect I;

    public ztt(Context context, float f) {
        super(context);
        Paint paint = new Paint();
        this.H = paint;
        this.I = new Rect();
        this.D = f;
        this.E = 100.0f;
        this.F = f;
        setWillNotDraw(false);
        paint.setColor(-1);
        this.G = C.e(context);
    }

    public final void Y(Configuration configuration) {
        this.F = configuration.orientation == 2 ? this.E : this.D;
        setExposurePercentage(jjn.FULLY_EXPANDED, this.F);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView
    protected final int o(int i) {
        return (int) ((View.MeasureSpec.getSize(i) * this.F) / 100.0f);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Y(configuration);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        View view = this.m;
        if (view != null) {
            this.I.set(getLeft(), view.getBottom(), getRight(), getBottom() + this.G);
            canvas.drawRect(this.I, this.H);
        }
        super.onDraw(canvas);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Y(getContext().getResources().getConfiguration());
        getParent().requestLayout();
    }
}
