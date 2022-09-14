package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.a.a;
import android.support.v7.app.a;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.m;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    private final ActionMenuView.e H;
    private an I;
    private android.support.v7.widget.d J;
    private a K;
    private m.a L;
    private g.a M;
    private boolean N;
    private final Runnable O;

    /* renamed from: a  reason: collision with root package name */
    ImageButton f853a;

    /* renamed from: b  reason: collision with root package name */
    View f854b;

    /* renamed from: c  reason: collision with root package name */
    int f855c;

    /* renamed from: d  reason: collision with root package name */
    c f856d;
    private ActionMenuView e;
    private TextView f;
    private TextView g;
    private ImageButton h;
    private ImageView i;
    private Drawable j;
    private CharSequence k;
    private Context l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private ad u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    /* loaded from: classes.dex */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0020a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new ActionMenuView.e() { // from class: android.support.v7.widget.Toolbar.1
            @Override // android.support.v7.widget.ActionMenuView.e
            public boolean a(MenuItem menuItem) {
                if (Toolbar.this.f856d != null) {
                    return Toolbar.this.f856d.a(menuItem);
                }
                return false;
            }
        };
        this.O = new Runnable() { // from class: android.support.v7.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                Toolbar.this.b();
            }
        };
        am a2 = am.a(getContext(), attributeSet, a.j.Toolbar, i, 0);
        this.n = a2.g(a.j.Toolbar_titleTextAppearance, 0);
        this.o = a2.g(a.j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.c(a.j.Toolbar_android_gravity, this.x);
        this.f855c = a2.c(a.j.Toolbar_buttonGravity, 48);
        int d2 = a2.d(a.j.Toolbar_titleMargin, 0);
        d2 = a2.f(a.j.Toolbar_titleMargins) ? a2.d(a.j.Toolbar_titleMargins, d2) : d2;
        this.t = d2;
        this.s = d2;
        this.r = d2;
        this.q = d2;
        int d3 = a2.d(a.j.Toolbar_titleMarginStart, -1);
        if (d3 >= 0) {
            this.q = d3;
        }
        int d4 = a2.d(a.j.Toolbar_titleMarginEnd, -1);
        if (d4 >= 0) {
            this.r = d4;
        }
        int d5 = a2.d(a.j.Toolbar_titleMarginTop, -1);
        if (d5 >= 0) {
            this.s = d5;
        }
        int d6 = a2.d(a.j.Toolbar_titleMarginBottom, -1);
        if (d6 >= 0) {
            this.t = d6;
        }
        this.p = a2.e(a.j.Toolbar_maxButtonHeight, -1);
        int d7 = a2.d(a.j.Toolbar_contentInsetStart, PKIFailureInfo.systemUnavail);
        int d8 = a2.d(a.j.Toolbar_contentInsetEnd, PKIFailureInfo.systemUnavail);
        int e = a2.e(a.j.Toolbar_contentInsetLeft, 0);
        int e2 = a2.e(a.j.Toolbar_contentInsetRight, 0);
        n();
        this.u.b(e, e2);
        if (d7 != Integer.MIN_VALUE || d8 != Integer.MIN_VALUE) {
            this.u.a(d7, d8);
        }
        this.v = a2.d(a.j.Toolbar_contentInsetStartWithNavigation, PKIFailureInfo.systemUnavail);
        this.w = a2.d(a.j.Toolbar_contentInsetEndWithActions, PKIFailureInfo.systemUnavail);
        this.j = a2.a(a.j.Toolbar_collapseIcon);
        this.k = a2.b(a.j.Toolbar_collapseContentDescription);
        CharSequence b2 = a2.b(a.j.Toolbar_title);
        if (!TextUtils.isEmpty(b2)) {
            setTitle(b2);
        }
        CharSequence b3 = a2.b(a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(b3)) {
            setSubtitle(b3);
        }
        this.l = getContext();
        setPopupTheme(a2.g(a.j.Toolbar_popupTheme, 0));
        Drawable a3 = a2.a(a.j.Toolbar_navigationIcon);
        if (a3 != null) {
            setNavigationIcon(a3);
        }
        CharSequence b4 = a2.b(a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(b4)) {
            setNavigationContentDescription(b4);
        }
        Drawable a4 = a2.a(a.j.Toolbar_logo);
        if (a4 != null) {
            setLogo(a4);
        }
        CharSequence b5 = a2.b(a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(b5)) {
            setLogoDescription(b5);
        }
        if (a2.f(a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.b(a.j.Toolbar_titleTextColor, -1));
        }
        if (a2.f(a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.b(a.j.Toolbar_subtitleTextColor, -1));
        }
        a2.a();
    }

    public void setPopupTheme(int i) {
        if (this.m != i) {
            this.m = i;
            if (i == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.m;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        n();
        ad adVar = this.u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        adVar.a(z);
    }

    public void setLogo(int i) {
        setLogo(android.support.v7.b.a.b.b(getContext(), i));
    }

    public boolean a() {
        return this.e != null && this.e.e();
    }

    public boolean b() {
        return this.e != null && this.e.d();
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!d(this.i)) {
                a((View) this.i, true);
            }
        } else if (this.i != null && d(this.i)) {
            removeView(this.i);
            this.F.remove(this.i);
        }
        if (this.i != null) {
            this.i.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.i != null) {
            return this.i.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        if (this.i != null) {
            this.i.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.i != null) {
            return this.i.getContentDescription();
        }
        return null;
    }

    private void h() {
        if (this.i == null) {
            this.i = new m(getContext());
        }
    }

    public void c() {
        android.support.v7.view.menu.h hVar = this.K == null ? null : this.K.f861b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f == null) {
                Context context = getContext();
                this.f = new r(context);
                this.f.setSingleLine();
                this.f.setEllipsize(TextUtils.TruncateAt.END);
                if (this.n != 0) {
                    this.f.setTextAppearance(context, this.n);
                }
                if (this.A != 0) {
                    this.f.setTextColor(this.A);
                }
            }
            if (!d(this.f)) {
                a((View) this.f, true);
            }
        } else if (this.f != null && d(this.f)) {
            removeView(this.f);
            this.F.remove(this.f);
        }
        if (this.f != null) {
            this.f.setText(charSequence);
        }
        this.y = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.g == null) {
                Context context = getContext();
                this.g = new r(context);
                this.g.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                if (this.o != 0) {
                    this.g.setTextAppearance(context, this.o);
                }
                if (this.B != 0) {
                    this.g.setTextColor(this.B);
                }
            }
            if (!d(this.g)) {
                a((View) this.g, true);
            }
        } else if (this.g != null && d(this.g)) {
            removeView(this.g);
            this.F.remove(this.g);
        }
        if (this.g != null) {
            this.g.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void a(Context context, int i) {
        this.n = i;
        if (this.f != null) {
            this.f.setTextAppearance(context, i);
        }
    }

    public void b(Context context, int i) {
        this.o = i;
        if (this.g != null) {
            this.g.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.A = i;
        if (this.f != null) {
            this.f.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.B = i;
        if (this.g != null) {
            this.g.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.h != null) {
            return this.h.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            k();
        }
        if (this.h != null) {
            this.h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(android.support.v7.b.a.b.b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!d(this.h)) {
                a((View) this.h, true);
            }
        } else if (this.h != null && d(this.h)) {
            removeView(this.h);
            this.F.remove(this.h);
        }
        if (this.h != null) {
            this.h.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.h != null) {
            return this.h.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        k();
        this.h.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        i();
        return this.e.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        i();
        this.e.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        i();
        return this.e.getOverflowIcon();
    }

    private void i() {
        j();
        if (this.e.c() == null) {
            android.support.v7.view.menu.g gVar = (android.support.v7.view.menu.g) this.e.getMenu();
            if (this.K == null) {
                this.K = new a();
            }
            this.e.setExpandedActionViewsExclusive(true);
            gVar.a(this.K, this.l);
        }
    }

    private void j() {
        if (this.e == null) {
            this.e = new ActionMenuView(getContext());
            this.e.setPopupTheme(this.m);
            this.e.setOnMenuItemClickListener(this.H);
            this.e.a(this.L, this.M);
            b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f699a = 8388613 | (this.f855c & 112);
            this.e.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.e, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new android.support.v7.view.d(getContext());
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.f856d = cVar;
    }

    public void a(int i, int i2) {
        n();
        this.u.a(i, i2);
    }

    public int getContentInsetStart() {
        if (this.u != null) {
            return this.u.c();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        if (this.u != null) {
            return this.u.d();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        if (this.u != null) {
            return this.u.a();
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.u != null) {
            return this.u.b();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.v != Integer.MIN_VALUE ? this.v : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = PKIFailureInfo.systemUnavail;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public int getContentInsetEndWithActions() {
        return this.w != Integer.MIN_VALUE ? this.w : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = PKIFailureInfo.systemUnavail;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        android.support.v7.view.menu.g c2;
        if ((this.e == null || (c2 = this.e.c()) == null || !c2.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (android.support.v4.j.s.c(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (android.support.v4.j.s.c(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private void k() {
        if (this.h == null) {
            this.h = new k(getContext(), null, a.C0020a.toolbarNavigationButtonStyle);
            b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f699a = 8388611 | (this.f855c & 112);
            this.h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    void d() {
        if (this.f853a == null) {
            this.f853a = new k(getContext(), null, a.C0020a.toolbarNavigationButtonStyle);
            this.f853a.setImageDrawable(this.j);
            this.f853a.setContentDescription(this.k);
            b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f699a = 8388611 | (this.f855c & 112);
            generateDefaultLayoutParams.f863b = 2;
            this.f853a.setLayoutParams(generateDefaultLayoutParams);
            this.f853a.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.Toolbar.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Toolbar.this.c();
                }
            });
        }
    }

    private void a(View view, boolean z) {
        b bVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            bVar = generateLayoutParams(layoutParams);
        } else {
            bVar = (b) layoutParams;
        }
        bVar.f863b = 1;
        if (z && this.f854b != null) {
            view.setLayoutParams(bVar);
            this.F.add(view);
            return;
        }
        addView(view, bVar);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        if (this.K != null && this.K.f861b != null) {
            dVar.f864b = this.K.f861b.getItemId();
        }
        dVar.f865c = a();
        return dVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        android.support.v7.view.menu.g c2 = this.e != null ? this.e.c() : null;
        if (dVar.f864b != 0 && this.K != null && c2 != null && (findItem = c2.findItem(dVar.f864b)) != null) {
            findItem.expandActionView();
        }
        if (!dVar.f865c) {
            return;
        }
        l();
    }

    private void l() {
        removeCallbacks(this.O);
        post(this.O);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private boolean m() {
        if (!this.N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.G;
        if (as.a(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (a(this.h)) {
            a(this.h, i, 0, i2, 0, this.p);
            i3 = this.h.getMeasuredWidth() + b(this.h);
            i4 = Math.max(0, this.h.getMeasuredHeight() + c(this.h));
            i5 = View.combineMeasuredStates(0, this.h.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (a(this.f853a)) {
            a(this.f853a, i, 0, i2, 0, this.p);
            i3 = this.f853a.getMeasuredWidth() + b(this.f853a);
            i4 = Math.max(i4, this.f853a.getMeasuredHeight() + c(this.f853a));
            i5 = View.combineMeasuredStates(i5, this.f853a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i3);
        if (a(this.e)) {
            a(this.e, i, max, i2, 0, this.p);
            i6 = this.e.getMeasuredWidth() + b(this.e);
            i4 = Math.max(i4, this.e.getMeasuredHeight() + c(this.e));
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i6);
        if (a(this.f854b)) {
            max2 += a(this.f854b, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f854b.getMeasuredHeight() + c(this.f854b));
            i5 = View.combineMeasuredStates(i5, this.f854b.getMeasuredState());
        }
        if (a(this.i)) {
            max2 += a(this.i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.i.getMeasuredHeight() + c(this.i));
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((b) childAt.getLayoutParams()).f863b == 0 && a(childAt)) {
                i11 += a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + c(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (a(this.f)) {
            a(this.f, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f.getMeasuredWidth() + b(this.f);
            i9 = this.f.getMeasuredHeight() + c(this.f);
            i7 = View.combineMeasuredStates(i5, this.f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (a(this.g)) {
            i8 = Math.max(i8, a(this.g, i, i11 + i14, i2, i9 + i13, iArr));
            i9 += this.g.getMeasuredHeight() + c(this.g);
            i7 = View.combineMeasuredStates(i7, this.g.getMeasuredState());
        }
        int max3 = Math.max(i10, i9);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (m()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa A[LOOP:0: B:104:0x02a8->B:105:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cc A[LOOP:1: B:107:0x02ca->B:108:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0306 A[LOOP:2: B:116:0x0304->B:117:0x0306, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            b bVar = (b) view.getLayoutParams();
            int i6 = bVar.leftMargin - i;
            int i7 = bVar.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i = max3;
        }
        return i5;
    }

    private int a(View view, int i, int[] iArr, int i2) {
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + bVar.rightMargin;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        b bVar = (b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + bVar.leftMargin);
    }

    private int a(View view, int i) {
        b bVar = (b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int a2 = a(bVar.f699a);
        if (a2 != 48) {
            if (a2 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            if (i3 < bVar.topMargin) {
                i3 = bVar.topMargin;
            } else {
                int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                if (i4 < bVar.bottomMargin) {
                    i3 = Math.max(0, i3 - (bVar.bottomMargin - i4));
                }
            }
            return paddingTop + i3;
        }
        return getPaddingTop() - i2;
    }

    private int a(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.x & 112;
    }

    private void a(List<View> list, int i) {
        boolean z = android.support.v4.j.s.c(this) == 1;
        int childCount = getChildCount();
        int a2 = android.support.v4.j.e.a(i, android.support.v4.j.s.c(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.f863b == 0 && a(childAt) && b(bVar.f699a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (bVar2.f863b == 0 && a(childAt2) && b(bVar2.f699a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i) {
        int c2 = android.support.v4.j.s.c(this);
        int a2 = android.support.v4.j.e.a(i, c2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : c2 == 1 ? 5 : 3;
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return android.support.v4.j.g.a(marginLayoutParams) + android.support.v4.j.g.b(marginLayoutParams);
    }

    private int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof a.C0021a) {
            return new b((a.C0021a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public t getWrapper() {
        if (this.I == null) {
            this.I = new an(this, true);
        }
        return this.I;
    }

    void f() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((b) childAt.getLayoutParams()).f863b != 2 && childAt != this.e) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    void g() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    private boolean d(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.N = z;
        requestLayout();
    }

    private void n() {
        if (this.u == null) {
            this.u = new ad();
        }
    }

    android.support.v7.widget.d getOuterActionMenuPresenter() {
        return this.J;
    }

    Context getPopupContext() {
        return this.l;
    }

    /* loaded from: classes.dex */
    public static class b extends a.C0021a {

        /* renamed from: b  reason: collision with root package name */
        int f863b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f863b = 0;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.f863b = 0;
            this.f699a = 8388627;
        }

        public b(b bVar) {
            super((a.C0021a) bVar);
            this.f863b = 0;
            this.f863b = bVar.f863b;
        }

        public b(a.C0021a c0021a) {
            super(c0021a);
            this.f863b = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f863b = 0;
            a(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f863b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends android.support.v4.j.a {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.ClassLoaderCreator<d>() { // from class: android.support.v7.widget.Toolbar.d.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d[] newArray(int i) {
                return new d[i];
            }
        };

        /* renamed from: b  reason: collision with root package name */
        int f864b;

        /* renamed from: c  reason: collision with root package name */
        boolean f865c;

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f864b = parcel.readInt();
            this.f865c = parcel.readInt() != 0;
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.v4.j.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f864b);
            parcel.writeInt(this.f865c ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements android.support.v7.view.menu.m {

        /* renamed from: a  reason: collision with root package name */
        android.support.v7.view.menu.g f860a;

        /* renamed from: b  reason: collision with root package name */
        android.support.v7.view.menu.h f861b;

        @Override // android.support.v7.view.menu.m
        public void a(android.support.v7.view.menu.g gVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.m
        public void a(m.a aVar) {
        }

        @Override // android.support.v7.view.menu.m
        public boolean a(android.support.v7.view.menu.s sVar) {
            return false;
        }

        @Override // android.support.v7.view.menu.m
        public boolean b() {
            return false;
        }

        a() {
        }

        @Override // android.support.v7.view.menu.m
        public void a(Context context, android.support.v7.view.menu.g gVar) {
            if (this.f860a != null && this.f861b != null) {
                this.f860a.d(this.f861b);
            }
            this.f860a = gVar;
        }

        @Override // android.support.v7.view.menu.m
        public void b(boolean z) {
            if (this.f861b != null) {
                boolean z2 = false;
                if (this.f860a != null) {
                    int size = this.f860a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f860a.getItem(i) == this.f861b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                b(this.f860a, this.f861b);
            }
        }

        @Override // android.support.v7.view.menu.m
        public boolean a(android.support.v7.view.menu.g gVar, android.support.v7.view.menu.h hVar) {
            Toolbar.this.d();
            ViewParent parent = Toolbar.this.f853a.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.f853a);
                }
                Toolbar.this.addView(Toolbar.this.f853a);
            }
            Toolbar.this.f854b = hVar.getActionView();
            this.f861b = hVar;
            ViewParent parent2 = Toolbar.this.f854b.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.f854b);
                }
                b generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f699a = 8388611 | (Toolbar.this.f855c & 112);
                generateDefaultLayoutParams.f863b = 2;
                Toolbar.this.f854b.setLayoutParams(generateDefaultLayoutParams);
                Toolbar.this.addView(Toolbar.this.f854b);
            }
            Toolbar.this.f();
            Toolbar.this.requestLayout();
            hVar.e(true);
            if (Toolbar.this.f854b instanceof android.support.v7.view.b) {
                ((android.support.v7.view.b) Toolbar.this.f854b).a();
            }
            return true;
        }

        @Override // android.support.v7.view.menu.m
        public boolean b(android.support.v7.view.menu.g gVar, android.support.v7.view.menu.h hVar) {
            if (Toolbar.this.f854b instanceof android.support.v7.view.b) {
                ((android.support.v7.view.b) Toolbar.this.f854b).b();
            }
            Toolbar.this.removeView(Toolbar.this.f854b);
            Toolbar.this.removeView(Toolbar.this.f853a);
            Toolbar.this.f854b = null;
            Toolbar.this.g();
            this.f861b = null;
            Toolbar.this.requestLayout();
            hVar.e(false);
            return true;
        }
    }
}
