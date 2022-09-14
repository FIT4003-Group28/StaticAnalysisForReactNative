package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcgz  reason: default package */
/* loaded from: classes5.dex */
public final class dcgz<K, V> extends dbyn<K, V> implements Serializable, dcha {
    private static final long serialVersionUID = 0;
    public transient dcgw<K, V> a;
    public transient dcgw<K, V> b;
    public transient Map<K, dcgv<K, V>> c;
    public transient int d;
    public transient int e;

    public dcgz() {
        this(12);
    }

    public static <K, V> dcgz<K, V> a() {
        return new dcgz<>(12);
    }

    public static void i(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NoSuchElementException();
    }

    private final List<V> k(Object obj) {
        return Collections.unmodifiableList(dchl.d(new dcgy(this, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new dbzr(3);
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            n(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (Map.Entry<K, V> entry : I()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean D() {
        return this.a == null;
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final /* bridge */ /* synthetic */ Collection K() {
        throw null;
    }

    public final dcgw<K, V> b(K k, V v, dcgw<K, V> dcgwVar) {
        dcgw<K, V> dcgwVar2 = new dcgw<>(k, v);
        if (this.a == null) {
            this.b = dcgwVar2;
            this.a = dcgwVar2;
            this.c.put(k, new dcgv<>(dcgwVar2));
            this.e++;
        } else if (dcgwVar == null) {
            dcgw<K, V> dcgwVar3 = this.b;
            dcgwVar3.c = dcgwVar2;
            dcgwVar2.d = dcgwVar3;
            this.b = dcgwVar2;
            dcgv<K, V> dcgvVar = this.c.get(k);
            if (dcgvVar == null) {
                this.c.put(k, new dcgv<>(dcgwVar2));
                this.e++;
            } else {
                dcgvVar.c++;
                dcgw<K, V> dcgwVar4 = dcgvVar.b;
                dcgwVar4.e = dcgwVar2;
                dcgwVar2.f = dcgwVar4;
                dcgvVar.b = dcgwVar2;
            }
        } else {
            this.c.get(k).c++;
            dcgwVar2.d = dcgwVar.d;
            dcgwVar2.f = dcgwVar.f;
            dcgwVar2.c = dcgwVar;
            dcgwVar2.e = dcgwVar;
            dcgw<K, V> dcgwVar5 = dcgwVar.f;
            if (dcgwVar5 == null) {
                this.c.get(k).a = dcgwVar2;
            } else {
                dcgwVar5.e = dcgwVar2;
            }
            dcgw<K, V> dcgwVar6 = dcgwVar.d;
            if (dcgwVar6 == null) {
                this.a = dcgwVar2;
            } else {
                dcgwVar6.c = dcgwVar2;
            }
            dcgwVar.d = dcgwVar2;
            dcgwVar.f = dcgwVar2;
        }
        this.d++;
        return dcgwVar2;
    }

    @Override // defpackage.dcka
    /* renamed from: c */
    public final List<V> f(K k) {
        return new dcgp(this, k);
    }

    @Override // defpackage.dcha
    public final List<V> d(Object obj) {
        List<V> k = k(obj);
        h(obj);
        return k;
    }

    @Override // defpackage.dcha
    public final List<V> e(K k, Iterable<? extends V> iterable) {
        List<V> k2 = k(k);
        dcgy dcgyVar = new dcgy(this, k);
        Iterator<? extends V> it = iterable.iterator();
        while (dcgyVar.hasNext() && it.hasNext()) {
            dcgyVar.next();
            dcgyVar.set(it.next());
        }
        while (dcgyVar.hasNext()) {
            dcgyVar.next();
            dcgyVar.remove();
        }
        while (it.hasNext()) {
            dcgyVar.add(it.next());
        }
        return k2;
    }

    public final void g(dcgw<K, V> dcgwVar) {
        dcgw<K, V> dcgwVar2 = dcgwVar.d;
        if (dcgwVar2 != null) {
            dcgwVar2.c = dcgwVar.c;
        } else {
            this.a = dcgwVar.c;
        }
        dcgw<K, V> dcgwVar3 = dcgwVar.c;
        if (dcgwVar3 != null) {
            dcgwVar3.d = dcgwVar2;
        } else {
            this.b = dcgwVar2;
        }
        if (dcgwVar.f != null || dcgwVar.e != null) {
            dcgv<K, V> dcgvVar = this.c.get(dcgwVar.a);
            dcgvVar.c--;
            dcgw<K, V> dcgwVar4 = dcgwVar.f;
            if (dcgwVar4 == null) {
                dcgvVar.a = dcgwVar.e;
            } else {
                dcgwVar4.e = dcgwVar.e;
            }
            dcgw<K, V> dcgwVar5 = dcgwVar.e;
            if (dcgwVar5 == null) {
                dcgvVar.b = dcgwVar4;
            } else {
                dcgwVar5.f = dcgwVar4;
            }
        } else {
            this.c.remove(dcgwVar.a).c = 0;
            this.e++;
        }
        this.d--;
    }

    public final void h(Object obj) {
        dcgh.r(new dcgy(this, obj));
    }

    @Override // defpackage.dbyn, defpackage.dcka
    /* renamed from: j */
    public final List<Map.Entry<K, V>> I() {
        return (List) super.I();
    }

    @Override // defpackage.dcka
    public final int l() {
        return this.d;
    }

    @Override // defpackage.dcka
    public final boolean m(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.dbyn, defpackage.dcka
    public final boolean n(K k, V v) {
        b(k, v, null);
        return true;
    }

    @Override // defpackage.dcka
    public final void p() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        this.e++;
    }

    @Override // defpackage.dbyn
    public final Set<K> r() {
        return new dcgr(this);
    }

    @Override // defpackage.dbyn
    public final /* bridge */ /* synthetic */ Collection t() {
        return new dcgt(this);
    }

    @Override // defpackage.dbyn
    public final /* bridge */ /* synthetic */ Collection v() {
        return new dcgq(this);
    }

    @Override // defpackage.dbyn
    public final Iterator<Map.Entry<K, V>> w() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.dbyn
    public final Map<K, Collection<V>> x() {
        return new dckp(this);
    }

    private dcgz(int i) {
        this.c = dbzn.b(i);
    }

    public dcgz(dcka<? extends K, ? extends V> dckaVar) {
        this(dckaVar.J().size());
        H(dckaVar);
    }
}
