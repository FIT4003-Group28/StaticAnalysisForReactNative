package defpackage;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: PG */
/* renamed from: dgsx  reason: default package */
/* loaded from: classes6.dex */
public final class dgsx {
    final List<dgtm> a;
    private final ThreadLocal<Map<dgxd<?>, dgsw<?>>> b;
    private final Map<dgxd<?>, dgtl<?>> c;
    private final dguk d;
    private final JsonAdapterAnnotationTypeAdapterFactory e;

    static {
        dgxd.b(Object.class);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dgsx() {
        /*
            r6 = this;
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.a
            dgsq r2 = defpackage.dgsq.IDENTITY
            java.util.Map r3 = java.util.Collections.emptyMap()
            java.util.Collections.emptyList()
            java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            r4 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgsx.<init>():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static final dgxg j(Writer writer) {
        dgxg dgxgVar = new dgxg(writer);
        dgxgVar.e = false;
        return dgxgVar;
    }

    public static final void k(dgtc dgtcVar, dgxg dgxgVar) {
        boolean z = dgxgVar.c;
        dgxgVar.c = true;
        boolean z2 = dgxgVar.d;
        dgxgVar.d = true;
        boolean z3 = dgxgVar.e;
        dgxgVar.e = false;
        try {
            try {
                dguy.b(dgtcVar, dgxgVar);
            } catch (IOException e) {
                throw new dgtd(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage());
            }
        } finally {
            dgxgVar.c = z;
            dgxgVar.d = z2;
            dgxgVar.e = z3;
        }
    }

    public final <T> dgtl<T> b(dgxd<T> dgxdVar) {
        boolean z;
        dgtl<T> dgtlVar = (dgtl<T>) this.c.get(dgxdVar);
        if (dgtlVar != null) {
            return dgtlVar;
        }
        Map<dgxd<?>, dgsw<?>> map = this.b.get();
        if (map == null) {
            map = new HashMap<>();
            this.b.set(map);
            z = true;
        } else {
            z = false;
        }
        dgsw<?> dgswVar = map.get(dgxdVar);
        if (dgswVar != null) {
            return dgswVar;
        }
        try {
            dgsw<?> dgswVar2 = new dgsw<>();
            map.put(dgxdVar, dgswVar2);
            for (dgtm dgtmVar : this.a) {
                dgtl<T> a = dgtmVar.a(this, dgxdVar);
                if (a != null) {
                    if (dgswVar2.a == null) {
                        dgswVar2.a = a;
                        this.c.put(dgxdVar, a);
                        return a;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + dgxdVar);
        } finally {
            map.remove(dgxdVar);
            if (z) {
                this.b.remove();
            }
        }
    }

    public final <T> dgtl<T> c(dgtm dgtmVar, dgxd<T> dgxdVar) {
        if (!this.a.contains(dgtmVar)) {
            dgtmVar = this.e;
        }
        boolean z = false;
        for (dgtm dgtmVar2 : this.a) {
            if (z) {
                dgtl<T> a = dgtmVar2.a(this, dgxdVar);
                if (a != null) {
                    return a;
                }
            } else if (dgtmVar2 == dgtmVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + dgxdVar);
    }

    public final <T> dgtl<T> d(Class<T> cls) {
        return b(dgxd.b(cls));
    }

    public final String e(Object obj) {
        if (obj == null) {
            return g(dgte.a);
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            f(obj, cls, j(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new dgtd(e);
        }
    }

    public final void f(Object obj, Type type, dgxg dgxgVar) {
        dgtl b = b(dgxd.a(type));
        boolean z = dgxgVar.c;
        dgxgVar.c = true;
        boolean z2 = dgxgVar.d;
        dgxgVar.d = true;
        boolean z3 = dgxgVar.e;
        dgxgVar.e = false;
        try {
            try {
                try {
                    b.b(dgxgVar, obj);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e.getMessage());
                }
            } catch (IOException e2) {
                throw new dgtd(e2);
            }
        } finally {
            dgxgVar.c = z;
            dgxgVar.d = z2;
            dgxgVar.e = z3;
        }
    }

    public final String g(dgtc dgtcVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            k(dgtcVar, j(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new dgtd(e);
        }
    }

    public final <T> T h(String str, Class<T> cls) {
        dgxe dgxeVar = new dgxe(new StringReader(str));
        dgxeVar.a = false;
        Object i = i(dgxeVar, cls);
        if (i != null) {
            try {
                if (dgxeVar.q() != 10) {
                    throw new dgtd("JSON document was not fully consumed.");
                }
            } catch (dgxh e) {
                throw new dgtj(e);
            } catch (IOException e2) {
                throw new dgtd(e2);
            }
        }
        return (T) dgux.a(cls).cast(i);
    }

    public final <T> T i(dgxe dgxeVar, Type type) {
        boolean z = dgxeVar.a;
        boolean z2 = true;
        dgxeVar.a = true;
        try {
            try {
                try {
                    dgxeVar.q();
                    try {
                        return b(dgxd.a(type)).a(dgxeVar);
                    } catch (EOFException e) {
                        e = e;
                        z2 = false;
                        if (z2) {
                            dgxeVar.a = z;
                            return null;
                        }
                        throw new dgtj(e);
                    }
                } finally {
                    dgxeVar.a = z;
                }
            } catch (EOFException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new dgtj(e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage());
        } catch (IllegalStateException e5) {
            throw new dgtj(e5);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.a + ",instanceCreators:" + this.d + "}";
    }

    public dgsx(Excluder excluder, dgsr dgsrVar, Map<Type, dgsz<?>> map, int i, List<dgtm> list) {
        this.b = new ThreadLocal<>();
        this.c = new ConcurrentHashMap();
        dguk dgukVar = new dguk(map);
        this.d = dgukVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dgwy.W);
        arrayList.add(dgvm.a);
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(dgwy.B);
        arrayList.add(dgwy.m);
        arrayList.add(dgwy.g);
        arrayList.add(dgwy.i);
        arrayList.add(dgwy.k);
        dgtl<Number> dgtlVar = dgwy.t;
        arrayList.add(dgwy.c(Long.TYPE, Long.class, dgtlVar));
        arrayList.add(dgwy.c(Double.TYPE, Double.class, new dgss()));
        arrayList.add(dgwy.c(Float.TYPE, Float.class, new dgst()));
        arrayList.add(dgwy.v);
        arrayList.add(dgwy.o);
        arrayList.add(dgwy.q);
        arrayList.add(dgwy.b(AtomicLong.class, new dgsu(dgtlVar).c()));
        arrayList.add(dgwy.b(AtomicLongArray.class, new dgsv(dgtlVar).c()));
        arrayList.add(dgwy.s);
        arrayList.add(dgwy.x);
        arrayList.add(dgwy.D);
        arrayList.add(dgwy.F);
        arrayList.add(dgwy.b(BigDecimal.class, dgwy.z));
        arrayList.add(dgwy.b(BigInteger.class, dgwy.A));
        arrayList.add(dgwy.H);
        arrayList.add(dgwy.J);
        arrayList.add(dgwy.N);
        arrayList.add(dgwy.P);
        arrayList.add(dgwy.U);
        arrayList.add(dgwy.L);
        arrayList.add(dgwy.d);
        arrayList.add(dgvg.a);
        arrayList.add(dgwy.S);
        arrayList.add(dgvr.a);
        arrayList.add(dgvq.a);
        arrayList.add(dgwy.Q);
        arrayList.add(dgve.a);
        arrayList.add(dgwy.b);
        arrayList.add(new CollectionTypeAdapterFactory(dgukVar));
        arrayList.add(new MapTypeAdapterFactory(dgukVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(dgukVar);
        this.e = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(dgwy.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(dgukVar, dgsrVar, excluder));
        this.a = Collections.unmodifiableList(arrayList);
    }
}
