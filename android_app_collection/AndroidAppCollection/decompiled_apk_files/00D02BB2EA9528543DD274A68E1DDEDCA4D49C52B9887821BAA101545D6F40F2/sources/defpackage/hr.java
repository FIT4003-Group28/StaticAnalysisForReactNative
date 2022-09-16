package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hr  reason: default package */
/* loaded from: classes.dex */
public abstract class hr {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void s(List<View> list, View view) {
        int size = list.size();
        if (v(list, view, size)) {
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
                    if (!v(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean t(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void u(View view, Rect rect) {
        if (!od.ak(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    private static boolean v(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object c(Object obj);

    public abstract void d(Object obj, View view, ArrayList<View> arrayList);

    public abstract void e(Object obj, View view);

    public abstract void f(Object obj, ArrayList<View> arrayList);

    public abstract Object g(Object obj, Object obj2, Object obj3);

    public abstract void h(Object obj, View view, ArrayList<View> arrayList);

    public abstract void i(ViewGroup viewGroup, Object obj);

    public abstract void j(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void k(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void l(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void m(Object obj, View view);

    public abstract void n(Object obj, View view);

    public abstract void o(Object obj, Rect rect);

    public void p(Object obj, akq akqVar, Runnable runnable) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    q(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String J = od.J(view);
            if (J != null) {
                map.put(J, view);
            }
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                r(map, viewGroup.getChildAt(i));
            }
        }
    }
}
