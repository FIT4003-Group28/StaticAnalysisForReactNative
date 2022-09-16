package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: nck  reason: default package */
/* loaded from: classes3.dex */
public final class nck extends mxt {
    public Handler l;
    public final yni m;
    protected final nch n;
    protected final View o;
    protected final View.OnClickListener p;
    protected final ncg q;
    protected final ncj r;
    protected final fmr s;
    public nci t;
    private final Map u;
    private final Map v;
    private final wzg w;
    private final wzi x;
    private apnp y;

    public nck(Context context, aafo aafoVar, wxc wxcVar, wwk wwkVar, tjv tjvVar, enm enmVar, yni yniVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, View.OnClickListener onClickListener, ncg ncgVar, ncj ncjVar, nch nchVar) {
        this(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, view, view2, view3, view4, view5, view6, view7, null, onClickListener, ncgVar, ncjVar, nchVar, false);
    }

    private static int M(apno apnoVar, int i, float f) {
        if (apnoVar == null) {
            return 0;
        }
        if (i <= 0) {
            i = 1000;
        }
        return (int) ((apnoVar.c * i) + (apnoVar.b * f));
    }

    private final Object N(auib auibVar) {
        if (auibVar == auib.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN) {
            return this.n.g();
        }
        return this.n.d(A(auibVar));
    }

    private final boolean O(List list) {
        fmr fmrVar = this.s;
        return fmrVar != null && list.contains(fmrVar.a);
    }

    private static final boolean P(apno apnoVar) {
        return apnoVar == null || (apnoVar.b == 0 && apnoVar.c == 0.0f);
    }

    protected final Object A(auib auibVar) {
        return this.v.get(auibVar);
    }

    public final void B(View view, auib auibVar) {
        C(view, auibVar, false);
    }

    public final void C(View view, auib auibVar, boolean z) {
        view.getClass();
        this.u.put(view, auibVar);
        this.e.b(view, z);
    }

    protected final void D(Object obj, boolean z) {
        ncf w = w(obj, z);
        if (w.a) {
            w.c.run();
        } else {
            afus.b(2, 1, "Sparkles ad attempted default click behavior, but failed.");
        }
        ncg ncgVar = this.q;
        if (ncgVar != null) {
            ncgVar.a(w.b);
        }
    }

    public final void E(acti actiVar, Object obj, String str, auhs auhsVar, Object[] objArr, aozy aozyVar, byte[] bArr) {
        aopu aopuVar = auhsVar.k;
        apnp apnpVar = auhsVar.o;
        if (apnpVar == null) {
            apnpVar = apnp.a;
        }
        I(actiVar, obj, str, aopuVar, objArr, apnpVar, auhsVar.n, aozyVar, bArr);
    }

    public final void F(acti actiVar, Object obj, String str, auik auikVar, Object[] objArr, aozy aozyVar, byte[] bArr) {
        aopu aopuVar = auikVar.o;
        apnp apnpVar = auikVar.r;
        if (apnpVar == null) {
            apnpVar = apnp.a;
        }
        I(actiVar, obj, str, aopuVar, objArr, apnpVar, auikVar.q, aozyVar, bArr);
    }

    public final void G(acti actiVar, Object obj, String str, auil auilVar, Object[] objArr, aozy aozyVar, byte[] bArr) {
        aopu aopuVar = auilVar.r;
        apnp apnpVar = auilVar.u;
        if (apnpVar == null) {
            apnpVar = apnp.a;
        }
        I(actiVar, obj, str, aopuVar, objArr, apnpVar, auilVar.t, aozyVar, bArr);
    }

    public final void H(acti actiVar, Object obj, String str, auiy auiyVar, Object[] objArr, aozy aozyVar, byte[] bArr) {
        aopu aopuVar = auiyVar.m;
        apnp apnpVar = auiyVar.p;
        if (apnpVar == null) {
            apnpVar = apnp.a;
        }
        I(actiVar, obj, str, aopuVar, objArr, apnpVar, auiyVar.o, aozyVar, bArr);
    }

