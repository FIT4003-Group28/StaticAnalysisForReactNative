package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: gqu  reason: default package */
/* loaded from: classes3.dex */
public final class gqu extends cyr {
    @dfs(a = 3)
    boolean a;
    @dfs(a = 13)
    aihr b;
    @dfs(a = 3)
    long c;
    @dfs(a = 3)
    long d;
    @dfs(a = 13)
    ne e;

    public gqu() {
        super("ClipStoryboard");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new grv(context);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        final grv grvVar = (grv) obj;
        aihr aihrVar = this.b;
        long j = this.d;
        ne neVar = this.e;
        long j2 = this.c;
        boolean z = this.a;
        grvVar.aa = j2;
        grvVar.ad = z;
        if (j < j2) {
            j2 = j;
        }
        if (grvVar.W == null) {
            grvVar.getContext();
            grvVar.W = new grp(grvVar);
            grvVar.W.ab(0);
            grvVar.ag(grvVar.W);
        }
        if (grvVar.m == null) {
            grvVar.ad(new grt(grvVar, aihrVar, j, grv.a(j, j2), z));
        }
        grt grtVar = (grt) grvVar.m;
        aihr aihrVar2 = grtVar.d;
        if (aihrVar2 != aihrVar) {
            if (aihrVar2 != null) {
                aihrVar2.h(grtVar);
            }
            grtVar.d = aihrVar;
            aihrVar.h(grtVar);
            aihrVar.b(grtVar);
        }
        grtVar.n = grvVar.ae;
        ne neVar2 = grvVar.af;
        if (neVar2 == null) {
            grvVar.af = neVar;
        } else if (neVar2 != neVar) {
            grvVar.aG(neVar2);
            grvVar.af = neVar;
        }
        if (grvVar.ag == null) {
            grvVar.ag = new grq(grvVar);
        }
        if (grvVar.ah == null) {
            grvVar.ah = new grr(grvVar);
        }
        if (grvVar.ac == null) {
            grvVar.ac = new gra();
            grvVar.ac.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: grn
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    grv grvVar2 = grv.this;
                    grvVar2.scrollBy(((Integer) valueAnimator.getAnimatedValue()).intValue() - grvVar2.ac.a, 0);
                    grvVar2.ac.a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
            });
            gra graVar = grvVar.ac;
            graVar.setDuration(100L);
            graVar.setInterpolator(new LinearInterpolator());
            graVar.addListener(new gqz(graVar));
        }
        neVar.i(grvVar, 100);
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        gqu gquVar = (gqu) cyrVar;
        if (this.k == gquVar.k) {
            return true;
        }
        if (this.a != gquVar.a) {
            return false;
        }
        ne neVar = this.e;
        if (neVar == null ? gquVar.e != null : !neVar.equals(gquVar.e)) {
            return false;
        }
        aihr aihrVar = this.b;
        if (aihrVar == null ? gquVar.b != null : !aihrVar.equals(gquVar.b)) {
            return false;
        }
        return this.c == gquVar.c && this.d == gquVar.d;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }
}
