package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class o5 implements Callable<List<oa>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f7550a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7551b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7552c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7553d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o5(j5 j5Var, String str, String str2, String str3) {
        this.f7553d = j5Var;
        this.f7550a = str;
        this.f7551b = str2;
        this.f7552c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<oa> call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7553d.f7390a;
        r9Var.q();
        r9Var2 = this.f7553d.f7390a;
        return r9Var2.i().b(this.f7550a, this.f7551b, this.f7552c);
    }
}
