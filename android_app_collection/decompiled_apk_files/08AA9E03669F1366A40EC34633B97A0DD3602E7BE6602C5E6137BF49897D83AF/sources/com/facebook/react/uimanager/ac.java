package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
/* compiled from: ShadowNodeRegistry.java */
/* loaded from: classes.dex */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<w> f3739a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseBooleanArray f3740b = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.react.b.h f3741c = new com.facebook.react.b.h();

    public void a(w wVar) {
        int reactTag = wVar.getReactTag();
        this.f3739a.put(reactTag, wVar);
        this.f3740b.put(reactTag, true);
    }

    public void a(int i) {
        this.f3741c.a();
        if (!this.f3740b.get(i)) {
            throw new e("View with tag " + i + " is not registered as a root view");
        }
        this.f3739a.remove(i);
        this.f3740b.delete(i);
    }

    public void b(w wVar) {
        this.f3741c.a();
        this.f3739a.put(wVar.getReactTag(), wVar);
    }

    public void b(int i) {
        this.f3741c.a();
        if (this.f3740b.get(i)) {
            throw new e("Trying to remove root node " + i + " without using removeRootNode!");
        }
        this.f3739a.remove(i);
    }

    public w c(int i) {
        this.f3741c.a();
        return this.f3739a.get(i);
    }

    public boolean d(int i) {
        this.f3741c.a();
        return this.f3740b.get(i);
    }

    public int a() {
        this.f3741c.a();
        return this.f3740b.size();
    }

    public int e(int i) {
        this.f3741c.a();
        return this.f3740b.keyAt(i);
    }
}
