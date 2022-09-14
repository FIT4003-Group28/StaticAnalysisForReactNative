package android.support.v4.app;

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
/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f291a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final v f292b;

    /* renamed from: c  reason: collision with root package name */
    private static final v f293c;

    static {
        f292b = Build.VERSION.SDK_INT >= 21 ? new u() : null;
        f293c = a();
    }

    private static v a() {
        try {
            return (v) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(o oVar, ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (oVar.l < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            c cVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                b(cVar, sparseArray, z);
            } else {
                a(cVar, sparseArray, z);
            }
        }
        if (sparseArray.size() == 0) {
            return;
        }
        View view = new View(oVar.m.i());
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = sparseArray.keyAt(i4);
            android.support.v4.i.a<String, String> a2 = a(keyAt, arrayList, arrayList2, i, i2);
            a aVar = (a) sparseArray.valueAt(i4);
            if (z) {
                a(oVar, keyAt, aVar, view, a2);
            } else {
                b(oVar, keyAt, aVar, view, a2);
            }
        }
    }

    private static android.support.v4.i.a<String, String> a(int i, ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        android.support.v4.i.a<String, String> aVar = new android.support.v4.i.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            c cVar = arrayList.get(i4);
            if (cVar.b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (cVar.r != null) {
                    int size = cVar.r.size();
                    if (booleanValue) {
                        arrayList3 = cVar.r;
                        arrayList4 = cVar.s;
                    } else {
                        ArrayList<String> arrayList5 = cVar.r;
                        arrayList3 = cVar.s;
                        arrayList4 = arrayList5;
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

    private static void a(o oVar, int i, a aVar, View view, android.support.v4.i.a<String, String> aVar2) {
        i iVar;
        i iVar2;
        v a2;
        Object obj;
        ViewGroup viewGroup = oVar.n.a() ? (ViewGroup) oVar.n.a(i) : null;
        if (viewGroup == null || (a2 = a((iVar2 = aVar.f310d), (iVar = aVar.f307a))) == null) {
            return;
        }
        boolean z = aVar.f308b;
        boolean z2 = aVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object a3 = a(a2, iVar, z);
        Object b2 = b(a2, iVar2, z2);
        Object a4 = a(a2, viewGroup, view, aVar2, aVar, arrayList2, arrayList, a3, b2);
        if (a3 == null && a4 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> b3 = b(a2, obj, iVar2, arrayList2, view);
        ArrayList<View> b4 = b(a2, a3, iVar, arrayList, view);
        b(b4, 4);
        Object a5 = a(a2, a3, obj, a4, iVar, z);
        if (a5 == null) {
            return;
        }
        a(a2, obj, iVar2, b3);
        ArrayList<String> a6 = a2.a(arrayList);
        a2.a(a5, a3, b4, obj, b3, a4, arrayList);
        a2.a(viewGroup, a5);
        a2.a(viewGroup, arrayList2, arrayList, a6, aVar2);
        b(b4, 0);
        a2.a(a4, arrayList2, arrayList);
    }

    private static void a(v vVar, Object obj, i iVar, final ArrayList<View> arrayList) {
        if (iVar == null || obj == null || !iVar.mAdded || !iVar.mHidden || !iVar.mHiddenChanged) {
            return;
        }
        iVar.setHideReplaced(true);
        vVar.b(obj, iVar.getView(), arrayList);
        ac.a(iVar.mContainer, new Runnable() { // from class: android.support.v4.app.t.1
            @Override // java.lang.Runnable
            public void run() {
                t.b(arrayList, 4);
            }
        });
    }

    private static void b(o oVar, int i, a aVar, View view, android.support.v4.i.a<String, String> aVar2) {
        i iVar;
        i iVar2;
        v a2;
        Object obj;
        ViewGroup viewGroup = oVar.n.a() ? (ViewGroup) oVar.n.a(i) : null;
        if (viewGroup == null || (a2 = a((iVar2 = aVar.f310d), (iVar = aVar.f307a))) == null) {
            return;
        }
        boolean z = aVar.f308b;
        boolean z2 = aVar.e;
        Object a3 = a(a2, iVar, z);
        Object b2 = b(a2, iVar2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object b3 = b(a2, viewGroup, view, aVar2, aVar, arrayList, arrayList2, a3, b2);
        if (a3 == null && b3 == null) {
            obj = b2;
            if (obj == null) {
                return;
            }
        } else {
            obj = b2;
        }
        ArrayList<View> b4 = b(a2, obj, iVar2, arrayList, view);
        Object obj2 = (b4 == null || b4.isEmpty()) ? null : obj;
        a2.b(a3, view);
        Object a4 = a(a2, a3, obj2, b3, iVar, aVar.f308b);
        if (a4 == null) {
            return;
        }
        ArrayList<View> arrayList3 = new ArrayList<>();
        a2.a(a4, a3, arrayList3, obj2, b4, b3, arrayList2);
        a(a2, viewGroup, iVar, view, arrayList2, a3, arrayList3, obj2, b4);
        a2.a((View) viewGroup, arrayList2, (Map<String, String>) aVar2);
        a2.a(viewGroup, a4);
        a2.a(viewGroup, arrayList2, (Map<String, String>) aVar2);
    }

    private static void a(final v vVar, ViewGroup viewGroup, final i iVar, final View view, final ArrayList<View> arrayList, final Object obj, final ArrayList<View> arrayList2, final Object obj2, final ArrayList<View> arrayList3) {
        ac.a(viewGroup, new Runnable() { // from class: android.support.v4.app.t.2
            @Override // java.lang.Runnable
            public void run() {
                if (obj != null) {
                    vVar.c(obj, view);
                    arrayList2.addAll(t.b(vVar, obj, iVar, arrayList, view));
                }
                if (arrayList3 != null) {
                    if (obj2 != null) {
                        ArrayList<View> arrayList4 = new ArrayList<>();
                        arrayList4.add(view);
                        vVar.b(obj2, arrayList3, arrayList4);
                    }
                    arrayList3.clear();
                    arrayList3.add(view);
                }
            }
        });
    }

    private static v a(i iVar, i iVar2) {
        ArrayList arrayList = new ArrayList();
        if (iVar != null) {
            Object exitTransition = iVar.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = iVar.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = iVar.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (iVar2 != null) {
            Object enterTransition = iVar2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = iVar2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = iVar2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f292b != null && a(f292b, arrayList)) {
            return f292b;
        }
        if (f293c != null && a(f293c, arrayList)) {
            return f293c;
        }
        if (f292b != null || f293c != null) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return null;
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

    private static Object a(v vVar, i iVar, i iVar2, boolean z) {
        Object sharedElementEnterTransition;
        if (iVar == null || iVar2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = iVar2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = iVar.getSharedElementEnterTransition();
        }
        return vVar.c(vVar.b(sharedElementEnterTransition));
    }

    private static Object a(v vVar, i iVar, boolean z) {
        Object enterTransition;
        if (iVar == null) {
            return null;
        }
        if (z) {
            enterTransition = iVar.getReenterTransition();
        } else {
            enterTransition = iVar.getEnterTransition();
        }
        return vVar.b(enterTransition);
    }

    private static Object b(v vVar, i iVar, boolean z) {
        Object exitTransition;
        if (iVar == null) {
            return null;
        }
        if (z) {
            exitTransition = iVar.getReturnTransition();
        } else {
            exitTransition = iVar.getExitTransition();
        }
        return vVar.b(exitTransition);
    }

    private static Object a(final v vVar, ViewGroup viewGroup, View view, android.support.v4.i.a<String, String> aVar, a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final View view2;
        final Rect rect;
        final i iVar = aVar2.f307a;
        final i iVar2 = aVar2.f310d;
        if (iVar != null) {
            iVar.getView().setVisibility(0);
        }
        if (iVar == null || iVar2 == null) {
            return null;
        }
        final boolean z = aVar2.f308b;
        Object a2 = aVar.isEmpty() ? null : a(vVar, iVar, iVar2, z);
        android.support.v4.i.a<String, View> b2 = b(vVar, aVar, a2, aVar2);
        final android.support.v4.i.a<String, View> c2 = c(vVar, aVar, a2, aVar2);
        if (aVar.isEmpty()) {
            if (b2 != null) {
                b2.clear();
            }
            if (c2 != null) {
                c2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, b2, aVar.keySet());
            a(arrayList2, c2, aVar.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        b(iVar, iVar2, z, b2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            vVar.a(obj3, view, arrayList);
            a(vVar, obj3, obj2, b2, aVar2.e, aVar2.f);
            Rect rect2 = new Rect();
            View b3 = b(c2, aVar2, obj, z);
            if (b3 != null) {
                vVar.a(obj, rect2);
            }
            rect = rect2;
            view2 = b3;
        } else {
            view2 = null;
            rect = null;
        }
        ac.a(viewGroup, new Runnable() { // from class: android.support.v4.app.t.3
            @Override // java.lang.Runnable
            public void run() {
                t.b(i.this, iVar2, z, (android.support.v4.i.a<String, View>) c2, false);
                if (view2 != null) {
                    vVar.a(view2, rect);
                }
            }
        });
        return obj3;
    }

    private static void a(ArrayList<View> arrayList, android.support.v4.i.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c2 = aVar.c(size);
            if (collection.contains(android.support.v4.j.s.g(c2))) {
                arrayList.add(c2);
            }
        }
    }

    private static Object b(final v vVar, ViewGroup viewGroup, final View view, android.support.v4.i.a<String, String> aVar, final a aVar2, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final Object obj, Object obj2) {
        Object a2;
        android.support.v4.i.a<String, String> aVar3;
        Object obj3;
        Rect rect;
        final i iVar = aVar2.f307a;
        final i iVar2 = aVar2.f310d;
        if (iVar == null || iVar2 == null) {
            return null;
        }
        final boolean z = aVar2.f308b;
        if (aVar.isEmpty()) {
            aVar3 = aVar;
            a2 = null;
        } else {
            a2 = a(vVar, iVar, iVar2, z);
            aVar3 = aVar;
        }
        android.support.v4.i.a<String, View> b2 = b(vVar, aVar3, a2, aVar2);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(b2.values());
            obj3 = a2;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        b(iVar, iVar2, z, b2, true);
        if (obj3 != null) {
            rect = new Rect();
            vVar.a(obj3, view, arrayList);
            a(vVar, obj3, obj2, b2, aVar2.e, aVar2.f);
            if (obj != null) {
                vVar.a(obj, rect);
            }
        } else {
            rect = null;
        }
        final android.support.v4.i.a<String, String> aVar4 = aVar3;
        final Object obj4 = obj3;
        final Rect rect2 = rect;
        ac.a(viewGroup, new Runnable() { // from class: android.support.v4.app.t.4
            @Override // java.lang.Runnable
            public void run() {
                android.support.v4.i.a c2 = t.c(v.this, aVar4, obj4, aVar2);
                if (c2 != null) {
                    arrayList2.addAll(c2.values());
                    arrayList2.add(view);
                }
                t.b(iVar, iVar2, z, (android.support.v4.i.a<String, View>) c2, false);
                if (obj4 != null) {
                    v.this.a(obj4, arrayList, arrayList2);
                    View b3 = t.b(c2, aVar2, obj, z);
                    if (b3 == null) {
                        return;
                    }
                    v.this.a(b3, rect2);
                }
            }
        });
        return obj3;
    }

    private static android.support.v4.i.a<String, View> b(v vVar, android.support.v4.i.a<String, String> aVar, Object obj, a aVar2) {
        af exitTransitionCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        i iVar = aVar2.f310d;
        android.support.v4.i.a<String, View> aVar3 = new android.support.v4.i.a<>();
        vVar.a((Map<String, View>) aVar3, iVar.getView());
        c cVar = aVar2.f;
        if (aVar2.e) {
            exitTransitionCallback = iVar.getEnterTransitionCallback();
            arrayList = cVar.s;
        } else {
            exitTransitionCallback = iVar.getExitTransitionCallback();
            arrayList = cVar.r;
        }
        aVar3.a((Collection<?>) arrayList);
        if (exitTransitionCallback != null) {
            exitTransitionCallback.a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(android.support.v4.j.s.g(view))) {
                    aVar.put(android.support.v4.j.s.g(view), aVar.remove(str));
                }
            }
        } else {
            aVar.a((Collection<?>) aVar3.keySet());
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.support.v4.i.a<String, View> c(v vVar, android.support.v4.i.a<String, String> aVar, Object obj, a aVar2) {
        af enterTransitionCallback;
        ArrayList<String> arrayList;
        String a2;
        i iVar = aVar2.f307a;
        View view = iVar.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        android.support.v4.i.a<String, View> aVar3 = new android.support.v4.i.a<>();
        vVar.a((Map<String, View>) aVar3, view);
        c cVar = aVar2.f309c;
        if (aVar2.f308b) {
            enterTransitionCallback = iVar.getExitTransitionCallback();
            arrayList = cVar.r;
        } else {
            enterTransitionCallback = iVar.getEnterTransitionCallback();
            arrayList = cVar.s;
        }
        if (arrayList != null) {
            aVar3.a((Collection<?>) arrayList);
            aVar3.a((Collection<?>) aVar.values());
        }
        if (enterTransitionCallback != null) {
            enterTransitionCallback.a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar3.get(str);
                if (view2 == null) {
                    String a3 = a(aVar, str);
                    if (a3 != null) {
                        aVar.remove(a3);
                    }
                } else if (!str.equals(android.support.v4.j.s.g(view2)) && (a2 = a(aVar, str)) != null) {
                    aVar.put(a2, android.support.v4.j.s.g(view2));
                }
            }
        } else {
            a(aVar, aVar3);
        }
        return aVar3;
    }

    private static String a(android.support.v4.i.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.c(i))) {
                return aVar.b(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static View b(android.support.v4.i.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        String str;
        c cVar = aVar2.f309c;
        if (obj == null || aVar == null || cVar.r == null || cVar.r.isEmpty()) {
            return null;
        }
        if (z) {
            str = cVar.r.get(0);
        } else {
            str = cVar.s.get(0);
        }
        return aVar.get(str);
    }

    private static void a(v vVar, Object obj, Object obj2, android.support.v4.i.a<String, View> aVar, boolean z, c cVar) {
        String str;
        if (cVar.r == null || cVar.r.isEmpty()) {
            return;
        }
        if (z) {
            str = cVar.s.get(0);
        } else {
            str = cVar.r.get(0);
        }
        View view = aVar.get(str);
        vVar.a(obj, view);
        if (obj2 == null) {
            return;
        }
        vVar.a(obj2, view);
    }

    private static void a(android.support.v4.i.a<String, String> aVar, android.support.v4.i.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.c(size))) {
                aVar.d(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(i iVar, i iVar2, boolean z, android.support.v4.i.a<String, View> aVar, boolean z2) {
        af enterTransitionCallback;
        if (z) {
            enterTransitionCallback = iVar2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = iVar.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.b(i));
                arrayList.add(aVar.c(i));
            }
            if (z2) {
                enterTransitionCallback.a(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.b(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<View> b(v vVar, Object obj, i iVar, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = iVar.getView();
            if (view2 != null) {
                vVar.a(arrayList2, view2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    private static Object a(v vVar, Object obj, Object obj2, Object obj3, i iVar, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || iVar == null) {
            z2 = true;
        } else if (z) {
            z2 = iVar.getAllowReturnTransitionOverlap();
        } else {
            z2 = iVar.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return vVar.a(obj2, obj, obj3);
        }
        return vVar.b(obj2, obj, obj3);
    }

    public static void a(c cVar, SparseArray<a> sparseArray, boolean z) {
        int size = cVar.f211b.size();
        for (int i = 0; i < size; i++) {
            a(cVar, cVar.f211b.get(i), sparseArray, false, z);
        }
    }

    public static void b(c cVar, SparseArray<a> sparseArray, boolean z) {
        if (!cVar.f210a.n.a()) {
            return;
        }
        for (int size = cVar.f211b.size() - 1; size >= 0; size--) {
            a(cVar, cVar.f211b.get(size), sparseArray, true, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
        if (r10.mAdded != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0088, code lost:
        if (r10.mHidden == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008a, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.support.v4.app.c r16, android.support.v4.app.c.a r17, android.util.SparseArray<android.support.v4.app.t.a> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.t.a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar == null) {
            a aVar2 = new a();
            sparseArray.put(i, aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public i f307a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f308b;

        /* renamed from: c  reason: collision with root package name */
        public c f309c;

        /* renamed from: d  reason: collision with root package name */
        public i f310d;
        public boolean e;
        public c f;

        a() {
        }
    }
}
