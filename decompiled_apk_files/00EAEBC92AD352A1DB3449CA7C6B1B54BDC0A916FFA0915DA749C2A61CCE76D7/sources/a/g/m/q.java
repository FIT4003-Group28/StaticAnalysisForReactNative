package a.g.m;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private int f371a;

    /* renamed from: b  reason: collision with root package name */
    private int f372b;

    public q(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f371a | this.f372b;
    }

    public void a(View view) {
        a(view, 0);
    }

    public void a(View view, int i) {
        if (i == 1) {
            this.f372b = 0;
        } else {
            this.f371a = 0;
        }
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f372b = i;
        } else {
            this.f371a = i;
        }
    }
}
