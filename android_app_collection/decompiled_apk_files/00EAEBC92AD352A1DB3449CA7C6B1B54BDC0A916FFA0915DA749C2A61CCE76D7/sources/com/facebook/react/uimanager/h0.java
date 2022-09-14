package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<a0> f5930a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseBooleanArray f5931b = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.react.common.g f5932c = new com.facebook.react.common.g();

    public int a() {
        this.f5932c.a();
        return this.f5931b.size();
    }

    public a0 a(int i) {
        this.f5932c.a();
        return this.f5930a.get(i);
    }

    public void a(a0 a0Var) {
        this.f5932c.a();
        this.f5930a.put(a0Var.t(), a0Var);
    }

    public int b(int i) {
        this.f5932c.a();
        return this.f5931b.keyAt(i);
    }

    public void b(a0 a0Var) {
        this.f5932c.a();
        int t = a0Var.t();
        this.f5930a.put(t, a0Var);
        this.f5931b.put(t, true);
    }

    public boolean c(int i) {
        this.f5932c.a();
        return this.f5931b.get(i);
    }

    public void d(int i) {
        this.f5932c.a();
        if (!this.f5931b.get(i)) {
            this.f5930a.remove(i);
            return;
        }
        throw new g("Trying to remove root node " + i + " without using removeRootNode!");
    }

    public void e(int i) {
        this.f5932c.a();
        if (i == -1) {
            return;
        }
        if (this.f5931b.get(i)) {
            this.f5930a.remove(i);
            this.f5931b.delete(i);
            return;
        }
        throw new g("View with tag " + i + " is not registered as a root view");
    }
}
