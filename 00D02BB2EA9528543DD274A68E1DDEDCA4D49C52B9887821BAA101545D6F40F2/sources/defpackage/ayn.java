package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ayn  reason: default package */
/* loaded from: classes3.dex */
public abstract class ayn implements Cloneable {
    private static final int[] p = {2, 1, 3, 4};
    private static final axy q = new ayh();
    private static final ThreadLocal<aif<Animator, ayk>> t = new ThreadLocal<>();
    public ArrayList<ayx> j;
    public ArrayList<ayx> k;
    ays m;
    public ayl n;
    private final String r = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    final ArrayList<Integer> d = new ArrayList<>();
    final ArrayList<View> e = new ArrayList<>();
    private ArrayList<View> s = null;
    public ayy f = new ayy();
    public ayy g = new ayy();
    ayv h = null;
    public final int[] i = p;
    final ArrayList<Animator> l = new ArrayList<>();
    private int u = 0;
    private boolean v = false;
    private boolean w = false;
    private ArrayList<aym> x = null;
    private ArrayList<Animator> y = new ArrayList<>();
    public axy o = q;

    private static boolean J(ayx ayxVar, ayx ayxVar2, String str) {
        Object obj = ayxVar.a.get(str);
        Object obj2 = ayxVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    private static void e(ayy ayyVar, View view, ayx ayxVar) {
        ayyVar.a.put(view, ayxVar);
        int id = view.getId();
        if (id >= 0) {
            if (ayyVar.b.indexOfKey(id) >= 0) {
                ayyVar.b.put(id, null);
            } else {
                ayyVar.b.put(id, view);
            }
        }
        String J = od.J(view);
        if (J != null) {
            if (ayyVar.d.containsKey(J)) {
                ayyVar.d.put(J, null);
            } else {
                ayyVar.d.put(J, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (ayyVar.c.h(itemIdAtPosition) >= 0) {
                View b = ayyVar.c.b(itemIdAtPosition);
                if (b == null) {
                    return;
                }
                od.h(b, false);
                ayyVar.c.d(itemIdAtPosition, null);
                return;
            }
            od.h(view, true);
            ayyVar.c.d(itemIdAtPosition, view);
        }
    }

    private final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList<View> arrayList = this.s;
        if (arrayList != null && arrayList.contains(view)) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ayx ayxVar = new ayx(view);
            if (z) {
                b(ayxVar);
            } else {
                c(ayxVar);
            }
            ayxVar.c.add(this);
            x(ayxVar);
            if (z) {
                e(this.f, view, ayxVar);
            } else {
                e(this.g, view, ayxVar);
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

    public static aif<Animator, ayk> i() {
        ThreadLocal<aif<Animator, ayk>> threadLocal = t;
        aif<Animator, ayk> aifVar = threadLocal.get();
        if (aifVar == null) {
            aif<Animator, ayk> aifVar2 = new aif<>();
            threadLocal.set(aifVar2);
            return aifVar2;
        }
        return aifVar;
    }

    public void A(aym aymVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(aymVar);
    }

    public final void B(int i) {
        if (i != 0) {
            this.d.add(Integer.valueOf(i));
        }
    }

    public void C(View view) {
        this.e.add(view);
    }

    public final void D(View view) {
        ArrayList<View> arrayList = this.s;
        if (view != null) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
        this.s = arrayList;
    }

    public void E(aym aymVar) {
        ArrayList<aym> arrayList = this.x;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(aymVar);
        if (this.x.size() != 0) {
            return;
        }
        this.x = null;
    }

    public void F(View view) {
        this.e.remove(view);
    }

    public void G(long j) {
        this.b = j;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void I(long j) {
        this.a = j;
    }

    public String[] a() {
        return null;
    }

    public abstract void b(ayx ayxVar);

    public abstract void c(ayx ayxVar);

    public Animator d(ViewGroup viewGroup, ayx ayxVar, ayx ayxVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(ViewGroup viewGroup, ayy ayyVar, ayy ayyVar2, ArrayList<ayx> arrayList, ArrayList<ayx> arrayList2) {
        Animator d;
        int i;
        View view;
        Animator animator;
        ayx ayxVar;
        aif<Animator, ayk> aifVar;
        aif<Animator, ayk> aifVar2;
        Animator animator2;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        ayx ayxVar2;
        ViewGroup viewGroup2 = viewGroup;
        aif<Animator, ayk> i6 = i();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i7 = 0;
        while (i7 < size) {
            ayx ayxVar3 = arrayList.get(i7);
            ayx ayxVar4 = arrayList2.get(i7);
            if (ayxVar3 != null && !ayxVar3.c.contains(this)) {
                ayxVar3 = null;
            }
            if (ayxVar4 != null && !ayxVar4.c.contains(this)) {
                ayxVar4 = null;
            }
            if (!(ayxVar3 == null && ayxVar4 == null) && ((ayxVar3 == null || ayxVar4 == null || q(ayxVar3, ayxVar4)) && (d = d(viewGroup2, ayxVar3, ayxVar4)) != null)) {
                if (ayxVar4 != null) {
                    view = ayxVar4.b;
                    String[] a = a();
                    if (a != null && a.length > 0) {
                        ayxVar2 = new ayx(view);
                        i = size;
                        ayx ayxVar5 = ayyVar2.a.get(view);
                        if (ayxVar5 != null) {
                            int i8 = 0;
                            while (i8 < a.length) {
                                Map<String, Object> map = ayxVar2.a;
                                String str = a[i8];
                                map.put(str, ayxVar5.a.get(str));
                                i8++;
                                a = a;
                            }
                        }
                        int i9 = i6.j;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= i9) {
                                d = d;
                                break;
                            }
                            ayk aykVar = i6.get(i6.i(i10));
                            if (aykVar.c != null && aykVar.a == view && aykVar.b.equals(this.r) && aykVar.c.equals(ayxVar2)) {
                                d = null;
                                break;
                            }
                            i10++;
                        }
                    } else {
                        i = size;
                        ayxVar2 = null;
                    }
                    animator = d;
                    ayxVar = ayxVar2;
                } else {
                    i = size;
                    view = ayxVar3.b;
                    animator = d;
                    ayxVar = null;
                }
                if (animator != null) {
                    ays aysVar = this.m;
                    if (aysVar != null) {
                        ayl aylVar = this.n;
                        Rect a2 = aylVar == null ? null : aylVar.a();
                        if (ayxVar4 == null || !(ayxVar3 == null || (num = (Integer) ayxVar3.a.get("android:visibilityPropagation:visibility")) == null || num.intValue() != 0)) {
                            i3 = -1;
                        } else {
                            ayxVar3 = ayxVar4;
                            i3 = 1;
                        }
                        int a3 = azq.a(ayxVar3, 0);
                        int a4 = azq.a(ayxVar3, 1);
                        i2 = i7;
                        int[] iArr = new int[2];
                        viewGroup2.getLocationOnScreen(iArr);
                        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
                        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
                        int width = round + viewGroup.getWidth();
                        int height = round2 + viewGroup.getHeight();
                        if (a2 != null) {
                            i4 = a2.centerX();
                            i5 = a2.centerY();
                        } else {
                            i4 = (round + width) / 2;
                            i5 = (round2 + height) / 2;
                        }
                        aya ayaVar = (aya) aysVar;
                        int i11 = ayaVar.a;
                        aifVar2 = i6;
                        animator2 = animator;
                        if (i11 == 8388611) {
                            i11 = od.s(viewGroup) == 1 ? 5 : 3;
                        }
                        float abs = i11 != 3 ? i11 != 5 ? i11 != 48 ? i11 != 80 ? 0 : (a4 - round2) + Math.abs(i4 - a3) : (height - a4) + Math.abs(i4 - a3) : Math.abs(i5 - a4) + (a3 - round) : (width - a3) + Math.abs(i5 - a4);
                        int i12 = ayaVar.a;
                        float width2 = abs / ((i12 == 3 || i12 == 5 || i12 == 8388611) ? viewGroup.getWidth() : viewGroup.getHeight());
                        long j2 = this.b;
                        if (j2 < 0) {
                            j2 = 300;
                        }
                        long round3 = Math.round((((float) (j2 * i3)) / 3.0f) * width2);
                        sparseIntArray.put(this.y.size(), (int) round3);
                        j = Math.min(round3, j);
                    } else {
                        aifVar2 = i6;
                        animator2 = animator;
                        i2 = i7;
                    }
                    ayk aykVar2 = new ayk(view, this.r, this, azf.e(viewGroup), ayxVar);
                    aifVar = aifVar2;
                    Animator animator3 = animator2;
                    aifVar.put(animator3, aykVar2);
                    this.y.add(animator3);
                    j = j;
                    i7 = i2 + 1;
                    viewGroup2 = viewGroup;
                    i6 = aifVar;
                    size = i;
                } else {
                    aifVar = i6;
                }
            } else {
                aifVar = i6;
                i = size;
            }
            i2 = i7;
            i7 = i2 + 1;
            viewGroup2 = viewGroup;
            i6 = aifVar;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator4 = this.y.get(sparseIntArray.keyAt(i13));
                animator4.setStartDelay((sparseIntArray.valueAt(i13) - j) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(View view) {
        int id = view.getId();
        ArrayList<View> arrayList = this.s;
        if (arrayList == null || !arrayList.contains(view)) {
            return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(id)) || this.e.contains(view);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        r();
        aif<Animator, ayk> i = i();
        ArrayList<Animator> arrayList = this.y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = arrayList.get(i2);
            if (i.containsKey(animator)) {
                r();
                if (animator != null) {
                    animator.addListener(new ayi(this, i));
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
                    animator.addListener(new ayj(this));
                    animator.start();
                }
            }
        }
        this.y.clear();
        s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(ViewGroup viewGroup, boolean z) {
        l(z);
        if (this.d.size() > 0 || this.e.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                View findViewById = viewGroup.findViewById(this.d.get(i).intValue());
                if (findViewById != null) {
                    ayx ayxVar = new ayx(findViewById);
                    if (z) {
                        b(ayxVar);
                    } else {
                        c(ayxVar);
                    }
                    ayxVar.c.add(this);
                    x(ayxVar);
                    if (z) {
                        e(this.f, findViewById, ayxVar);
                    } else {
                        e(this.g, findViewById, ayxVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View view = this.e.get(i2);
                ayx ayxVar2 = new ayx(view);
                if (z) {
                    b(ayxVar2);
                } else {
                    c(ayxVar2);
                }
                ayxVar2.c.add(this);
                x(ayxVar2);
                if (z) {
                    e(this.f, view, ayxVar2);
                } else {
                    e(this.g, view, ayxVar2);
                }
            }
            return;
        }
        f(viewGroup, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z) {
        if (z) {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.i();
            return;
        }
        this.g.a.clear();
        this.g.b.clear();
        this.g.c.i();
    }

    public final ayx m(View view, boolean z) {
        ayv ayvVar = this.h;
        if (ayvVar != null) {
            return ayvVar.m(view, z);
        }
        return (z ? this.f : this.g).a.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayx n(View view, boolean z) {
        ayv ayvVar = this.h;
        if (ayvVar != null) {
            return ayvVar.n(view, z);
        }
        ArrayList<ayx> arrayList = z ? this.j : this.k;
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
            ayx ayxVar = arrayList.get(i);
            if (ayxVar == null) {
                return null;
            }
            if (ayxVar.b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.k : this.j).get(i);
    }

    public void o(View view) {
        if (!this.w) {
            aif<Animator, ayk> i = i();
            int i2 = i.j;
            azr e = azf.e(view);
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                ayk j = i.j(i2);
                if (j.a != null && e.equals(j.e)) {
                    i.i(i2).pause();
                }
            }
            ArrayList<aym> arrayList = this.x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.x.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((aym) arrayList2.get(i3)).c();
                }
            }
            this.v = true;
        }
    }

    public void p(View view) {
        if (this.v) {
            if (!this.w) {
                aif<Animator, ayk> i = i();
                int i2 = i.j;
                azr e = azf.e(view);
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    ayk j = i.j(i2);
                    if (j.a != null && e.equals(j.e)) {
                        i.i(i2).resume();
                    }
                }
                ArrayList<aym> arrayList = this.x;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.x.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((aym) arrayList2.get(i3)).d();
                    }
                }
            }
            this.v = false;
        }
    }

    public boolean q(ayx ayxVar, ayx ayxVar2) {
        if (ayxVar != null && ayxVar2 != null) {
            String[] a = a();
            if (a != null) {
                for (String str : a) {
                    if (J(ayxVar, ayxVar2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : ayxVar.a.keySet()) {
                    if (J(ayxVar, ayxVar2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        if (this.u == 0) {
            ArrayList<aym> arrayList = this.x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.x.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((aym) arrayList2.get(i)).e(this);
                }
            }
            this.w = false;
        }
        this.u++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            ArrayList<aym> arrayList = this.x;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.x.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((aym) arrayList2.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.f.c.e(); i3++) {
                View g = this.f.c.g(i3);
                if (g != null) {
                    od.h(g, false);
                }
            }
            for (int i4 = 0; i4 < this.g.c.e(); i4++) {
                View g2 = this.g.c.g(i4);
                if (g2 != null) {
                    od.h(g2, false);
                }
            }
            this.w = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.l.get(size).cancel();
        }
        ArrayList<aym> arrayList = this.x;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.x.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((aym) arrayList2.get(i)).b();
        }
    }

    public final String toString() {
        return z("");
    }

    public void u(axy axyVar) {
        if (axyVar == null) {
            this.o = q;
        } else {
            this.o = axyVar;
        }
    }

    public void v(ayl aylVar) {
        this.n = aylVar;
    }

    public void w(ays aysVar) {
        this.m = aysVar;
    }

    public void x(ayx ayxVar) {
        if (this.m == null || ayxVar.a.isEmpty()) {
            return;
        }
        String[] strArr = azq.b;
        for (int i = 0; i < 2; i++) {
            if (!ayxVar.a.containsKey(strArr[i])) {
                View view = ayxVar.b;
                Integer num = (Integer) ayxVar.a.get("android:visibility:visibility");
                if (num == null) {
                    num = Integer.valueOf(view.getVisibility());
                }
                ayxVar.a.put("android:visibilityPropagation:visibility", num);
                view.getLocationOnScreen(r2);
                int round = r2[0] + Math.round(view.getTranslationX());
                int[] iArr = {round};
                iArr[0] = round + (view.getWidth() / 2);
                int round2 = iArr[1] + Math.round(view.getTranslationY());
                iArr[1] = round2;
                iArr[1] = round2 + (view.getHeight() / 2);
                ayxVar.a.put("android:visibilityPropagation:center", iArr);
                return;
            }
        }
    }

    @Override // 
    /* renamed from: y */
    public ayn clone() {
        try {
            ayn aynVar = (ayn) super.clone();
            aynVar.y = new ArrayList<>();
            aynVar.f = new ayy();
            aynVar.g = new ayy();
            aynVar.j = null;
            aynVar.k = null;
            return aynVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String z(String str) {
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
}
