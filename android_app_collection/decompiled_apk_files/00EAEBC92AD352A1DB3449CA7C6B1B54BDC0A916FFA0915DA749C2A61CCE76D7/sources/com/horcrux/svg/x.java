package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
class x {

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<x> f9714d;

    /* renamed from: e  reason: collision with root package name */
    private static int f9715e;

    /* renamed from: f  reason: collision with root package name */
    private static v f9716f;

    /* renamed from: g  reason: collision with root package name */
    private static v f9717g;

    /* renamed from: h  reason: collision with root package name */
    private static v f9718h;
    private static v i;
    private static boolean j;

    /* renamed from: a  reason: collision with root package name */
    y f9719a;

    /* renamed from: b  reason: collision with root package name */
    v f9720b;

    /* renamed from: c  reason: collision with root package name */
    double f9721c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9722a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9723b = new int[f.values().length];

        static {
            try {
                f9723b[f.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9723b[f.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9723b[f.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9723b[f.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9723b[f.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9722a = new int[y.values().length];
            try {
                f9722a[y.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9722a[y.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9722a[y.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private x(y yVar, v vVar, double d2) {
        this.f9719a = yVar;
        this.f9720b = vVar;
        this.f9721c = d2;
    }

    private static double a(double d2) {
        return d2 * 57.29577951308232d;
    }

    private static double a(double d2, double d3) {
        if (Math.abs(d2 - d3) > 180.0d) {
            d2 += 360.0d;
        }
        return (d2 + d3) / 2.0d;
    }

    private static double a(v vVar) {
        return Math.atan2(vVar.f9712b, vVar.f9711a);
    }

    private static double a(y yVar) {
        double a2 = a(a(f9718h));
        double a3 = a(a(i));
        int i2 = a.f9722a[yVar.ordinal()];
        if (i2 == 1) {
            return j ? a3 + 180.0d : a3;
        } else if (i2 == 2) {
            return a(a2, a3);
        } else {
            if (i2 == 3) {
                return a2;
            }
            return 0.0d;
        }
    }

    private static b0 a(C0205r c0205r) {
        v vVar;
        v vVar2;
        v vVar3;
        v vVar4;
        b0 b0Var = new b0();
        v[] vVarArr = c0205r.f9691b;
        int i2 = a.f9723b[c0205r.f9690a.ordinal()];
        if (i2 == 1) {
            b0Var.f9562c = vVarArr[2];
            b0Var.f9560a = a(vVarArr[0], f9716f);
            b0Var.f9561b = a(vVarArr[2], vVarArr[1]);
            if (b(b0Var.f9560a)) {
                a(b0Var, vVarArr[0], vVarArr[1], vVarArr[2]);
            } else if (b(b0Var.f9561b)) {
                vVar = f9716f;
                vVar2 = vVarArr[0];
                vVar3 = vVarArr[1];
                a(b0Var, vVar, vVar2, vVar3);
            }
        } else if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                vVar4 = vVarArr[0];
            } else if (i2 == 5) {
                vVar4 = f9717g;
            }
            b0Var.f9562c = vVar4;
            b0Var.f9560a = a(b0Var.f9562c, f9716f);
            b0Var.f9561b = a(b0Var.f9562c, f9716f);
        } else {
            b0Var.f9562c = vVarArr[1];
            vVar = f9716f;
            vVar2 = vVarArr[0];
            vVar3 = vVarArr[1];
            a(b0Var, vVar, vVar2, vVar3);
        }
        return b0Var;
    }

    private static v a(v vVar, v vVar2) {
        return new v(vVar2.f9711a - vVar.f9711a, vVar2.f9712b - vVar.f9712b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<x> a(ArrayList<C0205r> arrayList) {
        f9714d = new ArrayList<>();
        f9715e = 0;
        f9716f = new v(0.0d, 0.0d);
        f9717g = new v(0.0d, 0.0d);
        Iterator<C0205r> it = arrayList.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        a();
        return f9714d;
    }

    private static void a() {
        f9714d.add(new x(y.kEndMarker, f9716f, a(y.kEndMarker)));
    }

    private static void a(b0 b0Var, v vVar, v vVar2, v vVar3) {
        b0Var.f9560a = a(vVar2, vVar);
        b0Var.f9561b = a(vVar3, vVar2);
        if (b(b0Var.f9560a)) {
            b0Var.f9560a = b0Var.f9561b;
        } else if (!b(b0Var.f9561b)) {
        } else {
            b0Var.f9561b = b0Var.f9560a;
        }
    }

    private static void b(C0205r c0205r) {
        v vVar;
        b0 a2 = a(c0205r);
        i = a2.f9560a;
        int i2 = f9715e;
        if (i2 > 0) {
            y yVar = i2 == 1 ? y.kStartMarker : y.kMidMarker;
            f9714d.add(new x(yVar, f9716f, a(yVar)));
        }
        f9718h = a2.f9561b;
        f9716f = a2.f9562c;
        f fVar = c0205r.f9690a;
        if (fVar != f.kCGPathElementMoveToPoint) {
            if (fVar == f.kCGPathElementCloseSubpath) {
                vVar = new v(0.0d, 0.0d);
            }
            f9715e++;
        }
        vVar = c0205r.f9691b[0];
        f9717g = vVar;
        f9715e++;
    }

    private static boolean b(v vVar) {
        return vVar.f9711a == 0.0d && vVar.f9712b == 0.0d;
    }
}
