package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: vmh  reason: default package */
/* loaded from: classes7.dex */
public final class vmh {
    public static final ddho a = dtxn.ag;
    private final cjqy b;
    @dzsi
    private final jkj c;

    public vmh(cjqy cjqyVar, @dzsi jkj jkjVar) {
        this.b = cjqyVar;
        this.c = jkjVar;
    }

    @dzsi
    private static cjql b(View view) {
        cjtd k = cjqg.k(view);
        cjql e = cjqg.e(view);
        if (k == null || k.g != a || e == null) {
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() <= 0) {
                return null;
            }
            return b(viewGroup.getChildAt(0));
        }
        return e;
    }

    public final void a(jjn jjnVar, jjn jjnVar2, jkg jkgVar, @dzsi amub amubVar) {
        deaf deafVar;
        cjql b;
        if (jjnVar == jjnVar2 || amubVar == null) {
            return;
        }
        if (jkgVar == jkg.SWIPE) {
            deafVar = deaf.SWIPE;
        } else {
            deafVar = deaf.AUTOMATED;
        }
        cjte cjteVar = new cjte(deafVar);
        View j = this.c.j();
        if (j == null || (b = b(j)) == null) {
            return;
        }
        cjqy cjqyVar = this.b;
        cjta c = cjtd.c(vyb.t(amubVar.d));
        c.d = a;
        cjqe f = cjqf.f(jjnVar, jjnVar2);
        ((cjpz) f).c = Integer.valueOf(amubVar.c);
        c.n(f.b());
        cjqyVar.n(b, cjteVar, c.a());
    }
}
