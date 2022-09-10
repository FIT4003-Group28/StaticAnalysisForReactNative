package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hh  reason: default package */
/* loaded from: classes.dex */
public final class hh {
    static final hr b;
    public static final /* synthetic */ int c = 0;
    private static final int[] d = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final hr a = new hn();

    static {
        hr hrVar;
        try {
            hrVar = (hr) Class.forName("axw").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            hrVar = null;
        }
        b = hrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aif<String, View> a(hr hrVar, aif<String, String> aifVar, Object obj, hg hgVar) {
        ArrayList<String> arrayList;
        fd fdVar = hgVar.a;
        View view = fdVar.P;
        if (aifVar.isEmpty() || obj == null || view == null) {
            aifVar.clear();
            return null;
        }
        aif<String, View> aifVar2 = new aif<>();
        hrVar.r(aifVar2, view);
        ep epVar = hgVar.c;
        if (hgVar.b) {
            fdVar.aI();
            arrayList = epVar.q;
        } else {
            fdVar.aH();
            arrayList = epVar.r;
        }
        if (arrayList != null) {
            aifVar2.a(arrayList);
            aifVar2.a(aifVar.values());
        }
        int i = aifVar.j;
        while (true) {
            i--;
            if (i < 0) {
                return aifVar2;
            }
            if (!aifVar2.containsKey(aifVar.j(i))) {
                aifVar.m(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View b(aif<String, View> aifVar, hg hgVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        ep epVar = hgVar.c;
        if (obj == null || aifVar == null || (arrayList = epVar.q) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = epVar.q.get(0);
        } else {
            str = epVar.r.get(0);
        }
        return aifVar.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<View> c(hr hrVar, Object obj, fd fdVar, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fdVar.P;
            if (view2 != null) {
                hrVar.q(arrayList2, view2);
            }
            arrayList2.removeAll(arrayList);
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            hrVar.f(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r36, defpackage.fn r37, java.util.ArrayList<defpackage.ep> r38, java.util.ArrayList<java.lang.Boolean> r39, int r40, int r41, boolean r42, defpackage.fy r43) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh.e(android.content.Context, fn, java.util.ArrayList, java.util.ArrayList, int, int, boolean, fy):void");
    }

    private static hr f(fd fdVar, fd fdVar2) {
        Object ao;
        ArrayList arrayList = new ArrayList();
        if (fdVar != null) {
            Object an = fdVar.an();
            if (an != null) {
                arrayList.add(an);
            }
            Object ap = fdVar.ap();
            if (ap != null) {
                arrayList.add(ap);
            }
        }
        if (fdVar2 != null && (ao = fdVar2.ao()) != null) {
            arrayList.add(ao);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hr hrVar = a;
        if (hrVar != null && g(hrVar, arrayList)) {
            return hrVar;
        }
        hr hrVar2 = b;
        if (hrVar2 != null && g(hrVar2, arrayList)) {
            return hrVar2;
        }
        if (hrVar != null || hrVar2 != null) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return null;
    }

    private static boolean g(hr hrVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!hrVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object h(hr hrVar, fd fdVar, boolean z) {
        Object obj = null;
        if (fdVar == null) {
            return null;
        }
        if (z) {
            obj = fdVar.ao();
        }
        return hrVar.b(obj);
    }

    private static Object i(hr hrVar, fd fdVar, boolean z) {
        Object obj = null;
        if (fdVar == null) {
            return null;
        }
        if (z) {
            obj = fdVar.an();
        }
        return hrVar.b(obj);
    }

    private static void j(ArrayList<View> arrayList, aif<String, View> aifVar, Collection<String> collection) {
        int i = aifVar.j;
        while (true) {
            i--;
            if (i >= 0) {
                View j = aifVar.j(i);
                if (collection.contains(od.J(j))) {
                    arrayList.add(j);
                }
            } else {
                return;
            }
        }
    }

    private static void l(hr hrVar, Object obj, Object obj2, aif<String, View> aifVar, boolean z, ep epVar) {
        String str;
        ArrayList<String> arrayList = epVar.q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = epVar.r.get(0);
        } else {
            str = epVar.q.get(0);
        }
        View view = aifVar.get(str);
        hrVar.e(obj, view);
        if (obj2 == null) {
            return;
        }
        hrVar.e(obj2, view);
    }

    private static Object m(hr hrVar, Object obj, Object obj2, Object obj3, fd fdVar, boolean z) {
        return hrVar.g(obj2, obj, obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.t != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007a, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x008d, code lost:
        if (r0.H == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(defpackage.ep r8, defpackage.gy r9, android.util.SparseArray<defpackage.hg> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh.n(ep, gy, android.util.SparseArray, boolean, boolean):void");
    }

    private static hg o(hg hgVar, SparseArray<hg> sparseArray, int i) {
        if (hgVar == null) {
            hg hgVar2 = new hg();
            sparseArray.put(i, hgVar2);
            return hgVar2;
        }
        return hgVar;
    }

    private static Object p(hr hrVar, fd fdVar, boolean z) {
        return hrVar.c(hrVar.b(z ? fdVar.ap() : null));
    }

    private static aif<String, View> k(hr hrVar, aif<String, String> aifVar, Object obj, hg hgVar) {
        ArrayList<String> arrayList;
        if (aifVar.isEmpty() || obj == null) {
            aifVar.clear();
            return null;
        }
        fd fdVar = hgVar.d;
        aif<String, View> aifVar2 = new aif<>();
        hrVar.r(aifVar2, fdVar.ai());
        ep epVar = hgVar.f;
        if (hgVar.e) {
            fdVar.aH();
            arrayList = epVar.r;
        } else {
            fdVar.aI();
            arrayList = epVar.q;
        }
        if (arrayList != null) {
            aifVar2.a(arrayList);
        }
        aifVar.a(aifVar2.keySet());
        return aifVar2;
    }
}
