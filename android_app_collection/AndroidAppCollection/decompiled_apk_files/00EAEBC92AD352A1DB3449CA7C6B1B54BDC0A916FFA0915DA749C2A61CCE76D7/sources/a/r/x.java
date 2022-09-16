package a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class x implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final p I = new a();
    private static ThreadLocal<a.e.a<Animator, d>> J = new ThreadLocal<>();
    a0 D;
    private e E;
    private a.e.a<String, String> F;
    private ArrayList<d0> u;
    private ArrayList<d0> v;

    /* renamed from: b  reason: collision with root package name */
    private String f707b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    private long f708c = -1;

    /* renamed from: d  reason: collision with root package name */
    long f709d = -1;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f710e = null;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<Integer> f711f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<View> f712g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<String> f713h = null;
    private ArrayList<Class<?>> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<View> k = null;
    private ArrayList<Class<?>> l = null;
    private ArrayList<String> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class<?>> p = null;
    private e0 q = new e0();
    private e0 r = new e0();
    b0 s = null;
    private int[] t = H;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private p G = I;

    /* loaded from: classes.dex */
    static class a extends p {
        a() {
        }

        @Override // a.r.p
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.e.a f714a;

        b(a.e.a aVar) {
            this.f714a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f714a.remove(animator);
            x.this.x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x.this.x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.a();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f717a;

        /* renamed from: b  reason: collision with root package name */
        String f718b;

        /* renamed from: c  reason: collision with root package name */
        d0 f719c;

        /* renamed from: d  reason: collision with root package name */
        z0 f720d;

        /* renamed from: e  reason: collision with root package name */
        x f721e;

        d(View view, String str, x xVar, z0 z0Var, d0 d0Var) {
            this.f717a = view;
            this.f718b = str;
            this.f719c = d0Var;
            this.f720d = z0Var;
            this.f721e = xVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract Rect a(x xVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(x xVar);

        void b(x xVar);

        void c(x xVar);

        void d(x xVar);

        void e(x xVar);
    }

    private void a(a.e.a<View, d0> aVar, a.e.a<View, d0> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            d0 d2 = aVar.d(i);
            if (b(d2.f584b)) {
                this.u.add(d2);
                this.v.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            d0 d3 = aVar2.d(i2);
            if (b(d3.f584b)) {
                this.v.add(d3);
                this.u.add(null);
            }
        }
    }

    private void a(a.e.a<View, d0> aVar, a.e.a<View, d0> aVar2, a.e.a<String, View> aVar3, a.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View d2 = aVar3.d(i);
            if (d2 != null && b(d2) && (view = aVar4.get(aVar3.b(i))) != null && b(view)) {
                d0 d0Var = aVar.get(d2);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.u.add(d0Var);
                    this.v.add(d0Var2);
                    aVar.remove(d2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(a.e.a<View, d0> aVar, a.e.a<View, d0> aVar2, a.e.d<View> dVar, a.e.d<View> dVar2) {
        View c2;
        int b2 = dVar.b();
        for (int i = 0; i < b2; i++) {
            View c3 = dVar.c(i);
            if (c3 != null && b(c3) && (c2 = dVar2.c(dVar.a(i))) != null && b(c2)) {
                d0 d0Var = aVar.get(c3);
                d0 d0Var2 = aVar2.get(c2);
                if (d0Var != null && d0Var2 != null) {
                    this.u.add(d0Var);
                    this.v.add(d0Var2);
                    aVar.remove(c3);
                    aVar2.remove(c2);
                }
            }
        }
    }

    private void a(a.e.a<View, d0> aVar, a.e.a<View, d0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && b(view)) {
                d0 d0Var = aVar.get(valueAt);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.u.add(d0Var);
                    this.v.add(d0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(e0 e0Var, e0 e0Var2) {
        a.e.a<View, d0> aVar = new a.e.a<>(e0Var.f609a);
        a.e.a<View, d0> aVar2 = new a.e.a<>(e0Var2.f609a);
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i >= iArr.length) {
                a(aVar, aVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                b(aVar, aVar2);
            } else if (i2 == 2) {
                a(aVar, aVar2, e0Var.f612d, e0Var2.f612d);
            } else if (i2 == 3) {
                a(aVar, aVar2, e0Var.f610b, e0Var2.f610b);
            } else if (i2 == 4) {
                a(aVar, aVar2, e0Var.f611c, e0Var2.f611c);
            }
            i++;
        }
    }

    private static void a(e0 e0Var, View view, d0 d0Var) {
        e0Var.f609a.put(view, d0Var);
        int id = view.getId();
        if (id >= 0) {
            if (e0Var.f610b.indexOfKey(id) >= 0) {
                e0Var.f610b.put(id, null);
            } else {
                e0Var.f610b.put(id, view);
            }
        }
        String y = a.g.m.v.y(view);
        if (y != null) {
            if (e0Var.f612d.containsKey(y)) {
                e0Var.f612d.put(y, null);
            } else {
                e0Var.f612d.put(y, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            if (e0Var.f611c.d(itemIdAtPosition) < 0) {
                a.g.m.v.b(view, true);
                e0Var.f611c.c(itemIdAtPosition, view);
                return;
            }
            View c2 = e0Var.f611c.c(itemIdAtPosition);
            if (c2 == null) {
                return;
            }
            a.g.m.v.b(c2, false);
            e0Var.f611c.c(itemIdAtPosition, null);
        }
    }

    private void a(Animator animator, a.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            a(animator);
        }
    }

    private static boolean a(d0 d0Var, d0 d0Var2, String str) {
        Object obj = d0Var.f583a.get(str);
        Object obj2 = d0Var2.f583a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    private void b(a.e.a<View, d0> aVar, a.e.a<View, d0> aVar2) {
        d0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b2 = aVar.b(size);
            if (b2 != null && b(b2) && (remove = aVar2.remove(b2)) != null && b(remove.f584b)) {
                this.u.add(aVar.c(size));
                this.v.add(remove);
            }
        }
    }

    private void c(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.k;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.l;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.l.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            d0 d0Var = new d0(view);
            if (z) {
                c(d0Var);
            } else {
                a(d0Var);
            }
            d0Var.f585c.add(this);
            b(d0Var);
            a(z ? this.q : this.r, view, d0Var);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ArrayList<Integer> arrayList4 = this.n;
        if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList5 = this.o;
        if (arrayList5 != null && arrayList5.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList6 = this.p;
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (this.p.get(i2).isInstance(view)) {
                    return;
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            c(viewGroup.getChildAt(i3), z);
        }
    }

    private static a.e.a<Animator, d> q() {
        a.e.a<Animator, d> aVar = J.get();
        if (aVar == null) {
            a.e.a<Animator, d> aVar2 = new a.e.a<>();
            J.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0 a(View view, boolean z) {
        b0 b0Var = this.s;
        if (b0Var != null) {
            return b0Var.a(view, z);
        }
        ArrayList<d0> arrayList = z ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            d0 d0Var = arrayList.get(i2);
            if (d0Var == null) {
                return null;
            }
            if (d0Var.f584b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.v : this.u).get(i);
    }

    /* renamed from: a */
    public x mo19a(long j) {
        this.f709d = j;
        return this;
    }

    /* renamed from: a */
    public x mo20a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    /* renamed from: a */
    public x mo21a(TimeInterpolator timeInterpolator) {
        this.f710e = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public x mo22a(View view) {
        this.f712g.add(view);
        return this;
    }

    public Animator a(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f709d != -1) {
            str2 = str2 + "dur(" + this.f709d + ") ";
        }
        if (this.f708c != -1) {
            str2 = str2 + "dly(" + this.f708c + ") ";
        }
        if (this.f710e != null) {
            str2 = str2 + "interp(" + this.f710e + ") ";
        }
        if (this.f711f.size() > 0 || this.f712g.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f711f.size() > 0) {
                String str4 = str3;
                for (int i = 0; i < this.f711f.size(); i++) {
                    if (i > 0) {
                        str4 = str4 + ", ";
                    }
                    str4 = str4 + this.f711f.get(i);
                }
                str3 = str4;
            }
            if (this.f712g.size() > 0) {
                for (int i2 = 0; i2 < this.f712g.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f712g.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.y--;
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).e(this);
                }
            }
            for (int i2 = 0; i2 < this.q.f611c.b(); i2++) {
                View c2 = this.q.f611c.c(i2);
                if (c2 != null) {
                    a.g.m.v.b(c2, false);
                }
            }
            for (int i3 = 0; i3 < this.r.f611c.b(); i3++) {
                View c3 = this.r.f611c.c(i3);
                if (c3 != null) {
                    a.g.m.v.b(c3, false);
                }
            }
            this.A = true;
        }
    }

    public void a(a0 a0Var) {
        this.D = a0Var;
    }

    public abstract void a(d0 d0Var);

    public void a(p pVar) {
        if (pVar == null) {
            pVar = I;
        }
        this.G = pVar;
    }

    public void a(e eVar) {
        this.E = eVar;
    }

    protected void a(Animator animator) {
        if (animator == null) {
            a();
            return;
        }
        if (b() >= 0) {
            animator.setDuration(b());
        }
        if (i() >= 0) {
            animator.setStartDelay(i() + animator.getStartDelay());
        }
        if (e() != null) {
            animator.setInterpolator(e());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        a(this.q, this.r);
        a.e.a<Animator, d> q = q();
        int size = q.size();
        z0 d2 = o0.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b2 = q.b(i);
            if (b2 != null && (dVar = q.get(b2)) != null && dVar.f717a != null && d2.equals(dVar.f720d)) {
                d0 d0Var = dVar.f719c;
                View view = dVar.f717a;
                d0 b3 = b(view, true);
                d0 a2 = a(view, true);
                if (b3 == null && a2 == null) {
                    a2 = this.r.f609a.get(view);
                }
                if (!(b3 == null && a2 == null) && dVar.f721e.a(d0Var, a2)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        q.remove(b2);
                    }
                }
            }
        }
        a(viewGroup, this.q, this.r, this.u, this.v);
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, e0 e0Var, e0 e0Var2, ArrayList<d0> arrayList, ArrayList<d0> arrayList2) {
        Animator a2;
        int i;
        int i2;
        View view;
        Animator animator;
        d0 d0Var;
        Animator animator2;
        d0 d0Var2;
        a.e.a<Animator, d> q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            d0 d0Var3 = arrayList.get(i3);
            d0 d0Var4 = arrayList2.get(i3);
            if (d0Var3 != null && !d0Var3.f585c.contains(this)) {
                d0Var3 = null;
            }
            if (d0Var4 != null && !d0Var4.f585c.contains(this)) {
                d0Var4 = null;
            }
            if (d0Var3 != null || d0Var4 != null) {
                if ((d0Var3 == null || d0Var4 == null || a(d0Var3, d0Var4)) && (a2 = a(viewGroup, d0Var3, d0Var4)) != null) {
                    if (d0Var4 != null) {
                        view = d0Var4.f584b;
                        String[] n = n();
                        if (n != null && n.length > 0) {
                            d0Var2 = new d0(view);
                            i = size;
                            d0 d0Var5 = e0Var2.f609a.get(view);
                            if (d0Var5 != null) {
                                int i4 = 0;
                                while (i4 < n.length) {
                                    d0Var2.f583a.put(n[i4], d0Var5.f583a.get(n[i4]));
                                    i4++;
                                    i3 = i3;
                                    d0Var5 = d0Var5;
                                }
                            }
                            i2 = i3;
                            int size2 = q.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = a2;
                                    break;
                                }
                                d dVar = q.get(q.b(i5));
                                if (dVar.f719c != null && dVar.f717a == view && dVar.f718b.equals(f()) && dVar.f719c.equals(d0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator2 = a2;
                            d0Var2 = null;
                        }
                        animator = animator2;
                        d0Var = d0Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = d0Var3.f584b;
                        animator = a2;
                        d0Var = null;
                    }
                    if (animator != null) {
                        a0 a0Var = this.D;
                        if (a0Var != null) {
                            long a3 = a0Var.a(viewGroup, this, d0Var3, d0Var4);
                            sparseIntArray.put(this.C.size(), (int) a3);
                            j = Math.min(a3, j);
                        }
                        q.put(animator, new d(view, f(), this, o0.d(viewGroup), d0Var));
                        this.C.add(animator);
                        j = j;
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((sparseIntArray.valueAt(i6) - j) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        a.e.a<String, String> aVar;
        a(z);
        if ((this.f711f.size() > 0 || this.f712g.size() > 0) && (((arrayList = this.f713h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f711f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f711f.get(i).intValue());
                if (findViewById != null) {
                    d0 d0Var = new d0(findViewById);
                    if (z) {
                        c(d0Var);
                    } else {
                        a(d0Var);
                    }
                    d0Var.f585c.add(this);
                    b(d0Var);
                    a(z ? this.q : this.r, findViewById, d0Var);
                }
            }
            for (int i2 = 0; i2 < this.f712g.size(); i2++) {
                View view = this.f712g.get(i2);
                d0 d0Var2 = new d0(view);
                if (z) {
                    c(d0Var2);
                } else {
                    a(d0Var2);
                }
                d0Var2.f585c.add(this);
                b(d0Var2);
                a(z ? this.q : this.r, view, d0Var2);
            }
        } else {
            c(viewGroup, z);
        }
        if (z || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q.f612d.remove(this.F.b(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q.f612d.put(this.F.d(i4), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        e0 e0Var;
        if (z) {
            this.q.f609a.clear();
            this.q.f610b.clear();
            e0Var = this.q;
        } else {
            this.r.f609a.clear();
            this.r.f610b.clear();
            e0Var = this.r;
        }
        e0Var.f611c.a();
    }

    public boolean a(d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return false;
        }
        String[] n = n();
        if (n == null) {
            for (String str : d0Var.f583a.keySet()) {
                if (a(d0Var, d0Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : n) {
            if (!a(d0Var, d0Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public long b() {
        return this.f709d;
    }

    public d0 b(View view, boolean z) {
        b0 b0Var = this.s;
        if (b0Var != null) {
            return b0Var.b(view, z);
        }
        return (z ? this.q : this.r).f609a.get(view);
    }

    /* renamed from: b */
    public x mo23b(long j) {
        this.f708c = j;
        return this;
    }

    /* renamed from: b */
    public x mo24b(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d0 d0Var) {
        String[] a2;
        if (this.D == null || d0Var.f583a.isEmpty() || (a2 = this.D.a()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a2.length) {
                z = true;
                break;
            } else if (!d0Var.f583a.containsKey(a2[i])) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        this.D.a(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.k;
            if (arrayList4 != null && arrayList4.contains(view)) {
                return false;
            }
            ArrayList<Class<?>> arrayList5 = this.l;
            if (arrayList5 != null) {
                int size = arrayList5.size();
                for (int i = 0; i < size; i++) {
                    if (this.l.get(i).isInstance(view)) {
                        return false;
                    }
                }
            }
            if (this.m != null && a.g.m.v.y(view) != null && this.m.contains(a.g.m.v.y(view))) {
                return false;
            }
            if ((this.f711f.size() == 0 && this.f712g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f713h) == null || arrayList2.isEmpty()))) || this.f711f.contains(Integer.valueOf(id)) || this.f712g.contains(view)) {
                return true;
            }
            ArrayList<String> arrayList6 = this.f713h;
            if (arrayList6 != null && arrayList6.contains(a.g.m.v.y(view))) {
                return true;
            }
            if (this.i != null) {
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    if (this.i.get(i2).isInstance(view)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public Rect c() {
        e eVar = this.E;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public abstract void c(d0 d0Var);

    public void c(View view) {
        if (!this.A) {
            a.e.a<Animator, d> q = q();
            int size = q.size();
            z0 d2 = o0.d(view);
            for (int i = size - 1; i >= 0; i--) {
                d d3 = q.d(i);
                if (d3.f717a != null && d2.equals(d3.f720d)) {
                    a.r.a.a(q.b(i));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((f) arrayList2.get(i2)).c(this);
                }
            }
            this.z = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).b(this);
        }
    }

    public x clone() {
        try {
            x xVar = (x) super.clone();
            xVar.C = new ArrayList<>();
            xVar.q = new e0();
            xVar.r = new e0();
            xVar.u = null;
            xVar.v = null;
            return xVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public e d() {
        return this.E;
    }

    /* renamed from: d */
    public x mo26d(View view) {
        this.f712g.remove(view);
        return this;
    }

    public TimeInterpolator e() {
        return this.f710e;
    }

    public void e(View view) {
        if (this.z) {
            if (!this.A) {
                a.e.a<Animator, d> q = q();
                int size = q.size();
                z0 d2 = o0.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d d3 = q.d(i);
                    if (d3.f717a != null && d2.equals(d3.f720d)) {
                        a.r.a.b(q.b(i));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).d(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public String f() {
        return this.f707b;
    }

    public p g() {
        return this.G;
    }

    public a0 h() {
        return this.D;
    }

    public long i() {
        return this.f708c;
    }

    public List<Integer> j() {
        return this.f711f;
    }

    public List<String> k() {
        return this.f713h;
    }

    public List<Class<?>> l() {
        return this.i;
    }

    public List<View> m() {
        return this.f712g;
    }

    public String[] n() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        p();
        a.e.a<Animator, d> q = q();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q.containsKey(next)) {
                p();
                a(next, q);
            }
        }
        this.C.clear();
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public String toString() {
        return a("");
    }
}
