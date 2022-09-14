package com.google.firebase.installations;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final g f9344a;

    private e(g gVar) {
        this.f9344a = gVar;
    }

    public static Callable a(g gVar) {
        return new e(gVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        Void h2;
        h2 = this.f9344a.h();
        return h2;
    }
}
