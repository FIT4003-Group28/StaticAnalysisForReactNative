package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: noz  reason: default package */
/* loaded from: classes7.dex */
public final class noz {
    public static final Interpolator a = irf.b;
    public static final Interpolator b = irf.c;
    public static final Interpolator c = irf.a;
    public static final LayoutTransition e = nod.b();
    public final Object d;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final kcv j;

    public noz(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, kcv kcvVar, Object obj) {
        dbsk.s(viewGroup);
        this.f = viewGroup;
        dbsk.s(viewGroup2);
        this.g = viewGroup2;
        dbsk.s(viewGroup3);
        this.h = viewGroup3;
        dbsk.s(viewGroup4);
        this.i = viewGroup4;
        this.j = kcvVar;
        this.d = obj;
    }

    public static void b(ViewGroup viewGroup) {
        viewGroup.setLayoutTransition(null);
    }

    public static void c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public final ayn a(View view, View view2, ViewGroup viewGroup, int i) {
        ayv ayvVar = new ayv();
        ayvVar.L(1);
        axp axpVar = new axp(2);
        axpVar.c = b;
        axpVar.b = 70L;
        axpVar.C(view);
        axpVar.C(view2);
        ayvVar.J(axpVar);
        axm axmVar = new axm();
        axmVar.c = c;
        axmVar.b = 70L;
        axmVar.B(nrk.b);
        axmVar.B(i);
        axmVar.C(this.g);
        axmVar.C(viewGroup);
        ayvVar.J(axmVar);
        axp axpVar2 = new axp(1);
        axpVar2.c = a;
        axpVar2.b = 70L;
        ayvVar.J(axpVar2);
        return ayvVar;
    }
}
