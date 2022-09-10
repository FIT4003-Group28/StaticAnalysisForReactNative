package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzqd */
/* loaded from: classes6.dex */
public final class dzqd<K, V> extends dznt<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient Object[] b = dzrh.a;
    public transient Object[] c = dzrh.a;
    public int d;

    public static /* synthetic */ int h(dzqd dzqdVar) {
        int i = dzqdVar.d;
        dzqdVar.d = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int i = this.d;
        this.b = new Object[i];
        this.c = new Object[i];
        for (int i2 = 0; i2 < this.d; i2++) {
            this.b[i2] = objectInputStream.readObject();
            this.c[i2] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.d; i++) {
            objectOutputStream.writeObject(this.b[i]);
            objectOutputStream.writeObject(this.c[i]);
        }
    }

    @Override // defpackage.dznt
    public final dzrv<K> a() {
        return new dzrf(this.b, this.d);
    }

    @Override // defpackage.dznt
    public final dzrj<V> b() {
        return dzrm.a(new dzrf(this.c, this.d));
    }

    @Override // defpackage.dznr, defpackage.dzgu
    public final void clear() {
        int i = this.d;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                this.d = 0;
                return;
            }
            this.b[i2] = null;
            this.c[i2] = null;
            i = i2;
        }
    }

    @Override // defpackage.dznt, defpackage.dzgu
    public final boolean containsKey(Object obj) {
        return e(obj) != -1;
    }

    @Override // defpackage.dznt, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.d;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                Object obj2 = this.c[i2];
                if (obj2 == null) {
                    if (obj == null) {
                        return true;
                    }
                } else if (obj2.equals(obj)) {
                    return true;
                }
                i = i2;
            } else {
                return false;
            }
        }
    }

    @Override // defpackage.dzqq
    /* renamed from: d */
    public final dzqp<K, V> g() {
        return new dzqc(this);
    }

    public final int e(Object obj) {
        int i;
        Object[] objArr = this.b;
        int i2 = this.d;
        while (true) {
            i = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            Object obj2 = objArr[i];
            if (obj2 != null) {
                if (obj2.equals(obj)) {
                    break;
                }
                i2 = i;
            } else if (obj == null) {
                break;
            } else {
                i2 = i;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final dzqd<K, V> clone() {
        try {
            dzqd<K, V> dzqdVar = (dzqd) super.clone();
            dzqdVar.b = (Object[]) this.b.clone();
            dzqdVar.c = (Object[]) this.c.clone();
            return dzqdVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int i;
        Object[] objArr = this.b;
        int i2 = this.d;
        while (true) {
            i = i2 - 1;
            if (i2 != 0) {
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if (obj2.equals(obj)) {
                        break;
                    }
                    i2 = i;
                } else if (obj == null) {
                    break;
                } else {
                    i2 = i;
                }
            } else {
                return this.a;
            }
        }
        return (V) this.c[i];
    }

    @Override // defpackage.dznt, java.util.Map
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // defpackage.dznt, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // defpackage.dznr, java.util.Map
    public final V put(K k, V v) {
        int e = e(k);
        if (e != -1) {
            Object[] objArr = this.c;
            V v2 = (V) objArr[e];
            objArr[e] = v;
            return v2;
        }
        int i = this.d;
        if (i == this.b.length) {
            int i2 = 2;
            Object[] objArr2 = new Object[i == 0 ? 2 : i + i];
            if (i != 0) {
                i2 = i + i;
            }
            Object[] objArr3 = new Object[i2];
            while (true) {
                int i3 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr2[i3] = this.b[i3];
                objArr3[i3] = this.c[i3];
                i = i3;
            }
            this.b = objArr2;
            this.c = objArr3;
        }
        Object[] objArr4 = this.b;
        int i4 = this.d;
        objArr4[i4] = k;
        this.c[i4] = v;
        this.d = i4 + 1;
        return this.a;
    }

    @Override // defpackage.dznr, java.util.Map
    public final V remove(Object obj) {
        int e = e(obj);
        if (e == -1) {
            return this.a;
        }
        V v = (V) this.c[e];
        int i = (this.d - e) - 1;
        Object[] objArr = this.b;
        int i2 = e + 1;
        System.arraycopy(objArr, i2, objArr, e, i);
        Object[] objArr2 = this.c;
        System.arraycopy(objArr2, i2, objArr2, e, i);
        int i3 = this.d - 1;
        this.d = i3;
        this.b[i3] = null;
        this.c[i3] = null;
        return v;
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.dznt, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
