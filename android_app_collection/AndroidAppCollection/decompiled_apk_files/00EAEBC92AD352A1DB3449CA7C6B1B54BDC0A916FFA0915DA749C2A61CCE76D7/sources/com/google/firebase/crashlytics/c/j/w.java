package com.google.firebase.crashlytics.c.j;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class w<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private final List<E> f9013b;

    private w(List<E> list) {
        this.f9013b = Collections.unmodifiableList(list);
    }

    public static <E> w<E> a(List<E> list) {
        return new w<>(list);
    }

    public static <E> w<E> a(E... eArr) {
        return new w<>(Arrays.asList(eArr));
    }

    @Override // java.util.List
    public void add(int i, E e2) {
        this.f9013b.add(i, e2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e2) {
        return this.f9013b.add(e2);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f9013b.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f9013b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f9013b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f9013b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f9013b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f9013b.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f9013b.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f9013b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f9013b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f9013b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f9013b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f9013b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f9013b.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f9013b.listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.f9013b.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f9013b.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f9013b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f9013b.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e2) {
        return this.f9013b.set(i, e2);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f9013b.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f9013b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f9013b.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f9013b.toArray(tArr);
    }
}
