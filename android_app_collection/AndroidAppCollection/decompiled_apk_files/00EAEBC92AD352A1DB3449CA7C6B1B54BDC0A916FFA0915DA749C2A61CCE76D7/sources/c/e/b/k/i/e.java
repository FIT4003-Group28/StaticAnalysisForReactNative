package c.e.b.k.i;

import android.util.Base64;
import android.util.JsonWriter;
import c.e.b.k.f;
import c.e.b.k.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
final class e implements c.e.b.k.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f4857a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4858b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f4859c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, c.e.b.k.d<?>> f4860d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f4861e;

    /* renamed from: f  reason: collision with root package name */
    private final c.e.b.k.d<Object> f4862f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f4863g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, c.e.b.k.d<?>> map, Map<Class<?>, f<?>> map2, c.e.b.k.d<Object> dVar, boolean z) {
        this.f4859c = new JsonWriter(writer);
        this.f4860d = map;
        this.f4861e = map2;
        this.f4862f = dVar;
        this.f4863g = z;
    }

    private boolean a(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e b(String str, Object obj) {
        b();
        this.f4859c.name(str);
        if (obj == null) {
            this.f4859c.nullValue();
            return this;
        }
        a(obj, false);
        return this;
    }

    private void b() {
        if (this.f4858b) {
            e eVar = this.f4857a;
            if (eVar == null) {
                return;
            }
            eVar.b();
            this.f4857a.f4858b = false;
            this.f4857a = null;
            this.f4859c.endObject();
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    private e c(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        b();
        this.f4859c.name(str);
        a(obj, false);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ c.e.b.k.e mo167a(String str, int i) {
        mo167a(str, i);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ c.e.b.k.e mo168a(String str, long j) {
        mo168a(str, j);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ c.e.b.k.e mo169a(String str, Object obj) {
        mo169a(str, obj);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ c.e.b.k.e mo170a(String str, boolean z) {
        mo170a(str, z);
        return this;
    }

    @Override // c.e.b.k.g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ g mo166a(String str) {
        mo166a(str);
        return this;
    }

    @Override // c.e.b.k.g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ g mo171a(boolean z) {
        mo171a(z);
        return this;
    }

    public e a(int i) {
        b();
        this.f4859c.value(i);
        return this;
    }

    public e a(long j) {
        b();
        this.f4859c.value(j);
        return this;
    }

    e a(c.e.b.k.d<Object> dVar, Object obj, boolean z) {
        if (!z) {
            this.f4859c.beginObject();
        }
        dVar.a(obj, this);
        if (!z) {
            this.f4859c.endObject();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e a(Object obj, boolean z) {
        int[] iArr;
        int i = 0;
        if (z && a(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new c.e.b.k.c(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f4859c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f4859c.value((Number) obj);
            return this;
        } else if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f4859c.beginArray();
                for (Object obj2 : (Collection) obj) {
                    a(obj2, false);
                }
                this.f4859c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f4859c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo169a((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new c.e.b.k.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f4859c.endObject();
                return this;
            } else {
                c.e.b.k.d<?> dVar = this.f4860d.get(obj.getClass());
                if (dVar != null) {
                    a(dVar, obj, z);
                    return this;
                }
                f<?> fVar = this.f4861e.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    mo166a(((Enum) obj).name());
                    return this;
                } else {
                    a(this.f4862f, obj, z);
                    return this;
                }
            }
        } else if (obj instanceof byte[]) {
            a((byte[]) obj);
            return this;
        } else {
            this.f4859c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f4859c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    a(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f4859c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f4859c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    a((Object) number, false);
                }
            } else {
                for (Object obj3 : (Object[]) obj) {
                    a(obj3, false);
                }
            }
            this.f4859c.endArray();
            return this;
        }
    }

    @Override // c.e.b.k.g
    /* renamed from: a  reason: collision with other method in class */
    public e mo166a(String str) {
        b();
        this.f4859c.value(str);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a  reason: collision with other method in class */
    public e mo167a(String str, int i) {
        b();
        this.f4859c.name(str);
        a(i);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a  reason: collision with other method in class */
    public e mo168a(String str, long j) {
        b();
        this.f4859c.name(str);
        a(j);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a  reason: collision with other method in class */
    public e mo169a(String str, Object obj) {
        if (this.f4863g) {
            c(str, obj);
            return this;
        }
        b(str, obj);
        return this;
    }

    @Override // c.e.b.k.e
    /* renamed from: a  reason: collision with other method in class */
    public e mo170a(String str, boolean z) {
        b();
        this.f4859c.name(str);
        mo171a(z);
        return this;
    }

    @Override // c.e.b.k.g
    /* renamed from: a  reason: collision with other method in class */
    public e mo171a(boolean z) {
        b();
        this.f4859c.value(z);
        return this;
    }

    public e a(byte[] bArr) {
        b();
        if (bArr == null) {
            this.f4859c.nullValue();
        } else {
            this.f4859c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        b();
        this.f4859c.flush();
    }
}
