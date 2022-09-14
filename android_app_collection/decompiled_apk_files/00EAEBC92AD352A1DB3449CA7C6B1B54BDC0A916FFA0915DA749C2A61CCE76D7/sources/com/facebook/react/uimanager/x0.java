package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f6136a;

    /* renamed from: b  reason: collision with root package name */
    private int f6137b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int[] f6138c;

    /* loaded from: classes.dex */
    class a implements Comparator<View> {
        a(x0 x0Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            if (viewZIndex == null) {
                viewZIndex = 0;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            if (viewZIndex2 == null) {
                viewZIndex2 = 0;
            }
            return viewZIndex.intValue() - viewZIndex2.intValue();
        }
    }

    public x0(ViewGroup viewGroup) {
        this.f6136a = viewGroup;
    }

    public int a(int i, int i2) {
        if (this.f6138c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f6136a.getChildAt(i3));
            }
            Collections.sort(arrayList, new a(this));
            this.f6138c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f6138c[i4] = this.f6136a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f6138c[i2];
    }

    public void a(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f6137b++;
        }
        this.f6138c = null;
    }

    public boolean a() {
        return this.f6137b > 0;
    }

    public void b() {
        this.f6137b = 0;
        for (int i = 0; i < this.f6136a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.f6136a.getChildAt(i)) != null) {
                this.f6137b++;
            }
        }
        this.f6138c = null;
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f6137b--;
        }
        this.f6138c = null;
    }
}
