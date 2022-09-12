package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eeo  reason: default package */
/* loaded from: classes.dex */
public final class eeo implements efg {
    public final dxio<efc> b;
    public final ckml c;
    public final Executor d;
    protected AnimatorSet e;
    Animator f;
    protected dbsi<fd, egu> g;
    private final Activity h;
    private final btrm i;
    private final dxio<braw> j;
    private final dxio<hwd> k;
    private final cjyb l;
    private final efd m;
    private final dxio<glj> n;
    private final dxio<eeu> o;
    private final acyp p;
    private int q;
    private boolean s;
    boolean a = true;
    private final cjxz r = new cjxz();

    public eeo(ff ffVar, dxio<efc> dxioVar, btrm btrmVar, dxio<braw> dxioVar2, dxio<hwd> dxioVar3, cjyb cjybVar, efd efdVar, dxio<glj> dxioVar4, dxio<eeu> dxioVar5, ckml ckmlVar, acyp acypVar, Executor executor) {
        this.h = ffVar;
        this.b = dxioVar;
        this.i = btrmVar;
        this.j = dxioVar2;
        this.k = dxioVar3;
        this.l = cjybVar;
        this.m = efdVar;
        this.n = dxioVar4;
        this.o = dxioVar5;
        this.c = ckmlVar;
        this.p = acypVar;
        this.d = executor;
        ffVar.g().am(new eef(this), false);
        this.f = ValueAnimator.ofInt(0);
    }

    @Override // defpackage.efg
    public final void a(egu eguVar) {
        cjqp f = eguVar.a.bd().f();
        if (f != null) {
            jke jkeVar = eguVar.p;
            if (jkeVar != null) {
                egu.a(f, jkeVar.h(), eguVar.p.i());
            }
            egu.a(f, eguVar.g, eguVar.n, eguVar.y, eguVar.E, eguVar.K, eguVar.N, eguVar.P, eguVar.W, eguVar.Y);
            egu.a(f, (View[]) eguVar.ad.toArray(new View[0]));
        }
        this.b.a().e(eguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01da, code lost:
        if (r2.f == null) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0858 A[LOOP:2: B:365:0x0856->B:366:0x0858, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x096d  */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.egu r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 2600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeo.c(egu, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(egu eguVar) {
        if (!eguVar.an && !this.o.a().a()) {
            int i = this.q - 1;
            this.q = i;
            if (i > 0) {
                return;
            }
            boolean z = this.a || eguVar.at;
            MainLayout j = j();
            boolean z2 = !z;
            if (!eguVar.ap) {
                j.M.b.setVisibility(8);
            }
            j.w();
            boolean l = MainLayout.l(eguVar);
            jkh jkhVar = eguVar.o;
            if (jkhVar != null) {
                j.c(jkhVar);
            }
            jkc jkcVar = eguVar.l;
            if (j.T() && l && eguVar.D) {
                if (eguVar.i) {
                    jkcVar = jkc.m;
                } else {
                    jkcVar = jkc.q;
                }
            }
            j.as.e.setExpandingStateTransition(eguVar.k, jkcVar, z2);
            jjn z3 = j.as.a().z(eguVar.j);
            j.aB = z3;
            if (eguVar.y == null) {
                if (l) {
                    j.as.e.setExpandingState(z3, z2);
                    j.aA = z3;
                } else {
                    j.as.e.setHidden(true);
                    j.ab();
                }
            }
            j.aa(z2);
            if (!j.V()) {
                j.S.b.setVisibility(8);
            }
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null || animatorSet.isStarted()) {
                e(eguVar);
            } else {
                this.l.c(this.r);
                AnimatorSet animatorSet2 = this.e;
                dbsk.s(animatorSet2);
                animatorSet2.start();
            }
            if (!this.p.g()) {
                return;
            }
            this.f.start();
        }
    }

    public final void e(egu eguVar) {
        if (eguVar.an) {
            return;
        }
        fd e = eguVar.e();
        this.r.b();
        if (this.a) {
            bvmo.g.c(ckip.n);
            j().getViewTreeObserver().addOnPreDrawListener(new een(this));
        }
        this.i.b(eguVar.j(3));
        dbsk.l(this.k != null);
        dxio<hwd> dxioVar = this.k;
        if (dxioVar != null) {
            dxioVar.a().s();
        }
        this.m.b(eguVar.d(), this.s);
        if (eguVar.al == 1) {
            this.n.a().a();
        }
        MainLayout j = j();
        ViewGroup K = j.K();
        K.setVisibility(4);
        K.removeAllViews();
        if (eguVar.y != null) {
            j.ai = true;
            j.aj = eguVar.A;
            j.R();
        }
        if (eguVar.y != null) {
            j.as.g();
        }
        if (j.V()) {
            j.S.b.setVisibility(0);
        }
        View view = j.M.b;
        if (eguVar.ap) {
            view.setVisibility(0);
        }
        cqss cqssVar = eguVar.aq;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (cqssVar != null) {
                imageView.setColorFilter(cqssVar.b(j.e));
            } else {
                imageView.clearColorFilter();
            }
        }
        j.Z();
        this.b.a().b(eguVar);
        if (this.a) {
            this.a = false;
            bvmo.g.c(ckip.o);
        }
        egq egqVar = eguVar.am;
        if (egqVar != null && e.S()) {
            egqVar.Qs(eguVar);
        }
        ecs ecsVar = eguVar.ao;
        if (ecsVar != null && e.S()) {
            ecsVar.Qf();
        }
        this.i.b(new bvkb());
    }

    @Override // defpackage.efg
    public final void f(View view, egu eguVar) {
        this.q++;
        new eek(this, view, eguVar);
    }

    @Override // defpackage.efg
    public final void g(View view, Animator animator) {
        new eel(view, animator);
    }

    @Override // defpackage.efg
    public final void h(egu eguVar) {
        eguVar.an = true;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.p.g()) {
            this.f.cancel();
        }
        this.r.b();
    }

    @Override // defpackage.efg
    public final void i(egu eguVar) {
        jkh jkhVar = eguVar.o;
        if (jkhVar != null) {
            this.n.a().j(jkhVar);
        }
    }

    public final MainLayout j() {
        return (MainLayout) this.h.findViewById(R.id.mainmap_container);
    }

    @Override // defpackage.efg
    public final void b(final egu eguVar, final boolean z) {
        if (eguVar.an) {
            return;
        }
        dbsi<fd, egu> dbsiVar = this.g;
        if (dbsiVar == null || eguVar != dbsiVar.b || this.e == null) {
            this.g = dbsi.a(eguVar.e(), eguVar);
            this.e = new AnimatorSet();
            if (this.p.g()) {
                this.f.cancel();
            }
            this.f = ValueAnimator.ofInt(0);
            this.i.b(eguVar.j(1));
            if (eguVar.al == 2) {
                jmw.d(this.h, new Runnable(this, eguVar, z) { // from class: eee
                    private final eeo a;
                    private final egu b;
                    private final boolean c;

                    {
                        this.a = this;
                        this.b = eguVar;
                        this.c = z;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c(this.b, this.c);
                    }
                });
                return;
            } else {
                c(eguVar, z);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
