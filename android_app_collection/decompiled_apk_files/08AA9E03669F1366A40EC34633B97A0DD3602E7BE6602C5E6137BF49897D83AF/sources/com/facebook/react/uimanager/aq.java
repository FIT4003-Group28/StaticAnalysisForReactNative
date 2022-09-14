package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: ViewGroupDrawingOrderHelper.java */
/* loaded from: classes.dex */
public class aq {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f3815a;

    /* renamed from: b  reason: collision with root package name */
    private int f3816b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int[] f3817c;

    public aq(ViewGroup viewGroup) {
        this.f3815a = viewGroup;
    }

    public void a(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f3816b++;
        }
        this.f3817c = null;
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f3816b--;
        }
        this.f3817c = null;
    }

    public boolean a() {
        return this.f3816b > 0;
    }

    public int a(int i, int i2) {
        if (this.f3817c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.f3815a.getChildAt(i3));
            }
            Collections.sort(arrayList, new Comparator<View>() { // from class: com.facebook.react.uimanager.aq.1
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
            });
            this.f3817c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f3817c[i4] = this.f3815a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f3817c[i2];
    }

    public void b() {
        this.f3816b = 0;
        for (int i = 0; i < this.f3815a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.f3815a.getChildAt(i)) != null) {
                this.f3816b++;
            }
        }
        this.f3817c = null;
    }
}
