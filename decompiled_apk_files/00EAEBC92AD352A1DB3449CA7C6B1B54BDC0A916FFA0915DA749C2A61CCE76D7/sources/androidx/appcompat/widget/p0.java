package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;
/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    Runnable f1336b;

    /* renamed from: c  reason: collision with root package name */
    private c f1337c;

    /* renamed from: d  reason: collision with root package name */
    i0 f1338d;

    /* renamed from: e  reason: collision with root package name */
    private Spinner f1339e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1340f;

    /* renamed from: g  reason: collision with root package name */
    int f1341g;

    /* renamed from: h  reason: collision with root package name */
    int f1342h;
    private int i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1343b;

        a(View view) {
            this.f1343b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f1343b.getLeft() - ((p0.this.getWidth() - this.f1343b.getWidth()) / 2), 0);
            p0.this.f1336b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f1338d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) p0.this.f1338d.getChildAt(i)).a();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.a((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).a().e();
            int childCount = p0.this.f1338d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = p0.this.f1338d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1347b;

        /* renamed from: c  reason: collision with root package name */
        private a.c f1348c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f1349d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f1350e;

        /* renamed from: f  reason: collision with root package name */
        private View f1351f;

        public d(Context context, a.c cVar, boolean z) {
            super(context, null, a.a.a.actionBarTabStyle);
            this.f1347b = new int[]{16842964};
            this.f1348c = cVar;
            x0 a2 = x0.a(context, null, this.f1347b, a.a.a.actionBarTabStyle, 0);
            if (a2.g(0)) {
                setBackgroundDrawable(a2.b(0));
            }
            a2.a();
            if (z) {
                setGravity(8388627);
            }
            b();
        }

        public a.c a() {
            return this.f1348c;
        }

        public void a(a.c cVar) {
            this.f1348c = cVar;
            b();
        }

        public void b() {
            a.c cVar = this.f1348c;
            View b2 = cVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f1351f = b2;
                TextView textView = this.f1349d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1350e;
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(8);
                this.f1350e.setImageDrawable(null);
                return;
            }
            View view = this.f1351f;
            if (view != null) {
                removeView(view);
                this.f1351f = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f1350e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1350e = oVar;
                }
                this.f1350e.setImageDrawable(c2);
                this.f1350e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1350e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1350e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f1349d == null) {
                    z zVar = new z(getContext(), null, a.a.a.actionBarTabTextStyle);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f1349d = zVar;
                }
                this.f1349d.setText(d2);
                this.f1349d.setVisibility(0);
            } else {
                TextView textView2 = this.f1349d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1349d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1350e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            z0.a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (p0.this.f1341g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = p0.this.f1341g;
                if (measuredWidth <= i3) {
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
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
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner a() {
        w wVar = new w(getContext(), null, a.a.a.actionDropDownStyle);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean b() {
        Spinner spinner = this.f1339e;
        return spinner != null && spinner.getParent() == this;
    }

    private void c() {
        if (b()) {
            return;
        }
        if (this.f1339e == null) {
            this.f1339e = a();
        }
        removeView(this.f1338d);
        addView(this.f1339e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1339e.getAdapter() == null) {
            this.f1339e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1336b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1336b = null;
        }
        this.f1339e.setSelection(this.j);
    }

    private boolean d() {
        if (!b()) {
            return false;
        }
        removeView(this.f1339e);
        addView(this.f1338d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1339e.getSelectedItemPosition());
        return false;
    }

    d a(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f1337c == null) {
                this.f1337c = new c();
            }
            dVar.setOnClickListener(this.f1337c);
        }
        return dVar;
    }

    public void a(int i) {
        View childAt = this.f1338d.getChildAt(i);
        Runnable runnable = this.f1336b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f1336b = new a(childAt);
        post(this.f1336b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1336b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.a.o.a a2 = a.a.o.a.a(getContext());
        setContentHeight(a2.e());
        this.f1342h = a2.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1336b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).a().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1338d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f1341g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1341g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f1341g, this.f1342h);
        }
        this.f1341g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (z2 || !this.f1340f) {
            z = false;
        }
        if (z) {
            this.f1338d.measure(0, makeMeasureSpec);
            if (this.f1338d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.j);
                return;
            }
        }
        d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1340f = z;
    }

    public void setContentHeight(int i) {
        this.i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.j = i;
        int childCount = this.f1338d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1338d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1339e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
