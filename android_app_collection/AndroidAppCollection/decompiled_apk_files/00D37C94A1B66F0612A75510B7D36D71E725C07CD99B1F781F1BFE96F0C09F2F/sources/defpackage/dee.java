package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: dee  reason: default package */
/* loaded from: classes3.dex */
public class dee {
    public static final dec g;
    public static final dec h;

    static {
        dea deaVar = new dea(dgs.a);
        g = deaVar;
        new dea(dgs.b);
        h = deaVar;
        new AccelerateDecelerateInterpolator();
    }

    public static float c(ded dedVar, dbq dbqVar, dfe dfeVar) {
        def defVar = dbqVar.l;
        dfj dfjVar = dedVar.c;
        new dfn(defVar, dfeVar);
        return dfjVar.a;
    }

    public static dec d(int i, Interpolator interpolator) {
        return new deb(i, interpolator);
    }

    public static ddw e(String str) {
        return new ddw(str);
    }
}
