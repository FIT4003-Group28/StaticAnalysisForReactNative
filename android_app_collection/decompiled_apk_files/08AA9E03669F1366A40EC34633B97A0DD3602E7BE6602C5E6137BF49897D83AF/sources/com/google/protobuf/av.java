package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes.dex */
public class av extends AbstractList<String> implements y, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final y f4391a;

    @Override // com.google.protobuf.y
    public y e() {
        return this;
    }

    public av(y yVar) {
        this.f4391a = yVar;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public String get(int i) {
        return (String) this.f4391a.get(i);
    }

    @Override // com.google.protobuf.y
    public Object c(int i) {
        return this.f4391a.c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4391a.size();
    }

    @Override // com.google.protobuf.y
    public void a(f fVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int i) {
        return new ListIterator<String>() { // from class: com.google.protobuf.av.1

            /* renamed from: a  reason: collision with root package name */
            ListIterator<String> f4392a;

            {
                this.f4392a = av.this.f4391a.listIterator(i);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f4392a.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            /* renamed from: a */
            public String next() {
                return this.f4392a.next();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f4392a.hasPrevious();
            }

            @Override // java.util.ListIterator
            /* renamed from: b */
            public String previous() {
                return this.f4392a.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f4392a.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f4392a.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            /* renamed from: a */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            /* renamed from: b */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new Iterator<String>() { // from class: com.google.protobuf.av.2

            /* renamed from: a  reason: collision with root package name */
            Iterator<String> f4395a;

            {
                this.f4395a = av.this.f4391a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4395a.hasNext();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public String next() {
                return this.f4395a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // com.google.protobuf.y
    public List<?> d() {
        return this.f4391a.d();
    }
}
