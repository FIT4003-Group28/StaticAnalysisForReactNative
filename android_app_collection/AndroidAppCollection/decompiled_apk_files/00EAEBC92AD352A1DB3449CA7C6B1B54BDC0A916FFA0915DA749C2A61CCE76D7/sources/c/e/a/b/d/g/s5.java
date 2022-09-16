package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class s5 extends p3<String> implements v5, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final s5 f4404d;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f4405c;

    static {
        s5 s5Var = new s5();
        f4404d = s5Var;
        s5Var.j();
    }

    public s5() {
        this(10);
    }

    public s5(int i) {
        this(new ArrayList(i));
    }

    private s5(ArrayList<Object> arrayList) {
        this.f4405c = arrayList;
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof v3 ? ((v3) obj).j() : e5.b((byte[]) obj);
    }

    @Override // c.e.a.b.d.g.k5
    public final /* synthetic */ k5 a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f4405c);
            return new s5(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.e.a.b.d.g.v5
    public final void a(v3 v3Var) {
        a();
        this.f4405c.add(v3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.f4405c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof v5) {
            collection = ((v5) collection).k();
        }
        boolean addAll = this.f4405c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // c.e.a.b.d.g.v5
    public final Object b(int i) {
        return this.f4405c.get(i);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f4405c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.v5
    public final v5 g() {
        return f() ? new v7(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f4405c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof v3) {
            v3 v3Var = (v3) obj;
            String j = v3Var.j();
            if (v3Var.a()) {
                this.f4405c.set(i, j);
            }
            return j;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = e5.b(bArr);
        if (e5.a(bArr)) {
            this.f4405c.set(i, b2);
        }
        return b2;
    }

    @Override // c.e.a.b.d.g.v5
    public final List<?> k() {
        return Collections.unmodifiableList(this.f4405c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.f4405c.remove(i);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return a(this.f4405c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4405c.size();
    }
}
