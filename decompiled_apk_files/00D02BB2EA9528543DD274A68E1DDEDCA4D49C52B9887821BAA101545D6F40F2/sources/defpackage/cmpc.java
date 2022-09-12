package defpackage;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmpc  reason: default package */
/* loaded from: classes5.dex */
public final class cmpc {
    public int e;
    public int f;
    public int g;
    public int h;
    int i;
    float j;
    float k;
    public int l;
    int m;
    public int o;
    public int p;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    final List<Integer> n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.m()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.n()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.o() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.p() + i4);
    }
}
