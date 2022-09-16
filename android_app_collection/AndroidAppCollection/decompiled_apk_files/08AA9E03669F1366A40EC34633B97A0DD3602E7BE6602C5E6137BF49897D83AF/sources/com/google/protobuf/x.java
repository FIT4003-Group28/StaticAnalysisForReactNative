package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public class x extends d<String> implements y, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public static final y f4766a;

    /* renamed from: b  reason: collision with root package name */
    private static final x f4767b = new x();

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f4768c;

    @Override // com.google.protobuf.d
    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    static {
        f4767b.b();
        f4766a = f4767b;
    }

    public x() {
        this(10);
    }

    public x(int i) {
        this(new ArrayList(i));
    }

    public x(y yVar) {
        this.f4768c = new ArrayList(yVar.size());
        addAll(yVar);
    }

    private x(ArrayList<Object> arrayList) {
        this.f4768c = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public String get(int i) {
        Object obj = this.f4768c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.f4768c.set(i, e);
            }
            return e;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = t.b(bArr);
        if (t.a(bArr)) {
            this.f4768c.set(i, b2);
        }
        return b2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4768c.size();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* renamed from: a */
    public String set(int i, String str) {
        c();
        return a(this.f4768c.set(i, str));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, String str) {
        c();
        this.f4768c.add(i, str);
        this.modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof y) {
            collection = ((y) collection).d();
        }
        boolean addAll = this.f4768c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public String remove(int i) {
        c();
        Object remove = this.f4768c.remove(i);
        this.modCount++;
        return a(remove);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f4768c.clear();
        this.modCount++;
    }

    @Override // com.google.protobuf.y
    public void a(f fVar) {
        c();
        this.f4768c.add(fVar);
        this.modCount++;
    }

    @Override // com.google.protobuf.y
    public Object c(int i) {
        return this.f4768c.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f) {
            return ((f) obj).e();
        }
        return t.b((byte[]) obj);
    }

    @Override // com.google.protobuf.y
    public List<?> d() {
        return Collections.unmodifiableList(this.f4768c);
    }

    @Override // com.google.protobuf.y
    public y e() {
        return a() ? new av(this) : this;
    }
}
