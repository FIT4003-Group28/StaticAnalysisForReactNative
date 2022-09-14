package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dzru  reason: default package */
/* loaded from: classes6.dex */
public final class dzru<K> extends dzoc<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient K[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    public int f;
    protected final float g;

    public dzru() {
        this(16, null);
    }

    private final int d() {
        return this.c ? this.f - 1 : this.f;
    }

    private final void e(int i) {
        K k;
        int i2;
        this.f--;
        K[] kArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.b;
            while (true) {
                k = kArr[i3];
                if (k == null) {
                    break loop0;
                }
                int hashCode = k.hashCode();
                int i4 = this.b;
                int a = dzgv.a(hashCode) & i4;
                if (i > i3) {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < a && a <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            kArr[i] = k;
            i = i3;
        }
        kArr[i] = null;
        if (this.f >= this.e / 4 || (i2 = this.d) <= 16) {
            return;
        }
        b(i2 >> 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int a;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.f, this.g);
        this.d = g;
        this.e = dzgv.f(g, this.g);
        int i = this.d;
        this.b = i - 1;
        K[] kArr = (K[]) new Object[i + 1];
        this.a = kArr;
        int i2 = this.f;
        while (true) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    a = this.d;
                    this.c = true;
                } else {
                    a = dzgv.a(readObject.hashCode()) & this.b;
                    if (kArr[a] != 0) {
                        do {
                            a = (a + 1) & this.b;
                        } while (kArr[a] != 0);
                    }
                }
                kArr[a] = readObject;
                i2 = i3;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        dzrn<K> it = iterator();
        objectOutputStream.defaultWriteObject();
        int i = this.f;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objectOutputStream.writeObject(it.next());
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<K> iterator() {
        return new dzrt(this);
    }

    protected final void b(int i) {
        K k;
        K[] kArr = this.a;
        int i2 = i - 1;
        K[] kArr2 = (K[]) new Object[i + 1];
        int i3 = this.d;
        int d = d();
        while (true) {
            int i4 = d - 1;
            if (d == 0) {
                this.d = i;
                this.b = i2;
                this.e = dzgv.f(i, this.g);
                this.a = kArr2;
                return;
            }
            do {
                i3--;
                k = kArr[i3];
            } while (k == null);
            int a = dzgv.a(k.hashCode()) & i2;
            if (kArr2[a] != null) {
                do {
                    a = (a + 1) & i2;
                } while (kArr2[a] != null);
            }
            kArr2[a] = kArr[i3];
            d = i4;
        }
    }

    /* renamed from: c */
    public final dzru<K> clone() {
        try {
            dzru<K> dzruVar = (dzru) super.clone();
            dzruVar.a = (K[]) ((Object[]) this.a.clone());
            dzruVar.c = this.c;
            return dzruVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f == 0) {
            return;
        }
        this.f = 0;
        this.c = false;
        Arrays.fill(this.a, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        K k;
        if (obj == null) {
            return this.c;
        }
        K[] kArr = this.a;
        int a = dzgv.a(obj.hashCode()) & this.b;
        K k2 = kArr[a];
        if (k2 == null) {
            return false;
        }
        if (obj.equals(k2)) {
            return true;
        }
        do {
            a = (a + 1) & this.b;
            k = kArr[a];
            if (k == null) {
                return false;
            }
        } while (!obj.equals(k));
        return true;
    }

    @Override // defpackage.dzoc, java.util.Collection, java.util.Set
    public final int hashCode() {
        K k;
        int d = d();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = d - 1;
            if (d != 0) {
                while (true) {
                    k = this.a[i2];
                    if (k != null) {
                        break;
                    }
                    i2++;
                }
                if (this != k) {
                    i += k.hashCode();
                }
                i2++;
                d = i3;
            } else {
                return i;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        K k;
        if (obj == null) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            K[] kArr = this.a;
            int i = this.d;
            kArr[i] = null;
            int i2 = this.f - 1;
            this.f = i2;
            if (i2 < this.e / 4 && i > 16) {
                b(i >> 1);
            }
            return true;
        }
        K[] kArr2 = this.a;
        int a = dzgv.a(obj.hashCode()) & this.b;
        K k2 = kArr2[a];
        if (k2 == null) {
            return false;
        }
        if (!obj.equals(k2)) {
            do {
                a = (a + 1) & this.b;
                k = kArr2[a];
                if (k == null) {
                    return false;
                }
            } while (!obj.equals(k));
            e(a);
            return true;
        }
        e(a);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    public dzru(int i) {
        this(i, null);
    }

    public dzru(int i, byte[] bArr) {
        if (i >= 0) {
            this.g = 0.75f;
            int g = dzgv.g(i, 0.75f);
            this.d = g;
            this.b = g - 1;
            this.e = dzgv.f(g, 0.75f);
            this.a = (K[]) new Object[this.d + 1];
            return;
        }
        throw new IllegalArgumentException("The expected number of elements must be nonnegative");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends K> collection) {
        if (this.g > 0.5d) {
            int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.f + collection.size()) / this.g))));
            if (min > this.d) {
                b(min);
            }
        } else {
            int g = dzgv.g(collection.size(), this.g);
            if (g > this.d) {
                b(g);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        K k2;
        if (k != null) {
            K[] kArr = this.a;
            int a = dzgv.a(k.hashCode()) & this.b;
            K k3 = kArr[a];
            if (k3 != null) {
                if (k3.equals(k)) {
                    return false;
                }
                do {
                    a = (a + 1) & this.b;
                    k2 = kArr[a];
                    if (k2 != null) {
                    }
                } while (!k2.equals(k));
                return false;
            }
            kArr[a] = k;
        } else if (this.c) {
            return false;
        } else {
            this.c = true;
        }
        int i = this.f;
        int i2 = i + 1;
        this.f = i2;
        if (i >= this.e) {
            b(dzgv.g(i2 + 1, this.g));
        }
        return true;
    }

    public dzru(Collection<? extends K> collection) {
        this(collection.size(), null);
        addAll(collection);
    }
}
