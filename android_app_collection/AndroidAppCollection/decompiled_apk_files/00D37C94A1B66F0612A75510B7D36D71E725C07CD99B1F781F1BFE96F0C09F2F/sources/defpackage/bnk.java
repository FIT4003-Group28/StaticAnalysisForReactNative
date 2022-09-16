package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bnk  reason: default package */
/* loaded from: classes2.dex */
public abstract class bnk implements Cloneable {
    public ArrayList j;
    public ArrayList k;
    public adj n;
    private static final int[] p = {2, 1, 3, 4};
    private static final adi x = new adi();
    private static final ThreadLocal q = new ThreadLocal();
    private final String r = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    private ArrayList s = null;
    public bnu f = new bnu();
    public bnu g = new bnu();
    bnr h = null;
    public final int[] i = p;
    final ArrayList l = new ArrayList();
    private int t = 0;
    private boolean u = false;
    private boolean v = false;
    public ArrayList m = null;
    private ArrayList w = new ArrayList();
    public adi o = x;

    private static boolean I(bnt bntVar, bnt bntVar2, String str) {
        Object obj = bntVar.a.get(str);
        Object obj2 = bntVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    private static void e(bnu bnuVar, View view, bnt bntVar) {
        bnuVar.a.put(view, bntVar);
        int id = view.getId();
        if (id >= 0) {
            if (bnuVar.b.indexOfKey(id) >= 0) {
                bnuVar.b.put(id, null);
            } else {
                bnuVar.b.put(id, view);
            }
        }
        String w = lj.w(view);
        if (w != null) {
            if (bnuVar.d.containsKey(w)) {
                bnuVar.d.put(w, null);
            } else {
                bnuVar.d.put(w, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (bnuVar.c.a(itemIdAtPosition) >= 0) {
                View view2 = (View) bnuVar.c.f(itemIdAtPosition);
                if (view2 == null) {
                    return;
                }
                lj.U(view2, false);
                bnuVar.c.k(itemIdAtPosition, null);
                return;
            }
            lj.U(view, true);
            bnuVar.c.k(itemIdAtPosition, view);
        }
    }

    private final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.s;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            bnt bntVar = new bnt(view);
            if (z) {
                c(bntVar);
            } else {
                b(bntVar);
            }
            bntVar.c.add(this);
            l(bntVar);
            if (z) {
                e(this.f, view, bntVar);
            } else {
                e(this.g, view, bntVar);
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            f(viewGroup.getChildAt(i), z);
        }
    }

    public static afw g() {
        ThreadLocal threadLocal = q;
        afw afwVar = (afw) threadLocal.get();
        if (afwVar == null) {
            afw afwVar2 = new afw();
            threadLocal.set(afwVar2);
            return afwVar2;
        }
        return afwVar;
    }

    public final void A() {
        ArrayList arrayList = this.s;
        Integer valueOf = Integer.valueOf((int) R.id.button_container);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(valueOf)) {
            arrayList.add(valueOf);
        }
        this.s = arrayList;
    }

    public final void B(bnj bnjVar) {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bnjVar);
        if (this.m.size() != 0) {
            return;
        }
        this.m = null;
    }

