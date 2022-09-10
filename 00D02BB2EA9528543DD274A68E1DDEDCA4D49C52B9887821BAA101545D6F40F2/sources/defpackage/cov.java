package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.ui.CarRecyclerView;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cov  reason: default package */
/* loaded from: classes5.dex */
public class cov extends FrameLayout {
    public final CarRecyclerView a;
    public final cok b;
    protected final Handler c;
    public final PagedScrollBarView d;
    protected abg<? extends acl> e;
    protected cou f;
    protected final Runnable g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private cos k;
    private int l;
    private int m;
    private boolean n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;
    private final abx s;
    private final Runnable t;

    public cov(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
    }

    private final boolean g() {
        return getResources().getBoolean(R.bool.has_wheel) || getResources().getConfiguration().navigation == 2;
    }

    public final void a(int i) {
        this.b.O(i);
        this.c.post(this.t);
    }

    public final int b() {
        return this.b.l();
    }

    public final void c() {
        this.a.h(this.k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(boolean z) {
        if (!this.h) {
            return;
        }
        if ((this.b.G() && this.b.H()) || this.b.aN() == 0) {
            this.d.setVisibility(4);
        } else {
            this.d.setVisibility(0);
        }
        this.d.setUpEnabled(!this.b.G());
        this.d.setDownEnabled(!this.b.H());
        this.d.setParameters(this.a.computeVerticalScrollRange(), this.a.computeVerticalScrollOffset(), this.a.computeVerticalScrollExtent(), z);
        invalidate();
    }

    protected final void e() {
        abg<? extends acl> abgVar = this.e;
        if (abgVar == null) {
            return;
        }
        int c = abgVar.c();
        View aK = this.b.aK(0);
        if (aK != null && aK.getHeight() != 0) {
            int height = (getHeight() - getPaddingTop()) / aK.getHeight();
        }
        cot cotVar = (cot) this.e;
        View aK2 = this.b.aK(0);
        if (aK2 != null) {
            aK2.getHeight();
        }
        cotVar.a();
        int c2 = this.e.c();
        if (c2 == c) {
            return;
        }
        if (c2 < c) {
            this.e.x(c2, c - c2);
        } else {
            this.e.w(c, c2 - c);
        }
    }

    public final View f() {
        return this.b.I(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.removeCallbacks(this.t);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View childAt;
        if (getResources().getBoolean(R.bool.gearhead_sdk_true_for_touch) || g()) {
            return false;
        }
        int action = motionEvent.getAction();
        int i = 2;
        if (action == 2) {
            float y = motionEvent.getY() - this.o;
            float y2 = motionEvent.getY() - this.p;
            if (this.q && y != dcyn.a) {
                int signum = (int) Math.signum(y);
                View focusedChild = this.a.getFocusedChild();
                if (focusedChild != null) {
                    int bm = cok.bm(focusedChild);
                    if (Math.max(Math.min(signum + bm, this.b.aN() - 1), 0) != bm) {
                        this.r = true;
                    }
                }
                this.q = false;
            }
            z2 = this.r && Math.abs(y) >= 15.0f;
            if ((y < 0.0f || y2 < 0.0f) && (y > 0.0f || y2 > 0.0f)) {
                z = true;
            } else {
                if (((int) (y / 50.0f)) != ((int) ((this.p - this.o) / 50.0f))) {
                    int signum2 = (int) Math.signum(y);
                    View focusedChild2 = this.a.getFocusedChild();
                    if (focusedChild2 != null) {
                        int bm2 = cok.bm(focusedChild2);
                        int max = Math.max(Math.min(signum2 + bm2, this.b.aN() - 1), 0);
                        if (max != bm2 && (childAt = this.a.getChildAt(max - cok.bm(this.b.aK(0)))) != null) {
                            childAt.requestFocus();
                        }
                    }
                }
                z = false;
            }
            this.p = motionEvent.getY();
        } else {
            i = action;
            z = false;
            z2 = false;
        }
        if (z || i == 0) {
            this.o = motionEvent.getY();
            this.p = motionEvent.getY();
            this.q = true;
            this.r = false;
            if (i == 0) {
                return false;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.b.J(1);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View aM = this.b.aM();
        View aK = this.b.aK(0);
        super.onLayout(z, i, i2, i3, i4);
        abg<? extends acl> abgVar = this.e;
        if (abgVar != null) {
            int c = abgVar.c();
            e();
            if (this.n && c > 0) {
                if (aM == null) {
                    requestFocus();
                }
                this.n = false;
            }
            if (c > this.m && aM == aK && aM != null && g()) {
                requestFocus();
            }
            this.m = c;
        }
        d(false);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View F;
        if (!this.j || (F = this.b.F()) == null) {
            View p = this.b.p();
            if (p != null) {
                return p.requestFocus(i, rect);
            }
            return super.onRequestFocusInDescendants(i, rect);
        }
        return F.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.b.J(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (g()) {
            this.n = true;
        }
        return super.requestFocus(i, rect);
    }

    public void setAdapter(abg<? extends acl> abgVar) {
        if (abgVar instanceof cot) {
            this.e = abgVar;
            this.a.setAdapter(abgVar);
            e();
            return;
        }
        String canonicalName = abgVar.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("ERROR: adapter [");
        sb.append(canonicalName);
        sb.append("] MUST implement ItemCap");
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public void setAutoDayNightMode() {
        setDayNightStyle(0);
    }

    @Deprecated
    public void setDarkMode() {
        setDayNightStyle(3);
    }

    public void setDayNightStyle(int i) {
        this.d.setDayNightStyle(i);
        this.k.a();
    }

    public void setDefaultItemDecoration(cos cosVar) {
        c();
        this.k = cosVar;
        this.a.g(cosVar);
    }

    public void setDefaultMaxPages(int i) {
        this.l = i;
    }

    public void setForceFieldType(con conVar) {
        cnjd cnjdVar = new cnjd(cnje.a(this));
        cnjdVar.a = con.b(conVar);
        cnje.b(this, cnjdVar.a());
    }

    @Deprecated
    public void setLightMode() {
        setDayNightStyle(2);
    }

    public void setListViewStartEndPadding(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_card_margin);
        int max = Math.max(i - (true != this.h ? 0 : dimensionPixelSize), 0);
        if (true != this.i) {
            dimensionPixelSize = 0;
        }
        int max2 = Math.max(i2 - dimensionPixelSize, 0);
        CarRecyclerView carRecyclerView = this.a;
        carRecyclerView.setPaddingRelative(max, carRecyclerView.getPaddingTop(), max2, this.a.getPaddingBottom());
        CarRecyclerView carRecyclerView2 = this.a;
        carRecyclerView2.setClipToPadding(carRecyclerView2.getClipChildren());
    }

    public void setMaxPages(int i) {
        e();
    }

    public void setOnScrollListener(cou couVar) {
        this.f = couVar;
        this.b.c = couVar;
    }

    public void setRequestFocusUsesMemory(boolean z) {
        this.j = z;
    }

    public cov(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public cov(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, 0);
        this.c = new Handler();
        this.k = new cos(getContext());
        this.l = 6;
        this.m = 0;
        this.s = new cop(this);
        this.g = new coq(this);
        this.t = new cor(this);
        LayoutInflater.from(context).inflate(R.layout.gearhead_sdk_paged_recycler_view, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.max_width_layout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cox.c, i, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            boolean z2 = obtainStyledAttributes.getBoolean(3, false);
            this.h = obtainStyledAttributes.getBoolean(6, true);
            this.i = obtainStyledAttributes.getBoolean(5, false);
            boolean z3 = obtainStyledAttributes.getBoolean(4, false);
            int integer = obtainStyledAttributes.getInteger(1, con.MULTIMOVE_MODAL.ordinal());
            boolean z4 = obtainStyledAttributes.getBoolean(7, true);
            int i2 = 8;
            boolean z5 = obtainStyledAttributes.getBoolean(8, false);
            obtainStyledAttributes.recycle();
            con a = con.a(integer, con.NONE);
            if (a != con.NONE) {
                cnjd cnjdVar = new cnjd();
                cnjdVar.a = con.b(a);
                cnje.b(this, cnjdVar.a());
            }
            CarRecyclerView carRecyclerView = (CarRecyclerView) findViewById(R.id.recycler_view);
            this.a = carRecyclerView;
            carRecyclerView.setFadeLastItem(z);
            cok cokVar = new cok(context);
            this.b = cokVar;
            cokVar.b = z2;
            if (!z2) {
                int aJ = cokVar.aJ();
                for (int i3 = 0; i3 < aJ; i3++) {
                    cokVar.M(cokVar.aK(i3), 0.0f);
                }
                cokVar.f = null;
            } else {
                if (cokVar.f == null) {
                    cokVar.f = new LruCache<>(30);
                }
                cokVar.L();
            }
            cok cokVar2 = this.b;
            cokVar2.g = z4;
            cokVar2.h = z5;
            this.a.setLayoutManager(cokVar2);
            this.a.g(this.k);
            this.a.setOnScrollListener(this.s);
            aby f = this.a.e().f(0);
            f.b = 12;
            ArrayList<acl> arrayList = f.a;
            while (arrayList.size() > 12) {
                arrayList.remove(arrayList.size() - 1);
            }
            this.a.setItemAnimator(new cog(this.b));
            setClickable(true);
            setFocusable(false);
            PagedScrollBarView pagedScrollBarView = (PagedScrollBarView) findViewById(R.id.paged_scroll_view);
            this.d = pagedScrollBarView;
            pagedScrollBarView.setPaginationListener(new coo(this));
            if (z3) {
                pagedScrollBarView.d = true;
                PagedScrollBarView.a(pagedScrollBarView.a);
                PagedScrollBarView.a(pagedScrollBarView.b);
                int dimensionPixelSize = pagedScrollBarView.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_paged_list_view_scrollbar_thumb_visible_buttons_margin);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pagedScrollBarView.c.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimensionPixelSize, marginLayoutParams.rightMargin, dimensionPixelSize);
                pagedScrollBarView.c.setLayoutParams(marginLayoutParams);
            }
            pagedScrollBarView.setVisibility(true == this.h ? 0 : i2);
            if (this.i || !this.h) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                if (this.i) {
                    layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_card_margin);
                }
                if (!this.h) {
                    layoutParams.setMarginStart(0);
                }
                frameLayout.setLayoutParams(layoutParams);
            }
            setDayNightStyle(0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
