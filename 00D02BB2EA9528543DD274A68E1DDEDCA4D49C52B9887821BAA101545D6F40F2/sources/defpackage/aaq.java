package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: aaq  reason: default package */
/* loaded from: classes2.dex */
public class aaq implements vx {
    private static Method a;
    private static Method b;
    private static Method c;
    private final Rect A;
    private Rect B;
    private Context d;
    public zh e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    final aap n;
    final Handler o;
    public boolean p;
    public PopupWindow q;
    private ListAdapter r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final aao x;
    private final aan y;
    private final aal z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public aaq(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    @Override // defpackage.vx
    public final void MY() {
        int i;
        int maxAvailableHeight;
        int makeMeasureSpec;
        if (this.e == null) {
            Context context = this.d;
            new aaj(this);
            zh w = w(context, !this.p);
            this.e = w;
            w.setAdapter(this.r);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new aak(this));
            this.e.setOnScrollListener(this.y);
            this.q.setContentView(this.e);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.q.getContentView();
        }
        Drawable background = this.q.getBackground();
        int i2 = 0;
        if (background != null) {
            background.getPadding(this.A);
            i = this.A.top + this.A.bottom;
            if (!this.v) {
                this.t = -this.A.top;
            }
        } else {
            this.A.setEmpty();
            i = 0;
        }
        boolean z = this.q.getInputMethodMode() == 2;
        View view = this.l;
        int i3 = this.t;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = b;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.q, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.q.getMaxAvailableHeight(view, i3);
        } else {
            maxAvailableHeight = this.q.getMaxAvailableHeight(view, i3, z);
        }
        if (this.s != -1) {
            int i4 = this.f;
            if (i4 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), Integer.MIN_VALUE);
            } else if (i4 == -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
            maxAvailableHeight = this.e.b(makeMeasureSpec, maxAvailableHeight);
            i = maxAvailableHeight > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        }
        int i5 = maxAvailableHeight + i;
        boolean u = u();
        qc.b(this.q, this.u);
        if (this.q.isShowing()) {
            if (!od.ak(this.l)) {
                return;
            }
            int i6 = this.f;
            if (i6 == -1) {
                i6 = -1;
            } else if (i6 == -2) {
                i6 = this.l.getWidth();
            }
            int i7 = this.s;
            if (i7 == -1) {
                if (true != u) {
                    i5 = -1;
                }
                if (u) {
                    this.q.setWidth(this.f == -1 ? -1 : 0);
                    this.q.setHeight(0);
                } else {
                    PopupWindow popupWindow = this.q;
                    if (this.f == -1) {
                        i2 = -1;
                    }
                    popupWindow.setWidth(i2);
                    this.q.setHeight(-1);
                }
            } else if (i7 != -2) {
                i5 = i7;
            }
            this.q.setOutsideTouchable(true);
            this.q.update(this.l, this.g, this.t, i6 < 0 ? -1 : i6, i5 < 0 ? -1 : i5);
            return;
        }
        int i8 = this.f;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.l.getWidth();
        }
        int i9 = this.s;
        if (i9 == -1) {
            i5 = -1;
        } else if (i9 != -2) {
            i5 = i9;
        }
        this.q.setWidth(i8);
        this.q.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = a;
            if (method2 != null) {
                try {
                    method2.invoke(this.q, true);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.q.setIsClippedToScreen(true);
        }
        this.q.setOutsideTouchable(true);
        this.q.setTouchInterceptor(this.x);
        if (this.i) {
            qc.a(this.q, this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = c;
            if (method3 != null) {
                try {
                    method3.invoke(this.q, this.B);
                } catch (Exception unused3) {
                }
            }
        } else {
            this.q.setEpicenterBounds(this.B);
        }
        this.q.showAsDropDown(this.l, this.g, this.t, this.j);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            t();
        }
        if (this.p) {
            return;
        }
        this.o.post(this.z);
    }

    public void MZ(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new aam(this);
        } else {
            ListAdapter listAdapter2 = this.r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        zh zhVar = this.e;
        if (zhVar != null) {
            zhVar.setAdapter(this.r);
        }
    }

    public final void e(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void f(int i) {
        this.t = i;
        this.v = true;
    }

    public final void g(int i) {
        this.g = i;
    }

    public final Drawable h() {
        return this.q.getBackground();
    }

    public final int i() {
        if (!this.v) {
            return 0;
        }
        return this.t;
    }

    public final int j() {
        return this.g;
    }

    @Override // defpackage.vx
    public final void k() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.n);
    }

    @Override // defpackage.vx
    public final boolean m() {
        return this.q.isShowing();
    }

    public final void p(Rect rect) {
        this.B = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.vx
    public final ListView q() {
        return this.e;
    }

    public final void r(int i) {
        Drawable background = this.q.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        background.getPadding(this.A);
        this.f = this.A.left + this.A.right + i;
    }

    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final void t() {
        zh zhVar = this.e;
        if (zhVar != null) {
            zhVar.a = true;
            zhVar.requestLayout();
        }
    }

    public final boolean u() {
        return this.q.getInputMethodMode() == 2;
    }

    public final int v() {
        if (!m()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }

    public zh w(Context context, boolean z) {
        return new zh(context, z);
    }

    public final void x() {
        this.q.setInputMethodMode(2);
    }

    public final void y() {
        this.p = true;
        this.q.setFocusable(true);
    }

    public aaq(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.n = new aap(this);
        this.x = new aao(this);
        this.y = new aan(this);
        this.z = new aal(this);
        this.A = new Rect();
        this.d = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sj.n, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        xo xoVar = new xo(context, attributeSet, i);
        this.q = xoVar;
        xoVar.setInputMethodMode(1);
    }
}
