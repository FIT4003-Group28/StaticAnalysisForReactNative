package android.support.v4.j;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f522a;

    /* renamed from: b  reason: collision with root package name */
    private int f523b;

    public o(ViewGroup viewGroup) {
        this.f522a = viewGroup;
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        this.f523b = i;
    }

    public int a() {
        return this.f523b;
    }

    public void a(View view) {
        a(view, 0);
    }

    public void a(View view, int i) {
        this.f523b = 0;
    }
}
