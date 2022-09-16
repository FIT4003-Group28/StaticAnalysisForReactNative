package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dziv */
/* loaded from: classes6.dex */
public final class dziv<V> extends dzhx<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient int[] a = dzka.a;
    public transient Object[] b = dzrh.a;
    public int c;

    public static /* synthetic */ int l(dziv dzivVar) {
        int i = dzivVar.c;
        dzivVar.c = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int i = this.c;
        this.a = new int[i];
        this.b = new Object[i];
        for (int i2 = 0; i2 < this.c; i2++) {
            this.a[i2] = objectInputStream.readInt();
            this.b[i2] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.c; i++) {
            objectOutputStream.writeInt(this.a[i]);
            objectOutputStream.writeObject(this.b[i]);
        }
    }

    @Override // defpackage.dzhv, defpackage.dziw
    public final V a(int i, V v) {
        int h = h(i);
        if (h != -1) {
            Object[] objArr = this.b;
            V v2 = (V) objArr[h];
            objArr[h] = v;
            return v2;
        }
        int i2 = this.c;
        if (i2 == this.a.length) {
            int i3 = 2;
            int[] iArr = new int[i2 == 0 ? 2 : i2 + i2];
            if (i2 != 0) {
                i3 = i2 + i2;
            }
            Object[] objArr2 = new Object[i3];
            while (true) {
                int i4 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i4] = this.a[i4];
                objArr2[i4] = this.b[i4];
                i2 = i4;
            }
            this.a = iArr;
            this.b = objArr2;
        }
        int[] iArr2 = this.a;
        int i5 = this.c;
        iArr2[i5] = i;
        this.b[i5] = v;
        this.c = i5 + 1;
        return null;
    }

    @Override // defpackage.dzhv, defpackage.dziw
    public final V b(int i) {
        int h = h(i);
        if (h == -1) {
            return null;
        }
        V v = (V) this.b[h];
        int i2 = (this.c - h) - 1;
        int[] iArr = this.a;
        int i3 = h + 1;
        System.arraycopy(iArr, i3, iArr, h, i2);
        Object[] objArr = this.b;
        System.arraycopy(objArr, i3, objArr, h, i2);
        int i4 = this.c - 1;
        this.c = i4;
        this.b[i4] = null;
        return v;
    }

    @Override // defpackage.dzhv, defpackage.dzgu
    public final void clear() {
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                this.c = 0;
                return;
            } else {
                this.b[i2] = null;
                i = i2;
            }
        }
    }

    @Override // defpackage.dzhx, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                Object obj2 = this.b[i2];
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

    @Override // defpackage.dzhx, defpackage.dziw
    public final boolean d(int i) {
        return h(i) != -1;
    }

    @Override // defpackage.dzhx
    public final dzkg e() {
        return new dzjy(this.a, this.c);
    }

    @Override // defpackage.dzhx
    public final dzrj<V> f() {
        return dzrm.a(new dzrf(this.b, this.c));
    }

    public final int h(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        while (true) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (iArr[i3] == i) {
                    return i3;
                }
                i2 = i3;
            } else {
                return -1;
            }
        }
    }

    @Override // defpackage.dziw
    public final V i(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        while (true) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (iArr[i3] == i) {
                    return (V) this.b[i3];
                }
                i2 = i3;
            } else {
                return null;
            }
        }
    }

    @Override // defpackage.dzhx, java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    /* renamed from: j */
    public final dziv<V> clone() {
        try {
            dziv<V> dzivVar = (dziv) super.clone();
            dzivVar.a = (int[]) this.a.clone();
            dzivVar.b = (Object[]) this.b.clone();
            return dzivVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzjj
    public final /* bridge */ /* synthetic */ dzrv k() {
        return new dziu(this);
    }

    @Override // defpackage.dzhx, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Integer> keySet() {
        return keySet();
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // defpackage.dzhx, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}
