package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: aoqe  reason: default package */
/* loaded from: classes.dex */
public final class aoqe extends aonn implements RandomAccess, aoqf {
    private static final aoqe b;
    private final List c;

    static {
        aoqe aoqeVar = new aoqe(10);
        b = aoqeVar;
        aoqeVar.b();
    }

    public aoqe() {
        this(10);
    }

    private static String j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof aoob) {
            return ((aoob) obj).E();
        }
        return aopv.f((byte[]) obj);
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        sg();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        sg();
        if (collection instanceof aoqf) {
            collection = ((aoqf) collection).h();
        }
        boolean addAll = this.c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        sg();
        this.c.clear();
        this.modCount++;
    }

    @Override // defpackage.aoqf
    public final aoqf d() {
        return this.a ? new aosb(this) : this;
    }

    @Override // defpackage.aopu
    public final /* bridge */ /* synthetic */ aopu e(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new aoqe(arrayList);
    }

    @Override // defpackage.aoqf
    public final Object f(int i) {
        return this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public final String get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof aoob) {
            aoob aoobVar = (aoob) obj;
            String E = aoobVar.E();
            if (aoobVar.q()) {
                this.c.set(i, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String f = aopv.f(bArr);
        if (aopv.g(bArr)) {
            this.c.set(i, f);
        }
        return f;
    }

    @Override // defpackage.aoqf
    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // defpackage.aoqf
    public final void i(aoob aoobVar) {
        sg();
        this.c.add(aoobVar);
        this.modCount++;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        sg();
        Object remove = this.c.remove(i);
        this.modCount++;
        return j(remove);
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        sg();
        return j(this.c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public aoqe(int i) {
        this(new ArrayList(i));
    }

    private aoqe(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.aonn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
