package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: ehz  reason: default package */
/* loaded from: classes6.dex */
public class ehz extends adw {
    private static TimeInterpolator n;
    private final ArrayList<acl> o = new ArrayList<>();
    private final ArrayList<acl> p = new ArrayList<>();
    private final ArrayList<ehy> q = new ArrayList<>();
    private final ArrayList<ehx> r = new ArrayList<>();
    ArrayList<ArrayList<acl>> a = new ArrayList<>();
    ArrayList<ArrayList<ehy>> b = new ArrayList<>();
    ArrayList<ArrayList<ehx>> c = new ArrayList<>();
    ArrayList<acl> d = new ArrayList<>();
    ArrayList<acl> e = new ArrayList<>();
    ArrayList<acl> f = new ArrayList<>();
    ArrayList<acl> g = new ArrayList<>();

    static final void C(List<acl> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).a.animate().cancel();
            } else {
                return;
            }
        }
    }

    private final void D(List<ehx> list, acl aclVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ehx ehxVar = list.get(size);
                if (F(ehxVar, aclVar) && ehxVar.a == null && ehxVar.b == null) {
                    list.remove(ehxVar);
                }
            } else {
                return;
            }
        }
    }

    private final void E(ehx ehxVar) {
        acl aclVar = ehxVar.a;
        if (aclVar != null) {
            F(ehxVar, aclVar);
        }
        acl aclVar2 = ehxVar.b;
        if (aclVar2 != null) {
            F(ehxVar, aclVar2);
        }
    }

    private final boolean F(ehx ehxVar, acl aclVar) {
        if (ehxVar.b == aclVar) {
            ehxVar.b = null;
        } else if (ehxVar.a != aclVar) {
            return false;
        } else {
            ehxVar.a = null;
        }
        aclVar.a.setAlpha(1.0f);
        aclVar.a.setTranslationX(0.0f);
        aclVar.a.setTranslationY(0.0f);
        p(aclVar);
        return true;
    }

    private final void G(acl aclVar) {
        if (n == null) {
            n = new ValueAnimator().getInterpolator();
        }
        aclVar.a.animate().setInterpolator(n);
        f(aclVar);
    }

    protected void A(acl aclVar) {
        aclVar.a.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        if (!g()) {
            t();
        }
    }

    @Override // defpackage.abn
    public final void a() {
        View view;
        boolean z = !this.o.isEmpty();
        boolean z2 = !this.q.isEmpty();
        boolean z3 = !this.r.isEmpty();
        boolean z4 = !this.p.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList<acl> arrayList = this.o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                acl aclVar = arrayList.get(i);
                ViewPropertyAnimator h = h(aclVar);
                this.f.add(aclVar);
                h.setDuration(this.i).setListener(new ehs(this, aclVar, h)).start();
            }
            this.o.clear();
            if (z2) {
                final ArrayList<ehy> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.q);
                this.b.add(arrayList2);
                this.q.clear();
                Runnable runnable = new Runnable(this, arrayList2) { // from class: ehp
                    private final ehz a;
                    private final ArrayList b;

                    {
                        this.a = this;
                        this.b = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ehz ehzVar = this.a;
                        ArrayList arrayList3 = this.b;
                        int size2 = arrayList3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ehy ehyVar = (ehy) arrayList3.get(i2);
                            acl aclVar2 = ehyVar.a;
                            int i3 = ehyVar.b;
                            int i4 = ehyVar.c;
                            int i5 = ehyVar.d;
                            int i6 = ehyVar.e;
                            View view2 = aclVar2.a;
                            int i7 = i5 - i3;
                            int i8 = i6 - i4;
                            if (i7 != 0) {
                                view2.animate().translationX(0.0f);
                            }
                            if (i8 != 0) {
                                view2.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate = view2.animate();
                            ehzVar.e.add(aclVar2);
                            animate.setDuration(ehzVar.j).setListener(new ehu(ehzVar, aclVar2, i7, view2, i8, animate)).start();
                        }
                        arrayList3.clear();
                        ehzVar.b.remove(arrayList3);
                    }
                };
                if (z) {
                    od.k(arrayList2.get(0).a.a, runnable, this.i);
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<ehx> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.r);
                this.c.add(arrayList3);
                this.r.clear();
                Runnable runnable2 = new Runnable(this, arrayList3) { // from class: ehq
                    private final ehz a;
                    private final ArrayList b;

                    {
                        this.a = this;
                        this.b = arrayList3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ehz ehzVar = this.a;
                        ArrayList arrayList4 = this.b;
                        int size2 = arrayList4.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ehx ehxVar = (ehx) arrayList4.get(i2);
                            acl aclVar2 = ehxVar.a;
                            View view2 = null;
                            View view3 = aclVar2 == null ? null : aclVar2.a;
                            acl aclVar3 = ehxVar.b;
                            if (aclVar3 != null) {
                                view2 = aclVar3.a;
                            }
                            if (view3 != null) {
                                ViewPropertyAnimator duration = view3.animate().setDuration(ehzVar.k);
                                acl aclVar4 = ehxVar.a;
                                if (aclVar4 != null) {
                                    ehzVar.g.add(aclVar4);
                                    duration.translationX(ehxVar.e - ehxVar.c);
                                    duration.translationY(ehxVar.f - ehxVar.d);
                                    duration.alpha(0.0f).setListener(new ehv(ehzVar, ehxVar, duration, view3)).start();
                                }
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                acl aclVar5 = ehxVar.b;
                                if (aclVar5 != null) {
                                    ehzVar.g.add(aclVar5);
                                    animate.translationX(0.0f).translationY(0.0f).setDuration(ehzVar.k).alpha(1.0f).setListener(new ehw(ehzVar, ehxVar, animate, view2)).start();
                                }
                            }
                        }
                        arrayList4.clear();
                        ehzVar.c.remove(arrayList4);
                    }
                };
                if (z) {
                    acl aclVar2 = arrayList3.get(0).a;
                    if (aclVar2 != null) {
                        od.k(aclVar2.a, runnable2, this.i);
                    }
                } else {
                    runnable2.run();
                }
            }
            if (!z4) {
                return;
            }
            final ArrayList<acl> arrayList4 = new ArrayList<>();
            arrayList4.addAll(this.p);
            this.a.add(arrayList4);
            this.p.clear();
            Runnable runnable3 = new Runnable(this, arrayList4) { // from class: ehr
                private final ehz a;
                private final ArrayList b;

                {
                    this.a = this;
                    this.b = arrayList4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ehz ehzVar = this.a;
                    ArrayList arrayList5 = this.b;
                    int size2 = arrayList5.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        acl aclVar3 = (acl) arrayList5.get(i2);
                        View view2 = aclVar3.a;
                        ViewPropertyAnimator k = ehzVar.k(aclVar3);
                        ehzVar.d.add(aclVar3);
                        k.setDuration(ehzVar.h).setListener(new eht(ehzVar, aclVar3, view2, k)).start();
                    }
                    arrayList5.clear();
                    ehzVar.a.remove(arrayList5);
                }
            };
            if (z || z2 || z3) {
                long j = 0;
                long j2 = z ? this.i : 0L;
                long j3 = z2 ? this.j : 0L;
                if (z3) {
                    j = this.k;
                }
                long max = j2 + Math.max(j3, j);
                Iterator<acl> it = arrayList4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view = null;
                        break;
                    }
                    acl next = it.next();
                    if (od.ak(next.a)) {
                        view = next.a;
                        break;
                    }
                }
                if (view != null) {
                    od.k(view, runnable3, max);
                    return;
                } else {
                    runnable3.run();
                    return;
                }
            }
            runnable3.run();
        }
    }

    @Override // defpackage.adw
    public final boolean b(acl aclVar) {
        G(aclVar);
        this.o.add(aclVar);
        return true;
    }

    @Override // defpackage.adw
    public final boolean c(acl aclVar) {
        G(aclVar);
        A(aclVar);
        this.p.add(aclVar);
        return true;
    }

    @Override // defpackage.adw
    public final boolean d(acl aclVar, int i, int i2, int i3, int i4) {
        View view = aclVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) aclVar.a.getTranslationY());
        G(aclVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                x(aclVar);
                return false;
            }
            i5 = 0;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.q.add(new ehy(aclVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.adw
    public final boolean e(acl aclVar, acl aclVar2, int i, int i2, int i3, int i4) {
        if (aclVar == aclVar2) {
            return d(aclVar, i, i2, i3, i4);
        }
        float translationX = aclVar.a.getTranslationX();
        float translationY = aclVar.a.getTranslationY();
        float alpha = aclVar.a.getAlpha();
        G(aclVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        aclVar.a.setTranslationX(translationX);
        aclVar.a.setTranslationY(translationY);
        aclVar.a.setAlpha(alpha);
        if (aclVar2 != null) {
            G(aclVar2);
            aclVar2.a.setTranslationX(-i5);
            aclVar2.a.setTranslationY(-i6);
            aclVar2.a.setAlpha(0.0f);
        }
        this.r.add(new ehx(aclVar, aclVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.abn
    public final void f(acl aclVar) {
        View view = aclVar.a;
        view.animate().cancel();
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.q.get(size).a == aclVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                x(aclVar);
                this.q.remove(size);
            }
        }
        D(this.r, aclVar);
        if (this.o.remove(aclVar)) {
            view.setAlpha(1.0f);
            p(aclVar);
        }
        if (this.p.remove(aclVar)) {
            view.setAlpha(1.0f);
            p(aclVar);
        }
        int size2 = this.c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<ehx> arrayList = this.c.get(size2);
            D(arrayList, aclVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        int size3 = this.b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<ehy> arrayList2 = this.b.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == aclVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    x(aclVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                }
            }
        }
        int size5 = this.a.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<acl> arrayList3 = this.a.get(size5);
                if (arrayList3.remove(aclVar)) {
                    view.setAlpha(1.0f);
                    p(aclVar);
                    if (arrayList3.isEmpty()) {
                        this.a.remove(size5);
                    }
                }
            } else {
                this.f.remove(aclVar);
                this.d.remove(aclVar);
                this.g.remove(aclVar);
                this.e.remove(aclVar);
                B();
                return;
            }
        }
    }

    @Override // defpackage.abn
    public final boolean g() {
        return !this.p.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    protected ViewPropertyAnimator h(acl aclVar) {
        return aclVar.a.animate().alpha(0.0f);
    }

    @Override // defpackage.abn
    public final void i() {
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ehy ehyVar = this.q.get(size);
            View view = ehyVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(ehyVar.a);
            this.q.remove(size);
        }
        int size2 = this.o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            p(this.o.get(size2));
            this.o.remove(size2);
        }
        int size3 = this.p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            acl aclVar = this.p.get(size3);
            aclVar.a.setAlpha(1.0f);
            p(aclVar);
            this.p.remove(size3);
        }
        int size4 = this.r.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            E(this.r.get(size4));
        }
        this.r.clear();
        if (!g()) {
            return;
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<ehy> arrayList = this.b.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    ehy ehyVar2 = arrayList.get(size6);
                    View view2 = ehyVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    x(ehyVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.a.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<acl> arrayList2 = this.a.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    acl aclVar2 = arrayList2.get(size8);
                    aclVar2.a.setAlpha(1.0f);
                    p(aclVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.c.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList<ehx> arrayList3 = this.c.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        E(arrayList3.get(size10));
                        if (arrayList3.isEmpty()) {
                            this.c.remove(arrayList3);
                        }
                    }
                }
            } else {
                C(this.f);
                C(this.e);
                C(this.d);
                C(this.g);
                t();
                return;
            }
        }
    }

    @Override // defpackage.abn
    public final boolean j(acl aclVar, List<Object> list) {
        return !list.isEmpty() || s(aclVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewPropertyAnimator k(acl aclVar) {
        return aclVar.a.animate().alpha(1.0f);
    }
}
