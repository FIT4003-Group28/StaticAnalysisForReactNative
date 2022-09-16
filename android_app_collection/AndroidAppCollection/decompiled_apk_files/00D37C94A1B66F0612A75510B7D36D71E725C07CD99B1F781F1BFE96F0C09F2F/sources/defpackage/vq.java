package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vq  reason: default package */
/* loaded from: classes4.dex */
public class vq extends zn {
    private static TimeInterpolator l;
    ArrayList a;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    ArrayList g;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;

    public vq() {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    private final void A(yo yoVar) {
        if (l == null) {
            l = new ValueAnimator().getInterpolator();
        }
        yoVar.a.animate().setInterpolator(l);
        b(yoVar);
    }

    private final boolean B(vo voVar, yo yoVar) {
        if (voVar.b == yoVar) {
            voVar.b = null;
        } else if (voVar.a != yoVar) {
            return false;
        } else {
            voVar.a = null;
        }
        yoVar.a.setAlpha(1.0f);
        yoVar.a.setTranslationX(0.0f);
        yoVar.a.setTranslationY(0.0f);
        l(yoVar);
        return true;
    }

    static final void k(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((yo) list.get(size)).a.animate().cancel();
            } else {
                return;
            }
        }
    }

    private final void y(List list, yo yoVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                vo voVar = (vo) list.get(size);
                if (B(voVar, yoVar) && voVar.a == null && voVar.b == null) {
                    list.remove(voVar);
                }
            } else {
                return;
            }
        }
    }

    private final void z(vo voVar) {
        yo yoVar = voVar.a;
        if (yoVar != null) {
            B(voVar, yoVar);
        }
        yo yoVar2 = voVar.b;
        if (yoVar2 != null) {
            B(voVar, yoVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!j()) {
            m();
        }
    }

    @Override // defpackage.xs
    public final void b(yo yoVar) {
        View view = yoVar.a;
        view.animate().cancel();
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((vp) this.o.get(size)).a == yoVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                l(yoVar);
                this.o.remove(size);
            }
        }
        y(this.p, yoVar);
        if (this.m.remove(yoVar)) {
            view.setAlpha(1.0f);
            l(yoVar);
        }
        if (this.n.remove(yoVar)) {
            view.setAlpha(1.0f);
            l(yoVar);
        }
        int size2 = this.c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            y(arrayList, yoVar);
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
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((vp) arrayList2.get(size4)).a == yoVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    l(yoVar);
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
                ArrayList arrayList3 = (ArrayList) this.a.get(size5);
                if (arrayList3.remove(yoVar)) {
                    view.setAlpha(1.0f);
                    l(yoVar);
                    if (arrayList3.isEmpty()) {
                        this.a.remove(size5);
                    }
                }
            } else {
                this.f.remove(yoVar);
                this.d.remove(yoVar);
                this.g.remove(yoVar);
                this.e.remove(yoVar);
                a();
                return;
            }
        }
    }

    @Override // defpackage.xs
    public final void c() {
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            vp vpVar = (vp) this.o.get(size);
            View view = vpVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            l(vpVar.a);
            this.o.remove(size);
        }
        int size2 = this.m.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            l((yo) this.m.get(size2));
            this.m.remove(size2);
        }
        int size3 = this.n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            yo yoVar = (yo) this.n.get(size3);
            yoVar.a.setAlpha(1.0f);
            l(yoVar);
            this.n.remove(size3);
        }
        int size4 = this.p.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            z((vo) this.p.get(size4));
        }
        this.p.clear();
        if (!j()) {
            return;
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.b.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    vp vpVar2 = (vp) arrayList.get(size6);
                    View view2 = vpVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    l(vpVar2.a);
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
            ArrayList arrayList2 = (ArrayList) this.a.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    yo yoVar2 = (yo) arrayList2.get(size8);
                    yoVar2.a.setAlpha(1.0f);
                    l(yoVar2);
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
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        z((vo) arrayList3.get(size10));
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
                m();
                return;
            }
        }
    }

    @Override // defpackage.xs
    public final void d() {
        long j;
        boolean isEmpty = this.m.isEmpty();
        boolean z = !isEmpty;
        boolean z2 = !this.o.isEmpty();
        boolean isEmpty2 = this.p.isEmpty();
        boolean z3 = !isEmpty2;
        boolean z4 = !this.n.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                j = 120;
                if (i >= size) {
                    break;
                }
                yo yoVar = (yo) arrayList.get(i);
                View view = yoVar.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(yoVar);
                animate.setDuration(120L).alpha(0.0f).setListener(new vj(this, yoVar, animate, view)).start();
                i++;
            }
            this.m.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.o);
                this.b.add(arrayList2);
                this.o.clear();
                vi viVar = new vi(this, arrayList2, 1);
                if (z) {
                    lj.I(((vp) arrayList2.get(0)).a.a, viVar, 120L);
                } else {
                    viVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.p);
                this.c.add(arrayList3);
                this.p.clear();
                vi viVar2 = new vi(this, arrayList3);
                if (z) {
                    lj.I(((vo) arrayList3.get(0)).a.a, viVar2, 120L);
                } else {
                    viVar2.run();
                }
            }
            if (!z4) {
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(this.n);
            this.a.add(arrayList4);
            this.n.clear();
            vi viVar3 = new vi(this, arrayList4, 2);
            if (z || z2 || z3) {
                long j2 = 0;
                if (true == isEmpty) {
                    j = 0;
                }
                long j3 = z2 ? this.i : 0L;
                if (true != isEmpty2) {
                    j2 = 250;
                }
                lj.I(((yo) arrayList4.get(0)).a, viVar3, j + Math.max(j3, j2));
                return;
            }
            viVar3.run();
        }
    }

    @Override // defpackage.zn
    public final boolean e(yo yoVar) {
        A(yoVar);
        yoVar.a.setAlpha(0.0f);
        this.n.add(yoVar);
        return true;
    }

    @Override // defpackage.zn
    public final boolean f(yo yoVar, yo yoVar2, int i, int i2, int i3, int i4) {
        if (yoVar == yoVar2) {
            return g(yoVar, i, i2, i3, i4);
        }
        float translationX = yoVar.a.getTranslationX();
        float translationY = yoVar.a.getTranslationY();
        float alpha = yoVar.a.getAlpha();
        A(yoVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        yoVar.a.setTranslationX(translationX);
        yoVar.a.setTranslationY(translationY);
        yoVar.a.setAlpha(alpha);
        if (yoVar2 != null) {
            A(yoVar2);
            yoVar2.a.setTranslationX(-i5);
            yoVar2.a.setTranslationY(-i6);
            yoVar2.a.setAlpha(0.0f);
        }
        this.p.add(new vo(yoVar, yoVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.zn
    public final boolean g(yo yoVar, int i, int i2, int i3, int i4) {
        View view = yoVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) yoVar.a.getTranslationY());
        A(yoVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                l(yoVar);
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
        this.o.add(new vp(yoVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.zn
    public boolean h(yo yoVar) {
        A(yoVar);
        this.m.add(yoVar);
        return true;
    }

    @Override // defpackage.xs
    public final boolean i(yo yoVar, List list) {
        return !list.isEmpty() || s(yoVar);
    }

    @Override // defpackage.xs
    public final boolean j() {
        return !this.n.isEmpty() || !this.p.isEmpty() || !this.o.isEmpty() || !this.m.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    public vq(byte[] bArr) {
        this();
        x();
    }

    public vq(char[] cArr) {
        this();
        x();
    }
}
