package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.support.v7.app.a;
import android.support.v7.widget.y;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public class ae extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator j = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    Runnable f888a;

    /* renamed from: b  reason: collision with root package name */
    y f889b;

    /* renamed from: c  reason: collision with root package name */
    int f890c;

    /* renamed from: d  reason: collision with root package name */
    int f891d;
    private b e;
    private Spinner f;
    private boolean g;
    private int h;
    private int i;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f889b.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f890c = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f890c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f890c = Math.min(this.f890c, this.f891d);
        } else {
            this.f890c = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        if (z2 || !this.g) {
            z = false;
        }
        if (z) {
            this.f889b.measure(0, makeMeasureSpec);
            if (this.f889b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                b();
            } else {
                c();
            }
        } else {
            c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.i);
    }

    private boolean a() {
        return this.f != null && this.f.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.g = z;
    }

    private void b() {
        if (a()) {
            return;
        }
        if (this.f == null) {
            this.f = d();
        }
        removeView(this.f889b);
        addView(this.f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f.getAdapter() == null) {
            this.f.setAdapter((SpinnerAdapter) new a());
        }
        if (this.f888a != null) {
            removeCallbacks(this.f888a);
            this.f888a = null;
        }
        this.f.setSelection(this.i);
    }

    private boolean c() {
        if (!a()) {
            return false;
        }
        removeView(this.f);
        addView(this.f889b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.i = i;
        int childCount = this.f889b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f889b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        if (this.f == null || i < 0) {
            return;
        }
        this.f.setSelection(i);
    }

    public void setContentHeight(int i) {
        this.h = i;
        requestLayout();
    }

    private Spinner d() {
        o oVar = new o(getContext(), null, a.C0020a.actionDropDownStyle);
        oVar.setLayoutParams(new y.a(-2, -1));
        oVar.setOnItemSelectedListener(this);
        return oVar;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.support.v7.view.a a2 = android.support.v7.view.a.a(getContext());
        setContentHeight(a2.e());
        this.f891d = a2.f();
    }

    public void a(int i) {
        final View childAt = this.f889b.getChildAt(i);
        if (this.f888a != null) {
            removeCallbacks(this.f888a);
        }
        this.f888a = new Runnable() { // from class: android.support.v7.widget.ae.1
            @Override // java.lang.Runnable
            public void run() {
                ae.this.smoothScrollTo(childAt.getLeft() - ((ae.this.getWidth() - childAt.getWidth()) / 2), 0);
                ae.this.f888a = null;
            }
        };
        post(this.f888a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f888a != null) {
            post(this.f888a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f888a != null) {
            removeCallbacks(this.f888a);
        }
    }

    c a(a.b bVar, boolean z) {
        c cVar = new c(getContext(), bVar, z);
        if (z) {
            cVar.setBackgroundDrawable(null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
        } else {
            cVar.setFocusable(true);
            if (this.e == null) {
                this.e = new b();
            }
            cVar.setOnClickListener(this.e);
        }
        return cVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
        ((c) view).b().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class c extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f897b;

        /* renamed from: c  reason: collision with root package name */
        private a.b f898c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f899d;
        private ImageView e;
        private View f;

        public c(Context context, a.b bVar, boolean z) {
            super(context, null, a.C0020a.actionBarTabStyle);
            this.f897b = new int[]{16842964};
            this.f898c = bVar;
            am a2 = am.a(context, null, this.f897b, a.C0020a.actionBarTabStyle, 0);
            if (a2.f(0)) {
                setBackgroundDrawable(a2.a(0));
            }
            a2.a();
            if (z) {
                setGravity(8388627);
            }
            a();
        }

        public void a(a.b bVar) {
            this.f898c = bVar;
            a();
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (!z2 || !z) {
                return;
            }
            sendAccessibilityEvent(4);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.b.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.b.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ae.this.f890c <= 0 || getMeasuredWidth() <= ae.this.f890c) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ae.this.f890c, 1073741824), i2);
        }

        public void a() {
            a.b bVar = this.f898c;
            View c2 = bVar.c();
            CharSequence charSequence = null;
            if (c2 != null) {
                ViewParent parent = c2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c2);
                    }
                    addView(c2);
                }
                this.f = c2;
                if (this.f899d != null) {
                    this.f899d.setVisibility(8);
                }
                if (this.e == null) {
                    return;
                }
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
                return;
            }
            if (this.f != null) {
                removeView(this.f);
                this.f = null;
            }
            Drawable a2 = bVar.a();
            CharSequence b2 = bVar.b();
            if (a2 != null) {
                if (this.e == null) {
                    m mVar = new m(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    mVar.setLayoutParams(layoutParams);
                    addView(mVar, 0);
                    this.e = mVar;
                }
                this.e.setImageDrawable(a2);
                this.e.setVisibility(0);
            } else if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b2);
            if (z) {
                if (this.f899d == null) {
                    r rVar = new r(getContext(), null, a.C0020a.actionBarTabTextStyle);
                    rVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    rVar.setLayoutParams(layoutParams2);
                    addView(rVar);
                    this.f899d = rVar;
                }
                this.f899d.setText(b2);
                this.f899d.setVisibility(0);
            } else if (this.f899d != null) {
                this.f899d.setVisibility(8);
                this.f899d.setText((CharSequence) null);
            }
            if (this.e != null) {
                this.e.setContentDescription(bVar.e());
            }
            if (!z) {
                charSequence = bVar.e();
            }
            ao.a(this, charSequence);
        }

        public a.b b() {
            return this.f898c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ae.this.f889b.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((c) ae.this.f889b.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ae.this.a((a.b) getItem(i), true);
            }
            ((c) view).a((a.b) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((c) view).b().d();
            int childCount = ae.this.f889b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ae.this.f889b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }
}
