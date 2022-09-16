package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f1813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f1814d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f1815e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1816f;

        a(v vVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1812b = i;
            this.f1813c = arrayList;
            this.f1814d = arrayList2;
            this.f1815e = arrayList3;
            this.f1816f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f1812b; i++) {
                a.g.m.v.a((View) this.f1813c.get(i), (String) this.f1814d.get(i));
                a.g.m.v.a((View) this.f1815e.get(i), (String) this.f1816f.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1817b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1818c;

        b(v vVar, ArrayList arrayList, Map map) {
            this.f1817b = arrayList;
            this.f1818c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1817b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1817b.get(i);
                String y = a.g.m.v.y(view);
                if (y != null) {
                    a.g.m.v.a(view, v.a(this.f1818c, y));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1819b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f1820c;

        c(v vVar, ArrayList arrayList, Map map) {
            this.f1819b = arrayList;
            this.f1820c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1819b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f1819b.get(i);
                a.g.m.v.a(view, (String) this.f1820c.get(a.g.m.v.y(view)));
            }
        }
    }

    static String a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(List<View> list, View view) {
        int size = list.size();
        if (a(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!a(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object a(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(a.g.m.v.y(view));
            a.g.m.v.a(view, (String) null);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String y = a.g.m.v.y(view2);
            arrayList4.add(y);
            if (y != null) {
                a.g.m.v.a(view2, (String) null);
                String str = map.get(y);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        a.g.m.v.a(arrayList2.get(i2), y);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a.g.m.s.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        a.g.m.s.a(view, new b(this, arrayList, map));
    }

    public abstract void a(ViewGroup viewGroup, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        a.g.m.s.a(viewGroup, new c(this, arrayList, map));
    }

    public void a(Fragment fragment, Object obj, a.g.j.b bVar, Runnable runnable) {
        runnable.run();
    }

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a2 = a.g.m.x.a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a2) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        a(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String y = a.g.m.v.y(view);
            if (y != null) {
                map.put(y, view);
            }
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(map, viewGroup.getChildAt(i));
            }
        }
    }

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);
}
