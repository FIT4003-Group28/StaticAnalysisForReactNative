package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zc  reason: default package */
/* loaded from: classes.dex */
public class zc extends adw {
    private static TimeInterpolator n;
    private ArrayList<acl> o = new ArrayList<>();
    private ArrayList<acl> p = new ArrayList<>();
    private ArrayList<zb> q = new ArrayList<>();
    private ArrayList<za> r = new ArrayList<>();
    ArrayList<ArrayList<acl>> a = new ArrayList<>();
    ArrayList<ArrayList<zb>> b = new ArrayList<>();
    ArrayList<ArrayList<za>> c = new ArrayList<>();
    ArrayList<acl> d = new ArrayList<>();
    ArrayList<acl> e = new ArrayList<>();
    ArrayList<acl> f = new ArrayList<>();
    ArrayList<acl> g = new ArrayList<>();

    private final void A(List<za> list, acl aclVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                za zaVar = list.get(size);
                if (C(zaVar, aclVar) && zaVar.a == null && zaVar.b == null) {
                    list.remove(zaVar);
                }
            } else {
                return;
            }
        }
    }

    private final void B(za zaVar) {
        acl aclVar = zaVar.a;
        if (aclVar != null) {
            C(zaVar, aclVar);
        }
        acl aclVar2 = zaVar.b;
        if (aclVar2 != null) {
            C(zaVar, aclVar2);
        }
    }

    private final boolean C(za zaVar, acl aclVar) {
        if (zaVar.b == aclVar) {
            zaVar.b = null;
        } else if (zaVar.a != aclVar) {
            return false;
        } else {
            zaVar.a = null;
        }
        aclVar.a.setAlpha(1.0f);
        aclVar.a.setTranslationX(0.0f);
        aclVar.a.setTranslationY(0.0f);
        p(aclVar);
        return true;
    }

    private final void D(acl aclVar) {
        if (n == null) {
            n = new ValueAnimator().getInterpolator();
        }
        aclVar.a.animate().setInterpolator(n);
        f(aclVar);
    }

    static final void k(List<acl> list) {
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

    @Override // defpackage.abn
    public void a() {
        boolean z = !this.o.isEmpty();
        boolean z2 = !this.q.isEmpty();
        boolean z3 = !this.r.isEmpty();
        boolean z4 = !this.p.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList<acl> arrayList = this.o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                acl aclVar = arrayList.get(i);
                View view = aclVar.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(aclVar);
                animate.setDuration(this.i).alpha(0.0f).setListener(new yv(this, aclVar, animate, view)).start();
            }
            this.o.clear();
            if (z2) {
                ArrayList<zb> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.q);
                this.b.add(arrayList2);
                this.q.clear();
                ys ysVar = new ys(this, arrayList2);
                if (z) {
                    od.k(arrayList2.get(0).a.a, ysVar, this.i);
                } else {
                    ysVar.run();
                }
            }
            if (z3) {
                ArrayList<za> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.r);
                this.c.add(arrayList3);
                this.r.clear();
                yt ytVar = new yt(this, arrayList3);
                if (z) {
                    od.k(arrayList3.get(0).a.a, ytVar, this.i);
                } else {
                    ytVar.run();
                }
            }
            if (!z4) {
                return;
            }
            ArrayList<acl> arrayList4 = new ArrayList<>();
            arrayList4.addAll(this.p);
            this.a.add(arrayList4);
            this.p.clear();
            yu yuVar = new yu(this, arrayList4);
            if (z || z2 || z3) {
                long j = 0;
                long j2 = z ? this.i : 0L;
                long j3 = z2 ? this.j : 0L;
                if (z3) {
                    j = this.k;
                }
                od.k(arrayList4.get(0).a, yuVar, j2 + Math.max(j3, j));
                return;
            }
            yuVar.run();
        }
    }

    @Override // defpackage.adw
    public boolean b(acl aclVar) {
        D(aclVar);
        this.o.add(aclVar);
        return true;
    }

    @Override // defpackage.adw
    public final boolean c(acl aclVar) {
        D(aclVar);
        aclVar.a.setAlpha(0.0f);
        this.p.add(aclVar);
        return true;
    }

    @Override // defpackage.adw
    public boolean d(acl aclVar, int i, int i2, int i3, int i4) {
        View view = aclVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) aclVar.a.getTranslationY());
        D(aclVar);
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
        this.q.add(new zb(aclVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.adw
    public boolean e(acl aclVar, acl aclVar2, int i, int i2, int i3, int i4) {
        if (aclVar == aclVar2) {
            return d(aclVar, i, i2, i3, i4);
        }
        float translationX = aclVar.a.getTranslationX();
        float translationY = aclVar.a.getTranslationY();
        float alpha = aclVar.a.getAlpha();
        D(aclVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        aclVar.a.setTranslationX(translationX);
        aclVar.a.setTranslationY(translationY);
        aclVar.a.setAlpha(alpha);
        if (aclVar2 != null) {
            D(aclVar2);
            aclVar2.a.setTranslationX(-i5);
            aclVar2.a.setTranslationY(-i6);
            aclVar2.a.setAlpha(0.0f);
        }
        this.r.add(new za(aclVar, aclVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.abn
    public void f(acl aclVar) {
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
        A(this.r, aclVar);
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
            ArrayList<za> arrayList = this.c.get(size2);
            A(arrayList, aclVar);
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
            ArrayList<zb> arrayList2 = this.b.get(size3);
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
                h();
                return;
            }
        }
    }

    @Override // defpackage.abn
    public boolean g() {
        return !this.p.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    public void h() {
        if (!g()) {
            t();
        }
    }

    @Override // defpackage.abn
    public void i() {
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            zb zbVar = this.q.get(size);
            View view = zbVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            x(zbVar.a);
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
            B(this.r.get(size4));
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
            ArrayList<zb> arrayList = this.b.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    zb zbVar2 = arrayList.get(size6);
                    View view2 = zbVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    x(zbVar2.a);
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
                ArrayList<za> arrayList3 = this.c.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        B(arrayList3.get(size10));
                        if (arrayList3.isEmpty()) {
                            this.c.remove(arrayList3);
                        }
                    }
                }
            } else {
                k(this.f);
                k(this.e);
                k(this.d);
                k(this.g);
                t();
                return;
            }
        }
    }

    @Override // defpackage.abn
    public final boolean j(acl aclVar, List<Object> list) {
        return !list.isEmpty() || s(aclVar);
    }
}
