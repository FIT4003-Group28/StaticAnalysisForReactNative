package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agbj  reason: default package */
/* loaded from: classes2.dex */
public class agbj {
    public final akpm a;
    public final dxio<axsc> b;
    public final dxio<braw> c;
    @dzsi
    public ahac d;
    @dzsi
    public agbi e;
    private final Activity f;
    private final btrm g;
    private final ghl h;
    private final dxio<akzh> i;
    private final hwe j;
    private final float[] k = new float[8];
    private final agbh l = new agbh(this);
    private boolean m;

    public agbj(Activity activity, btrm btrmVar, ghl ghlVar, dxio<akzh> dxioVar, akpm akpmVar, hwe hweVar, dxio<axsc> dxioVar2, dxio<braw> dxioVar3) {
        this.f = activity;
        this.g = btrmVar;
        this.h = ghlVar;
        this.i = dxioVar;
        this.a = akpmVar;
        this.j = hweVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
    }

    private static void j(List<agbs> list, @dzsi View view, @dzsi View view2, @dzsi agbs agbsVar) {
        if (view == null || view2 == null || agbsVar == null) {
            return;
        }
        agbs agbsVar2 = new agbs(view);
        agbsVar2.b(view2);
        agbsVar2.e = agbsVar;
        list.add(agbsVar2);
    }

    private static void k(@dzsi View view) {
        if (view == null) {
            return;
        }
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setListener(new agbf(view)).setDuration(375L).start();
    }

    private static void l(@dzsi View view) {
        if (view == null) {
            return;
        }
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setListener(new agbg(view)).setDuration(375L).start();
    }

    @dzsi
    private final Rect m() {
        View a;
        View findViewById = this.f.findViewById(16908290);
        if (findViewById == null || (a = cqhu.a(findViewById, agun.d)) == null) {
            return null;
        }
        float f = this.f.getResources().getDisplayMetrics().density * 50.0f;
        int i = (int) f;
        return new Rect(i, i, (int) (a.getWidth() - f), (int) (((a.getHeight() - aguj.e().a(this.f)) - aguh.a.a(this.f)) - f));
    }

    private final List<ilo> n() {
        return dcbg.b(h()).s(agay.a).z();
    }

    public final void a(ahac ahacVar, @dzsi agbi agbiVar) {
        bvrj.UI_THREAD.c();
        btrm btrmVar = this.g;
        agbh agbhVar = this.l;
        dceq a = dcet.a();
        a.b(alho.class, new agbk(alho.class, agbhVar, bvrj.UI_THREAD));
        btrmVar.g(agbhVar, a.a());
        this.d = ahacVar;
        this.e = agbiVar;
        g(ahacVar.u().f().intValue(), false);
        this.m = false;
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        this.b.a().e(true);
        this.g.a(this.l);
        this.d = null;
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.agxe r18, @defpackage.dzsi android.view.View r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbj.c(agxe, android.view.View):void");
    }

    public final void d() {
        View findViewById;
        View view;
        bvrj.UI_THREAD.c();
        ahac ahacVar = this.d;
        dbsk.s(ahacVar);
        agxe t = ahacVar.t();
        if (t == null || this.m || (findViewById = this.f.findViewById(16908290)) == null) {
            return;
        }
        View a = cqhu.a(findViewById, agun.a);
        View a2 = cqhu.a(findViewById, agun.b);
        ahac ahacVar2 = this.d;
        dbsk.s(ahacVar2);
        if (a != null) {
            for (View view2 : agxk.k(a, agta.class)) {
                if (cqkx.i(view2) == t) {
                    view = view2;
                    break;
                }
            }
        }
        view = null;
        if (view != null) {
            ahac ahacVar3 = this.d;
            dbsk.s(ahacVar3);
            t.i(view, ahacVar3.u().f().intValue());
        }
        agbd agbdVar = new agbd(this, findViewById, a, a2, view, ahacVar2);
        this.m = true;
        l(a2);
        k(a);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(agbdVar);
        findViewById.requestLayout();
    }

