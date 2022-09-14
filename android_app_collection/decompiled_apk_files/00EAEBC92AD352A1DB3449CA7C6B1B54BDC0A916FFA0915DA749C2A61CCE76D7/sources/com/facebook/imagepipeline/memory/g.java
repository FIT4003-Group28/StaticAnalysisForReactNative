package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;
/* loaded from: classes.dex */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<b<T>> f5243a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    b<T> f5244b;

    /* renamed from: c  reason: collision with root package name */
    b<T> f5245c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<I> {

        /* renamed from: a  reason: collision with root package name */
        b<I> f5246a;

        /* renamed from: b  reason: collision with root package name */
        int f5247b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<I> f5248c;

        /* renamed from: d  reason: collision with root package name */
        b<I> f5249d;

        private b(b<I> bVar, int i, LinkedList<I> linkedList, b<I> bVar2) {
            this.f5246a = bVar;
            this.f5247b = i;
            this.f5248c = linkedList;
            this.f5249d = bVar2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f5247b + ")";
        }
    }

    private void a(b<T> bVar) {
        if (bVar == null || !bVar.f5248c.isEmpty()) {
            return;
        }
        c(bVar);
        this.f5243a.remove(bVar.f5247b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(b<T> bVar) {
        if (this.f5244b == bVar) {
            return;
        }
        c(bVar);
        b bVar2 = (b<T>) this.f5244b;
        if (bVar2 == null) {
            this.f5244b = bVar;
            this.f5245c = bVar;
            return;
        }
        bVar.f5249d = bVar2;
        bVar2.f5246a = bVar;
        this.f5244b = bVar;
    }

    private synchronized void c(b<T> bVar) {
        b bVar2 = (b<T>) bVar.f5246a;
        b bVar3 = (b<T>) bVar.f5249d;
        if (bVar2 != null) {
            bVar2.f5249d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f5246a = bVar2;
        }
        bVar.f5246a = null;
        bVar.f5249d = null;
        if (bVar == this.f5244b) {
            this.f5244b = bVar3;
        }
        if (bVar == this.f5245c) {
            this.f5245c = bVar2;
        }
    }

    public synchronized T a() {
        b<T> bVar = this.f5245c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f5248c.pollLast();
        a(bVar);
        return pollLast;
    }

    public synchronized T a(int i) {
        b<T> bVar = this.f5243a.get(i);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f5248c.pollFirst();
        b(bVar);
        return pollFirst;
    }

    public synchronized void a(int i, T t) {
        b<T> bVar = this.f5243a.get(i);
        if (bVar == null) {
            bVar = new b<>(null, i, new LinkedList(), null);
            this.f5243a.put(i, bVar);
        }
        bVar.f5248c.addLast(t);
        b(bVar);
    }
}