    public void C(long j) {
        this.b = j;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void E() {
    }

    public void F(long j) {
        this.a = j;
    }

    public void G(adj adjVar) {
        this.n = null;
    }

    public void H(adi adiVar) {
        if (adiVar == null) {
            this.o = x;
        } else {
            this.o = adiVar;
        }
    }

    public Animator a(ViewGroup viewGroup, bnt bntVar, bnt bntVar2) {
        return null;
    }

    public abstract void b(bnt bntVar);

    public abstract void c(bnt bntVar);

    public String[] d() {
        return null;
    }

    @Override // 
    /* renamed from: h */
    public bnk clone() {
        try {
            bnk bnkVar = (bnk) super.clone();
            bnkVar.w = new ArrayList();
            bnkVar.f = new bnu();
            bnkVar.g = new bnu();
            bnkVar.j = null;
            bnkVar.k = null;
            return bnkVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bnt i(View view, boolean z) {
        bnr bnrVar = this.h;
        if (bnrVar != null) {
            return bnrVar.i(view, z);
        }
        ArrayList arrayList = z ? this.j : this.k;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            bnt bntVar = (bnt) arrayList.get(i);
            if (bntVar == null) {
                return null;
            }
            if (bntVar.b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return (bnt) (z ? this.k : this.j).get(i);
    }

    public final bnt j(View view, boolean z) {
        bnr bnrVar = this.h;
        if (bnrVar != null) {
            return bnrVar.j(view, z);
        }
        return (bnt) (z ? this.f : this.g).a.get(view);
    }

    public String k(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str2 = str2 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str2 = str2 + "dly(" + this.a + ") ";
        }
        if (this.c != null) {
            str2 = str2 + "interp(" + this.c + ") ";
        }
        if (this.d.size() > 0 || this.e.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.d.size() > 0) {
                for (int i = 0; i < this.d.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.d.get(i);
                }
            }
            if (this.e.size() > 0) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.e.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public void l(bnt bntVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ViewGroup viewGroup, boolean z) {
        n(z);
        if (this.d.size() > 0 || this.e.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
                if (findViewById != null) {
                    bnt bntVar = new bnt(findViewById);
                    if (z) {
                        c(bntVar);
                    } else {
                        b(bntVar);
                    }
                    bntVar.c.add(this);
                    l(bntVar);
                    if (z) {
                        e(this.f, findViewById, bntVar);
                    } else {
                        e(this.g, findViewById, bntVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View view = (View) this.e.get(i2);
                bnt bntVar2 = new bnt(view);
                if (z) {
                    c(bntVar2);
                } else {
                    b(bntVar2);
                }
                bntVar2.c.add(this);
                l(bntVar2);
                if (z) {
                    e(this.f, view, bntVar2);
                } else {
                    e(this.g, view, bntVar2);
                }
            }
            return;
        }
        f(viewGroup, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        if (z) {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.j();
            return;
        }
        this.g.a.clear();
        this.g.b.clear();
        this.g.c.j();
    }

    public void o(ViewGroup viewGroup, bnu bnuVar, bnu bnuVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        bnt bntVar;
        int i;
        Animator animator2;
        bnt bntVar2;
        afw g = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bnt bntVar3 = (bnt) arrayList.get(i2);
            bnt bntVar4 = (bnt) arrayList2.get(i2);
            if (bntVar3 != null && !bntVar3.c.contains(this)) {
                bntVar3 = null;
            }
            if (bntVar4 != null && !bntVar4.c.contains(this)) {
                bntVar4 = null;
            }
            if ((bntVar3 != null || bntVar4 != null) && (bntVar3 == null || bntVar4 == null || v(bntVar3, bntVar4))) {
                Animator a = a(viewGroup, bntVar3, bntVar4);
                if (a != null) {
                    if (bntVar4 != null) {
                        View view2 = bntVar4.b;
                        String[] d = d();
                        if (d != null) {
                            bnt bntVar5 = new bnt(view2);
                            bnt bntVar6 = (bnt) bnuVar2.a.get(view2);
                            if (bntVar6 != null) {
                                int i3 = 0;
                                while (i3 < d.length) {
                                    Map map = bntVar5.a;
                                    Animator animator3 = a;
                                    String str = d[i3];
                                    map.put(str, bntVar6.a.get(str));
                                    i3++;
                                    a = animator3;
                                    d = d;
                                }
                            }
                            animator2 = a;
                            int i4 = g.j;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    bntVar2 = bntVar5;
                                    break;
                                }
                                bni bniVar = (bni) g.get((Animator) g.f(i5));
                                if (bniVar.c != null && bniVar.a == view2 && bniVar.b.equals(this.r) && bniVar.c.equals(bntVar5)) {
                                    bntVar2 = bntVar5;
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            animator2 = a;
                            bntVar2 = null;
                        }
                        view = view2;
                        bntVar = bntVar2;
                        animator = animator2;
                    } else {
                        view = bntVar3.b;
                        animator = a;
                        bntVar = null;
                    }
                    if (animator != null) {
                        i = size;
                        g.put(animator, new bni(view, this.r, this, bny.e(viewGroup), bntVar));
                        this.w.add(animator);
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = (Animator) this.w.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((sparseIntArray.valueAt(i6) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        int i = this.t - 1;
        this.t = i;
        if (i == 0) {
            ArrayList arrayList = this.m;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.m.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bnj) arrayList2.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.f.c.c(); i3++) {
                View view = (View) this.f.c.h(i3);
                if (view != null) {
                    lj.U(view, false);
                }
            }
            for (int i4 = 0; i4 < this.g.c.c(); i4++) {
                View view2 = (View) this.g.c.h(i4);
                if (view2 != null) {
                    lj.U(view2, false);
                }
            }
            this.v = true;
        }
    }

    public void q(ViewGroup viewGroup) {
        afw g = g();
        int i = g.j;
        if (viewGroup == null || i == 0) {
            return;
        }
        boi e = bny.e(viewGroup);
        afw afwVar = new afw(g);
        g.clear();
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            bni bniVar = (bni) afwVar.i(i);
            if (bniVar.a != null && e.equals(bniVar.e)) {
                ((Animator) afwVar.f(i)).end();
            }
        }
    }

    public void r(View view) {
        if (!this.v) {
            int size = this.l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((Animator) this.l.get(size)).pause();
            }
            ArrayList arrayList = this.m;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.m.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((bnj) arrayList2.get(i)).c();
                }
            }
            this.u = true;
        }
    }

    public void s(View view) {
        if (this.u) {
            if (!this.v) {
                int size = this.l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((Animator) this.l.get(size)).resume();
                }
                ArrayList arrayList = this.m;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.m.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((bnj) arrayList2.get(i)).d();
                    }
                }
            }
            this.u = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        u();
        afw g = g();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (g.containsKey(animator)) {
                u();
                if (animator != null) {
                    animator.addListener(new bng(this, g));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new bnh(this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        p();
    }

    public final String toString() {
        return k("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        if (this.t == 0) {
            ArrayList arrayList = this.m;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.m.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((bnj) arrayList2.get(i)).e();
                }
            }
            this.v = false;
        }
        this.t++;
    }

    public boolean v(bnt bntVar, bnt bntVar2) {
        if (bntVar != null && bntVar2 != null) {
            String[] d = d();
            if (d != null) {
                for (String str : d) {
                    if (I(bntVar, bntVar2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : bntVar.a.keySet()) {
                    if (I(bntVar, bntVar2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.s;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(id)) || this.e.contains(view);
        }
        return false;
    }

    public final void x(bnj bnjVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(bnjVar);
    }

    public void y(int i) {
        this.d.add(Integer.valueOf(i));
    }

    public void z(View view) {
        this.e.add(view);
    }
}
