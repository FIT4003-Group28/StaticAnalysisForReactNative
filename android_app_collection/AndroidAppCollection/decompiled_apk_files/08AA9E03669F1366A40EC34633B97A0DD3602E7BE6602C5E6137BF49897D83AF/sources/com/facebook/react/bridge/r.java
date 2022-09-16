package com.facebook.react.bridge;

import com.facebook.m.b;
import com.facebook.react.bridge.NativeModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
/* compiled from: JavaMethodWrapper.java */
/* loaded from: classes.dex */
public class r implements NativeModule.a {

    /* renamed from: a  reason: collision with root package name */
    private static final a<Boolean> f3282a = new a<Boolean>() { // from class: com.facebook.react.bridge.r.1
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public Boolean b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return Boolean.valueOf(readableNativeArray.getBoolean(i2));
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final a<Double> f3283b = new a<Double>() { // from class: com.facebook.react.bridge.r.3
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public Double b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return Double.valueOf(readableNativeArray.getDouble(i2));
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static final a<Float> f3284c = new a<Float>() { // from class: com.facebook.react.bridge.r.4
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public Float b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return Float.valueOf((float) readableNativeArray.getDouble(i2));
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final a<Integer> f3285d = new a<Integer>() { // from class: com.facebook.react.bridge.r.5
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public Integer b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return Integer.valueOf((int) readableNativeArray.getDouble(i2));
        }
    };
    private static final a<String> e = new a<String>() { // from class: com.facebook.react.bridge.r.6
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public String b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return readableNativeArray.getString(i2);
        }
    };
    private static final a<ReadableNativeArray> f = new a<ReadableNativeArray>() { // from class: com.facebook.react.bridge.r.7
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public ReadableNativeArray b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return readableNativeArray.d(i2);
        }
    };
    private static final a<g> g = new a<g>() { // from class: com.facebook.react.bridge.r.8
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public g b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return h.a(readableNativeArray, i2);
        }
    };
    private static final a<an> h = new a<an>() { // from class: com.facebook.react.bridge.r.9
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public an b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return readableNativeArray.c(i2);
        }
    };
    private static final a<d> i = new a<d>() { // from class: com.facebook.react.bridge.r.10
        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public d b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            if (readableNativeArray.isNull(i2)) {
                return null;
            }
            return new e(qVar, (int) readableNativeArray.getDouble(i2));
        }
    };
    private static final a<af> j = new a<af>() { // from class: com.facebook.react.bridge.r.2
        @Override // com.facebook.react.bridge.r.a
        public int a() {
            return 2;
        }

        @Override // com.facebook.react.bridge.r.a
        /* renamed from: a */
        public af b(q qVar, ReadableNativeArray readableNativeArray, int i2) {
            return new ag((d) r.i.b(qVar, readableNativeArray, i2), (d) r.i.b(qVar, readableNativeArray, i2 + 1));
        }
    };
    private static final boolean k = com.facebook.d.b.c.a().a(com.facebook.d.c.a.f2343d);
    private final Method l;
    private final Class[] m;
    private final int n;
    private final JavaModuleWrapper o;
    private String p;
    private boolean q = false;
    private a[] r;
    private String s;
    private Object[] t;
    private int u;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JavaMethodWrapper.java */
    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public int a() {
            return 1;
        }

        public abstract T b(q qVar, ReadableNativeArray readableNativeArray, int i);

        private a() {
        }
    }

    private static char a(Class cls) {
        char c2 = c(cls);
        if (c2 != 0) {
            return c2;
        }
        if (cls == d.class) {
            return 'X';
        }
        if (cls == af.class) {
            return 'P';
        }
        if (cls == an.class) {
            return 'M';
        }
        if (cls == am.class) {
            return 'A';
        }
        if (cls == g.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private static char b(Class cls) {
        char c2 = c(cls);
        if (c2 != 0) {
            return c2;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == ar.class) {
            return 'M';
        }
        if (cls == aq.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    private static char c(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return Matrix.MATRIX_TYPE_ZERO;
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    public r(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        this.p = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.o = javaModuleWrapper;
        this.l = method;
        this.l.setAccessible(true);
        this.m = this.l.getParameterTypes();
        this.n = this.m.length;
        if (z) {
            this.p = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (this.n <= 0 || this.m[this.n - 1] != af.class) {
        } else {
            this.p = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private void d() {
        if (this.q) {
            return;
        }
        b.a a2 = com.facebook.m.b.a(0L, "processArguments");
        a2.a("method", this.o.getName() + "." + this.l.getName()).a();
        try {
            this.q = true;
            this.r = a(this.m);
            this.s = a(this.l, this.m, this.p.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.t = new Object[this.m.length];
            this.u = e();
        } finally {
            com.facebook.m.b.a(0L).a();
        }
    }

    public String a() {
        if (!this.q) {
            d();
        }
        return (String) com.facebook.j.a.a.b(this.s);
    }

    private String a(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(b(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class cls = clsArr[i2];
            if (cls == af.class) {
                boolean z2 = true;
                if (i2 != clsArr.length - 1) {
                    z2 = false;
                }
                com.facebook.j.a.a.a(z2, "Promise must be used as last parameter only");
            }
            sb.append(a(cls));
        }
        return sb.toString();
    }

    private a[] a(Class[] clsArr) {
        a[] aVarArr = new a[clsArr.length];
        for (int i2 = 0; i2 < clsArr.length; i2 += aVarArr[i2].a()) {
            Class cls = clsArr[i2];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                aVarArr[i2] = f3282a;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                aVarArr[i2] = f3285d;
            } else if (cls == Double.class || cls == Double.TYPE) {
                aVarArr[i2] = f3283b;
            } else if (cls == Float.class || cls == Float.TYPE) {
                aVarArr[i2] = f3284c;
            } else if (cls == String.class) {
                aVarArr[i2] = e;
            } else if (cls == d.class) {
                aVarArr[i2] = i;
            } else if (cls == af.class) {
                aVarArr[i2] = j;
                boolean z = true;
                if (i2 != clsArr.length - 1) {
                    z = false;
                }
                com.facebook.j.a.a.a(z, "Promise must be used as last parameter only");
            } else if (cls == an.class) {
                aVarArr[i2] = h;
            } else if (cls == am.class) {
                aVarArr[i2] = f;
            } else if (cls == g.class) {
                aVarArr[i2] = g;
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
        }
        return aVarArr;
    }

    private int e() {
        int i2 = 0;
        for (a aVar : (a[]) com.facebook.j.a.a.b(this.r)) {
            i2 += aVar.a();
        }
        return i2;
    }

    private String a(int i2, int i3) {
        if (i3 <= 1) {
            return "" + i2;
        }
        return "" + i2 + "-" + ((i2 + i3) - 1);
    }

    @Override // com.facebook.react.bridge.NativeModule.a
    public void a(q qVar, ReadableNativeArray readableNativeArray) {
        String str = this.o.getName() + "." + this.l.getName();
        com.facebook.m.b.a(0L, "callJavaModuleMethod").a("method", str).a();
        if (k) {
            com.facebook.d.b.c.a().a(com.facebook.d.c.a.f2343d, "JS->Java: %s.%s()", this.o.getName(), this.l.getName());
        }
        try {
            if (!this.q) {
                d();
            }
            if (this.t != null && this.r != null) {
                if (this.u != readableNativeArray.size()) {
                    throw new aa(str + " got " + readableNativeArray.size() + " arguments, expected " + this.u);
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.r.length; i3++) {
                    try {
                        this.t[i3] = this.r[i3].b(qVar, readableNativeArray, i2);
                        i2 += this.r[i3].a();
                    } catch (UnexpectedNativeTypeException e2) {
                        throw new aa(e2.getMessage() + " (constructing arguments for " + str + " at argument index " + a(i2, this.r[i3].a()) + ")", e2);
                    }
                }
                try {
                    try {
                        try {
                            this.l.invoke(this.o.getModule(), this.t);
                            return;
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException("Could not invoke " + str, e3);
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new RuntimeException("Could not invoke " + str, e4);
                    }
                } catch (InvocationTargetException e5) {
                    if (e5.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e5.getCause());
                    }
                    throw new RuntimeException("Could not invoke " + str, e5);
                }
            }
            throw new Error("processArguments failed");
        } finally {
            com.facebook.m.b.a(0L).a();
        }
    }

    public String b() {
        return this.p;
    }
}
