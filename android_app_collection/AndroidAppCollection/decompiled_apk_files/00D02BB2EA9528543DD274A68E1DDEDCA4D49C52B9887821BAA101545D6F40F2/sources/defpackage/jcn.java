package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: jcn  reason: default package */
/* loaded from: classes7.dex */
public final class jcn implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 6 || !(view instanceof View)) {
                return false;
            }
            if (obj == null || obj == jcm.a) {
                view.animate().cancel();
                view.setTranslationX(jcm.a.c.a(view.getContext()));
                view.setTranslationY(jcm.a.e.a(view.getContext()));
                view.setScaleX(jcm.a.g);
                view.setScaleY(jcm.a.g);
                view.setAlpha(jcm.a.i);
                boolean a = bvox.a(view);
                float f = jcm.a.k;
                view.setRotation(bvox.f(a, 0.0f));
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = (ViewTreeObserver.OnPreDrawListener) cqjzVar.m(jcm.b);
                if (onPreDrawListener == null) {
                    return true;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
                cqjzVar.n(jcm.b, null);
                return true;
            } else if (!(obj instanceof jcm)) {
                return false;
            } else {
                jcm jcmVar = (jcm) obj;
                ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = (ViewTreeObserver.OnPreDrawListener) cqjzVar.m(jcm.b);
                if (onPreDrawListener2 != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener2);
                }
                jck jckVar = new jck(view, cqjzVar, jcmVar);
                view.getViewTreeObserver().addOnPreDrawListener(jckVar);
                cqjzVar.n(jcm.b, jckVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
