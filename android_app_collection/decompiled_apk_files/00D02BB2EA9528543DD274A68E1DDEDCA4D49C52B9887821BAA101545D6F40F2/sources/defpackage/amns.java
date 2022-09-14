package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: amns  reason: default package */
/* loaded from: classes.dex */
public final class amns extends bnuu {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    private final amng y;
    private final String[] z;

    public amns() {
        amng amngVar = new amng();
        this.y = amngVar;
        amne amneVar = amngVar.d;
        this.z = new String[]{amneVar.a, "unused", "unused", "unused", amneVar.b, amneVar.c};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        amnf amnfVar = this.y.c;
        this.e = bntbVar.i(i, amnfVar.o);
        this.a = bntbVar.i(i, amnfVar.k);
        this.b = bntbVar.i(i, amnfVar.l);
        this.c = bntbVar.i(i, amnfVar.m);
        this.d = bntbVar.i(i, amnfVar.n);
        this.f = bntbVar.i(i, amnfVar.j);
        GLES20.glUniform1i(this.e, 5);
        GLES20.glUniform1i(this.a, 1);
        GLES20.glUniform1i(this.b, 2);
        GLES20.glUniform1i(this.c, 3);
        GLES20.glUniform1i(this.d, 4);
        int i2 = this.f;
        int length = amnh.a.length;
        bntb.S(i2, 7, amnh.a);
        this.g = bntbVar.i(i, amnfVar.a);
        this.h = bntbVar.i(i, amnfVar.b);
        this.x = bntbVar.i(i, amnfVar.c);
        this.i = bntbVar.i(i, amnfVar.d);
        this.j = bntbVar.i(i, amnfVar.e);
        this.k = bntbVar.i(i, amnfVar.f);
        this.l = bntbVar.i(i, amnfVar.g);
        this.m = bntbVar.i(i, amnfVar.i);
        this.n = bntbVar.i(i, amnfVar.h);
        this.o = bntbVar.i(i, amnfVar.p);
        this.p = bntbVar.i(i, amnfVar.q);
        this.q = bntbVar.i(i, amnfVar.r);
        this.r = bntbVar.i(i, amnfVar.s);
        this.s = bntbVar.i(i, amnfVar.t);
        this.t = bntbVar.i(i, amnfVar.u);
        this.u = bntbVar.i(i, amnfVar.w);
        this.v = bntbVar.i(i, amnfVar.v);
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return this.z;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return this.y.a;
    }

    @Override // defpackage.bnuu
    public final String d() {
        return this.y.b;
    }
}