    public final void I(acti actiVar, Object obj, String str, List list, Object[] objArr, apnp apnpVar, long j, aozy aozyVar, byte[] bArr) {
        this.t = null;
        this.w.c();
        this.x.c();
        this.y = apnpVar;
        this.v.clear();
        this.n.h(this.v, objArr);
        super.p(actiVar, obj, str, list, j, aozyVar, bArr);
    }

    protected final void J(View view, MotionEvent motionEvent, boolean z, View view2) {
        Integer num;
        if (z) {
            num = y(auib.PROMOTED_SPARKLES_CLICK_LOCATION_BORDER);
        } else if (view2 == null || x(view2) == null) {
            afus.b(2, 1, "Sparkles ad received click, but did not have a mappable 'lastTouchedView'.");
            num = null;
        } else {
            num = y(x(view2));
        }
        if (num != null) {
            this.w.d(num.intValue());
        } else {
            this.w.c();
        }
        float f = view.getResources().getDisplayMetrics().density;
        this.x.d((int) (motionEvent.getX() / f), (int) (motionEvent.getY() / f));
    }

    public final void K(boolean z) {
        i().c = z;
    }

    public final boolean L() {
        return i().c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mww
    public final afzn[] f() {
        return (afzn[]) zew.O(super.f(), this.w, this.x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxt
    public final void k(View view, View view2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.y != null) {
            float f = this.f.getResources().getDisplayMetrics().density;
            apno apnoVar = this.y.b;
            if (apnoVar == null) {
                apnoVar = apno.a;
            }
            i4 = M(apnoVar, view2.getMeasuredWidth(), f);
            apno apnoVar2 = this.y.c;
            if (apnoVar2 == null) {
                apnoVar2 = apno.a;
            }
            i2 = M(apnoVar2, view2.getMeasuredWidth(), f);
            apno apnoVar3 = this.y.d;
            if (apnoVar3 == null) {
                apnoVar3 = apno.a;
            }
            i3 = M(apnoVar3, view2.getMeasuredHeight(), f);
            apno apnoVar4 = this.y.e;
            if (apnoVar4 == null) {
                apnoVar4 = apno.a;
            }
            i = M(apnoVar4, view2.getMeasuredHeight(), f);
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = ((view2.getMeasuredWidth() - i4) - i2) - 1;
        marginLayoutParams.height = ((view2.getMeasuredHeight() - i3) - i) - 1;
        marginLayoutParams.leftMargin = i4;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i;
        view.requestLayout();
    }

    @Override // defpackage.mxt
    public final void l(View view, MotionEvent motionEvent, List list, boolean z) {
        auib x;
        View view2 = !list.isEmpty() ? (View) list.get(0) : null;
        if (z) {
            x = auib.PROMOTED_SPARKLES_CLICK_LOCATION_TALKBACK_ACTIVATED;
            if (view2 != null && x(view2) != null && x(view2) == auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL) {
                x = auib.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL_TALKBACK_ACTIVATED;
            }
            Integer y = y(x);
            if (y != null) {
                this.w.d(y.intValue());
            } else {
                this.w.c();
            }
            double d = view.getResources().getDisplayMetrics().density;
            wzi wziVar = this.x;
            double width = view.getWidth();
            Double.isNaN(width);
            Double.isNaN(d);
            double height = view.getHeight();
            Double.isNaN(height);
            Double.isNaN(d);
            wziVar.d((int) ((width / 2.0d) / d), (int) ((height / 2.0d) / d));
        } else {
            J(view, motionEvent, false, view2);
            x = x(view2);
        }
        if (x != null) {
            D(N(x), true);
        } else {
            this.n.i();
        }
    }

    @Override // defpackage.mxt
    public final void m(View view, MotionEvent motionEvent, List list) {
        J(view, motionEvent, true, !list.isEmpty() ? (View) list.get(0) : null);
        D(z(), false);
    }

    @Override // defpackage.mxt
    public final void n(List list) {
        auib x;
        if (this.r == null || (x = x((View) arey.r(list, null))) == null) {
            return;
        }
        this.r.a(w(N(x), true).b, false);
    }

    @Override // defpackage.mxt
    public final void o() {
        if (this.r == null) {
            return;
        }
        this.r.a(w(z(), false).b, false);
    }

    @Override // defpackage.mxt
    protected final boolean s() {
        apnp apnpVar = this.y;
        if (apnpVar != null) {
            apno apnoVar = apnpVar.b;
            if (apnoVar == null) {
                apnoVar = apno.a;
            }
            if (!P(apnoVar)) {
                return false;
            }
            apno apnoVar2 = this.y.c;
            if (apnoVar2 == null) {
                apnoVar2 = apno.a;
            }
            if (!P(apnoVar2)) {
                return false;
            }
            apno apnoVar3 = this.y.d;
            if (apnoVar3 == null) {
                apnoVar3 = apno.a;
            }
            if (!P(apnoVar3)) {
                return false;
            }
            apno apnoVar4 = this.y.e;
            if (apnoVar4 == null) {
                apnoVar4 = apno.a;
            }
            return P(apnoVar4);
        }
        return true;
    }

    @Override // defpackage.mxt
    public final boolean u(View view, List list) {
        if (list.contains(this.o)) {
            this.p.onClick(this.o);
            return true;
        } else if (O(list)) {
            fmr fmrVar = this.s;
            fmrVar.onClick(fmrVar.a);
            ncg ncgVar = this.q;
            if (ncgVar != null) {
                ncgVar.a(false);
            }
            return true;
        } else {
            return super.u(view, list);
        }
    }

    @Override // defpackage.mxt
    public final boolean v(List list) {
        if (r(list)) {
            this.r.a(true, true);
            return true;
        } else if (!O(list)) {
            return false;
        } else {
            this.r.a(false, true);
            return true;
        }
    }

    protected final ncf w(Object obj, boolean z) {
        Object e;
        ncf b = this.n.b(obj);
        if (!b.a) {
            if (z) {
                e = this.n.f();
            } else {
                e = this.n.e();
            }
            return this.n.b(e);
        }
        return b;
    }

    protected final auib x(View view) {
        return (auib) this.u.get(view);
    }

    protected final Integer y(auib auibVar) {
        if (auibVar == null || auibVar == auib.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN) {
            return null;
        }
        return this.n.c(A(auibVar));
    }

    protected final Object z() {
        return N(auib.PROMOTED_SPARKLES_CLICK_LOCATION_BORDER);
    }

    public nck(Context context, aafo aafoVar, wxc wxcVar, wwk wwkVar, tjv tjvVar, enm enmVar, yni yniVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, View.OnClickListener onClickListener, ncg ncgVar, ncj ncjVar, nch nchVar, boolean z) {
        this(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, yniVar, view, view2, view3, view4, view5, view6, view7, null, onClickListener, ncgVar, ncjVar, nchVar, z);
    }

    public nck(Context context, aafo aafoVar, wxc wxcVar, wwk wwkVar, tjv tjvVar, enm enmVar, yni yniVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, fmr fmrVar, View.OnClickListener onClickListener, ncg ncgVar, ncj ncjVar, nch nchVar, boolean z) {
        super(context, aafoVar, wxcVar, wwkVar, tjvVar, enmVar, view, view2, view3, view4, view6, view7, z);
        this.l = new Handler(context.getMainLooper());
        this.m = yniVar;
        this.o = view5;
        this.p = onClickListener;
        this.q = ncgVar;
        this.r = ncjVar;
        this.n = nchVar;
        this.s = fmrVar;
        nchVar.j(this);
        this.u = new HashMap();
        this.v = new HashMap();
        this.w = new wzg();
        this.x = new wzi(view);
        this.e.b(view5, true);
        if (fmrVar != null) {
            this.e.b(fmrVar.a, true);
        }
    }
}
