package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j0 implements androidx.appcompat.view.menu.q {
    private static Method G;
    private static Method H;
    private static Method I;
    private final c A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b  reason: collision with root package name */
    private Context f1291b;

    /* renamed from: c  reason: collision with root package name */
    private ListAdapter f1292c;

    /* renamed from: d  reason: collision with root package name */
    f0 f1293d;

    /* renamed from: e  reason: collision with root package name */
    private int f1294e;

    /* renamed from: f  reason: collision with root package name */
    private int f1295f;

    /* renamed from: g  reason: collision with root package name */
    private int f1296g;

    /* renamed from: h  reason: collision with root package name */
    private int f1297h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final g x;
    private final f y;
    private final e z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View i = j0.this.i();
            if (i == null || i.getWindowToken() == null) {
                return;
            }
            j0.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            f0 f0Var;
            if (i == -1 || (f0Var = j0.this.f1293d) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.h();
        }
    }

    /* loaded from: classes.dex */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.b()) {
                j0.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || j0.this.k() || j0.this.F.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.B.removeCallbacks(j0Var.x);
            j0.this.x.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.F.getWidth() && y >= 0 && y < j0.this.F.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.B.postDelayed(j0Var.x, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.B.removeCallbacks(j0Var2.x);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f1293d;
            if (f0Var == null || !a.g.m.v.H(f0Var) || j0.this.f1293d.getCount() <= j0.this.f1293d.getChildCount()) {
                return;
            }
            int childCount = j0.this.f1293d.getChildCount();
            j0 j0Var = j0.this;
            if (childCount > j0Var.p) {
                return;
            }
            j0Var.F.setInputMethodMode(2);
            j0.this.c();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1294e = -2;
        this.f1295f = -2;
        this.i = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new g();
        this.y = new f();
        this.z = new e();
        this.A = new c();
        this.C = new Rect();
        this.f1291b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a.j.ListPopupWindow, i, i2);
        this.f1296g = obtainStyledAttributes.getDimensionPixelOffset(a.a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1297h = obtainStyledAttributes.getDimensionPixelOffset(a.a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1297h != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        this.F = new q(context, attributeSet, i, i2);
        this.F.setInputMethodMode(1);
    }

    private int a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.F.getMaxAvailableHeight(view, i);
        }
        return this.F.getMaxAvailableHeight(view, i, z);
    }

    private void c(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setIsClippedToScreen(z);
            return;
        }
        Method method = G;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this.F, Boolean.valueOf(z));
        } catch (Exception unused) {
            Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.m():int");
    }

    private void n() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(this.q);
        }
    }

    public int a() {
        return this.f1296g;
    }

    f0 a(Context context, boolean z) {
        return new f0(context, z);
    }

    public void a(int i) {
        this.f1297h = i;
        this.j = true;
    }

    public void a(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void a(View view) {
        this.t = view;
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new d();
        } else {
            ListAdapter listAdapter2 = this.f1292c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1292c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        f0 f0Var = this.f1293d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1292c);
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void a(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void b(boolean z) {
        this.l = true;
        this.k = z;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean b() {
        return this.F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.q
    public void c() {
        int m = m();
        boolean k = k();
        androidx.core.widget.h.a(this.F, this.i);
        boolean z = true;
        if (this.F.isShowing()) {
            if (!a.g.m.v.H(i())) {
                return;
            }
            int i = this.f1295f;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = i().getWidth();
            }
            int i2 = this.f1294e;
            if (i2 == -1) {
                if (!k) {
                    m = -1;
                }
                if (k) {
                    this.F.setWidth(this.f1295f == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f1295f == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i2 != -2) {
                m = i2;
            }
            PopupWindow popupWindow = this.F;
            if (this.o || this.n) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.F.update(i(), this.f1296g, this.f1297h, i < 0 ? -1 : i, m < 0 ? -1 : m);
            return;
        }
        int i3 = this.f1295f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = i().getWidth();
        }
        int i4 = this.f1294e;
        if (i4 == -1) {
            m = -1;
        } else if (i4 != -2) {
            m = i4;
        }
        this.F.setWidth(i3);
        this.F.setHeight(m);
        c(true);
        this.F.setOutsideTouchable(!this.o && !this.n);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            androidx.core.widget.h.a(this.F, this.k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.h.a(this.F, i(), this.f1296g, this.f1297h, this.m);
        this.f1293d.setSelection(-1);
        if (!this.E || this.f1293d.isInTouchMode()) {
            h();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    public void c(int i) {
        this.f1296g = i;
    }

    public Drawable d() {
        return this.F.getBackground();
    }

    public void d(int i) {
        this.F.setAnimationStyle(i);
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.F.dismiss();
        n();
        this.F.setContentView(null);
        this.f1293d = null;
        this.B.removeCallbacks(this.x);
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView e() {
        return this.f1293d;
    }

    public void e(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            j(i);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f1295f = rect.left + rect.right + i;
    }

    public int f() {
        if (!this.j) {
            return 0;
        }
        return this.f1297h;
    }

    public void f(int i) {
        this.m = i;
    }

    public void g(int i) {
        this.F.setInputMethodMode(i);
    }

    public void h() {
        f0 f0Var = this.f1293d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    public void h(int i) {
        this.r = i;
    }

    public View i() {
        return this.t;
    }

    public void i(int i) {
        f0 f0Var = this.f1293d;
        if (!b() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i);
        if (f0Var.getChoiceMode() == 0) {
            return;
        }
        f0Var.setItemChecked(i, true);
    }

    public int j() {
        return this.f1295f;
    }

    public void j(int i) {
        this.f1295f = i;
    }

    public boolean k() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean l() {
        return this.E;
    }
}
