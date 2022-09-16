package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
/* compiled from: NativeViewHierarchyOptimizer.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final ao f3923a;

    /* renamed from: b  reason: collision with root package name */
    private final ac f3924b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f3925c = new SparseBooleanArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeViewHierarchyOptimizer.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final w f3926a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3927b;

        a(w wVar, int i) {
            this.f3926a = wVar;
            this.f3927b = i;
        }
    }

    public l(ao aoVar, ac acVar) {
        this.f3923a = aoVar;
        this.f3924b = acVar;
    }

    public void a(w wVar, af afVar, y yVar) {
        boolean z = wVar.getViewClass().equals(ReactViewManager.REACT_CLASS) && a(yVar);
        wVar.setIsLayoutOnly(z);
        if (!z) {
            this.f3923a.a(afVar, wVar.getReactTag(), wVar.getViewClass(), yVar);
        }
    }

    public static void a(w wVar) {
        wVar.removeAllNativeChildren();
    }

    public void a(w wVar, String str, y yVar) {
        if (wVar.isLayoutOnly() && !a(yVar)) {
            a(wVar, yVar);
        } else if (wVar.isLayoutOnly()) {
        } else {
            this.f3923a.a(wVar.getReactTag(), str, yVar);
        }
    }

    public void a(w wVar, int[] iArr, int[] iArr2, ap[] apVarArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            a(this.f3924b.c(i), z);
        }
        for (ap apVar : apVarArr) {
            a(wVar, this.f3924b.c(apVar.f3813b), apVar.f3814c);
        }
    }

    public void a(w wVar, com.facebook.react.bridge.am amVar) {
        for (int i = 0; i < amVar.size(); i++) {
            a(wVar, this.f3924b.c(amVar.getInt(i)), i);
        }
    }

    public void b(w wVar) {
        c(wVar);
    }

    public void a() {
        this.f3925c.clear();
    }

    private a a(w wVar, int i) {
        while (wVar.isLayoutOnly()) {
            w parent = wVar.getParent();
            if (parent == null) {
                return null;
            }
            i += parent.getNativeOffsetForChild(wVar);
            wVar = parent;
        }
        return new a(wVar, i);
    }

    private void a(w wVar, w wVar2, int i) {
        int nativeOffsetForChild = wVar.getNativeOffsetForChild(wVar.getChildAt(i));
        if (wVar.isLayoutOnly()) {
            a a2 = a(wVar, nativeOffsetForChild);
            if (a2 == null) {
                return;
            }
            w wVar3 = a2.f3926a;
            nativeOffsetForChild = a2.f3927b;
            wVar = wVar3;
        }
        if (!wVar2.isLayoutOnly()) {
            c(wVar, wVar2, nativeOffsetForChild);
        } else {
            b(wVar, wVar2, nativeOffsetForChild);
        }
    }

    private void a(w wVar, boolean z) {
        w nativeParent = wVar.getNativeParent();
        if (nativeParent != null) {
            int indexOfNativeChild = nativeParent.indexOfNativeChild(wVar);
            nativeParent.removeNativeChildAt(indexOfNativeChild);
            this.f3923a.a(nativeParent.getReactTag(), new int[]{indexOfNativeChild}, (ap[]) null, z ? new int[]{wVar.getReactTag()} : null);
            return;
        }
        for (int childCount = wVar.getChildCount() - 1; childCount >= 0; childCount--) {
            a(wVar.getChildAt(childCount), z);
        }
    }

    private void b(w wVar, w wVar2, int i) {
        d(wVar, wVar2, i);
    }

    private void c(w wVar, w wVar2, int i) {
        wVar.addNativeChildAt(wVar2, i);
        this.f3923a.a(wVar.getReactTag(), (int[]) null, new ap[]{new ap(wVar2.getReactTag(), i)}, (int[]) null);
    }

    private void d(w wVar, w wVar2, int i) {
        com.facebook.j.a.a.a(!wVar.isLayoutOnly());
        int i2 = i;
        for (int i3 = 0; i3 < wVar2.getChildCount(); i3++) {
            w childAt = wVar2.getChildAt(i3);
            com.facebook.j.a.a.a(childAt.getNativeParent() == null);
            if (childAt.isLayoutOnly()) {
                int nativeChildCount = wVar.getNativeChildCount();
                b(wVar, childAt, i2);
                i2 += wVar.getNativeChildCount() - nativeChildCount;
            } else {
                c(wVar, childAt, i2);
                i2++;
            }
        }
    }

    private void c(w wVar) {
        int reactTag = wVar.getReactTag();
        if (this.f3925c.get(reactTag)) {
            return;
        }
        this.f3925c.put(reactTag, true);
        int screenX = wVar.getScreenX();
        int screenY = wVar.getScreenY();
        for (w parent = wVar.getParent(); parent != null && parent.isLayoutOnly(); parent = parent.getParent()) {
            screenX += Math.round(parent.getLayoutX());
            screenY += Math.round(parent.getLayoutY());
        }
        a(wVar, screenX, screenY);
    }

    private void a(w wVar, int i, int i2) {
        if (!wVar.isLayoutOnly() && wVar.getNativeParent() != null) {
            this.f3923a.a(wVar.getNativeParent().getReactTag(), wVar.getReactTag(), i, i2, wVar.getScreenWidth(), wVar.getScreenHeight());
            return;
        }
        for (int i3 = 0; i3 < wVar.getChildCount(); i3++) {
            w childAt = wVar.getChildAt(i3);
            int reactTag = childAt.getReactTag();
            if (!this.f3925c.get(reactTag)) {
                this.f3925c.put(reactTag, true);
                a(childAt, childAt.getScreenX() + i, childAt.getScreenY() + i2);
            }
        }
    }

    private void a(w wVar, y yVar) {
        w parent = wVar.getParent();
        if (parent == null) {
            wVar.setIsLayoutOnly(false);
            return;
        }
        int indexOf = parent.indexOf(wVar);
        parent.removeChildAt(indexOf);
        a(wVar, false);
        wVar.setIsLayoutOnly(false);
        this.f3923a.a(wVar.getRootNode().getThemedContext(), wVar.getReactTag(), wVar.getViewClass(), yVar);
        parent.addChildAt(wVar, indexOf);
        a(parent, wVar, indexOf);
        for (int i = 0; i < wVar.getChildCount(); i++) {
            a(wVar, wVar.getChildAt(i), i);
        }
        com.facebook.j.a.a.a(this.f3925c.size() == 0);
        c(wVar);
        for (int i2 = 0; i2 < wVar.getChildCount(); i2++) {
            c(wVar.getChildAt(i2));
        }
        this.f3925c.clear();
    }

    private static boolean a(y yVar) {
        if (yVar == null) {
            return true;
        }
        if (yVar.a("collapsable") && !yVar.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator a2 = yVar.f3938a.a();
        while (a2.hasNextKey()) {
            if (!au.a(yVar.f3938a, a2.nextKey())) {
                return false;
            }
        }
        return true;
    }
}
