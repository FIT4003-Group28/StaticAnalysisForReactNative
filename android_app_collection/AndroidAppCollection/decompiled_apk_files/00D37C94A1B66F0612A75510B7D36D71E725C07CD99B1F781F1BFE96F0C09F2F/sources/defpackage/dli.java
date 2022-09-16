package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dli  reason: default package */
/* loaded from: classes3.dex */
public final class dli {
    static final xs a = new vq((char[]) null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dln a(Context context) {
        return new dln(context, new djp(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(cyv cyvVar, int i) {
        int i2 = i + 1;
        int i3 = djy.P;
        if (cyvVar.f == null) {
            return;
        }
        cyvVar.g(new ddk(0, Integer.valueOf(i2)), "updateState:Recycler.onUpdateMeasure");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean c(dad dadVar, dad dadVar2, dad dadVar3, dad dadVar4, dad dadVar5, dad dadVar6, dad dadVar7, dad dadVar8, dad dadVar9, dad dadVar10, dad dadVar11, dad dadVar12, dad dadVar13, dad dadVar14, dad dadVar15, dad dadVar16, dad dadVar17) {
        if (((Integer) dadVar17.a).intValue() == ((Integer) dadVar17.b).intValue() && dadVar.a == dadVar.b && ((Boolean) dadVar2.a).equals(dadVar2.b) && ((Boolean) dadVar3.a).equals(dadVar3.b) && ((Integer) dadVar4.a).equals(dadVar4.b) && ((Integer) dadVar5.a).equals(dadVar5.b) && ((Integer) dadVar6.a).equals(dadVar6.b) && ((Integer) dadVar7.a).equals(dadVar7.b) && ((Boolean) dadVar10.a).equals(dadVar10.b) && ((Integer) dadVar11.a).equals(dadVar11.b) && ((Boolean) dadVar13.a).equals(dadVar13.b) && ((Boolean) dadVar14.a).equals(dadVar14.b) && ((Integer) dadVar15.a).equals(dadVar15.b)) {
            Integer num = (Integer) dadVar8.a;
            Integer num2 = (Integer) dadVar8.b;
            if (num != null ? !num.equals(num2) : num2 != null) {
                return true;
            }
            if (((Integer) dadVar9.a).equals(dadVar9.b)) {
                xs xsVar = (xs) dadVar16.a;
                xs xsVar2 = (xs) dadVar16.b;
                if (xsVar != null ? !xsVar.getClass().equals(xsVar2.getClass()) : xsVar2 != null) {
                    return true;
                }
                nd ndVar = (nd) dadVar12.a;
                nd ndVar2 = (nd) dadVar12.b;
                if (ndVar == null) {
                    if (ndVar2 == null) {
                        return false;
                    }
                } else if (ndVar.equals(ndVar2)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(int i, dcz dczVar) {
        dczVar.a = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void e(dln dlnVar, dit ditVar, dle dleVar, List list, xz xzVar, boolean z, akcr akcrVar, ya yaVar, bmp bmpVar) {
        dlnVar.setContentDescription(null);
        dlnVar.setEnabled(z && bmpVar != null);
        dlnVar.a = bmpVar;
        RecyclerView recyclerView = dlnVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.aE((ne) it.next());
            }
        }
        if (akcrVar != null) {
            ((djp) recyclerView).W = akcrVar;
        }
        if (yaVar != null) {
            recyclerView.v(yaVar);
        }
        if (xzVar != null && recyclerView.H == null) {
            xzVar.e(recyclerView);
        }
        ditVar.g();
        if (dleVar != null) {
            dleVar.a = dlnVar;
        }
        if (!dlnVar.m) {
            return;
        }
        recyclerView.requestLayout();
        dlnVar.m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(cyz cyzVar, dit ditVar) {
        ditVar.d(cyzVar.H(), cyzVar.C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void g(dcz dczVar) {
        dczVar.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(cyv cyvVar, int i, int i2, ddj ddjVar, dit ditVar) {
        daq H;
        if (!ditVar.f()) {
            ditVar.h();
            H = null;
        } else {
            int i3 = djy.P;
            H = djy.H(djy.class, cyvVar, 946341036, new Object[]{cyvVar});
        }
        ditVar.b(ddjVar, i, i2, H);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(daq daqVar, dcz dczVar) {
        if (daqVar != null) {
            dczVar.a = new dlh(daqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void l(dit ditVar) {
        ditVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(dln dlnVar, dit ditVar, dle dleVar, ya yaVar, List list) {
        RecyclerView recyclerView = dlnVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        ditVar.i();
        if (dleVar != null) {
            dleVar.a = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.aG((ne) it.next());
            }
        }
        if (yaVar != null) {
            recyclerView.Z(yaVar);
        }
        ((djp) recyclerView).W = null;
        dlnVar.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(dln dlnVar, dit ditVar, xz xzVar) {
        RecyclerView recyclerView = dlnVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        recyclerView.setId(-1);
        ditVar.e(recyclerView);
        if (xzVar != null) {
            xzVar.e(null);
        }
        dlnVar.l.af(dlnVar.n);
        dlnVar.n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(dln dlnVar, dit ditVar, boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, int i6, int i7, int i8, CharSequence charSequence, xs xsVar) {
        RecyclerView recyclerView = dlnVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
        }
        recyclerView.setContentDescription(charSequence);
        recyclerView.s = true;
        recyclerView.setClipToPadding(z);
        dlnVar.setClipToPadding(z);
        lj.Y(recyclerView, i, i3, i2, i4);
        recyclerView.setClipChildren(z2);
        dlnVar.setClipChildren(z2);
        recyclerView.setNestedScrollingEnabled(z3);
        dlnVar.setNestedScrollingEnabled(z3);
        recyclerView.setScrollBarStyle(0);
        recyclerView.setHorizontalFadingEdgeEnabled(false);
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setFadingEdgeLength(i6);
        recyclerView.setId(i7);
        recyclerView.setOverScrollMode(i8);
        dlnVar.j(i5);
        if (xsVar == a) {
            xsVar = new vq((char[]) null);
        }
        RecyclerView recyclerView2 = dlnVar.l;
        dlnVar.n = recyclerView2.E;
        recyclerView2.af(xsVar);
        ditVar.c(recyclerView);
    }
}
