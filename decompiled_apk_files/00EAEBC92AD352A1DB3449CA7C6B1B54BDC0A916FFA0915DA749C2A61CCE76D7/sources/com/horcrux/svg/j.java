package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j {
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
    final ArrayList<h> f9617a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f9618b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f9619c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f9620d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<SVGLength[]> f9621e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<double[]> f9622f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<Integer> f9623g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<Integer> f9624h = new ArrayList<>();
    private final ArrayList<Integer> i = new ArrayList<>();
    private final ArrayList<Integer> j = new ArrayList<>();
    private final ArrayList<Integer> k = new ArrayList<>();
    private final ArrayList<Integer> l = new ArrayList<>();
    private final ArrayList<Integer> m = new ArrayList<>();
    private final ArrayList<Integer> n = new ArrayList<>();
    private final ArrayList<Integer> o = new ArrayList<>();
    private final ArrayList<Integer> p = new ArrayList<>();
    private double q = 12.0d;
    private h r = h.p;
    private SVGLength[] w = new SVGLength[0];
    private SVGLength[] x = new SVGLength[0];
    private SVGLength[] y = new SVGLength[0];
    private SVGLength[] z = new SVGLength[0];
    private double[] A = {0.0d};
    private int G = -1;
    private int H = -1;
    private int I = -1;
    private int J = -1;
    private int K = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(float f2, float f3, float f4) {
        this.M = f2;
        this.N = f3;
        this.O = f4;
        this.f9618b.add(this.w);
        this.f9619c.add(this.x);
        this.f9620d.add(this.y);
        this.f9621e.add(this.z);
        this.f9622f.add(this.A);
        this.f9623g.add(Integer.valueOf(this.G));
        this.f9624h.add(Integer.valueOf(this.H));
        this.i.add(Integer.valueOf(this.I));
        this.j.add(Integer.valueOf(this.J));
        this.k.add(Integer.valueOf(this.K));
        this.f9617a.add(this.r);
        j();
    }

    private h a(l lVar) {
        h a2;
        if (this.L > 0) {
            return this.r;
        }
        do {
            lVar = lVar.getParentTextRoot();
            if (lVar == null) {
                return h.p;
            }
            a2 = lVar.a().a();
        } while (a2 == h.p);
        return a2;
    }

    private static void a(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    private double[] a(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).f9525a;
        }
        return dArr;
    }

    private void b(l lVar, ReadableMap readableMap) {
        h a2 = a(lVar);
        this.L++;
        if (readableMap == null) {
            this.f9617a.add(a2);
            return;
        }
        h hVar = new h(readableMap, a2, this.M);
        this.q = hVar.f9592a;
        this.f9617a.add(hVar);
        this.r = hVar;
    }

    private SVGLength[] b(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i = 0; i < size; i++) {
            sVGLengthArr[i] = arrayList.get(i);
        }
        return sVGLengthArr;
    }

    private void j() {
        this.l.add(Integer.valueOf(this.B));
        this.m.add(Integer.valueOf(this.C));
        this.n.add(Integer.valueOf(this.D));
        this.o.add(Integer.valueOf(this.E));
        this.p.add(Integer.valueOf(this.F));
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
    public double a(double d2) {
        a(this.f9623g, this.B);
        int i = this.G + 1;
        SVGLength[] sVGLengthArr = this.w;
        if (i < sVGLengthArr.length) {
            this.u = 0.0d;
            this.G = i;
            this.s = w.a(sVGLengthArr[i], this.N, 0.0d, this.M, this.q);
        }
        this.s += d2;
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h a() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l lVar, ReadableMap readableMap) {
        b(lVar, readableMap);
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, q0 q0Var, ReadableMap readableMap, ArrayList<SVGLength> arrayList, ArrayList<SVGLength> arrayList2, ArrayList<SVGLength> arrayList3, ArrayList<SVGLength> arrayList4, ArrayList<SVGLength> arrayList5) {
        if (z) {
            k();
        }
        b(q0Var, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.B++;
            this.G = -1;
            this.f9623g.add(Integer.valueOf(this.G));
            this.w = b(arrayList);
            this.f9618b.add(this.w);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.C++;
            this.H = -1;
            this.f9624h.add(Integer.valueOf(this.H));
            this.x = b(arrayList2);
            this.f9619c.add(this.x);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.D++;
            this.I = -1;
            this.i.add(Integer.valueOf(this.I));
            this.y = b(arrayList3);
            this.f9620d.add(this.y);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.E++;
            this.J = -1;
            this.j.add(Integer.valueOf(this.J));
            this.z = b(arrayList4);
            this.f9621e.add(this.z);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.F++;
            this.K = -1;
            this.k.add(Integer.valueOf(this.K));
            this.A = a(arrayList5);
            this.f9622f.add(this.A);
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double b() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double e() {
        a(this.i, this.D);
        int i = this.I + 1;
        SVGLength[] sVGLengthArr = this.y;
        if (i < sVGLengthArr.length) {
            this.I = i;
            this.u += w.a(sVGLengthArr[i], this.N, 0.0d, this.M, this.q);
        }
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double f() {
        a(this.j, this.E);
        int i = this.J + 1;
        SVGLength[] sVGLengthArr = this.z;
        if (i < sVGLengthArr.length) {
            this.J = i;
            this.v += w.a(sVGLengthArr[i], this.O, 0.0d, this.M, this.q);
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
    public double h() {
        a(this.f9624h, this.C);
        int i = this.H + 1;
        SVGLength[] sVGLengthArr = this.x;
        if (i < sVGLengthArr.length) {
            this.v = 0.0d;
            this.H = i;
            this.t = w.a(sVGLengthArr[i], this.O, 0.0d, this.M, this.q);
        }
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        this.f9617a.remove(this.L);
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
        this.r = this.f9617a.get(this.L);
        this.B = this.l.get(this.L).intValue();
        this.C = this.m.get(this.L).intValue();
        this.D = this.n.get(this.L).intValue();
        this.E = this.o.get(this.L).intValue();
        this.F = this.p.get(this.L).intValue();
        if (i != this.B) {
            this.f9618b.remove(i);
            this.w = this.f9618b.get(this.B);
            this.G = this.f9623g.get(this.B).intValue();
        }
        if (i2 != this.C) {
            this.f9619c.remove(i2);
            this.x = this.f9619c.get(this.C);
            this.H = this.f9624h.get(this.C).intValue();
        }
        if (i3 != this.D) {
            this.f9620d.remove(i3);
            this.y = this.f9620d.get(this.D);
            this.I = this.i.get(this.D).intValue();
        }
        if (i4 != this.E) {
            this.f9621e.remove(i4);
            this.z = this.f9621e.get(this.E);
            this.J = this.j.get(this.E).intValue();
        }
        if (i5 != this.F) {
            this.f9622f.remove(i5);
            this.A = this.f9622f.get(this.F);
            this.K = this.k.get(this.F).intValue();
        }
    }
}
