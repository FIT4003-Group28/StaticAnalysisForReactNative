package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: mxt  reason: default package */
/* loaded from: classes3.dex */
public abstract class mxt extends mww {
    public final wwk d;
    protected final xjk e;
    protected final View f;
    public final View g;
    protected final View h;
    protected final View i;
    protected final View j;
    public long k;
    private final Context l;
    private final wxc m;
    private final boolean n;

    public mxt(Context context, aafo aafoVar, wxc wxcVar, wwk wwkVar, tjv tjvVar, enm enmVar, View view, View view2, View view3, View view4, View view5, View view6, boolean z) {
        super(aafoVar, tjvVar, enmVar, view4);
        this.l = context;
        this.m = wxcVar;
        this.d = wwkVar;
        view.getClass();
        this.f = view;
        view2.getClass();
        this.g = view2;
        view3.getClass();
        this.j = view3;
        this.h = view5;
        this.i = view6;
        this.n = z;
        xjk xjkVar = new xjk(view2, new mxq(this), new mxr(this), new View.OnTouchListener() { // from class: mxo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view7, MotionEvent motionEvent) {
                mxt.this.d.b.g(motionEvent);
                return false;
            }
        }, new mxs(this));
        this.e = xjkVar;
        xjkVar.b(view3, false);
        if (view5 != null) {
            xjkVar.b(view5, true);
        }
        if (view6 != null) {
            xjkVar.b(view6, true);
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mxn
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                mxt mxtVar = mxt.this;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                mxtVar.k(mxtVar.j, mxtVar.g);
            }
        });
    }

    public static frf h(Context context) {
        Resources resources = context.getResources();
        int orElse = zhn.j(context, R.attr.adSeparator1).orElse(0);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.line_separator_height);
        TypedValue typedValue = new TypedValue();
        return new frf(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? akf.a(context, typedValue.resourceId) : null, orElse, dimensionPixelSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final mxu i() {
        return (mxu) this.a.c(this.c, mxu.class, "PSPState", new enl() { // from class: mxp
            @Override // defpackage.enl
            public final Object a() {
                return new mxu(mxt.this.k);
            }
        }, this.b);
    }

    public final List j(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(this.g);
        arrayList.remove(this.j);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void k(View view, View view2);

    public abstract void l(View view, MotionEvent motionEvent, List list, boolean z);

    public abstract void m(View view, MotionEvent motionEvent, List list);

    public abstract void n(List list);

    public abstract void o();

    public final void p(acti actiVar, Object obj, String str, List list, long j, aozy aozyVar, byte[] bArr) {
        this.k = j;
        if (this.n) {
            xjk xjkVar = this.e;
            boolean a = nfj.a(this.l);
            if (xjkVar.g != a) {
                xjkVar.g = a;
                if (a) {
                    xjkVar.a.setOnClickListener(new xji(xjkVar));
                } else {
                    xjkVar.a.setOnClickListener(new xji(xjkVar, 1));
                }
                if (xjkVar.g) {
                    for (View view : xjkVar.c) {
                        view.setOnTouchListener(null);
                        view.setClickable(true);
                        view.setOnClickListener(new xji(xjkVar));
                    }
                } else {
                    for (View view2 : xjkVar.c) {
                        view2.setOnClickListener(null);
                        view2.setClickable(false);
                        view2.setOnTouchListener(new xjj(xjkVar, 1));
                    }
                }
            }
        }
        super.d(actiVar, obj, str, list, aozyVar, bArr);
        mxu i = i();
        if (i.b == 0) {
            i.b = System.currentTimeMillis();
        }
    }

    public final void q(apzg apzgVar) {
        Object obj = this.b;
        if (obj == null || this.m.d(obj)) {
            return;
        }
        mxu i = i();
        long j = i.b;
        if (j <= 0 || j + i.a > System.currentTimeMillis()) {
            return;
        }
        g(apzgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(List list) {
        View view = this.h;
        if (view == null || !list.contains(view)) {
            View view2 = this.i;
            return view2 != null && list.contains(view2);
        }
        return true;
    }

    protected abstract boolean s();

    public final boolean t(List list) {
        if (list.contains(this.j) || s()) {
            return true;
        }
        AccessibilityManager a = zdg.a(this.l);
        return a != null && a.isEnabled();
    }

    public boolean u(View view, List list) {
        View view2;
        if (r(list)) {
            View view3 = this.h;
            View.OnClickListener onClickListener = null;
            if (view3 == null || view3.getVisibility() != 0) {
                View view4 = this.i;
                view2 = (view4 == null || view4.getVisibility() != 0) ? null : this.i;
            } else {
                view2 = this.h;
            }
            if (view2 == null) {
                return true;
            }
            Object tag = view2.getTag(R.id.innertube_menu_anchor_on_click_listener);
            if (tag instanceof View.OnClickListener) {
                onClickListener = (View.OnClickListener) tag;
            }
            if (!this.n || onClickListener == null) {
                view2.performClick();
                return true;
            }
            onClickListener.onClick(view2);
            return true;
        }
        return false;
    }

    public boolean v(List list) {
        return false;
    }
}
