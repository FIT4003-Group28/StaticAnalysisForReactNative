package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: deqw  reason: default package */
/* loaded from: classes6.dex */
public final class deqw implements deqo {
    public final JsonWriter a;
    private final Map<Class<?>, deqn<?>> b;
    private final Map<Class<?>, deqp<?>> c;
    private final deqn<Object> d;
    private final boolean e;

    public deqw(Writer writer, Map<Class<?>, deqn<?>> map, Map<Class<?>, deqp<?>> map2, deqn<Object> deqnVar, boolean z) {
        this.a = new JsonWriter(writer);
        this.b = map;
        this.c = map2;
        this.d = deqnVar;
        this.e = z;
    }

    @Override // defpackage.deqo
    public final /* bridge */ /* synthetic */ void a(String str, int i) {
        this.a.name(str);
        this.a.value(i);
    }

    @Override // defpackage.deqo
    public final /* bridge */ /* synthetic */ void b(String str, long j) {
        this.a.name(str);
        c(j);
    }

    public final void c(long j) {
        this.a.value(j);
    }

    public final void d(String str) {
        this.a.value(str);
    }

    final void e(deqn<Object> deqnVar, Object obj) {
        this.a.beginObject();
        deqnVar.a(obj, this);
        this.a.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Object obj) {
        if (obj == null) {
            this.a.nullValue();
        } else if (obj instanceof Number) {
            this.a.value((Number) obj);
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    this.a.value(Base64.encodeToString((byte[]) obj, 2));
                    return;
                }
                this.a.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.a.value(iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        c(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.a.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.a.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        g(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        g(objArr[i]);
                        i++;
                    }
                }
                this.a.endArray();
            } else if (obj instanceof Collection) {
                this.a.beginArray();
                for (Object obj2 : (Collection) obj) {
                    g(obj2);
                }
                this.a.endArray();
            } else if (obj instanceof Map) {
                this.a.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new deqm(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.a.endObject();
            } else {
                deqn<?> deqnVar = this.b.get(obj.getClass());
                if (deqnVar != null) {
                    e(deqnVar, obj);
                    return;
                }
                deqp<?> deqpVar = this.c.get(obj.getClass());
                if (deqpVar != null) {
                    deqpVar.a(obj, this);
                } else if (obj instanceof Enum) {
                    d(((Enum) obj).name());
                } else {
                    e(this.d, obj);
                }
            }
        }
    }

    public final void f(String str, Object obj) {
        if (this.e) {
            if (obj == null) {
                return;
            }
            this.a.name(str);
            g(obj);
            return;
        }
        this.a.name(str);
        if (obj == null) {
            this.a.nullValue();
        } else {
            g(obj);
        }
    }
}
