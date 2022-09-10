package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axw  reason: default package */
/* loaded from: classes.dex */
public final class axw extends hr {
    private static boolean v(ayn aynVar) {
        return !t(aynVar.d) || !t(null) || !t(null);
    }

    @Override // defpackage.hr
    public final boolean a(Object obj) {
        return obj instanceof ayn;
    }

    @Override // defpackage.hr
    public final Object b(Object obj) {
        if (obj != null) {
            return ((ayn) obj).clone();
        }
        return null;
    }

    @Override // defpackage.hr
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        ayv ayvVar = new ayv();
        ayvVar.J((ayn) obj);
        return ayvVar;
    }

    @Override // defpackage.hr
    public final void d(Object obj, View view, ArrayList<View> arrayList) {
        ayv ayvVar = (ayv) obj;
        ArrayList<View> arrayList2 = ayvVar.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        f(ayvVar, arrayList);
    }

    @Override // defpackage.hr
    public final void e(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            u(view, rect);
            ((ayn) obj).v(new axq(rect));
        }
    }

    @Override // defpackage.hr
    public final void f(Object obj, ArrayList<View> arrayList) {
        ayn aynVar = (ayn) obj;
        if (aynVar == null) {
            return;
        }
        int i = 0;
        if (aynVar instanceof ayv) {
            ayv ayvVar = (ayv) aynVar;
            int e = ayvVar.e();
            while (i < e) {
                f(ayvVar.f(i), arrayList);
                i++;
            }
        } else if (v(aynVar) || !t(aynVar.e)) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                aynVar.C(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.hr
    public final Object g(Object obj, Object obj2, Object obj3) {
        ayv ayvVar = new ayv();
        if (obj != null) {
            ayvVar.J((ayn) obj);
        }
        if (obj2 != null) {
            ayvVar.J((ayn) obj2);
        }
        if (obj3 != null) {
            ayvVar.J((ayn) obj3);
        }
        return ayvVar;
    }

    @Override // defpackage.hr
    public final void h(Object obj, View view, ArrayList<View> arrayList) {
        ((ayn) obj).A(new axr(view, arrayList));
    }

    @Override // defpackage.hr
    public final void i(ViewGroup viewGroup, Object obj) {
        ayr.b(viewGroup, (ayn) obj);
    }

    @Override // defpackage.hr
    public final void j(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((ayn) obj).A(new axs(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.hr
    public final void k(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        ayv ayvVar = (ayv) obj;
        if (ayvVar != null) {
            ayvVar.e.clear();
            ayvVar.e.addAll(arrayList2);
            l(ayvVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.hr
    public final void l(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        ayn aynVar = (ayn) obj;
        int i = 0;
        if (aynVar instanceof ayv) {
            ayv ayvVar = (ayv) aynVar;
            int e = ayvVar.e();
            while (i < e) {
                l(ayvVar.f(i), arrayList, arrayList2);
                i++;
            }
        } else if (v(aynVar)) {
        } else {
            ArrayList<View> arrayList3 = aynVar.e;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                aynVar.C(arrayList2.get(i));
                i++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                }
                aynVar.F(arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.hr
    public final void m(Object obj, View view) {
        if (obj != null) {
            ((ayn) obj).C(view);
        }
    }

    @Override // defpackage.hr
    public final void n(Object obj, View view) {
        ((ayn) obj).F(view);
    }

    @Override // defpackage.hr
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((ayn) obj).v(new axv(rect));
        }
    }

    @Override // defpackage.hr
    public final void p(Object obj, akq akqVar, Runnable runnable) {
        ayn aynVar = (ayn) obj;
        akqVar.c(new axt(aynVar));
        aynVar.A(new axu(runnable));
    }
}
