package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: nod  reason: default package */
/* loaded from: classes7.dex */
public final class nod {
    private static final Interpolator a = irf.b;
    private static final Interpolator b = irf.c;
    private static final Interpolator c = irf.a;

    public static LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(200L);
        layoutTransition.setInterpolator(2, a);
        Interpolator interpolator = c;
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(3, b);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setStartDelay(4, 0L);
        return layoutTransition;
    }

    public static LayoutTransition b() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(200L);
        layoutTransition.setInterpolator(4, c);
        layoutTransition.setStartDelay(4, 0L);
        return layoutTransition;
    }

    public static ayn c(int i, @dzsi View view) {
        ayv ayvVar = new ayv();
        ayvVar.L(1);
        ayvVar.G(70L);
        if (view != null) {
            axp axpVar = new axp(2);
            axpVar.c = b;
            axpVar.C(view);
            ayvVar.J(axpVar);
        }
        axm axmVar = new axm();
        axmVar.c = c;
        axmVar.B(i);
        ayvVar.J(axmVar);
        axp axpVar2 = new axp(1);
        axpVar2.c = a;
        ayvVar.J(axpVar2);
        return ayvVar;
    }
}
