package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u9 implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ fa f7728a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r9 f7729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u9(r9 r9Var, fa faVar) {
        this.f7729b = r9Var;
        this.f7728a = faVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        f4 c2 = this.f7729b.c(this.f7728a);
        if (c2 == null) {
            this.f7729b.c().v().a("App info was null when attempting to get app instance id");
            return null;
        }
        return c2.m();
    }
}
