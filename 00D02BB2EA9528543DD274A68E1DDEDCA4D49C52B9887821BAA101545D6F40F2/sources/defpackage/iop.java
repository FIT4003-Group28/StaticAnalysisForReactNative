package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: iop  reason: default package */
/* loaded from: classes6.dex */
public class iop {
    private static final dcqe a = dcqe.c("iop");
    private final jmz b;

    public iop(jmz jmzVar) {
        this.b = jmzVar;
    }

    @dzsi
    public RecyclerView a(View view) {
        iqd iqdVar = (iqd) cqkx.e(view, ipx.a, iqd.class);
        if (iqdVar == null) {
            bvoo.h("Couldn't find scroll view", new Object[0]);
        }
        return iqdVar;
    }

    public final List<ioo> b(List<jba> list, View view) {
        int indexOf;
        RecyclerView a2 = a(view);
        if (a2 == null) {
            return dcdc.e();
        }
        if (a2.getVisibility() != 8) {
            aag aagVar = (aag) a2.l;
            int ad = aagVar.ad();
            int af = aagVar.af();
            dccx F = dcdc.F();
            for (int i = 0; i < a2.getChildCount(); i++) {
                View childAt = a2.getChildAt(i);
                cqkp i2 = cqkx.i(childAt);
                if ((i2 instanceof jba) && (indexOf = list.indexOf((jba) i2)) != -1) {
                    int min = Math.min(a2.getRight(), childAt.getRight()) - Math.max(a2.getLeft(), childAt.getLeft());
                    int Z = a2.Z(childAt);
                    F.g(new ini(indexOf, min, ad <= Z && Z <= af));
                }
            }
            return F.f();
        }
        return dcdc.e();
    }

    @dzsi
    public final View c(View view) {
        RecyclerView a2 = a(view);
        if (a2 != null) {
            abs absVar = a2.l;
            dbsk.s(absVar);
            aag aagVar = (aag) absVar;
            return aagVar.I(aagVar.ad());
        }
        return null;
    }

    public final void d(View view, Runnable runnable) {
        RecyclerView a2 = a(view);
        if (a2 != null) {
            view = a2;
        }
        view.addOnLayoutChangeListener(new iom(runnable));
    }

    public final void e(int i, View view, Context context) {
        RecyclerView a2 = a(view);
        if (a2 != null) {
            ion ionVar = new ion(context, context);
            ionVar.g = i;
            abs absVar = a2.l;
            dbsk.s(absVar);
            absVar.aw(ionVar);
        }
    }

    public final void f(View view) {
        RecyclerView a2 = a(view);
        if (a2 != null) {
            this.b.a(a2);
        }
    }

    public final void g(View view, Context context) {
        RecyclerView a2 = a(view);
        if (a2 != null) {
            this.b.b(a2);
        }
    }
}
