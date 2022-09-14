package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class p5 implements Callable<List<oa>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ fa f7577a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7578b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7579c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7580d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p5(j5 j5Var, fa faVar, String str, String str2) {
        this.f7580d = j5Var;
        this.f7577a = faVar;
        this.f7578b = str;
        this.f7579c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<oa> call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7580d.f7390a;
        r9Var.q();
        r9Var2 = this.f7580d.f7390a;
        return r9Var2.i().b(this.f7577a.f7303b, this.f7578b, this.f7579c);
    }
}
