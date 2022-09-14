package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1763a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    private static final v f1764b;

    /* renamed from: c  reason: collision with root package name */
    private static final v f1765c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f1766b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1767c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.g.j.b f1768d;

        a(g gVar, Fragment fragment, a.g.j.b bVar) {
            this.f1766b = gVar;
            this.f1767c = fragment;
            this.f1768d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1766b.a(this.f1767c, this.f1768d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1769b;

        b(ArrayList arrayList) {
            this.f1769b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f1769b, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f1770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1771c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.g.j.b f1772d;

        c(g gVar, Fragment fragment, a.g.j.b bVar) {
            this.f1770b = gVar;
            this.f1771c = fragment;
            this.f1772d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1770b.a(this.f1771c, this.f1772d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f1774c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f1775d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fragment f1776e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1777f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f1778g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f1779h;
        final /* synthetic */ Object i;

        d(Object obj, v vVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1773b = obj;
            this.f1774c = vVar;
            this.f1775d = view;
            this.f1776e = fragment;
            this.f1777f = arrayList;
            this.f1778g = arrayList2;
            this.f1779h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1773b;
            if (obj != null) {
                this.f1774c.b(obj, this.f1775d);
                this.f1778g.addAll(t.a(this.f1774c, this.f1773b, this.f1776e, this.f1777f, this.f1775d));
            }
            if (this.f1779h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1775d);
                    this.f1774c.a(this.i, this.f1779h, arrayList);
                }
                this.f1779h.clear();
                this.f1779h.add(this.f1775d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1781c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f1782d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.e.a f1783e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f1784f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f1785g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Rect f1786h;

        e(Fragment fragment, Fragment fragment2, boolean z, a.e.a aVar, View view, v vVar, Rect rect) {
            this.f1780b = fragment;
            this.f1781c = fragment2;
            this.f1782d = z;
            this.f1783e = aVar;
            this.f1784f = view;
            this.f1785g = vVar;
            this.f1786h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f1780b, this.f1781c, this.f1782d, (a.e.a<String, View>) this.f1783e, false);
            View view = this.f1784f;
            if (view != null) {
                this.f1785g.a(view, this.f1786h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f1787b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.e.a f1788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f1789d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f1790e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1791f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f1792g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f1793h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        f(v vVar, a.e.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1787b = vVar;
            this.f1788c = aVar;
            this.f1789d = obj;
            this.f1790e = hVar;
            this.f1791f = arrayList;
            this.f1792g = view;
            this.f1793h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.e.a<String, View> a2 = t.a(this.f1787b, this.f1788c, this.f1789d, this.f1790e);
            if (a2 != null) {
                this.f1791f.addAll(a2.values());
                this.f1791f.add(this.f1792g);
            }
            t.a(this.f1793h, this.i, this.j, a2, false);
            Object obj = this.f1789d;
            if (obj != null) {
                this.f1787b.b(obj, this.k, this.f1791f);
                View a3 = t.a(a2, this.f1790e, this.l, this.j);
                if (a3 == null) {
                    return;
                }
                this.f1787b.a(a3, this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, a.g.j.b bVar);

        void b(Fragment fragment, a.g.j.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f1794a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1795b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f1796c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1797d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1798e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f1799f;

        h() {
        }
    }

    static {
        f1764b = Build.VERSION.SDK_INT >= 21 ? new u() : null;
        f1765c = a();
    }

    private static a.e.a<String, String> a(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.e.a<String, String> aVar = new a.e.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i4);
            if (aVar2.c(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.n;
                        arrayList4 = aVar2.o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.n;
                        arrayList3 = aVar2.o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    static a.e.a<String, View> a(v vVar, a.e.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.m p;
        ArrayList<String> arrayList;
        String a2;
        Fragment fragment = hVar.f1794a;
        View F = fragment.F();
        if (aVar.isEmpty() || obj == null || F == null) {
            aVar.clear();
            return null;
        }
        a.e.a<String, View> aVar2 = new a.e.a<>();
        vVar.a((Map<String, View>) aVar2, F);
        androidx.fragment.app.a aVar3 = hVar.f1796c;
        if (hVar.f1795b) {
            p = fragment.r();
            arrayList = aVar3.n;
        } else {
            p = fragment.p();
            arrayList = aVar3.o;
        }
        if (arrayList != null) {
            aVar2.a((Collection<?>) arrayList);
            aVar2.a((Collection<?>) aVar.values());
        }
        if (p != null) {
            p.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String a3 = a(aVar, str);
                    if (a3 != null) {
                        aVar.remove(a3);
                    }
                } else if (!str.equals(a.g.m.v.y(view)) && (a2 = a(aVar, str)) != null) {
                    aVar.put(a2, a.g.m.v.y(view));
                }
            }
        } else {
            a(aVar, aVar2);
        }
        return aVar2;
    }

    static View a(a.e.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f1796c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.n : aVar2.o).get(0));
    }

    private static h a(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i, hVar2);
            return hVar2;
        }
        return hVar;
    }

    private static v a() {
        try {
            return (v) Class.forName("a.r.h").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static v a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object q = fragment.q();
            if (q != null) {
                arrayList.add(q);
            }
            Object A = fragment.A();
            if (A != null) {
                arrayList.add(A);
            }
            Object C = fragment.C();
            if (C != null) {
                arrayList.add(C);
            }
        }
        if (fragment2 != null) {
            Object o = fragment2.o();
            if (o != null) {
                arrayList.add(o);
            }
            Object x = fragment2.x();
            if (x != null) {
                arrayList.add(x);
            }
            Object B = fragment2.B();
            if (B != null) {
                arrayList.add(B);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        v vVar = f1764b;
        if (vVar != null && a(vVar, arrayList)) {
            return f1764b;
        }
        v vVar2 = f1765c;
        if (vVar2 != null && a(vVar2, arrayList)) {
            return f1765c;
        }
        if (f1764b != null || f1765c != null) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return null;
    }

    private static Object a(v vVar, ViewGroup viewGroup, View view, a.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object a2;
        a.e.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f1794a;
        Fragment fragment2 = hVar.f1797d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1795b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            a2 = null;
        } else {
            a2 = a(vVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        a.e.a<String, View> b2 = b(vVar, aVar2, a2, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(b2.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj3 != null) {
            rect = new Rect();
            vVar.b(obj3, view, arrayList);
            a(vVar, obj3, obj2, b2, hVar.f1798e, hVar.f1799f);
            if (obj != null) {
                vVar.a(obj, rect);
            }
        } else {
            rect = null;
        }
        a.g.m.s.a(viewGroup, new f(vVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object a(v vVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return vVar.c(vVar.b(z ? fragment2.C() : fragment.B()));
    }

    private static Object a(v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.b(z ? fragment.x() : fragment.o());
    }

    private static Object a(v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.i() : fragment.h() ? vVar.b(obj2, obj, obj3) : vVar.a(obj2, obj, obj3);
    }

    private static String a(a.e.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.d(i))) {
                return aVar.b(i);
            }
        }
        return null;
    }

    static ArrayList<View> a(v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View F = fragment.F();
            if (F != null) {
                vVar.a(arrayList2, F);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            vVar.a(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static void a(a.e.a<String, String> aVar, a.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.d(size))) {
                aVar.c(size);
            }
        }
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, a.e.a<String, View> aVar, boolean z2) {
        androidx.core.app.m p = z ? fragment2.p() : fragment.p();
        if (p != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.b(i));
                arrayList.add(aVar.d(i));
            }
            if (z2) {
                p.b(arrayList2, arrayList, null);
            } else {
                p.a(arrayList2, arrayList, null);
            }
        }
    }

    public static void a(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.f1747a.size();
        for (int i = 0; i < size; i++) {
            a(aVar, aVar.f1747a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.l != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
        if (r0.z == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(androidx.fragment.app.a r8, androidx.fragment.app.s.a r9, android.util.SparseArray<androidx.fragment.app.t.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.a(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static void a(l lVar, int i, h hVar, View view, a.e.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        v a2;
        Object obj;
        ViewGroup viewGroup = lVar.p.c() ? (ViewGroup) lVar.p.a(i) : null;
        if (viewGroup == null || (a2 = a((fragment2 = hVar.f1797d), (fragment = hVar.f1794a))) == null) {
            return;
        }
        boolean z = hVar.f1795b;
        boolean z2 = hVar.f1798e;
        Object a3 = a(a2, fragment, z);
        Object b2 = b(a2, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a4 = a(a2, viewGroup, view, aVar, hVar, arrayList, arrayList2, a3, b2);
        if (a3 == null && a4 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> a5 = a(a2, obj, fragment2, arrayList, view);
        Object obj2 = (a5 == null || a5.isEmpty()) ? null : obj;
        a2.a(a3, view);
        Object a6 = a(a2, a3, obj2, a4, fragment, hVar.f1795b);
        if (fragment2 != null && a5 != null && (a5.size() > 0 || arrayList.size() > 0)) {
            a.g.j.b bVar = new a.g.j.b();
            gVar.b(fragment2, bVar);
            a2.a(fragment2, a6, bVar, new c(gVar, fragment2, bVar));
        }
        if (a6 == null) {
            return;
        }
        ArrayList<View> arrayList3 = new ArrayList<>();
        a2.a(a6, a3, arrayList3, obj2, a5, a4, arrayList2);
        a(a2, viewGroup, fragment, view, arrayList2, a3, arrayList3, obj2, a5);
        a2.a((View) viewGroup, arrayList2, (Map<String, String>) aVar);
        a2.a(viewGroup, a6);
        a2.a(viewGroup, arrayList2, (Map<String, String>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(l lVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        if (lVar.n < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                b(aVar, sparseArray, z);
            } else {
                a(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() == 0) {
            return;
        }
        View view = new View(lVar.o.f());
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            a.e.a<String, String> a2 = a(keyAt, arrayList, arrayList2, i, i2);
            h hVar = (h) sparseArray.valueAt(i4);
            if (z) {
                b(lVar, keyAt, hVar, view, a2, gVar);
            } else {
                a(lVar, keyAt, hVar, view, a2, gVar);
            }
        }
    }

    private static void a(v vVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        a.g.m.s.a(viewGroup, new d(obj, vVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void a(v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment == null || obj == null || !fragment.l || !fragment.z || !fragment.M) {
            return;
        }
        fragment.g(true);
        vVar.a(obj, fragment.F(), arrayList);
        a.g.m.s.a(fragment.G, new b(arrayList));
    }

    private static void a(v vVar, Object obj, Object obj2, a.e.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
        vVar.c(obj, view);
        if (obj2 == null) {
            return;
        }
        vVar.c(obj2, view);
    }

    static void a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static void a(ArrayList<View> arrayList, a.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View d2 = aVar.d(size);
            if (collection.contains(a.g.m.v.y(d2))) {
                arrayList.add(d2);
            }
        }
    }

    private static boolean a(v vVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static a.e.a<String, View> b(v vVar, a.e.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.m r;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f1797d;
        a.e.a<String, View> aVar2 = new a.e.a<>();
        vVar.a((Map<String, View>) aVar2, fragment.k0());
        androidx.fragment.app.a aVar3 = hVar.f1799f;
        if (hVar.f1798e) {
            r = fragment.p();
            arrayList = aVar3.o;
        } else {
            r = fragment.r();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            aVar2.a((Collection<?>) arrayList);
        }
        if (r != null) {
            r.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(a.g.m.v.y(view))) {
                    aVar.put(a.g.m.v.y(view), aVar.remove(str));
                }
            }
        } else {
            aVar.a((Collection<?>) aVar2.keySet());
        }
        return aVar2;
    }

    private static Object b(v vVar, ViewGroup viewGroup, View view, a.e.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f1794a;
        Fragment fragment2 = hVar.f1797d;
        if (fragment != null) {
            fragment.k0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f1795b;
        Object a2 = aVar.isEmpty() ? null : a(vVar, fragment, fragment2, z);
        a.e.a<String, View> b2 = b(vVar, aVar, a2, hVar);
        a.e.a<String, View> a3 = a(vVar, aVar, a2, hVar);
        if (aVar.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (a3 != null) {
                a3.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, b2, aVar.keySet());
            a(arrayList2, a3, aVar.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        a(fragment, fragment2, z, b2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            vVar.b(obj3, view, arrayList);
            a(vVar, obj3, obj2, b2, hVar.f1798e, hVar.f1799f);
            Rect rect2 = new Rect();
            View a4 = a(a3, hVar, obj, z);
            if (a4 != null) {
                vVar.a(obj, rect2);
            }
            rect = rect2;
            view2 = a4;
        } else {
            view2 = null;
            rect = null;
        }
        a.g.m.s.a(viewGroup, new e(fragment, fragment2, z, a3, view2, vVar, rect));
        return obj3;
    }

    private static Object b(v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.b(z ? fragment.A() : fragment.q());
    }

    public static void b(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (!aVar.r.p.c()) {
            return;
        }
        for (int size = aVar.f1747a.size() - 1; size >= 0; size--) {
            a(aVar, aVar.f1747a.get(size), sparseArray, true, z);
        }
    }

    private static void b(l lVar, int i, h hVar, View view, a.e.a<String, String> aVar, g gVar) {
        Fragment fragment;
        Fragment fragment2;
        v a2;
        Object obj;
        ViewGroup viewGroup = lVar.p.c() ? (ViewGroup) lVar.p.a(i) : null;
        if (viewGroup == null || (a2 = a((fragment2 = hVar.f1797d), (fragment = hVar.f1794a))) == null) {
            return;
        }
        boolean z = hVar.f1795b;
        boolean z2 = hVar.f1798e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a3 = a(a2, fragment, z);
        Object b2 = b(a2, fragment2, z2);
        Object b3 = b(a2, viewGroup, view, aVar, hVar, arrayList2, arrayList, a3, b2);
        if (a3 == null && b3 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> a4 = a(a2, obj, fragment2, arrayList2, view);
        ArrayList<View> a5 = a(a2, a3, fragment, arrayList, view);
        a(a5, 4);
        Object a6 = a(a2, a3, obj, b3, fragment, z);
        if (fragment2 != null && a4 != null && (a4.size() > 0 || arrayList2.size() > 0)) {
            a.g.j.b bVar = new a.g.j.b();
            gVar.b(fragment2, bVar);
            a2.a(fragment2, a6, bVar, new a(gVar, fragment2, bVar));
        }
        if (a6 == null) {
            return;
        }
        a(a2, obj, fragment2, a4);
        ArrayList<String> a7 = a2.a(arrayList);
        a2.a(a6, a3, a5, obj, a4, b3, arrayList);
        a2.a(viewGroup, a6);
        a2.a(viewGroup, arrayList2, arrayList, a7, aVar);
        a(a5, 0);
        a2.b(b3, arrayList2, arrayList);
    }
}
