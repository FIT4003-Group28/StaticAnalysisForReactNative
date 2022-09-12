package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnvd  reason: default package */
/* loaded from: classes.dex */
public final class bnvd {
    public final String a;
    @dzsi
    public bntb b;
    public int c;
    public final int d;
    public final int e;
    public final bnqy f;
    public bntc g;
    public int h;
    public int i;
    public int j;
    final SparseArray<bnvc> k = new SparseArray<>();
    public final ArrayList<Rect> l;
    public int m;
    public int n;
    public int o;

    public bnvd(String str, int i, int i2, int i3, int i4) {
        dbsk.a(true);
        this.a = str;
        this.c = 2048;
        this.d = i3;
        this.e = i4;
        double d = i;
        double d2 = i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        int floor = (int) Math.floor(d / d2);
        double d3 = i2;
        double d4 = i4;
        Double.isNaN(d3);
        Double.isNaN(d4);
        this.f = new bnqy(floor, (int) Math.floor(d3 / d4));
        this.g = bntc.a;
        this.h = i;
        this.i = 0;
        this.j = 0;
        this.l = new ArrayList<>();
        this.m = 0;
        this.n = 0;
        this.o = 0;
    }

    public final int a() {
        return this.f.b * this.e;
    }

    public final boolean b() {
        return this.j > 0;
    }

    public final int c() {
        double a = a();
        Double.isNaN(a);
        return ((int) Math.ceil(a / 256.0d)) * 256;
    }

    public final int d(int i) {
        dbsk.l(i >= 0);
        return this.f.k(i) * this.d;
    }

    public final int e(int i) {
        dbsk.l(i >= 0);
        return this.f.l(i) * this.e;
    }

    public final int f(int i) {
        dbsk.l(i >= 0);
        return this.f.m(i) * this.d;
    }

    public final int g(int i) {
        dbsk.l(i >= 0);
        return this.f.n(i) * this.e;
    }

    @dzsi
    public final bnvc h(@dzsi Integer num) {
        return this.k.get(num.intValue());
    }
}
