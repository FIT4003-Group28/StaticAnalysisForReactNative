package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class o extends com.swmansion.reanimated.nodes.m {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f10015a;

    /* renamed from: b  reason: collision with root package name */
    private final com.swmansion.reanimated.nodes.m[] f10016b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f10017c;

    /* renamed from: d  reason: collision with root package name */
    private static final b0 f10010d = new k();

    /* renamed from: e  reason: collision with root package name */
    private static final b0 f10011e = new s();

    /* renamed from: f  reason: collision with root package name */
    private static final b0 f10012f = new t();

    /* renamed from: g  reason: collision with root package name */
    private static final b0 f10013g = new u();

    /* renamed from: h  reason: collision with root package name */
    private static final b0 f10014h = new v();
    private static final b0 i = new w();
    private static final b0 j = new x();
    private static final b0 k = new y();
    private static final b0 l = new z();
    private static final b0 m = new a();
    private static final b0 n = new b();
    private static final b0 o = new c();
    private static final b0 p = new d();
    private static final b0 q = new e();
    private static final b0 r = new f();
    private static final b0 s = new g();
    private static final b0 t = new h();
    private static final b0 u = new i();
    private static final b0 v = new j();
    private static final b0 w = new l();
    private static final b0 x = new m();
    private static final b0 y = new n();
    private static final b0 z = new C0200o();
    private static final b0 A = new p();
    private static final b0 B = new q();
    private static final b0 C = new r();

    /* loaded from: classes.dex */
    static class a extends d0 {
        a() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.cos(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    private static abstract class a0 implements b0 {
        private a0() {
        }

        /* synthetic */ a0(k kVar) {
            this();
        }

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            return a((Double) mVarArr[0].value(), (Double) mVarArr[1].value()) ? 1.0d : 0.0d;
        }

        public abstract boolean a(Double d2, Double d3);
    }

    /* loaded from: classes.dex */
    static class b extends d0 {
        b() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.tan(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    private interface b0 {
        double a(com.swmansion.reanimated.nodes.m[] mVarArr);
    }

    /* loaded from: classes.dex */
    static class c extends d0 {
        c() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.acos(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    private static abstract class c0 implements b0 {
        private c0() {
        }

        /* synthetic */ c0(k kVar) {
            this();
        }

        public abstract double a(Double d2, Double d3);

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            double doubleValue = mVarArr[0].doubleValue().doubleValue();
            for (int i = 1; i < mVarArr.length; i++) {
                doubleValue = a(Double.valueOf(doubleValue), mVarArr[i].doubleValue());
            }
            return doubleValue;
        }
    }

    /* loaded from: classes.dex */
    static class d extends d0 {
        d() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.asin(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    private static abstract class d0 implements b0 {
        private d0() {
        }

        /* synthetic */ d0(k kVar) {
            this();
        }

        public abstract double a(Double d2);

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            return a((Double) mVarArr[0].value());
        }
    }

    /* loaded from: classes.dex */
    static class e extends d0 {
        e() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.atan(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static class f extends d0 {
        f() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.exp(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static class g extends d0 {
        g() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.round(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static class h implements b0 {
        h() {
        }

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            boolean b2 = o.b(mVarArr[0].value());
            for (int i = 1; i < mVarArr.length && b2; i++) {
                b2 = b2 && o.b(mVarArr[i].value());
            }
            return b2 ? 1.0d : 0.0d;
        }
    }

    /* loaded from: classes.dex */
    static class i implements b0 {
        i() {
        }

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            boolean b2 = o.b(mVarArr[0].value());
            for (int i = 1; i < mVarArr.length && !b2; i++) {
                b2 = b2 || o.b(mVarArr[i].value());
            }
            return b2 ? 1.0d : 0.0d;
        }
    }

    /* loaded from: classes.dex */
    static class j implements b0 {
        j() {
        }

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            return o.b(mVarArr[0].value()) ? 0.0d : 1.0d;
        }
    }

    /* loaded from: classes.dex */
    static class k extends c0 {
        k() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.c0
        public double a(Double d2, Double d3) {
            return d2.doubleValue() + d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class l implements b0 {
        l() {
        }

        @Override // com.swmansion.reanimated.nodes.o.b0
        public double a(com.swmansion.reanimated.nodes.m[] mVarArr) {
            Object value = mVarArr[0].value();
            return (value == null || ((value instanceof Double) && ((Double) value).isNaN())) ? 0.0d : 1.0d;
        }
    }

    /* loaded from: classes.dex */
    static class m extends a0 {
        m() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.a0
        public boolean a(Double d2, Double d3) {
            return (d2 == null || d3 == null || d2.doubleValue() >= d3.doubleValue()) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    static class n extends a0 {
        n() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.a0
        public boolean a(Double d2, Double d3) {
            return (d2 == null || d3 == null) ? d2 == d3 : d2.doubleValue() == d3.doubleValue();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.o$o  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0200o extends a0 {
        C0200o() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.a0
        public boolean a(Double d2, Double d3) {
            return (d2 == null || d3 == null || d2.doubleValue() <= d3.doubleValue()) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    static class p extends a0 {
        p() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.a0
        public boolean a(Double d2, Double d3) {
            return d2.doubleValue() <= d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class q extends a0 {
        q() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.a0
        public boolean a(Double d2, Double d3) {
            return d2.doubleValue() >= d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class r extends a0 {
        r() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.a0
        public boolean a(Double d2, Double d3) {
            return (d2 == null || d3 == null) ? d2 == d3 : d2.doubleValue() != d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class s extends c0 {
        s() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.c0
        public double a(Double d2, Double d3) {
            return d2.doubleValue() - d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class t extends c0 {
        t() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.c0
        public double a(Double d2, Double d3) {
            return d2.doubleValue() * d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class u extends c0 {
        u() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.c0
        public double a(Double d2, Double d3) {
            return d2.doubleValue() / d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class v extends c0 {
        v() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.c0
        public double a(Double d2, Double d3) {
            return Math.pow(d2.doubleValue(), d3.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static class w extends c0 {
        w() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.c0
        public double a(Double d2, Double d3) {
            return ((d2.doubleValue() % d3.doubleValue()) + d3.doubleValue()) % d3.doubleValue();
        }
    }

    /* loaded from: classes.dex */
    static class x extends d0 {
        x() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.sqrt(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static class y extends d0 {
        y() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.log(d2.doubleValue());
        }
    }

    /* loaded from: classes.dex */
    static class z extends d0 {
        z() {
            super(null);
        }

        @Override // com.swmansion.reanimated.nodes.o.d0
        public double a(Double d2) {
            return Math.sin(d2.doubleValue());
        }
    }

    public o(int i2, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i2, readableMap, bVar);
        b0 b0Var;
        this.f10015a = com.swmansion.reanimated.e.a(readableMap.getArray("input"));
        this.f10016b = new com.swmansion.reanimated.nodes.m[this.f10015a.length];
        String string = readableMap.getString("op");
        if ("add".equals(string)) {
            b0Var = f10010d;
        } else if ("sub".equals(string)) {
            b0Var = f10011e;
        } else if ("multiply".equals(string)) {
            b0Var = f10012f;
        } else if ("divide".equals(string)) {
            b0Var = f10013g;
        } else if ("pow".equals(string)) {
            b0Var = f10014h;
        } else if ("modulo".equals(string)) {
            b0Var = i;
        } else if ("sqrt".equals(string)) {
            b0Var = j;
        } else if ("log".equals(string)) {
            b0Var = k;
        } else if ("sin".equals(string)) {
            b0Var = l;
        } else if ("cos".equals(string)) {
            b0Var = m;
        } else if ("tan".equals(string)) {
            b0Var = n;
        } else if ("acos".equals(string)) {
            b0Var = o;
        } else if ("asin".equals(string)) {
            b0Var = p;
        } else if ("atan".equals(string)) {
            b0Var = q;
        } else if ("exp".equals(string)) {
            b0Var = r;
        } else if ("round".equals(string)) {
            b0Var = s;
        } else if ("and".equals(string)) {
            b0Var = t;
        } else if ("or".equals(string)) {
            b0Var = u;
        } else if ("not".equals(string)) {
            b0Var = v;
        } else if ("defined".equals(string)) {
            b0Var = w;
        } else if ("lessThan".equals(string)) {
            b0Var = x;
        } else if ("eq".equals(string)) {
            b0Var = y;
        } else if ("greaterThan".equals(string)) {
            b0Var = z;
        } else if ("lessOrEq".equals(string)) {
            b0Var = A;
        } else if ("greaterOrEq".equals(string)) {
            b0Var = B;
        } else if (!"neq".equals(string)) {
            throw new JSApplicationIllegalArgumentException("Unrecognized operator " + string);
        } else {
            b0Var = C;
        }
        this.f10017c = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Object obj) {
        return obj != null && !obj.equals(Double.valueOf(0.0d));
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f10015a;
            if (i2 < iArr.length) {
                this.f10016b[i2] = this.mNodesManager.a(iArr[i2], com.swmansion.reanimated.nodes.m.class);
                i2++;
            } else {
                return Double.valueOf(this.f10017c.a(this.f10016b));
            }
        }
    }
}