    public final void e(egj egjVar) {
        ahac ahacVar = this.d;
        dbsk.s(ahacVar);
        if (ahacVar.u().a().booleanValue()) {
            brau d = brav.d();
            d.d(n());
            egjVar.S(d.a());
        }
        egjVar.J(new egq(this) { // from class: agax
            private final agbj a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.b.a().e(false);
            }
        });
    }

    public final void f(boolean z, @dzsi View view, @dzsi View view2, @dzsi View view3, @dzsi Runnable runnable) {
        dbsi a;
        dbsi a2;
        if (view == null || view2 == null || view3 == null) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        View a3 = cqhu.a(view3, agta.a);
        View a4 = cqhu.a(view2, agta.a);
        if (a3 != null && a4 != null) {
            agbs agbsVar = new agbs(a3);
            agbsVar.c = agbsVar.a(a4, false);
            agbs agbsVar2 = new agbs(a4);
            agbsVar2.b = agbsVar2.a(a3, false);
            a = dbsi.a(agbsVar, agbsVar2);
        } else {
            a = dbsi.a(null, null);
        }
        A a5 = a.a;
        if (a5 != 0 && a.b != 0) {
            arrayList.add((agbs) a5);
            arrayList.add((agbs) a.b);
            j(arrayList, cqhu.a(view3, agta.d), cqhu.a(view2, agun.c), (agbs) a.a);
            View a6 = cqhu.a(view3, agta.b);
            View a7 = cqhu.a(view2, agun.c);
            agbs agbsVar3 = (agbs) a.a;
            agbs agbsVar4 = (agbs) a.b;
            if (a6 != null && a7 != null) {
                agbs agbsVar5 = new agbs(a6);
                agbsVar5.b(a7);
                agbsVar5.e = agbsVar3;
                agbs agbsVar6 = new agbs(a7);
                agbsVar6.b = agbsVar6.a(a6, true);
                agbsVar6.e = agbsVar4;
                a2 = dbsi.a(agbsVar5, agbsVar6);
            } else {
                a2 = dbsi.a(null, null);
            }
            A a8 = a2.a;
            if (a8 != 0 && a2.b != 0) {
                arrayList.add((agbs) a8);
                arrayList.add((agbs) a2.b);
            }
            j(arrayList, cqhu.a(view3, agta.c), cqhu.a(view2, agun.c), (agbs) a.a);
        }
        View a9 = cqhu.a(view3, agta.e);
        if (a9 != null) {
            float f = this.f.getResources().getDisplayMetrics().density * this.f.getResources().getConfiguration().screenHeightDp;
            agbs agbsVar7 = new agbs(a9);
            agbsVar7.c = new RectF(agbsVar7.a.left + 0.0f, agbsVar7.a.top + f, agbsVar7.a.right + 0.0f, agbsVar7.a.bottom + f);
            agbsVar7.setInterpolator(eho.a(0.9f, 0.1f, 0.9f, 0.1f));
            arrayList.add(agbsVar7);
        }
        for (View view4 : agxk.k(view2, aguj.class)) {
            float f2 = this.f.getResources().getDisplayMetrics().density * this.f.getResources().getConfiguration().screenWidthDp;
            if (cjxu.d(view4)) {
                f2 = -f2;
            }
            agbs agbsVar8 = new agbs(view4);
            agbsVar8.b = new RectF(agbsVar8.a.left + view4.getMeasuredWidth() + f2, agbsVar8.a.top + 0.0f, agbsVar8.a.right + f2 + view4.getMeasuredWidth(), agbsVar8.a.bottom + 0.0f);
            arrayList.add(agbsVar8);
        }
        for (View view5 : agxk.k(view, agta.class, agrh.class)) {
            if (view5 != view3) {
                agbs agbsVar9 = new agbs(view5);
                agbsVar9.d = 0.0f;
                agbsVar9.setInterpolator(eho.a(0.1f, 0.9f, 0.1f, 0.9f));
                arrayList.add(agbsVar9);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                agbs agbsVar10 = (agbs) arrayList.get(i);
                agbsVar10.setInterpolator(agxk.m(agbsVar10.getInterpolator()));
            }
        }
        animatorSet.playTogether(dcdc.r(arrayList));
        animatorSet.addListener(new agbe(runnable));
        animatorSet.start();
    }

    public final void g(int i, boolean z) {
        ilo iloVar;
        akqq aj;
        List<ilo> n = n();
        if (i < 0 || i >= n.size() || (aj = (iloVar = n.get(i)).aj()) == null) {
            return;
        }
        this.j.a(iloVar.ai(), akra.f(aj));
        if (!z) {
            return;
        }
        this.h.a(aj, m());
    }

    public final List<agwu> h() {
        ahac ahacVar = this.d;
        if (ahacVar == null) {
            return dcdc.e();
        }
        return ahacVar.u().i();
    }
}
