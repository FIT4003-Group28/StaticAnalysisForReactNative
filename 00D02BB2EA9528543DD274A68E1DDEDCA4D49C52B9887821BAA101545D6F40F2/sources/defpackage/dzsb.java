package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzsb  reason: default package */
/* loaded from: classes6.dex */
public final class dzsb<K, V> extends dzog<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient Object[] a = dzrh.a;
    public transient Object[] b = dzrh.a;
    public int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int f(dzsb dzsbVar) {
        int i = dzsbVar.c;
        dzsbVar.c = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int i = this.c;
        this.a = new Object[i];
        this.b = new Object[i];
        for (int i2 = 0; i2 < this.c; i2++) {
            this.a[i2] = objectInputStream.readObject();
            this.b[i2] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.c; i++) {
            objectOutputStream.writeObject(this.a[i]);
            objectOutputStream.writeObject(this.b[i]);
        }
    }

    @Override // defpackage.dzog
    public final dzsh<K> a() {
        return new dzse(this.a, this.c);
    }

    @Override // defpackage.dzog
    public final dzsf<V> b() {
        return new dzsg(new dzse(this.b, this.c));
    }

    public final int c(Object obj) {
        Object[] objArr = this.a;
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (objArr[i2] == obj) {
                    return i2;
                }
                i = i2;
            } else {
                return -1;
            }
        }
    }

    @Override // defpackage.dzoe, defpackage.dzgu
    public final void clear() {
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                this.c = 0;
                return;
            }
            this.a[i2] = null;
            this.b[i2] = null;
            i = i2;
        }
    }

    @Override // defpackage.dzog, defpackage.dzgu
    public final boolean containsKey(Object obj) {
        return c(obj) != -1;
    }

    @Override // defpackage.dzog, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (this.b[i2] == obj) {
                    return true;
                }
                i = i2;
            } else {
                return false;
            }
        }
    }

    /* renamed from: d */
    public final dzsb<K, V> clone() {
        try {
            dzsb<K, V> dzsbVar = (dzsb) super.clone();
            dzsbVar.a = (Object[]) this.a.clone();
            dzsbVar.b = (Object[]) this.b.clone();
            return dzsbVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzsc
    public final /* bridge */ /* synthetic */ dzrv e() {
        return new dzsa(this);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        Object[] objArr = this.a;
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (objArr[i2] == obj) {
                    return (V) this.b[i2];
                }
                i = i2;
            } else {
                return null;
            }
        }
    }

    @Override // defpackage.dzog, java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // defpackage.dzog, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // defpackage.dzoe, java.util.Map
    public final V put(K k, V v) {
        int c = c(k);
        if (c != -1) {
            Object[] objArr = this.b;
            V v2 = (V) objArr[c];
            objArr[c] = v;
            return v2;
        }
        int i = this.c;
        if (i == this.a.length) {
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
                objArr2[i3] = this.a[i3];
                objArr3[i3] = this.b[i3];
                i = i3;
            }
            this.a = objArr2;
            this.b = objArr3;
        }
        Object[] objArr4 = this.a;
        int i4 = this.c;
        objArr4[i4] = k;
        this.b[i4] = v;
        this.c = i4 + 1;
        return null;
    }

    @Override // defpackage.dzoe, java.util.Map
    public final V remove(Object obj) {
        int c = c(obj);
        if (c == -1) {
            return null;
        }
        V v = (V) this.b[c];
        int i = (this.c - c) - 1;
        Object[] objArr = this.a;
        int i2 = c + 1;
        System.arraycopy(objArr, i2, objArr, c, i);
        Object[] objArr2 = this.b;
        System.arraycopy(objArr2, i2, objArr2, c, i);
        int i3 = this.c - 1;
        this.c = i3;
        this.a[i3] = null;
        this.b[i3] = null;
        return v;
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // defpackage.dzog, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
