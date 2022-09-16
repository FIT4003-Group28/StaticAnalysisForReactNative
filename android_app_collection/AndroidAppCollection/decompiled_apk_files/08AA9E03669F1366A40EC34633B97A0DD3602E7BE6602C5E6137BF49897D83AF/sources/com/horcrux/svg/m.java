package com.horcrux.svg;

import com.facebook.react.bridge.an;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlyphContext.java */
/* loaded from: classes.dex */
public class m {
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int L;
    private final float M;
    private final float N;
    private final float O;
    private double s;
    private double t;
    private double u;
    private double v;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<i> f4879a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String[]> f4880b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<String[]> f4881c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<String[]> f4882d = new ArrayList<>();
    private final ArrayList<String[]> e = new ArrayList<>();
    private final ArrayList<double[]> f = new ArrayList<>();
    private final ArrayList<Integer> g = new ArrayList<>();
    private final ArrayList<Integer> h = new ArrayList<>();
    private final ArrayList<Integer> i = new ArrayList<>();
    private final ArrayList<Integer> j = new ArrayList<>();
    private final ArrayList<Integer> k = new ArrayList<>();
    private final ArrayList<Integer> l = new ArrayList<>();
    private final ArrayList<Integer> m = new ArrayList<>();
    private final ArrayList<Integer> n = new ArrayList<>();
    private final ArrayList<Integer> o = new ArrayList<>();
    private final ArrayList<Integer> p = new ArrayList<>();
    private double q = 12.0d;
    private i r = i.n;
    private String[] w = new String[0];
    private String[] x = new String[0];
    private String[] y = new String[0];
    private String[] z = new String[0];
    private double[] A = {0.0d};
    private int G = -1;
    private int H = -1;
    private int I = -1;
    private int J = -1;
    private int K = -1;

