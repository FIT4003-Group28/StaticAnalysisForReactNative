package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class u5 implements Callable<List<aa>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ fa f7721a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j5 f7722b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u5(j5 j5Var, fa faVar) {
        this.f7722b = j5Var;
        this.f7721a = faVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7722b.f7390a;
        r9Var.q();
        r9Var2 = this.f7722b.f7390a;
        return r9Var2.i().a(this.f7721a.f7303b);
    }
}
