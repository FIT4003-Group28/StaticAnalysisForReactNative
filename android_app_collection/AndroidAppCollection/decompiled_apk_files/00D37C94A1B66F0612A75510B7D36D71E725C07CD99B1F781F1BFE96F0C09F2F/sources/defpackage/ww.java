package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.youtube.R;
import java.lang.reflect.Method;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ww  reason: default package */
/* loaded from: classes4.dex */
public class ww implements sx {
    private static Method a;
    private static Method b;
    private static Method c;
    private final Rect A;
    private Rect B;
    private Context d;
    public vv e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    final Handler n;
    public boolean o;
    public PopupWindow p;
    final ws q;
    private ListAdapter r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final wv x;
    private final wu y;
    private final ws z;

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

    public ww(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (!this.v) {
            return 0;
        }
        return this.t;
    }

    public final Drawable c() {
        return this.p.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new wt(this);
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
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.setAdapter(this.r);
        }
    }

    public final void f(Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.t = i;
        this.v = true;
    }

    @Override // defpackage.sx
    public final ListView jA() {
        return this.e;
    }

    @Override // defpackage.sx
    public final void k() {
        this.p.dismiss();
        this.p.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.q);
    }

    public final int o() {
        if (!u()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }

    public vv p(Context context, boolean z) {
        return new vv(context, z);
    }

    public final void q() {
        vv vvVar = this.e;
        if (vvVar != null) {
            vvVar.a = true;
            vvVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.p.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        background.getPadding(this.A);
        this.f = this.A.left + this.A.right + i;
    }

    @Override // defpackage.sx
    public final void s() {
        int i;
        int maxAvailableHeight;
        int makeMeasureSpec;
        if (this.e == null) {
            Context context = this.d;
            new ws(this, 1);
            vv p = p(context, !this.o);
            this.e = p;
            p.setAdapter(this.r);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new wr(this));
            this.e.setOnScrollListener(this.y);
            this.p.setContentView(this.e);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.p.getContentView();
        }
        Drawable background = this.p.getBackground();
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
        boolean z = this.p.getInputMethodMode() == 2;
        View view = this.l;
        int i3 = this.t;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = b;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.p, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.p.getMaxAvailableHeight(view, i3);
        } else {
            maxAvailableHeight = this.p.getMaxAvailableHeight(view, i3, z);
        }
        if (this.s != -1) {
            int i4 = this.f;
            if (i4 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            } else if (i4 == -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.A.left + this.A.right), 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
            maxAvailableHeight = this.e.b(makeMeasureSpec, maxAvailableHeight);
            i = maxAvailableHeight > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        }
        int i5 = maxAvailableHeight + i;
        boolean x = x();
        kx.e(this.p, this.u);
        if (this.p.isShowing()) {
            if (!lj.aj(this.l)) {
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
                if (true != x) {
                    i5 = -1;
                }
                if (x) {
                    this.p.setWidth(this.f == -1 ? -1 : 0);
                    this.p.setHeight(0);
                } else {
                    PopupWindow popupWindow = this.p;
                    if (this.f == -1) {
                        i2 = -1;
                    }
                    popupWindow.setWidth(i2);
                    this.p.setHeight(-1);
                }
            } else if (i7 != -2) {
                i5 = i7;
            }
            this.p.setOutsideTouchable(true);
            this.p.update(this.l, this.g, this.t, i6 < 0 ? -1 : i6, i5 < 0 ? -1 : i5);
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
        this.p.setWidth(i8);
        this.p.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = a;
            if (method2 != null) {
                try {
                    method2.invoke(this.p, true);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.p.setIsClippedToScreen(true);
        }
        this.p.setOutsideTouchable(true);
        this.p.setTouchInterceptor(this.x);
        if (this.i) {
            kx.d(this.p, this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = c;
            if (method3 != null) {
                try {
                    method3.invoke(this.p, this.B);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.p.setEpicenterBounds(this.B);
        }
        nd.jB(this.p, this.l, this.g, this.t, this.j);
        this.e.setSelection(-1);
        if (!this.o || this.e.isInTouchMode()) {
            q();
        }
        if (this.o) {
            return;
        }
        this.n.post(this.z);
    }

    public final void t(Rect rect) {
        this.B = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.sx
    public final boolean u() {
        return this.p.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }

    public final void w(int i) {
        vv vvVar = this.e;
        if (!u() || vvVar == null) {
            return;
        }
        vvVar.a = false;
        vvVar.setSelection(i);
        if (vvVar.getChoiceMode() == 0) {
            return;
        }
        vvVar.setItemChecked(i, true);
    }

    public final boolean x() {
        return this.p.getInputMethodMode() == 2;
    }

    public final void y() {
        this.p.setInputMethodMode(2);
    }

    public final void z() {
        this.o = true;
        this.p.setFocusable(true);
    }

    public ww(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public ww(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.q = new ws(this, 2);
        this.x = new wv(this);
        this.y = new wu(this);
        this.z = new ws(this);
        this.A = new Rect();
        this.d = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pm.n, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        uh uhVar = new uh(context, attributeSet, i);
        this.p = uhVar;
        uhVar.setInputMethodMode(1);
    }
}
