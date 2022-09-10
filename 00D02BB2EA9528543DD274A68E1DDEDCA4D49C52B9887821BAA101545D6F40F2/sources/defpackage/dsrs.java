package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dsrs  reason: default package */
/* loaded from: classes6.dex */
public final class dsrs extends dsoh<String> implements RandomAccess, dsrt {
    private static final dsrs b;
    private final List<Object> c;

    static {
        dsrs dsrsVar = new dsrs(10);
        b = dsrsVar;
        dsrsVar.b();
    }

    public dsrs() {
        this(10);
    }

    private static String j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dspd) {
            return ((dspd) obj).J();
        }
        return dsrk.b((byte[]) obj);
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        SN();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        SN();
        if (collection instanceof dsrt) {
            collection = ((dsrt) collection).h();
        }
        boolean addAll = this.c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SN();
        this.c.clear();
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public final String get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dspd) {
            dspd dspdVar = (dspd) obj;
            String J = dspdVar.J();
            if (dspdVar.o()) {
                this.c.set(i, J);
            }
            return J;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = dsrk.b(bArr);
        if (dsrk.a(bArr)) {
            this.c.set(i, b2);
        }
        return b2;
    }

    @Override // defpackage.dsrj
    public final /* bridge */ /* synthetic */ dsrj e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new dsrs(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.dsrt
    public final void f(dspd dspdVar) {
        SN();
        this.c.add(dspdVar);
        this.modCount++;
    }

    @Override // defpackage.dsrt
    public final Object g(int i) {
        return this.c.get(i);
    }

    @Override // defpackage.dsrt
    public final List<?> h() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // defpackage.dsrt
    public final dsrt i() {
        return this.a ? new dsuc(this) : this;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        SN();
        Object remove = this.c.remove(i);
        this.modCount++;
        return j(remove);
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        SN();
        return j(this.c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public dsrs(int i) {
        this(new ArrayList(i));
    }

    private dsrs(ArrayList<Object> arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.dsoh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
