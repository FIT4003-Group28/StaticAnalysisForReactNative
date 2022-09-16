package com.facebook.react.a;

import android.util.SparseArray;
import com.facebook.react.bridge.ap;
/* compiled from: AnimationRegistry.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<a> f3084a = new SparseArray<>();

    public void a(a aVar) {
        ap.b();
        this.f3084a.put(aVar.c(), aVar);
    }

    public a a(int i) {
        ap.b();
        return this.f3084a.get(i);
    }

    public a b(int i) {
        ap.b();
        a aVar = this.f3084a.get(i);
        if (aVar != null) {
            this.f3084a.delete(i);
        }
        return aVar;
    }
}
