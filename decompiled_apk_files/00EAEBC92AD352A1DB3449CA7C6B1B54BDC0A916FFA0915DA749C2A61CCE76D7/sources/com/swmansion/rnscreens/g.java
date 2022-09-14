package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.swmansion.rnscreens.h;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<h> f10068b;

    /* renamed from: c  reason: collision with root package name */
    private String f10069c;

    /* renamed from: d  reason: collision with root package name */
    private int f10070d;

    /* renamed from: e  reason: collision with root package name */
    private String f10071e;

    /* renamed from: f  reason: collision with root package name */
    private float f10072f;

    /* renamed from: g  reason: collision with root package name */
    private int f10073g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10074h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private final Toolbar o;
    private boolean p;
    private int q;
    private int r;
    private View.OnClickListener s;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ScreenStackFragment screenFragment = g.this.getScreenFragment();
            if (screenFragment != null) {
                f screenStack = g.this.getScreenStack();
                if (screenStack != null && screenStack.getRootScreen() == screenFragment.m0()) {
                    Fragment v = screenFragment.v();
                    if (!(v instanceof ScreenStackFragment)) {
                        return;
                    }
                    screenFragment = (ScreenStackFragment) v;
                }
                screenFragment.p0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10076a = new int[h.a.values().length];

        static {
            try {
                f10076a[h.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10076a[h.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10076a[h.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(Context context) {
        super(context);
        this.f10068b = new ArrayList<>(3);
        this.m = true;
        this.p = false;
        this.s = new a();
        setVisibility(8);
        this.o = new Toolbar(context);
        this.q = this.o.getContentInsetStart();
        this.r = this.o.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843827, typedValue, true)) {
            this.o.setBackgroundColor(typedValue.data);
        }
    }

    private void d() {
        if (getParent() == null || this.k) {
            return;
        }
        b();
    }

    private com.swmansion.rnscreens.b getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof com.swmansion.rnscreens.b) {
            return (com.swmansion.rnscreens.b) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (parent instanceof com.swmansion.rnscreens.b) {
            ScreenFragment fragment = ((com.swmansion.rnscreens.b) parent).getFragment();
            if (!(fragment instanceof ScreenStackFragment)) {
                return null;
            }
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f getScreenStack() {
        com.swmansion.rnscreens.b screen = getScreen();
        if (screen != null) {
            d container = screen.getContainer();
            if (!(container instanceof f)) {
                return null;
            }
            return (f) container;
        }
        return null;
    }

    private TextView getTitleTextView() {
        int childCount = this.o.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.o.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (textView.getText().equals(this.o.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    public h a(int i) {
        return this.f10068b.get(i);
    }

    public void a() {
        this.k = true;
    }

    public void a(h hVar, int i) {
        this.f10068b.add(i, hVar);
        d();
    }

    public void b() {
        androidx.appcompat.app.d dVar;
        Drawable navigationIcon;
        Toolbar toolbar;
        int i;
        com.swmansion.rnscreens.b bVar = (com.swmansion.rnscreens.b) getParent();
        f screenStack = getScreenStack();
        boolean z = screenStack == null || screenStack.getTopScreen() == bVar;
        if (!this.p || !z || this.k || (dVar = (androidx.appcompat.app.d) getScreenFragment().g()) == null) {
            return;
        }
        if (this.f10074h) {
            if (this.o.getParent() == null) {
                return;
            }
            getScreenFragment().s0();
            return;
        }
        if (this.o.getParent() == null) {
            getScreenFragment().a(this.o);
        }
        if (this.m) {
            if (Build.VERSION.SDK_INT >= 23) {
                toolbar = this.o;
                i = getRootWindowInsets().getSystemWindowInsetTop();
            } else {
                toolbar = this.o;
                i = (int) (getResources().getDisplayMetrics().density * 25.0f);
            }
            toolbar.setPadding(0, i, 0, 0);
        } else if (this.o.getPaddingTop() > 0) {
            this.o.setPadding(0, 0, 0, 0);
        }
        dVar.a(this.o);
        androidx.appcompat.app.a l = dVar.l();
        this.o.setContentInsetStartWithNavigation(this.r);
        Toolbar toolbar2 = this.o;
        int i2 = this.q;
        toolbar2.a(i2, i2);
        l.d(getScreenFragment().o0() && !this.i);
        this.o.setNavigationOnClickListener(this.s);
        getScreenFragment().h(this.j);
        l.a(this.f10069c);
        if (TextUtils.isEmpty(this.f10069c)) {
            this.o.setContentInsetStartWithNavigation(0);
        }
        TextView titleTextView = getTitleTextView();
        int i3 = this.f10070d;
        if (i3 != 0) {
            this.o.setTitleTextColor(i3);
        }
        if (titleTextView != null) {
            if (this.f10071e != null) {
                titleTextView.setTypeface(com.facebook.react.views.text.i.a().a(this.f10071e, 0, getContext().getAssets()));
            }
            float f2 = this.f10072f;
            if (f2 > 0.0f) {
                titleTextView.setTextSize(f2);
            }
        }
        int i4 = this.f10073g;
        if (i4 != 0) {
            this.o.setBackgroundColor(i4);
        }
        if (this.n != 0 && (navigationIcon = this.o.getNavigationIcon()) != null) {
            navigationIcon.setColorFilter(this.n, PorterDuff.Mode.SRC_ATOP);
        }
        for (int childCount = this.o.getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.o.getChildAt(childCount) instanceof h) {
                this.o.removeViewAt(childCount);
            }
        }
        int size = this.f10068b.size();
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = this.f10068b.get(i5);
            h.a type = hVar.getType();
            if (type == h.a.BACK) {
                View childAt = hVar.getChildAt(0);
                if (!(childAt instanceof ImageView)) {
                    throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                }
                l.a(((ImageView) childAt).getDrawable());
            } else {
                Toolbar.e eVar = new Toolbar.e(-2, -1);
                int i6 = b.f10076a[type.ordinal()];
                if (i6 == 1) {
                    if (!this.l) {
                        this.o.setNavigationIcon((Drawable) null);
                    }
                    this.o.setTitle((CharSequence) null);
                    eVar.f893a = 3;
                } else if (i6 == 2) {
                    eVar.f893a = 5;
                } else if (i6 == 3) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = -1;
                    eVar.f893a = 1;
                    this.o.setTitle((CharSequence) null);
                }
                hVar.setLayoutParams(eVar);
                this.o.addView(hVar);
            }
        }
    }

    public void b(int i) {
        this.f10068b.remove(i);
        d();
    }

    public void c() {
        this.f10068b.clear();
        d();
    }

    public int getConfigSubviewsCount() {
        return this.f10068b.size();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = true;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setBackButtonInCustomView(boolean z) {
        this.l = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f10073g = i;
    }

    public void setHidden(boolean z) {
        this.f10074h = z;
    }

    public void setHideBackButton(boolean z) {
        this.i = z;
    }

    public void setHideShadow(boolean z) {
        this.j = z;
    }

    public void setTintColor(int i) {
        this.n = i;
    }

    public void setTitle(String str) {
        this.f10069c = str;
    }

    public void setTitleColor(int i) {
        this.f10070d = i;
    }

    public void setTitleFontFamily(String str) {
        this.f10071e = str;
    }

    public void setTitleFontSize(float f2) {
        this.f10072f = f2;
    }

    public void setTopInsetEnabled(boolean z) {
        this.m = z;
    }
}
