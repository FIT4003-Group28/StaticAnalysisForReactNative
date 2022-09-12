package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
/* compiled from: PG */
/* renamed from: nte  reason: default package */
/* loaded from: classes7.dex */
public final class nte extends ScrollView {
    @dzsi
    private PagedScrollBarView a;
    private boolean b;

    public nte(Context context) {
        this(context, null);
    }

    private final void a() {
        PagedScrollBarView pagedScrollBarView = this.a;
        if (pagedScrollBarView == null) {
            return;
        }
        boolean canScrollVertically = canScrollVertically(-1);
        boolean z = true;
        boolean canScrollVertically2 = canScrollVertically(1);
        if (canScrollVertically || canScrollVertically2) {
            pagedScrollBarView.setVisibility(0);
            if (this.b) {
                pagedScrollBarView.setUpEnabled(canScrollVertically);
                pagedScrollBarView.setDownEnabled(canScrollVertically2);
                int computeVerticalScrollRange = computeVerticalScrollRange();
                int computeVerticalScrollOffset = computeVerticalScrollOffset();
                int computeVerticalScrollExtent = computeVerticalScrollExtent();
                if (computeVerticalScrollRange <= computeVerticalScrollExtent) {
                    z = false;
                }
                dbsk.l(z);
                pagedScrollBarView.setParameters(computeVerticalScrollRange, (computeVerticalScrollOffset * computeVerticalScrollRange) / (computeVerticalScrollRange - computeVerticalScrollExtent), computeVerticalScrollExtent, false);
                return;
            }
            pagedScrollBarView.setUpEnabled(false);
            pagedScrollBarView.setDownEnabled(false);
            return;
        }
        pagedScrollBarView.setVisibility(8);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.b) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPagedScrollBarView(PagedScrollBarView pagedScrollBarView) {
        this.a = pagedScrollBarView;
        pagedScrollBarView.setPaginationListener(new ntd(this));
        a();
    }

    public void setScrollBarEnabled(boolean z) {
        this.b = z;
        a();
    }

    public nte(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nte(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        super.setVerticalScrollBarEnabled(false);
    }
}
