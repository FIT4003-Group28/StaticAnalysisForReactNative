package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.ui.MaxWidthLayout;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nti  reason: default package */
/* loaded from: classes7.dex */
public final class nti extends nso {
    @dzsi
    private nth h;
    private final MaxWidthLayout i;
    private final PagedScrollBarView j;
    private final FrameLayout k;
    private int l;
    private int m;
    private int n;
    private boolean o;

    public nti(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void g() {
        MaxWidthLayout maxWidthLayout = this.i;
        PagedScrollBarView pagedScrollBarView = this.j;
        int i = this.l;
        int i2 = this.m;
        int i3 = this.n;
        boolean z = this.o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) maxWidthLayout.getLayoutParams();
        layoutParams.setMarginStart(0);
        if (true != z) {
            i = i2;
        }
        layoutParams.setMarginEnd(i);
        maxWidthLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pagedScrollBarView.getLayoutParams();
        if (i3 == 0) {
            layoutParams2.gravity = 8388613;
            layoutParams.width = -1;
        } else {
            layoutParams2.gravity = 8388611;
            layoutParams2.setMarginStart(i3);
            layoutParams.width = i3;
        }
        pagedScrollBarView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cov
    public final void d(boolean z) {
        super.d(z);
        boolean z2 = this.j.getVisibility() == 0;
        if (!z2) {
            this.j.setVisibility(8);
        }
        if (this.o == z2) {
            return;
        }
        this.o = z2;
        nth nthVar = this.h;
        if (nthVar != null) {
            nthVar.a(z2);
        }
        g();
        if (!this.i.isInLayout()) {
            return;
        }
        final MaxWidthLayout maxWidthLayout = this.i;
        maxWidthLayout.getClass();
        maxWidthLayout.post(new Runnable(maxWidthLayout) { // from class: ntg
            private final MaxWidthLayout a;

            {
                this.a = maxWidthLayout;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.requestLayout();
            }
        });
    }

    @Override // defpackage.cov
    public void setDayNightStyle(int i) {
        super.setDayNightStyle(i);
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            return;
        }
        if (i == 0) {
            frameLayout.setBackgroundColor(nql.aO.b(getContext()));
        } else if (i == 1) {
            frameLayout.setBackgroundColor(nql.aP.b(getContext()));
        } else if (i == 2) {
            frameLayout.setBackgroundColor(536870911);
        } else if (i == 3) {
            frameLayout.setBackgroundColor(520093696);
        } else {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unexpected dayNightStyle: ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }

    public void setEndPaddingWhenScrollBarHidden(int i) {
        this.m = i;
        g();
    }

    public void setItemWidth(int i) {
        this.n = i;
        g();
    }

    @Override // defpackage.cov
    public void setListViewStartEndPadding(int i, int i2) {
        throw new UnsupportedOperationException("setListViewStartEndPadding not supported");
    }

    public void setOnScrollBarVisibilityChangeListener(@dzsi nth nthVar) {
        this.h = nthVar;
    }

    public void setScrollBarId(int i) {
        this.j.setId(i);
    }

    public void setScrollBarWidth(int i) {
        this.l = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.width = i;
        this.j.setLayoutParams(layoutParams);
        g();
    }

    public void setShowDivider(boolean z) {
        if (z) {
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(4);
        }
    }

    public nti(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cox.c, i, 0);
        try {
            if (!obtainStyledAttributes.getBoolean(5, false)) {
                if (!obtainStyledAttributes.getBoolean(6, true)) {
                    throw new UnsupportedOperationException("Scroll bar must be enabled");
                }
                obtainStyledAttributes.recycle();
                MaxWidthLayout maxWidthLayout = (MaxWidthLayout) super.findViewById(R.id.max_width_layout);
                this.i = maxWidthLayout;
                maxWidthLayout.setMaxChildrenWidth(0);
                PagedScrollBarView pagedScrollBarView = (PagedScrollBarView) super.findViewById(R.id.paged_scroll_view);
                this.j = pagedScrollBarView;
                FrameLayout frameLayout = new FrameLayout(context, attributeSet);
                this.k = frameLayout;
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(nqo.ax.e(context), -1));
                frameLayout.setBackgroundColor(nql.aO.b(context));
                frameLayout.setVisibility(4);
                pagedScrollBarView.addView(frameLayout);
                pagedScrollBarView.getChildAt(0).setPadding(0, pagedScrollBarView.getPaddingTop(), 0, pagedScrollBarView.getPaddingBottom());
                pagedScrollBarView.setPadding(pagedScrollBarView.getPaddingStart(), 0, pagedScrollBarView.getPaddingEnd(), 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pagedScrollBarView.getLayoutParams();
                int i2 = layoutParams.width;
                this.l = i2;
                this.m = i2;
                pagedScrollBarView.setLayoutParams(layoutParams);
                pagedScrollBarView.setVisibility(8);
                g();
                return;
            }
            throw new UnsupportedOperationException("Right gutter not supported");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
