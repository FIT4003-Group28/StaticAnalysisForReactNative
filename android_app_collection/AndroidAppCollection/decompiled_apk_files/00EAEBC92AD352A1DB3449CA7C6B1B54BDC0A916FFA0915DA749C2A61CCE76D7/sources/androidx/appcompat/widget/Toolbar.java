package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private y0 J;
    private androidx.appcompat.widget.c K;
    private d L;
    private n.a M;
    private g.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    private ActionMenuView f1164b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1165c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1166d;

    /* renamed from: e  reason: collision with root package name */
    private ImageButton f1167e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f1168f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1169g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f1170h;
    ImageButton i;
    View j;
    private Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private o0 u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.n {

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1174b;

        /* renamed from: c  reason: collision with root package name */
        androidx.appcompat.view.menu.j f1175c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1174b;
            if (gVar2 != null && (jVar = this.f1175c) != null) {
                gVar2.a(jVar);
            }
            this.f1174b = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void a(boolean z) {
            if (this.f1175c != null) {
                androidx.appcompat.view.menu.g gVar = this.f1174b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1174b.getItem(i) == this.f1175c) {
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
                a(this.f1174b, this.f1175c);
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean a(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            View view = Toolbar.this.j;
            if (view instanceof a.a.o.c) {
                ((a.a.o.c) view).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f1175c = null;
            Toolbar.this.requestLayout();
            jVar.a(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean a(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean b(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = jVar.getActionView();
            this.f1175c = jVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f893a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.f1177b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.j();
            Toolbar.this.requestLayout();
            jVar.a(true);
            View view = Toolbar.this.j;
            if (view instanceof a.a.o.c) {
                ((a.a.o.c) view).b();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0040a {

        /* renamed from: b  reason: collision with root package name */
        int f1177b;

        public e(int i, int i2) {
            super(i, i2);
            this.f1177b = 0;
            this.f893a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1177b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1177b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1177b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0040a c0040a) {
            super(c0040a);
            this.f1177b = 0;
        }

        public e(e eVar) {
            super((a.C0040a) eVar);
            this.f1177b = 0;
            this.f1177b = eVar.f1177b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends a.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        int f1178d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1179e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public g mo54createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: createFromParcel */
            public g mo55createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public g[] mo56newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1178d = parcel.readInt();
            this.f1179e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1178d);
            parcel.writeInt(this.f1179e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        x0 a2 = x0.a(getContext(), attributeSet, a.a.j.Toolbar, i, 0);
        this.m = a2.g(a.a.j.Toolbar_titleTextAppearance, 0);
        this.n = a2.g(a.a.j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.e(a.a.j.Toolbar_android_gravity, this.x);
        this.o = a2.e(a.a.j.Toolbar_buttonGravity, 48);
        int b2 = a2.b(a.a.j.Toolbar_titleMargin, 0);
        b2 = a2.g(a.a.j.Toolbar_titleMargins) ? a2.b(a.a.j.Toolbar_titleMargins, b2) : b2;
        this.t = b2;
        this.s = b2;
        this.r = b2;
        this.q = b2;
        int b3 = a2.b(a.a.j.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.q = b3;
        }
        int b4 = a2.b(a.a.j.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.r = b4;
        }
        int b5 = a2.b(a.a.j.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.s = b5;
        }
        int b6 = a2.b(a.a.j.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.t = b6;
        }
        this.p = a2.c(a.a.j.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(a.a.j.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int b8 = a2.b(a.a.j.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int c2 = a2.c(a.a.j.Toolbar_contentInsetLeft, 0);
        int c3 = a2.c(a.a.j.Toolbar_contentInsetRight, 0);
        l();
        this.u.a(c2, c3);
        if (b7 != Integer.MIN_VALUE || b8 != Integer.MIN_VALUE) {
            this.u.b(b7, b8);
        }
        this.v = a2.b(a.a.j.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.w = a2.b(a.a.j.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.f1169g = a2.b(a.a.j.Toolbar_collapseIcon);
        this.f1170h = a2.e(a.a.j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(a.a.j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(a.a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.k = getContext();
        setPopupTheme(a2.g(a.a.j.Toolbar_popupTheme, 0));
        Drawable b9 = a2.b(a.a.j.Toolbar_navigationIcon);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence e4 = a2.e(a.a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b10 = a2.b(a.a.j.Toolbar_logo);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence e5 = a2.e(a.a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.g(a.a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(a.a.j.Toolbar_titleTextColor));
        }
        if (a2.g(a.a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(a.a.j.Toolbar_subtitleTextColor));
        }
        if (a2.g(a.a.j.Toolbar_menu)) {
            a(a2.g(a.a.j.Toolbar_menu, 0));
        }
        a2.a();
    }

    private int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a.g.m.g.b(marginLayoutParams) + a.g.m.g.a(marginLayoutParams);
    }

    private int a(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c2 = c(eVar.f893a);
        if (c2 != 48) {
            if (c2 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            if (i3 < i4) {
                i3 = i4;
            } else {
                int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (i5 < i6) {
                    i3 = Math.max(0, i3 - (i6 - i5));
                }
            }
            return paddingTop + i3;
        }
        return getPaddingTop() - i2;
    }

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int a(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = list.get(i5);
            e eVar = (e) view.getLayoutParams();
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i4;
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = max4;
            i4 = max3;
        }
        return i6;
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f1177b = 1;
        if (!z || this.j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.F.add(view);
    }

    private void a(List<View> list, int i) {
        boolean z = a.g.m.v.p(this) == 1;
        int childCount = getChildCount();
        int a2 = a.g.m.d.a(i, a.g.m.v.p(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1177b == 0 && d(childAt) && b(eVar.f893a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1177b == 0 && d(childAt2) && b(eVar2.f893a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int b(int i) {
        int p = a.g.m.v.p(this);
        int a2 = a.g.m.d.a(i, p) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : p == 1 ? 5 : 3;
    }

    private int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.x & 112;
    }

    private boolean c(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new a.a.o.g(getContext());
    }

    private void l() {
        if (this.u == null) {
            this.u = new o0();
        }
    }

    private void m() {
        if (this.f1168f == null) {
            this.f1168f = new o(getContext());
        }
    }

    private void n() {
        o();
        if (this.f1164b.j() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1164b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f1164b.setExpandedActionViewsExclusive(true);
            gVar.a(this.L, this.k);
        }
    }

    private void o() {
        if (this.f1164b == null) {
            this.f1164b = new ActionMenuView(getContext());
            this.f1164b.setPopupTheme(this.l);
            this.f1164b.setOnMenuItemClickListener(this.I);
            this.f1164b.a(this.M, this.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f893a = 8388613 | (this.o & 112);
            this.f1164b.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.f1164b, false);
        }
    }

    private void p() {
        if (this.f1167e == null) {
            this.f1167e = new m(getContext(), null, a.a.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f893a = 8388611 | (this.o & 112);
            this.f1167e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private void q() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean r() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public void a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void a(int i, int i2) {
        l();
        this.u.b(i, i2);
    }

    public void a(Context context, int i) {
        this.n = i;
        TextView textView = this.f1166d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void a(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f1164b == null) {
            return;
        }
        o();
        androidx.appcompat.view.menu.g j = this.f1164b.j();
        if (j == gVar) {
            return;
        }
        if (j != null) {
            j.b(this.K);
            j.b(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        cVar.b(true);
        if (gVar != null) {
            gVar.a(cVar, this.k);
            gVar.a(this.L, this.k);
        } else {
            cVar.a(this.k, (androidx.appcompat.view.menu.g) null);
            this.L.a(this.k, (androidx.appcompat.view.menu.g) null);
            cVar.a(true);
            this.L.a(true);
        }
        this.f1164b.setPopupTheme(this.l);
        this.f1164b.setPresenter(cVar);
        this.K = cVar;
    }

    public void a(n.a aVar, g.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f1164b;
        if (actionMenuView != null) {
            actionMenuView.a(aVar, aVar2);
        }
    }

    public void b(Context context, int i) {
        this.m = i;
        TextView textView = this.f1165c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public boolean b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1164b) != null && actionMenuView.i();
    }

    public void c() {
        d dVar = this.L;
        androidx.appcompat.view.menu.j jVar = dVar == null ? null : dVar.f1175c;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        ActionMenuView actionMenuView = this.f1164b;
        if (actionMenuView != null) {
            actionMenuView.d();
        }
    }

    void e() {
        if (this.i == null) {
            this.i = new m(getContext(), null, a.a.a.toolbarNavigationButtonStyle);
            this.i.setImageDrawable(this.f1169g);
            this.i.setContentDescription(this.f1170h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f893a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.f1177b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public boolean f() {
        d dVar = this.L;
        return (dVar == null || dVar.f1175c == null) ? false : true;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f1164b;
        return actionMenuView != null && actionMenuView.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0040a ? new e((a.C0040a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g j;
        ActionMenuView actionMenuView = this.f1164b;
        return actionMenuView != null && (j = actionMenuView.j()) != null && j.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return a.g.m.v.p(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return a.g.m.v.p(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1168f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1168f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        n();
        return this.f1164b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1167e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1167e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        n();
        return this.f1164b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    final TextView getSubtitleTextView() {
        return this.f1166d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    final TextView getTitleTextView() {
        return this.f1165c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new y0(this, true);
        }
        return this.J;
    }

    public boolean h() {
        ActionMenuView actionMenuView = this.f1164b;
        return actionMenuView != null && actionMenuView.g();
    }

    public boolean i() {
        ActionMenuView actionMenuView = this.f1164b;
        return actionMenuView != null && actionMenuView.h();
    }

    void j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1177b != 2 && childAt != this.f1164b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public boolean k() {
        ActionMenuView actionMenuView = this.f1164b;
        return actionMenuView != null && actionMenuView.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c A[LOOP:0: B:109:0x029a->B:110:0x029c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02be A[LOOP:1: B:112:0x02bc->B:113:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f8 A[LOOP:2: B:121:0x02f6->B:122:0x02f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
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
        if (d1.a(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (d(this.f1167e)) {
            a(this.f1167e, i, 0, i2, 0, this.p);
            i3 = this.f1167e.getMeasuredWidth() + a(this.f1167e);
            i4 = Math.max(0, this.f1167e.getMeasuredHeight() + b(this.f1167e));
            i5 = View.combineMeasuredStates(0, this.f1167e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (d(this.i)) {
            a(this.i, i, 0, i2, 0, this.p);
            i3 = this.i.getMeasuredWidth() + a(this.i);
            i4 = Math.max(i4, this.i.getMeasuredHeight() + b(this.i));
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c2] = Math.max(0, currentContentInsetStart - i3);
        if (d(this.f1164b)) {
            a(this.f1164b, i, max, i2, 0, this.p);
            i6 = this.f1164b.getMeasuredWidth() + a(this.f1164b);
            i4 = Math.max(i4, this.f1164b.getMeasuredHeight() + b(this.f1164b));
            i5 = View.combineMeasuredStates(i5, this.f1164b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i6);
        if (d(this.j)) {
            max2 += a(this.j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.j.getMeasuredHeight() + b(this.j));
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        if (d(this.f1168f)) {
            max2 += a(this.f1168f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1168f.getMeasuredHeight() + b(this.f1168f));
            i5 = View.combineMeasuredStates(i5, this.f1168f.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f1177b == 0 && d(childAt)) {
                i11 += a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + b(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (d(this.f1165c)) {
            a(this.f1165c, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f1165c.getMeasuredWidth() + a(this.f1165c);
            i9 = this.f1165c.getMeasuredHeight() + b(this.f1165c);
            i7 = View.combineMeasuredStates(i5, this.f1165c.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (d(this.f1166d)) {
            i8 = Math.max(i8, a(this.f1166d, i, i11 + i14, i2, i9 + i13, iArr));
            i9 += this.f1166d.getMeasuredHeight() + b(this.f1166d);
            i7 = View.combineMeasuredStates(i7, this.f1166d.getMeasuredState());
        }
        int max3 = Math.max(i10, i9);
        int paddingLeft = i11 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.j());
        ActionMenuView actionMenuView = this.f1164b;
        androidx.appcompat.view.menu.g j = actionMenuView != null ? actionMenuView.j() : null;
        int i = gVar.f1178d;
        if (i != 0 && this.L != null && j != null && (findItem = j.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (!gVar.f1179e) {
            return;
        }
        q();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        l();
        o0 o0Var = this.u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        o0Var.a(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (jVar = dVar.f1175c) != null) {
            gVar.f1178d = jVar.getItemId();
        }
        gVar.f1179e = i();
        return gVar;
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

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.a.k.a.a.c(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.i;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageDrawable(this.f1169g);
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setLogo(int i) {
        setLogo(a.a.k.a.a.c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!c(this.f1168f)) {
                a((View) this.f1168f, true);
            }
        } else {
            ImageView imageView = this.f1168f;
            if (imageView != null && c(imageView)) {
                removeView(this.f1168f);
                this.F.remove(this.f1168f);
            }
        }
        ImageView imageView2 = this.f1168f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageView imageView = this.f1168f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            p();
        }
        ImageButton imageButton = this.f1167e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.a.k.a.a.c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            p();
            if (!c(this.f1167e)) {
                a((View) this.f1167e, true);
            }
        } else {
            ImageButton imageButton = this.f1167e;
            if (imageButton != null && c(imageButton)) {
                removeView(this.f1167e);
                this.F.remove(this.f1167e);
            }
        }
        ImageButton imageButton2 = this.f1167e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        p();
        this.f1167e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        n();
        this.f1164b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1166d == null) {
                Context context = getContext();
                this.f1166d = new z(context);
                this.f1166d.setSingleLine();
                this.f1166d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.f1166d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1166d.setTextColor(colorStateList);
                }
            }
            if (!c(this.f1166d)) {
                a((View) this.f1166d, true);
            }
        } else {
            TextView textView = this.f1166d;
            if (textView != null && c(textView)) {
                removeView(this.f1166d);
                this.F.remove(this.f1166d);
            }
        }
        TextView textView2 = this.f1166d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f1166d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1165c == null) {
                Context context = getContext();
                this.f1165c = new z(context);
                this.f1165c.setSingleLine();
                this.f1165c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f1165c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1165c.setTextColor(colorStateList);
                }
            }
            if (!c(this.f1165c)) {
                a((View) this.f1165c, true);
            }
        } else {
            TextView textView = this.f1165c;
            if (textView != null && c(textView)) {
                removeView(this.f1165c);
                this.F.remove(this.f1165c);
            }
        }
        TextView textView2 = this.f1165c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1165c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
