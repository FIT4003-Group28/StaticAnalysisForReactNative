package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f implements c.f.a.e {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<c.f.a.b> f9922a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Integer> f9923b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<ArrayList<c.f.a.b>> f9924c = new SparseArray<>();

    private synchronized void a(int i, c.f.a.b bVar) {
        if (this.f9923b.get(bVar.l()) != null) {
            throw new IllegalStateException("Handler " + bVar + " already attached");
        }
        this.f9923b.put(bVar.l(), Integer.valueOf(i));
        ArrayList<c.f.a.b> arrayList = this.f9924c.get(i);
        if (arrayList == null) {
            ArrayList<c.f.a.b> arrayList2 = new ArrayList<>(1);
            arrayList2.add(bVar);
            this.f9924c.put(i, arrayList2);
        } else {
            arrayList.add(bVar);
        }
    }

    private synchronized void b(c.f.a.b bVar) {
        Integer num = this.f9923b.get(bVar.l());
        if (num != null) {
            this.f9923b.remove(bVar.l());
            ArrayList<c.f.a.b> arrayList = this.f9924c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.size() == 0) {
                    this.f9924c.remove(num.intValue());
                }
            }
        }
        if (bVar.m() != null) {
            bVar.c();
        }
    }

    @Override // c.f.a.e
    public synchronized ArrayList<c.f.a.b> a(View view) {
        return c(view.getId());
    }

    public synchronized void a() {
        this.f9922a.clear();
        this.f9923b.clear();
        this.f9924c.clear();
    }

    public synchronized void a(int i) {
        c.f.a.b bVar = this.f9922a.get(i);
        if (bVar != null) {
            b(bVar);
            this.f9922a.remove(i);
        }
    }

    public synchronized void a(c.f.a.b bVar) {
        this.f9922a.put(bVar.l(), bVar);
    }

    public synchronized boolean a(int i, int i2) {
        boolean z;
        c.f.a.b bVar = this.f9922a.get(i);
        if (bVar != null) {
            b(bVar);
            a(i2, bVar);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized c.f.a.b b(int i) {
        return this.f9922a.get(i);
    }

    public synchronized ArrayList<c.f.a.b> c(int i) {
        return this.f9924c.get(i);
    }
}
