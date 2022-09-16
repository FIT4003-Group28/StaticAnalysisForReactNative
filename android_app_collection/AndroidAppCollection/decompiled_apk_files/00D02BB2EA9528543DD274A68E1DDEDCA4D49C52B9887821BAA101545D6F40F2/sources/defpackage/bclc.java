package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bclc  reason: default package */
/* loaded from: classes3.dex */
public final class bclc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final bckr n;

    public bclc(bckr bckrVar, Activity activity) {
        this.n = bckrVar;
        int a = jmj.a(activity, 20);
        int a2 = jmj.a(activity, 12);
        this.j = a2;
        this.k = a - a2;
        int a3 = jmj.a(activity, 153);
        this.a = a3;
        int a4 = jmj.a(activity, 45);
        this.b = a4;
        this.c = a3 - a4;
        int a5 = jmj.a(activity, 18);
        int a6 = jmj.a(activity, 10);
        this.l = a6;
        this.m = a5 - a6;
        this.d = a + a3 + a5;
        this.e = a2 + a4 + a6;
        int a7 = jmj.a(activity, 12);
        int a8 = jmj.a(activity, 11);
        this.f = a8;
        this.g = a7 - a8;
        int a9 = jmj.a(activity, 12);
        int a10 = jmj.a(activity, 10);
        this.h = a10;
        this.i = a9 - a10;
    }

    public final Integer a() {
        double d = this.j;
        double d2 = this.k;
        double c = c();
        Double.isNaN(d2);
        Double.isNaN(d);
        return Integer.valueOf((int) (d + (d2 * c)));
    }

    public final Integer b() {
        double d = this.l;
        double d2 = this.m;
        double c = c();
        Double.isNaN(d2);
        Double.isNaN(d);
        return Integer.valueOf((int) (d + (d2 * c)));
    }

    public final double c() {
        return this.n.a();
    }
}
