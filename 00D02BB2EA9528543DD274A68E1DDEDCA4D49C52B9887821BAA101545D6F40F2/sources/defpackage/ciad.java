package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ciad  reason: default package */
/* loaded from: classes4.dex */
public final class ciad extends zc {
    public static final /* synthetic */ int u = 0;
    private static final Interpolator v = pq.a(0.25f, 0.0f, 0.0f, 1.0f);
    private final cqhn w;
    private final cqhu x;
    public final Map<acl, chza> q = new HashMap();
    public final Map<acl, chzf> r = new HashMap();
    public final Map<acl, chzg> s = new HashMap();
    public final Map<acl, chza> t = new HashMap();
    public final long n = this.k;
    public final long o = this.i;
    public final long p = this.j;

    public ciad(cqhn cqhnVar, cqhu cqhuVar) {
        this.w = cqhnVar;
        this.x = cqhuVar;
    }

    private static <T> Iterable<T> A(Map<T, ?> map) {
        return new ArrayList(map.keySet());
    }

    @Override // defpackage.zc, defpackage.abn
    public final void a() {
        int d;
        int size = this.q.size() + (this.r.size() / 2);
        dbpy<Object> dbpyVar = dbpy.a;
        long j = 0;
        for (acl aclVar : A(this.q)) {
            chza chzaVar = this.q.get(aclVar);
            dbsk.s(chzaVar);
            j = Math.max(j, chzaVar.a());
            dbsg<chzh> c = chzaVar.c();
            this.t.put(aclVar, chzaVar);
            this.q.remove(aclVar);
            chzaVar.b().start();
            dbpyVar = c;
        }
        this.i = j;
        long j2 = 0;
        for (acl aclVar2 : A(this.r)) {
            chzf chzfVar = this.r.get(aclVar2);
            if (chzfVar != null) {
                chza c2 = chzfVar.c();
                j2 = Math.max(j2, c2.a());
                dbsg<chzh> c3 = c2.c();
                this.t.put(chzfVar.a(), c2);
                this.r.remove(chzfVar.a());
                this.t.put(chzfVar.b(), chza.h());
                this.r.remove(chzfVar.b());
                c2.b().start();
                dbpyVar = c3;
            }
        }
        this.k = j2;
        if (size > 1 && dbpyVar.a()) {
            dbpyVar = dbpy.a;
        }
        dbpy<Object> dbpyVar2 = dbpyVar;
        for (acl aclVar3 : A(this.s)) {
            chzg chzgVar = this.s.get(aclVar3);
            dbsk.s(chzgVar);
            if (dbpyVar2.a()) {
                chzh chzhVar = (chzh) dbpyVar2.b();
                final View view = chzgVar.a().a;
                int d2 = chzgVar.d();
                int b = chzgVar.b();
                int e = chzgVar.e();
                int c4 = chzgVar.c();
                view.setTranslationX(-(d2 - b));
                view.setTranslationY(-(e - c4));
                long j3 = (chzhVar.d() <= 0 || (d = chzgVar.a().d() - chzhVar.d()) <= 0) ? 0L : (d - 1) * 50;
                chzgVar.a().d();
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0.0f), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f));
                ofPropertyValuesHolder.setDuration(chzhVar.a());
                ofPropertyValuesHolder.setStartDelay(chzhVar.b() + j3);
                ofPropertyValuesHolder.setInterpolator(chzhVar.c());
                chza g = chza.g(chzhVar.b() + j3 + chzhVar.a(), ofPropertyValuesHolder, new Runnable(view) { // from class: chzy
                    private final View a;

                    {
                        this.a = view;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2 = this.a;
                        int i = ciad.u;
                        view2.setTranslationX(0.0f);
                        view2.setTranslationY(0.0f);
                    }
                });
                chzb chzbVar = (chzb) g;
                chzbVar.b.addListener(new ciab(this, chzgVar, g));
                this.t.put(aclVar3, g);
                this.s.remove(aclVar3);
                chzbVar.b.start();
            } else {
                this.s.remove(aclVar3);
                super.d(chzgVar.a(), chzgVar.b() - ((int) aclVar3.a.getTranslationX()), chzgVar.c() - ((int) aclVar3.a.getTranslationY()), chzgVar.d(), chzgVar.e());
            }
        }
        super.a();
        r(new abl(this) { // from class: chzv
            private final ciad a;

            {
                this.a = this;
            }

            @Override // defpackage.abl
            public final void a() {
                ciad ciadVar = this.a;
                ciadVar.i = ciadVar.o;
                ciadVar.k = ciadVar.n;
                ciadVar.j = ciadVar.p;
            }
        });
    }

    @Override // defpackage.zc, defpackage.adw
    public final boolean b(acl aclVar) {
        chza f;
        f(aclVar);
        abm u2 = u();
        u2.a(aclVar);
        chyv b = ((ciac) u2).b();
        if (b == null) {
            final chza a = chzu.a(aclVar.a);
            chzb chzbVar = (chzb) a;
            long j = chzbVar.a;
            Animator animator = chzbVar.b;
            chzh e = chzh.e(500L, j, v, aclVar.d());
            a.getClass();
            f = chza.f(j, animator, e, new Runnable(a) { // from class: chzx
                private final chza a;

                {
                    this.a = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            });
        } else {
            View o = cqkx.o((cqkp) b);
            if (o == null) {
                f = null;
            } else {
                final chza a2 = chzu.a(o);
                chzb chzbVar2 = (chzb) a2;
                long j2 = chzbVar2.a;
                Animator animator2 = chzbVar2.b;
                chzh e2 = chzh.e(500L, j2, v, aclVar.d());
                a2.getClass();
                f = chza.f(j2, animator2, e2, new Runnable(a2) { // from class: chzw
                    private final chza a;

                    {
                        this.a = a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e();
                    }
                });
            }
        }
        if (f != null) {
            ((chzb) f).b.addListener(new ciaa(this, aclVar, f));
            this.q.put(aclVar, f);
            return true;
        }
        return super.b(aclVar);
    }

    @Override // defpackage.zc, defpackage.adw
    public final boolean d(acl aclVar, int i, int i2, int i3, int i4) {
        f(aclVar);
        aclVar.a.setTranslationX(i - i3);
        aclVar.a.setTranslationY(i2 - i4);
        this.s.put(aclVar, new chzd(aclVar, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.zc, defpackage.abn
    public final void f(acl aclVar) {
        chza chzaVar = this.t.get(aclVar);
        if (chzaVar != null) {
            chzaVar.b().end();
        } else if (this.s.remove(aclVar) != null) {
            aclVar.a.setTranslationX(0.0f);
            aclVar.a.setTranslationY(0.0f);
            x(aclVar);
        } else {
            chza chzaVar2 = this.q.get(aclVar);
            if (chzaVar2 != null) {
                chzaVar2.b().end();
            } else {
                chzf chzfVar = this.r.get(aclVar);
                if (chzfVar != null) {
                    chzfVar.c().b().end();
                }
            }
        }
        super.f(aclVar);
    }

    @Override // defpackage.zc, defpackage.abn
    public final boolean g() {
        return super.g() || !this.t.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.s.isEmpty();
    }

    @Override // defpackage.zc
    public final void h() {
        if (!g()) {
            t();
        }
    }

    @Override // defpackage.zc, defpackage.abn
    public final void i() {
        for (acl aclVar : A(this.t)) {
            chza chzaVar = this.t.get(aclVar);
            if (chzaVar != null) {
                chzaVar.b().end();
            }
        }
        for (acl aclVar2 : A(this.s)) {
            this.s.remove(aclVar2);
            aclVar2.a.setTranslationX(0.0f);
            aclVar2.a.setTranslationY(0.0f);
            x(aclVar2);
        }
        for (acl aclVar3 : A(this.q)) {
            chza chzaVar2 = this.q.get(aclVar3);
            if (chzaVar2 != null) {
                chzaVar2.b().end();
            }
        }
        for (acl aclVar4 : A(this.r)) {
            chzf chzfVar = this.r.get(aclVar4);
            if (chzfVar != null) {
                chzfVar.c().b().end();
            }
        }
        super.i();
        dbsk.l(!g());
    }

    @Override // defpackage.adw, defpackage.abn
    public final boolean o(acl aclVar, acl aclVar2, abm abmVar, abm abmVar2) {
        final chza g;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View o;
        final chza b;
        final View o2;
        f(aclVar);
        f(aclVar2);
        chyv b2 = ((ciac) abmVar).b();
        char c = 0;
        if (b2 != null) {
            chyw c2 = b2.c();
            chza chzaVar = null;
            int i = 1;
            if (c2 == chyw.TAGGABLE_PHOTO || c2 == chyw.DEVICE_PHOTO || c2 == chyw.ADD_LIST_ITEM_NOTE) {
                cqiy m = cqkx.m((cqkp) b2);
                if (m != null) {
                    View view = m.c;
                    Object obj = m.f;
                    if ((obj instanceof chzi) && (view.getParent() instanceof LinearLayout)) {
                        final ViewGroup viewGroup = (ViewGroup) aclVar2.a;
                        cqjg b3 = ((chzi) obj).b();
                        LinearLayout linearLayout3 = (LinearLayout) view.getParent();
                        View a = cqhu.a(viewGroup, b3);
                        dbsk.s(a);
                        LinearLayout linearLayout4 = (LinearLayout) a;
                        if (linearLayout4.getChildCount() != linearLayout3.getChildCount() - 1) {
                            bvoo.h("Inconsistent child count, old=%d, new=%d", Integer.valueOf(linearLayout3.getChildCount()), Integer.valueOf(linearLayout4.getChildCount()));
                        } else {
                            viewGroup.setAlpha(0.0f);
                            final chza a2 = chzu.a(view);
                            dbsk.l(linearLayout3.getOrientation() == 0);
                            dbsk.l(linearLayout4.getOrientation() == 0);
                            dbsk.m(linearLayout4.getChildCount() == linearLayout3.getChildCount() + (-1), String.format(Locale.US, "Inconsistent child count, old=%d, new=%d", Integer.valueOf(linearLayout3.getChildCount()), Integer.valueOf(linearLayout4.getChildCount())));
                            int[] iArr = new int[2];
                            int indexOfChild = linearLayout3.indexOfChild(view);
                            final AnimatorSet animatorSet = new AnimatorSet();
                            int i2 = 0;
                            int i3 = 0;
                            while (i2 < linearLayout3.getChildCount()) {
                                if (i2 == indexOfChild) {
                                    i3--;
                                } else {
                                    View childAt = linearLayout3.getChildAt(i2);
                                    dbsk.s(childAt);
                                    View childAt2 = linearLayout4.getChildAt(i3);
                                    dbsk.s(childAt2);
                                    childAt.getLocationOnScreen(iArr);
                                    int i4 = iArr[c];
                                    childAt2.getLocationOnScreen(iArr);
                                    int i5 = iArr[c] - i4;
                                    if (i5 != 0) {
                                        Property property = View.TRANSLATION_X;
                                        linearLayout = linearLayout4;
                                        float[] fArr = new float[i];
                                        fArr[0] = i5;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, fArr);
                                        linearLayout2 = linearLayout3;
                                        ofFloat.setDuration(500L);
                                        ofFloat.setStartDelay(50L);
                                        ofFloat.setInterpolator(chyx.a);
                                        animatorSet.play(ofFloat);
                                        i2++;
                                        i3++;
                                        linearLayout3 = linearLayout2;
                                        linearLayout4 = linearLayout;
                                        c = 0;
                                        i = 1;
                                    }
                                }
                                linearLayout = linearLayout4;
                                linearLayout2 = linearLayout3;
                                i2++;
                                i3++;
                                linearLayout3 = linearLayout2;
                                linearLayout4 = linearLayout;
                                c = 0;
                                i = 1;
                            }
                            final LinearLayout linearLayout5 = linearLayout3;
                            if (animatorSet.getChildAnimations().isEmpty()) {
                                g = chza.h();
                            } else {
                                g = chza.g(550L, animatorSet, new Runnable(animatorSet, linearLayout5) { // from class: chzk
                                    private final AnimatorSet a;
                                    private final LinearLayout b;

                                    {
                                        this.a = animatorSet;
                                        this.b = linearLayout5;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnimatorSet animatorSet2 = this.a;
                                        LinearLayout linearLayout6 = this.b;
                                        animatorSet2.end();
                                        for (int i6 = 0; i6 < linearLayout6.getChildCount(); i6++) {
                                            linearLayout6.getChildAt(i6).setTranslationX(0.0f);
                                        }
                                    }
                                });
                            }
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            chzb chzbVar = (chzb) a2;
                            chzb chzbVar2 = (chzb) g;
                            animatorSet2.playSequentially(chzbVar.b, chzbVar2.b);
                            chzaVar = chza.g(chzbVar.a + chzbVar2.a, animatorSet2, new Runnable(a2, g, viewGroup) { // from class: chzj
                                private final chza a;
                                private final chza b;
                                private final ViewGroup c;

                                {
                                    this.a = a2;
                                    this.b = g;
                                    this.c = viewGroup;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    chza chzaVar2 = this.a;
                                    chza chzaVar3 = this.b;
                                    ViewGroup viewGroup2 = this.c;
                                    chzaVar2.e();
                                    chzaVar3.e();
                                    viewGroup2.setAlpha(1.0f);
                                }
                            });
                        }
                    }
                }
            } else if (c2 == chyw.TAG_PHOTOS || c2 == chyw.UPLOAD_PHOTOS || c2 == chyw.UPDATE_LIST_ITEMS) {
                if (cqkx.o((cqkp) b2) != null && b2.d().size() == 1 && (o = cqkx.o((cqkp) b2.d().get(0))) != null && (b = chzu.b(b2, aclVar, aclVar2)) != null) {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    final chza a3 = chzu.a(o);
                    chzb chzbVar3 = (chzb) a3;
                    chzb chzbVar4 = (chzb) b;
                    animatorSet3.playSequentially(chzbVar3.b, chzbVar4.b);
                    long j = chzbVar3.a;
                    chzaVar = chza.f(j + chzbVar4.a, animatorSet3, chzh.e(750L, j, chyx.a, aclVar2.d()), new Runnable(a3, b) { // from class: chzp
                        private final chza a;
                        private final chza b;

                        {
                            this.a = a3;
                            this.b = b;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            chza chzaVar2 = this.a;
                            chza chzaVar3 = this.b;
                            chzaVar2.e();
                            chzaVar3.e();
                        }
                    });
                }
            } else if (c2 == chyw.PUBLISH_LIST || c2 == chyw.ADD_LIST_DESCRIPTION) {
                chzaVar = chzu.b(b2, aclVar, aclVar2);
            } else if (c2 == chyw.PLACE_REOPEN && (o2 = cqkx.o((cqkp) b2)) != null) {
                FrameLayout frameLayout = (FrameLayout) aclVar2.a;
                frameLayout.setAlpha(0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o2, View.ALPHA, 0.0f);
                ofFloat2.setDuration(100L);
                final chza g2 = chza.g(100L, ofFloat2, new Runnable(o2) { // from class: chzr
                    private final View a;

                    {
                        this.a = o2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.setAlpha(1.0f);
                    }
                });
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, View.ALPHA, 1.0f);
                ofFloat3.setDuration(250L);
                ofFloat3.setStartDelay(150L);
                final chza g3 = chza.g(250L, ofFloat3, chzs.a);
                AnimatorSet animatorSet4 = new AnimatorSet();
                chzb chzbVar5 = (chzb) g2;
                chzb chzbVar6 = (chzb) g3;
                animatorSet4.playTogether(chzbVar5.b, chzbVar6.b);
                long max = Math.max(chzbVar5.a, chzbVar6.a);
                chzaVar = chza.f(max, animatorSet4, chzh.e(max, 50L, chyx.a, aclVar2.d()), new Runnable(g2, g3) { // from class: chzt
                    private final chza a;
                    private final chza b;

                    {
                        this.a = g2;
                        this.b = g3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        chza chzaVar2 = this.a;
                        chza chzaVar3 = this.b;
                        chzaVar2.e();
                        chzaVar3.e();
                    }
                });
            }
            if (chzaVar != null) {
                ((chzb) chzaVar).b.addListener(new chzz(this, aclVar, aclVar2, chzaVar));
                chzc chzcVar = new chzc(aclVar, aclVar2, chzaVar);
                this.r.put(aclVar, chzcVar);
                this.r.put(aclVar2, chzcVar);
                return true;
            }
        }
        p(aclVar);
        p(aclVar2);
        return false;
    }

    @Override // defpackage.abn
    public final abm u() {
        return new ciac();
    }
}
