package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.baidu.mapapi.UIMsg;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class z implements android.support.v7.view.menu.q {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1033a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f1034b;
    private static Method h;
    private Drawable A;
    private AdapterView.OnItemClickListener B;
    private AdapterView.OnItemSelectedListener C;
    private final d D;
    private final c E;
    private final a F;
    private Runnable G;
    private final Rect H;
    private Rect I;
    private boolean J;

    /* renamed from: c  reason: collision with root package name */
    v f1035c;

    /* renamed from: d  reason: collision with root package name */
    int f1036d;
    final e e;
    final Handler f;
    PopupWindow g;
    private Context i;
    private ListAdapter j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private View w;
    private int x;
    private DataSetObserver y;
    private View z;

    static {
        try {
            f1033a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f1034b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public z(Context context) {
        this(context, null, a.C0020a.listPopupWindowStyle);
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public z(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -2;
        this.l = -2;
        this.o = UIMsg.f_FUN.FUN_ID_MAP_OPTION;
        this.q = true;
        this.t = 0;
        this.u = false;
        this.v = false;
        this.f1036d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.x = 0;
        this.e = new e();
        this.D = new d();
        this.E = new c();
        this.F = new a();
        this.H = new Rect();
        this.i = context;
        this.f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.ListPopupWindow, i, i2);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.n != 0) {
            this.p = true;
        }
        obtainStyledAttributes.recycle();
        this.g = new n(context, attributeSet, i, i2);
        this.g.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        if (this.y == null) {
            this.y = new b();
        } else if (this.j != null) {
            this.j.unregisterDataSetObserver(this.y);
        }
        this.j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.y);
        }
        if (this.f1035c != null) {
            this.f1035c.setAdapter(this.j);
        }
    }

    public void a(int i) {
        this.x = i;
    }

    public void a(boolean z) {
        this.J = z;
        this.g.setFocusable(z);
    }

    public boolean g() {
        return this.J;
    }

    public Drawable h() {
        return this.g.getBackground();
    }

    public void a(Drawable drawable) {
        this.g.setBackgroundDrawable(drawable);
    }

    public void b(int i) {
        this.g.setAnimationStyle(i);
    }

    public View i() {
        return this.z;
    }

    public void b(View view) {
        this.z = view;
    }

    public int j() {
        return this.m;
    }

    public void c(int i) {
        this.m = i;
    }

    public int k() {
        if (!this.p) {
            return 0;
        }
        return this.n;
    }

    public void d(int i) {
        this.n = i;
        this.p = true;
    }

    public void a(Rect rect) {
        this.I = rect;
    }

    public void e(int i) {
        this.t = i;
    }

    public int l() {
        return this.l;
    }

    public void f(int i) {
        this.l = i;
    }

    public void g(int i) {
        Drawable background = this.g.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            this.l = this.H.left + this.H.right + i;
            return;
        }
        f(i);
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.B = onItemClickListener;
    }

    @Override // android.support.v7.view.menu.q
    public void a() {
        int i;
        int i2;
        int f = f();
        boolean n = n();
        android.support.v4.widget.l.a(this.g, this.o);
        boolean z = true;
        if (this.g.isShowing()) {
            if (!android.support.v4.j.s.q(i())) {
                return;
            }
            if (this.l == -1) {
                i2 = -1;
            } else if (this.l == -2) {
                i2 = i().getWidth();
            } else {
                i2 = this.l;
            }
            if (this.k == -1) {
                if (!n) {
                    f = -1;
                }
                if (n) {
                    this.g.setWidth(this.l == -1 ? -1 : 0);
                    this.g.setHeight(0);
                } else {
                    this.g.setWidth(this.l == -1 ? -1 : 0);
                    this.g.setHeight(-1);
                }
            } else if (this.k != -2) {
                f = this.k;
            }
            PopupWindow popupWindow = this.g;
            if (this.v || this.u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.g.update(i(), this.m, this.n, i2 < 0 ? -1 : i2, f < 0 ? -1 : f);
            return;
        }
        if (this.l == -1) {
            i = -1;
        } else if (this.l == -2) {
            i = i().getWidth();
        } else {
            i = this.l;
        }
        if (this.k == -1) {
            f = -1;
        } else if (this.k != -2) {
            f = this.k;
        }
        this.g.setWidth(i);
        this.g.setHeight(f);
        c(true);
        this.g.setOutsideTouchable(!this.v && !this.u);
        this.g.setTouchInterceptor(this.D);
        if (this.s) {
            android.support.v4.widget.l.a(this.g, this.r);
        }
        if (h != null) {
            try {
                h.invoke(this.g, this.I);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        android.support.v4.widget.l.a(this.g, i(), this.m, this.n, this.t);
        this.f1035c.setSelection(-1);
        if (!this.J || this.f1035c.isInTouchMode()) {
            m();
        }
        if (this.J) {
            return;
        }
        this.f.post(this.F);
    }

    @Override // android.support.v7.view.menu.q
    public void c() {
        this.g.dismiss();
        b();
        this.g.setContentView(null);
        this.f1035c = null;
        this.f.removeCallbacks(this.e);
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.g.setOnDismissListener(onDismissListener);
    }

    private void b() {
        if (this.w != null) {
            ViewParent parent = this.w.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(this.w);
        }
    }

    public void h(int i) {
        this.g.setInputMethodMode(i);
    }

    public void i(int i) {
        v vVar = this.f1035c;
        if (!d() || vVar == null) {
            return;
        }
        vVar.setListSelectionHidden(false);
        vVar.setSelection(i);
        if (vVar.getChoiceMode() == 0) {
            return;
        }
        vVar.setItemChecked(i, true);
    }

    public void m() {
        v vVar = this.f1035c;
        if (vVar != null) {
            vVar.setListSelectionHidden(true);
            vVar.requestLayout();
        }
    }

    @Override // android.support.v7.view.menu.q
    public boolean d() {
        return this.g.isShowing();
    }

    public boolean n() {
        return this.g.getInputMethodMode() == 2;
    }

    @Override // android.support.v7.view.menu.q
    public ListView e() {
        return this.f1035c;
    }

    v a(Context context, boolean z) {
        return new v(context, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int f() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        int i4;
        boolean z = true;
        if (this.f1035c == null) {
            Context context = this.i;
            this.G = new Runnable() { // from class: android.support.v7.widget.z.1
                @Override // java.lang.Runnable
                public void run() {
                    View i5 = z.this.i();
                    if (i5 == null || i5.getWindowToken() == null) {
                        return;
                    }
                    z.this.a();
                }
            };
            this.f1035c = a(context, !this.J);
            if (this.A != null) {
                this.f1035c.setSelector(this.A);
            }
            this.f1035c.setAdapter(this.j);
            this.f1035c.setOnItemClickListener(this.B);
            this.f1035c.setFocusable(true);
            this.f1035c.setFocusableInTouchMode(true);
            this.f1035c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.z.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j) {
                    v vVar;
                    if (i5 == -1 || (vVar = z.this.f1035c) == null) {
                        return;
                    }
                    vVar.setListSelectionHidden(false);
                }
            });
            this.f1035c.setOnScrollListener(this.E);
            if (this.C != null) {
                this.f1035c.setOnItemSelectedListener(this.C);
            }
            v vVar = this.f1035c;
            View view = this.w;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.x) {
                    case 0:
                        linearLayout.addView(view);
                        linearLayout.addView(vVar, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(vVar, layoutParams);
                        linearLayout.addView(view);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.x);
                        break;
                }
                if (this.l >= 0) {
                    i3 = this.l;
                    i4 = PKIFailureInfo.systemUnavail;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i3, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                vVar = linearLayout;
            } else {
                i = 0;
            }
            this.g.setContentView(vVar);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.g.getContentView();
            View view2 = this.w;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.g.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            i2 = this.H.top + this.H.bottom;
            if (!this.p) {
                this.n = -this.H.top;
            }
        } else {
            this.H.setEmpty();
            i2 = 0;
        }
        if (this.g.getInputMethodMode() != 2) {
            z = false;
        }
        int a2 = a(i(), this.n, z);
        if (this.u || this.k == -1) {
            return a2 + i2;
        }
        switch (this.l) {
            case UIMsg.UIOffType.MSG_OFFLINE_WIFICONNECT /* -2 */:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.H.left + this.H.right), PKIFailureInfo.systemUnavail);
                break;
            case -1:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - (this.H.left + this.H.right), 1073741824);
                break;
            default:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.l, 1073741824);
                break;
        }
        int a3 = this.f1035c.a(makeMeasureSpec, 0, -1, a2 - i, -1);
        if (a3 > 0) {
            i += i2 + this.f1035c.getPaddingTop() + this.f1035c.getPaddingBottom();
        }
        return a3 + i;
    }

    public void b(boolean z) {
        this.s = true;
        this.r = z;
    }

    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (z.this.d()) {
                z.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            z.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.this.f1035c == null || !android.support.v4.j.s.q(z.this.f1035c) || z.this.f1035c.getCount() <= z.this.f1035c.getChildCount() || z.this.f1035c.getChildCount() > z.this.f1036d) {
                return;
            }
            z.this.g.setInputMethodMode(2);
            z.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && z.this.g != null && z.this.g.isShowing() && x >= 0 && x < z.this.g.getWidth() && y >= 0 && y < z.this.g.getHeight()) {
                z.this.f.postDelayed(z.this.e, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                z.this.f.removeCallbacks(z.this.e);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || z.this.n() || z.this.g.getContentView() == null) {
                return;
            }
            z.this.f.removeCallbacks(z.this.e);
            z.this.e.run();
        }
    }

    private void c(boolean z) {
        if (f1033a != null) {
            try {
                f1033a.invoke(this.g, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int a(View view, int i, boolean z) {
        if (f1034b != null) {
            try {
                return ((Integer) f1034b.invoke(this.g, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.g.getMaxAvailableHeight(view, i);
    }
}
