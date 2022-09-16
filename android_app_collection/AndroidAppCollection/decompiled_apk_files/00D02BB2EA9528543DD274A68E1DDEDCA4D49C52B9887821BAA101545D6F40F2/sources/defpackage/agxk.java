package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agxk  reason: default package */
/* loaded from: classes2.dex */
public final class agxk {
    public static final cqtv a = new agxi();
    public static final cqtd b = cqta.d(0);
    private static final int c = 2131231239;

    public static cqtv a() {
        return cqrp.d(20.0d);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        cqtv cqtvVar = a;
        cqmj<T> fY = cqgr.fY(cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.j()));
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqqx.d(ibm.b()), cqqx.g(cqrp.d(8.0d)), cqqx.B(true), cqqx.y(false));
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqqx.d(ibm.Z()), cqqx.g(cqrp.d(8.0d)), cqqx.B(true), cqqx.y(false));
        E.f(cqmpVarArr);
        return E;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.v(Integer.valueOf((int) R.drawable.localstream_stream_item_card_background)));
        fY.f(cqmpVarArr);
        return fY;
    }

    @dzsi
    public static jic f(@dzsi dwfl dwflVar) {
        if (dwflVar == null || dwflVar.h.isEmpty()) {
            return null;
        }
        return o(dwflVar.h, jfv.b(dwflVar), ibl.s());
    }

    @dzsi
    public static jic g(@dzsi dwfl dwflVar) {
        if (dwflVar == null || dwflVar.h.isEmpty()) {
            return null;
        }
        return h(dwflVar.h, jfv.b(dwflVar));
    }

    public static jic h(String str, ckqc ckqcVar) {
        return o(str, ckqcVar, ibm.j());
    }

    public static jic i(@dzsi jic jicVar) {
        agxj agxjVar = new agxj(c);
        if (jicVar == null) {
            return new jic(null, ckqc.FULLY_QUALIFIED, R.drawable.guide_no_image_blue);
        }
        return new jic(jicVar.a, jicVar.b, jicVar.c, jicVar.d, jicVar.e, agxjVar, jicVar.g);
    }

    @dzsi
    public static View j(View view, Class<? extends cqiw<?>> cls) {
        while (true) {
            cqjz<?> g = cqjz.g(view);
            if (!(g instanceof cqiy) || !cls.equals(g.f.getClass())) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
    }

    @SafeVarargs
    public static List<View> k(View view, final Class<? extends cqiw<?>>... clsArr) {
        final ArrayList arrayList = new ArrayList();
        cqjz.u(view, new dbrn(clsArr, arrayList) { // from class: agxg
            private final Class[] a;
            private final List b;

            {
                this.a = clsArr;
                this.b = arrayList;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Class[] clsArr2 = this.a;
                List list = this.b;
                cqjz cqjzVar = (cqjz) obj;
                cqtv cqtvVar = agxk.a;
                if (!(cqjzVar instanceof cqiy)) {
                    return null;
                }
                for (Class cls : clsArr2) {
                    if (cls.equals(cqjzVar.f.getClass())) {
                        list.add(cqjzVar.c);
                        return null;
                    }
                }
                return null;
            }
        });
        return arrayList;
    }

    @dzsi
    public static View l(View view) {
        if (view.isAccessibilityFocused()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View l = l(viewGroup.getChildAt(i));
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    public static TimeInterpolator m(final TimeInterpolator timeInterpolator) {
        return new TimeInterpolator(timeInterpolator) { // from class: agxh
            private final TimeInterpolator a;

            {
                this.a = timeInterpolator;
            }

            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                TimeInterpolator timeInterpolator2 = this.a;
                cqtv cqtvVar = agxk.a;
                return timeInterpolator2.getInterpolation(1.0f - f);
            }
        };
    }

    public static bvir n(CharSequence charSequence, dwfl dwflVar) {
        return new bvir(charSequence, f(dwflVar));
    }

    private static jic o(String str, ckqc ckqcVar, cqtd cqtdVar) {
        return new jic(str, ckqcVar, cqtdVar, 250, true, null, new ckql());
    }
}