    private void j() {
        this.l.add(Integer.valueOf(this.B));
        this.m.add(Integer.valueOf(this.C));
        this.n.add(Integer.valueOf(this.D));
        this.o.add(Integer.valueOf(this.E));
        this.p.add(Integer.valueOf(this.F));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(float f, float f2, float f3) {
        this.M = f;
        this.N = f2;
        this.O = f3;
        this.f4880b.add(this.w);
        this.f4881c.add(this.x);
        this.f4882d.add(this.y);
        this.e.add(this.z);
        this.f.add(this.A);
        this.g.add(Integer.valueOf(this.G));
        this.h.add(Integer.valueOf(this.H));
        this.i.add(Integer.valueOf(this.I));
        this.j.add(Integer.valueOf(this.J));
        this.k.add(Integer.valueOf(this.K));
        this.f4879a.add(this.r);
        j();
    }

    private void k() {
        this.F = 0;
        this.E = 0;
        this.D = 0;
        this.C = 0;
        this.B = 0;
        this.K = -1;
        this.J = -1;
        this.I = -1;
        this.H = -1;
        this.G = -1;
        this.v = 0.0d;
        this.u = 0.0d;
        this.t = 0.0d;
        this.s = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i a() {
        return this.r;
    }

    private i a(o oVar) {
        if (this.L > 0) {
            return this.r;
        }
        for (o parentTextRoot = oVar.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            i a2 = parentTextRoot.a().a();
            if (a2 != i.n) {
                return a2;
            }
        }
        return i.n;
    }

    private void b(o oVar, an anVar) {
        i a2 = a(oVar);
        this.L++;
        if (anVar == null) {
            this.f4879a.add(a2);
            return;
        }
        i iVar = new i(anVar, a2, this.M);
        this.q = iVar.f4864a;
        this.f4879a.add(iVar);
        this.r = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(o oVar, an anVar) {
        b(oVar, anVar);
        j();
    }

    private String[] a(com.facebook.react.bridge.am amVar) {
        int size = amVar.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = amVar.getString(i);
        }
        return strArr;
    }

    private double[] b(com.facebook.react.bridge.am amVar) {
        int size = amVar.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(amVar.getString(i)).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, aj ajVar, an anVar, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.am amVar2, com.facebook.react.bridge.am amVar3, com.facebook.react.bridge.am amVar4, com.facebook.react.bridge.am amVar5) {
        if (z) {
            k();
        }
        b(ajVar, anVar);
        if (amVar != null && amVar.size() != 0) {
            this.B++;
            this.G = -1;
            this.g.add(Integer.valueOf(this.G));
            this.w = a(amVar);
            this.f4880b.add(this.w);
        }
        if (amVar2 != null && amVar2.size() != 0) {
            this.C++;
            this.H = -1;
            this.h.add(Integer.valueOf(this.H));
            this.x = a(amVar2);
            this.f4881c.add(this.x);
        }
        if (amVar3 != null && amVar3.size() != 0) {
            this.D++;
            this.I = -1;
            this.i.add(Integer.valueOf(this.I));
            this.y = a(amVar3);
            this.f4882d.add(this.y);
        }
        if (amVar4 != null && amVar4.size() != 0) {
            this.E++;
            this.J = -1;
            this.j.add(Integer.valueOf(this.J));
            this.z = a(amVar4);
            this.e.add(this.z);
        }
        if (amVar5 != null && amVar5.size() != 0) {
            this.F++;
            this.K = -1;
            this.k.add(Integer.valueOf(this.K));
            this.A = b(amVar5);
            this.f.add(this.A);
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f4879a.remove(this.L);
        this.l.remove(this.L);
        this.m.remove(this.L);
        this.n.remove(this.L);
        this.o.remove(this.L);
        this.p.remove(this.L);
        this.L--;
        int i = this.B;
        int i2 = this.C;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        this.r = this.f4879a.get(this.L);
        this.B = this.l.get(this.L).intValue();
        this.C = this.m.get(this.L).intValue();
        this.D = this.n.get(this.L).intValue();
        this.E = this.o.get(this.L).intValue();
        this.F = this.p.get(this.L).intValue();
        if (i != this.B) {
            this.f4880b.remove(i);
            this.w = this.f4880b.get(this.B);
            this.G = this.g.get(this.B).intValue();
        }
        if (i2 != this.C) {
            this.f4881c.remove(i2);
            this.x = this.f4881c.get(this.C);
            this.H = this.h.get(this.C).intValue();
        }
        if (i3 != this.D) {
            this.f4882d.remove(i3);
            this.y = this.f4882d.get(this.D);
            this.I = this.i.get(this.D).intValue();
        }
        if (i4 != this.E) {
            this.e.remove(i4);
            this.z = this.e.get(this.E);
            this.J = this.j.get(this.E).intValue();
        }
        if (i5 != this.F) {
            this.f.remove(i5);
            this.A = this.f.get(this.F);
            this.K = this.k.get(this.F).intValue();
        }
    }

    private static void a(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double c() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double a(double d2) {
        a(this.g, this.B);
        int i = this.G + 1;
        if (i < this.w.length) {
            this.u = 0.0d;
            this.G = i;
            this.s = w.a(this.w[i], this.N, 0.0d, this.M, this.q);
        }
        this.s += d2;
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double d() {
        a(this.h, this.C);
        int i = this.H + 1;
        if (i < this.x.length) {
            this.v = 0.0d;
            this.H = i;
            this.t = w.a(this.x[i], this.O, 0.0d, this.M, this.q);
        }
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double e() {
        a(this.i, this.D);
        int i = this.I + 1;
        if (i < this.y.length) {
            this.I = i;
            this.u += w.a(this.y[i], this.N, 0.0d, this.M, this.q);
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double f() {
        a(this.j, this.E);
        int i = this.J + 1;
        if (i < this.z.length) {
            this.J = i;
            this.v += w.a(this.z[i], this.O, 0.0d, this.M, this.q);
        }
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double g() {
        a(this.k, this.F);
        this.K = Math.min(this.K + 1, this.A.length - 1);
        return this.A[this.K];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.O;
    }
}
